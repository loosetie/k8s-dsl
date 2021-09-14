package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsType", "image", "keyring", "monitors", "pool", "readOnly", "secretRef", "user")
class RBDPersistentVolumeSource_core_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RBDPersistentVolumeSource_core_v1_k8s1_21, HasParent {
  override var fsType: String? = null
  override var image: String? = null
  override var keyring: String? = null
  override var monitors: List<String>? = null
  override var pool: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: SecretReference_core_v1_k8s1_21? = null
  override var user: String? = null
}