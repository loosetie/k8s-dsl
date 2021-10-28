package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("loadBalancer")
class Servicestatus_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Servicestatus_core_v1_k8s1_16, HasParent {
  override var loadBalancer: LoadBalancerStatus_core_v1_k8s1_16? = null
}
typealias Servicestatus_core_v1_k8s1_17Impl = Servicestatus_core_v1_k8s1_16Impl
typealias Servicestatus_core_v1_k8s1_18Impl = Servicestatus_core_v1_k8s1_17Impl
typealias Servicestatus_core_v1_k8s1_19Impl = Servicestatus_core_v1_k8s1_18Impl
@JsonPropertyOrder("conditions", "loadBalancer")
class Servicestatus_core_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Servicestatus_core_v1_k8s1_20, HasParent {
  override var conditions: List<Condition_meta_v1_k8s1_20>? = null
  override var loadBalancer: LoadBalancerStatus_core_v1_k8s1_20? = null
}
typealias Servicestatus_core_v1_k8s1_21Impl = Servicestatus_core_v1_k8s1_20Impl