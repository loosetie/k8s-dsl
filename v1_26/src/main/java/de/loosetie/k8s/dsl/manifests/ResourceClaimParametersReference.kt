package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ResourceClaimParametersReference_resource_k8s_io_v1alpha1: K8sManifest {
  /** Kind is the type of resource being referenced. This is the same value as in the parameter object's metadata, for example
"ConfigMap". */
  @K8sDslMarker var kind: String?
  /** Name is the name of resource being referenced. */
  @K8sDslMarker var name: String?
  /** APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the
APIVersion that is used when creating the resources. */
  @K8sDslMarker var apiGroup: String?
}