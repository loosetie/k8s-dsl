package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("lastTransitionTime", "message", "reason", "status", "type")
class FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17, HasParent {
  override var lastTransitionTime: Time_meta_v1_k8s1_17? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}
typealias FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl = FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl
typealias FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl = FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl


@JsonPropertyOrder("lastTransitionTime", "message", "reason", "status", "type")
class FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20, HasParent {
  override var lastTransitionTime: Time_meta_v1_k8s1_20? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}


typealias FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21Impl = FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl