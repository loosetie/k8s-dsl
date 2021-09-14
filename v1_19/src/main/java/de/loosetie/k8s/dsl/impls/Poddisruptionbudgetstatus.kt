package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("currentHealthy", "desiredHealthy", "disruptedPods", "disruptionsAllowed", "expectedPods", "observedGeneration")
class Poddisruptionbudgetstatus_policy_v1beta1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Poddisruptionbudgetstatus_policy_v1beta1_k8s1_19, HasParent {
  override var currentHealthy: Int? = null
  override var desiredHealthy: Int? = null
  override var disruptedPods: Any? = null
  override var disruptionsAllowed: Int? = null
  override var expectedPods: Int? = null
  override var observedGeneration: Int? = null
}