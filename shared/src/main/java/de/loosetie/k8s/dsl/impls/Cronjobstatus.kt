package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("active", "lastScheduleTime")
class Cronjobstatus_batch_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Cronjobstatus_batch_v1beta1_k8s1_16, HasParent {
  override var active: List<ObjectReference_core_v1_k8s1_16>? = null
  override var lastScheduleTime: Time_meta_v1_k8s1_16? = null
}
typealias Cronjobstatus_batch_v1beta1_k8s1_17Impl = Cronjobstatus_batch_v1beta1_k8s1_16Impl
typealias Cronjobstatus_batch_v1beta1_k8s1_18Impl = Cronjobstatus_batch_v1beta1_k8s1_17Impl
typealias Cronjobstatus_batch_v1beta1_k8s1_19Impl = Cronjobstatus_batch_v1beta1_k8s1_18Impl
typealias Cronjobstatus_batch_v1beta1_k8s1_20Impl = Cronjobstatus_batch_v1beta1_k8s1_19Impl
@JsonPropertyOrder("active", "lastScheduleTime", "lastSuccessfulTime")
class Cronjobstatus_batch_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Cronjobstatus_batch_v1_k8s1_21, HasParent {
  override var active: List<ObjectReference_core_v1_k8s1_21>? = null
  override var lastScheduleTime: Time_meta_v1_k8s1_21? = null
  override var lastSuccessfulTime: Time_meta_v1_k8s1_21? = null
}

