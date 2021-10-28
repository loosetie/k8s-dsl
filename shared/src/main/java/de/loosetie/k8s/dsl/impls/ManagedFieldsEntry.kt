package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "fieldsType", "fieldsV1", "manager", "operation", "time")
class ManagedFieldsEntry_meta_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ManagedFieldsEntry_meta_v1_k8s1_16, HasParent {
  override var apiVersion: String? = null
  override var fieldsType: String? = null
  override var fieldsV1: FieldsV1_meta_v1_k8s1_16? = null
  override var manager: String? = null
  override var operation: String? = null
  override var time: Time_meta_v1_k8s1_16? = null
}
typealias ManagedFieldsEntry_meta_v1_k8s1_17Impl = ManagedFieldsEntry_meta_v1_k8s1_16Impl
typealias ManagedFieldsEntry_meta_v1_k8s1_18Impl = ManagedFieldsEntry_meta_v1_k8s1_17Impl
typealias ManagedFieldsEntry_meta_v1_k8s1_19Impl = ManagedFieldsEntry_meta_v1_k8s1_18Impl
typealias ManagedFieldsEntry_meta_v1_k8s1_20Impl = ManagedFieldsEntry_meta_v1_k8s1_19Impl
typealias ManagedFieldsEntry_meta_v1_k8s1_21Impl = ManagedFieldsEntry_meta_v1_k8s1_20Impl