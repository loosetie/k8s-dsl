package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface PreferredSchedulingTerm_core_v1_k8s1_16: K8sManifest {
  /** A node selector term, associated with the corresponding weight. */
  val preference: NodeSelectorTerm_core_v1_k8s1_16?
  /** Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100. */
  @K8sDslMarker var weight: Int?
}      
typealias PreferredSchedulingTerm_core_v1_k8s1_17 = PreferredSchedulingTerm_core_v1_k8s1_16       
typealias PreferredSchedulingTerm_core_v1_k8s1_18 = PreferredSchedulingTerm_core_v1_k8s1_17       
typealias PreferredSchedulingTerm_core_v1_k8s1_19 = PreferredSchedulingTerm_core_v1_k8s1_18       
typealias PreferredSchedulingTerm_core_v1_k8s1_20 = PreferredSchedulingTerm_core_v1_k8s1_19       
typealias PreferredSchedulingTerm_core_v1_k8s1_21 = PreferredSchedulingTerm_core_v1_k8s1_20 