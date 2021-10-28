package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("pathPrefix", "readOnly")
class AllowedHostPath_policy_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AllowedHostPath_policy_v1beta1_k8s1_16, HasParent {
  override var pathPrefix: String? = null
  override var readOnly: Boolean? = null
}
typealias AllowedHostPath_policy_v1beta1_k8s1_17Impl = AllowedHostPath_policy_v1beta1_k8s1_16Impl
typealias AllowedHostPath_policy_v1beta1_k8s1_18Impl = AllowedHostPath_policy_v1beta1_k8s1_17Impl
typealias AllowedHostPath_policy_v1beta1_k8s1_19Impl = AllowedHostPath_policy_v1beta1_k8s1_18Impl
typealias AllowedHostPath_policy_v1beta1_k8s1_20Impl = AllowedHostPath_policy_v1beta1_k8s1_19Impl
typealias AllowedHostPath_policy_v1beta1_k8s1_21Impl = AllowedHostPath_policy_v1beta1_k8s1_20Impl