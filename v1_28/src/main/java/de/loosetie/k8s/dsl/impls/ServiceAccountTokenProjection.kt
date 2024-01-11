package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("audience", "expirationSeconds", "path")
open class ServiceAccountTokenProjection_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: ServiceAccountTokenProjection_core_v1, HasParent {
  override var audience: String? = null
  override var expirationSeconds: Int? = null
  override var path: String? = null
}