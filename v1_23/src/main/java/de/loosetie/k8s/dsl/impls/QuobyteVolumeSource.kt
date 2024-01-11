package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("group", "readOnly", "registry", "tenant", "user", "volume")
open class QuobyteVolumeSource_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: QuobyteVolumeSource_core_v1, HasParent {
  override var group: String? = null
  override var readOnly: Boolean? = null
  override var registry: String? = null
  override var tenant: String? = null
  override var user: String? = null
  override var volume: String? = null
}