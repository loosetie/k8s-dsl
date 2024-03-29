package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("matchResources", "paramRef", "policyName", "validationActions")
open class Validatingadmissionpolicybindingspec_admissionregistration_k8s_io_v1beta1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Validatingadmissionpolicybindingspec_admissionregistration_k8s_io_v1beta1, HasParent {
  override var matchResources: MatchResources_admissionregistration_k8s_io_v1beta1? = null
  override var paramRef: ParamRef_admissionregistration_k8s_io_v1beta1? = null
  override var policyName: String? = null
  override var validationActions: List<String>? = null
}