package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Namespacespec_core_v1_k8s1_16: K8sManifest {
  /** Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info:
https://kubernetes.io/docs/tasks/administer-cluster/namespaces/ */
  @K8sDslMarker var finalizers: List<String>?
}      
typealias Namespacespec_core_v1_k8s1_17 = Namespacespec_core_v1_k8s1_16       
typealias Namespacespec_core_v1_k8s1_18 = Namespacespec_core_v1_k8s1_17       
typealias Namespacespec_core_v1_k8s1_19 = Namespacespec_core_v1_k8s1_18       
typealias Namespacespec_core_v1_k8s1_20 = Namespacespec_core_v1_k8s1_19       
typealias Namespacespec_core_v1_k8s1_21 = Namespacespec_core_v1_k8s1_20 