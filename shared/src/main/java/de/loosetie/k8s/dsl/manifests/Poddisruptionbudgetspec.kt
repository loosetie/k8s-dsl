package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Poddisruptionbudgetspec_policy_v1beta1_k8s1_16: K8sManifest {
  /** An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e.
even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a
mutually exclusive setting with "minAvailable". */
  // val maxUnavailable: None
  /** An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the
eviction, i.e. even in the absence of the evicted pod. So for example you can prevent all voluntary evictions by
specifying "100%". */
  // val minAvailable: None
  /** Label query over pods whose evictions are managed by the disruption budget. */
  val selector: LabelSelector_meta_v1_k8s1_16?
}      
typealias Poddisruptionbudgetspec_policy_v1beta1_k8s1_17 = Poddisruptionbudgetspec_policy_v1beta1_k8s1_16       
typealias Poddisruptionbudgetspec_policy_v1beta1_k8s1_18 = Poddisruptionbudgetspec_policy_v1beta1_k8s1_17       
typealias Poddisruptionbudgetspec_policy_v1beta1_k8s1_19 = Poddisruptionbudgetspec_policy_v1beta1_k8s1_18       
typealias Poddisruptionbudgetspec_policy_v1beta1_k8s1_20 = Poddisruptionbudgetspec_policy_v1beta1_k8s1_19       
@K8sDslMarker
interface Poddisruptionbudgetspec_policy_v1_k8s1_21: K8sManifest {
  /** An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e.
even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a
mutually exclusive setting with "minAvailable". */
  // val maxUnavailable: None
  /** An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the
eviction, i.e. even in the absence of the evicted pod. So for example you can prevent all voluntary evictions by
specifying "100%". */
  // val minAvailable: None
  /** Label query over pods whose evictions are managed by the disruption budget. A null selector will match no pods, while an
empty ({}) selector will select all pods within the namespace. */
  val selector: LabelSelector_meta_v1_k8s1_21?
}

