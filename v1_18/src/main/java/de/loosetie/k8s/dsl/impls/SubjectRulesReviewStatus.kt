package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("evaluationError", "incomplete", "nonResourceRules", "resourceRules")
class SubjectRulesReviewStatus_authorization_k8s_io_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SubjectRulesReviewStatus_authorization_k8s_io_v1_k8s1_18, HasParent {
  override var evaluationError: String? = null
  override var incomplete: Boolean? = null
  override var nonResourceRules: List<NonResourceRule_authorization_k8s_io_v1_k8s1_18>? = null
  override var resourceRules: List<ResourceRule_authorization_k8s_io_v1_k8s1_18>? = null
}