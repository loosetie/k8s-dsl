package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Prioritylevelconfigurationspec_flowcontrol_apiserver_k8s_io_v1beta3: K8sManifest {
  /** `exempt` specifies how requests are handled for an exempt priority level. This field MUST be empty if `type` is
`"Limited"`. This field MAY be non-empty if `type` is `"Exempt"`. If empty and `type` is `"Exempt"` then the default
values for `ExemptPriorityLevelConfiguration` apply. */
  val exempt: ExemptPriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta3?
  /** `limited` specifies how requests are handled for a Limited priority level. This field must be non-empty if and only if
`type` is `"Limited"`. */
  val limited: LimitedPriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta3?
  /** `type` indicates whether this priority level is subject to limitation on request execution. A value of `"Exempt"` means
that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the
capacity made available to other priority levels. A value of `"Limited"` means that (a) requests of this priority level
_are_ subject to limits and (b) some of the server's limited capacity is made available exclusively to this priority
level. Required. */
  @K8sDslMarker var type: String?
}