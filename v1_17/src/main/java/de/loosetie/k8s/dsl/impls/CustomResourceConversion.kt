package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("strategy", "webhook")
class CustomResourceConversion_apiextensions_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceConversion_apiextensions_k8s_io_v1, HasParent {
  override var strategy: String? = null
  override var webhook: WebhookConversion_apiextensions_k8s_io_v1? = null
}