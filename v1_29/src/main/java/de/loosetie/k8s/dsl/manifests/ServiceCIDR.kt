package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ServiceCIDR_networking_k8s_io_v1alpha1: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "networking.k8s.io/v1alpha1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ServiceCIDR"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1
  /** spec is the desired state of the ServiceCIDR. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Servicecidrspec_networking_k8s_io_v1alpha1
  /** status represents the current state of the ServiceCIDR. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val status: Servicecidrstatus_networking_k8s_io_v1alpha1?
}