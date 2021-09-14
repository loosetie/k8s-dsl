package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ClusterRoleBinding_rbac_authorization_k8s_io_v1_k8s1_18: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "rbac.authorization.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ClusterRoleBinding"
  /** Standard object's metadata. */
  val metadata: ObjectMeta_meta_v1_k8s1_18
  /** RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must
return an error. */
  val roleRef: RoleRef_rbac_authorization_k8s_io_v1_k8s1_18?
  /** Subjects holds references to the objects the role applies to. */
  val subjects: List<Subject_rbac_authorization_k8s_io_v1_k8s1_18>?
}