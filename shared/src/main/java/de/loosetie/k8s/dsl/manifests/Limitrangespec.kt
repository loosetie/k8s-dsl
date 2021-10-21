package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Limitrangespec_core_v1_k8s1_16: K8sManifest {
  /** Limits is the list of LimitRangeItem objects that are enforced. */
  val limits: List<LimitRangeItem_core_v1_k8s1_16>?
}      
typealias Limitrangespec_core_v1_k8s1_17 = Limitrangespec_core_v1_k8s1_16       
typealias Limitrangespec_core_v1_k8s1_18 = Limitrangespec_core_v1_k8s1_17       
typealias Limitrangespec_core_v1_k8s1_19 = Limitrangespec_core_v1_k8s1_18       
typealias Limitrangespec_core_v1_k8s1_20 = Limitrangespec_core_v1_k8s1_19       
typealias Limitrangespec_core_v1_k8s1_21 = Limitrangespec_core_v1_k8s1_20 