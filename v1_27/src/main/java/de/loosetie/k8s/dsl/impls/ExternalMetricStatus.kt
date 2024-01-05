package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("current", "metric")
class ExternalMetricStatus_autoscaling_v2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: ExternalMetricStatus_autoscaling_v2, HasParent {
  override var current: MetricValueStatus_autoscaling_v2? = null
  override var metric: MetricIdentifier_autoscaling_v2? = null
}