package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Toleration_core_v1_k8s1_19: K8sManifest {
  /** Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are
NoSchedule, PreferNoSchedule and NoExecute. */
  @K8sDslMarker var effect: String?
  /** Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator
must be Exists; this combination means to match all values and all keys. */
  @K8sDslMarker var key: String?
  /** Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists
is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category. */
  @K8sDslMarker var operator: String?
  /** TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field
is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero
and negative values will be treated as 0 (evict immediately) by the system. */
  @K8sDslMarker var tolerationSeconds: Int?
  /** Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just
a regular string. */
  @K8sDslMarker var value: String?
}