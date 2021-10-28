package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "description", "globalDefault", "preemptionPolicy", "value")
class PriorityClass_scheduling_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PriorityClass_scheduling_k8s_io_v1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override var description: String? = null
  override var globalDefault: Boolean? = null
  override var preemptionPolicy: String? = null
  override var value: Int? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "description", "globalDefault", "preemptionPolicy", "value")
class PriorityClass_scheduling_k8s_io_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PriorityClass_scheduling_k8s_io_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override var description: String? = null
  override var globalDefault: Boolean? = null
  override var preemptionPolicy: String? = null
  override var value: Int? = null
}
typealias PriorityClass_scheduling_k8s_io_v1_k8s1_18Impl = PriorityClass_scheduling_k8s_io_v1_k8s1_17Impl
@JsonPropertyOrder("apiVersion", "kind", "metadata", "description", "globalDefault", "preemptionPolicy", "value")
class PriorityClass_scheduling_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PriorityClass_scheduling_k8s_io_v1_k8s1_19, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_19
  override var description: String? = null
  override var globalDefault: Boolean? = null
  override var preemptionPolicy: String? = null
  override var value: Int? = null
}
typealias PriorityClass_scheduling_k8s_io_v1_k8s1_20Impl = PriorityClass_scheduling_k8s_io_v1_k8s1_19Impl
typealias PriorityClass_scheduling_k8s_io_v1_k8s1_21Impl = PriorityClass_scheduling_k8s_io_v1_k8s1_20Impl