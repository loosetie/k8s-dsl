package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface CrossVersionObjectReference_autoscaling_v1_k8s1_16: K8sTopLevel {
  /** API version of the referent */
  override val apiVersion: String
    get() = "autoscaling/v1"
  /** Kind of the referent; More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds" */
  override val kind: String
    get() = "CrossVersionObjectReference"
  /** Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names */
  @K8sDslMarker var name: String?
}

@Deprecated(message="Old api version")
@K8sDslMarker
interface CrossVersionObjectReference_autoscaling_v2beta2_k8s1_16: K8sTopLevel {
  /** API version of the referent */
  override val apiVersion: String
    get() = "autoscaling/v2beta2"
  /** Kind of the referent; More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds" */
  override val kind: String
    get() = "CrossVersionObjectReference"
  /** Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names */
  @K8sDslMarker var name: String?
}      
typealias CrossVersionObjectReference_autoscaling_v1_k8s1_17 = CrossVersionObjectReference_autoscaling_v1_k8s1_16 

typealias CrossVersionObjectReference_autoscaling_v2beta2_k8s1_17 = CrossVersionObjectReference_autoscaling_v2beta2_k8s1_16       
typealias CrossVersionObjectReference_autoscaling_v1_k8s1_18 = CrossVersionObjectReference_autoscaling_v1_k8s1_17 

typealias CrossVersionObjectReference_autoscaling_v2beta2_k8s1_18 = CrossVersionObjectReference_autoscaling_v2beta2_k8s1_17       
typealias CrossVersionObjectReference_autoscaling_v1_k8s1_19 = CrossVersionObjectReference_autoscaling_v1_k8s1_18 

typealias CrossVersionObjectReference_autoscaling_v2beta2_k8s1_19 = CrossVersionObjectReference_autoscaling_v2beta2_k8s1_18       
typealias CrossVersionObjectReference_autoscaling_v1_k8s1_20 = CrossVersionObjectReference_autoscaling_v1_k8s1_19 

typealias CrossVersionObjectReference_autoscaling_v2beta2_k8s1_20 = CrossVersionObjectReference_autoscaling_v2beta2_k8s1_19       
typealias CrossVersionObjectReference_autoscaling_v1_k8s1_21 = CrossVersionObjectReference_autoscaling_v1_k8s1_20 

typealias CrossVersionObjectReference_autoscaling_v2beta2_k8s1_21 = CrossVersionObjectReference_autoscaling_v2beta2_k8s1_20 