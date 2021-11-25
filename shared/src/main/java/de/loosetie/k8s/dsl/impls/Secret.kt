package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "data", "stringData", "type")
class Secret_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Secret_core_v1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override var data: Map<String, String>? = null
  override var stringData: Map<String, String>? = null
  override var type: String? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "data", "stringData", "type")
class Secret_core_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Secret_core_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override var data: Map<String, String>? = null
  override var stringData: Map<String, String>? = null
  override var type: String? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "data", "immutable", "stringData", "type")
class Secret_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Secret_core_v1_k8s1_18, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_18
  override var data: Map<String, String>? = null
  override var immutable: Boolean? = null
  override var stringData: Map<String, String>? = null
  override var type: String? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "data", "immutable", "stringData", "type")
class Secret_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Secret_core_v1_k8s1_19, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_19
  override var data: Map<String, String>? = null
  override var immutable: Boolean? = null
  override var stringData: Map<String, String>? = null
  override var type: String? = null
}
typealias Secret_core_v1_k8s1_20Impl = Secret_core_v1_k8s1_19Impl
@JsonPropertyOrder("apiVersion", "kind", "metadata", "data", "immutable", "stringData", "type")
class Secret_core_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Secret_core_v1_k8s1_21, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_21
  override var data: Map<String, String>? = null
  override var immutable: Boolean? = null
  override var stringData: Map<String, String>? = null
  override var type: String? = null
}