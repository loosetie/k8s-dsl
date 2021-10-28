package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("external", "object", "pods", "resource", "type")
class MetricSpec_autoscaling_v2beta2_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MetricSpec_autoscaling_v2beta2_k8s1_16, HasParent {
  override var external: ExternalMetricSource_autoscaling_v2beta2_k8s1_16? = null
  override var `object`: ObjectMetricSource_autoscaling_v2beta2_k8s1_16? = null
  override var pods: PodsMetricSource_autoscaling_v2beta2_k8s1_16? = null
  override var resource: ResourceMetricSource_autoscaling_v2beta2_k8s1_16? = null
  override var type: String? = null
}
typealias MetricSpec_autoscaling_v2beta2_k8s1_17Impl = MetricSpec_autoscaling_v2beta2_k8s1_16Impl
typealias MetricSpec_autoscaling_v2beta2_k8s1_18Impl = MetricSpec_autoscaling_v2beta2_k8s1_17Impl
typealias MetricSpec_autoscaling_v2beta2_k8s1_19Impl = MetricSpec_autoscaling_v2beta2_k8s1_18Impl
@JsonPropertyOrder("containerResource", "external", "object", "pods", "resource", "type")
class MetricSpec_autoscaling_v2beta2_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MetricSpec_autoscaling_v2beta2_k8s1_20, HasParent {
  override var containerResource: ContainerResourceMetricSource_autoscaling_v2beta2_k8s1_20? = null
  override var external: ExternalMetricSource_autoscaling_v2beta2_k8s1_20? = null
  override var `object`: ObjectMetricSource_autoscaling_v2beta2_k8s1_20? = null
  override var pods: PodsMetricSource_autoscaling_v2beta2_k8s1_20? = null
  override var resource: ResourceMetricSource_autoscaling_v2beta2_k8s1_20? = null
  override var type: String? = null
}
typealias MetricSpec_autoscaling_v2beta2_k8s1_21Impl = MetricSpec_autoscaling_v2beta2_k8s1_20Impl