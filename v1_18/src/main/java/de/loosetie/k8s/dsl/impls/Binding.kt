package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.Binding_core_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.ObjectMeta_meta_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.ObjectReference_core_v1_k8s1_18

@JsonPropertyOrder("apiVersion", "kind", "metadata", "target")
class Binding_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Binding_core_v1_k8s1_18, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_18
  override var target: ObjectReference_core_v1_k8s1_18? = null
}