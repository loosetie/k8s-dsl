package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("default", "defaultRequest", "max", "maxLimitRequestRatio", "min", "type")
class LimitRangeItem_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LimitRangeItem_core_v1_k8s1_16, HasParent {
  override var default: de.loosetie.k8s.dsl.types.CpuMem? = null
  override var defaultRequest: de.loosetie.k8s.dsl.types.CpuMem? = null
  override var max: de.loosetie.k8s.dsl.types.CpuMem? = null
  override var maxLimitRequestRatio: de.loosetie.k8s.dsl.types.CpuMem? = null
  override var min: de.loosetie.k8s.dsl.types.CpuMem? = null
  override var type: String? = null
}
typealias LimitRangeItem_core_v1_k8s1_17Impl = LimitRangeItem_core_v1_k8s1_16Impl
typealias LimitRangeItem_core_v1_k8s1_18Impl = LimitRangeItem_core_v1_k8s1_17Impl
typealias LimitRangeItem_core_v1_k8s1_19Impl = LimitRangeItem_core_v1_k8s1_18Impl
typealias LimitRangeItem_core_v1_k8s1_20Impl = LimitRangeItem_core_v1_k8s1_19Impl
typealias LimitRangeItem_core_v1_k8s1_21Impl = LimitRangeItem_core_v1_k8s1_20Impl