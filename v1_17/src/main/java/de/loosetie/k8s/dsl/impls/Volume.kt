package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "awsElasticBlockStore", "azureDisk", "azureFile", "cephfs", "cinder", "configMap", "csi", "downwardAPI", "emptyDir", "fc", "flexVolume", "flocker", "gcePersistentDisk", "gitRepo", "glusterfs", "hostPath", "iscsi", "nfs", "persistentVolumeClaim", "photonPersistentDisk", "portworxVolume", "projected", "quobyte", "rbd", "scaleIO", "secret", "storageos", "vsphereVolume")
class Volume_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Volume_core_v1, HasParent {
  override var name: String? = null
  override var awsElasticBlockStore: AWSElasticBlockStoreVolumeSource_core_v1? = null
  override var azureDisk: AzureDiskVolumeSource_core_v1? = null
  override var azureFile: AzureFileVolumeSource_core_v1? = null
  override var cephfs: CephFSVolumeSource_core_v1? = null
  override var cinder: CinderVolumeSource_core_v1? = null
  override var configMap: ConfigMapVolumeSource_core_v1? = null
  override var csi: CSIVolumeSource_core_v1? = null
  override var downwardAPI: DownwardAPIVolumeSource_core_v1? = null
  override var emptyDir: EmptyDirVolumeSource_core_v1? = null
  override var fc: FCVolumeSource_core_v1? = null
  override var flexVolume: FlexVolumeSource_core_v1? = null
  override var flocker: FlockerVolumeSource_core_v1? = null
  override var gcePersistentDisk: GCEPersistentDiskVolumeSource_core_v1? = null
  override var gitRepo: GitRepoVolumeSource_core_v1? = null
  override var glusterfs: GlusterfsVolumeSource_core_v1? = null
  override var hostPath: HostPathVolumeSource_core_v1? = null
  override var iscsi: ISCSIVolumeSource_core_v1? = null
  override var nfs: NFSVolumeSource_core_v1? = null
  override var persistentVolumeClaim: PersistentVolumeClaimVolumeSource_core_v1? = null
  override var photonPersistentDisk: PhotonPersistentDiskVolumeSource_core_v1? = null
  override var portworxVolume: PortworxVolumeSource_core_v1? = null
  override var projected: ProjectedVolumeSource_core_v1? = null
  override var quobyte: QuobyteVolumeSource_core_v1? = null
  override var rbd: RBDVolumeSource_core_v1? = null
  override var scaleIO: ScaleIOVolumeSource_core_v1? = null
  override var secret: SecretVolumeSource_core_v1? = null
  override var storageos: StorageOSVolumeSource_core_v1? = null
  override var vsphereVolume: VsphereVirtualDiskVolumeSource_core_v1? = null
}