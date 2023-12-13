package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("message", "messageExpression", "rule")
class ValidationRule_apiextensions_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ValidationRule_apiextensions_k8s_io_v1, HasParent {
  override var message: String? = null
  override var messageExpression: String? = null
  override var rule: String? = null
}