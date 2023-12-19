package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NetworkPolicyPort_networking_k8s_io_v1: K8sManifest {
  /** If set, indicates that the range of ports from port to endPort, inclusive, should be allowed by the policy. This field
cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort
must be equal or greater than port. This feature is in Beta state and is enabled by default. It can be disabled using
the Feature Gate "NetworkPolicyEndPort". */
  @K8sDslMarker var endPort: Int?
  /** The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided,
this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched. */
  var port: de.loosetie.k8s.dsl.types.IntOrString?
  /** The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP. */
  @K8sDslMarker var protocol: String?
}