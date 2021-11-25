package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Secret_core_v1_k8s1_16: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Secret"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1_k8s1_16
  /** Data contains the secret data. Each key must consist of alphanumeric characters, '-', '_' or '.'. The serialized form of
the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described
in https://tools.ietf.org/html/rfc4648#section-4 */
  @K8sDslMarker var data: Map<String, String>?
  /** stringData allows specifying non-binary secret data in string form. It is provided as a write-only convenience method.
All keys and values are merged into the data field on write, overwriting any existing values. It is never output when
reading from the API. */
  @K8sDslMarker var stringData: Map<String, String>?
  /** Used to facilitate programmatic handling of secret data. */
  @K8sDslMarker var type: String?
}      
@K8sDslMarker
interface Secret_core_v1_k8s1_17: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Secret"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1_k8s1_17
  /** Data contains the secret data. Each key must consist of alphanumeric characters, '-', '_' or '.'. The serialized form of
the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described
in https://tools.ietf.org/html/rfc4648#section-4 */
  @K8sDslMarker var data: Map<String, String>?
  /** stringData allows specifying non-binary secret data in string form. It is provided as a write-only convenience method.
All keys and values are merged into the data field on write, overwriting any existing values. It is never output when
reading from the API. */
  @K8sDslMarker var stringData: Map<String, String>?
  /** Used to facilitate programmatic handling of secret data. */
  @K8sDslMarker var type: String?
}      
@K8sDslMarker
interface Secret_core_v1_k8s1_18: Secret_core_v1_k8s1_17 {
  /** Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be
modified). If not set to true, the field can be modified at any time. Defaulted to nil. This is an alpha field enabled
by ImmutableEphemeralVolumes feature gate. */
  @K8sDslMarker var immutable: Boolean?
}      
@K8sDslMarker
interface Secret_core_v1_k8s1_19: Secret_core_v1_k8s1_18 {
  /** Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be
modified). If not set to true, the field can be modified at any time. Defaulted to nil. This is a beta field enabled by
ImmutableEphemeralVolumes feature gate. */
  override var immutable: Boolean?
}      
typealias Secret_core_v1_k8s1_20 = Secret_core_v1_k8s1_19       
@K8sDslMarker
interface Secret_core_v1_k8s1_21: Secret_core_v1_k8s1_20 {
  /** Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be
modified). If not set to true, the field can be modified at any time. Defaulted to nil. */
  override var immutable: Boolean?
  /** stringData allows specifying non-binary secret data in string form. It is provided as a write-only input field for
convenience. All keys and values are merged into the data field on write, overwriting any existing values. The
stringData field is never output when reading from the API. */
  override var stringData: Map<String, String>?
}