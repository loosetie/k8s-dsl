package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Resourcequotaspec_core_v1_k8s1_21: K8sManifest {
  /** hard is the set of desired hard limits for each named resource. More info:
https://kubernetes.io/docs/concepts/policy/resource-quotas/ */
  @K8sDslMarker var hard: Any?
  /** scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed
using ScopeSelectorOperator in combination with possible values. For a resource to match, both scopes AND scopeSelector
(if specified in spec), must be matched. */
  val scopeSelector: ScopeSelector_core_v1_k8s1_21?
  /** A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects. */
  @K8sDslMarker var scopes: List<String>?
}