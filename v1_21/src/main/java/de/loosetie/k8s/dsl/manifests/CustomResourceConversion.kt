package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface CustomResourceConversion_apiextensions_k8s_io_v1_k8s1_21: K8sManifest {
  /** strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only
change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to
an external webhook to do the conversion. Additional information is needed for this option. This requires
spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set. */
  @K8sDslMarker var strategy: String?
  /** webhook describes how to call the conversion webhook. Required when `strategy` is set to `Webhook`. */
  val webhook: WebhookConversion_apiextensions_k8s_io_v1_k8s1_21?
}