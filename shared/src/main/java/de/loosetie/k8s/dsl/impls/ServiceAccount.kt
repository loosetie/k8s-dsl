package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "automountServiceAccountToken", "imagePullSecrets", "secrets")
class ServiceAccount_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceAccount_core_v1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override var automountServiceAccountToken: Boolean? = null
  override var imagePullSecrets: List<LocalObjectReference_core_v1_k8s1_16>? = null
  override var secrets: List<ObjectReference_core_v1_k8s1_16>? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "automountServiceAccountToken", "imagePullSecrets", "secrets")
class ServiceAccount_core_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceAccount_core_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override var automountServiceAccountToken: Boolean? = null
  override var imagePullSecrets: List<LocalObjectReference_core_v1_k8s1_17>? = null
  override var secrets: List<ObjectReference_core_v1_k8s1_17>? = null
}
typealias ServiceAccount_core_v1_k8s1_18Impl = ServiceAccount_core_v1_k8s1_17Impl
typealias ServiceAccount_core_v1_k8s1_19Impl = ServiceAccount_core_v1_k8s1_18Impl
typealias ServiceAccount_core_v1_k8s1_20Impl = ServiceAccount_core_v1_k8s1_19Impl
typealias ServiceAccount_core_v1_k8s1_21Impl = ServiceAccount_core_v1_k8s1_20Impl