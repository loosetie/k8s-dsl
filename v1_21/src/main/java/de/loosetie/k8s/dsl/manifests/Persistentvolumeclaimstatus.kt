package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Persistentvolumeclaimstatus_core_v1_k8s1_21: K8sManifest {
  /** AccessModes contains the actual access modes the volume backing the PVC has. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1 */
  @K8sDslMarker var accessModes: List<String>?
  /** Represents the actual resources of the underlying volume. */
  @K8sDslMarker var capacity: Any?
  /** Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will
be set to 'ResizeStarted'. */
  val conditions: List<PersistentVolumeClaimCondition_core_v1_k8s1_21>?
  /** Phase represents the current phase of PersistentVolumeClaim. */
  @K8sDslMarker var phase: String?
}