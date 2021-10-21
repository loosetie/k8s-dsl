package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ProjectedVolumeSource_core_v1_k8s1_16: K8sManifest {
  /** Mode bits to use on created files by default. Must be a value between 0 and 0777. Directories within the path are not
affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the
result can be other mode bits set. */
  @K8sDslMarker var defaultMode: Int?
  /** list of volume projections */
  val sources: List<VolumeProjection_core_v1_k8s1_16>?
}      
typealias ProjectedVolumeSource_core_v1_k8s1_17 = ProjectedVolumeSource_core_v1_k8s1_16       
typealias ProjectedVolumeSource_core_v1_k8s1_18 = ProjectedVolumeSource_core_v1_k8s1_17       
@K8sDslMarker
interface ProjectedVolumeSource_core_v1_k8s1_19: ProjectedVolumeSource_core_v1_k8s1_18 {
  /** Mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal
value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits.
Directories within the path are not affected by this setting. This might be in conflict with other options that affect
the file mode, like fsGroup, and the result can be other mode bits set. */
  override var defaultMode: Int?
}      
typealias ProjectedVolumeSource_core_v1_k8s1_20 = ProjectedVolumeSource_core_v1_k8s1_19       
typealias ProjectedVolumeSource_core_v1_k8s1_21 = ProjectedVolumeSource_core_v1_k8s1_20 