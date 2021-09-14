package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_20: K8sManifest {
  /** A collection of paths that map requests to backends. */
  val paths: List<HTTPIngressPath_networking_k8s_io_v1_k8s1_20>?
}