package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "deleteOptions")
class Eviction_policy_v1beta1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Eviction_policy_v1beta1_k8s1_21, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_21
  override var deleteOptions: DeleteOptions_meta_v1_k8s1_21? = null
}