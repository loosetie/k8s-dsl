package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Jobspec_batch_v1_k8s1_20: K8sManifest {
  /** Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to
terminate it; value must be positive integer */
  @K8sDslMarker var activeDeadlineSeconds: Int?
  /** Specifies the number of retries before marking this job failed. Defaults to 6 */
  @K8sDslMarker var backoffLimit: Int?
  /** Specifies the desired number of successfully finished pods the job should be run with. Setting to nil means that the
success of any pod signals the success of all pods, and allows parallelism to have any positive value. Setting to 1
means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ */
  @K8sDslMarker var completions: Int?
  /** manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain
what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod
template. When true, the user is responsible for picking unique labels and specifying the selector. Failure to pick a
unique label may cause this and other jobs to not function correctly. However, You may see `manualSelector=true` in jobs
that were created with the old `extensions/v1beta1` API. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector */
  @K8sDslMarker var manualSelector: Boolean?
  /** Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in
steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e.
when the work left to do is less than max parallelism. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ */
  @K8sDslMarker var parallelism: Int?
  /** A label query over pods that should match the pod count. Normally, the system sets this field for you. More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  val selector: LabelSelector_meta_v1_k8s1_20?
  /** Describes the pod that will be created when executing a job. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ */
  val template: Podtemplatespec_core_v1_k8s1_20?
  /** ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this
field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job
is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be
automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it
finishes. This field is alpha-level and is only honored by servers that enable the TTLAfterFinished feature. */
  @K8sDslMarker var ttlSecondsAfterFinished: Int?
}