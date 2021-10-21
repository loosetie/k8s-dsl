package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface HostPortRange_policy_v1beta1_k8s1_16: K8sManifest {
  /** max is the end of the range, inclusive. */
  @K8sDslMarker var max: Int?
  /** min is the start of the range, inclusive. */
  @K8sDslMarker var min: Int?
}      
typealias HostPortRange_policy_v1beta1_k8s1_17 = HostPortRange_policy_v1beta1_k8s1_16       
typealias HostPortRange_policy_v1beta1_k8s1_18 = HostPortRange_policy_v1beta1_k8s1_17       
typealias HostPortRange_policy_v1beta1_k8s1_19 = HostPortRange_policy_v1beta1_k8s1_18       
typealias HostPortRange_policy_v1beta1_k8s1_20 = HostPortRange_policy_v1beta1_k8s1_19       
typealias HostPortRange_policy_v1beta1_k8s1_21 = HostPortRange_policy_v1beta1_k8s1_20 