package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface AllowedFlexVolume_policy_v1beta1: K8sManifest {
  /** driver is the name of the Flexvolume driver. */
  @K8sDslMarker var driver: String?
}