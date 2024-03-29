package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("nonResourceAttributes", "resourceAttributes")
open class Selfsubjectaccessreviewspec_authorization_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Selfsubjectaccessreviewspec_authorization_k8s_io_v1, HasParent {
  override var nonResourceAttributes: NonResourceAttributes_authorization_k8s_io_v1? = null
  override var resourceAttributes: ResourceAttributes_authorization_k8s_io_v1? = null
}