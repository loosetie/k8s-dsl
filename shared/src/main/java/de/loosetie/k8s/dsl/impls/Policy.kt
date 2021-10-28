package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("level", "stages")
class Policy_auditregistration_k8s_io_v1alpha1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Policy_auditregistration_k8s_io_v1alpha1_k8s1_16, HasParent {
  override var level: String? = null
  override var stages: List<String>? = null
}
typealias Policy_auditregistration_k8s_io_v1alpha1_k8s1_17Impl = Policy_auditregistration_k8s_io_v1alpha1_k8s1_16Impl
typealias Policy_auditregistration_k8s_io_v1alpha1_k8s1_18Impl = Policy_auditregistration_k8s_io_v1alpha1_k8s1_17Impl


