package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "name", "preferredVersion", "serverAddressByClientCIDRs", "versions")
open class APIGroup_meta_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
  @JsonIgnore
  override val helmVariables: MutableMap<String, String> = mutableMapOf(),
      
)
: APIGroup_meta_v1, HasParent {
  override var name: String? = null
  override var preferredVersion: GroupVersionForDiscovery_meta_v1? = null
  override var serverAddressByClientCIDRs: List<ServerAddressByClientCIDR_meta_v1>? = null
  override var versions: List<GroupVersionForDiscovery_meta_v1>? = null
}