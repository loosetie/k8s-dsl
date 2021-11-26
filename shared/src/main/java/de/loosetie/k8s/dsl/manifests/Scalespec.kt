package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@Deprecated(message="Old api version")
@K8sDslMarker
interface Scalespec_apps_v1beta1_k8s1_17: K8sManifest {
  /** desired number of instances for the scaled object. */
  @K8sDslMarker var replicas: Int?
}