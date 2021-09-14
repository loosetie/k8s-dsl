package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("clientCIDR", "serverAddress")
class ServerAddressByClientCIDR_meta_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServerAddressByClientCIDR_meta_v1_k8s1_20, HasParent {
  override var clientCIDR: String? = null
  override var serverAddress: String? = null
}