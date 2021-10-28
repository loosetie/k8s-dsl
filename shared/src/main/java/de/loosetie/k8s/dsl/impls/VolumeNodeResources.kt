package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("count")
class VolumeNodeResources_storage_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeNodeResources_storage_k8s_io_v1beta1_k8s1_16, HasParent {
  override var count: Int? = null
}
@JsonPropertyOrder("count")
class VolumeNodeResources_storage_k8s_io_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeNodeResources_storage_k8s_io_v1_k8s1_17, HasParent {
  override var count: Int? = null
}


typealias VolumeNodeResources_storage_k8s_io_v1_k8s1_18Impl = VolumeNodeResources_storage_k8s_io_v1_k8s1_17Impl


typealias VolumeNodeResources_storage_k8s_io_v1_k8s1_19Impl = VolumeNodeResources_storage_k8s_io_v1_k8s1_18Impl


typealias VolumeNodeResources_storage_k8s_io_v1_k8s1_20Impl = VolumeNodeResources_storage_k8s_io_v1_k8s1_19Impl


typealias VolumeNodeResources_storage_k8s_io_v1_k8s1_21Impl = VolumeNodeResources_storage_k8s_io_v1_k8s1_20Impl

