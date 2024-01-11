package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "code", "details", "message", "reason", "status")
open class Status_meta_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
  @JsonIgnore
  override val helmVariables: MutableMap<String, String> = mutableMapOf(),
      
)
: Status_meta_v1, HasParent {
  override lateinit var metadata: ListMeta_meta_v1
  override var code: Int? = null
  override var details: StatusDetails_meta_v1? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
}