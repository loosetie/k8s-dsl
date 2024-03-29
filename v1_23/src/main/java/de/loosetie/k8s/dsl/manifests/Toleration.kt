package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Toleration_core_v1: K8sManifest {
  /** Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are
NoSchedule, PreferNoSchedule and NoExecute. Possible enum values: - `"NoExecute"` Evict any already-running pods that do
not tolerate the taint. Currently enforced by NodeController. - `"NoSchedule"` Do not allow new pods to schedule onto
the node unless they tolerate the taint, but allow all pods submitted to Kubelet without going through the scheduler to
start, and allow all already-running pods to continue running. Enforced by the scheduler. - `"PreferNoSchedule"` Like
TaintEffectNoSchedule, but the scheduler tries not to schedule new pods onto the node, rather than prohibiting new pods
from scheduling onto the node entirely. Enforced by the scheduler. */
  @K8sDslMarker var effect: String?
  /** Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator
must be Exists; this combination means to match all values and all keys. */
  @K8sDslMarker var key: String?
  /** Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists
is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category. Possible enum
values: - `"Equal"` - `"Exists"` */
  @K8sDslMarker var operator: String?
  /** TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field
is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero
and negative values will be treated as 0 (evict immediately) by the system. */
  @K8sDslMarker var tolerationSeconds: Int?
  /** Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just
a regular string. */
  @K8sDslMarker var value: String?
}