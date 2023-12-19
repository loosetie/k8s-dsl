package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("availableReplicas", "conditions", "fullyLabeledReplicas", "observedGeneration", "readyReplicas", "replicas")
class Replicationcontrollerstatus_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Replicationcontrollerstatus_core_v1, HasParent {
  override var availableReplicas: Int? = null
  override var conditions: List<ReplicationControllerCondition_core_v1>? = null
  override var fullyLabeledReplicas: Int? = null
  override var observedGeneration: Int? = null
  override var readyReplicas: Int? = null
  override var replicas: Int? = null
}