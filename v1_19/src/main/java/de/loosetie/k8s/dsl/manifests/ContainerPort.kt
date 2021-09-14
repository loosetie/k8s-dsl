package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ContainerPort_core_v1_k8s1_19: K8sManifest {
  /** If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name.
Name for the port that can be referred to by services. */
  @K8sDslMarker var name: String?
  /** Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536. */
  @K8sDslMarker var containerPort: Int?
  /** What host IP to bind the external port to. */
  @K8sDslMarker var hostIP: String?
  /** Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is
specified, this must match ContainerPort. Most containers do not need this. */
  @K8sDslMarker var hostPort: Int?
  /** Protocol for port. Must be UDP, TCP, or SCTP. Defaults to "TCP". */
  @K8sDslMarker var protocol: String?
}