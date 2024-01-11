package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("availableOnNodes", "resourceHandles", "shareable")
open class AllocationResult_resource_k8s_io_v1alpha2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: AllocationResult_resource_k8s_io_v1alpha2, HasParent {
  override var availableOnNodes: NodeSelector_core_v1? = null
  override var resourceHandles: List<ResourceHandle_resource_k8s_io_v1alpha2>? = null
  override var shareable: Boolean? = null
}