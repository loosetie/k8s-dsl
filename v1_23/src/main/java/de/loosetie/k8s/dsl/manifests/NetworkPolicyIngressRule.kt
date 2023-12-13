package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NetworkPolicyIngressRule_networking_k8s_io_v1: K8sManifest {
  /** List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a
logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by
source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches
at least one item in the from list. */
  val from: List<NetworkPolicyPeer_networking_k8s_io_v1>?
  /** List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined
using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If
this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least
one port in the list. */
  val ports: List<NetworkPolicyPort_networking_k8s_io_v1>?
}