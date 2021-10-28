package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "port", "protocol")
class EndpointPort_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointPort_core_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var port: Int? = null
  override var protocol: String? = null
}

@JsonPropertyOrder("name", "port", "protocol")
class EndpointPort_discovery_k8s_io_v1alpha1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointPort_discovery_k8s_io_v1alpha1_k8s1_16, HasParent {
  override var name: String? = null
  override var port: Int? = null
  override var protocol: String? = null
}
typealias EndpointPort_core_v1_k8s1_17Impl = EndpointPort_core_v1_k8s1_16Impl



@JsonPropertyOrder("name", "appProtocol", "port", "protocol")
class EndpointPort_discovery_k8s_io_v1beta1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointPort_discovery_k8s_io_v1beta1_k8s1_17, HasParent {
  override var name: String? = null
  override var appProtocol: String? = null
  override var port: Int? = null
  override var protocol: String? = null
}
@JsonPropertyOrder("name", "appProtocol", "port", "protocol")
class EndpointPort_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointPort_core_v1_k8s1_18, HasParent {
  override var name: String? = null
  override var appProtocol: String? = null
  override var port: Int? = null
  override var protocol: String? = null
}



@JsonPropertyOrder("name", "appProtocol", "port", "protocol")
class EndpointPort_discovery_k8s_io_v1beta1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointPort_discovery_k8s_io_v1beta1_k8s1_18, HasParent {
  override var name: String? = null
  override var appProtocol: String? = null
  override var port: Int? = null
  override var protocol: String? = null
}
@JsonPropertyOrder("name", "appProtocol", "port", "protocol")
class EndpointPort_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointPort_core_v1_k8s1_19, HasParent {
  override var name: String? = null
  override var appProtocol: String? = null
  override var port: Int? = null
  override var protocol: String? = null
}



typealias EndpointPort_discovery_k8s_io_v1beta1_k8s1_19Impl = EndpointPort_discovery_k8s_io_v1beta1_k8s1_18Impl
typealias EndpointPort_core_v1_k8s1_20Impl = EndpointPort_core_v1_k8s1_19Impl



typealias EndpointPort_discovery_k8s_io_v1beta1_k8s1_20Impl = EndpointPort_discovery_k8s_io_v1beta1_k8s1_19Impl
typealias EndpointPort_core_v1_k8s1_21Impl = EndpointPort_core_v1_k8s1_20Impl

@JsonPropertyOrder("name", "appProtocol", "port", "protocol")
class EndpointPort_discovery_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointPort_discovery_k8s_io_v1_k8s1_21, HasParent {
  override var name: String? = null
  override var appProtocol: String? = null
  override var port: Int? = null
  override var protocol: String? = null
}



