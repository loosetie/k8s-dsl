package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("groupVersion", "version")
open class GroupVersionForDiscovery_meta_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: GroupVersionForDiscovery_meta_v1, HasParent {
  override var groupVersion: String? = null
  override var version: String? = null
}