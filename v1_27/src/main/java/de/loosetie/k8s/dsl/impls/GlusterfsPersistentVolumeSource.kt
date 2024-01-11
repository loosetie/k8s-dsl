package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("endpoints", "endpointsNamespace", "path", "readOnly")
open class GlusterfsPersistentVolumeSource_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: GlusterfsPersistentVolumeSource_core_v1, HasParent {
  override var endpoints: String? = null
  override var endpointsNamespace: String? = null
  override var path: String? = null
  override var readOnly: Boolean? = null
}