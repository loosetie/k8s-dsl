package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "binaryData", "data", "immutable")
class ConfigMap_core_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMap_core_v1_k8s1_20, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_20
  override var binaryData: Any? = null
  override var data: Any? = null
  override var immutable: Boolean? = null
}