package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("handSize", "queueLengthLimit", "queues")
class QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17, HasParent {
  override var handSize: Int? = null
  override var queueLengthLimit: Int? = null
  override var queues: Int? = null
}
typealias QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl = QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl
typealias QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl = QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl
@JsonPropertyOrder("handSize", "queueLengthLimit", "queues")
class QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20, HasParent {
  override var handSize: Int? = null
  override var queueLengthLimit: Int? = null
  override var queues: Int? = null
}
typealias QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21Impl = QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl