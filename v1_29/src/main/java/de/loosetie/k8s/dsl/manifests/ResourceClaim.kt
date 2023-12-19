package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ResourceClaim_core_v1: K8sManifest {
  /** Name must match the name of one entry in pod.spec.resourceClaims of the Pod where this field is used. It makes that
resource available inside a container. */
  @K8sDslMarker var name: String?
}

@K8sDslMarker
interface ResourceClaim_resource_k8s_io_v1alpha2: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "resource.k8s.io/v1alpha2"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ResourceClaim"
  /** Standard object metadata */
  val metadata: ObjectMeta_meta_v1
  /** Spec describes the desired attributes of a resource that then needs to be allocated. It can only be set once when
creating the ResourceClaim. */
  val spec: Resourceclaimspec_resource_k8s_io_v1alpha2
  /** Status describes whether the resource is available and with which attributes. */
  val status: Resourceclaimstatus_resource_k8s_io_v1alpha2?
}