package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface AWSElasticBlockStoreVolumeSource_core_v1: K8sManifest {
  /** Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host
operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info:
https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
  @K8sDslMarker var fsType: String?
  /** The partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For
volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can
leave the property empty). */
  @K8sDslMarker var partition: Int?
  /** Specify "true" to force and set the ReadOnly property in VolumeMounts to "true". If omitted, the default is "false".
More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
  @K8sDslMarker var readOnly: Boolean?
  /** Unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info:
https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
  @K8sDslMarker var volumeID: String?
}