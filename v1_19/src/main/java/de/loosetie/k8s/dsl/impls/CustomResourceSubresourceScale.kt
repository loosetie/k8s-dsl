package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("labelSelectorPath", "specReplicasPath", "statusReplicasPath")
class CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_19, HasParent {
  override var labelSelectorPath: String? = null
  override var specReplicasPath: String? = null
  override var statusReplicasPath: String? = null
}