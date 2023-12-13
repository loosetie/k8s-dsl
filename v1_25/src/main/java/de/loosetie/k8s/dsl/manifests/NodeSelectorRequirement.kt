package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NodeSelectorRequirement_core_v1: K8sManifest {
  /** The label key that the selector applies to. */
  @K8sDslMarker var key: String?
  /** Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt. */
  @K8sDslMarker var operator: String?
  /** An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists
or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single
element, which will be interpreted as an integer. This array is replaced during a strategic merge patch. */
  @K8sDslMarker var values: List<String>?
}