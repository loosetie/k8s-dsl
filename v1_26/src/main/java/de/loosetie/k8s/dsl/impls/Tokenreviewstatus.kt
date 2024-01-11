package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("audiences", "authenticated", "error", "user")
open class Tokenreviewstatus_authentication_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Tokenreviewstatus_authentication_k8s_io_v1, HasParent {
  override var audiences: List<String>? = null
  override var authenticated: Boolean? = null
  override var error: String? = null
  override var user: UserInfo_authentication_k8s_io_v1? = null
}