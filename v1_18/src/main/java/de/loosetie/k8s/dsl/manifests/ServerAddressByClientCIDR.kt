package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ServerAddressByClientCIDR_meta_v1_k8s1_18: K8sManifest {
  /** The CIDR with which clients can match their IP to figure out the server address that they should use. */
  @K8sDslMarker var clientCIDR: String?
  /** Address of this server, suitable for a client that matches the above CIDR. This can be a hostname, hostname:port, IP or
IP:port. */
  @K8sDslMarker var serverAddress: String?
}