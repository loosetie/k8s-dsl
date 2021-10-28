package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface HorizontalPodAutoscaler_autoscaling_v1_k8s1_16: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "autoscaling/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "HorizontalPodAutoscaler"
  /** Standard object metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1_k8s1_16
  /** behaviour of autoscaler. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status. */
  val spec: Horizontalpodautoscalerspec_autoscaling_v1_k8s1_16
  /** current information about the autoscaler. */
  val status: Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_16?
}      
@K8sDslMarker
interface HorizontalPodAutoscaler_autoscaling_v1_k8s1_17: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "autoscaling/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "HorizontalPodAutoscaler"
  /** Standard object metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1_k8s1_17
  /** behaviour of autoscaler. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status. */
  val spec: Horizontalpodautoscalerspec_autoscaling_v1_k8s1_17
  /** current information about the autoscaler. */
  val status: Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_17?
}      
typealias HorizontalPodAutoscaler_autoscaling_v1_k8s1_18 = HorizontalPodAutoscaler_autoscaling_v1_k8s1_17       
typealias HorizontalPodAutoscaler_autoscaling_v1_k8s1_19 = HorizontalPodAutoscaler_autoscaling_v1_k8s1_18       
typealias HorizontalPodAutoscaler_autoscaling_v1_k8s1_20 = HorizontalPodAutoscaler_autoscaling_v1_k8s1_19       
typealias HorizontalPodAutoscaler_autoscaling_v1_k8s1_21 = HorizontalPodAutoscaler_autoscaling_v1_k8s1_20 