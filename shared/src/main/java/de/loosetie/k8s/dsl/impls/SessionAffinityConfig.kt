package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("clientIP")
class SessionAffinityConfig_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SessionAffinityConfig_core_v1_k8s1_16, HasParent {
  override var clientIP: ClientIPConfig_core_v1_k8s1_16? = null
}
typealias SessionAffinityConfig_core_v1_k8s1_17Impl = SessionAffinityConfig_core_v1_k8s1_16Impl
typealias SessionAffinityConfig_core_v1_k8s1_18Impl = SessionAffinityConfig_core_v1_k8s1_17Impl
typealias SessionAffinityConfig_core_v1_k8s1_19Impl = SessionAffinityConfig_core_v1_k8s1_18Impl
typealias SessionAffinityConfig_core_v1_k8s1_20Impl = SessionAffinityConfig_core_v1_k8s1_19Impl
typealias SessionAffinityConfig_core_v1_k8s1_21Impl = SessionAffinityConfig_core_v1_k8s1_20Impl