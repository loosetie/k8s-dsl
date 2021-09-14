package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("external", "object", "pods", "resource", "type")
class MetricStatus_autoscaling_v2beta2_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MetricStatus_autoscaling_v2beta2_k8s1_19, HasParent {
  override var external: ExternalMetricStatus_autoscaling_v2beta2_k8s1_19? = null
  override var `object`: ObjectMetricStatus_autoscaling_v2beta2_k8s1_19? = null
  override var pods: PodsMetricStatus_autoscaling_v2beta2_k8s1_19? = null
  override var resource: ResourceMetricStatus_autoscaling_v2beta2_k8s1_19? = null
  override var type: String? = null
}