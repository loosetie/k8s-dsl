package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "binaryData", "data")
class ConfigMap_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMap_core_v1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override var binaryData: Any? = null
  override var data: Any? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "binaryData", "data")
class ConfigMap_core_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMap_core_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override var binaryData: Any? = null
  override var data: Any? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "binaryData", "data", "immutable")
class ConfigMap_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMap_core_v1_k8s1_18, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_18
  override var binaryData: Any? = null
  override var data: Any? = null
  override var immutable: Boolean? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "binaryData", "data", "immutable")
class ConfigMap_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMap_core_v1_k8s1_19, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_19
  override var binaryData: Any? = null
  override var data: Any? = null
  override var immutable: Boolean? = null
}
typealias ConfigMap_core_v1_k8s1_20Impl = ConfigMap_core_v1_k8s1_19Impl
@JsonPropertyOrder("apiVersion", "kind", "metadata", "binaryData", "data", "immutable")
class ConfigMap_core_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMap_core_v1_k8s1_21, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_21
  override var binaryData: Any? = null
  override var data: Any? = null
  override var immutable: Boolean? = null
}