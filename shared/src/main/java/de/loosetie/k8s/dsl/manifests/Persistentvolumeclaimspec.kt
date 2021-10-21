package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Persistentvolumeclaimspec_core_v1_k8s1_16: K8sManifest {
  /** AccessModes contains the desired access modes the volume should have. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1 */
  @K8sDslMarker var accessModes: List<String>?
  /** This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and currently VolumeSnapshot is the
only supported data source. If the provisioner can support VolumeSnapshot data source, it will create a new volume and
data will be restored to the volume at the same time. If the provisioner does not support VolumeSnapshot data source,
volume will not be created and the failure will be reported as an event. In the future, we plan to support more data
source types and the behavior of the provisioner may change. */
  val dataSource: TypedLocalObjectReference_core_v1_k8s1_16?
  /** Resources represents the minimum resources the volume should have. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources */
  val resources: ResourceRequirements_core_v1_k8s1_16?
  /** A label query over volumes to consider for binding. */
  val selector: LabelSelector_meta_v1_k8s1_16?
  /** Name of the StorageClass required by the claim. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1 */
  @K8sDslMarker var storageClassName: String?
  /** volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in
claim spec. This is a beta feature. */
  @K8sDslMarker var volumeMode: String?
  /** VolumeName is the binding reference to the PersistentVolume backing this claim. */
  @K8sDslMarker var volumeName: String?
}      
typealias Persistentvolumeclaimspec_core_v1_k8s1_17 = Persistentvolumeclaimspec_core_v1_k8s1_16       
@K8sDslMarker
interface Persistentvolumeclaimspec_core_v1_k8s1_18: K8sManifest {
  /** AccessModes contains the desired access modes the volume should have. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1 */
  @K8sDslMarker var accessModes: List<String>?
  /** This field can be used to specify either: `*` An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot
- Beta) `*` An existing PVC (PersistentVolumeClaim) `*` An existing custom resource/object that implements data
population (Alpha) In order to use VolumeSnapshot object types, the appropriate feature gate must be enabled
(VolumeSnapshotDataSource or AnyVolumeDataSource) If the provisioner or an external controller can support the specified
data source, it will create a new volume based on the contents of the specified data source. If the specified data
source is not supported, the volume will not be created and the failure will be reported as an event. In the future, we
plan to support more data source types and the behavior of the provisioner may change. */
  val dataSource: TypedLocalObjectReference_core_v1_k8s1_18?
  /** Resources represents the minimum resources the volume should have. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources */
  val resources: ResourceRequirements_core_v1_k8s1_18?
  /** A label query over volumes to consider for binding. */
  val selector: LabelSelector_meta_v1_k8s1_18?
  /** Name of the StorageClass required by the claim. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1 */
  @K8sDslMarker var storageClassName: String?
  /** volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in
claim spec. */
  @K8sDslMarker var volumeMode: String?
  /** VolumeName is the binding reference to the PersistentVolume backing this claim. */
  @K8sDslMarker var volumeName: String?
}      
typealias Persistentvolumeclaimspec_core_v1_k8s1_19 = Persistentvolumeclaimspec_core_v1_k8s1_18       
@K8sDslMarker
interface Persistentvolumeclaimspec_core_v1_k8s1_20: K8sManifest {
  /** AccessModes contains the desired access modes the volume should have. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1 */
  @K8sDslMarker var accessModes: List<String>?
  /** This field can be used to specify either: `*` An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot)
`*` An existing PVC (PersistentVolumeClaim) `*` An existing custom resource that implements data population (Alpha) In
order to use custom resource types that implement data population, the AnyVolumeDataSource feature gate must be enabled.
If the provisioner or an external controller can support the specified data source, it will create a new volume based on
the contents of the specified data source. */
  val dataSource: TypedLocalObjectReference_core_v1_k8s1_20?
  /** Resources represents the minimum resources the volume should have. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources */
  val resources: ResourceRequirements_core_v1_k8s1_20?
  /** A label query over volumes to consider for binding. */
  val selector: LabelSelector_meta_v1_k8s1_20?
  /** Name of the StorageClass required by the claim. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1 */
  @K8sDslMarker var storageClassName: String?
  /** volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in
claim spec. */
  @K8sDslMarker var volumeMode: String?
  /** VolumeName is the binding reference to the PersistentVolume backing this claim. */
  @K8sDslMarker var volumeName: String?
}      
typealias Persistentvolumeclaimspec_core_v1_k8s1_21 = Persistentvolumeclaimspec_core_v1_k8s1_20 