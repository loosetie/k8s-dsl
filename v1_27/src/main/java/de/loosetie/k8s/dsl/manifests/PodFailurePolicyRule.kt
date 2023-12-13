package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PodFailurePolicyRule_batch_v1: K8sManifest {
  /** Specifies the action taken on a pod failure when the requirements are satisfied. Possible values are: - FailJob:
indicates that the pod's job is marked as Failed and all running pods are terminated. - Ignore: indicates that the
counter towards the .backoffLimit is not incremented and a replacement pod is created. - Count: indicates that the pod
is handled in the default way - the counter towards the .backoffLimit is incremented. Additional values are considered
to be added in the future. Clients should react to an unknown action by skipping the rule. */
  @K8sDslMarker var action: String?
  /** Represents the requirement on the container exit codes. */
  val onExitCodes: PodFailurePolicyOnExitCodesRequirement_batch_v1?
  /** Represents the requirement on the pod conditions. The requirement is represented as a list of pod condition patterns.
The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed. */
  val onPodConditions: List<PodFailurePolicyOnPodConditionsPattern_batch_v1>?
}