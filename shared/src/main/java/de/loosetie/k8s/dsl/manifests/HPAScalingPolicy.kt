package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface HPAScalingPolicy_autoscaling_v2beta2_k8s1_18: K8sManifest {
  /** PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than
zero and less than or equal to 1800 (30 min). */
  @K8sDslMarker var periodSeconds: Int?
  /** Type is used to specify the scaling policy. */
  @K8sDslMarker var type: String?
  /** Value contains the amount of change which is permitted by the policy. It must be greater than zero */
  @K8sDslMarker var value: Int?
}      
typealias HPAScalingPolicy_autoscaling_v2beta2_k8s1_19 = HPAScalingPolicy_autoscaling_v2beta2_k8s1_18       
typealias HPAScalingPolicy_autoscaling_v2beta2_k8s1_20 = HPAScalingPolicy_autoscaling_v2beta2_k8s1_19       
typealias HPAScalingPolicy_autoscaling_v2beta2_k8s1_21 = HPAScalingPolicy_autoscaling_v2beta2_k8s1_20 