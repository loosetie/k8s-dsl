package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsType", "readOnly", "secretRef", "volumeName", "volumeNamespace")
open class StorageOSPersistentVolumeSource_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: StorageOSPersistentVolumeSource_core_v1, HasParent {
  override var fsType: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: ObjectReference_core_v1? = null
  override var volumeName: String? = null
  override var volumeNamespace: String? = null
}