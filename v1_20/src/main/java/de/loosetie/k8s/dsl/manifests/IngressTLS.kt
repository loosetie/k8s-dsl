package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface IngressTLS_networking_k8s_io_v1_k8s1_20: K8sManifest {
  /** Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the
tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left
unspecified. */
  @K8sDslMarker var hosts: List<String>?
  /** SecretName is the name of the secret used to terminate TLS traffic on port 443. Field is left optional to allow TLS
routing based on SNI hostname alone. If the SNI host in a listener conflicts with the "Host" header field used by an
IngressRule, the SNI host is used for termination and value of the Host header is used for routing. */
  @K8sDslMarker var secretName: String?
}