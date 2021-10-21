package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Jobstatus_batch_v1_k8s1_16: K8sManifest {
  /** The number of actively running pods. */
  @K8sDslMarker var active: Int?
  /** Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate
operations. It is represented in RFC3339 form and is in UTC. */
  val completionTime: Time_meta_v1_k8s1_16?
  /** The latest available observations of an object's current state. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ */
  val conditions: List<JobCondition_batch_v1_k8s1_16>?
  /** The number of pods which reached phase Failed. */
  @K8sDslMarker var failed: Int?
  /** Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before
order across separate operations. It is represented in RFC3339 form and is in UTC. */
  val startTime: Time_meta_v1_k8s1_16?
  /** The number of pods which reached phase Succeeded. */
  @K8sDslMarker var succeeded: Int?
}      
typealias Jobstatus_batch_v1_k8s1_17 = Jobstatus_batch_v1_k8s1_16       
typealias Jobstatus_batch_v1_k8s1_18 = Jobstatus_batch_v1_k8s1_17       
typealias Jobstatus_batch_v1_k8s1_19 = Jobstatus_batch_v1_k8s1_18       
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
@K8sDslMarker
interface Jobstatus_batch_v1_k8s1_21: K8sManifest {
  /** The number of actively running pods. */
  @K8sDslMarker var active: Int?
  /** CompletedIndexes holds the completed indexes when .spec.completionMode = "Indexed" in a text format. The indexes are
represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more
consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen.
For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as "1,3-5,7". */
  @K8sDslMarker var completedIndexes: String?
  /** Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate
operations. It is represented in RFC3339 form and is in UTC. The completion time is only set when the job finishes
successfully. */
  val completionTime: Time_meta_v1_k8s1_21?
  /** The latest available observations of an object's current state. When a Job fails, one of the conditions will have type
"Failed" and status true. When a Job is suspended, one of the conditions will have type "Suspended" and status true;
when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions
will have type "Complete" and status true. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ */
  val conditions: List<JobCondition_batch_v1_k8s1_21>?
  /** The number of pods which reached phase Failed. */
  @K8sDslMarker var failed: Int?
  /** Represents time when the job controller started processing a job. When a Job is created in the suspended state, this
field is not set until the first time it is resumed. This field is reset every time a Job is resumed from suspension. It
is represented in RFC3339 form and is in UTC. */
  val startTime: Time_meta_v1_k8s1_21?
  /** The number of pods which reached phase Succeeded. */
  @K8sDslMarker var succeeded: Int?
}