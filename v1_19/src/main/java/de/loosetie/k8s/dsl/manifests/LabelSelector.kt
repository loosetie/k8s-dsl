package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface LabelSelector_meta_v1_k8s1_19: K8sManifest {
  /** matchExpressions is a list of label selector requirements. The requirements are ANDed. */
  val matchExpressions: List<LabelSelectorRequirement_meta_v1_k8s1_19>?
  /** matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of
matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The
requirements are ANDed. */
  @K8sDslMarker var matchLabels: Any?
}