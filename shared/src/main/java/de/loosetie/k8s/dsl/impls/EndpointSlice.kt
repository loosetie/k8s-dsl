package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "addressType", "endpoints", "ports")
class EndpointSlice_discovery_k8s_io_v1alpha1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointSlice_discovery_k8s_io_v1alpha1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override var addressType: String? = null
  override var endpoints: List<Endpoint_discovery_k8s_io_v1alpha1_k8s1_16>? = null
  override var ports: List<EndpointPort_discovery_k8s_io_v1alpha1_k8s1_16>? = null
}


@JsonPropertyOrder("apiVersion", "kind", "metadata", "addressType", "endpoints", "ports")
class EndpointSlice_discovery_k8s_io_v1beta1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointSlice_discovery_k8s_io_v1beta1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override var addressType: String? = null
  override var endpoints: List<Endpoint_discovery_k8s_io_v1beta1_k8s1_17>? = null
  override var ports: List<EndpointPort_discovery_k8s_io_v1beta1_k8s1_17>? = null
}


typealias EndpointSlice_discovery_k8s_io_v1beta1_k8s1_18Impl = EndpointSlice_discovery_k8s_io_v1beta1_k8s1_17Impl


typealias EndpointSlice_discovery_k8s_io_v1beta1_k8s1_19Impl = EndpointSlice_discovery_k8s_io_v1beta1_k8s1_18Impl


typealias EndpointSlice_discovery_k8s_io_v1beta1_k8s1_20Impl = EndpointSlice_discovery_k8s_io_v1beta1_k8s1_19Impl
@JsonPropertyOrder("apiVersion", "kind", "metadata", "addressType", "endpoints", "ports")
class EndpointSlice_discovery_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointSlice_discovery_k8s_io_v1_k8s1_21, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_21
  override var addressType: String? = null
  override var endpoints: List<Endpoint_discovery_k8s_io_v1_k8s1_21>? = null
  override var ports: List<EndpointPort_discovery_k8s_io_v1_k8s1_21>? = null
}



