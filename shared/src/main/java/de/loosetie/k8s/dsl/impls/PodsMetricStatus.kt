package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("current", "metric")
class PodsMetricStatus_autoscaling_v2beta2_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodsMetricStatus_autoscaling_v2beta2_k8s1_16, HasParent {
  override var current: MetricValueStatus_autoscaling_v2beta2_k8s1_16? = null
  override var metric: MetricIdentifier_autoscaling_v2beta2_k8s1_16? = null
}
typealias PodsMetricStatus_autoscaling_v2beta2_k8s1_17Impl = PodsMetricStatus_autoscaling_v2beta2_k8s1_16Impl
typealias PodsMetricStatus_autoscaling_v2beta2_k8s1_18Impl = PodsMetricStatus_autoscaling_v2beta2_k8s1_17Impl
typealias PodsMetricStatus_autoscaling_v2beta2_k8s1_19Impl = PodsMetricStatus_autoscaling_v2beta2_k8s1_18Impl
typealias PodsMetricStatus_autoscaling_v2beta2_k8s1_20Impl = PodsMetricStatus_autoscaling_v2beta2_k8s1_19Impl
typealias PodsMetricStatus_autoscaling_v2beta2_k8s1_21Impl = PodsMetricStatus_autoscaling_v2beta2_k8s1_20Impl