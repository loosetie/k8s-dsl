package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("active", "completionTime", "conditions", "failed", "startTime", "succeeded")
class Jobstatus_batch_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Jobstatus_batch_v1_k8s1_16, HasParent {
  override var active: Int? = null
  override var completionTime: Time_meta_v1_k8s1_16? = null
  override var conditions: List<JobCondition_batch_v1_k8s1_16>? = null
  override var failed: Int? = null
  override var startTime: Time_meta_v1_k8s1_16? = null
  override var succeeded: Int? = null
}
typealias Jobstatus_batch_v1_k8s1_17Impl = Jobstatus_batch_v1_k8s1_16Impl
typealias Jobstatus_batch_v1_k8s1_18Impl = Jobstatus_batch_v1_k8s1_17Impl
typealias Jobstatus_batch_v1_k8s1_19Impl = Jobstatus_batch_v1_k8s1_18Impl
@JsonPropertyOrder("active", "completionTime", "conditions", "failed", "startTime", "succeeded")
class Jobstatus_batch_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Jobstatus_batch_v1_k8s1_20, HasParent {
  override var active: Int? = null
  override var completionTime: Time_meta_v1_k8s1_20? = null
  override var conditions: List<JobCondition_batch_v1_k8s1_20>? = null
  override var failed: Int? = null
  override var startTime: Time_meta_v1_k8s1_20? = null
  override var succeeded: Int? = null
}
@JsonPropertyOrder("active", "completedIndexes", "completionTime", "conditions", "failed", "startTime", "succeeded")
class Jobstatus_batch_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Jobstatus_batch_v1_k8s1_21, HasParent {
  override var active: Int? = null
  override var completedIndexes: String? = null
  override var completionTime: Time_meta_v1_k8s1_21? = null
  override var conditions: List<JobCondition_batch_v1_k8s1_21>? = null
  override var failed: Int? = null
  override var startTime: Time_meta_v1_k8s1_21? = null
  override var succeeded: Int? = null
}