package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "code", "details", "message", "reason", "status")
class Status_meta_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Status_meta_v1_k8s1_18, HasParent {
  override lateinit var metadata: ListMeta_meta_v1_k8s1_18
  override var code: Int? = null
  override var details: StatusDetails_meta_v1_k8s1_18? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
}