package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface KeyToPath_core_v1: K8sManifest {
  /** The key to project. */
  @K8sDslMarker var key: String?
  /** Optional: mode bits used to set permissions on this file. Must be an octal value between 0000 and 0777 or a decimal
value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not
specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode,
like fsGroup, and the result can be other mode bits set. */
  @K8sDslMarker var mode: Int?
  /** The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May
not start with the string '..'. */
  @K8sDslMarker var path: String?
}