package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("datasetName", "datasetUUID")
class FlockerVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FlockerVolumeSource_core_v1_k8s1_16, HasParent {
  override var datasetName: String? = null
  override var datasetUUID: String? = null
}
typealias FlockerVolumeSource_core_v1_k8s1_17Impl = FlockerVolumeSource_core_v1_k8s1_16Impl
typealias FlockerVolumeSource_core_v1_k8s1_18Impl = FlockerVolumeSource_core_v1_k8s1_17Impl
typealias FlockerVolumeSource_core_v1_k8s1_19Impl = FlockerVolumeSource_core_v1_k8s1_18Impl
typealias FlockerVolumeSource_core_v1_k8s1_20Impl = FlockerVolumeSource_core_v1_k8s1_19Impl
typealias FlockerVolumeSource_core_v1_k8s1_21Impl = FlockerVolumeSource_core_v1_k8s1_20Impl