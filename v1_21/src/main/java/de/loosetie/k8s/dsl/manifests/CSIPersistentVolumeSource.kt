package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface CSIPersistentVolumeSource_core_v1_k8s1_21: K8sManifest {
  /** ControllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver
to complete the CSI ControllerExpandVolume call. This is an alpha field and requires enabling ExpandCSIVolumes feature
gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one
secret, all secrets are passed. */
  val controllerExpandSecretRef: SecretReference_core_v1_k8s1_21?
  /** ControllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI
driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may
be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed. */
  val controllerPublishSecretRef: SecretReference_core_v1_k8s1_21?
  /** Driver is the name of the driver to use for this volume. Required. */
  @K8sDslMarker var driver: String?
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". */
  @K8sDslMarker var fsType: String?
  /** NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to
complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret
is required. If the secret object contains more than one secret, all secrets are passed. */
  val nodePublishSecretRef: SecretReference_core_v1_k8s1_21?
  /** NodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to
complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be
empty if no secret is required. If the secret object contains more than one secret, all secrets are passed. */
  val nodeStageSecretRef: SecretReference_core_v1_k8s1_21?
  /** Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write). */
  @K8sDslMarker var readOnly: Boolean?
  /** Attributes of the volume to publish. */
  @K8sDslMarker var volumeAttributes: Any?
  /** VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all
subsequent calls. Required. */
  @K8sDslMarker var volumeHandle: String?
}