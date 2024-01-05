package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("excludeResourceRules", "matchPolicy", "namespaceSelector", "objectSelector", "resourceRules")
class MatchResources_admissionregistration_k8s_io_v1beta1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: MatchResources_admissionregistration_k8s_io_v1beta1, HasParent {
  override var excludeResourceRules: List<NamedRuleWithOperations_admissionregistration_k8s_io_v1beta1>? = null
  override var matchPolicy: String? = null
  override var namespaceSelector: LabelSelector_meta_v1? = null
  override var objectSelector: LabelSelector_meta_v1? = null
  override var resourceRules: List<NamedRuleWithOperations_admissionregistration_k8s_io_v1beta1>? = null
}