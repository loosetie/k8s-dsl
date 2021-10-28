package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("lastTransitionTime", "message", "reason", "status", "type")
class DaemonSetCondition_apps_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DaemonSetCondition_apps_v1_k8s1_16, HasParent {
  override var lastTransitionTime: Time_meta_v1_k8s1_16? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}
typealias DaemonSetCondition_apps_v1_k8s1_17Impl = DaemonSetCondition_apps_v1_k8s1_16Impl
typealias DaemonSetCondition_apps_v1_k8s1_18Impl = DaemonSetCondition_apps_v1_k8s1_17Impl
typealias DaemonSetCondition_apps_v1_k8s1_19Impl = DaemonSetCondition_apps_v1_k8s1_18Impl
typealias DaemonSetCondition_apps_v1_k8s1_20Impl = DaemonSetCondition_apps_v1_k8s1_19Impl
typealias DaemonSetCondition_apps_v1_k8s1_21Impl = DaemonSetCondition_apps_v1_k8s1_20Impl