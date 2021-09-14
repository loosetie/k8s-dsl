package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ConfigMap_core_v1_k8s1_21: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ConfigMap"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1_k8s1_21
  /** BinaryData contains the binary data. Each key must consist of alphanumeric characters, '-', '_' or '.'. BinaryData can
contain byte sequences that are not in the UTF-8 range. The keys stored in BinaryData must not overlap with the ones in
the Data field, this is enforced during validation process. Using this field will require 1.10+ apiserver and kubelet. */
  @K8sDslMarker var binaryData: Any?
  /** Data contains the configuration data. Each key must consist of alphanumeric characters, '-', '_' or '.'. Values with
non-UTF-8 byte sequences must use the BinaryData field. The keys stored in Data must not overlap with the keys in the
BinaryData field, this is enforced during validation process. */
  @K8sDslMarker var data: Any?
  /** Immutable, if set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be
modified). If not set to true, the field can be modified at any time. Defaulted to nil. */
  @K8sDslMarker var immutable: Boolean?
}