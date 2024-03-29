package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Deploymentstrategy_apps_v1: K8sManifest {
  /** Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate. */
  val rollingUpdate: Rollingupdatedeployment_apps_v1?
  /** Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate. Possible enum values: - `"Recreate"`
Kill all existing pods before creating new ones. - `"RollingUpdate"` Replace the old ReplicaSets by new one using
rolling update i.e gradually scale down the old ReplicaSets and scale up the new one. */
  @K8sDslMarker var type: String?
}