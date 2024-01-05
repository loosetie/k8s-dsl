package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("auditAnnotations", "failurePolicy", "matchConditions", "matchConstraints", "paramKind", "validations")
class Validatingadmissionpolicyspec_admissionregistration_k8s_io_v1alpha1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Validatingadmissionpolicyspec_admissionregistration_k8s_io_v1alpha1, HasParent {
  override var auditAnnotations: List<AuditAnnotation_admissionregistration_k8s_io_v1alpha1>? = null
  override var failurePolicy: String? = null
  override var matchConditions: List<MatchCondition_admissionregistration_k8s_io_v1alpha1>? = null
  override var matchConstraints: MatchResources_admissionregistration_k8s_io_v1alpha1? = null
  override var paramKind: ParamKind_admissionregistration_k8s_io_v1alpha1? = null
  override var validations: List<Validation_admissionregistration_k8s_io_v1alpha1>? = null
}