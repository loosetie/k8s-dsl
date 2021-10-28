package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("rollingUpdate", "type")
class StatefulSetUpdateStrategy_apps_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StatefulSetUpdateStrategy_apps_v1_k8s1_16, HasParent {
  override var rollingUpdate: RollingUpdateStatefulSetStrategy_apps_v1_k8s1_16? = null
  override var type: String? = null
}
typealias StatefulSetUpdateStrategy_apps_v1_k8s1_17Impl = StatefulSetUpdateStrategy_apps_v1_k8s1_16Impl
typealias StatefulSetUpdateStrategy_apps_v1_k8s1_18Impl = StatefulSetUpdateStrategy_apps_v1_k8s1_17Impl
typealias StatefulSetUpdateStrategy_apps_v1_k8s1_19Impl = StatefulSetUpdateStrategy_apps_v1_k8s1_18Impl
typealias StatefulSetUpdateStrategy_apps_v1_k8s1_20Impl = StatefulSetUpdateStrategy_apps_v1_k8s1_19Impl
typealias StatefulSetUpdateStrategy_apps_v1_k8s1_21Impl = StatefulSetUpdateStrategy_apps_v1_k8s1_20Impl