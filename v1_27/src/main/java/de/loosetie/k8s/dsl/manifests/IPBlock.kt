package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface IPBlock_networking_k8s_io_v1: K8sManifest {
  /** cidr is a string representing the IPBlock Valid examples are "192.168.1.0/24" or "2001:db8::/64" */
  @K8sDslMarker var cidr: String?
  /** except is a slice of CIDRs that should not be included within an IPBlock Valid examples are "192.168.1.0/24" or
"2001:db8::/64" Except values will be rejected if they are outside the cidr range */
  @K8sDslMarker var except: List<String>?
}