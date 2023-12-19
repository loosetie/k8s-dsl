package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("acceptedNames", "conditions", "storedVersions")
class Customresourcedefinitionstatus_apiextensions_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Customresourcedefinitionstatus_apiextensions_k8s_io_v1, HasParent {
  override var acceptedNames: CustomResourceDefinitionNames_apiextensions_k8s_io_v1? = null
  override var conditions: List<CustomResourceDefinitionCondition_apiextensions_k8s_io_v1>? = null
  override var storedVersions: List<String>? = null
}