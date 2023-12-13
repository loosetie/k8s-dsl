package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface SELinuxOptions_core_v1: K8sManifest {
  /** Level is SELinux level label that applies to the container. */
  @K8sDslMarker var level: String?
  /** Role is a SELinux role label that applies to the container. */
  @K8sDslMarker var role: String?
  /** Type is a SELinux type label that applies to the container. */
  @K8sDslMarker var type: String?
  /** User is a SELinux user label that applies to the container. */
  @K8sDslMarker var user: String?
}