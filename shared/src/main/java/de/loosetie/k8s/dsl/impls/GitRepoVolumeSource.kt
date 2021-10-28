package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("directory", "repository", "revision")
class GitRepoVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: GitRepoVolumeSource_core_v1_k8s1_16, HasParent {
  override var directory: String? = null
  override var repository: String? = null
  override var revision: String? = null
}
typealias GitRepoVolumeSource_core_v1_k8s1_17Impl = GitRepoVolumeSource_core_v1_k8s1_16Impl
typealias GitRepoVolumeSource_core_v1_k8s1_18Impl = GitRepoVolumeSource_core_v1_k8s1_17Impl
typealias GitRepoVolumeSource_core_v1_k8s1_19Impl = GitRepoVolumeSource_core_v1_k8s1_18Impl
typealias GitRepoVolumeSource_core_v1_k8s1_20Impl = GitRepoVolumeSource_core_v1_k8s1_19Impl
typealias GitRepoVolumeSource_core_v1_k8s1_21Impl = GitRepoVolumeSource_core_v1_k8s1_20Impl