package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("ip")
open class PodIP_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: PodIP_core_v1, HasParent {
  override var ip: String? = null
}