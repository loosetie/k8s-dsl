package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ProjectedVolumeSource_core_v1_k8s1_19: K8sManifest {
  /** Mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal
value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits.
Directories within the path are not affected by this setting. This might be in conflict with other options that affect
the file mode, like fsGroup, and the result can be other mode bits set. */
  @K8sDslMarker var defaultMode: Int?
  /** list of volume projections */
  val sources: List<VolumeProjection_core_v1_k8s1_19>?
}