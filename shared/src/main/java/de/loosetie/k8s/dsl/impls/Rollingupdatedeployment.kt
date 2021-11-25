package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("maxSurge", "maxUnavailable")
class Rollingupdatedeployment_apps_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Rollingupdatedeployment_apps_v1_k8s1_16, HasParent {
  override var maxSurge: de.loosetie.k8s.dsl.types.IntOrPercentage? = null
  override var maxUnavailable: de.loosetie.k8s.dsl.types.IntOrPercentage? = null
}
typealias Rollingupdatedeployment_apps_v1_k8s1_17Impl = Rollingupdatedeployment_apps_v1_k8s1_16Impl
typealias Rollingupdatedeployment_apps_v1_k8s1_18Impl = Rollingupdatedeployment_apps_v1_k8s1_17Impl
typealias Rollingupdatedeployment_apps_v1_k8s1_19Impl = Rollingupdatedeployment_apps_v1_k8s1_18Impl
typealias Rollingupdatedeployment_apps_v1_k8s1_20Impl = Rollingupdatedeployment_apps_v1_k8s1_19Impl
typealias Rollingupdatedeployment_apps_v1_k8s1_21Impl = Rollingupdatedeployment_apps_v1_k8s1_20Impl