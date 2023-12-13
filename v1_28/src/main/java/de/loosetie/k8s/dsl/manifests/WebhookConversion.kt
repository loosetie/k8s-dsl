package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface WebhookConversion_apiextensions_k8s_io_v1: K8sManifest {
  /** clientConfig is the instructions for how to call the webhook if strategy is `Webhook`. */
  val clientConfig: WebhookClientConfig_apiextensions_k8s_io_v1?
  /** conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server
will use the first version in the list which it supports. If none of the versions specified in this list are supported
by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed
versions and does not include any versions known to the API Server, calls to the webhook will fail. */
  @K8sDslMarker var conversionReviewVersions: List<String>?
}