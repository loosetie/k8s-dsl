package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("hostnames", "ip")
open class HostAlias_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: HostAlias_core_v1, HasParent {
  override var hostnames: List<String>? = null
  override var ip: String? = null
}