package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Resourcequotastatus_core_v1_k8s1_20: K8sManifest {
  /** Hard is the set of enforced hard limits for each named resource. More info:
https://kubernetes.io/docs/concepts/policy/resource-quotas/ */
  @K8sDslMarker var hard: Any?
  /** Used is the current observed total usage of the resource in the namespace. */
  @K8sDslMarker var used: Any?
}