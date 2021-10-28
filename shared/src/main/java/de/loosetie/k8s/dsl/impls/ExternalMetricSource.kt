package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("metric", "target")
class ExternalMetricSource_autoscaling_v2beta2_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ExternalMetricSource_autoscaling_v2beta2_k8s1_16, HasParent {
  override var metric: MetricIdentifier_autoscaling_v2beta2_k8s1_16? = null
  override var target: MetricTarget_autoscaling_v2beta2_k8s1_16? = null
}
typealias ExternalMetricSource_autoscaling_v2beta2_k8s1_17Impl = ExternalMetricSource_autoscaling_v2beta2_k8s1_16Impl
typealias ExternalMetricSource_autoscaling_v2beta2_k8s1_18Impl = ExternalMetricSource_autoscaling_v2beta2_k8s1_17Impl
typealias ExternalMetricSource_autoscaling_v2beta2_k8s1_19Impl = ExternalMetricSource_autoscaling_v2beta2_k8s1_18Impl
typealias ExternalMetricSource_autoscaling_v2beta2_k8s1_20Impl = ExternalMetricSource_autoscaling_v2beta2_k8s1_19Impl
typealias ExternalMetricSource_autoscaling_v2beta2_k8s1_21Impl = ExternalMetricSource_autoscaling_v2beta2_k8s1_20Impl