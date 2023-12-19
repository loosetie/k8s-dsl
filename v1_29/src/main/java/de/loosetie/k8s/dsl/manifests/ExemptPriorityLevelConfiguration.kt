package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ExemptPriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1: K8sManifest {
  /** `lendablePercent` prescribes the fraction of the level's NominalCL that can be borrowed by other priority levels. This
value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels
can borrow from this level, known as this level's LendableConcurrencyLimit (LendableCL), is defined as follows.
LendableCL(i) = round( NominalCL(i) `*` lendablePercent(i)/100.0 ) */
  @K8sDslMarker var lendablePercent: Int?
  /** `nominalConcurrencyShares` (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this
level. This is the number of execution seats nominally reserved for this priority level. This DOES NOT limit the
dispatching from this priority level but affects the other priority levels through the borrowing mechanism. The server's
concurrency limit (ServerCL) is divided among all the priority levels in proportion to their NCS values: NominalCL(i) =
ceil( ServerCL `*` NCS(i) / sum_ncs ) sum_ncs = sum[priority level k] NCS(k) Bigger numbers mean a larger nominal
concurrency limit, at the expense of every other priority level. This field has a default value of zero. */
  @K8sDslMarker var nominalConcurrencyShares: Int?
}