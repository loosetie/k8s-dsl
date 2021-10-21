package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface EndpointPort_core_v1_k8s1_16: K8sManifest {
  /** The name of this port. This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional
only if one port is defined. */
  @K8sDslMarker var name: String?
  /** The port number of the endpoint. */
  @K8sDslMarker var port: Int?
  /** The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP. */
  @K8sDslMarker var protocol: String?
}

@Deprecated(message="Old api version")
@K8sDslMarker
interface EndpointPort_discovery_k8s_io_v1alpha1_k8s1_16: K8sManifest {
  /** The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a
Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass
IANA_SVC_NAME validation: `*` must be no more than 15 characters long `*` may contain only [-a-z0-9] `*` must contain at
least one letter [a-z] `*` it must not start or end with a hyphen, nor contain adjacent hyphens Default is empty string. */
  @K8sDslMarker var name: String?
  /** The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the
context of the specific consumer. */
  @K8sDslMarker var port: Int?
  /** The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP. */
  @K8sDslMarker var protocol: String?
}      
typealias EndpointPort_core_v1_k8s1_17 = EndpointPort_core_v1_k8s1_16 



@Deprecated(message="Old api version")
@K8sDslMarker
interface EndpointPort_discovery_k8s_io_v1beta1_k8s1_17: K8sManifest {
  /** The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a
Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL
validation: `*` must be no more than 63 characters long. `*` must consist of lower case alphanumeric characters or '-'.
`*` must start and end with an alphanumeric character. Default is empty string. */
  @K8sDslMarker var name: String?
  /** The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are
reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names).
Non-standard protocols should use prefixed names. Default is empty string. */
  @K8sDslMarker var appProtocol: String?
  /** The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the
context of the specific consumer. */
  @K8sDslMarker var port: Int?
  /** The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP. */
  @K8sDslMarker var protocol: String?
}      
@K8sDslMarker
interface EndpointPort_core_v1_k8s1_18: EndpointPort_core_v1_k8s1_17 {
  /** The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are
reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names).
Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol. Field can be enabled with
ServiceAppProtocol feature gate. */
  @K8sDslMarker var appProtocol: String?
}



@K8sDslMarker
interface EndpointPort_discovery_k8s_io_v1beta1_k8s1_18: EndpointPort_discovery_k8s_io_v1beta1_k8s1_17 {
  /** The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are
reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names).
Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol. */
  override var appProtocol: String?
}      
@K8sDslMarker
interface EndpointPort_core_v1_k8s1_19: EndpointPort_core_v1_k8s1_18 {
  /** The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are
reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names).
Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol. This is a beta field that is
guarded by the ServiceAppProtocol feature gate and enabled by default. */
  override var appProtocol: String?
}



typealias EndpointPort_discovery_k8s_io_v1beta1_k8s1_19 = EndpointPort_discovery_k8s_io_v1beta1_k8s1_18       
typealias EndpointPort_core_v1_k8s1_20 = EndpointPort_core_v1_k8s1_19 



typealias EndpointPort_discovery_k8s_io_v1beta1_k8s1_20 = EndpointPort_discovery_k8s_io_v1beta1_k8s1_19       
typealias EndpointPort_core_v1_k8s1_21 = EndpointPort_core_v1_k8s1_20 

@Deprecated(message="Old api version")
@K8sDslMarker
interface EndpointPort_discovery_k8s_io_v1_k8s1_21: K8sManifest {
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



