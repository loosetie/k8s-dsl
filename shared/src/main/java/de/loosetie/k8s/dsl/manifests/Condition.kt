package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Condition_meta_v1_k8s1_20: K8sManifest {
  /** lastTransitionTime is the last time the condition transitioned from one status to another. This should be when the
underlying condition changed. If that is not known, then using the time when the API field changed is acceptable. */
  val lastTransitionTime: Time_meta_v1_k8s1_20?
  /** message is a human readable message indicating details about the transition. This may be an empty string. */
  @K8sDslMarker var message: String?
  /** observedGeneration represents the .metadata.generation that the condition was set based upon. For instance, if
.metadata.generation is currently 12, but the .status.conditions[x].observedGeneration is 9, the condition is out of
date with respect to the current state of the instance. */
  @K8sDslMarker var observedGeneration: Int?
  /** reason contains a programmatic identifier indicating the reason for the condition's last transition. Producers of
specific condition types may define expected values and meanings for this field, and whether the values are considered a
guaranteed API. The value should be a CamelCase string. This field may not be empty. */
  @K8sDslMarker var reason: String?
  /** status of the condition, one of True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** type of condition in CamelCase or in foo.example.com/CamelCase. */
  @K8sDslMarker var type: String?
}      
typealias Condition_meta_v1_k8s1_21 = Condition_meta_v1_k8s1_20 