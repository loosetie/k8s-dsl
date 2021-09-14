package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface GitRepoVolumeSource_core_v1_k8s1_20: K8sManifest {
  /** Target directory name. Must not contain or start with '..'. If '.' is supplied, the volume directory will be the git
repository. Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name. */
  @K8sDslMarker var directory: String?
  /** Repository URL */
  @K8sDslMarker var repository: String?
  /** Commit hash for the specified revision. */
  @K8sDslMarker var revision: String?
}