package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "automountServiceAccountToken", "imagePullSecrets", "secrets")
class ServiceAccount_core_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceAccount_core_v1_k8s1_21, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_21
  override var automountServiceAccountToken: Boolean? = null
  override var imagePullSecrets: List<LocalObjectReference_core_v1_k8s1_21>? = null
  override var secrets: List<ObjectReference_core_v1_k8s1_21>? = null
}