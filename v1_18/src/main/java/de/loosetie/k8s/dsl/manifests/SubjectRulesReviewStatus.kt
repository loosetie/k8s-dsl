package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface SubjectRulesReviewStatus_authorization_k8s_io_v1_k8s1_18: K8sManifest {
  /** EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an
authorizer that doesn't support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete. */
  @K8sDslMarker var evaluationError: String?
  /** Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an
authorizer, such as an external authorizer, doesn't support rules evaluation. */
  @K8sDslMarker var incomplete: Boolean?
  /** NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn't
significant, may contain duplicates, and possibly be incomplete. */
  val nonResourceRules: List<NonResourceRule_authorization_k8s_io_v1_k8s1_18>?
  /** ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn't
significant, may contain duplicates, and possibly be incomplete. */
  val resourceRules: List<ResourceRule_authorization_k8s_io_v1_k8s1_18>?
}