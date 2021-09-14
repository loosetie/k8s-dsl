package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ScopedResourceSelectorRequirement_core_v1_k8s1_19: K8sManifest {
  /** Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. */
  @K8sDslMarker var operator: String?
  /** The name of the scope that the selector applies to. */
  @K8sDslMarker var scopeName: String?
  /** An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists
or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch. */
  @K8sDslMarker var values: List<String>?
}