package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "code", "details", "message", "reason", "status")
class Status_meta_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Status_meta_v1_k8s1_16, HasParent {
  override lateinit var metadata: ListMeta_meta_v1_k8s1_16
  override var code: Int? = null
  override var details: StatusDetails_meta_v1_k8s1_16? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
}
typealias Status_meta_v1_k8s1_17Impl = Status_meta_v1_k8s1_16Impl
typealias Status_meta_v1_k8s1_18Impl = Status_meta_v1_k8s1_17Impl
typealias Status_meta_v1_k8s1_19Impl = Status_meta_v1_k8s1_18Impl
typealias Status_meta_v1_k8s1_20Impl = Status_meta_v1_k8s1_19Impl
typealias Status_meta_v1_k8s1_21Impl = Status_meta_v1_k8s1_20Impl