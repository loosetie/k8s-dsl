package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.CinderVolumeSource_core_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.LocalObjectReference_core_v1_k8s1_18

@JsonPropertyOrder("fsType", "readOnly", "secretRef", "volumeID")
class CinderVolumeSource_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CinderVolumeSource_core_v1_k8s1_18, HasParent {
  override var fsType: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: LocalObjectReference_core_v1_k8s1_18? = null
  override var volumeID: String? = null
}