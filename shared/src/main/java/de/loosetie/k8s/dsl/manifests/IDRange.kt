package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface IDRange_policy_v1beta1_k8s1_16: K8sManifest {
  /** max is the end of the range, inclusive. */
  @K8sDslMarker var max: Int?
  /** min is the start of the range, inclusive. */
  @K8sDslMarker var min: Int?
}      
typealias IDRange_policy_v1beta1_k8s1_17 = IDRange_policy_v1beta1_k8s1_16       
typealias IDRange_policy_v1beta1_k8s1_18 = IDRange_policy_v1beta1_k8s1_17       
typealias IDRange_policy_v1beta1_k8s1_19 = IDRange_policy_v1beta1_k8s1_18       
typealias IDRange_policy_v1beta1_k8s1_20 = IDRange_policy_v1beta1_k8s1_19       
typealias IDRange_policy_v1beta1_k8s1_21 = IDRange_policy_v1beta1_k8s1_20 