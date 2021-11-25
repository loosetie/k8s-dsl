package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ResourceRequirements_core_v1_k8s1_16: K8sManifest {
  /** Limits describes the maximum amount of compute resources allowed. More info:
https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/ */
  var limits: de.loosetie.k8s.dsl.types.LimitsAndRequests?
  /** Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults
to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info:
https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/ */
  var requests: de.loosetie.k8s.dsl.types.LimitsAndRequests?
}      
typealias ResourceRequirements_core_v1_k8s1_17 = ResourceRequirements_core_v1_k8s1_16       
typealias ResourceRequirements_core_v1_k8s1_18 = ResourceRequirements_core_v1_k8s1_17       
typealias ResourceRequirements_core_v1_k8s1_19 = ResourceRequirements_core_v1_k8s1_18       
typealias ResourceRequirements_core_v1_k8s1_20 = ResourceRequirements_core_v1_k8s1_19       
@K8sDslMarker
interface ResourceRequirements_core_v1_k8s1_21: ResourceRequirements_core_v1_k8s1_20 {
  /** Limits describes the maximum amount of compute resources allowed. More info:
https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/ */
  override var limits: de.loosetie.k8s.dsl.types.LimitsAndRequests?
  /** Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults
to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info:
https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/ */
  override var requests: de.loosetie.k8s.dsl.types.LimitsAndRequests?
}