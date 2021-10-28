package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("max", "min")
class IDRange_policy_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IDRange_policy_v1beta1_k8s1_16, HasParent {
  override var max: Int? = null
  override var min: Int? = null
}
typealias IDRange_policy_v1beta1_k8s1_17Impl = IDRange_policy_v1beta1_k8s1_16Impl
typealias IDRange_policy_v1beta1_k8s1_18Impl = IDRange_policy_v1beta1_k8s1_17Impl
typealias IDRange_policy_v1beta1_k8s1_19Impl = IDRange_policy_v1beta1_k8s1_18Impl
typealias IDRange_policy_v1beta1_k8s1_20Impl = IDRange_policy_v1beta1_k8s1_19Impl
typealias IDRange_policy_v1beta1_k8s1_21Impl = IDRange_policy_v1beta1_k8s1_20Impl