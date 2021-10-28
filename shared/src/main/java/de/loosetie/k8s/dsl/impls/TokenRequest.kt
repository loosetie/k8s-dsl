package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class TokenRequest_authentication_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: TokenRequest_authentication_k8s_io_v1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override lateinit var spec: Tokenrequestspec_authentication_k8s_io_v1_k8s1_16
  override var status: Tokenrequeststatus_authentication_k8s_io_v1_k8s1_16? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class TokenRequest_authentication_k8s_io_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: TokenRequest_authentication_k8s_io_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override lateinit var spec: Tokenrequestspec_authentication_k8s_io_v1_k8s1_17
  override var status: Tokenrequeststatus_authentication_k8s_io_v1_k8s1_17? = null
}
typealias TokenRequest_authentication_k8s_io_v1_k8s1_18Impl = TokenRequest_authentication_k8s_io_v1_k8s1_17Impl
typealias TokenRequest_authentication_k8s_io_v1_k8s1_19Impl = TokenRequest_authentication_k8s_io_v1_k8s1_18Impl
typealias TokenRequest_authentication_k8s_io_v1_k8s1_20Impl = TokenRequest_authentication_k8s_io_v1_k8s1_19Impl

@JsonPropertyOrder("audience", "expirationSeconds")
class TokenRequest_storage_k8s_io_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: TokenRequest_storage_k8s_io_v1_k8s1_20, HasParent {
  override var audience: String? = null
  override var expirationSeconds: Int? = null
}
typealias TokenRequest_authentication_k8s_io_v1_k8s1_21Impl = TokenRequest_authentication_k8s_io_v1_k8s1_20Impl

typealias TokenRequest_storage_k8s_io_v1_k8s1_21Impl = TokenRequest_storage_k8s_io_v1_k8s1_20Impl