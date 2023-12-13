package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Statefulsetstatus_apps_v1: K8sManifest {
  /** Total number of available pods (ready for at least minReadySeconds) targeted by this statefulset. */
  @K8sDslMarker var availableReplicas: Int?
  /** collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a
collision avoidance mechanism when it needs to create the name for the newest ControllerRevision. */
  @K8sDslMarker var collisionCount: Int?
  /** Represents the latest available observations of a statefulset's current state. */
  val conditions: List<StatefulSetCondition_apps_v1>?
  /** currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by
currentRevision. */
  @K8sDslMarker var currentReplicas: Int?
  /** currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence
[0,currentReplicas). */
  @K8sDslMarker var currentRevision: String?
  /** observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet's
generation, which is updated on mutation by the API Server. */
  @K8sDslMarker var observedGeneration: Int?
  /** readyReplicas is the number of pods created for this StatefulSet with a Ready Condition. */
  @K8sDslMarker var readyReplicas: Int?
  /** replicas is the number of Pods created by the StatefulSet controller. */
  @K8sDslMarker var replicas: Int?
  /** updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence
[replicas-updatedReplicas,replicas) */
  @K8sDslMarker var updateRevision: String?
  /** updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by
updateRevision. */
  @K8sDslMarker var updatedReplicas: Int?
}