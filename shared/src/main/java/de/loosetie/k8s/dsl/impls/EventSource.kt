package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("component", "host")
class EventSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EventSource_core_v1_k8s1_16, HasParent {
  override var component: String? = null
  override var host: String? = null
}
typealias EventSource_core_v1_k8s1_17Impl = EventSource_core_v1_k8s1_16Impl
typealias EventSource_core_v1_k8s1_18Impl = EventSource_core_v1_k8s1_17Impl
typealias EventSource_core_v1_k8s1_19Impl = EventSource_core_v1_k8s1_18Impl
typealias EventSource_core_v1_k8s1_20Impl = EventSource_core_v1_k8s1_19Impl
typealias EventSource_core_v1_k8s1_21Impl = EventSource_core_v1_k8s1_20Impl