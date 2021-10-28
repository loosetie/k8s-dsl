package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("current", "describedObject", "metric")
class ObjectMetricStatus_autoscaling_v2beta2_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ObjectMetricStatus_autoscaling_v2beta2_k8s1_16, HasParent {
  override var current: MetricValueStatus_autoscaling_v2beta2_k8s1_16? = null
  override var describedObject: CrossVersionObjectReference_autoscaling_v2beta2_k8s1_16? = null
  override var metric: MetricIdentifier_autoscaling_v2beta2_k8s1_16? = null
}
typealias ObjectMetricStatus_autoscaling_v2beta2_k8s1_17Impl = ObjectMetricStatus_autoscaling_v2beta2_k8s1_16Impl
typealias ObjectMetricStatus_autoscaling_v2beta2_k8s1_18Impl = ObjectMetricStatus_autoscaling_v2beta2_k8s1_17Impl
typealias ObjectMetricStatus_autoscaling_v2beta2_k8s1_19Impl = ObjectMetricStatus_autoscaling_v2beta2_k8s1_18Impl
typealias ObjectMetricStatus_autoscaling_v2beta2_k8s1_20Impl = ObjectMetricStatus_autoscaling_v2beta2_k8s1_19Impl
typealias ObjectMetricStatus_autoscaling_v2beta2_k8s1_21Impl = ObjectMetricStatus_autoscaling_v2beta2_k8s1_20Impl