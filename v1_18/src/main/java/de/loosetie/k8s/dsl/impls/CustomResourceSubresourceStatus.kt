package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.CustomResourceSubresourceStatus_apiextensions_k8s_io_v1_k8s1_18

@JsonPropertyOrder("")
class CustomResourceSubresourceStatus_apiextensions_k8s_io_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceSubresourceStatus_apiextensions_k8s_io_v1_k8s1_18, HasParent {
  
}