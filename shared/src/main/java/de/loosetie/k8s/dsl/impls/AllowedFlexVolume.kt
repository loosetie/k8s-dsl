package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("driver")
class AllowedFlexVolume_policy_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AllowedFlexVolume_policy_v1beta1_k8s1_16, HasParent {
  override var driver: String? = null
}
typealias AllowedFlexVolume_policy_v1beta1_k8s1_17Impl = AllowedFlexVolume_policy_v1beta1_k8s1_16Impl
typealias AllowedFlexVolume_policy_v1beta1_k8s1_18Impl = AllowedFlexVolume_policy_v1beta1_k8s1_17Impl
typealias AllowedFlexVolume_policy_v1beta1_k8s1_19Impl = AllowedFlexVolume_policy_v1beta1_k8s1_18Impl
typealias AllowedFlexVolume_policy_v1beta1_k8s1_20Impl = AllowedFlexVolume_policy_v1beta1_k8s1_19Impl
typealias AllowedFlexVolume_policy_v1beta1_k8s1_21Impl = AllowedFlexVolume_policy_v1beta1_k8s1_20Impl