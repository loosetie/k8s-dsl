package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "allowVolumeExpansion", "allowedTopologies", "mountOptions", "parameters", "provisioner", "reclaimPolicy", "volumeBindingMode")
open class StorageClass_storage_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
  @JsonIgnore
  override val helmVariables: MutableMap<String, String> = mutableMapOf(),
      
)
: StorageClass_storage_k8s_io_v1, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1
  override var allowVolumeExpansion: Boolean? = null
  override var allowedTopologies: List<TopologySelectorTerm_core_v1>? = null
  override var mountOptions: List<String>? = null
  override var parameters: Any? = null
  override var provisioner: String? = null
  override var reclaimPolicy: String? = null
  override var volumeBindingMode: String? = null
}