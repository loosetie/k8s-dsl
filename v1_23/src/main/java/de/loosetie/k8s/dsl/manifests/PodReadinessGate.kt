package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PodReadinessGate_core_v1: K8sManifest {
  /** ConditionType refers to a condition in the pod's condition list with matching type. Possible enum values: -
`"ContainersReady"` indicates whether all containers in the pod are ready. - `"Initialized"` means that all init
containers in the pod have started successfully. - `"PodScheduled"` represents status of the scheduling process for this
pod. - `"Ready"` means the pod is able to service requests and should be added to the load balancing pools of all
matching services. */
  @K8sDslMarker var conditionType: String?
}