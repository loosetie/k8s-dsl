package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "key", "optional")
class SecretKeySelector_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SecretKeySelector_core_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var key: String? = null
  override var optional: Boolean? = null
}
typealias SecretKeySelector_core_v1_k8s1_17Impl = SecretKeySelector_core_v1_k8s1_16Impl
typealias SecretKeySelector_core_v1_k8s1_18Impl = SecretKeySelector_core_v1_k8s1_17Impl
typealias SecretKeySelector_core_v1_k8s1_19Impl = SecretKeySelector_core_v1_k8s1_18Impl
typealias SecretKeySelector_core_v1_k8s1_20Impl = SecretKeySelector_core_v1_k8s1_19Impl
typealias SecretKeySelector_core_v1_k8s1_21Impl = SecretKeySelector_core_v1_k8s1_20Impl