package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("availableReplicas", "conditions", "fullyLabeledReplicas", "observedGeneration", "readyReplicas", "replicas")
class Replicasetstatus_apps_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Replicasetstatus_apps_v1_k8s1_16, HasParent {
  override var availableReplicas: Int? = null
  override var conditions: List<ReplicaSetCondition_apps_v1_k8s1_16>? = null
  override var fullyLabeledReplicas: Int? = null
  override var observedGeneration: Int? = null
  override var readyReplicas: Int? = null
  override var replicas: Int? = null
}
typealias Replicasetstatus_apps_v1_k8s1_17Impl = Replicasetstatus_apps_v1_k8s1_16Impl
typealias Replicasetstatus_apps_v1_k8s1_18Impl = Replicasetstatus_apps_v1_k8s1_17Impl
typealias Replicasetstatus_apps_v1_k8s1_19Impl = Replicasetstatus_apps_v1_k8s1_18Impl
typealias Replicasetstatus_apps_v1_k8s1_20Impl = Replicasetstatus_apps_v1_k8s1_19Impl
typealias Replicasetstatus_apps_v1_k8s1_21Impl = Replicasetstatus_apps_v1_k8s1_20Impl