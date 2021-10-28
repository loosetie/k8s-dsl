package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("resourceVersion", "uid")
class Preconditions_meta_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Preconditions_meta_v1_k8s1_16, HasParent {
  override var resourceVersion: String? = null
  override var uid: String? = null
}
typealias Preconditions_meta_v1_k8s1_17Impl = Preconditions_meta_v1_k8s1_16Impl
typealias Preconditions_meta_v1_k8s1_18Impl = Preconditions_meta_v1_k8s1_17Impl
typealias Preconditions_meta_v1_k8s1_19Impl = Preconditions_meta_v1_k8s1_18Impl
typealias Preconditions_meta_v1_k8s1_20Impl = Preconditions_meta_v1_k8s1_19Impl
typealias Preconditions_meta_v1_k8s1_21Impl = Preconditions_meta_v1_k8s1_20Impl