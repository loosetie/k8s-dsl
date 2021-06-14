package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface RollbackConfig_apps_v1beta1: K8sManifest {
  /** The revision to rollback to. If set to 0, rollback to the last revision. */
  @K8sDslMarker var revision: Int?
}