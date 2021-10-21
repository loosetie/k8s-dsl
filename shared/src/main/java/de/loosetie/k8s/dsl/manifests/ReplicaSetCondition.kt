package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ReplicaSetCondition_apps_v1_k8s1_16: K8sManifest {
  /** The last time the condition transitioned from one status to another. */
  val lastTransitionTime: Time_meta_v1_k8s1_16?
  /** A human readable message indicating details about the transition. */
  @K8sDslMarker var message: String?
  /** The reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** Status of the condition, one of True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type of replica set condition. */
  @K8sDslMarker var type: String?
}      
typealias ReplicaSetCondition_apps_v1_k8s1_17 = ReplicaSetCondition_apps_v1_k8s1_16       
typealias ReplicaSetCondition_apps_v1_k8s1_18 = ReplicaSetCondition_apps_v1_k8s1_17       
typealias ReplicaSetCondition_apps_v1_k8s1_19 = ReplicaSetCondition_apps_v1_k8s1_18       
typealias ReplicaSetCondition_apps_v1_k8s1_20 = ReplicaSetCondition_apps_v1_k8s1_19       
typealias ReplicaSetCondition_apps_v1_k8s1_21 = ReplicaSetCondition_apps_v1_k8s1_20 