package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ControllerRevision_apps_v1_k8s1_16: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "apps/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ControllerRevision"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1_k8s1_16
  /** Data is the serialized representation of the state. */
  @K8sDslMarker var data: ByteArray?
  /** Revision indicates the revision of the state represented by Data. */
  @K8sDslMarker var revision: Int?
}      
@K8sDslMarker
interface ControllerRevision_apps_v1_k8s1_17: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "apps/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ControllerRevision"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1_k8s1_17
  /** Data is the serialized representation of the state. */
  @K8sDslMarker var data: ByteArray?
  /** Revision indicates the revision of the state represented by Data. */
  @K8sDslMarker var revision: Int?
}      
typealias ControllerRevision_apps_v1_k8s1_18 = ControllerRevision_apps_v1_k8s1_17       
typealias ControllerRevision_apps_v1_k8s1_19 = ControllerRevision_apps_v1_k8s1_18       
typealias ControllerRevision_apps_v1_k8s1_20 = ControllerRevision_apps_v1_k8s1_19       
typealias ControllerRevision_apps_v1_k8s1_21 = ControllerRevision_apps_v1_k8s1_20 