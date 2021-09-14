package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "allowVolumeExpansion", "allowedTopologies", "mountOptions", "parameters", "provisioner", "reclaimPolicy", "volumeBindingMode")
class StorageClass_storage_k8s_io_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StorageClass_storage_k8s_io_v1_k8s1_18, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_18
  override var allowVolumeExpansion: Boolean? = null
  override var allowedTopologies: List<TopologySelectorTerm_core_v1_k8s1_18>? = null
  override var mountOptions: List<String>? = null
  override var parameters: Any? = null
  override var provisioner: String? = null
  override var reclaimPolicy: String? = null
  override var volumeBindingMode: String? = null
}