package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("namespace", "name")
class SecretReference_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SecretReference_core_v1_k8s1_16, HasParent {
  override var namespace: String? = null
  override var name: String? = null
}
typealias SecretReference_core_v1_k8s1_17Impl = SecretReference_core_v1_k8s1_16Impl
typealias SecretReference_core_v1_k8s1_18Impl = SecretReference_core_v1_k8s1_17Impl
typealias SecretReference_core_v1_k8s1_19Impl = SecretReference_core_v1_k8s1_18Impl
typealias SecretReference_core_v1_k8s1_20Impl = SecretReference_core_v1_k8s1_19Impl
typealias SecretReference_core_v1_k8s1_21Impl = SecretReference_core_v1_k8s1_20Impl