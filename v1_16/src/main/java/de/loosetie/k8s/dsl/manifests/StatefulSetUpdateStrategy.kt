package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface StatefulSetUpdateStrategy_apps_v1: K8sManifest {
  /** RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType. */
  val rollingUpdate: RollingUpdateStatefulSetStrategy_apps_v1?
  /** Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate. */
  @K8sDslMarker var type: String?
}