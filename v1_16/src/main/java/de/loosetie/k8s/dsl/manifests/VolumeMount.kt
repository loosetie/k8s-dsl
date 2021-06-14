package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface VolumeMount_core_v1: K8sManifest {
  /** This must match the Name of a Volume. */
  @K8sDslMarker var name: String?
  /** Path within the container at which the volume should be mounted. Must not contain ':'. */
  @K8sDslMarker var mountPath: String?
  /** mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set,
MountPropagationNone is used. This field is beta in 1.10. */
  @K8sDslMarker var mountPropagation: String?
  /** Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false. */
  @K8sDslMarker var readOnly: Boolean?
  /** Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root). */
  @K8sDslMarker var subPath: String?
  /** Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but
environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's
root). SubPathExpr and SubPath are mutually exclusive. This field is beta in 1.15. */
  @K8sDslMarker var subPathExpr: String?
}