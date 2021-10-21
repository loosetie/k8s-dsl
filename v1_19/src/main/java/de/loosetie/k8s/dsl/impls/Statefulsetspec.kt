package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("podManagementPolicy", "replicas", "revisionHistoryLimit", "selector", "serviceName", "template", "updateStrategy", "volumeClaimTemplates")
class Statefulsetspec_apps_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Statefulsetspec_apps_v1_k8s1_19, HasParent {
  override var podManagementPolicy: String? = null
  override var replicas: Int? = null
  override var revisionHistoryLimit: Int? = null
  override var selector: LabelSelector_meta_v1_k8s1_19? = null
  override var serviceName: String? = null
  override var template: Podtemplatespec_core_v1_k8s1_19? = null
  override var updateStrategy: StatefulSetUpdateStrategy_apps_v1_k8s1_19? = null
  override var volumeClaimTemplates: List<PersistentVolumeClaim_core_v1_k8s1_19>? = null
}