package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_18: K8sManifest {
  /** scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to scale down to minReplicas
pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used). */
  val scaleDown: HPAScalingRules_autoscaling_v2beta2_k8s1_18?
  /** scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of: `*` increase no more than 4
pods per 60 seconds `*` double the number of pods per 60 seconds No stabilization is used. */
  val scaleUp: HPAScalingRules_autoscaling_v2beta2_k8s1_18?
}      
typealias HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_19 = HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_18       
typealias HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_20 = HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_19       
typealias HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_21 = HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_20 