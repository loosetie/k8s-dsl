package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface LabelSelectorRequirement_meta_v1_k8s1_19: K8sManifest {
  /** key is the label key that the selector applies to. */
  @K8sDslMarker var key: String?
  /** operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist. */
  @K8sDslMarker var operator: String?
  /** values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator
is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch. */
  @K8sDslMarker var values: List<String>?
}