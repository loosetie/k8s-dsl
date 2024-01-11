package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "action", "deprecatedCount", "deprecatedFirstTimestamp", "deprecatedLastTimestamp", "deprecatedSource", "eventTime", "note", "reason", "regarding", "related", "reportingController", "reportingInstance", "series", "type")
open class Event_events_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
  @JsonIgnore
  override val helmVariables: MutableMap<String, String> = mutableMapOf(),
      
)
: Event_events_k8s_io_v1, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1
  override var action: String? = null
  override var deprecatedCount: Int? = null
  override var deprecatedFirstTimestamp: Time_meta_v1? = null
  override var deprecatedLastTimestamp: Time_meta_v1? = null
  override var deprecatedSource: EventSource_core_v1? = null
  override var eventTime: MicroTime_meta_v1? = null
  override var note: String? = null
  override var reason: String? = null
  override var regarding: ObjectReference_core_v1? = null
  override var related: ObjectReference_core_v1? = null
  override var reportingController: String? = null
  override var reportingInstance: String? = null
  override var series: EventSeries_events_k8s_io_v1? = null
  override var type: String? = null
}