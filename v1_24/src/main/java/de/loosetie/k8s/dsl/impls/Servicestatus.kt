package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("conditions", "loadBalancer")
open class Servicestatus_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Servicestatus_core_v1, HasParent {
  override var conditions: List<Condition_meta_v1>? = null
  override var loadBalancer: LoadBalancerStatus_core_v1? = null
}