package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "dryRun", "gracePeriodSeconds", "orphanDependents", "preconditions", "propagationPolicy")
class DeleteOptions_meta_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DeleteOptions_meta_v1_k8s1_16, HasParent {
  override var dryRun: List<String>? = null
  override var gracePeriodSeconds: Int? = null
  override var orphanDependents: Boolean? = null
  override var preconditions: Preconditions_meta_v1_k8s1_16? = null
  override var propagationPolicy: String? = null
}
typealias DeleteOptions_meta_v1_k8s1_17Impl = DeleteOptions_meta_v1_k8s1_16Impl
typealias DeleteOptions_meta_v1_k8s1_18Impl = DeleteOptions_meta_v1_k8s1_17Impl
typealias DeleteOptions_meta_v1_k8s1_19Impl = DeleteOptions_meta_v1_k8s1_18Impl
typealias DeleteOptions_meta_v1_k8s1_20Impl = DeleteOptions_meta_v1_k8s1_19Impl
typealias DeleteOptions_meta_v1_k8s1_21Impl = DeleteOptions_meta_v1_k8s1_20Impl