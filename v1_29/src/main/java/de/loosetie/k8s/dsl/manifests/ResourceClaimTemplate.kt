package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ResourceClaimTemplate_resource_k8s_io_v1alpha2: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "resource.k8s.io/v1alpha2"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ResourceClaimTemplate"
  /** Standard object metadata */
  val metadata: ObjectMeta_meta_v1
  /** Describes the ResourceClaim that is to be generated. This field is immutable. A ResourceClaim will get created by the
control plane for a Pod when needed and then not get updated anymore. */
  val spec: Resourceclaimtemplatespec_resource_k8s_io_v1alpha2
}