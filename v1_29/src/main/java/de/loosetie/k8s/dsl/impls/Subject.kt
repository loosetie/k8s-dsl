package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("kind", "group", "serviceAccount", "user")
class Subject_flowcontrol_apiserver_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Subject_flowcontrol_apiserver_k8s_io_v1, HasParent {
  override var kind: String? = null
  override var group: GroupSubject_flowcontrol_apiserver_k8s_io_v1? = null
  override var serviceAccount: ServiceAccountSubject_flowcontrol_apiserver_k8s_io_v1? = null
  override var user: UserSubject_flowcontrol_apiserver_k8s_io_v1? = null
}

@JsonPropertyOrder("kind", "namespace", "name", "apiGroup")
class Subject_rbac_authorization_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Subject_rbac_authorization_k8s_io_v1, HasParent {
  override var kind: String? = null
  override var namespace: String? = null
  override var name: String? = null
  override var apiGroup: String? = null
}