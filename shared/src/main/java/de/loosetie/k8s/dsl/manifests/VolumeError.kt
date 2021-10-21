package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface VolumeError_storage_k8s_io_v1_k8s1_16: K8sManifest {
  /** String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not
contain sensitive information. */
  @K8sDslMarker var message: String?
  /** Time the error was encountered. */
  val time: Time_meta_v1_k8s1_16?
}      
typealias VolumeError_storage_k8s_io_v1_k8s1_17 = VolumeError_storage_k8s_io_v1_k8s1_16       
typealias VolumeError_storage_k8s_io_v1_k8s1_18 = VolumeError_storage_k8s_io_v1_k8s1_17       
typealias VolumeError_storage_k8s_io_v1_k8s1_19 = VolumeError_storage_k8s_io_v1_k8s1_18       
typealias VolumeError_storage_k8s_io_v1_k8s1_20 = VolumeError_storage_k8s_io_v1_k8s1_19       
typealias VolumeError_storage_k8s_io_v1_k8s1_21 = VolumeError_storage_k8s_io_v1_k8s1_20 