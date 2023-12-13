package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Validatingadmissionpolicybindingspec_admissionregistration_k8s_io_v1alpha1: K8sManifest {
  /** MatchResources declares what resources match this binding and will be validated by it. Note that this is intersected
with the policy's matchConstraints, so only requests that are matched by the policy can be selected by this. If this is
unset, all resources matched by the policy are validated by this binding When resourceRules is unset, it does not
constrain resource matching. If a resource is matched by the other fields of this object, it will be validated. Note
that this is differs from ValidatingAdmissionPolicy matchConstraints, where resourceRules are required. */
  val matchResources: MatchResources_admissionregistration_k8s_io_v1alpha1?
  /** ParamRef specifies the parameter resource used to configure the admission control policy. It should point to a resource
of the type specified in ParamKind of the bound ValidatingAdmissionPolicy. If the policy specifies a ParamKind and the
resource referred to by ParamRef does not exist, this binding is considered mis-configured and the FailurePolicy of the
ValidatingAdmissionPolicy applied. */
  val paramRef: ParamRef_admissionregistration_k8s_io_v1alpha1?
  /** PolicyName references a ValidatingAdmissionPolicy name which the ValidatingAdmissionPolicyBinding binds to. If the
referenced resource does not exist, this binding is considered invalid and will be ignored Required. */
  @K8sDslMarker var policyName: String?
}