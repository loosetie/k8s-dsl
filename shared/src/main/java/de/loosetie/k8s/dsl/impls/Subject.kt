package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("kind", "namespace", "name", "apiGroup")
class Subject_rbac_authorization_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Subject_rbac_authorization_k8s_io_v1_k8s1_16, HasParent {
  override var kind: String? = null
  override var namespace: String? = null
  override var name: String? = null
  override var apiGroup: String? = null
}
@JsonPropertyOrder("kind", "group", "serviceAccount", "user")
class Subject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Subject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17, HasParent {
  override var kind: String? = null
  override var group: GroupSubject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17? = null
  override var serviceAccount: ServiceAccountSubject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17? = null
  override var user: UserSubject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17? = null
}

typealias Subject_rbac_authorization_k8s_io_v1_k8s1_17Impl = Subject_rbac_authorization_k8s_io_v1_k8s1_16Impl
typealias Subject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl = Subject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl

typealias Subject_rbac_authorization_k8s_io_v1_k8s1_18Impl = Subject_rbac_authorization_k8s_io_v1_k8s1_17Impl
typealias Subject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl = Subject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl

typealias Subject_rbac_authorization_k8s_io_v1_k8s1_19Impl = Subject_rbac_authorization_k8s_io_v1_k8s1_18Impl


@JsonPropertyOrder("kind", "group", "serviceAccount", "user")
class Subject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Subject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20, HasParent {
  override var kind: String? = null
  override var group: GroupSubject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20? = null
  override var serviceAccount: ServiceAccountSubject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20? = null
  override var user: UserSubject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20? = null
}

typealias Subject_rbac_authorization_k8s_io_v1_k8s1_20Impl = Subject_rbac_authorization_k8s_io_v1_k8s1_19Impl


typealias Subject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21Impl = Subject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl

typealias Subject_rbac_authorization_k8s_io_v1_k8s1_21Impl = Subject_rbac_authorization_k8s_io_v1_k8s1_20Impl