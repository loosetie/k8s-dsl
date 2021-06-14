package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Ingress_networking_k8s_io_v1beta1: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "networking.k8s.io/v1beta1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Ingress"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1
  /** Spec is the desired state of the Ingress. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Ingressspec_networking_k8s_io_v1beta1
  /** Status is the current state of the Ingress. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val status: Ingressstatus_networking_k8s_io_v1beta1?
}