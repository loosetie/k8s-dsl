package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("")
class Storageversionspec_internal_apiserver_k8s_io_v1alpha1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Storageversionspec_internal_apiserver_k8s_io_v1alpha1_k8s1_20, HasParent {
  
}