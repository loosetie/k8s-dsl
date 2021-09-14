package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface TopologySelectorLabelRequirement_core_v1_k8s1_20: K8sManifest {
  /** The label key that the selector applies to. */
  @K8sDslMarker var key: String?
  /** An array of string values. One value must match the label to be selected. Each entry in Values is ORed. */
  @K8sDslMarker var values: List<String>?
}