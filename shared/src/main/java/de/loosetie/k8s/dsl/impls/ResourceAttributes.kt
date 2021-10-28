package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("namespace", "name", "group", "resource", "subresource", "verb", "version")
class ResourceAttributes_authorization_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourceAttributes_authorization_k8s_io_v1_k8s1_16, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var group: String? = null
  override var resource: String? = null
  override var subresource: String? = null
  override var verb: String? = null
  override var version: String? = null
}
typealias ResourceAttributes_authorization_k8s_io_v1_k8s1_17Impl = ResourceAttributes_authorization_k8s_io_v1_k8s1_16Impl
typealias ResourceAttributes_authorization_k8s_io_v1_k8s1_18Impl = ResourceAttributes_authorization_k8s_io_v1_k8s1_17Impl
typealias ResourceAttributes_authorization_k8s_io_v1_k8s1_19Impl = ResourceAttributes_authorization_k8s_io_v1_k8s1_18Impl
typealias ResourceAttributes_authorization_k8s_io_v1_k8s1_20Impl = ResourceAttributes_authorization_k8s_io_v1_k8s1_19Impl
typealias ResourceAttributes_authorization_k8s_io_v1_k8s1_21Impl = ResourceAttributes_authorization_k8s_io_v1_k8s1_20Impl