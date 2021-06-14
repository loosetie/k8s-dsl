package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface EndpointSlice_discovery_k8s_io_v1alpha1: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "discovery.k8s.io/v1alpha1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "EndpointSlice"
  /** Standard object's metadata. */
  val metadata: ObjectMeta_meta_v1
  /** addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same
type. Default is IP */
  @K8sDslMarker var addressType: String?
  /** endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints. */
  val endpoints: List<Endpoint_discovery_k8s_io_v1alpha1>?
  /** ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name.
When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it
indicates "all ports". Each slice may include a maximum of 100 ports. */
  val ports: List<EndpointPort_discovery_k8s_io_v1alpha1>?
}