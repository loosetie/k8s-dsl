package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface RoleRef_rbac_authorization_k8s_io_v1_k8s1_16: K8sManifest {
  /** Kind is the type of resource being referenced */
  @K8sDslMarker var kind: String?
  /** Name is the name of resource being referenced */
  @K8sDslMarker var name: String?
  /** APIGroup is the group for the resource being referenced */
  @K8sDslMarker var apiGroup: String?
}      
typealias RoleRef_rbac_authorization_k8s_io_v1_k8s1_17 = RoleRef_rbac_authorization_k8s_io_v1_k8s1_16       
typealias RoleRef_rbac_authorization_k8s_io_v1_k8s1_18 = RoleRef_rbac_authorization_k8s_io_v1_k8s1_17       
typealias RoleRef_rbac_authorization_k8s_io_v1_k8s1_19 = RoleRef_rbac_authorization_k8s_io_v1_k8s1_18       
typealias RoleRef_rbac_authorization_k8s_io_v1_k8s1_20 = RoleRef_rbac_authorization_k8s_io_v1_k8s1_19       
typealias RoleRef_rbac_authorization_k8s_io_v1_k8s1_21 = RoleRef_rbac_authorization_k8s_io_v1_k8s1_20 