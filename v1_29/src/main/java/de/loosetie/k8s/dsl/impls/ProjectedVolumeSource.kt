package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("defaultMode", "sources")
open class ProjectedVolumeSource_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: ProjectedVolumeSource_core_v1, HasParent {
  override var defaultMode: Int? = null
  override var sources: List<VolumeProjection_core_v1>? = null
}