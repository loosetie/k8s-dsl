package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Namespacestatus_core_v1: K8sManifest {
  /** Represents the latest available observations of a namespace's current state. */
  val conditions: List<NamespaceCondition_core_v1>?
  /** Phase is the current lifecycle phase of the namespace. More info:
https://kubernetes.io/docs/tasks/administer-cluster/namespaces/ Possible enum values: - `"Active"` means the namespace
is available for use in the system - `"Terminating"` means the namespace is undergoing graceful termination */
  @K8sDslMarker var phase: String?
}