package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("extra", "groups", "nonResourceAttributes", "resourceAttributes", "uid", "user")
open class Subjectaccessreviewspec_authorization_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Subjectaccessreviewspec_authorization_k8s_io_v1, HasParent {
  override var extra: Any? = null
  override var groups: List<String>? = null
  override var nonResourceAttributes: NonResourceAttributes_authorization_k8s_io_v1? = null
  override var resourceAttributes: ResourceAttributes_authorization_k8s_io_v1? = null
  override var uid: String? = null
  override var user: String? = null
}