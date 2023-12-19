package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface HPAScalingPolicy_autoscaling_v2: K8sManifest {
  /** periodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than
zero and less than or equal to 1800 (30 min). */
  @K8sDslMarker var periodSeconds: Int?
  /** type is used to specify the scaling policy. */
  @K8sDslMarker var type: String?
  /** value contains the amount of change which is permitted by the policy. It must be greater than zero */
  @K8sDslMarker var value: Int?
}