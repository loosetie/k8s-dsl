package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiGroups", "nonResourceURLs", "resourceNames", "resources", "verbs")
class PolicyRule_rbac_authorization_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PolicyRule_rbac_authorization_k8s_io_v1, HasParent {
  override var apiGroups: List<String>? = null
  override var nonResourceURLs: List<String>? = null
  override var resourceNames: List<String>? = null
  override var resources: List<String>? = null
  override var verbs: List<String>? = null
}