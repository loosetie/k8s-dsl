package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "capacity", "maximumVolumeSize", "nodeTopology", "storageClassName")
class CSIStorageCapacity_storage_k8s_io_v1beta1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSIStorageCapacity_storage_k8s_io_v1beta1_k8s1_21, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_21
  override var capacity: Quantity_core_resource_k8s1_21? = null
  override var maximumVolumeSize: Quantity_core_resource_k8s1_21? = null
  override var nodeTopology: LabelSelector_meta_v1_k8s1_21? = null
  override var storageClassName: String? = null
}