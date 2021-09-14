package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "allocatable", "nodeID", "topologyKeys")
class CSINodeDriver_storage_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSINodeDriver_storage_k8s_io_v1_k8s1_21, HasParent {
  override var name: String? = null
  override var allocatable: VolumeNodeResources_storage_k8s_io_v1_k8s1_21? = null
  override var nodeID: String? = null
  override var topologyKeys: List<String>? = null
}