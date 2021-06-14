package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("averageUtilization", "averageValue", "value")
class MetricValueStatus_autoscaling_v2beta2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MetricValueStatus_autoscaling_v2beta2, HasParent {
  override var averageUtilization: Int? = null
  override var averageValue: Quantity_core_resource? = null
  override var value: Quantity_core_resource? = null
}