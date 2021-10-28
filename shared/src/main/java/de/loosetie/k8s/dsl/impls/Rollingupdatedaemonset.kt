package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("maxUnavailable")
class Rollingupdatedaemonset_apps_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Rollingupdatedaemonset_apps_v1_k8s1_16, HasParent {
  
}
typealias Rollingupdatedaemonset_apps_v1_k8s1_17Impl = Rollingupdatedaemonset_apps_v1_k8s1_16Impl
typealias Rollingupdatedaemonset_apps_v1_k8s1_18Impl = Rollingupdatedaemonset_apps_v1_k8s1_17Impl
typealias Rollingupdatedaemonset_apps_v1_k8s1_19Impl = Rollingupdatedaemonset_apps_v1_k8s1_18Impl
typealias Rollingupdatedaemonset_apps_v1_k8s1_20Impl = Rollingupdatedaemonset_apps_v1_k8s1_19Impl
@JsonPropertyOrder("maxSurge", "maxUnavailable")
class Rollingupdatedaemonset_apps_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Rollingupdatedaemonset_apps_v1_k8s1_21, HasParent {
  
}