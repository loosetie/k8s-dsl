package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "binaryData", "data")
class ConfigMap_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMap_core_v1, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1
  override var binaryData: Map<String, String>? = null
  override var data: Map<String, String>? = null
}