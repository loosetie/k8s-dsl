package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("driver", "fsType", "options", "readOnly", "secretRef")
class FlexVolumeSource_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FlexVolumeSource_core_v1, HasParent {
  override var driver: String? = null
  override var fsType: String? = null
  override var options: Map<String, String>? = null
  override var readOnly: Boolean? = null
  override var secretRef: LocalObjectReference_core_v1? = null
}