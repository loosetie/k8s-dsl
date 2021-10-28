package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("count", "lastObservedTime", "state")
class EventSeries_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EventSeries_core_v1_k8s1_16, HasParent {
  override var count: Int? = null
  override var lastObservedTime: MicroTime_meta_v1_k8s1_16? = null
  override var state: String? = null
}
typealias EventSeries_core_v1_k8s1_17Impl = EventSeries_core_v1_k8s1_16Impl
typealias EventSeries_core_v1_k8s1_18Impl = EventSeries_core_v1_k8s1_17Impl
@JsonPropertyOrder("count", "lastObservedTime")
class EventSeries_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EventSeries_core_v1_k8s1_19, HasParent {
  override var count: Int? = null
  override var lastObservedTime: MicroTime_meta_v1_k8s1_19? = null
}
typealias EventSeries_core_v1_k8s1_20Impl = EventSeries_core_v1_k8s1_19Impl
typealias EventSeries_core_v1_k8s1_21Impl = EventSeries_core_v1_k8s1_20Impl