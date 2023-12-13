package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface AWSElasticBlockStoreVolumeSource_core_v1: K8sManifest {
  /** fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by
the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info:
https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
  @K8sDslMarker var fsType: String?
  /** partition is the partition in the volume that you want to mount. If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0"
(or you can leave the property empty). */
  @K8sDslMarker var partition: Int?
  /** readOnly value true will force the readOnly setting in VolumeMounts. More info:
https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
  @K8sDslMarker var readOnly: Boolean?
  /** volumeID is unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info:
https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
  @K8sDslMarker var volumeID: String?
}