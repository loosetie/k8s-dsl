package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Role_rbac_authorization_k8s_io_v1_k8s1_16: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "rbac.authorization.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Role"
  /** Standard object's metadata. */
  val metadata: ObjectMeta_meta_v1_k8s1_16
  /** Rules holds all the PolicyRules for this Role */
  val rules: List<PolicyRule_rbac_authorization_k8s_io_v1_k8s1_16>?
}      
@K8sDslMarker
interface Role_rbac_authorization_k8s_io_v1_k8s1_17: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "rbac.authorization.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Role"
  /** Standard object's metadata. */
  val metadata: ObjectMeta_meta_v1_k8s1_17
  /** Rules holds all the PolicyRules for this Role */
  val rules: List<PolicyRule_rbac_authorization_k8s_io_v1_k8s1_17>?
}      
typealias Role_rbac_authorization_k8s_io_v1_k8s1_18 = Role_rbac_authorization_k8s_io_v1_k8s1_17       
typealias Role_rbac_authorization_k8s_io_v1_k8s1_19 = Role_rbac_authorization_k8s_io_v1_k8s1_18       
typealias Role_rbac_authorization_k8s_io_v1_k8s1_20 = Role_rbac_authorization_k8s_io_v1_k8s1_19       
typealias Role_rbac_authorization_k8s_io_v1_k8s1_21 = Role_rbac_authorization_k8s_io_v1_k8s1_20 