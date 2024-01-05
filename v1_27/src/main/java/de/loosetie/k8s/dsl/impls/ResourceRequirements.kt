package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("claims", "limits", "requests")
class ResourceRequirements_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: ResourceRequirements_core_v1, HasParent {
  override var claims: List<ResourceClaim_core_v1>? = null
  override var limits: de.loosetie.k8s.dsl.types.LimitsAndRequests? = null
  override var requests: de.loosetie.k8s.dsl.types.LimitsAndRequests? = null
}