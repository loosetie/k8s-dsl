package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "current")
class ResourceMetricStatus_autoscaling_v2beta2_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourceMetricStatus_autoscaling_v2beta2_k8s1_16, HasParent {
  override var name: String? = null
  override var current: MetricValueStatus_autoscaling_v2beta2_k8s1_16? = null
}
typealias ResourceMetricStatus_autoscaling_v2beta2_k8s1_17Impl = ResourceMetricStatus_autoscaling_v2beta2_k8s1_16Impl
typealias ResourceMetricStatus_autoscaling_v2beta2_k8s1_18Impl = ResourceMetricStatus_autoscaling_v2beta2_k8s1_17Impl
typealias ResourceMetricStatus_autoscaling_v2beta2_k8s1_19Impl = ResourceMetricStatus_autoscaling_v2beta2_k8s1_18Impl
typealias ResourceMetricStatus_autoscaling_v2beta2_k8s1_20Impl = ResourceMetricStatus_autoscaling_v2beta2_k8s1_19Impl
typealias ResourceMetricStatus_autoscaling_v2beta2_k8s1_21Impl = ResourceMetricStatus_autoscaling_v2beta2_k8s1_20Impl