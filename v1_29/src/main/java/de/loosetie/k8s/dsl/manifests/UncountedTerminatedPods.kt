package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface UncountedTerminatedPods_batch_v1: K8sManifest {
  /** failed holds UIDs of failed Pods. */
  @K8sDslMarker var failed: List<String>?
  /** succeeded holds UIDs of succeeded Pods. */
  @K8sDslMarker var succeeded: List<String>?
}