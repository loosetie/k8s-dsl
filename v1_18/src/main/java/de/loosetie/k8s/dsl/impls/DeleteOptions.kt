package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.DeleteOptions_meta_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.Preconditions_meta_v1_k8s1_18

@JsonPropertyOrder("apiVersion", "kind", "dryRun", "gracePeriodSeconds", "orphanDependents", "preconditions", "propagationPolicy")
class DeleteOptions_meta_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DeleteOptions_meta_v1_k8s1_18, HasParent {
  override var dryRun: List<String>? = null
  override var gracePeriodSeconds: Int? = null
  override var orphanDependents: Boolean? = null
  override var preconditions: Preconditions_meta_v1_k8s1_18? = null
  override var propagationPolicy: String? = null
}