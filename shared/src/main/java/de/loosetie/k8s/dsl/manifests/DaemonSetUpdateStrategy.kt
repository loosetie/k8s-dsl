package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface DaemonSetUpdateStrategy_apps_v1_k8s1_16: K8sManifest {
  /** Rolling update config params. Present only if type = "RollingUpdate". */
  val rollingUpdate: Rollingupdatedaemonset_apps_v1_k8s1_16?
  /** Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate. */
  @K8sDslMarker var type: String?
}      
typealias DaemonSetUpdateStrategy_apps_v1_k8s1_17 = DaemonSetUpdateStrategy_apps_v1_k8s1_16       
typealias DaemonSetUpdateStrategy_apps_v1_k8s1_18 = DaemonSetUpdateStrategy_apps_v1_k8s1_17       
typealias DaemonSetUpdateStrategy_apps_v1_k8s1_19 = DaemonSetUpdateStrategy_apps_v1_k8s1_18       
typealias DaemonSetUpdateStrategy_apps_v1_k8s1_20 = DaemonSetUpdateStrategy_apps_v1_k8s1_19       
typealias DaemonSetUpdateStrategy_apps_v1_k8s1_21 = DaemonSetUpdateStrategy_apps_v1_k8s1_20 