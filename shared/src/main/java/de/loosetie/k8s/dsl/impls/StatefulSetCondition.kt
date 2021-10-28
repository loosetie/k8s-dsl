package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("lastTransitionTime", "message", "reason", "status", "type")
class StatefulSetCondition_apps_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StatefulSetCondition_apps_v1_k8s1_16, HasParent {
  override var lastTransitionTime: Time_meta_v1_k8s1_16? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}
typealias StatefulSetCondition_apps_v1_k8s1_17Impl = StatefulSetCondition_apps_v1_k8s1_16Impl
typealias StatefulSetCondition_apps_v1_k8s1_18Impl = StatefulSetCondition_apps_v1_k8s1_17Impl
typealias StatefulSetCondition_apps_v1_k8s1_19Impl = StatefulSetCondition_apps_v1_k8s1_18Impl
typealias StatefulSetCondition_apps_v1_k8s1_20Impl = StatefulSetCondition_apps_v1_k8s1_19Impl
typealias StatefulSetCondition_apps_v1_k8s1_21Impl = StatefulSetCondition_apps_v1_k8s1_20Impl