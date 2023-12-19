package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Namespacespec_core_v1: K8sManifest {
  /** Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info:
https://kubernetes.io/docs/tasks/administer-cluster/namespaces/ */
  @K8sDslMarker var finalizers: List<String>?
}