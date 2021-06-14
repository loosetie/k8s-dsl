package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("namespace", "name", "path", "port")
class ServiceReference_admissionregistration_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceReference_admissionregistration_k8s_io_v1, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var path: String? = null
  override var port: Int? = null
}

@JsonPropertyOrder("namespace", "name", "path", "port")
class ServiceReference_apiextensions_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceReference_apiextensions_k8s_io_v1, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var path: String? = null
  override var port: Int? = null
}

@JsonPropertyOrder("namespace", "name", "port")
class ServiceReference_apiregistration_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceReference_apiregistration_k8s_io_v1, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var port: Int? = null
}

@JsonPropertyOrder("namespace", "name", "path", "port")
class ServiceReference_auditregistration_k8s_io_v1alpha1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceReference_auditregistration_k8s_io_v1alpha1, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var path: String? = null
  override var port: Int? = null
}