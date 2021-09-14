package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("describedObject", "metric", "target")
class ObjectMetricSource_autoscaling_v2beta2_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ObjectMetricSource_autoscaling_v2beta2_k8s1_18, HasParent {
  override var describedObject: CrossVersionObjectReference_autoscaling_v2beta2_k8s1_18? = null
  override var metric: MetricIdentifier_autoscaling_v2beta2_k8s1_18? = null
  override var target: MetricTarget_autoscaling_v2beta2_k8s1_18? = null
}