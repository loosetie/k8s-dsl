package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("audience", "expirationSeconds", "path")
class ServiceAccountTokenProjection_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceAccountTokenProjection_core_v1_k8s1_16, HasParent {
  override var audience: String? = null
  override var expirationSeconds: Int? = null
  override var path: String? = null
}
typealias ServiceAccountTokenProjection_core_v1_k8s1_17Impl = ServiceAccountTokenProjection_core_v1_k8s1_16Impl
typealias ServiceAccountTokenProjection_core_v1_k8s1_18Impl = ServiceAccountTokenProjection_core_v1_k8s1_17Impl
typealias ServiceAccountTokenProjection_core_v1_k8s1_19Impl = ServiceAccountTokenProjection_core_v1_k8s1_18Impl
typealias ServiceAccountTokenProjection_core_v1_k8s1_20Impl = ServiceAccountTokenProjection_core_v1_k8s1_19Impl
typealias ServiceAccountTokenProjection_core_v1_k8s1_21Impl = ServiceAccountTokenProjection_core_v1_k8s1_20Impl