package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name")
class ResourceClaim_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: ResourceClaim_core_v1, HasParent {
  override var name: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class ResourceClaim_resource_k8s_io_v1alpha2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
  @JsonIgnore
  override val helmVariables: MutableMap<String, String> = mutableMapOf(),
      
)
: ResourceClaim_resource_k8s_io_v1alpha2, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1
  override lateinit var spec: Resourceclaimspec_resource_k8s_io_v1alpha2
  override var status: Resourceclaimstatus_resource_k8s_io_v1alpha2? = null
}