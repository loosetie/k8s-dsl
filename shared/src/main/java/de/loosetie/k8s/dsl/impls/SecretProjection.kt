package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "items", "optional")
class SecretProjection_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SecretProjection_core_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var items: List<KeyToPath_core_v1_k8s1_16>? = null
  override var optional: Boolean? = null
}
typealias SecretProjection_core_v1_k8s1_17Impl = SecretProjection_core_v1_k8s1_16Impl
typealias SecretProjection_core_v1_k8s1_18Impl = SecretProjection_core_v1_k8s1_17Impl
typealias SecretProjection_core_v1_k8s1_19Impl = SecretProjection_core_v1_k8s1_18Impl
typealias SecretProjection_core_v1_k8s1_20Impl = SecretProjection_core_v1_k8s1_19Impl
typealias SecretProjection_core_v1_k8s1_21Impl = SecretProjection_core_v1_k8s1_20Impl