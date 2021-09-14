package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("collisionCount", "conditions", "currentNumberScheduled", "desiredNumberScheduled", "numberAvailable", "numberMisscheduled", "numberReady", "numberUnavailable", "observedGeneration", "updatedNumberScheduled")
class Daemonsetstatus_apps_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Daemonsetstatus_apps_v1_k8s1_21, HasParent {
  override var collisionCount: Int? = null
  override var conditions: List<DaemonSetCondition_apps_v1_k8s1_21>? = null
  override var currentNumberScheduled: Int? = null
  override var desiredNumberScheduled: Int? = null
  override var numberAvailable: Int? = null
  override var numberMisscheduled: Int? = null
  override var numberReady: Int? = null
  override var numberUnavailable: Int? = null
  override var observedGeneration: Int? = null
  override var updatedNumberScheduled: Int? = null
}