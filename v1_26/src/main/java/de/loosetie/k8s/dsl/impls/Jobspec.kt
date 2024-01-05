package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("activeDeadlineSeconds", "backoffLimit", "completionMode", "completions", "manualSelector", "parallelism", "podFailurePolicy", "selector", "suspend", "template", "ttlSecondsAfterFinished")
class Jobspec_batch_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Jobspec_batch_v1, HasParent {
  override var activeDeadlineSeconds: Int? = null
  override var backoffLimit: Int? = null
  override var completionMode: String? = null
  override var completions: Int? = null
  override var manualSelector: Boolean? = null
  override var parallelism: Int? = null
  override var podFailurePolicy: PodFailurePolicy_batch_v1? = null
  override var selector: LabelSelector_meta_v1? = null
  override var suspend: Boolean? = null
  override var template: Podtemplatespec_core_v1? = null
  override var ttlSecondsAfterFinished: Int? = null
}