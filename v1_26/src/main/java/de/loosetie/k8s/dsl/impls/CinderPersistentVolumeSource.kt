package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsType", "readOnly", "secretRef", "volumeID")
open class CinderPersistentVolumeSource_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: CinderPersistentVolumeSource_core_v1, HasParent {
  override var fsType: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: SecretReference_core_v1? = null
  override var volumeID: String? = null
}