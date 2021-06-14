package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface VolumeError_storage_k8s_io_v1: K8sManifest {
  /** String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not
contain sensitive information. */
  @K8sDslMarker var message: String?
  /** Time the error was encountered. */
  val time: Time_meta_v1?
}