package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Status_meta_v1_k8s1_20: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "meta/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Status"
  /** Standard list metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  val metadata: ListMeta_meta_v1_k8s1_20
  /** Suggested HTTP return code for this status, 0 if not set. */
  @K8sDslMarker var code: Int?
  /** Extended data associated with the reason. Each reason may define its own extended details. This field is optional and
the data returned is not guaranteed to conform to any schema except that defined by the reason type. */
  val details: StatusDetails_meta_v1_k8s1_20?
  /** A human-readable description of the status of this operation. */
  @K8sDslMarker var message: String?
  /** A machine-readable description of why this operation is in the "Failure" status. If this value is empty there is no
information available. A Reason clarifies an HTTP status code but does not override it. */
  @K8sDslMarker var reason: String?
  /** Status of the operation. One of: "Success" or "Failure". More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  @K8sDslMarker var status: String?
}