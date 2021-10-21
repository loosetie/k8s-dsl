package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ScopeSelector_core_v1_k8s1_16: K8sManifest {
  /** A list of scope selector requirements by scope of the resources. */
  val matchExpressions: List<ScopedResourceSelectorRequirement_core_v1_k8s1_16>?
}      
typealias ScopeSelector_core_v1_k8s1_17 = ScopeSelector_core_v1_k8s1_16       
typealias ScopeSelector_core_v1_k8s1_18 = ScopeSelector_core_v1_k8s1_17       
typealias ScopeSelector_core_v1_k8s1_19 = ScopeSelector_core_v1_k8s1_18       
typealias ScopeSelector_core_v1_k8s1_20 = ScopeSelector_core_v1_k8s1_19       
typealias ScopeSelector_core_v1_k8s1_21 = ScopeSelector_core_v1_k8s1_20 