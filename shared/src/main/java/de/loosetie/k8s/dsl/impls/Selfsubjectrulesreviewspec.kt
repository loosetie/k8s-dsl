package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("namespace")
class Selfsubjectrulesreviewspec_authorization_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Selfsubjectrulesreviewspec_authorization_k8s_io_v1_k8s1_16, HasParent {
  override var namespace: String? = null
}
typealias Selfsubjectrulesreviewspec_authorization_k8s_io_v1_k8s1_17Impl = Selfsubjectrulesreviewspec_authorization_k8s_io_v1_k8s1_16Impl
typealias Selfsubjectrulesreviewspec_authorization_k8s_io_v1_k8s1_18Impl = Selfsubjectrulesreviewspec_authorization_k8s_io_v1_k8s1_17Impl
typealias Selfsubjectrulesreviewspec_authorization_k8s_io_v1_k8s1_19Impl = Selfsubjectrulesreviewspec_authorization_k8s_io_v1_k8s1_18Impl
typealias Selfsubjectrulesreviewspec_authorization_k8s_io_v1_k8s1_20Impl = Selfsubjectrulesreviewspec_authorization_k8s_io_v1_k8s1_19Impl
typealias Selfsubjectrulesreviewspec_authorization_k8s_io_v1_k8s1_21Impl = Selfsubjectrulesreviewspec_authorization_k8s_io_v1_k8s1_20Impl