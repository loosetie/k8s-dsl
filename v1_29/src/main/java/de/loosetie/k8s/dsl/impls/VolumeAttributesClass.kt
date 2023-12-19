package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "driverName", "parameters")
class VolumeAttributesClass_storage_k8s_io_v1alpha1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeAttributesClass_storage_k8s_io_v1alpha1, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1
  override var driverName: String? = null
  override var parameters: Any? = null
}