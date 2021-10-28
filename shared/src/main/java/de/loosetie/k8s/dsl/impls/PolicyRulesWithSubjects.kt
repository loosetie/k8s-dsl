package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("nonResourceRules", "resourceRules", "subjects")
class PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17, HasParent {
  override var nonResourceRules: List<NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17>? = null
  override var resourceRules: List<ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17>? = null
  override var subjects: List<Subject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17>? = null
}
typealias PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl = PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl
typealias PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl = PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl


@JsonPropertyOrder("nonResourceRules", "resourceRules", "subjects")
class PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20, HasParent {
  override var nonResourceRules: List<NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20>? = null
  override var resourceRules: List<ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20>? = null
  override var subjects: List<Subject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20>? = null
}


typealias PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21Impl = PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl