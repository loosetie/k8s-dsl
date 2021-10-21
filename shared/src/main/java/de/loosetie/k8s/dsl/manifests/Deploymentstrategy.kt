package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Deploymentstrategy_apps_v1_k8s1_16: K8sManifest {
  /** Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate. */
  val rollingUpdate: Rollingupdatedeployment_apps_v1_k8s1_16?
  /** Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate. */
  @K8sDslMarker var type: String?
}      
typealias Deploymentstrategy_apps_v1_k8s1_17 = Deploymentstrategy_apps_v1_k8s1_16       
typealias Deploymentstrategy_apps_v1_k8s1_18 = Deploymentstrategy_apps_v1_k8s1_17       
typealias Deploymentstrategy_apps_v1_k8s1_19 = Deploymentstrategy_apps_v1_k8s1_18       
typealias Deploymentstrategy_apps_v1_k8s1_20 = Deploymentstrategy_apps_v1_k8s1_19       
typealias Deploymentstrategy_apps_v1_k8s1_21 = Deploymentstrategy_apps_v1_k8s1_20 