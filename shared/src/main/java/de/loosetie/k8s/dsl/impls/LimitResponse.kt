package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("queuing", "type")
class LimitResponse_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LimitResponse_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17, HasParent {
  override var queuing: QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17? = null
  override var type: String? = null
}
typealias LimitResponse_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl = LimitResponse_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl
typealias LimitResponse_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl = LimitResponse_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl
@JsonPropertyOrder("queuing", "type")
class LimitResponse_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LimitResponse_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20, HasParent {
  override var queuing: QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20? = null
  override var type: String? = null
}
typealias LimitResponse_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21Impl = LimitResponse_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl