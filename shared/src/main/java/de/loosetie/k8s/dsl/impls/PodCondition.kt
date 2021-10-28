package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("lastProbeTime", "lastTransitionTime", "message", "reason", "status", "type")
class PodCondition_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodCondition_core_v1_k8s1_16, HasParent {
  override var lastProbeTime: Time_meta_v1_k8s1_16? = null
  override var lastTransitionTime: Time_meta_v1_k8s1_16? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}
typealias PodCondition_core_v1_k8s1_17Impl = PodCondition_core_v1_k8s1_16Impl
typealias PodCondition_core_v1_k8s1_18Impl = PodCondition_core_v1_k8s1_17Impl
typealias PodCondition_core_v1_k8s1_19Impl = PodCondition_core_v1_k8s1_18Impl
typealias PodCondition_core_v1_k8s1_20Impl = PodCondition_core_v1_k8s1_19Impl
typealias PodCondition_core_v1_k8s1_21Impl = PodCondition_core_v1_k8s1_20Impl