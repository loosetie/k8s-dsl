package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("lastTransitionTime", "lastUpdateTime", "message", "reason", "status", "type")
class DeploymentCondition_apps_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DeploymentCondition_apps_v1_k8s1_16, HasParent {
  override var lastTransitionTime: Time_meta_v1_k8s1_16? = null
  override var lastUpdateTime: Time_meta_v1_k8s1_16? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}
typealias DeploymentCondition_apps_v1_k8s1_17Impl = DeploymentCondition_apps_v1_k8s1_16Impl
typealias DeploymentCondition_apps_v1_k8s1_18Impl = DeploymentCondition_apps_v1_k8s1_17Impl
typealias DeploymentCondition_apps_v1_k8s1_19Impl = DeploymentCondition_apps_v1_k8s1_18Impl
typealias DeploymentCondition_apps_v1_k8s1_20Impl = DeploymentCondition_apps_v1_k8s1_19Impl
typealias DeploymentCondition_apps_v1_k8s1_21Impl = DeploymentCondition_apps_v1_k8s1_20Impl