package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Clustercidrspec_networking_k8s_io_v1alpha1: K8sManifest {
  /** IPv4 defines an IPv4 IP block in CIDR notation(e.g. "10.0.0.0/8"). At least one of IPv4 and IPv6 must be specified. This
field is immutable. */
  @K8sDslMarker var ipv4: String?
  /** IPv6 defines an IPv6 IP block in CIDR notation(e.g. "2001:db8::/64"). At least one of IPv4 and IPv6 must be specified.
This field is immutable. */
  @K8sDslMarker var ipv6: String?
  /** NodeSelector defines which nodes the config is applicable to. An empty or nil NodeSelector selects all nodes. This field
is immutable. */
  val nodeSelector: NodeSelector_core_v1?
  /** PerNodeHostBits defines the number of host bits to be configured per node. A subnet mask determines how much of the
address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into
24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask
for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable. */
  @K8sDslMarker var perNodeHostBits: Int?
}