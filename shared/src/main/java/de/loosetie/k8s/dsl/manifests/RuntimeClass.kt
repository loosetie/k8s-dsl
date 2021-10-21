package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface RuntimeClass_node_k8s_io_v1beta1_k8s1_16: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "node.k8s.io/v1beta1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "RuntimeClass"
  /** More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1_k8s1_16
  /** Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this
class. The possible values are specific to the node & CRI configuration. It is assumed that all handlers are available
on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might
specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The
Handler must conform to the DNS Label (RFC 1123) requirements, and is immutable. */
  @K8sDslMarker var handler: String?
  /** Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see
https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15,
and is only honored by servers that enable the PodOverhead feature. */
  val overhead: Overhead_node_k8s_io_v1beta1_k8s1_16?
  /** Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes
that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes. */
  val scheduling: Scheduling_node_k8s_io_v1beta1_k8s1_16?
}      
typealias RuntimeClass_node_k8s_io_v1beta1_k8s1_17 = RuntimeClass_node_k8s_io_v1beta1_k8s1_16       
typealias RuntimeClass_node_k8s_io_v1beta1_k8s1_18 = RuntimeClass_node_k8s_io_v1beta1_k8s1_17       
typealias RuntimeClass_node_k8s_io_v1beta1_k8s1_19 = RuntimeClass_node_k8s_io_v1beta1_k8s1_18       
@K8sDslMarker
interface RuntimeClass_node_k8s_io_v1_k8s1_20: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "node.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "RuntimeClass"
  /** More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1_k8s1_20
  /** Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this
class. The possible values are specific to the node & CRI configuration. It is assumed that all handlers are available
on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might
specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The
Handler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable. */
  @K8sDslMarker var handler: String?
  /** Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see
https://kubernetes.io/docs/concepts/scheduling-eviction/pod-overhead/ This field is in beta starting v1.18 and is only
honored by servers that enable the PodOverhead feature. */
  val overhead: Overhead_node_k8s_io_v1_k8s1_20?
  /** Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes
that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes. */
  val scheduling: Scheduling_node_k8s_io_v1_k8s1_20?
}

      
typealias RuntimeClass_node_k8s_io_v1_k8s1_21 = RuntimeClass_node_k8s_io_v1_k8s1_20 

