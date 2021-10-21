package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Replicasetstatus_apps_v1_k8s1_16: K8sManifest {
  /** The number of available replicas (ready for at least minReadySeconds) for this replica set. */
  @K8sDslMarker var availableReplicas: Int?
  /** Represents the latest available observations of a replica set's current state. */
  val conditions: List<ReplicaSetCondition_apps_v1_k8s1_16>?
  /** The number of pods that have labels matching the labels of the pod template of the replicaset. */
  @K8sDslMarker var fullyLabeledReplicas: Int?
  /** ObservedGeneration reflects the generation of the most recently observed ReplicaSet. */
  @K8sDslMarker var observedGeneration: Int?
  /** The number of ready replicas for this replica set. */
  @K8sDslMarker var readyReplicas: Int?
  /** Replicas is the most recently oberved number of replicas. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller */
  @K8sDslMarker var replicas: Int?
}      
typealias Replicasetstatus_apps_v1_k8s1_17 = Replicasetstatus_apps_v1_k8s1_16       
typealias Replicasetstatus_apps_v1_k8s1_18 = Replicasetstatus_apps_v1_k8s1_17       
typealias Replicasetstatus_apps_v1_k8s1_19 = Replicasetstatus_apps_v1_k8s1_18       
typealias Replicasetstatus_apps_v1_k8s1_20 = Replicasetstatus_apps_v1_k8s1_19       
typealias Replicasetstatus_apps_v1_k8s1_21 = Replicasetstatus_apps_v1_k8s1_20 