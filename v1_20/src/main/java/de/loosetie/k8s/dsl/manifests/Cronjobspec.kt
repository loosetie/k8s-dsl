package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Cronjobspec_batch_v1beta1_k8s1_20: K8sManifest {
  /** Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run
concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace":
cancels currently running job and replaces it with a new one */
  @K8sDslMarker var concurrencyPolicy: String?
  /** The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
Defaults to 1. */
  @K8sDslMarker var failedJobsHistoryLimit: Int?
  /** Specifies the job that will be created when executing a CronJob. */
  val jobTemplate: JobTemplateSpec_batch_v1beta1_k8s1_20?
  /** The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron. */
  @K8sDslMarker var schedule: String?
  /** Optional deadline in seconds for starting the job if it misses scheduled time for any reason. Missed jobs executions
will be counted as failed ones. */
  @K8sDslMarker var startingDeadlineSeconds: Int?
  /** The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not
specified. Defaults to 3. */
  @K8sDslMarker var successfulJobsHistoryLimit: Int?
  /** This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.
Defaults to false. */
  @K8sDslMarker var suspend: Boolean?
}