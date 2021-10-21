package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Endpoint_discovery_k8s_io_v1alpha1_k8s1_16: K8sManifest {
  /** addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice
addressType field. This allows for cases like dual-stack (IPv4 and IPv6) networking. Consumers (e.g. kube-proxy) must
handle different types of addresses in the context of their own capabilities. This must contain at least one address but
no more than 100. */
  @K8sDslMarker var addresses: List<String>?
  /** conditions contains information about the current status of the endpoint. */
  val conditions: EndpointConditions_discovery_k8s_io_v1alpha1_k8s1_16?
  /** hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other
(e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A
values in DNS). Must pass DNS Label (RFC 1123) validation. */
  @K8sDslMarker var hostname: String?
  /** targetRef is a reference to a Kubernetes object that represents this endpoint. */
  val targetRef: ObjectReference_core_v1_k8s1_16?
  /** topology contains arbitrary topology information associated with the endpoint. These key/value pairs must conform with
the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a
maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: `*`
kubernetes.io/hostname: the value indicates the hostname of the node where the endpoint is located. This should match
the corresponding node label. `*` topology.kubernetes.io/zone: the value indicates the zone where the endpoint is
located. This should match the corresponding node label. `*` topology.kubernetes.io/region: the value indicates the
region where the endpoint is located. This should match the corresponding node label. */
  @K8sDslMarker var topology: Any?
}      


@K8sDslMarker
interface Endpoint_discovery_k8s_io_v1beta1_k8s1_17: K8sManifest {
  /** addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice
addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This
must contain at least one address but no more than 100. */
  @K8sDslMarker var addresses: List<String>?
  /** conditions contains information about the current status of the endpoint. */
  val conditions: EndpointConditions_discovery_k8s_io_v1beta1_k8s1_17?
  /** hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other
(e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A
values in DNS). Must pass DNS Label (RFC 1123) validation. */
  @K8sDslMarker var hostname: String?
  /** targetRef is a reference to a Kubernetes object that represents this endpoint. */
  val targetRef: ObjectReference_core_v1_k8s1_17?
  /** topology contains arbitrary topology information associated with the endpoint. These key/value pairs must conform with
the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a
maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: `*`
kubernetes.io/hostname: the value indicates the hostname of the node where the endpoint is located. This should match
the corresponding node label. `*` topology.kubernetes.io/zone: the value indicates the zone where the endpoint is
located. This should match the corresponding node label. `*` topology.kubernetes.io/region: the value indicates the
region where the endpoint is located. This should match the corresponding node label. */
  @K8sDslMarker var topology: Any?
}      


typealias Endpoint_discovery_k8s_io_v1beta1_k8s1_18 = Endpoint_discovery_k8s_io_v1beta1_k8s1_17       


typealias Endpoint_discovery_k8s_io_v1beta1_k8s1_19 = Endpoint_discovery_k8s_io_v1beta1_k8s1_18       


@K8sDslMarker
interface Endpoint_discovery_k8s_io_v1beta1_k8s1_20: Endpoint_discovery_k8s_io_v1beta1_k8s1_19 {
  /** hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other
(e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A
values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation. */
  override var hostname: String?
  /** nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node.
This field can be enabled with the EndpointSliceNodeName feature gate. */
  @K8sDslMarker var nodeName: String?
  /** topology contains arbitrary topology information associated with the endpoint. These key/value pairs must conform with
the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a
maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: `*`
kubernetes.io/hostname: the value indicates the hostname of the node where the endpoint is located. This should match
the corresponding node label. `*` topology.kubernetes.io/zone: the value indicates the zone where the endpoint is
located. This should match the corresponding node label. `*` topology.kubernetes.io/region: the value indicates the
region where the endpoint is located. This should match the corresponding node label. This field is deprecated and will
be removed in future api versions. */
  override var topology: Any?
}      
@K8sDslMarker
interface Endpoint_discovery_k8s_io_v1_k8s1_21: K8sManifest {
  /** addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice
addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This
must contain at least one address but no more than 100. */
  @K8sDslMarker var addresses: List<String>?
  /** conditions contains information about the current status of the endpoint. */
  val conditions: EndpointConditions_discovery_k8s_io_v1_k8s1_21?
  /** deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed
when the v1beta1 API is removed (no sooner than kubernetes v1.24). While this field can hold values, it is not writable
through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the
zone and nodeName fields instead. */
  @K8sDslMarker var deprecatedTopology: Any?
  /** hints contains information associated with how an endpoint should be consumed. */
  val hints: EndpointHints_discovery_k8s_io_v1_k8s1_21?
  /** hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other
(e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A
values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation. */
  @K8sDslMarker var hostname: String?
  /** nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node.
This field can be enabled with the EndpointSliceNodeName feature gate. */
  @K8sDslMarker var nodeName: String?
  /** targetRef is a reference to a Kubernetes object that represents this endpoint. */
  val targetRef: ObjectReference_core_v1_k8s1_21?
  /** zone is the name of the Zone this endpoint exists in. */
  @K8sDslMarker var zone: String?
}



