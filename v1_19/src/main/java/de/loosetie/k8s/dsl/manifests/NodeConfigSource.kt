package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NodeConfigSource_core_v1_k8s1_19: K8sManifest {
  /** ConfigMap is a reference to a Node's ConfigMap */
  val configMap: ConfigMapNodeConfigSource_core_v1_k8s1_19?
}