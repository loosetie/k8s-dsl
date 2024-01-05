package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("availableReplicas", "collisionCount", "conditions", "observedGeneration", "readyReplicas", "replicas", "unavailableReplicas", "updatedReplicas")
class Deploymentstatus_apps_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Deploymentstatus_apps_v1, HasParent {
  override var availableReplicas: Int? = null
  override var collisionCount: Int? = null
  override var conditions: List<DeploymentCondition_apps_v1>? = null
  override var observedGeneration: Int? = null
  override var readyReplicas: Int? = null
  override var replicas: Int? = null
  override var unavailableReplicas: Int? = null
  override var updatedReplicas: Int? = null
}