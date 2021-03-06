package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NonResourceRule_authorization_k8s_io_v1: K8sManifest {
  /** NonResourceURLs is a set of partial urls that a user should have access to. `*`s are allowed, but only as the full,
final step in the path. "`*`" means all. */
  @K8sDslMarker var nonResourceURLs: List<String>?
  /** Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options. "`*`" means
all. */
  @K8sDslMarker var verbs: List<String>?
}