package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Lease_coordination_k8s_io_v1_k8s1_16: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "coordination.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Lease"
  /** More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1_k8s1_16
  /** Specification of the Lease. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Leasespec_coordination_k8s_io_v1_k8s1_16
}      
typealias Lease_coordination_k8s_io_v1_k8s1_17 = Lease_coordination_k8s_io_v1_k8s1_16       
typealias Lease_coordination_k8s_io_v1_k8s1_18 = Lease_coordination_k8s_io_v1_k8s1_17       
typealias Lease_coordination_k8s_io_v1_k8s1_19 = Lease_coordination_k8s_io_v1_k8s1_18       
typealias Lease_coordination_k8s_io_v1_k8s1_20 = Lease_coordination_k8s_io_v1_k8s1_19       
typealias Lease_coordination_k8s_io_v1_k8s1_21 = Lease_coordination_k8s_io_v1_k8s1_20 