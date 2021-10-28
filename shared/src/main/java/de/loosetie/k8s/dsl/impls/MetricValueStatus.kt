package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("averageUtilization", "averageValue", "value")
class MetricValueStatus_autoscaling_v2beta2_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MetricValueStatus_autoscaling_v2beta2_k8s1_16, HasParent {
  override var averageUtilization: Int? = null
  override var averageValue: Quantity_core_resource_k8s1_16? = null
  override var value: Quantity_core_resource_k8s1_16? = null
}
typealias MetricValueStatus_autoscaling_v2beta2_k8s1_17Impl = MetricValueStatus_autoscaling_v2beta2_k8s1_16Impl
typealias MetricValueStatus_autoscaling_v2beta2_k8s1_18Impl = MetricValueStatus_autoscaling_v2beta2_k8s1_17Impl
typealias MetricValueStatus_autoscaling_v2beta2_k8s1_19Impl = MetricValueStatus_autoscaling_v2beta2_k8s1_18Impl
typealias MetricValueStatus_autoscaling_v2beta2_k8s1_20Impl = MetricValueStatus_autoscaling_v2beta2_k8s1_19Impl
typealias MetricValueStatus_autoscaling_v2beta2_k8s1_21Impl = MetricValueStatus_autoscaling_v2beta2_k8s1_20Impl