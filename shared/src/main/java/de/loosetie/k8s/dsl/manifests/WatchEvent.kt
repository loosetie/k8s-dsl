package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface WatchEvent_meta_v1_k8s1_16: K8sManifest {
  /** Object is: `*` If Type is Added or Modified: the new state of the object. `*` If Type is Deleted: the state of the
object immediately before deletion. `*` If Type is Error: `*`Status is recommended; other types may make sense depending
on context. */
  // val `object`: None
  /**  */
  @K8sDslMarker var type: String?
}      
typealias WatchEvent_meta_v1_k8s1_17 = WatchEvent_meta_v1_k8s1_16       
typealias WatchEvent_meta_v1_k8s1_18 = WatchEvent_meta_v1_k8s1_17       
typealias WatchEvent_meta_v1_k8s1_19 = WatchEvent_meta_v1_k8s1_18       
typealias WatchEvent_meta_v1_k8s1_20 = WatchEvent_meta_v1_k8s1_19       
typealias WatchEvent_meta_v1_k8s1_21 = WatchEvent_meta_v1_k8s1_20 