package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface EndpointPort_core_v1_k8s1_19: K8sManifest {
  /** The name of this port. This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional
only if one port is defined. */
  @K8sDslMarker var name: String?
  /** The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are
reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names).
Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol. This is a beta field that is
guarded by the ServiceAppProtocol feature gate and enabled by default. */
  @K8sDslMarker var appProtocol: String?
  /** The port number of the endpoint. */
  @K8sDslMarker var port: Int?
  /** The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP. */
  @K8sDslMarker var protocol: String?
}

@Deprecated(message="Old api version")
@K8sDslMarker
interface EndpointPort_discovery_k8s_io_v1beta1_k8s1_19: K8sManifest {
  /** The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a
Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL
validation: `*` must be no more than 63 characters long. `*` must consist of lower case alphanumeric characters or '-'.
`*` must start and end with an alphanumeric character. Default is empty string. */
  @K8sDslMarker var name: String?
  /** The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are
reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names).
Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol. */
  @K8sDslMarker var appProtocol: String?
  /** The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the
context of the specific consumer. */
  @K8sDslMarker var port: Int?
  /** The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP. */
  @K8sDslMarker var protocol: String?
}