package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ISCSIPersistentVolumeSource_core_v1: K8sManifest {
  /** chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication */
  @K8sDslMarker var chapAuthDiscovery: Boolean?
  /** chapAuthSession defines whether support iSCSI Session CHAP authentication */
  @K8sDslMarker var chapAuthSession: Boolean?
  /** fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by
the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info:
https://kubernetes.io/docs/concepts/storage/volumes#iscsi */
  @K8sDslMarker var fsType: String?
  /** initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new
iSCSI interface <target portal>:<volume name> will be created for the connection. */
  @K8sDslMarker var initiatorName: String?
  /** iqn is Target iSCSI Qualified Name. */
  @K8sDslMarker var iqn: String?
  /** iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to 'default' (tcp). */
  @K8sDslMarker var iscsiInterface: String?
  /** lun is iSCSI Target Lun number. */
  @K8sDslMarker var lun: Int?
  /** portals is the iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other than default
(typically TCP ports 860 and 3260). */
  @K8sDslMarker var portals: List<String>?
  /** readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. */
  @K8sDslMarker var readOnly: Boolean?
  /** secretRef is the CHAP Secret for iSCSI target and initiator authentication */
  val secretRef: SecretReference_core_v1?
  /** targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default
(typically TCP ports 860 and 3260). */
  @K8sDslMarker var targetPortal: String?
}