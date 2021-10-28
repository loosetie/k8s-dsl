package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("conversion", "group", "names", "preserveUnknownFields", "scope", "versions")
class Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_16, HasParent {
  override var conversion: CustomResourceConversion_apiextensions_k8s_io_v1_k8s1_16? = null
  override var group: String? = null
  override var names: CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_16? = null
  override var preserveUnknownFields: Boolean? = null
  override var scope: String? = null
  override var versions: List<CustomResourceDefinitionVersion_apiextensions_k8s_io_v1_k8s1_16>? = null
}
@JsonPropertyOrder("conversion", "group", "names", "preserveUnknownFields", "scope", "versions")
class Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_17, HasParent {
  override var conversion: CustomResourceConversion_apiextensions_k8s_io_v1_k8s1_17? = null
  override var group: String? = null
  override var names: CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_17? = null
  override var preserveUnknownFields: Boolean? = null
  override var scope: String? = null
  override var versions: List<CustomResourceDefinitionVersion_apiextensions_k8s_io_v1_k8s1_17>? = null
}
typealias Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_18Impl = Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_17Impl
typealias Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_19Impl = Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_18Impl
typealias Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_20Impl = Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_19Impl
typealias Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_21Impl = Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_20Impl