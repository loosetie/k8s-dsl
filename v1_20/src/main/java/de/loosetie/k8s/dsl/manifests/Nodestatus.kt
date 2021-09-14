package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Nodestatus_core_v1_k8s1_20: K8sManifest {
  /** List of addresses reachable to the node. Queried from cloud provider, if available. More info:
https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key
is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a
full-replacement patch. See http://pr.k8s.io/79391 for an example. */
  val addresses: List<NodeAddress_core_v1_k8s1_20>?
  /** Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity. */
  @K8sDslMarker var allocatable: Any?
  /** Capacity represents the total resources of a node. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity */
  @K8sDslMarker var capacity: Any?
  /** Conditions is an array of current observed node conditions. More info:
https://kubernetes.io/docs/concepts/nodes/node/#condition */
  val conditions: List<NodeCondition_core_v1_k8s1_20>?
  /** Status of the config assigned to the node via the dynamic Kubelet config feature. */
  val config: NodeConfigStatus_core_v1_k8s1_20?
  /** Endpoints of daemons running on the Node. */
  val daemonEndpoints: NodeDaemonEndpoints_core_v1_k8s1_20?
  /** List of container images on this node */
  val images: List<ContainerImage_core_v1_k8s1_20>?
  /** Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info */
  val nodeInfo: NodeSystemInfo_core_v1_k8s1_20?
  /** NodePhase is the recently observed lifecycle phase of the node. More info:
https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated. */
  @K8sDslMarker var phase: String?
  /** List of volumes that are attached to the node. */
  val volumesAttached: List<AttachedVolume_core_v1_k8s1_20>?
  /** List of attachable volumes in use (mounted) by the node. */
  @K8sDslMarker var volumesInUse: List<String>?
}