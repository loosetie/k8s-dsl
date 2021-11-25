package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "allowVolumeExpansion", "allowedTopologies", "mountOptions", "parameters", "provisioner", "reclaimPolicy", "volumeBindingMode")
class StorageClass_storage_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StorageClass_storage_k8s_io_v1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override var allowVolumeExpansion: Boolean? = null
  override var allowedTopologies: List<TopologySelectorTerm_core_v1_k8s1_16>? = null
  override var mountOptions: List<String>? = null
  override var parameters: Map<String, String>? = null
  override var provisioner: String? = null
  override var reclaimPolicy: String? = null
  override var volumeBindingMode: String? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "allowVolumeExpansion", "allowedTopologies", "mountOptions", "parameters", "provisioner", "reclaimPolicy", "volumeBindingMode")
class StorageClass_storage_k8s_io_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StorageClass_storage_k8s_io_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override var allowVolumeExpansion: Boolean? = null
  override var allowedTopologies: List<TopologySelectorTerm_core_v1_k8s1_17>? = null
  override var mountOptions: List<String>? = null
  override var parameters: Map<String, String>? = null
  override var provisioner: String? = null
  override var reclaimPolicy: String? = null
  override var volumeBindingMode: String? = null
}
typealias StorageClass_storage_k8s_io_v1_k8s1_18Impl = StorageClass_storage_k8s_io_v1_k8s1_17Impl
typealias StorageClass_storage_k8s_io_v1_k8s1_19Impl = StorageClass_storage_k8s_io_v1_k8s1_18Impl
typealias StorageClass_storage_k8s_io_v1_k8s1_20Impl = StorageClass_storage_k8s_io_v1_k8s1_19Impl
typealias StorageClass_storage_k8s_io_v1_k8s1_21Impl = StorageClass_storage_k8s_io_v1_k8s1_20Impl