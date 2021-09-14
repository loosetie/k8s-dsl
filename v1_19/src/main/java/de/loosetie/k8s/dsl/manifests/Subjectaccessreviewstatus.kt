package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Subjectaccessreviewstatus_authorization_k8s_io_v1_k8s1_19: K8sManifest {
  /** Allowed is required. True if the action would be allowed, false otherwise. */
  @K8sDslMarker var allowed: Boolean?
  /** Denied is optional. True if the action would be denied, otherwise false. If both allowed is false and denied is false,
then the authorizer has no opinion on whether to authorize the action. Denied may not be true if Allowed is true. */
  @K8sDslMarker var denied: Boolean?
  /** EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get
an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a
role, but enough roles are still present and bound to reason about the request. */
  @K8sDslMarker var evaluationError: String?
  /** Reason is optional. It indicates why a request was allowed or denied. */
  @K8sDslMarker var reason: String?
}