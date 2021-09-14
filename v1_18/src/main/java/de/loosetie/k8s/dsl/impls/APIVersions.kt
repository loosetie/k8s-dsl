package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.APIVersions_meta_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.ServerAddressByClientCIDR_meta_v1_k8s1_18

@JsonPropertyOrder("apiVersion", "kind", "serverAddressByClientCIDRs", "versions")
class APIVersions_meta_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: APIVersions_meta_v1_k8s1_18, HasParent {
  override var serverAddressByClientCIDRs: List<ServerAddressByClientCIDR_meta_v1_k8s1_18>? = null
  override var versions: List<String>? = null
}