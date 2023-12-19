package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Poddisruptionbudgetspec_policy_v1: K8sManifest {
  /** An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e.
even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a
mutually exclusive setting with "minAvailable".

			When you specify an integer, it represents a number of Pods. When
you specify a percentage by setting the value to a string representation of a percentage (eg. "50%"), it represents a
percentage of total Pods. */
  var maxUnavailable: de.loosetie.k8s.dsl.types.IntOrPercentage?
  /** An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the
eviction, i.e. even in the absence of the evicted pod. So for example you can prevent all voluntary evictions by
specifying "100%".

			When you specify an integer, it represents a number of Pods. When you specify a percentage by
setting the value to a string representation of a percentage (eg. "50%"), it represents a percentage of total Pods. */
  var minAvailable: de.loosetie.k8s.dsl.types.IntOrPercentage?
  /** Label query over pods whose evictions are managed by the disruption budget. A null selector will match no pods, while an
empty ({}) selector will select all pods within the namespace. */
  val selector: LabelSelector_meta_v1?
  /** UnhealthyPodEvictionPolicy defines the criteria for when unhealthy pods should be considered for eviction. Current
implementation considers healthy pods, as pods that have status.conditions item with type="Ready",status="True". Valid
policies are IfHealthyBudget and AlwaysAllow. If no policy is specified, the default behavior will be used, which
corresponds to the IfHealthyBudget policy. IfHealthyBudget policy means that running pods (status.phase="Running"), but
not yet healthy can be evicted only if the guarded application is not disrupted (status.currentHealthy is at least equal
to status.desiredHealthy). Healthy pods will be subject to the PDB for eviction. AlwaysAllow policy means that all
running pods (status.phase="Running"), but not yet healthy are considered disrupted and can be evicted regardless of
whether the criteria in a PDB is met. This means perspective running pods of a disrupted application might not get a
chance to become healthy. Healthy pods will be subject to the PDB for eviction. Additional policies may be added in the
future. Clients making eviction decisions should disallow eviction of unhealthy pods if they encounter an unrecognized
policy in this field. This field is beta-level. The eviction API uses this field when the feature gate
PDBUnhealthyPodEvictionPolicy is enabled (enabled by default). */
  @K8sDslMarker var unhealthyPodEvictionPolicy: String?
}