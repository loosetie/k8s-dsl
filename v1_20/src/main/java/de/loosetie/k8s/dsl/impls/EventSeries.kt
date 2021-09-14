package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("count", "lastObservedTime")
class EventSeries_core_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EventSeries_core_v1_k8s1_20, HasParent {
  override var count: Int? = null
  override var lastObservedTime: MicroTime_meta_v1_k8s1_20? = null
}