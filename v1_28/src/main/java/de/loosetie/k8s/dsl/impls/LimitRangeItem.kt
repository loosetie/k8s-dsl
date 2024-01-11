package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("default", "defaultRequest", "max", "maxLimitRequestRatio", "min", "type")
open class LimitRangeItem_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: LimitRangeItem_core_v1, HasParent {
  override var default: Any? = null
  override var defaultRequest: Any? = null
  override var max: Any? = null
  override var maxLimitRequestRatio: Any? = null
  override var min: Any? = null
  override var type: String? = null
}