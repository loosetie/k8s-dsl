package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("minReadySeconds", "paused", "progressDeadlineSeconds", "replicas", "revisionHistoryLimit", "selector", "strategy", "template")
open class Deploymentspec_apps_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Deploymentspec_apps_v1, HasParent {
  override var minReadySeconds: Int? = null
  override var paused: Boolean? = null
  override var progressDeadlineSeconds: Int? = null
  override var replicas: Int? = null
  override var revisionHistoryLimit: Int? = null
  override var selector: LabelSelector_meta_v1? = null
  override var strategy: Deploymentstrategy_apps_v1? = null
  override var template: Podtemplatespec_core_v1? = null
}