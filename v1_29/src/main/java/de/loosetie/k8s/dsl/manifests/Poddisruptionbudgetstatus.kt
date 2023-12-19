package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Poddisruptionbudgetstatus_policy_v1: K8sManifest {
  /** Conditions contain conditions for PDB. The disruption controller sets the DisruptionAllowed condition. The following are
known values for the reason field (additional reasons could be added in the future): - SyncFailed: The controller
encountered an error and wasn't able to compute the number of allowed disruptions. Therefore no disruptions are allowed
and the status of the condition will be False. - InsufficientPods: The number of pods are either at or below the number
required by the PodDisruptionBudget. No disruptions are allowed and the status of the condition will be False. -
SufficientPods: There are more pods than required by the PodDisruptionBudget. The condition will be True, and the number
of allowed disruptions are provided by the disruptionsAllowed property. */
  val conditions: List<Condition_meta_v1>?
  /** current number of healthy pods */
  @K8sDslMarker var currentHealthy: Int?
  /** minimum desired number of healthy pods */
  @K8sDslMarker var desiredHealthy: Int?
  /** DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource
handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time
when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been
marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the
API server processed the eviction request. If the deletion didn't occur and a pod is still there it will be removed from
the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be
empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions. */
  @K8sDslMarker var disruptedPods: Any?
  /** Number of pod disruptions that are currently allowed. */
  @K8sDslMarker var disruptionsAllowed: Int?
  /** total number of pods counted by this disruption budget */
  @K8sDslMarker var expectedPods: Int?
  /** Most recent generation observed when updating this PDB status. DisruptionsAllowed and other status information is valid
only if observedGeneration equals to PDB's object generation. */
  @K8sDslMarker var observedGeneration: Int?
}