package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "allocatable", "nodeID", "topologyKeys")
class CSINodeDriver_storage_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSINodeDriver_storage_k8s_io_v1beta1_k8s1_16, HasParent {
  override var name: String? = null
  override var allocatable: VolumeNodeResources_storage_k8s_io_v1beta1_k8s1_16? = null
  override var nodeID: String? = null
  override var topologyKeys: List<String>? = null
}
@JsonPropertyOrder("name", "allocatable", "nodeID", "topologyKeys")
class CSINodeDriver_storage_k8s_io_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSINodeDriver_storage_k8s_io_v1_k8s1_17, HasParent {
  override var name: String? = null
  override var allocatable: VolumeNodeResources_storage_k8s_io_v1_k8s1_17? = null
  override var nodeID: String? = null
  override var topologyKeys: List<String>? = null
}


typealias CSINodeDriver_storage_k8s_io_v1_k8s1_18Impl = CSINodeDriver_storage_k8s_io_v1_k8s1_17Impl


typealias CSINodeDriver_storage_k8s_io_v1_k8s1_19Impl = CSINodeDriver_storage_k8s_io_v1_k8s1_18Impl


typealias CSINodeDriver_storage_k8s_io_v1_k8s1_20Impl = CSINodeDriver_storage_k8s_io_v1_k8s1_19Impl


typealias CSINodeDriver_storage_k8s_io_v1_k8s1_21Impl = CSINodeDriver_storage_k8s_io_v1_k8s1_20Impl

