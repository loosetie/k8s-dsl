package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface StatefulSetUpdateStrategy_apps_v1_k8s1_19: K8sManifest {
  /** RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType. */
  val rollingUpdate: RollingUpdateStatefulSetStrategy_apps_v1_k8s1_19?
  /** Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate. */
  @K8sDslMarker var type: String?
}