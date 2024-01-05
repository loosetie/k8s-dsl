package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("clientConfig", "conversionReviewVersions")
class WebhookConversion_apiextensions_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: WebhookConversion_apiextensions_k8s_io_v1, HasParent {
  override var clientConfig: WebhookClientConfig_apiextensions_k8s_io_v1? = null
  override var conversionReviewVersions: List<String>? = null
}