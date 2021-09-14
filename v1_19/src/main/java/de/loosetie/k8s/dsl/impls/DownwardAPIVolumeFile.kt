package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fieldRef", "mode", "path", "resourceFieldRef")
class DownwardAPIVolumeFile_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DownwardAPIVolumeFile_core_v1_k8s1_19, HasParent {
  override var fieldRef: ObjectFieldSelector_core_v1_k8s1_19? = null
  override var mode: Int? = null
  override var path: String? = null
  override var resourceFieldRef: ResourceFieldSelector_core_v1_k8s1_19? = null
}