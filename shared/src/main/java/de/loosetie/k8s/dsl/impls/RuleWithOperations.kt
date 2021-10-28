package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiGroups", "apiVersions", "operations", "resources", "scope")
class RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_16, HasParent {
  override var apiGroups: List<String>? = null
  override var apiVersions: List<String>? = null
  override var operations: List<String>? = null
  override var resources: List<String>? = null
  override var scope: String? = null
}
typealias RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_17Impl = RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_16Impl
typealias RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_18Impl = RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_17Impl
@JsonPropertyOrder("apiGroups", "apiVersions", "operations", "resources", "scope")
class RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_19, HasParent {
  override var apiGroups: List<String>? = null
  override var apiVersions: List<String>? = null
  override var operations: List<String>? = null
  override var resources: List<String>? = null
  override var scope: String? = null
}
typealias RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_20Impl = RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_19Impl
typealias RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_21Impl = RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_20Impl