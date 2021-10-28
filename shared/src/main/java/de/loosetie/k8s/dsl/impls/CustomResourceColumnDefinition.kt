package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "description", "format", "jsonPath", "priority", "type")
class CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var description: String? = null
  override var format: String? = null
  override var jsonPath: String? = null
  override var priority: Int? = null
  override var type: String? = null
}
typealias CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_17Impl = CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_16Impl
typealias CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_18Impl = CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_17Impl
typealias CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_19Impl = CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_18Impl
typealias CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_20Impl = CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_19Impl
typealias CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_21Impl = CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_20Impl