package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("maxUnavailable", "minAvailable", "selector")
class Poddisruptionbudgetspec_policy_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Poddisruptionbudgetspec_policy_v1beta1_k8s1_16, HasParent {
  override var selector: LabelSelector_meta_v1_k8s1_16? = null
}
typealias Poddisruptionbudgetspec_policy_v1beta1_k8s1_17Impl = Poddisruptionbudgetspec_policy_v1beta1_k8s1_16Impl
typealias Poddisruptionbudgetspec_policy_v1beta1_k8s1_18Impl = Poddisruptionbudgetspec_policy_v1beta1_k8s1_17Impl
typealias Poddisruptionbudgetspec_policy_v1beta1_k8s1_19Impl = Poddisruptionbudgetspec_policy_v1beta1_k8s1_18Impl
typealias Poddisruptionbudgetspec_policy_v1beta1_k8s1_20Impl = Poddisruptionbudgetspec_policy_v1beta1_k8s1_19Impl
@JsonPropertyOrder("maxUnavailable", "minAvailable", "selector")
class Poddisruptionbudgetspec_policy_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Poddisruptionbudgetspec_policy_v1_k8s1_21, HasParent {
  override var selector: LabelSelector_meta_v1_k8s1_21? = null
}

