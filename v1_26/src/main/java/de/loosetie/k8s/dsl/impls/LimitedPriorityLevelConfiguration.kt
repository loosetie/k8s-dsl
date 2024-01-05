package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("borrowingLimitPercent", "lendablePercent", "limitResponse", "nominalConcurrencyShares")
class LimitedPriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta3Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: LimitedPriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta3, HasParent {
  override var borrowingLimitPercent: Int? = null
  override var lendablePercent: Int? = null
  override var limitResponse: LimitResponse_flowcontrol_apiserver_k8s_io_v1beta3? = null
  override var nominalConcurrencyShares: Int? = null
}