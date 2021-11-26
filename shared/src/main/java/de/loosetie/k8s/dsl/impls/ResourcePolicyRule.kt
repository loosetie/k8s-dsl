package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiGroups", "clusterScope", "namespaces", "resources", "verbs")
class ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17, HasParent {
  override var apiGroups: List<String>? = null
  override var clusterScope: Boolean? = null
  override var namespaces: List<String>? = null
  override var resources: List<String>? = null
  override var verbs: List<String>? = null
}
typealias ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl = ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl
typealias ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl = ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl
@JsonPropertyOrder("apiGroups", "clusterScope", "namespaces", "resources", "verbs")
class ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20, HasParent {
  override var apiGroups: List<String>? = null
  override var clusterScope: Boolean? = null
  override var namespaces: List<String>? = null
  override var resources: List<String>? = null
  override var verbs: List<String>? = null
}
typealias ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21Impl = ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl