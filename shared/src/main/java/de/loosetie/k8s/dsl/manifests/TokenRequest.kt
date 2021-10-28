package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface TokenRequest_authentication_k8s_io_v1_k8s1_16: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "authentication.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "TokenRequest"
  /**  */
  val metadata: ObjectMeta_meta_v1_k8s1_16
  /**  */
  val spec: Tokenrequestspec_authentication_k8s_io_v1_k8s1_16
  /**  */
  val status: Tokenrequeststatus_authentication_k8s_io_v1_k8s1_16?
}      
@K8sDslMarker
interface TokenRequest_authentication_k8s_io_v1_k8s1_17: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "authentication.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "TokenRequest"
  /**  */
  val metadata: ObjectMeta_meta_v1_k8s1_17
  /**  */
  val spec: Tokenrequestspec_authentication_k8s_io_v1_k8s1_17
  /**  */
  val status: Tokenrequeststatus_authentication_k8s_io_v1_k8s1_17?
}      
typealias TokenRequest_authentication_k8s_io_v1_k8s1_18 = TokenRequest_authentication_k8s_io_v1_k8s1_17       
typealias TokenRequest_authentication_k8s_io_v1_k8s1_19 = TokenRequest_authentication_k8s_io_v1_k8s1_18       
typealias TokenRequest_authentication_k8s_io_v1_k8s1_20 = TokenRequest_authentication_k8s_io_v1_k8s1_19 

@Deprecated(message="Old api version")
@K8sDslMarker
interface TokenRequest_storage_k8s_io_v1_k8s1_20: K8sManifest {
  /** Audience is the intended audience of the token in "TokenRequestSpec". It will default to the audiences of kube
apiserver. */
  @K8sDslMarker var audience: String?
  /** ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec". It has the same default value of
"ExpirationSeconds" in "TokenRequestSpec". */
  @K8sDslMarker var expirationSeconds: Int?
}      
typealias TokenRequest_authentication_k8s_io_v1_k8s1_21 = TokenRequest_authentication_k8s_io_v1_k8s1_20 

typealias TokenRequest_storage_k8s_io_v1_k8s1_21 = TokenRequest_storage_k8s_io_v1_k8s1_20 