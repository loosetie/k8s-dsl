package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ClaimSource_core_v1: K8sManifest {
  /** ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod. */
  @K8sDslMarker var resourceClaimName: String?
  /** ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod. The template
will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim
will also be deleted. The pod name and resource name, along with a generated component, will be used to form a unique
name for the ResourceClaim, which will be recorded in pod.status.resourceClaimStatuses. This field is immutable and no
changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim. */
  @K8sDslMarker var resourceClaimTemplateName: String?
}