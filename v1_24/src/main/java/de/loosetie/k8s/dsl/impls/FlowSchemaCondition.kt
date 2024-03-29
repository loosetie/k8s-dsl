package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("lastTransitionTime", "message", "reason", "status", "type")
open class FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1beta2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1beta2, HasParent {
  override var lastTransitionTime: Time_meta_v1? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}