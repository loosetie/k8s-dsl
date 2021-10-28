package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "name", "blockOwnerDeletion", "controller", "uid")
class OwnerReference_meta_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: OwnerReference_meta_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var blockOwnerDeletion: Boolean? = null
  override var controller: Boolean? = null
  override var uid: String? = null
}
typealias OwnerReference_meta_v1_k8s1_17Impl = OwnerReference_meta_v1_k8s1_16Impl
typealias OwnerReference_meta_v1_k8s1_18Impl = OwnerReference_meta_v1_k8s1_17Impl
typealias OwnerReference_meta_v1_k8s1_19Impl = OwnerReference_meta_v1_k8s1_18Impl
typealias OwnerReference_meta_v1_k8s1_20Impl = OwnerReference_meta_v1_k8s1_19Impl
typealias OwnerReference_meta_v1_k8s1_21Impl = OwnerReference_meta_v1_k8s1_20Impl