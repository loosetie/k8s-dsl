package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Prioritylevelconfigurationspec_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21: K8sManifest {
  /** `limited` specifies how requests are handled for a Limited priority level. This field must be non-empty if and only if
`type` is `"Limited"`. */
  val limited: LimitedPriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21?
  /** `type` indicates whether this priority level is subject to limitation on request execution. A value of `"Exempt"` means
that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the
capacity made available to other priority levels. A value of `"Limited"` means that (a) requests of this priority level
_are_ subject to limits and (b) some of the server's limited capacity is made available exclusively to this priority
level. Required. */
  @K8sDslMarker var type: String?
}