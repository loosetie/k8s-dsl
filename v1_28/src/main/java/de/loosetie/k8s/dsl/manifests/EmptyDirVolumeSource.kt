package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface EmptyDirVolumeSource_core_v1: K8sManifest {
  /** medium represents what type of storage medium should back this directory. The default is "" which means to use the
node's default medium. Must be an empty string (default) or Memory. More info:
https://kubernetes.io/docs/concepts/storage/volumes#emptydir */
  @K8sDslMarker var medium: String?
  /** sizeLimit is the total amount of local storage required for this EmptyDir volume. The size limit is also applicable for
memory medium. The maximum usage on memory medium EmptyDir would be the minimum value between the SizeLimit specified
here and the sum of memory limits of all containers in a pod. The default is nil which means that the limit is
undefined. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir */
  val sizeLimit: Quantity_core_resource?
}