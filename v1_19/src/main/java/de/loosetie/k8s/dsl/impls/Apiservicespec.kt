package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("caBundle", "group", "groupPriorityMinimum", "insecureSkipTLSVerify", "service", "version", "versionPriority")
class Apiservicespec_apiregistration_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Apiservicespec_apiregistration_k8s_io_v1_k8s1_19, HasParent {
  override var caBundle: String? = null
  override var group: String? = null
  override var groupPriorityMinimum: Int? = null
  override var insecureSkipTLSVerify: Boolean? = null
  override var service: ServiceReference_apiregistration_k8s_io_v1_k8s1_19? = null
  override var version: String? = null
  override var versionPriority: Int? = null
}