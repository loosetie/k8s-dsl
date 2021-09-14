package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PodDNSConfig_core_v1_k8s1_18: K8sManifest {
  /** A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy.
Duplicated nameservers will be removed. */
  @K8sDslMarker var nameservers: List<String>?
  /** A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries
will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy. */
  val options: List<PodDNSConfigOption_core_v1_k8s1_18>?
  /** A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from
DNSPolicy. Duplicated search paths will be removed. */
  @K8sDslMarker var searches: List<String>?
}