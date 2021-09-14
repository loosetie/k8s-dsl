package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.ClusterRoleBinding_rbac_authorization_k8s_io_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.ObjectMeta_meta_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.RoleRef_rbac_authorization_k8s_io_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.Subject_rbac_authorization_k8s_io_v1_k8s1_18

@JsonPropertyOrder("apiVersion", "kind", "metadata", "roleRef", "subjects")
class ClusterRoleBinding_rbac_authorization_k8s_io_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ClusterRoleBinding_rbac_authorization_k8s_io_v1_k8s1_18, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_18
  override var roleRef: RoleRef_rbac_authorization_k8s_io_v1_k8s1_18? = null
  override var subjects: List<Subject_rbac_authorization_k8s_io_v1_k8s1_18>? = null
}