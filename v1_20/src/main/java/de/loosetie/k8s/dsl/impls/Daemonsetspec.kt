package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("minReadySeconds", "revisionHistoryLimit", "selector", "template", "updateStrategy")
class Daemonsetspec_apps_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Daemonsetspec_apps_v1_k8s1_20, HasParent {
  override var minReadySeconds: Int? = null
  override var revisionHistoryLimit: Int? = null
  override var selector: LabelSelector_meta_v1_k8s1_20? = null
  override var template: Podtemplatespec_core_v1_k8s1_20? = null
  override var updateStrategy: DaemonSetUpdateStrategy_apps_v1_k8s1_20? = null
}