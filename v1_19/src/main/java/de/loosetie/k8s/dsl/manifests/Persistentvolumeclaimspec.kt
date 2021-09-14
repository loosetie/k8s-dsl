package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Persistentvolumeclaimspec_core_v1_k8s1_19: K8sManifest {
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
  val dataSource: TypedLocalObjectReference_core_v1_k8s1_19?
  /** Resources represents the minimum resources the volume should have. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources */
  val resources: ResourceRequirements_core_v1_k8s1_19?
  /** A label query over volumes to consider for binding. */
  val selector: LabelSelector_meta_v1_k8s1_19?
  /** Name of the StorageClass required by the claim. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1 */
  @K8sDslMarker var storageClassName: String?
  /** volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in
claim spec. */
  @K8sDslMarker var volumeMode: String?
  /** VolumeName is the binding reference to the PersistentVolume backing this claim. */
  @K8sDslMarker var volumeName: String?
}