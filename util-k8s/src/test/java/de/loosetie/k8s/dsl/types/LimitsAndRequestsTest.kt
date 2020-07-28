package de.loosetie.k8s.dsl.types

import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.util.jackson.Mappers
import org.assertj.core.api.SoftAssertions
import org.junit.jupiter.api.Test

internal class LimitsAndRequestsTest {

  @Test
  internal fun `pretty print`() {
    val hugePageName = "someName"
    val result = LimitsAndRequests(object : K8sManifest {}).apply {
      cpu(3.0)
      memory(2)
      hugepages(hugePageName, 2)
      set("test", "sth")
    }
    val jsonString = Mappers.yamlPrinter
      .writeValueAsString(result)

    SoftAssertions().apply {
      assertThat(jsonString).contains("cpu: 3.0")
      assertThat(jsonString).contains("test: \"sth\"")
      assertThat(jsonString).contains("hugepages-${hugePageName}: ")
      assertThat(jsonString).doesNotContain("memory: 2.0")
      assertThat(jsonString).doesNotContain("memory: \"2\"")
      assertThat(jsonString).doesNotContain("cpu: \"3.0\"")
      assertThat(jsonString).doesNotContain("parent")
      assertThat(jsonString).doesNotContain("map")
    }.assertAll()
  }

}