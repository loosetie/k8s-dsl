package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("containerName", "operator", "values")
open class PodFailurePolicyOnExitCodesRequirement_batch_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: PodFailurePolicyOnExitCodesRequirement_batch_v1, HasParent {
  override var containerName: String? = null
  override var operator: String? = null
  override var values: List<Int>? = null
}