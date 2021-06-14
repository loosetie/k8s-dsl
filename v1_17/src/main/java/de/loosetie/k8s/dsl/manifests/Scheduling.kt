package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Scheduling_node_k8s_io_v1beta1: K8sManifest {
  /** nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can
only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod's existing
nodeSelector. Any conflicts will cause the pod to be rejected in admission. */
  @K8sDslMarker var nodeSelector: Map<String, String>?
  /** tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively
unioning the set of nodes tolerated by the pod and the RuntimeClass. */
  val tolerations: List<Toleration_core_v1>?
}