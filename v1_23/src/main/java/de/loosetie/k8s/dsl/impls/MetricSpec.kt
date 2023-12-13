package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("containerResource", "external", "object", "pods", "resource", "type")
class MetricSpec_autoscaling_v2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MetricSpec_autoscaling_v2, HasParent {
  override var containerResource: ContainerResourceMetricSource_autoscaling_v2? = null
  override var external: ExternalMetricSource_autoscaling_v2? = null
  override var `object`: ObjectMetricSource_autoscaling_v2? = null
  override var pods: PodsMetricSource_autoscaling_v2? = null
  override var resource: ResourceMetricSource_autoscaling_v2? = null
  override var type: String? = null
}