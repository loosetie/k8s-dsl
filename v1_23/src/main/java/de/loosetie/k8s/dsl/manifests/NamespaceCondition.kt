package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NamespaceCondition_core_v1: K8sManifest {
  /**  */
  val lastTransitionTime: Time_meta_v1?
  /**  */
  @K8sDslMarker var message: String?
  /**  */
  @K8sDslMarker var reason: String?
  /** Status of the condition, one of True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type of namespace controller condition. Possible enum values: - `"NamespaceContentRemaining"` contains information about
resources remaining in a namespace. - `"NamespaceDeletionContentFailure"` contains information about namespace deleter
errors during deletion of resources. - `"NamespaceDeletionDiscoveryFailure"` contains information about namespace
deleter errors during resource discovery. - `"NamespaceDeletionGroupVersionParsingFailure"` contains information about
namespace deleter errors parsing GV for legacy types. - `"NamespaceFinalizersRemaining"` contains information about
which finalizers are on resources remaining in a namespace. */
  @K8sDslMarker var type: String?
}