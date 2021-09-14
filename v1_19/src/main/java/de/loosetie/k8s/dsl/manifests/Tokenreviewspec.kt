package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Tokenreviewspec_authentication_k8s_io_v1_k8s1_19: K8sManifest {
  /** Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware
token authenticators will verify that the token was intended for at least one of the audiences in this list. If no
audiences are provided, the audience will default to the audience of the Kubernetes apiserver. */
  @K8sDslMarker var audiences: List<String>?
  /** Token is the opaque bearer token. */
  @K8sDslMarker var token: String?
}