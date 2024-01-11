package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("allocation", "deallocationRequested", "driverName", "reservedFor")
open class Resourceclaimstatus_resource_k8s_io_v1alpha2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Resourceclaimstatus_resource_k8s_io_v1alpha2, HasParent {
  override var allocation: AllocationResult_resource_k8s_io_v1alpha2? = null
  override var deallocationRequested: Boolean? = null
  override var driverName: String? = null
  override var reservedFor: List<ResourceClaimConsumerReference_resource_k8s_io_v1alpha2>? = null
}