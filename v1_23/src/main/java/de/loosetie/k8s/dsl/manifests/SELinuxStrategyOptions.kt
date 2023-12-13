package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface SELinuxStrategyOptions_policy_v1beta1: K8sManifest {
  /** rule is the strategy that will dictate the allowable labels that may be set. */
  @K8sDslMarker var rule: String?
  /** seLinuxOptions required to run as; required for MustRunAs More info:
https://kubernetes.io/docs/tasks/configure-pod-container/security-context/ */
  val seLinuxOptions: SELinuxOptions_core_v1?
}