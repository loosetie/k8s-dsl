package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Podschedulingcontextstatus_resource_k8s_io_v1alpha2: K8sManifest {
  /** ResourceClaims describes resource availability for each pod.spec.resourceClaim entry where the corresponding
ResourceClaim uses "WaitForFirstConsumer" allocation mode. */
  val resourceClaims: List<ResourceClaimSchedulingStatus_resource_k8s_io_v1alpha2>?
}