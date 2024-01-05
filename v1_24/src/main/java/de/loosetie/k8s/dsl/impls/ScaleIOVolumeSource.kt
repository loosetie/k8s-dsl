package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsType", "gateway", "protectionDomain", "readOnly", "secretRef", "sslEnabled", "storageMode", "storagePool", "system", "volumeName")
class ScaleIOVolumeSource_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: ScaleIOVolumeSource_core_v1, HasParent {
  override var fsType: String? = null
  override var gateway: String? = null
  override var protectionDomain: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: LocalObjectReference_core_v1? = null
  override var sslEnabled: Boolean? = null
  override var storageMode: String? = null
  override var storagePool: String? = null
  override var system: String? = null
  override var volumeName: String? = null
}