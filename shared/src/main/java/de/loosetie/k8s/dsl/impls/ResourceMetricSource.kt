package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "target")
class ResourceMetricSource_autoscaling_v2beta2_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourceMetricSource_autoscaling_v2beta2_k8s1_16, HasParent {
  override var name: String? = null
  override var target: MetricTarget_autoscaling_v2beta2_k8s1_16? = null
}
typealias ResourceMetricSource_autoscaling_v2beta2_k8s1_17Impl = ResourceMetricSource_autoscaling_v2beta2_k8s1_16Impl
typealias ResourceMetricSource_autoscaling_v2beta2_k8s1_18Impl = ResourceMetricSource_autoscaling_v2beta2_k8s1_17Impl
typealias ResourceMetricSource_autoscaling_v2beta2_k8s1_19Impl = ResourceMetricSource_autoscaling_v2beta2_k8s1_18Impl
typealias ResourceMetricSource_autoscaling_v2beta2_k8s1_20Impl = ResourceMetricSource_autoscaling_v2beta2_k8s1_19Impl
typealias ResourceMetricSource_autoscaling_v2beta2_k8s1_21Impl = ResourceMetricSource_autoscaling_v2beta2_k8s1_20Impl