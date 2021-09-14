package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ClusterRole_rbac_authorization_k8s_io_v1_k8s1_21: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "rbac.authorization.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ClusterRole"
  /** Standard object's metadata. */
  val metadata: ObjectMeta_meta_v1_k8s1_21
  /** AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is
set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller. */
  val aggregationRule: AggregationRule_rbac_authorization_k8s_io_v1_k8s1_21?
  /** Rules holds all the PolicyRules for this ClusterRole */
  val rules: List<PolicyRule_rbac_authorization_k8s_io_v1_k8s1_21>?
}