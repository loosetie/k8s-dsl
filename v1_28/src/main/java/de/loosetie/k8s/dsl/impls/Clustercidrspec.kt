package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("ipv4", "ipv6", "nodeSelector", "perNodeHostBits")
open class Clustercidrspec_networking_k8s_io_v1alpha1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Clustercidrspec_networking_k8s_io_v1alpha1, HasParent {
  override var ipv4: String? = null
  override var ipv6: String? = null
  override var nodeSelector: NodeSelector_core_v1? = null
  override var perNodeHostBits: Int? = null
}