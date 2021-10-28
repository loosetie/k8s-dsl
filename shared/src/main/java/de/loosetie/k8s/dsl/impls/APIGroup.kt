package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "name", "preferredVersion", "serverAddressByClientCIDRs", "versions")
class APIGroup_meta_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: APIGroup_meta_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var preferredVersion: GroupVersionForDiscovery_meta_v1_k8s1_16? = null
  override var serverAddressByClientCIDRs: List<ServerAddressByClientCIDR_meta_v1_k8s1_16>? = null
  override var versions: List<GroupVersionForDiscovery_meta_v1_k8s1_16>? = null
}
typealias APIGroup_meta_v1_k8s1_17Impl = APIGroup_meta_v1_k8s1_16Impl
typealias APIGroup_meta_v1_k8s1_18Impl = APIGroup_meta_v1_k8s1_17Impl
typealias APIGroup_meta_v1_k8s1_19Impl = APIGroup_meta_v1_k8s1_18Impl
typealias APIGroup_meta_v1_k8s1_20Impl = APIGroup_meta_v1_k8s1_19Impl
typealias APIGroup_meta_v1_k8s1_21Impl = APIGroup_meta_v1_k8s1_20Impl