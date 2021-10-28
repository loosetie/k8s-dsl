package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("lastTransitionTime", "message", "reason", "status", "type")
class CustomResourceDefinitionCondition_apiextensions_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceDefinitionCondition_apiextensions_k8s_io_v1_k8s1_16, HasParent {
  override var lastTransitionTime: Time_meta_v1_k8s1_16? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}
typealias CustomResourceDefinitionCondition_apiextensions_k8s_io_v1_k8s1_17Impl = CustomResourceDefinitionCondition_apiextensions_k8s_io_v1_k8s1_16Impl
typealias CustomResourceDefinitionCondition_apiextensions_k8s_io_v1_k8s1_18Impl = CustomResourceDefinitionCondition_apiextensions_k8s_io_v1_k8s1_17Impl
typealias CustomResourceDefinitionCondition_apiextensions_k8s_io_v1_k8s1_19Impl = CustomResourceDefinitionCondition_apiextensions_k8s_io_v1_k8s1_18Impl
typealias CustomResourceDefinitionCondition_apiextensions_k8s_io_v1_k8s1_20Impl = CustomResourceDefinitionCondition_apiextensions_k8s_io_v1_k8s1_19Impl
typealias CustomResourceDefinitionCondition_apiextensions_k8s_io_v1_k8s1_21Impl = CustomResourceDefinitionCondition_apiextensions_k8s_io_v1_k8s1_20Impl