package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ConfigMapEnvSource_core_v1: K8sManifest {
  /** Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** Specify whether the ConfigMap must be defined */
  @K8sDslMarker var optional: Boolean?
}