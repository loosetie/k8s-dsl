package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("nonResourceURLs", "verbs")
class NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1, HasParent {
  override var nonResourceURLs: List<String>? = null
  override var verbs: List<String>? = null
}