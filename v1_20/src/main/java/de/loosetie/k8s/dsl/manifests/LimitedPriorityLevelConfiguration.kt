package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface LimitedPriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20: K8sManifest {
  /** `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this
priority level that may be exeucting at a given time. ACS must be a positive number. The server's concurrency limit
(SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares.
This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for
each such priority level: ACV(l) = ceil( SCL `*` ACS(l) / ( sum[priority levels k] ACS(k) ) ) bigger numbers of ACS mean
more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30. */
  @K8sDslMarker var assuredConcurrencyShares: Int?
  /** `limitResponse` indicates what to do with requests that can not be executed right now */
  val limitResponse: LimitResponse_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20?
}