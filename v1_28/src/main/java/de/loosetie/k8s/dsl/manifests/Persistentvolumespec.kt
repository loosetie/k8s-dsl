package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Persistentvolumespec_core_v1: K8sManifest {
  /** accessModes contains all ways the volume can be mounted. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes */
  @K8sDslMarker var accessModes: List<String>?
  /** awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to
the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
  val awsElasticBlockStore: AWSElasticBlockStoreVolumeSource_core_v1?
  /** azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod. */
  val azureDisk: AzureDiskVolumeSource_core_v1?
  /** azureFile represents an Azure File Service mount on the host and bind mount to the pod. */
  val azureFile: AzureFilePersistentVolumeSource_core_v1?
  /** capacity is the description of the persistent volume's resources and capacity. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity */
  @K8sDslMarker var capacity: Any?
  /** cephFS represents a Ceph FS mount on the host that shares a pod's lifetime */
  val cephfs: CephFSPersistentVolumeSource_core_v1?
  /** cinder represents a cinder volume attached and mounted on kubelets host machine. More info:
https://examples.k8s.io/mysql-cinder-pd/README.md */
  val cinder: CinderPersistentVolumeSource_core_v1?
  /** claimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil
when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding */
  val claimRef: ObjectReference_core_v1?
  /** csi represents storage that is handled by an external CSI driver (Beta feature). */
  val csi: CSIPersistentVolumeSource_core_v1?
  /** fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod. */
  val fc: FCVolumeSource_core_v1?
  /** flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin. */
  val flexVolume: FlexPersistentVolumeSource_core_v1?
  /** flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage. This
depends on the Flocker control service being running */
  val flocker: FlockerVolumeSource_core_v1?
  /** gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the
pod. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk */
  val gcePersistentDisk: GCEPersistentDiskVolumeSource_core_v1?
  /** glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More
info: https://examples.k8s.io/volumes/glusterfs/README.md */
  val glusterfs: GlusterfsPersistentVolumeSource_core_v1?
  /** hostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node
development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster.
More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath */
  val hostPath: HostPathVolumeSource_core_v1?
  /** iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
Provisioned by an admin. */
  val iscsi: ISCSIPersistentVolumeSource_core_v1?
  /** local represents directly-attached storage with node affinity */
  val local: LocalVolumeSource_core_v1?
  /** mountOptions is the list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is
invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options */
  @K8sDslMarker var mountOptions: List<String>?
  /** nfs represents an NFS mount on the host. Provisioned by an admin. More info:
https://kubernetes.io/docs/concepts/storage/volumes#nfs */
  val nfs: NFSVolumeSource_core_v1?
  /** nodeAffinity defines constraints that limit what nodes this volume can be accessed from. This field influences the
scheduling of pods that use this volume. */
  val nodeAffinity: VolumeNodeAffinity_core_v1?
  /** persistentVolumeReclaimPolicy defines what happens to a persistent volume when released from its claim. Valid options
are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned
PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this
PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming */
  @K8sDslMarker var persistentVolumeReclaimPolicy: String?
  /** photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine */
  val photonPersistentDisk: PhotonPersistentDiskVolumeSource_core_v1?
  /** portworxVolume represents a portworx volume attached and mounted on kubelets host machine */
  val portworxVolume: PortworxVolumeSource_core_v1?
  /** quobyte represents a Quobyte mount on the host that shares a pod's lifetime */
  val quobyte: QuobyteVolumeSource_core_v1?
  /** rbd represents a Rados Block Device mount on the host that shares a pod's lifetime. More info:
https://examples.k8s.io/volumes/rbd/README.md */
  val rbd: RBDPersistentVolumeSource_core_v1?
  /** scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes. */
  val scaleIO: ScaleIOPersistentVolumeSource_core_v1?
  /** storageClassName is the name of StorageClass to which this persistent volume belongs. Empty value means that this volume
does not belong to any StorageClass. */
  @K8sDslMarker var storageClassName: String?
  /** storageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More
info: https://examples.k8s.io/volumes/storageos/README.md */
  val storageos: StorageOSPersistentVolumeSource_core_v1?
  /** volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value
of Filesystem is implied when not included in spec. */
  @K8sDslMarker var volumeMode: String?
  /** vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine */
  val vsphereVolume: VsphereVirtualDiskVolumeSource_core_v1?
}