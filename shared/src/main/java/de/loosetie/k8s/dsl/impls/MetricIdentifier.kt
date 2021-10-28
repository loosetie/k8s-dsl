package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "selector")
class MetricIdentifier_autoscaling_v2beta2_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MetricIdentifier_autoscaling_v2beta2_k8s1_16, HasParent {
  override var name: String? = null
  override var selector: LabelSelector_meta_v1_k8s1_16? = null
}
typealias MetricIdentifier_autoscaling_v2beta2_k8s1_17Impl = MetricIdentifier_autoscaling_v2beta2_k8s1_16Impl
typealias MetricIdentifier_autoscaling_v2beta2_k8s1_18Impl = MetricIdentifier_autoscaling_v2beta2_k8s1_17Impl
typealias MetricIdentifier_autoscaling_v2beta2_k8s1_19Impl = MetricIdentifier_autoscaling_v2beta2_k8s1_18Impl
typealias MetricIdentifier_autoscaling_v2beta2_k8s1_20Impl = MetricIdentifier_autoscaling_v2beta2_k8s1_19Impl
typealias MetricIdentifier_autoscaling_v2beta2_k8s1_21Impl = MetricIdentifier_autoscaling_v2beta2_k8s1_20Impl