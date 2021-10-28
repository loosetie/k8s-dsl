package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "action", "count", "eventTime", "firstTimestamp", "involvedObject", "lastTimestamp", "message", "reason", "related", "reportingComponent", "reportingInstance", "series", "source", "type")
class Event_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Event_core_v1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override var action: String? = null
  override var count: Int? = null
  override var eventTime: MicroTime_meta_v1_k8s1_16? = null
  override var firstTimestamp: Time_meta_v1_k8s1_16? = null
  override var involvedObject: ObjectReference_core_v1_k8s1_16? = null
  override var lastTimestamp: Time_meta_v1_k8s1_16? = null
  override var message: String? = null
  override var reason: String? = null
  override var related: ObjectReference_core_v1_k8s1_16? = null
  override var reportingComponent: String? = null
  override var reportingInstance: String? = null
  override var series: EventSeries_core_v1_k8s1_16? = null
  override var source: EventSource_core_v1_k8s1_16? = null
  override var type: String? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "action", "count", "eventTime", "firstTimestamp", "involvedObject", "lastTimestamp", "message", "reason", "related", "reportingComponent", "reportingInstance", "series", "source", "type")
class Event_core_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Event_core_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override var action: String? = null
  override var count: Int? = null
  override var eventTime: MicroTime_meta_v1_k8s1_17? = null
  override var firstTimestamp: Time_meta_v1_k8s1_17? = null
  override var involvedObject: ObjectReference_core_v1_k8s1_17? = null
  override var lastTimestamp: Time_meta_v1_k8s1_17? = null
  override var message: String? = null
  override var reason: String? = null
  override var related: ObjectReference_core_v1_k8s1_17? = null
  override var reportingComponent: String? = null
  override var reportingInstance: String? = null
  override var series: EventSeries_core_v1_k8s1_17? = null
  override var source: EventSource_core_v1_k8s1_17? = null
  override var type: String? = null
}
typealias Event_core_v1_k8s1_18Impl = Event_core_v1_k8s1_17Impl
@JsonPropertyOrder("apiVersion", "kind", "metadata", "action", "count", "eventTime", "firstTimestamp", "involvedObject", "lastTimestamp", "message", "reason", "related", "reportingComponent", "reportingInstance", "series", "source", "type")
class Event_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Event_core_v1_k8s1_19, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_19
  override var action: String? = null
  override var count: Int? = null
  override var eventTime: MicroTime_meta_v1_k8s1_19? = null
  override var firstTimestamp: Time_meta_v1_k8s1_19? = null
  override var involvedObject: ObjectReference_core_v1_k8s1_19? = null
  override var lastTimestamp: Time_meta_v1_k8s1_19? = null
  override var message: String? = null
  override var reason: String? = null
  override var related: ObjectReference_core_v1_k8s1_19? = null
  override var reportingComponent: String? = null
  override var reportingInstance: String? = null
  override var series: EventSeries_core_v1_k8s1_19? = null
  override var source: EventSource_core_v1_k8s1_19? = null
  override var type: String? = null
}
typealias Event_core_v1_k8s1_20Impl = Event_core_v1_k8s1_19Impl
typealias Event_core_v1_k8s1_21Impl = Event_core_v1_k8s1_20Impl