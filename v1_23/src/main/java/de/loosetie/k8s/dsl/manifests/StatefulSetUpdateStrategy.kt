package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface StatefulSetUpdateStrategy_apps_v1: K8sManifest {
  /** RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType. */
  val rollingUpdate: RollingUpdateStatefulSetStrategy_apps_v1?
  /** Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate. Possible enum values: - `"OnDelete"`
triggers the legacy behavior. Version tracking and ordered rolling restarts are disabled. Pods are recreated from the
StatefulSetSpec when they are manually deleted. When a scale operation is performed with this strategy,specification
version indicated by the StatefulSet's currentRevision. - `"RollingUpdate"` indicates that update will be applied to all
Pods in the StatefulSet with respect to the StatefulSet ordering constraints. When a scale operation is performed with
this strategy, new Pods will be created from the specification version indicated by the StatefulSet's updateRevision. */
  @K8sDslMarker var type: String?
}