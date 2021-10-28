package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("namespace", "name", "path", "port")
class ServiceReference_admissionregistration_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceReference_admissionregistration_k8s_io_v1_k8s1_16, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var path: String? = null
  override var port: Int? = null
}

@JsonPropertyOrder("namespace", "name", "path", "port")
class ServiceReference_apiextensions_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceReference_apiextensions_k8s_io_v1_k8s1_16, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var path: String? = null
  override var port: Int? = null
}

@JsonPropertyOrder("namespace", "name", "port")
class ServiceReference_apiregistration_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceReference_apiregistration_k8s_io_v1_k8s1_16, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var port: Int? = null
}

@JsonPropertyOrder("namespace", "name", "path", "port")
class ServiceReference_auditregistration_k8s_io_v1alpha1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceReference_auditregistration_k8s_io_v1alpha1_k8s1_16, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var path: String? = null
  override var port: Int? = null
}
typealias ServiceReference_admissionregistration_k8s_io_v1_k8s1_17Impl = ServiceReference_admissionregistration_k8s_io_v1_k8s1_16Impl

typealias ServiceReference_apiextensions_k8s_io_v1_k8s1_17Impl = ServiceReference_apiextensions_k8s_io_v1_k8s1_16Impl

typealias ServiceReference_apiregistration_k8s_io_v1_k8s1_17Impl = ServiceReference_apiregistration_k8s_io_v1_k8s1_16Impl

typealias ServiceReference_auditregistration_k8s_io_v1alpha1_k8s1_17Impl = ServiceReference_auditregistration_k8s_io_v1alpha1_k8s1_16Impl
typealias ServiceReference_admissionregistration_k8s_io_v1_k8s1_18Impl = ServiceReference_admissionregistration_k8s_io_v1_k8s1_17Impl

typealias ServiceReference_apiextensions_k8s_io_v1_k8s1_18Impl = ServiceReference_apiextensions_k8s_io_v1_k8s1_17Impl

typealias ServiceReference_apiregistration_k8s_io_v1_k8s1_18Impl = ServiceReference_apiregistration_k8s_io_v1_k8s1_17Impl

typealias ServiceReference_auditregistration_k8s_io_v1alpha1_k8s1_18Impl = ServiceReference_auditregistration_k8s_io_v1alpha1_k8s1_17Impl
typealias ServiceReference_admissionregistration_k8s_io_v1_k8s1_19Impl = ServiceReference_admissionregistration_k8s_io_v1_k8s1_18Impl

typealias ServiceReference_apiextensions_k8s_io_v1_k8s1_19Impl = ServiceReference_apiextensions_k8s_io_v1_k8s1_18Impl

typealias ServiceReference_apiregistration_k8s_io_v1_k8s1_19Impl = ServiceReference_apiregistration_k8s_io_v1_k8s1_18Impl


typealias ServiceReference_admissionregistration_k8s_io_v1_k8s1_20Impl = ServiceReference_admissionregistration_k8s_io_v1_k8s1_19Impl

typealias ServiceReference_apiextensions_k8s_io_v1_k8s1_20Impl = ServiceReference_apiextensions_k8s_io_v1_k8s1_19Impl

typealias ServiceReference_apiregistration_k8s_io_v1_k8s1_20Impl = ServiceReference_apiregistration_k8s_io_v1_k8s1_19Impl


typealias ServiceReference_admissionregistration_k8s_io_v1_k8s1_21Impl = ServiceReference_admissionregistration_k8s_io_v1_k8s1_20Impl

typealias ServiceReference_apiextensions_k8s_io_v1_k8s1_21Impl = ServiceReference_apiextensions_k8s_io_v1_k8s1_20Impl

typealias ServiceReference_apiregistration_k8s_io_v1_k8s1_21Impl = ServiceReference_apiregistration_k8s_io_v1_k8s1_20Impl

