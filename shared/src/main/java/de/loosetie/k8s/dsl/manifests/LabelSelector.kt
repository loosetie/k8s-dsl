package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface LabelSelector_meta_v1_k8s1_16: K8sManifest {
  /** matchExpressions is a list of label selector requirements. The requirements are ANDed. */
  val matchExpressions: List<LabelSelectorRequirement_meta_v1_k8s1_16>?
  /** matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of
matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The
requirements are ANDed. */
  @K8sDslMarker var matchLabels: Map<String, String>?
}      
typealias LabelSelector_meta_v1_k8s1_17 = LabelSelector_meta_v1_k8s1_16       
typealias LabelSelector_meta_v1_k8s1_18 = LabelSelector_meta_v1_k8s1_17       
typealias LabelSelector_meta_v1_k8s1_19 = LabelSelector_meta_v1_k8s1_18       
typealias LabelSelector_meta_v1_k8s1_20 = LabelSelector_meta_v1_k8s1_19       
typealias LabelSelector_meta_v1_k8s1_21 = LabelSelector_meta_v1_k8s1_20 