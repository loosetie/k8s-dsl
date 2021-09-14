package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("clusterRoleSelectors")
class AggregationRule_rbac_authorization_k8s_io_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AggregationRule_rbac_authorization_k8s_io_v1_k8s1_20, HasParent {
  override var clusterRoleSelectors: List<LabelSelector_meta_v1_k8s1_20>? = null
}