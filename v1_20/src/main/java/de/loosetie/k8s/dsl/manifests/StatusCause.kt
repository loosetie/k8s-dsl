package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface StatusCause_meta_v1_k8s1_20: K8sManifest {
  /** The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix
notation for nested attributes. Arrays are zero-indexed. Fields may appear more than once in an array of causes due to
fields having multiple errors. Optional. Examples: "name" - the field "name" on the current resource "items[0].name" -
the field "name" on the first array entry in "items" */
  @K8sDslMarker var field: String?
  /** A human-readable description of the cause of the error. This field may be presented as-is to a reader. */
  @K8sDslMarker var message: String?
  /** A machine-readable description of the cause of the error. If this value is empty there is no information available. */
  @K8sDslMarker var reason: String?
}