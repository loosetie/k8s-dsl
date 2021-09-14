package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("rollingUpdate", "type")
class StatefulSetUpdateStrategy_apps_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StatefulSetUpdateStrategy_apps_v1_k8s1_20, HasParent {
  override var rollingUpdate: RollingUpdateStatefulSetStrategy_apps_v1_k8s1_20? = null
  override var type: String? = null
}