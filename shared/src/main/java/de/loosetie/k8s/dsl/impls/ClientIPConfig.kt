package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("timeoutSeconds")
class ClientIPConfig_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ClientIPConfig_core_v1_k8s1_16, HasParent {
  override var timeoutSeconds: Int? = null
}
typealias ClientIPConfig_core_v1_k8s1_17Impl = ClientIPConfig_core_v1_k8s1_16Impl
typealias ClientIPConfig_core_v1_k8s1_18Impl = ClientIPConfig_core_v1_k8s1_17Impl
typealias ClientIPConfig_core_v1_k8s1_19Impl = ClientIPConfig_core_v1_k8s1_18Impl
typealias ClientIPConfig_core_v1_k8s1_20Impl = ClientIPConfig_core_v1_k8s1_19Impl
typealias ClientIPConfig_core_v1_k8s1_21Impl = ClientIPConfig_core_v1_k8s1_20Impl