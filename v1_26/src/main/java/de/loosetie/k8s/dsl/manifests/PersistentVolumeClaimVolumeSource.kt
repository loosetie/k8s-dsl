package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PersistentVolumeClaimVolumeSource_core_v1: K8sManifest {
  /** claimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
  @K8sDslMarker var claimName: String?
  /** readOnly Will force the ReadOnly setting in VolumeMounts. Default false. */
  @K8sDslMarker var readOnly: Boolean?
}