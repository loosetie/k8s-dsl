package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface SecretReference_core_v1_k8s1_19: K8sManifest {
  /** Namespace defines the space within which the secret name must be unique. */
  @K8sDslMarker var namespace: String?
  /** Name is unique within a namespace to reference a secret resource. */
  @K8sDslMarker var name: String?
}