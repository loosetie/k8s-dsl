package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("lastProbeTime", "lastTransitionTime", "message", "reason", "status", "type")
class PersistentVolumeClaimCondition_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PersistentVolumeClaimCondition_core_v1_k8s1_16, HasParent {
  override var lastProbeTime: Time_meta_v1_k8s1_16? = null
  override var lastTransitionTime: Time_meta_v1_k8s1_16? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}
typealias PersistentVolumeClaimCondition_core_v1_k8s1_17Impl = PersistentVolumeClaimCondition_core_v1_k8s1_16Impl
typealias PersistentVolumeClaimCondition_core_v1_k8s1_18Impl = PersistentVolumeClaimCondition_core_v1_k8s1_17Impl
typealias PersistentVolumeClaimCondition_core_v1_k8s1_19Impl = PersistentVolumeClaimCondition_core_v1_k8s1_18Impl
typealias PersistentVolumeClaimCondition_core_v1_k8s1_20Impl = PersistentVolumeClaimCondition_core_v1_k8s1_19Impl
typealias PersistentVolumeClaimCondition_core_v1_k8s1_21Impl = PersistentVolumeClaimCondition_core_v1_k8s1_20Impl