package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("lastTransitionTime", "message", "observedGeneration", "reason", "status", "type")
class StorageVersionCondition_internal_apiserver_k8s_io_v1alpha1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StorageVersionCondition_internal_apiserver_k8s_io_v1alpha1_k8s1_21, HasParent {
  override var lastTransitionTime: Time_meta_v1_k8s1_21? = null
  override var message: String? = null
  override var observedGeneration: Int? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}