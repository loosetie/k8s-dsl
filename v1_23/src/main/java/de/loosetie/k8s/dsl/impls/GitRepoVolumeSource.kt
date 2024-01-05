package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("directory", "repository", "revision")
class GitRepoVolumeSource_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: GitRepoVolumeSource_core_v1, HasParent {
  override var directory: String? = null
  override var repository: String? = null
  override var revision: String? = null
}