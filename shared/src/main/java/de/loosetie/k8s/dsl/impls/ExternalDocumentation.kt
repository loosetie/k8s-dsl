package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("description", "url")
class ExternalDocumentation_apiextensions_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ExternalDocumentation_apiextensions_k8s_io_v1_k8s1_16, HasParent {
  override var description: String? = null
  override var url: String? = null
}
typealias ExternalDocumentation_apiextensions_k8s_io_v1_k8s1_17Impl = ExternalDocumentation_apiextensions_k8s_io_v1_k8s1_16Impl
typealias ExternalDocumentation_apiextensions_k8s_io_v1_k8s1_18Impl = ExternalDocumentation_apiextensions_k8s_io_v1_k8s1_17Impl
typealias ExternalDocumentation_apiextensions_k8s_io_v1_k8s1_19Impl = ExternalDocumentation_apiextensions_k8s_io_v1_k8s1_18Impl
typealias ExternalDocumentation_apiextensions_k8s_io_v1_k8s1_20Impl = ExternalDocumentation_apiextensions_k8s_io_v1_k8s1_19Impl
typealias ExternalDocumentation_apiextensions_k8s_io_v1_k8s1_21Impl = ExternalDocumentation_apiextensions_k8s_io_v1_k8s1_20Impl