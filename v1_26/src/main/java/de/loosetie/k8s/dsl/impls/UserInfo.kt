package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("extra", "groups", "uid", "username")
open class UserInfo_authentication_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: UserInfo_authentication_k8s_io_v1, HasParent {
  override var extra: Any? = null
  override var groups: List<String>? = null
  override var uid: String? = null
  override var username: String? = null
}