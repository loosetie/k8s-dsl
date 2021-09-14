package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("allowed", "denied", "evaluationError", "reason")
class Subjectaccessreviewstatus_authorization_k8s_io_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Subjectaccessreviewstatus_authorization_k8s_io_v1_k8s1_20, HasParent {
  override var allowed: Boolean? = null
  override var denied: Boolean? = null
  override var evaluationError: String? = null
  override var reason: String? = null
}