package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsType", "readOnly", "secretRef", "volumeID")
class CinderVolumeSource_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CinderVolumeSource_core_v1, HasParent {
  override var fsType: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: LocalObjectReference_core_v1? = null
  override var volumeID: String? = null
}