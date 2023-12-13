package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Volume_core_v1: K8sManifest {
  /** name of the volume. Must be a DNS_LABEL and unique within the pod. More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to
the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
  val awsElasticBlockStore: AWSElasticBlockStoreVolumeSource_core_v1?
  /** azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod. */
  val azureDisk: AzureDiskVolumeSource_core_v1?
  /** azureFile represents an Azure File Service mount on the host and bind mount to the pod. */
  val azureFile: AzureFileVolumeSource_core_v1?
  /** cephFS represents a Ceph FS mount on the host that shares a pod's lifetime */
  val cephfs: CephFSVolumeSource_core_v1?
  /** cinder represents a cinder volume attached and mounted on kubelets host machine. More info:
https://examples.k8s.io/mysql-cinder-pd/README.md */
  val cinder: CinderVolumeSource_core_v1?
  /** configMap represents a configMap that should populate this volume */
  val configMap: ConfigMapVolumeSource_core_v1?
  /** csi (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta
feature). */
  val csi: CSIVolumeSource_core_v1?
  /** downwardAPI represents downward API about the pod that should populate this volume */
  val downwardAPI: DownwardAPIVolumeSource_core_v1?
  /** emptyDir represents a temporary directory that shares a pod's lifetime. More info:
https://kubernetes.io/docs/concepts/storage/volumes#emptydir */
  val emptyDir: EmptyDirVolumeSource_core_v1?
  /** ephemeral represents a volume that is handled by a cluster storage driver. The volume's lifecycle is tied to the pod
that defines it - it will be created before the pod starts, and deleted when the pod is removed. Use this if: a) the
volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot or capacity
tracking are needed, c) the storage driver is specified through a storage class, and d) the storage driver supports
dynamic volume provisioning through a PersistentVolumeClaim (see EphemeralVolumeSource for more information on the
connection between this volume type and PersistentVolumeClaim). Use PersistentVolumeClaim or one of the vendor-specific
APIs for volumes that persist for longer than the lifecycle of an individual pod. Use CSI for light-weight local
ephemeral volumes if the CSI driver is meant to be used that way - see the documentation of the driver for more
information. A pod can use both types of ephemeral volumes and persistent volumes at the same time. */
  val ephemeral: EphemeralVolumeSource_core_v1?
  /** fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod. */
  val fc: FCVolumeSource_core_v1?
  /** flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin. */
  val flexVolume: FlexVolumeSource_core_v1?
  /** flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service
being running */
  val flocker: FlockerVolumeSource_core_v1?
  /** gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the
pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk */
  val gcePersistentDisk: GCEPersistentDiskVolumeSource_core_v1?
  /** gitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a
container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the
EmptyDir into the Pod's container. */
  val gitRepo: GitRepoVolumeSource_core_v1?
  /** glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info:
https://examples.k8s.io/volumes/glusterfs/README.md */
  val glusterfs: GlusterfsVolumeSource_core_v1?
  /** hostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This
is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers
will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath */
  val hostPath: HostPathVolumeSource_core_v1?
  /** iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More
info: https://examples.k8s.io/volumes/iscsi/README.md */
  val iscsi: ISCSIVolumeSource_core_v1?
  /** nfs represents an NFS mount on the host that shares a pod's lifetime More info:
https://kubernetes.io/docs/concepts/storage/volumes#nfs */
  val nfs: NFSVolumeSource_core_v1?
  /** persistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
  val persistentVolumeClaim: PersistentVolumeClaimVolumeSource_core_v1?
  /** photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine */
  val photonPersistentDisk: PhotonPersistentDiskVolumeSource_core_v1?
  /** portworxVolume represents a portworx volume attached and mounted on kubelets host machine */
  val portworxVolume: PortworxVolumeSource_core_v1?
  /** projected items for all in one resources secrets, configmaps, and downward API */
  val projected: ProjectedVolumeSource_core_v1?
  /** quobyte represents a Quobyte mount on the host that shares a pod's lifetime */
  val quobyte: QuobyteVolumeSource_core_v1?
  /** rbd represents a Rados Block Device mount on the host that shares a pod's lifetime. More info:
https://examples.k8s.io/volumes/rbd/README.md */
  val rbd: RBDVolumeSource_core_v1?
  /** scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes. */
  val scaleIO: ScaleIOVolumeSource_core_v1?
  /** secret represents a secret that should populate this volume. More info:
https://kubernetes.io/docs/concepts/storage/volumes#secret */
  val secret: SecretVolumeSource_core_v1?
  /** storageOS represents a StorageOS volume attached and mounted on Kubernetes nodes. */
  val storageos: StorageOSVolumeSource_core_v1?
  /** vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine */
  val vsphereVolume: VsphereVirtualDiskVolumeSource_core_v1?
}