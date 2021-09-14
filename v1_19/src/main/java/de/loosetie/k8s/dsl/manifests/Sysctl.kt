package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Sysctl_core_v1_k8s1_19: K8sManifest {
  /** Name of a property to set */
  @K8sDslMarker var name: String?
  /** Value of a property to set */
  @K8sDslMarker var value: String?
}