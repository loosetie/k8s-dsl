package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Leasespec_coordination_k8s_io_v1_k8s1_16: K8sManifest {
  /** acquireTime is a time when the current lease was acquired. */
  val acquireTime: MicroTime_meta_v1_k8s1_16?
  /** holderIdentity contains the identity of the holder of a current lease. */
  @K8sDslMarker var holderIdentity: String?
  /** leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against
time of last observed RenewTime. */
  @K8sDslMarker var leaseDurationSeconds: Int?
  /** leaseTransitions is the number of transitions of a lease between holders. */
  @K8sDslMarker var leaseTransitions: Int?
  /** renewTime is a time when the current holder of a lease has last updated the lease. */
  val renewTime: MicroTime_meta_v1_k8s1_16?
}      
typealias Leasespec_coordination_k8s_io_v1_k8s1_17 = Leasespec_coordination_k8s_io_v1_k8s1_16       
typealias Leasespec_coordination_k8s_io_v1_k8s1_18 = Leasespec_coordination_k8s_io_v1_k8s1_17       
typealias Leasespec_coordination_k8s_io_v1_k8s1_19 = Leasespec_coordination_k8s_io_v1_k8s1_18       
typealias Leasespec_coordination_k8s_io_v1_k8s1_20 = Leasespec_coordination_k8s_io_v1_k8s1_19       
typealias Leasespec_coordination_k8s_io_v1_k8s1_21 = Leasespec_coordination_k8s_io_v1_k8s1_20 