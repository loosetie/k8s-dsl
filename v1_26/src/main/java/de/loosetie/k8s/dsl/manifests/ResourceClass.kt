package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ResourceClass_resource_k8s_io_v1alpha1: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "resource.k8s.io/v1alpha1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ResourceClass"
  /** Standard object metadata */
  val metadata: ObjectMeta_meta_v1
  /** DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this
class. Resource drivers have a unique name in forward domain order (acme.example.com). */
  @K8sDslMarker var driverName: String?
  /** ParametersRef references an arbitrary separate object that may hold parameters that will be used by the driver when
allocating a resource that uses this class. A dynamic resource driver can distinguish between parameters stored here and
and those stored in ResourceClaimSpec. */
  val parametersRef: ResourceClassParametersReference_resource_k8s_io_v1alpha1?
  /** Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when
that Pod uses a ResourceClaim that has not been allocated yet. Setting this field is optional. If null, all nodes are
candidates. */
  val suitableNodes: NodeSelector_core_v1?
}