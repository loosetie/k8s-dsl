package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("nonResourceRules", "resourceRules", "subjects")
open class PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1beta1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1beta1, HasParent {
  override var nonResourceRules: List<NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta1>? = null
  override var resourceRules: List<ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta1>? = null
  override var subjects: List<Subject_flowcontrol_apiserver_k8s_io_v1beta1>? = null
}

@JsonPropertyOrder("nonResourceRules", "resourceRules", "subjects")
open class PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1beta2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1beta2, HasParent {
  override var nonResourceRules: List<NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta2>? = null
  override var resourceRules: List<ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta2>? = null
  override var subjects: List<Subject_flowcontrol_apiserver_k8s_io_v1beta2>? = null
}