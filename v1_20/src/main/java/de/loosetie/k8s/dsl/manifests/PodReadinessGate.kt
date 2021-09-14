package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PodReadinessGate_core_v1_k8s1_20: K8sManifest {
  /** ConditionType refers to a condition in the pod's condition list with matching type. */
  @K8sDslMarker var conditionType: String?
}