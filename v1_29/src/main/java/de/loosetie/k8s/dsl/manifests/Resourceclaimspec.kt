package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Resourceclaimspec_resource_k8s_io_v1alpha2: K8sManifest {
  /** Allocation can start immediately or when a Pod wants to use the resource. "WaitForFirstConsumer" is the default. */
  @K8sDslMarker var allocationMode: String?
  /** ParametersRef references a separate object with arbitrary parameters that will be used by the driver when allocating a
resource for the claim. The object must be in the same namespace as the ResourceClaim. */
  val parametersRef: ResourceClaimParametersReference_resource_k8s_io_v1alpha2?
  /** ResourceClassName references the driver and additional parameters via the name of a ResourceClass that was created as
part of the driver deployment. */
  @K8sDslMarker var resourceClassName: String?
}