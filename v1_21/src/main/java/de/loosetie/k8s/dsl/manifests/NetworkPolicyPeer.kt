package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NetworkPolicyPeer_networking_k8s_io_v1_k8s1_21: K8sManifest {
  /** IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be. */
  val ipBlock: IPBlock_networking_k8s_io_v1_k8s1_21?
  /** Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but
empty, it selects all namespaces. If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods
matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces
selected by NamespaceSelector. */
  val namespaceSelector: LabelSelector_meta_v1_k8s1_21?
  /** This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty,
it selects all pods. If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching
PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the
policy's own Namespace. */
  val podSelector: LabelSelector_meta_v1_k8s1_21?
}