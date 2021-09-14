package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Csinodespec_storage_k8s_io_v1_k8s1_18: K8sManifest {
  /** drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this
can become empty. */
  val drivers: List<CSINodeDriver_storage_k8s_io_v1_k8s1_18>?
}