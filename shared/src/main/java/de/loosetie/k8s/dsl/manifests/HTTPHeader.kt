package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface HTTPHeader_core_v1_k8s1_16: K8sManifest {
  /** The header field name */
  @K8sDslMarker var name: String?
  /** The header field value */
  @K8sDslMarker var value: String?
}      
typealias HTTPHeader_core_v1_k8s1_17 = HTTPHeader_core_v1_k8s1_16       
typealias HTTPHeader_core_v1_k8s1_18 = HTTPHeader_core_v1_k8s1_17       
typealias HTTPHeader_core_v1_k8s1_19 = HTTPHeader_core_v1_k8s1_18       
typealias HTTPHeader_core_v1_k8s1_20 = HTTPHeader_core_v1_k8s1_19       
typealias HTTPHeader_core_v1_k8s1_21 = HTTPHeader_core_v1_k8s1_20 