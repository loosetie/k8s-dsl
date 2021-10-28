package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("path", "verb")
class NonResourceAttributes_authorization_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NonResourceAttributes_authorization_k8s_io_v1_k8s1_16, HasParent {
  override var path: String? = null
  override var verb: String? = null
}
typealias NonResourceAttributes_authorization_k8s_io_v1_k8s1_17Impl = NonResourceAttributes_authorization_k8s_io_v1_k8s1_16Impl
typealias NonResourceAttributes_authorization_k8s_io_v1_k8s1_18Impl = NonResourceAttributes_authorization_k8s_io_v1_k8s1_17Impl
typealias NonResourceAttributes_authorization_k8s_io_v1_k8s1_19Impl = NonResourceAttributes_authorization_k8s_io_v1_k8s1_18Impl
typealias NonResourceAttributes_authorization_k8s_io_v1_k8s1_20Impl = NonResourceAttributes_authorization_k8s_io_v1_k8s1_19Impl
typealias NonResourceAttributes_authorization_k8s_io_v1_k8s1_21Impl = NonResourceAttributes_authorization_k8s_io_v1_k8s1_20Impl