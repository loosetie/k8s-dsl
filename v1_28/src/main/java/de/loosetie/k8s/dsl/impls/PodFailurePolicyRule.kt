package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("action", "onExitCodes", "onPodConditions")
open class PodFailurePolicyRule_batch_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: PodFailurePolicyRule_batch_v1, HasParent {
  override var action: String? = null
  override var onExitCodes: PodFailurePolicyOnExitCodesRequirement_batch_v1? = null
  override var onPodConditions: List<PodFailurePolicyOnPodConditionsPattern_batch_v1>? = null
}