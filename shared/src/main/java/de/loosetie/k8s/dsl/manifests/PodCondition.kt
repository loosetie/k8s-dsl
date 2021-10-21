package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface PodCondition_core_v1_k8s1_16: K8sManifest {
  /** Last time we probed the condition. */
  val lastProbeTime: Time_meta_v1_k8s1_16?
  /** Last time the condition transitioned from one status to another. */
  val lastTransitionTime: Time_meta_v1_k8s1_16?
  /** Human-readable message indicating details about last transition. */
  @K8sDslMarker var message: String?
  /** Unique, one-word, CamelCase reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** Status is the status of the condition. Can be True, False, Unknown. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions */
  @K8sDslMarker var status: String?
  /** Type is the type of the condition. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions */
  @K8sDslMarker var type: String?
}      
typealias PodCondition_core_v1_k8s1_17 = PodCondition_core_v1_k8s1_16       
typealias PodCondition_core_v1_k8s1_18 = PodCondition_core_v1_k8s1_17       
typealias PodCondition_core_v1_k8s1_19 = PodCondition_core_v1_k8s1_18       
typealias PodCondition_core_v1_k8s1_20 = PodCondition_core_v1_k8s1_19       
typealias PodCondition_core_v1_k8s1_21 = PodCondition_core_v1_k8s1_20 