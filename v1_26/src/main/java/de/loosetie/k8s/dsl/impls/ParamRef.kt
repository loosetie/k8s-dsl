package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("namespace", "name")
open class ParamRef_admissionregistration_k8s_io_v1alpha1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: ParamRef_admissionregistration_k8s_io_v1alpha1, HasParent {
  override var namespace: String? = null
  override var name: String? = null
}