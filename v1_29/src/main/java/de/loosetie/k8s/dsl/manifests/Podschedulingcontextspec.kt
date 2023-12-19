package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Podschedulingcontextspec_resource_k8s_io_v1alpha2: K8sManifest {
  /** PotentialNodes lists nodes where the Pod might be able to run. The size of this field is limited to 128. This is large
enough for many clusters. Larger clusters may need more attempts to find a node that suits all pending resources. This
may get increased in the future, but not reduced. */
  @K8sDslMarker var potentialNodes: List<String>?
  /** SelectedNode is the node for which allocation of ResourceClaims that are referenced by the Pod and that use
"WaitForFirstConsumer" allocation is to be attempted. */
  @K8sDslMarker var selectedNode: String?
}