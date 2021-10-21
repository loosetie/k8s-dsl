package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Networkpolicyspec_networking_k8s_io_v1_k8s1_16: K8sManifest {
  /** List of egress rules to be applied to the selected pods. Outgoing traffic is allowed if there are no NetworkPolicies
selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule
across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this
NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by
default). This field is beta-level in 1.8 */
  val egress: List<NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_16>?
  /** List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if there are no NetworkPolicies
selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic source is the pod's local node,
OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches
the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the
pods it selects are isolated by default) */
  val ingress: List<NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_16>?
  /** Selects the pods to which this NetworkPolicy object applies. The array of ingress rules is applied to any pods selected
by this field. Multiple network policies can select the same set of pods. In this case, the ingress rules for each are
combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector
matches all pods in this namespace. */
  val podSelector: LabelSelector_meta_v1_k8s1_16?
  /** List of rule types that the NetworkPolicy relates to. Valid options are "Ingress", "Egress", or "Ingress,Egress". If
this field is not specified, it will default based on the existence of Ingress or Egress rules; policies that contain an
Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress section) are
assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [
"Egress" ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a
policyTypes value that include "Egress" (since such a policy would not include an Egress section and would otherwise
default to just [ "Ingress" ]). This field is beta-level in 1.8 */
  @K8sDslMarker var policyTypes: List<String>?
}      
typealias Networkpolicyspec_networking_k8s_io_v1_k8s1_17 = Networkpolicyspec_networking_k8s_io_v1_k8s1_16       
typealias Networkpolicyspec_networking_k8s_io_v1_k8s1_18 = Networkpolicyspec_networking_k8s_io_v1_k8s1_17       
typealias Networkpolicyspec_networking_k8s_io_v1_k8s1_19 = Networkpolicyspec_networking_k8s_io_v1_k8s1_18       
typealias Networkpolicyspec_networking_k8s_io_v1_k8s1_20 = Networkpolicyspec_networking_k8s_io_v1_k8s1_19       
@K8sDslMarker
interface Networkpolicyspec_networking_k8s_io_v1_k8s1_21: Networkpolicyspec_networking_k8s_io_v1_k8s1_20 {
  /** List of rule types that the NetworkPolicy relates to. Valid options are ["Ingress"], ["Egress"], or ["Ingress",
"Egress"]. If this field is not specified, it will default based on the existence of Ingress or Egress rules; policies
that contain an Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress
section) are assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify
policyTypes [ "Egress" ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must
specify a policyTypes value that include "Egress" (since such a policy would not include an Egress section and would
otherwise default to just [ "Ingress" ]). This field is beta-level in 1.8 */
  override var policyTypes: List<String>?
}