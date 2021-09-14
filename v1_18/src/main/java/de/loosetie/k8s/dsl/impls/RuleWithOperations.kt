package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiGroups", "apiVersions", "operations", "resources", "scope")
class RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_18, HasParent {
  override var apiGroups: List<String>? = null
  override var apiVersions: List<String>? = null
  override var operations: List<String>? = null
  override var resources: List<String>? = null
  override var scope: String? = null
}