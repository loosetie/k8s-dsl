package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface HPAScalingRules_autoscaling_v2: K8sManifest {
  /** policies is a list of potential scaling polices which can be used during scaling. At least one policy must be specified,
otherwise the HPAScalingRules will be discarded as invalid */
  val policies: List<HPAScalingPolicy_autoscaling_v2>?
  /** selectPolicy is used to specify which policy should be used. If not set, the default value Max is used. */
  @K8sDslMarker var selectPolicy: String?
  /** StabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up
or scaling down. StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one
hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300
(i.e. the stabilization window is 300 seconds long). */
  @K8sDslMarker var stabilizationWindowSeconds: Int?
}