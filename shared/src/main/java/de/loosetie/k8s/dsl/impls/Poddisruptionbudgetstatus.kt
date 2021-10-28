package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("currentHealthy", "desiredHealthy", "disruptedPods", "disruptionsAllowed", "expectedPods", "observedGeneration")
class Poddisruptionbudgetstatus_policy_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Poddisruptionbudgetstatus_policy_v1beta1_k8s1_16, HasParent {
  override var currentHealthy: Int? = null
  override var desiredHealthy: Int? = null
  override var disruptedPods: Any? = null
  override var disruptionsAllowed: Int? = null
  override var expectedPods: Int? = null
  override var observedGeneration: Int? = null
}
@JsonPropertyOrder("currentHealthy", "desiredHealthy", "disruptedPods", "disruptionsAllowed", "expectedPods", "observedGeneration")
class Poddisruptionbudgetstatus_policy_v1beta1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Poddisruptionbudgetstatus_policy_v1beta1_k8s1_17, HasParent {
  override var currentHealthy: Int? = null
  override var desiredHealthy: Int? = null
  override var disruptedPods: Any? = null
  override var disruptionsAllowed: Int? = null
  override var expectedPods: Int? = null
  override var observedGeneration: Int? = null
}
@JsonPropertyOrder("currentHealthy", "desiredHealthy", "disruptedPods", "disruptionsAllowed", "expectedPods", "observedGeneration")
class Poddisruptionbudgetstatus_policy_v1beta1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Poddisruptionbudgetstatus_policy_v1beta1_k8s1_18, HasParent {
  override var currentHealthy: Int? = null
  override var desiredHealthy: Int? = null
  override var disruptedPods: Any? = null
  override var disruptionsAllowed: Int? = null
  override var expectedPods: Int? = null
  override var observedGeneration: Int? = null
}
typealias Poddisruptionbudgetstatus_policy_v1beta1_k8s1_19Impl = Poddisruptionbudgetstatus_policy_v1beta1_k8s1_18Impl
typealias Poddisruptionbudgetstatus_policy_v1beta1_k8s1_20Impl = Poddisruptionbudgetstatus_policy_v1beta1_k8s1_19Impl
@JsonPropertyOrder("conditions", "currentHealthy", "desiredHealthy", "disruptedPods", "disruptionsAllowed", "expectedPods", "observedGeneration")
class Poddisruptionbudgetstatus_policy_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Poddisruptionbudgetstatus_policy_v1_k8s1_21, HasParent {
  override var conditions: List<Condition_meta_v1_k8s1_21>? = null
  override var currentHealthy: Int? = null
  override var desiredHealthy: Int? = null
  override var disruptedPods: Any? = null
  override var disruptionsAllowed: Int? = null
  override var expectedPods: Int? = null
  override var observedGeneration: Int? = null
}

