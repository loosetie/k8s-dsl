package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("accessModes", "awsElasticBlockStore", "azureDisk", "azureFile", "capacity", "cephfs", "cinder", "claimRef", "csi", "fc", "flexVolume", "flocker", "gcePersistentDisk", "glusterfs", "hostPath", "iscsi", "local", "mountOptions", "nfs", "nodeAffinity", "persistentVolumeReclaimPolicy", "photonPersistentDisk", "portworxVolume", "quobyte", "rbd", "scaleIO", "storageClassName", "storageos", "volumeAttributesClassName", "volumeMode", "vsphereVolume")
class Persistentvolumespec_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Persistentvolumespec_core_v1, HasParent {
  override var accessModes: List<String>? = null
  override var awsElasticBlockStore: AWSElasticBlockStoreVolumeSource_core_v1? = null
  override var azureDisk: AzureDiskVolumeSource_core_v1? = null
  override var azureFile: AzureFilePersistentVolumeSource_core_v1? = null
  override var capacity: Any? = null
  override var cephfs: CephFSPersistentVolumeSource_core_v1? = null
  override var cinder: CinderPersistentVolumeSource_core_v1? = null
  override var claimRef: ObjectReference_core_v1? = null
  override var csi: CSIPersistentVolumeSource_core_v1? = null
  override var fc: FCVolumeSource_core_v1? = null
  override var flexVolume: FlexPersistentVolumeSource_core_v1? = null
  override var flocker: FlockerVolumeSource_core_v1? = null
  override var gcePersistentDisk: GCEPersistentDiskVolumeSource_core_v1? = null
  override var glusterfs: GlusterfsPersistentVolumeSource_core_v1? = null
  override var hostPath: HostPathVolumeSource_core_v1? = null
  override var iscsi: ISCSIPersistentVolumeSource_core_v1? = null
  override var local: LocalVolumeSource_core_v1? = null
  override var mountOptions: List<String>? = null
  override var nfs: NFSVolumeSource_core_v1? = null
  override var nodeAffinity: VolumeNodeAffinity_core_v1? = null
  override var persistentVolumeReclaimPolicy: String? = null
  override var photonPersistentDisk: PhotonPersistentDiskVolumeSource_core_v1? = null
  override var portworxVolume: PortworxVolumeSource_core_v1? = null
  override var quobyte: QuobyteVolumeSource_core_v1? = null
  override var rbd: RBDPersistentVolumeSource_core_v1? = null
  override var scaleIO: ScaleIOPersistentVolumeSource_core_v1? = null
  override var storageClassName: String? = null
  override var storageos: StorageOSPersistentVolumeSource_core_v1? = null
  override var volumeAttributesClassName: String? = null
  override var volumeMode: String? = null
  override var vsphereVolume: VsphereVirtualDiskVolumeSource_core_v1? = null
}