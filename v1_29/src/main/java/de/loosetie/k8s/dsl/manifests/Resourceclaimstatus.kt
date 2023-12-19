package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Resourceclaimstatus_resource_k8s_io_v1alpha2: K8sManifest {
  /** Allocation is set by the resource driver once a resource or set of resources has been allocated successfully. If this is
not specified, the resources have not been allocated yet. */
  val allocation: AllocationResult_resource_k8s_io_v1alpha2?
  /** DeallocationRequested indicates that a ResourceClaim is to be deallocated. The driver then must deallocate this claim
and reset the field together with clearing the Allocation field. While DeallocationRequested is set, no new consumers
may be added to ReservedFor. */
  @K8sDslMarker var deallocationRequested: Boolean?
  /** DriverName is a copy of the driver name from the ResourceClass at the time when allocation started. */
  @K8sDslMarker var driverName: String?
  /** ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim
which is not reserved for that Pod will not be started. There can be at most 32 such reservations. This may get
increased in the future, but not reduced. */
  val reservedFor: List<ResourceClaimConsumerReference_resource_k8s_io_v1alpha2>?
}