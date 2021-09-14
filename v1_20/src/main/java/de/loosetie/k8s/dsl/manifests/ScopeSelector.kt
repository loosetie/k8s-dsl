package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ScopeSelector_core_v1_k8s1_20: K8sManifest {
  /** A list of scope selector requirements by scope of the resources. */
  val matchExpressions: List<ScopedResourceSelectorRequirement_core_v1_k8s1_20>?
}