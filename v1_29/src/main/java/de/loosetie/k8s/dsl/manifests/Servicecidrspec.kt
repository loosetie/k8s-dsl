package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Servicecidrspec_networking_k8s_io_v1alpha1: K8sManifest {
  /** CIDRs defines the IP blocks in CIDR notation (e.g. "192.168.0.0/24" or "2001:db8::/64") from which to assign service
cluster IPs. Max of two CIDRs is allowed, one of each IP family. This field is immutable. */
  @K8sDslMarker var cidrs: List<String>?
}