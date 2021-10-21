package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface StatefulSetUpdateStrategy_apps_v1_k8s1_16: K8sManifest {
  /** RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType. */
  val rollingUpdate: RollingUpdateStatefulSetStrategy_apps_v1_k8s1_16?
  /** Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate. */
  @K8sDslMarker var type: String?
}      
typealias StatefulSetUpdateStrategy_apps_v1_k8s1_17 = StatefulSetUpdateStrategy_apps_v1_k8s1_16       
typealias StatefulSetUpdateStrategy_apps_v1_k8s1_18 = StatefulSetUpdateStrategy_apps_v1_k8s1_17       
typealias StatefulSetUpdateStrategy_apps_v1_k8s1_19 = StatefulSetUpdateStrategy_apps_v1_k8s1_18       
typealias StatefulSetUpdateStrategy_apps_v1_k8s1_20 = StatefulSetUpdateStrategy_apps_v1_k8s1_19       
typealias StatefulSetUpdateStrategy_apps_v1_k8s1_21 = StatefulSetUpdateStrategy_apps_v1_k8s1_20 