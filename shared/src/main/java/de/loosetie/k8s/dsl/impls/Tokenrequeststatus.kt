package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("expirationTimestamp", "token")
class Tokenrequeststatus_authentication_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Tokenrequeststatus_authentication_k8s_io_v1_k8s1_16, HasParent {
  override var expirationTimestamp: Time_meta_v1_k8s1_16? = null
  override var token: String? = null
}
typealias Tokenrequeststatus_authentication_k8s_io_v1_k8s1_17Impl = Tokenrequeststatus_authentication_k8s_io_v1_k8s1_16Impl
typealias Tokenrequeststatus_authentication_k8s_io_v1_k8s1_18Impl = Tokenrequeststatus_authentication_k8s_io_v1_k8s1_17Impl
typealias Tokenrequeststatus_authentication_k8s_io_v1_k8s1_19Impl = Tokenrequeststatus_authentication_k8s_io_v1_k8s1_18Impl
typealias Tokenrequeststatus_authentication_k8s_io_v1_k8s1_20Impl = Tokenrequeststatus_authentication_k8s_io_v1_k8s1_19Impl
typealias Tokenrequeststatus_authentication_k8s_io_v1_k8s1_21Impl = Tokenrequeststatus_authentication_k8s_io_v1_k8s1_20Impl