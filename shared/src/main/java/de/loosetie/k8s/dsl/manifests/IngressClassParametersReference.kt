package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface IngressClassParametersReference_networking_k8s_io_v1_k8s1_21: K8sManifest {
  /** Kind is the type of resource being referenced. */
  @K8sDslMarker var kind: String?
  /** Namespace is the namespace of the resource being referenced. This field is required when scope is set to "Namespace" and
must be unset when scope is set to "Cluster". */
  @K8sDslMarker var namespace: String?
  /** Name is the name of resource being referenced. */
  @K8sDslMarker var name: String?
  /** APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the
core API group. For any other third-party types, APIGroup is required. */
  @K8sDslMarker var apiGroup: String?
  /** Scope represents if this refers to a cluster or namespace scoped resource. This may be set to "Cluster" (default) or
"Namespace". Field can be enabled with IngressClassNamespacedParams feature gate. */
  @K8sDslMarker var scope: String?
}