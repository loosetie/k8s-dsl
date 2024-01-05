package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("concurrencyPolicy", "failedJobsHistoryLimit", "jobTemplate", "schedule", "startingDeadlineSeconds", "successfulJobsHistoryLimit", "suspend")
class Cronjobspec_batch_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Cronjobspec_batch_v1, HasParent {
  override var concurrencyPolicy: String? = null
  override var failedJobsHistoryLimit: Int? = null
  override var jobTemplate: JobTemplateSpec_batch_v1? = null
  override var schedule: String? = null
  override var startingDeadlineSeconds: Int? = null
  override var successfulJobsHistoryLimit: Int? = null
  override var suspend: Boolean? = null
}