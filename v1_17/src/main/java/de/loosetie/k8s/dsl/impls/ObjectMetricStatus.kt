package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("current", "describedObject", "metric")
class ObjectMetricStatus_autoscaling_v2beta2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ObjectMetricStatus_autoscaling_v2beta2, HasParent {
  override var current: MetricValueStatus_autoscaling_v2beta2? = null
  override var describedObject: CrossVersionObjectReference_autoscaling_v2beta2? = null
  override var metric: MetricIdentifier_autoscaling_v2beta2? = null
}