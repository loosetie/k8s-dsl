package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("conditions")
class Flowschemastatus_flowcontrol_apiserver_k8s_io_v1beta1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Flowschemastatus_flowcontrol_apiserver_k8s_io_v1beta1, HasParent {
  override var conditions: List<FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1beta1>? = null
}