package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("maxSurge", "maxUnavailable")
class Rollingupdatedaemonset_apps_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Rollingupdatedaemonset_apps_v1, HasParent {
  override var maxSurge: de.loosetie.k8s.dsl.types.IntOrPercentage? = null
  override var maxUnavailable: de.loosetie.k8s.dsl.types.IntOrPercentage? = null
}