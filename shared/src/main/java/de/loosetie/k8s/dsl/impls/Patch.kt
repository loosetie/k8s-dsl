package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("")
class Patch_meta_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Patch_meta_v1_k8s1_16, HasParent {
  
}
typealias Patch_meta_v1_k8s1_17Impl = Patch_meta_v1_k8s1_16Impl
typealias Patch_meta_v1_k8s1_18Impl = Patch_meta_v1_k8s1_17Impl
typealias Patch_meta_v1_k8s1_19Impl = Patch_meta_v1_k8s1_18Impl
typealias Patch_meta_v1_k8s1_20Impl = Patch_meta_v1_k8s1_19Impl
typealias Patch_meta_v1_k8s1_21Impl = Patch_meta_v1_k8s1_20Impl