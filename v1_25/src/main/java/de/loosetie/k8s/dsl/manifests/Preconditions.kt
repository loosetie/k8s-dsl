package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Preconditions_meta_v1: K8sManifest {
  /** Specifies the target ResourceVersion */
  @K8sDslMarker var resourceVersion: String?
  /** Specifies the target UID. */
  @K8sDslMarker var uid: String?
}