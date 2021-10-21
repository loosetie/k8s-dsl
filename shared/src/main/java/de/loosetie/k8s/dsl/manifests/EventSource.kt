package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface EventSource_core_v1_k8s1_16: K8sManifest {
  /** Component from which the event is generated. */
  @K8sDslMarker var component: String?
  /** Node name on which the event is generated. */
  @K8sDslMarker var host: String?
}      
typealias EventSource_core_v1_k8s1_17 = EventSource_core_v1_k8s1_16       
typealias EventSource_core_v1_k8s1_18 = EventSource_core_v1_k8s1_17       
typealias EventSource_core_v1_k8s1_19 = EventSource_core_v1_k8s1_18       
typealias EventSource_core_v1_k8s1_20 = EventSource_core_v1_k8s1_19       
typealias EventSource_core_v1_k8s1_21 = EventSource_core_v1_k8s1_20 