package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("conditionType")
class PodReadinessGate_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodReadinessGate_core_v1_k8s1_16, HasParent {
  override var conditionType: String? = null
}
typealias PodReadinessGate_core_v1_k8s1_17Impl = PodReadinessGate_core_v1_k8s1_16Impl
typealias PodReadinessGate_core_v1_k8s1_18Impl = PodReadinessGate_core_v1_k8s1_17Impl
typealias PodReadinessGate_core_v1_k8s1_19Impl = PodReadinessGate_core_v1_k8s1_18Impl
typealias PodReadinessGate_core_v1_k8s1_20Impl = PodReadinessGate_core_v1_k8s1_19Impl
typealias PodReadinessGate_core_v1_k8s1_21Impl = PodReadinessGate_core_v1_k8s1_20Impl