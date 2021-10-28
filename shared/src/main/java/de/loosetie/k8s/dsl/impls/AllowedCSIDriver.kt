package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name")
class AllowedCSIDriver_policy_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AllowedCSIDriver_policy_v1beta1_k8s1_16, HasParent {
  override var name: String? = null
}
typealias AllowedCSIDriver_policy_v1beta1_k8s1_17Impl = AllowedCSIDriver_policy_v1beta1_k8s1_16Impl
typealias AllowedCSIDriver_policy_v1beta1_k8s1_18Impl = AllowedCSIDriver_policy_v1beta1_k8s1_17Impl
typealias AllowedCSIDriver_policy_v1beta1_k8s1_19Impl = AllowedCSIDriver_policy_v1beta1_k8s1_18Impl
typealias AllowedCSIDriver_policy_v1beta1_k8s1_20Impl = AllowedCSIDriver_policy_v1beta1_k8s1_19Impl
typealias AllowedCSIDriver_policy_v1beta1_k8s1_21Impl = AllowedCSIDriver_policy_v1beta1_k8s1_20Impl