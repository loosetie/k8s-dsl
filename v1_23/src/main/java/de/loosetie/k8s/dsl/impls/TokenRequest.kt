package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class TokenRequest_authentication_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
  @JsonIgnore
  override val helmVariables: MutableMap<String, String> = mutableMapOf(),
      
)
: TokenRequest_authentication_k8s_io_v1, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1
  override lateinit var spec: Tokenrequestspec_authentication_k8s_io_v1
  override var status: Tokenrequeststatus_authentication_k8s_io_v1? = null
}

@JsonPropertyOrder("audience", "expirationSeconds")
class TokenRequest_storage_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: TokenRequest_storage_k8s_io_v1, HasParent {
  override var audience: String? = null
  override var expirationSeconds: Int? = null
}