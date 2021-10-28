package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "rules")
class Role_rbac_authorization_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Role_rbac_authorization_k8s_io_v1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override var rules: List<PolicyRule_rbac_authorization_k8s_io_v1_k8s1_16>? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "rules")
class Role_rbac_authorization_k8s_io_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Role_rbac_authorization_k8s_io_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override var rules: List<PolicyRule_rbac_authorization_k8s_io_v1_k8s1_17>? = null
}
typealias Role_rbac_authorization_k8s_io_v1_k8s1_18Impl = Role_rbac_authorization_k8s_io_v1_k8s1_17Impl
typealias Role_rbac_authorization_k8s_io_v1_k8s1_19Impl = Role_rbac_authorization_k8s_io_v1_k8s1_18Impl
typealias Role_rbac_authorization_k8s_io_v1_k8s1_20Impl = Role_rbac_authorization_k8s_io_v1_k8s1_19Impl
typealias Role_rbac_authorization_k8s_io_v1_k8s1_21Impl = Role_rbac_authorization_k8s_io_v1_k8s1_20Impl