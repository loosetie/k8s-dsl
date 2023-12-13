package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Cronjobspec_batch_v1: K8sManifest {
  /** Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run
concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace":
cancels currently running job and replaces it with a new one */
  @K8sDslMarker var concurrencyPolicy: String?
  /** The number of failed finished jobs to retain. Value must be non-negative integer. Defaults to 1. */
  @K8sDslMarker var failedJobsHistoryLimit: Int?
  /** Specifies the job that will be created when executing a CronJob. */
  val jobTemplate: JobTemplateSpec_batch_v1?
  /** The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron. */
  @K8sDslMarker var schedule: String?
  /** Optional deadline in seconds for starting the job if it misses scheduled time for any reason. Missed jobs executions
will be counted as failed ones. */
  @K8sDslMarker var startingDeadlineSeconds: Int?
  /** The number of successful finished jobs to retain. Value must be non-negative integer. Defaults to 3. */
  @K8sDslMarker var successfulJobsHistoryLimit: Int?
  /** This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.
Defaults to false. */
  @K8sDslMarker var suspend: Boolean?
  /** The time zone name for the given schedule, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones. If not
specified, this will default to the time zone of the kube-controller-manager process. The set of valid time zone names
and the time zone offset is loaded from the system-wide time zone database by the API server during CronJob validation
and the controller manager during execution. If no system-wide time zone database can be found a bundled version of the
database is used instead. If the time zone name becomes invalid during the lifetime of a CronJob or due to a change in
host configuration, the controller will stop creating new new Jobs and will create a system event with the reason
UnknownTimeZone. More information can be found in
https://kubernetes.io/docs/concepts/workloads/controllers/cron-jobs/#time-zones This is beta field and must be enabled
via the `CronJobTimeZone` feature gate. */
  @K8sDslMarker var timeZone: String?
}