package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@Deprecated(message="Old api version")
@K8sDslMarker
interface Scalestatus_apps_v1beta1_k8s1_17: K8sManifest {
  /** actual number of observed instances of the scaled object. */
  @K8sDslMarker var replicas: Int?
  /** label query over pods that should match the replicas count. More info:
http://kubernetes.io/docs/user-guide/labels#label-selectors */
  @K8sDslMarker var selector: Any?
  /** label selector for pods that should match the replicas count. This is a serializated version of both map-based and more
expressive set-based selectors. This is done to avoid introspection in the clients. The string will be in the same
format as the query-param syntax. If the target type only supports map-based selectors, both this field and map-based
selector field are populated. More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  @K8sDslMarker var targetSelector: String?
}      
      
      
      
