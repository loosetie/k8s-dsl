package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface TypedObjectReference_core_v1: K8sManifest {
  /** Kind is the type of resource being referenced */
  @K8sDslMarker var kind: String?
  /** Namespace is the namespace of resource being referenced Note that when a namespace is specified, a
gateway.networking.k8s.io/ReferenceGrant object is required in the referent namespace to allow that namespace's owner to
accept the reference. See the ReferenceGrant documentation for details. (Alpha) This field requires the
CrossNamespaceVolumeDataSource feature gate to be enabled. */
  @K8sDslMarker var namespace: String?
  /** Name is the name of resource being referenced */
  @K8sDslMarker var name: String?
  /** APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the
core API group. For any other third-party types, APIGroup is required. */
  @K8sDslMarker var apiGroup: String?
}