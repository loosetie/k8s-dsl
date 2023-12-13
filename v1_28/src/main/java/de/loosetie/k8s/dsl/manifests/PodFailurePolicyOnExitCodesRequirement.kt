package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PodFailurePolicyOnExitCodesRequirement_batch_v1: K8sManifest {
  /** Restricts the check for exit codes to the container with the specified name. When null, the rule applies to all
containers. When specified, it should match one the container or initContainer names in the pod template. */
  @K8sDslMarker var containerName: String?
  /** Represents the relationship between the container exit code(s) and the specified values. Containers completed with
success (exit code 0) are excluded from the requirement check. Possible values are: - In: the requirement is satisfied
if at least one container exit code (might be multiple if there are multiple containers not restricted by the
'containerName' field) is in the set of specified values. - NotIn: the requirement is satisfied if at least one
container exit code (might be multiple if there are multiple containers not restricted by the 'containerName' field) is
not in the set of specified values. Additional values are considered to be added in the future. Clients should react to
an unknown operator by assuming the requirement is not satisfied. */
  @K8sDslMarker var operator: String?
  /** Specifies the set of values. Each returned container exit code (might be multiple in case of multiple containers) is
checked against this set of values with respect to the operator. The list of values must be ordered and must not contain
duplicates. Value '0' cannot be used for the In operator. At least one element is required. At most 255 elements are
allowed. */
  @K8sDslMarker var values: List<Int>?
}