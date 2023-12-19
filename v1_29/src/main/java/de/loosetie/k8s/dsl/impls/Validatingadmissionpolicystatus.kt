package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("conditions", "observedGeneration", "typeChecking")
class Validatingadmissionpolicystatus_admissionregistration_k8s_io_v1beta1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Validatingadmissionpolicystatus_admissionregistration_k8s_io_v1beta1, HasParent {
  override var conditions: List<Condition_meta_v1>? = null
  override var observedGeneration: Int? = null
  override var typeChecking: TypeChecking_admissionregistration_k8s_io_v1beta1? = null
}