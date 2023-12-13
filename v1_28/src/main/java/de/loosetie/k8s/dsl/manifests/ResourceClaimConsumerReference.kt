package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ResourceClaimConsumerReference_resource_k8s_io_v1alpha2: K8sManifest {
  /** Name is the name of resource being referenced. */
  @K8sDslMarker var name: String?
  /** APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the
APIVersion that is used when creating the resources. */
  @K8sDslMarker var apiGroup: String?
  /** Resource is the type of resource being referenced, for example "pods". */
  @K8sDslMarker var resource: String?
  /** UID identifies exactly one incarnation of the resource. */
  @K8sDslMarker var uid: String?
}