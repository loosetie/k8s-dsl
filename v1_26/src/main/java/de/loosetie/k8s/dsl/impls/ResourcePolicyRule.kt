package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiGroups", "clusterScope", "namespaces", "resources", "verbs")
class ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta3Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta3, HasParent {
  override var apiGroups: List<String>? = null
  override var clusterScope: Boolean? = null
  override var namespaces: List<String>? = null
  override var resources: List<String>? = null
  override var verbs: List<String>? = null
}