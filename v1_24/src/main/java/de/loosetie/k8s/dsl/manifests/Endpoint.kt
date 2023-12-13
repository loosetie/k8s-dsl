package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Endpoint_discovery_k8s_io_v1: K8sManifest {
  /** addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice
addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This
must contain at least one address but no more than 100. These are all assumed to be fungible and clients may choose to
only use the first element. Refer to: https://issue.k8s.io/106267 */
  @K8sDslMarker var addresses: List<String>?
  /** conditions contains information about the current status of the endpoint. */
  val conditions: EndpointConditions_discovery_k8s_io_v1?
  /** deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed
when the v1beta1 API is removed (no sooner than kubernetes v1.24). While this field can hold values, it is not writable
through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the
zone and nodeName fields instead. */
  @K8sDslMarker var deprecatedTopology: Any?
  /** hints contains information associated with how an endpoint should be consumed. */
  val hints: EndpointHints_discovery_k8s_io_v1?
  /** hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other
(e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A
values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation. */
  @K8sDslMarker var hostname: String?
  /** nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node.
This field can be enabled with the EndpointSliceNodeName feature gate. */
  @K8sDslMarker var nodeName: String?
  /** targetRef is a reference to a Kubernetes object that represents this endpoint. */
  val targetRef: ObjectReference_core_v1?
  /** zone is the name of the Zone this endpoint exists in. */
  @K8sDslMarker var zone: String?
}