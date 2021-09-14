package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NonResourceAttributes_authorization_k8s_io_v1_k8s1_18: K8sManifest {
  /** Path is the URL path of the request */
  @K8sDslMarker var path: String?
  /** Verb is the standard HTTP verb */
  @K8sDslMarker var verb: String?
}