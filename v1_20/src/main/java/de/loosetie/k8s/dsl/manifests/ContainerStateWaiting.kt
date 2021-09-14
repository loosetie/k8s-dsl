package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ContainerStateWaiting_core_v1_k8s1_20: K8sManifest {
  /** Message regarding why the container is not yet running. */
  @K8sDslMarker var message: String?
  /** (brief) reason the container is not yet running. */
  @K8sDslMarker var reason: String?
}