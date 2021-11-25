package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "nodePort", "port", "protocol", "targetPort")
class ServicePort_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServicePort_core_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var nodePort: Int? = null
  override var port: Int? = null
  override var protocol: String? = null
  override var targetPort: de.loosetie.k8s.dsl.types.IntOrString? = null
}
typealias ServicePort_core_v1_k8s1_17Impl = ServicePort_core_v1_k8s1_16Impl
@JsonPropertyOrder("name", "appProtocol", "nodePort", "port", "protocol", "targetPort")
class ServicePort_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServicePort_core_v1_k8s1_18, HasParent {
  override var name: String? = null
  override var appProtocol: String? = null
  override var nodePort: Int? = null
  override var port: Int? = null
  override var protocol: String? = null
  override var targetPort: de.loosetie.k8s.dsl.types.IntOrString? = null
}
@JsonPropertyOrder("name", "appProtocol", "nodePort", "port", "protocol", "targetPort")
class ServicePort_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServicePort_core_v1_k8s1_19, HasParent {
  override var name: String? = null
  override var appProtocol: String? = null
  override var nodePort: Int? = null
  override var port: Int? = null
  override var protocol: String? = null
  override var targetPort: de.loosetie.k8s.dsl.types.IntOrString? = null
}
@JsonPropertyOrder("name", "appProtocol", "nodePort", "port", "protocol", "targetPort")
class ServicePort_core_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServicePort_core_v1_k8s1_20, HasParent {
  override var name: String? = null
  override var appProtocol: String? = null
  override var nodePort: Int? = null
  override var port: Int? = null
  override var protocol: String? = null
  override var targetPort: de.loosetie.k8s.dsl.types.IntOrString? = null
}
typealias ServicePort_core_v1_k8s1_21Impl = ServicePort_core_v1_k8s1_20Impl