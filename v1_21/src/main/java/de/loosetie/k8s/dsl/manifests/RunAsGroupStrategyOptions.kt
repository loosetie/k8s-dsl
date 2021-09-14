package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface RunAsGroupStrategyOptions_policy_v1beta1_k8s1_21: K8sManifest {
  /** ranges are the allowed ranges of gids that may be used. If you would like to force a single gid then supply a single
range with the same start and end. Required for MustRunAs. */
  val ranges: List<IDRange_policy_v1beta1_k8s1_21>?
  /** rule is the strategy that will dictate the allowable RunAsGroup values that may be set. */
  @K8sDslMarker var rule: String?
}