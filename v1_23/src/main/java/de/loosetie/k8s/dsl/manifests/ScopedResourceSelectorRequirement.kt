package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ScopedResourceSelectorRequirement_core_v1: K8sManifest {
  /** Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Possible enum
values: - `"DoesNotExist"` - `"Exists"` - `"In"` - `"NotIn"` */
  @K8sDslMarker var operator: String?
  /** The name of the scope that the selector applies to. Possible enum values: - `"BestEffort"` Match all pod objects that
have best effort quality of service - `"CrossNamespacePodAffinity"` Match all pod objects that have cross-namespace pod
(anti)affinity mentioned. This is a beta feature enabled by the PodAffinityNamespaceSelector feature flag. -
`"NotBestEffort"` Match all pod objects that do not have best effort quality of service - `"NotTerminating"` Match all
pod objects where spec.activeDeadlineSeconds is nil - `"PriorityClass"` Match all pod objects that have priority class
mentioned - `"Terminating"` Match all pod objects where spec.activeDeadlineSeconds >=0 */
  @K8sDslMarker var scopeName: String?
  /** An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists
or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch. */
  @K8sDslMarker var values: List<String>?
}