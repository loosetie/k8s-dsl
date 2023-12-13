package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface StatusDetails_meta_v1: K8sManifest {
  /** The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the
requested resource Kind. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  @K8sDslMarker var kind: String?
  /** The name attribute of the resource associated with the status StatusReason (when there is a single name which can be
described). */
  @K8sDslMarker var name: String?
  /** The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide
detailed causes. */
  val causes: List<StatusCause_meta_v1>?
  /** The group attribute of the resource associated with the status StatusReason. */
  @K8sDslMarker var group: String?
  /** If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take
an alternate action - for those errors this field may indicate how long to wait before taking the alternate action. */
  @K8sDslMarker var retryAfterSeconds: Int?
  /** UID of the resource. (when there is a single resource which can be described). More info:
http://kubernetes.io/docs/user-guide/identifiers#uids */
  @K8sDslMarker var uid: String?
}