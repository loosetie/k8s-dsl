package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("availableReplicas", "collisionCount", "conditions", "currentReplicas", "currentRevision", "observedGeneration", "readyReplicas", "replicas", "updateRevision", "updatedReplicas")
open class Statefulsetstatus_apps_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Statefulsetstatus_apps_v1, HasParent {
  override var availableReplicas: Int? = null
  override var collisionCount: Int? = null
  override var conditions: List<StatefulSetCondition_apps_v1>? = null
  override var currentReplicas: Int? = null
  override var currentRevision: String? = null
  override var observedGeneration: Int? = null
  override var readyReplicas: Int? = null
  override var replicas: Int? = null
  override var updateRevision: String? = null
  override var updatedReplicas: Int? = null
}