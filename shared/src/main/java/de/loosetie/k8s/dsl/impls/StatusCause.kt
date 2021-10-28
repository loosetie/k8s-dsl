package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("field", "message", "reason")
class StatusCause_meta_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StatusCause_meta_v1_k8s1_16, HasParent {
  override var field: String? = null
  override var message: String? = null
  override var reason: String? = null
}
typealias StatusCause_meta_v1_k8s1_17Impl = StatusCause_meta_v1_k8s1_16Impl
typealias StatusCause_meta_v1_k8s1_18Impl = StatusCause_meta_v1_k8s1_17Impl
typealias StatusCause_meta_v1_k8s1_19Impl = StatusCause_meta_v1_k8s1_18Impl
typealias StatusCause_meta_v1_k8s1_20Impl = StatusCause_meta_v1_k8s1_19Impl
typealias StatusCause_meta_v1_k8s1_21Impl = StatusCause_meta_v1_k8s1_20Impl