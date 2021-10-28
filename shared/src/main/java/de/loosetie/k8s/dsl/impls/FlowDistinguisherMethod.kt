package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("type")
class FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17, HasParent {
  override var type: String? = null
}
typealias FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl = FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl
typealias FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl = FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl


@JsonPropertyOrder("type")
class FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20, HasParent {
  override var type: String? = null
}


typealias FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21Impl = FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl