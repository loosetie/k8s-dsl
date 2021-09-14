package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.DaemonSetUpdateStrategy_apps_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.Daemonsetspec_apps_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.LabelSelector_meta_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.Podtemplatespec_core_v1_k8s1_18

@JsonPropertyOrder("minReadySeconds", "revisionHistoryLimit", "selector", "template", "updateStrategy")
class Daemonsetspec_apps_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Daemonsetspec_apps_v1_k8s1_18, HasParent {
  override var minReadySeconds: Int? = null
  override var revisionHistoryLimit: Int? = null
  override var selector: LabelSelector_meta_v1_k8s1_18? = null
  override var template: Podtemplatespec_core_v1_k8s1_18? = null
  override var updateStrategy: DaemonSetUpdateStrategy_apps_v1_k8s1_18? = null
}