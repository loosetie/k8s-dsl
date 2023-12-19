package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface VolumeAttributesClass_storage_k8s_io_v1alpha1: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "storage.k8s.io/v1alpha1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VolumeAttributesClass"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1
  /** Name of the CSI driver This field is immutable. */
  @K8sDslMarker var driverName: String?
  /** parameters hold volume attributes defined by the CSI driver. These values are opaque to the Kubernetes and are passed
directly to the CSI driver. The underlying storage provider supports changing these attributes on an existing volume,
however the parameters field itself is immutable. To invoke a volume update, a new VolumeAttributesClass should be
created with new parameters, and the PersistentVolumeClaim should be updated to reference the new VolumeAttributesClass.
This field is required and must contain at least one key/value pair. The keys cannot be empty, and the maximum number of
parameters is 512, with a cumulative max size of 256K. If the CSI driver rejects invalid parameters, the target
PersistentVolumeClaim will be set to an "Infeasible" state in the modifyVolumeStatus field. */
  @K8sDslMarker var parameters: Any?
}