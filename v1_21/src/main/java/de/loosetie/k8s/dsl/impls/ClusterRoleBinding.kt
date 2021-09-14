package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "roleRef", "subjects")
class ClusterRoleBinding_rbac_authorization_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ClusterRoleBinding_rbac_authorization_k8s_io_v1_k8s1_21, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_21
  override var roleRef: RoleRef_rbac_authorization_k8s_io_v1_k8s1_21? = null
  override var subjects: List<Subject_rbac_authorization_k8s_io_v1_k8s1_21>? = null
}