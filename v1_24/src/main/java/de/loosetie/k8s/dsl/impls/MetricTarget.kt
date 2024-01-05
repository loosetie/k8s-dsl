package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("averageUtilization", "averageValue", "type", "value")
class MetricTarget_autoscaling_v2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: MetricTarget_autoscaling_v2, HasParent {
  override var averageUtilization: Int? = null
  override var averageValue: Quantity_core_resource? = null
  override var type: String? = null
  override var value: Quantity_core_resource? = null
}