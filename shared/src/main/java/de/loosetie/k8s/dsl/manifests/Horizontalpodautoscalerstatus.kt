package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_16: K8sManifest {
  /** current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an
average pod is using now 70% of its requested CPU. */
  @K8sDslMarker var currentCPUUtilizationPercentage: Int?
  /** current number of replicas of pods managed by this autoscaler. */
  @K8sDslMarker var currentReplicas: Int?
  /** desired number of replicas of pods managed by this autoscaler. */
  @K8sDslMarker var desiredReplicas: Int?
  /** last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number
of pods is changed. */
  val lastScaleTime: Time_meta_v1_k8s1_16?
  /** most recent generation observed by this autoscaler. */
  @K8sDslMarker var observedGeneration: Int?
}      
typealias Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_17 = Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_16       
typealias Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_18 = Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_17       
typealias Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_19 = Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_18       
typealias Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_20 = Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_19       
typealias Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_21 = Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_20 