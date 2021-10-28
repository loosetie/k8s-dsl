package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("configMapKeyRef", "fieldRef", "resourceFieldRef", "secretKeyRef")
class EnvVarSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EnvVarSource_core_v1_k8s1_16, HasParent {
  override var configMapKeyRef: ConfigMapKeySelector_core_v1_k8s1_16? = null
  override var fieldRef: ObjectFieldSelector_core_v1_k8s1_16? = null
  override var resourceFieldRef: ResourceFieldSelector_core_v1_k8s1_16? = null
  override var secretKeyRef: SecretKeySelector_core_v1_k8s1_16? = null
}
@JsonPropertyOrder("configMapKeyRef", "fieldRef", "resourceFieldRef", "secretKeyRef")
class EnvVarSource_core_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EnvVarSource_core_v1_k8s1_17, HasParent {
  override var configMapKeyRef: ConfigMapKeySelector_core_v1_k8s1_17? = null
  override var fieldRef: ObjectFieldSelector_core_v1_k8s1_17? = null
  override var resourceFieldRef: ResourceFieldSelector_core_v1_k8s1_17? = null
  override var secretKeyRef: SecretKeySelector_core_v1_k8s1_17? = null
}
typealias EnvVarSource_core_v1_k8s1_18Impl = EnvVarSource_core_v1_k8s1_17Impl
@JsonPropertyOrder("configMapKeyRef", "fieldRef", "resourceFieldRef", "secretKeyRef")
class EnvVarSource_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EnvVarSource_core_v1_k8s1_19, HasParent {
  override var configMapKeyRef: ConfigMapKeySelector_core_v1_k8s1_19? = null
  override var fieldRef: ObjectFieldSelector_core_v1_k8s1_19? = null
  override var resourceFieldRef: ResourceFieldSelector_core_v1_k8s1_19? = null
  override var secretKeyRef: SecretKeySelector_core_v1_k8s1_19? = null
}
typealias EnvVarSource_core_v1_k8s1_20Impl = EnvVarSource_core_v1_k8s1_19Impl
typealias EnvVarSource_core_v1_k8s1_21Impl = EnvVarSource_core_v1_k8s1_20Impl