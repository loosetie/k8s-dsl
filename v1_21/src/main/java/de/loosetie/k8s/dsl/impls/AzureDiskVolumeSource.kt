package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("kind", "cachingMode", "diskName", "diskURI", "fsType", "readOnly")
class AzureDiskVolumeSource_core_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AzureDiskVolumeSource_core_v1_k8s1_21, HasParent {
  override var kind: String? = null
  override var cachingMode: String? = null
  override var diskName: String? = null
  override var diskURI: String? = null
  override var fsType: String? = null
  override var readOnly: Boolean? = null
}