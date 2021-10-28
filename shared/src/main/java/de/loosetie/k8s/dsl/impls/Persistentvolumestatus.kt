package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("message", "phase", "reason")
class Persistentvolumestatus_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Persistentvolumestatus_core_v1_k8s1_16, HasParent {
  override var message: String? = null
  override var phase: String? = null
  override var reason: String? = null
}
typealias Persistentvolumestatus_core_v1_k8s1_17Impl = Persistentvolumestatus_core_v1_k8s1_16Impl
typealias Persistentvolumestatus_core_v1_k8s1_18Impl = Persistentvolumestatus_core_v1_k8s1_17Impl
typealias Persistentvolumestatus_core_v1_k8s1_19Impl = Persistentvolumestatus_core_v1_k8s1_18Impl
typealias Persistentvolumestatus_core_v1_k8s1_20Impl = Persistentvolumestatus_core_v1_k8s1_19Impl
typealias Persistentvolumestatus_core_v1_k8s1_21Impl = Persistentvolumestatus_core_v1_k8s1_20Impl