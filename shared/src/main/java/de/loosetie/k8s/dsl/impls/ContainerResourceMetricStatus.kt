package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "container", "current")
class ContainerResourceMetricStatus_autoscaling_v2beta2_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ContainerResourceMetricStatus_autoscaling_v2beta2_k8s1_20, HasParent {
  override var name: String? = null
  override var container: String? = null
  override var current: MetricValueStatus_autoscaling_v2beta2_k8s1_20? = null
}
typealias ContainerResourceMetricStatus_autoscaling_v2beta2_k8s1_21Impl = ContainerResourceMetricStatus_autoscaling_v2beta2_k8s1_20Impl