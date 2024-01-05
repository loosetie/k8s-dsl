package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("availableOnNodes", "resourceHandle", "shareable")
class AllocationResult_resource_k8s_io_v1alpha1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: AllocationResult_resource_k8s_io_v1alpha1, HasParent {
  override var availableOnNodes: NodeSelector_core_v1? = null
  override var resourceHandle: String? = null
  override var shareable: Boolean? = null
}