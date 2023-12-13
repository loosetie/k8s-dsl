package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ParentReference_networking_k8s_io_v1alpha1: K8sManifest {
  /** Namespace is the namespace of the object being referenced. */
  @K8sDslMarker var namespace: String?
  /** Name is the name of the object being referenced. */
  @K8sDslMarker var name: String?
  /** Group is the group of the object being referenced. */
  @K8sDslMarker var group: String?
  /** Resource is the resource of the object being referenced. */
  @K8sDslMarker var resource: String?
  /** UID is the uid of the object being referenced. */
  @K8sDslMarker var uid: String?
}