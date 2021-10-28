package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "deleteOptions")
class Eviction_policy_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Eviction_policy_v1beta1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override var deleteOptions: DeleteOptions_meta_v1_k8s1_16? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "deleteOptions")
class Eviction_policy_v1beta1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Eviction_policy_v1beta1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override var deleteOptions: DeleteOptions_meta_v1_k8s1_17? = null
}
typealias Eviction_policy_v1beta1_k8s1_18Impl = Eviction_policy_v1beta1_k8s1_17Impl
typealias Eviction_policy_v1beta1_k8s1_19Impl = Eviction_policy_v1beta1_k8s1_18Impl
typealias Eviction_policy_v1beta1_k8s1_20Impl = Eviction_policy_v1beta1_k8s1_19Impl
typealias Eviction_policy_v1beta1_k8s1_21Impl = Eviction_policy_v1beta1_k8s1_20Impl