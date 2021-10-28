package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("kind", "name", "causes", "group", "retryAfterSeconds", "uid")
class StatusDetails_meta_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StatusDetails_meta_v1_k8s1_16, HasParent {
  override var kind: String? = null
  override var name: String? = null
  override var causes: List<StatusCause_meta_v1_k8s1_16>? = null
  override var group: String? = null
  override var retryAfterSeconds: Int? = null
  override var uid: String? = null
}
typealias StatusDetails_meta_v1_k8s1_17Impl = StatusDetails_meta_v1_k8s1_16Impl
typealias StatusDetails_meta_v1_k8s1_18Impl = StatusDetails_meta_v1_k8s1_17Impl
typealias StatusDetails_meta_v1_k8s1_19Impl = StatusDetails_meta_v1_k8s1_18Impl
typealias StatusDetails_meta_v1_k8s1_20Impl = StatusDetails_meta_v1_k8s1_19Impl
typealias StatusDetails_meta_v1_k8s1_21Impl = StatusDetails_meta_v1_k8s1_20Impl