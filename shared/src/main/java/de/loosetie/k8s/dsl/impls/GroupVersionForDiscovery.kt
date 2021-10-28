package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("groupVersion", "version")
class GroupVersionForDiscovery_meta_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: GroupVersionForDiscovery_meta_v1_k8s1_16, HasParent {
  override var groupVersion: String? = null
  override var version: String? = null
}
typealias GroupVersionForDiscovery_meta_v1_k8s1_17Impl = GroupVersionForDiscovery_meta_v1_k8s1_16Impl
typealias GroupVersionForDiscovery_meta_v1_k8s1_18Impl = GroupVersionForDiscovery_meta_v1_k8s1_17Impl
typealias GroupVersionForDiscovery_meta_v1_k8s1_19Impl = GroupVersionForDiscovery_meta_v1_k8s1_18Impl
typealias GroupVersionForDiscovery_meta_v1_k8s1_20Impl = GroupVersionForDiscovery_meta_v1_k8s1_19Impl
typealias GroupVersionForDiscovery_meta_v1_k8s1_21Impl = GroupVersionForDiscovery_meta_v1_k8s1_20Impl