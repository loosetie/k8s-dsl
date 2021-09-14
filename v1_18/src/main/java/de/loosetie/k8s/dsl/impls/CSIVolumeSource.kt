package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.CSIVolumeSource_core_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.LocalObjectReference_core_v1_k8s1_18

@JsonPropertyOrder("driver", "fsType", "nodePublishSecretRef", "readOnly", "volumeAttributes")
class CSIVolumeSource_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSIVolumeSource_core_v1_k8s1_18, HasParent {
  override var driver: String? = null
  override var fsType: String? = null
  override var nodePublishSecretRef: LocalObjectReference_core_v1_k8s1_18? = null
  override var readOnly: Boolean? = null
  override var volumeAttributes: Any? = null
}