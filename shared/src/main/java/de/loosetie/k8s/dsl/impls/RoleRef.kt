package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("kind", "name", "apiGroup")
class RoleRef_rbac_authorization_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RoleRef_rbac_authorization_k8s_io_v1_k8s1_16, HasParent {
  override var kind: String? = null
  override var name: String? = null
  override var apiGroup: String? = null
}
typealias RoleRef_rbac_authorization_k8s_io_v1_k8s1_17Impl = RoleRef_rbac_authorization_k8s_io_v1_k8s1_16Impl
typealias RoleRef_rbac_authorization_k8s_io_v1_k8s1_18Impl = RoleRef_rbac_authorization_k8s_io_v1_k8s1_17Impl
typealias RoleRef_rbac_authorization_k8s_io_v1_k8s1_19Impl = RoleRef_rbac_authorization_k8s_io_v1_k8s1_18Impl
typealias RoleRef_rbac_authorization_k8s_io_v1_k8s1_20Impl = RoleRef_rbac_authorization_k8s_io_v1_k8s1_19Impl
typealias RoleRef_rbac_authorization_k8s_io_v1_k8s1_21Impl = RoleRef_rbac_authorization_k8s_io_v1_k8s1_20Impl