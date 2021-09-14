package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface DownwardAPIVolumeFile_core_v1_k8s1_19: K8sManifest {
  /** Required: Selects a field of the pod: only annotations, labels, name and namespace are supported. */
  val fieldRef: ObjectFieldSelector_core_v1_k8s1_19?
  /** Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal
value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not
specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode,
like fsGroup, and the result can be other mode bits set. */
  @K8sDslMarker var mode: Int?
  /** Required: Path is the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must
be utf-8 encoded. The first item of the relative path must not start with '..' */
  @K8sDslMarker var path: String?
  /** Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and
requests.memory) are currently supported. */
  val resourceFieldRef: ResourceFieldSelector_core_v1_k8s1_19?
}