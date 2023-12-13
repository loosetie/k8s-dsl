package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PodFailurePolicy_batch_v1: K8sManifest {
  /** A list of pod failure policy rules. The rules are evaluated in order. Once a rule matches a Pod failure, the remaining
of the rules are ignored. When no rule matches the Pod failure, the default handling applies - the counter of pod
failures is incremented and it is checked against the backoffLimit. At most 20 elements are allowed. */
  val rules: List<PodFailurePolicyRule_batch_v1>?
}