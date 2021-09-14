package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_19: K8sManifest {
  /** List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is
empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at
least one item, then this rule allows traffic only if the traffic matches at least one port in the list. */
  val ports: List<NetworkPolicyPort_networking_k8s_io_v1_k8s1_19>?
  /** List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a
logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by
destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic
matches at least one item in the to list. */
  val to: List<NetworkPolicyPeer_networking_k8s_io_v1_k8s1_19>?
}