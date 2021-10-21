package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface TopologySelectorTerm_core_v1_k8s1_16: K8sManifest {
  /** A list of topology selector requirements by labels. */
  val matchLabelExpressions: List<TopologySelectorLabelRequirement_core_v1_k8s1_16>?
}      
typealias TopologySelectorTerm_core_v1_k8s1_17 = TopologySelectorTerm_core_v1_k8s1_16       
typealias TopologySelectorTerm_core_v1_k8s1_18 = TopologySelectorTerm_core_v1_k8s1_17       
typealias TopologySelectorTerm_core_v1_k8s1_19 = TopologySelectorTerm_core_v1_k8s1_18       
typealias TopologySelectorTerm_core_v1_k8s1_20 = TopologySelectorTerm_core_v1_k8s1_19       
typealias TopologySelectorTerm_core_v1_k8s1_21 = TopologySelectorTerm_core_v1_k8s1_20 