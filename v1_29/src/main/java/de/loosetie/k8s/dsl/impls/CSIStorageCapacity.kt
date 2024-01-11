package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "capacity", "maximumVolumeSize", "nodeTopology", "storageClassName")
open class CSIStorageCapacity_storage_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
  @JsonIgnore
  override val helmVariables: MutableMap<String, String> = mutableMapOf(),
      
)
: CSIStorageCapacity_storage_k8s_io_v1, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1
  override var capacity: Quantity_core_resource? = null
  override var maximumVolumeSize: Quantity_core_resource? = null
  override var nodeTopology: LabelSelector_meta_v1? = null
  override var storageClassName: String? = null
}