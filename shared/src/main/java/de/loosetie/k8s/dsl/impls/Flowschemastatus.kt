package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("conditions")
class Flowschemastatus_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Flowschemastatus_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17, HasParent {
  override var conditions: List<FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17>? = null
}
typealias Flowschemastatus_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl = Flowschemastatus_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl
typealias Flowschemastatus_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl = Flowschemastatus_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl
@JsonPropertyOrder("conditions")
class Flowschemastatus_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Flowschemastatus_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20, HasParent {
  override var conditions: List<FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20>? = null
}
typealias Flowschemastatus_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21Impl = Flowschemastatus_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl