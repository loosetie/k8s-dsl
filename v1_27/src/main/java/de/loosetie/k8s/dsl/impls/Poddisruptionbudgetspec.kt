package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("maxUnavailable", "minAvailable", "selector", "unhealthyPodEvictionPolicy")
open class Poddisruptionbudgetspec_policy_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Poddisruptionbudgetspec_policy_v1, HasParent {
  override var maxUnavailable: de.loosetie.k8s.dsl.types.IntOrPercentage? = null
  override var minAvailable: de.loosetie.k8s.dsl.types.IntOrPercentage? = null
  override var selector: LabelSelector_meta_v1? = null
  override var unhealthyPodEvictionPolicy: String? = null
}