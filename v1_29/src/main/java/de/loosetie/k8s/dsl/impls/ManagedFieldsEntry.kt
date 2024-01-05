package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "fieldsType", "fieldsV1", "manager", "operation", "subresource", "time")
class ManagedFieldsEntry_meta_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: ManagedFieldsEntry_meta_v1, HasParent {
  override var apiVersion: String? = null
  override var fieldsType: String? = null
  override var fieldsV1: FieldsV1_meta_v1? = null
  override var manager: String? = null
  override var operation: String? = null
  override var subresource: String? = null
  override var time: Time_meta_v1? = null
}