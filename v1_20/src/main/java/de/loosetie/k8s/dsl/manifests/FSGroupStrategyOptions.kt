package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface FSGroupStrategyOptions_policy_v1beta1_k8s1_20: K8sManifest {
  /** ranges are the allowed ranges of fs groups. If you would like to force a single fs group then supply a single range with
the same start and end. Required for MustRunAs. */
  val ranges: List<IDRange_policy_v1beta1_k8s1_20>?
  /** rule is the strategy that will dictate what FSGroup is used in the SecurityContext. */
  @K8sDslMarker var rule: String?
}