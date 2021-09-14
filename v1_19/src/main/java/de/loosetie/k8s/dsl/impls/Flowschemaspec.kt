package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("distinguisherMethod", "matchingPrecedence", "priorityLevelConfiguration", "rules")
class Flowschemaspec_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Flowschemaspec_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19, HasParent {
  override var distinguisherMethod: FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19? = null
  override var matchingPrecedence: Int? = null
  override var priorityLevelConfiguration: PriorityLevelConfigurationReference_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19? = null
  override var rules: List<PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19>? = null
}