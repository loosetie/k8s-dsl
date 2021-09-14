package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Jobstatus_batch_v1_k8s1_20: K8sManifest {
  /** The number of actively running pods. */
  @K8sDslMarker var active: Int?
  /** Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate
operations. It is represented in RFC3339 form and is in UTC. The completion time is only set when the job finishes
successfully. */
  val completionTime: Time_meta_v1_k8s1_20?
  /** The latest available observations of an object's current state. When a job fails, one of the conditions will have type
== "Failed". More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ */
  val conditions: List<JobCondition_batch_v1_k8s1_20>?
  /** The number of pods which reached phase Failed. */
  @K8sDslMarker var failed: Int?
  /** Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before
order across separate operations. It is represented in RFC3339 form and is in UTC. */
  val startTime: Time_meta_v1_k8s1_20?
  /** The number of pods which reached phase Succeeded. */
  @K8sDslMarker var succeeded: Int?
}