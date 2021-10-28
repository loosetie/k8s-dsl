package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class FlowSchema_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FlowSchema_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override lateinit var spec: Flowschemaspec_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17
  override var status: Flowschemastatus_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17? = null
}
typealias FlowSchema_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl = FlowSchema_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl
@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class FlowSchema_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FlowSchema_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_19
  override lateinit var spec: Flowschemaspec_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19
  override var status: Flowschemastatus_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19? = null
}


@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class FlowSchema_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FlowSchema_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_20
  override lateinit var spec: Flowschemaspec_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20
  override var status: Flowschemastatus_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20? = null
}


typealias FlowSchema_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21Impl = FlowSchema_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl