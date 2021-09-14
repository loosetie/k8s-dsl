package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.BoundObjectReference_authentication_k8s_io_v1_k8s1_18

@JsonPropertyOrder("apiVersion", "kind", "name", "uid")
class BoundObjectReference_authentication_k8s_io_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: BoundObjectReference_authentication_k8s_io_v1_k8s1_18, HasParent {
  override var name: String? = null
  override var uid: String? = null
}