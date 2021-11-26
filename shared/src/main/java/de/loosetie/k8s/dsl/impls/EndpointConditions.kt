package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("ready")
class EndpointConditions_discovery_k8s_io_v1alpha1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointConditions_discovery_k8s_io_v1alpha1_k8s1_16, HasParent {
  override var ready: Boolean? = null
}
@JsonPropertyOrder("ready")
class EndpointConditions_discovery_k8s_io_v1beta1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointConditions_discovery_k8s_io_v1beta1_k8s1_17, HasParent {
  override var ready: Boolean? = null
}
typealias EndpointConditions_discovery_k8s_io_v1beta1_k8s1_18Impl = EndpointConditions_discovery_k8s_io_v1beta1_k8s1_17Impl
typealias EndpointConditions_discovery_k8s_io_v1beta1_k8s1_19Impl = EndpointConditions_discovery_k8s_io_v1beta1_k8s1_18Impl
@JsonPropertyOrder("ready", "serving", "terminating")
class EndpointConditions_discovery_k8s_io_v1beta1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointConditions_discovery_k8s_io_v1beta1_k8s1_20, HasParent {
  override var ready: Boolean? = null
  override var serving: Boolean? = null
  override var terminating: Boolean? = null
}
@JsonPropertyOrder("ready", "serving", "terminating")
class EndpointConditions_discovery_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointConditions_discovery_k8s_io_v1_k8s1_21, HasParent {
  override var ready: Boolean? = null
  override var serving: Boolean? = null
  override var terminating: Boolean? = null
}