package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "target")
class ResourceMetricSource_autoscaling_v2beta2_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourceMetricSource_autoscaling_v2beta2_k8s1_21, HasParent {
  override var name: String? = null
  override var target: MetricTarget_autoscaling_v2beta2_k8s1_21? = null
}