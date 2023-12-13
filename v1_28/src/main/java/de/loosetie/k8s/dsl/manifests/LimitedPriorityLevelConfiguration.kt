package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface LimitedPriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta3: K8sManifest {
  /** `borrowingLimitPercent`, if present, configures a limit on how many seats this priority level can borrow from other
priority levels. The limit is known as this level's BorrowingConcurrencyLimit (BorrowingCL) and is a limit on the total
number of seats that this level may borrow at any one time. This field holds the ratio of that limit to the level's
nominal concurrency limit. When this field is non-nil, it must hold a non-negative integer and the limit is calculated
as follows. BorrowingCL(i) = round( NominalCL(i) `*` borrowingLimitPercent(i)/100.0 ) The value of this field can be
more than 100, implying that this priority level can borrow a number of seats that is greater than its own nominal
concurrency limit (NominalCL). When this field is left `nil`, the limit is effectively infinite. */
  @K8sDslMarker var borrowingLimitPercent: Int?
  /** `lendablePercent` prescribes the fraction of the level's NominalCL that can be borrowed by other priority levels. The
value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels
can borrow from this level, known as this level's LendableConcurrencyLimit (LendableCL), is defined as follows.
LendableCL(i) = round( NominalCL(i) `*` lendablePercent(i)/100.0 ) */
  @K8sDslMarker var lendablePercent: Int?
  /** `limitResponse` indicates what to do with requests that can not be executed right now */
  val limitResponse: LimitResponse_flowcontrol_apiserver_k8s_io_v1beta3?
  /** `nominalConcurrencyShares` (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this
level. This is the number of execution seats available at this priority level. This is used both for requests dispatched
from this priority level as well as requests dispatched from other priority levels borrowing seats from this level. The
server's concurrency limit (ServerCL) is divided among the Limited priority levels in proportion to their NCS values:
NominalCL(i) = ceil( ServerCL `*` NCS(i) / sum_ncs ) sum_ncs = sum[priority level k] NCS(k) Bigger numbers mean a larger
nominal concurrency limit, at the expense of every other priority level. This field has a default value of 30. */
  @K8sDslMarker var nominalConcurrencyShares: Int?
}