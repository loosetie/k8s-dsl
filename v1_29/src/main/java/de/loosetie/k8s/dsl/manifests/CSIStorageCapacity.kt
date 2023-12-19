package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface CSIStorageCapacity_storage_k8s_io_v1: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "storage.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "CSIStorageCapacity"
  /** Standard object's metadata. The name has no particular meaning. It must be a DNS subdomain (dots allowed, 253
characters). To ensure that there are no conflicts with other CSI drivers on the cluster, the recommendation is to use
csisc-<uuid>, a generated name, or a reverse-domain name which ends with the unique CSI driver name. Objects are
namespaced. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1
  /** capacity is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and
parameters that match the previous fields. The semantic is currently (CSI spec 1.2) defined as: The available capacity,
in bytes, of the storage that can be used to provision volumes. If not set, that information is currently unavailable. */
  val capacity: Quantity_core_resource?
  /** maximumVolumeSize is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with
topology and parameters that match the previous fields. This is defined since CSI spec 1.4.0 as the largest size that
may be used in a CreateVolumeRequest.capacity_range.required_bytes field to create a volume with the same parameters as
those in GetCapacityRequest. The corresponding value in the Kubernetes API is ResourceRequirements.Requests in a volume
claim. */
  val maximumVolumeSize: Quantity_core_resource?
  /** nodeTopology defines which nodes have access to the storage for which capacity was reported. If not set, the storage is
not accessible from any node in the cluster. If empty, the storage is accessible from all nodes. This field is
immutable. */
  val nodeTopology: LabelSelector_meta_v1?
  /** storageClassName represents the name of the StorageClass that the reported capacity applies to. It must meet the same
requirements as the name of a StorageClass object (non-empty, DNS subdomain). If that object no longer exists, the
CSIStorageCapacity object is obsolete and should be removed by its creator. This field is immutable. */
  @K8sDslMarker var storageClassName: String?
}