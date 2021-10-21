package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Taint_core_v1_k8s1_16: K8sManifest {
  /** Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule
and NoExecute. */
  @K8sDslMarker var effect: String?
  /** Required. The taint key to be applied to a node. */
  @K8sDslMarker var key: String?
  /** TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints. */
  val timeAdded: Time_meta_v1_k8s1_16?
  /** Required. The taint value corresponding to the taint key. */
  @K8sDslMarker var value: String?
}      
typealias Taint_core_v1_k8s1_17 = Taint_core_v1_k8s1_16       
@K8sDslMarker
interface Taint_core_v1_k8s1_18: Taint_core_v1_k8s1_17 {
  /** The taint value corresponding to the taint key. */
  override var value: String?
}      
typealias Taint_core_v1_k8s1_19 = Taint_core_v1_k8s1_18       
typealias Taint_core_v1_k8s1_20 = Taint_core_v1_k8s1_19       
typealias Taint_core_v1_k8s1_21 = Taint_core_v1_k8s1_20 