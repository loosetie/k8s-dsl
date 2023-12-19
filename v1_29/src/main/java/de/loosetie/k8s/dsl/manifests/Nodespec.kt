package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Nodespec_core_v1: K8sManifest {
  /** Deprecated: Previously used to specify the source of the node's configuration for the DynamicKubeletConfig feature. This
feature is removed. */
  val configSource: NodeConfigSource_core_v1?
  /** Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966 */
  @K8sDslMarker var externalID: String?
  /** PodCIDR represents the pod IP range assigned to the node. */
  @K8sDslMarker var podCIDR: String?
  /** podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the
0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6. */
  @K8sDslMarker var podCIDRs: List<String>?
  /** ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID> */
  @K8sDslMarker var providerID: String?
  /** If specified, the node's taints. */
  val taints: List<Taint_core_v1>?
  /** Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info:
https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration */
  @K8sDslMarker var unschedulable: Boolean?
}