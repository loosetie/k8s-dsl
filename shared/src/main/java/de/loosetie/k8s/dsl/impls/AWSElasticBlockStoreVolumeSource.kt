package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsType", "partition", "readOnly", "volumeID")
class AWSElasticBlockStoreVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AWSElasticBlockStoreVolumeSource_core_v1_k8s1_16, HasParent {
  override var fsType: String? = null
  override var partition: Int? = null
  override var readOnly: Boolean? = null
  override var volumeID: String? = null
}
typealias AWSElasticBlockStoreVolumeSource_core_v1_k8s1_17Impl = AWSElasticBlockStoreVolumeSource_core_v1_k8s1_16Impl
typealias AWSElasticBlockStoreVolumeSource_core_v1_k8s1_18Impl = AWSElasticBlockStoreVolumeSource_core_v1_k8s1_17Impl
typealias AWSElasticBlockStoreVolumeSource_core_v1_k8s1_19Impl = AWSElasticBlockStoreVolumeSource_core_v1_k8s1_18Impl
typealias AWSElasticBlockStoreVolumeSource_core_v1_k8s1_20Impl = AWSElasticBlockStoreVolumeSource_core_v1_k8s1_19Impl
typealias AWSElasticBlockStoreVolumeSource_core_v1_k8s1_21Impl = AWSElasticBlockStoreVolumeSource_core_v1_k8s1_20Impl