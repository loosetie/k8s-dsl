package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NodeAffinity_core_v1_k8s1_19: K8sManifest {
  /** The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but
it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the
greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request,
requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and
adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are
the most preferred. */
  val preferredDuringSchedulingIgnoredDuringExecution: List<PreferredSchedulingTerm_core_v1_k8s1_19>?
  /** If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto
the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g.
due to an update), the system may or may not try to eventually evict the pod from its node. */
  val requiredDuringSchedulingIgnoredDuringExecution: NodeSelector_core_v1_k8s1_19?
}