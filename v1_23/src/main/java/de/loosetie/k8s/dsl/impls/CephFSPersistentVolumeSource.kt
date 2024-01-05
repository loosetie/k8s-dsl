package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("monitors", "path", "readOnly", "secretFile", "secretRef", "user")
class CephFSPersistentVolumeSource_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: CephFSPersistentVolumeSource_core_v1, HasParent {
  override var monitors: List<String>? = null
  override var path: String? = null
  override var readOnly: Boolean? = null
  override var secretFile: String? = null
  override var secretRef: SecretReference_core_v1? = null
  override var user: String? = null
}