package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.APIGroup_meta_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.GroupVersionForDiscovery_meta_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.ServerAddressByClientCIDR_meta_v1_k8s1_18

@JsonPropertyOrder("apiVersion", "kind", "name", "preferredVersion", "serverAddressByClientCIDRs", "versions")
class APIGroup_meta_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: APIGroup_meta_v1_k8s1_18, HasParent {
  override var name: String? = null
  override var preferredVersion: GroupVersionForDiscovery_meta_v1_k8s1_18? = null
  override var serverAddressByClientCIDRs: List<ServerAddressByClientCIDR_meta_v1_k8s1_18>? = null
  override var versions: List<GroupVersionForDiscovery_meta_v1_k8s1_18>? = null
}