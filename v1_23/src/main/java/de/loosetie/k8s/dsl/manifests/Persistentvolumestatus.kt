package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Persistentvolumestatus_core_v1: K8sManifest {
  /** A human-readable message indicating details about why the volume is in this state. */
  @K8sDslMarker var message: String?
  /** Phase indicates if a volume is available, bound to a claim, or released by a claim. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase Possible enum values: - `"Available"` used for
PersistentVolumes that are not yet bound Available volumes are held by the binder and matched to PersistentVolumeClaims
- `"Bound"` used for PersistentVolumes that are bound - `"Failed"` used for PersistentVolumes that failed to be
correctly recycled or deleted after being released from a claim - `"Pending"` used for PersistentVolumes that are not
available - `"Released"` used for PersistentVolumes where the bound PersistentVolumeClaim was deleted released volumes
must be recycled before becoming available again this phase is used by the persistent volume claim binder to signal to
another process to reclaim the resource */
  @K8sDslMarker var phase: String?
  /** Reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the
CLI. */
  @K8sDslMarker var reason: String?
}