package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Deploymentstatus_apps_v1: K8sManifest {
  /** Total number of available pods (ready for at least minReadySeconds) targeted by this deployment. */
  @K8sDslMarker var availableReplicas: Int?
  /** Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance
mechanism when it needs to create the name for the newest ReplicaSet. */
  @K8sDslMarker var collisionCount: Int?
  /** Represents the latest available observations of a deployment's current state. */
  val conditions: List<DeploymentCondition_apps_v1>?
  /** The generation observed by the deployment controller. */
  @K8sDslMarker var observedGeneration: Int?
  /** readyReplicas is the number of pods targeted by this Deployment with a Ready Condition. */
  @K8sDslMarker var readyReplicas: Int?
  /** Total number of non-terminated pods targeted by this deployment (their labels match the selector). */
  @K8sDslMarker var replicas: Int?
  /** Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required
for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or
pods that still have not been created. */
  @K8sDslMarker var unavailableReplicas: Int?
  /** Total number of non-terminated pods targeted by this deployment that have the desired template spec. */
  @K8sDslMarker var updatedReplicas: Int?
}