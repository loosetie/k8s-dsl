package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("audiences", "boundObjectRef", "expirationSeconds")
class Tokenrequestspec_authentication_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Tokenrequestspec_authentication_k8s_io_v1_k8s1_16, HasParent {
  override var audiences: List<String>? = null
  override var boundObjectRef: BoundObjectReference_authentication_k8s_io_v1_k8s1_16? = null
  override var expirationSeconds: Int? = null
}
typealias Tokenrequestspec_authentication_k8s_io_v1_k8s1_17Impl = Tokenrequestspec_authentication_k8s_io_v1_k8s1_16Impl
typealias Tokenrequestspec_authentication_k8s_io_v1_k8s1_18Impl = Tokenrequestspec_authentication_k8s_io_v1_k8s1_17Impl
typealias Tokenrequestspec_authentication_k8s_io_v1_k8s1_19Impl = Tokenrequestspec_authentication_k8s_io_v1_k8s1_18Impl
typealias Tokenrequestspec_authentication_k8s_io_v1_k8s1_20Impl = Tokenrequestspec_authentication_k8s_io_v1_k8s1_19Impl
typealias Tokenrequestspec_authentication_k8s_io_v1_k8s1_21Impl = Tokenrequestspec_authentication_k8s_io_v1_k8s1_20Impl