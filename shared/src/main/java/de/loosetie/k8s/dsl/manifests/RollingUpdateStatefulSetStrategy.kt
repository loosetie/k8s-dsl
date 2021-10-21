package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface RollingUpdateStatefulSetStrategy_apps_v1_k8s1_16: K8sManifest {
  /** Partition indicates the ordinal at which the StatefulSet should be partitioned. Default value is 0. */
  @K8sDslMarker var partition: Int?
}      
typealias RollingUpdateStatefulSetStrategy_apps_v1_k8s1_17 = RollingUpdateStatefulSetStrategy_apps_v1_k8s1_16       
typealias RollingUpdateStatefulSetStrategy_apps_v1_k8s1_18 = RollingUpdateStatefulSetStrategy_apps_v1_k8s1_17       
typealias RollingUpdateStatefulSetStrategy_apps_v1_k8s1_19 = RollingUpdateStatefulSetStrategy_apps_v1_k8s1_18       
typealias RollingUpdateStatefulSetStrategy_apps_v1_k8s1_20 = RollingUpdateStatefulSetStrategy_apps_v1_k8s1_19       
typealias RollingUpdateStatefulSetStrategy_apps_v1_k8s1_21 = RollingUpdateStatefulSetStrategy_apps_v1_k8s1_20 