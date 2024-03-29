package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Subject_flowcontrol_apiserver_k8s_io_v1beta1: K8sManifest {
  /** `kind` indicates which one of the other fields is non-empty. Required */
  @K8sDslMarker var kind: String?
  /** `group` matches based on user group name. */
  val group: GroupSubject_flowcontrol_apiserver_k8s_io_v1beta1?
  /** `serviceAccount` matches ServiceAccounts. */
  val serviceAccount: ServiceAccountSubject_flowcontrol_apiserver_k8s_io_v1beta1?
  /** `user` matches based on username. */
  val user: UserSubject_flowcontrol_apiserver_k8s_io_v1beta1?
}

@K8sDslMarker
interface Subject_flowcontrol_apiserver_k8s_io_v1beta2: K8sManifest {
  /** `kind` indicates which one of the other fields is non-empty. Required */
  @K8sDslMarker var kind: String?
  /** `group` matches based on user group name. */
  val group: GroupSubject_flowcontrol_apiserver_k8s_io_v1beta2?
  /** `serviceAccount` matches ServiceAccounts. */
  val serviceAccount: ServiceAccountSubject_flowcontrol_apiserver_k8s_io_v1beta2?
  /** `user` matches based on username. */
  val user: UserSubject_flowcontrol_apiserver_k8s_io_v1beta2?
}

@Deprecated(message="Old api version")
@K8sDslMarker
interface Subject_rbac_authorization_k8s_io_v1: K8sManifest {
  /** Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount". If the
Authorizer does not recognized the kind value, the Authorizer should report an error. */
  @K8sDslMarker var kind: String?
  /** Namespace of the referenced object. If the object kind is non-namespace, such as "User" or "Group", and this value is
not empty the Authorizer should report an error. */
  @K8sDslMarker var namespace: String?
  /** Name of the object being referenced. */
  @K8sDslMarker var name: String?
  /** APIGroup holds the API group of the referenced subject. Defaults to "" for ServiceAccount subjects. Defaults to
"rbac.authorization.k8s.io" for User and Group subjects. */
  @K8sDslMarker var apiGroup: String?
}