package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface SecretVolumeSource_core_v1_k8s1_19: K8sManifest {
  /** Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or
a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode
bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with
other options that affect the file mode, like fsGroup, and the result can be other mode bits set. */
  @K8sDslMarker var defaultMode: Int?
  /** If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a
file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified
paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup
will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'. */
  val items: List<KeyToPath_core_v1_k8s1_19>?
  /** Specify whether the Secret or its keys must be defined */
  @K8sDslMarker var optional: Boolean?
  /** Name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret */
  @K8sDslMarker var secretName: String?
}