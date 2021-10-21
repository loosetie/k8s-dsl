package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Subject_rbac_authorization_k8s_io_v1_k8s1_16: K8sManifest {
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
@K8sDslMarker
interface Subject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17: K8sManifest {
  /** Required */
  @K8sDslMarker var kind: String?
  /**  */
  val group: GroupSubject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17?
  /**  */
  val serviceAccount: ServiceAccountSubject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17?
  /**  */
  val user: UserSubject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17?
}

typealias Subject_rbac_authorization_k8s_io_v1_k8s1_17 = Subject_rbac_authorization_k8s_io_v1_k8s1_16       
typealias Subject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18 = Subject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17 

typealias Subject_rbac_authorization_k8s_io_v1_k8s1_18 = Subject_rbac_authorization_k8s_io_v1_k8s1_17       
typealias Subject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19 = Subject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18 

typealias Subject_rbac_authorization_k8s_io_v1_k8s1_19 = Subject_rbac_authorization_k8s_io_v1_k8s1_18       


@K8sDslMarker
interface Subject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20: K8sManifest {
  /** Required */
  @K8sDslMarker var kind: String?
  /**  */
  val group: GroupSubject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20?
  /**  */
  val serviceAccount: ServiceAccountSubject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20?
  /**  */
  val user: UserSubject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20?
}

typealias Subject_rbac_authorization_k8s_io_v1_k8s1_20 = Subject_rbac_authorization_k8s_io_v1_k8s1_19       


typealias Subject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21 = Subject_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20 

typealias Subject_rbac_authorization_k8s_io_v1_k8s1_21 = Subject_rbac_authorization_k8s_io_v1_k8s1_20 