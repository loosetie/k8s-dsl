package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface GroupVersionForDiscovery_meta_v1_k8s1_19: K8sManifest {
  /** groupVersion specifies the API group and version in the form "group/version" */
  @K8sDslMarker var groupVersion: String?
  /** version specifies the version in the form of "version". This is to save the clients the trouble of splitting the
GroupVersion. */
  @K8sDslMarker var version: String?
}