package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface AggregationRule_rbac_authorization_k8s_io_v1_k8s1_18: K8sManifest {
  /** ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of
the selectors match, then the ClusterRole's permissions will be added */
  val clusterRoleSelectors: List<LabelSelector_meta_v1_k8s1_18>?
}