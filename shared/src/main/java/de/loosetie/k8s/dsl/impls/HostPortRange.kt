package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("max", "min")
class HostPortRange_policy_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HostPortRange_policy_v1beta1_k8s1_16, HasParent {
  override var max: Int? = null
  override var min: Int? = null
}
typealias HostPortRange_policy_v1beta1_k8s1_17Impl = HostPortRange_policy_v1beta1_k8s1_16Impl
typealias HostPortRange_policy_v1beta1_k8s1_18Impl = HostPortRange_policy_v1beta1_k8s1_17Impl
typealias HostPortRange_policy_v1beta1_k8s1_19Impl = HostPortRange_policy_v1beta1_k8s1_18Impl
typealias HostPortRange_policy_v1beta1_k8s1_20Impl = HostPortRange_policy_v1beta1_k8s1_19Impl
typealias HostPortRange_policy_v1beta1_k8s1_21Impl = HostPortRange_policy_v1beta1_k8s1_20Impl