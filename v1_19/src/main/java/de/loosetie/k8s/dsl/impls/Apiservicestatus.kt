package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("conditions")
class Apiservicestatus_apiregistration_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Apiservicestatus_apiregistration_k8s_io_v1_k8s1_19, HasParent {
  override var conditions: List<APIServiceCondition_apiregistration_k8s_io_v1_k8s1_19>? = null
}