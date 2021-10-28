package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("key", "mode", "path")
class KeyToPath_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: KeyToPath_core_v1_k8s1_16, HasParent {
  override var key: String? = null
  override var mode: Int? = null
  override var path: String? = null
}
typealias KeyToPath_core_v1_k8s1_17Impl = KeyToPath_core_v1_k8s1_16Impl
typealias KeyToPath_core_v1_k8s1_18Impl = KeyToPath_core_v1_k8s1_17Impl
@JsonPropertyOrder("key", "mode", "path")
class KeyToPath_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: KeyToPath_core_v1_k8s1_19, HasParent {
  override var key: String? = null
  override var mode: Int? = null
  override var path: String? = null
}
typealias KeyToPath_core_v1_k8s1_20Impl = KeyToPath_core_v1_k8s1_19Impl
typealias KeyToPath_core_v1_k8s1_21Impl = KeyToPath_core_v1_k8s1_20Impl