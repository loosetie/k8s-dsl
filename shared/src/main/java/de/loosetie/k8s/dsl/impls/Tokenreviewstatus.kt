package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("audiences", "authenticated", "error", "user")
class Tokenreviewstatus_authentication_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Tokenreviewstatus_authentication_k8s_io_v1_k8s1_16, HasParent {
  override var audiences: List<String>? = null
  override var authenticated: Boolean? = null
  override var error: String? = null
  override var user: UserInfo_authentication_k8s_io_v1_k8s1_16? = null
}
typealias Tokenreviewstatus_authentication_k8s_io_v1_k8s1_17Impl = Tokenreviewstatus_authentication_k8s_io_v1_k8s1_16Impl
typealias Tokenreviewstatus_authentication_k8s_io_v1_k8s1_18Impl = Tokenreviewstatus_authentication_k8s_io_v1_k8s1_17Impl
typealias Tokenreviewstatus_authentication_k8s_io_v1_k8s1_19Impl = Tokenreviewstatus_authentication_k8s_io_v1_k8s1_18Impl
typealias Tokenreviewstatus_authentication_k8s_io_v1_k8s1_20Impl = Tokenreviewstatus_authentication_k8s_io_v1_k8s1_19Impl
typealias Tokenreviewstatus_authentication_k8s_io_v1_k8s1_21Impl = Tokenreviewstatus_authentication_k8s_io_v1_k8s1_20Impl