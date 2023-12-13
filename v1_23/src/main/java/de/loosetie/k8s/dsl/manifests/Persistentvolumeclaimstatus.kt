package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Persistentvolumeclaimstatus_core_v1: K8sManifest {
  /** AccessModes contains the actual access modes the volume backing the PVC has. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1 */
  @K8sDslMarker var accessModes: List<String>?
  /** The storage resource within AllocatedResources tracks the capacity allocated to a PVC. It may be larger than the actual
capacity when a volume expansion operation is requested. For storage quota, the larger value from allocatedResources and
PVC.spec.resources is used. If allocatedResources is not set, PVC.spec.resources alone is used for quota calculation. If
a volume expansion capacity request is lowered, allocatedResources is only lowered if there are no expansion operations
in progress and if the actual volume capacity is equal or lower than the requested capacity. This is an alpha field and
requires enabling RecoverVolumeExpansionFailure feature. */
  @K8sDslMarker var allocatedResources: Any?
  /** Represents the actual resources of the underlying volume. */
  @K8sDslMarker var capacity: Any?
  /** Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will
be set to 'ResizeStarted'. */
  val conditions: List<PersistentVolumeClaimCondition_core_v1>?
  /** Phase represents the current phase of PersistentVolumeClaim. Possible enum values: - `"Bound"` used for
PersistentVolumeClaims that are bound - `"Lost"` used for PersistentVolumeClaims that lost their underlying
PersistentVolume. The claim was bound to a PersistentVolume and this volume does not exist any longer and all data on it
was lost. - `"Pending"` used for PersistentVolumeClaims that are not yet bound */
  @K8sDslMarker var phase: String?
  /** ResizeStatus stores status of resize operation. ResizeStatus is not set by default but when expansion is complete
resizeStatus is set to empty string by resize controller or kubelet. This is an alpha field and requires enabling
RecoverVolumeExpansionFailure feature. */
  @K8sDslMarker var resizeStatus: String?
}