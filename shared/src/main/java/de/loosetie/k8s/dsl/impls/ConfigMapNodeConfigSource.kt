package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("namespace", "name", "kubeletConfigKey", "resourceVersion", "uid")
class ConfigMapNodeConfigSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMapNodeConfigSource_core_v1_k8s1_16, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var kubeletConfigKey: String? = null
  override var resourceVersion: String? = null
  override var uid: String? = null
}
typealias ConfigMapNodeConfigSource_core_v1_k8s1_17Impl = ConfigMapNodeConfigSource_core_v1_k8s1_16Impl
typealias ConfigMapNodeConfigSource_core_v1_k8s1_18Impl = ConfigMapNodeConfigSource_core_v1_k8s1_17Impl
typealias ConfigMapNodeConfigSource_core_v1_k8s1_19Impl = ConfigMapNodeConfigSource_core_v1_k8s1_18Impl
typealias ConfigMapNodeConfigSource_core_v1_k8s1_20Impl = ConfigMapNodeConfigSource_core_v1_k8s1_19Impl
typealias ConfigMapNodeConfigSource_core_v1_k8s1_21Impl = ConfigMapNodeConfigSource_core_v1_k8s1_20Impl