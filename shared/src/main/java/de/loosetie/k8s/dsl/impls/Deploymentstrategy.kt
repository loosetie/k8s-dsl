package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("rollingUpdate", "type")
class Deploymentstrategy_apps_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Deploymentstrategy_apps_v1_k8s1_16, HasParent {
  override var rollingUpdate: Rollingupdatedeployment_apps_v1_k8s1_16? = null
  override var type: String? = null
}
typealias Deploymentstrategy_apps_v1_k8s1_17Impl = Deploymentstrategy_apps_v1_k8s1_16Impl
typealias Deploymentstrategy_apps_v1_k8s1_18Impl = Deploymentstrategy_apps_v1_k8s1_17Impl
typealias Deploymentstrategy_apps_v1_k8s1_19Impl = Deploymentstrategy_apps_v1_k8s1_18Impl
typealias Deploymentstrategy_apps_v1_k8s1_20Impl = Deploymentstrategy_apps_v1_k8s1_19Impl
typealias Deploymentstrategy_apps_v1_k8s1_21Impl = Deploymentstrategy_apps_v1_k8s1_20Impl