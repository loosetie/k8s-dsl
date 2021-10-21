package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ConfigMapProjection_core_v1_k8s1_16: K8sManifest {
  /** Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a
file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified
paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume
setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with
'..'. */
  val items: List<KeyToPath_core_v1_k8s1_16>?
  /** Specify whether the ConfigMap or its keys must be defined */
  @K8sDslMarker var optional: Boolean?
}      
typealias ConfigMapProjection_core_v1_k8s1_17 = ConfigMapProjection_core_v1_k8s1_16       
typealias ConfigMapProjection_core_v1_k8s1_18 = ConfigMapProjection_core_v1_k8s1_17       
typealias ConfigMapProjection_core_v1_k8s1_19 = ConfigMapProjection_core_v1_k8s1_18       
typealias ConfigMapProjection_core_v1_k8s1_20 = ConfigMapProjection_core_v1_k8s1_19       
typealias ConfigMapProjection_core_v1_k8s1_21 = ConfigMapProjection_core_v1_k8s1_20 