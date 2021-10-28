package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class Namespace_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Namespace_core_v1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override lateinit var spec: Namespacespec_core_v1_k8s1_16
  override var status: Namespacestatus_core_v1_k8s1_16? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class Namespace_core_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Namespace_core_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override lateinit var spec: Namespacespec_core_v1_k8s1_17
  override var status: Namespacestatus_core_v1_k8s1_17? = null
}
typealias Namespace_core_v1_k8s1_18Impl = Namespace_core_v1_k8s1_17Impl
typealias Namespace_core_v1_k8s1_19Impl = Namespace_core_v1_k8s1_18Impl
typealias Namespace_core_v1_k8s1_20Impl = Namespace_core_v1_k8s1_19Impl
typealias Namespace_core_v1_k8s1_21Impl = Namespace_core_v1_k8s1_20Impl