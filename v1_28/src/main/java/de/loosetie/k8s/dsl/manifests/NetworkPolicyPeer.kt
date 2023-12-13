package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NetworkPolicyPeer_networking_k8s_io_v1: K8sManifest {
  /** ipBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be. */
  val ipBlock: IPBlock_networking_k8s_io_v1?
  /** namespaceSelector selects namespaces using cluster-scoped labels. This field follows standard label selector semantics;
if present but empty, it selects all namespaces. If podSelector is also set, then the NetworkPolicyPeer as a whole
selects the pods matching podSelector in the namespaces selected by namespaceSelector. Otherwise it selects all pods in
the namespaces selected by namespaceSelector. */
  val namespaceSelector: LabelSelector_meta_v1?
  /** podSelector is a label selector which selects pods. This field follows standard label selector semantics; if present but
empty, it selects all pods. If namespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the pods
matching podSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the pods matching podSelector
in the policy's own namespace. */
  val podSelector: LabelSelector_meta_v1?
}