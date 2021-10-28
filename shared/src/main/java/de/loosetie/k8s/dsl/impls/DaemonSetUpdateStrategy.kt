package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("rollingUpdate", "type")
class DaemonSetUpdateStrategy_apps_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DaemonSetUpdateStrategy_apps_v1_k8s1_16, HasParent {
  override var rollingUpdate: Rollingupdatedaemonset_apps_v1_k8s1_16? = null
  override var type: String? = null
}
typealias DaemonSetUpdateStrategy_apps_v1_k8s1_17Impl = DaemonSetUpdateStrategy_apps_v1_k8s1_16Impl
typealias DaemonSetUpdateStrategy_apps_v1_k8s1_18Impl = DaemonSetUpdateStrategy_apps_v1_k8s1_17Impl
typealias DaemonSetUpdateStrategy_apps_v1_k8s1_19Impl = DaemonSetUpdateStrategy_apps_v1_k8s1_18Impl
typealias DaemonSetUpdateStrategy_apps_v1_k8s1_20Impl = DaemonSetUpdateStrategy_apps_v1_k8s1_19Impl
typealias DaemonSetUpdateStrategy_apps_v1_k8s1_21Impl = DaemonSetUpdateStrategy_apps_v1_k8s1_20Impl