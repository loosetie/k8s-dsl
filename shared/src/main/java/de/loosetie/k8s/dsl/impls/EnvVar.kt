package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "value", "valueFrom")
class EnvVar_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EnvVar_core_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var value: String? = null
  override var valueFrom: EnvVarSource_core_v1_k8s1_16? = null
}
@JsonPropertyOrder("name", "value", "valueFrom")
class EnvVar_core_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EnvVar_core_v1_k8s1_17, HasParent {
  override var name: String? = null
  override var value: String? = null
  override var valueFrom: EnvVarSource_core_v1_k8s1_17? = null
}
typealias EnvVar_core_v1_k8s1_18Impl = EnvVar_core_v1_k8s1_17Impl
@JsonPropertyOrder("name", "value", "valueFrom")
class EnvVar_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EnvVar_core_v1_k8s1_19, HasParent {
  override var name: String? = null
  override var value: String? = null
  override var valueFrom: EnvVarSource_core_v1_k8s1_19? = null
}
typealias EnvVar_core_v1_k8s1_20Impl = EnvVar_core_v1_k8s1_19Impl
typealias EnvVar_core_v1_k8s1_21Impl = EnvVar_core_v1_k8s1_20Impl