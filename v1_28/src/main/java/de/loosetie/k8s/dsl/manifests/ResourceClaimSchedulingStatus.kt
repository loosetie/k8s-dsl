package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ResourceClaimSchedulingStatus_resource_k8s_io_v1alpha2: K8sManifest {
  /** Name matches the pod.spec.resourceClaims[`*`].Name field. */
  @K8sDslMarker var name: String?
  /** UnsuitableNodes lists nodes that the ResourceClaim cannot be allocated for. The size of this field is limited to 128,
the same as for PodSchedulingSpec.PotentialNodes. This may get increased in the future, but not reduced. */
  @K8sDslMarker var unsuitableNodes: List<String>?
}