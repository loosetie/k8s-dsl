package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("active", "lastScheduleTime")
class Cronjobstatus_batch_v1beta1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Cronjobstatus_batch_v1beta1_k8s1_20, HasParent {
  override var active: List<ObjectReference_core_v1_k8s1_20>? = null
  override var lastScheduleTime: Time_meta_v1_k8s1_20? = null
}