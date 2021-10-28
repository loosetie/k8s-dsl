package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class ResourceQuota_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourceQuota_core_v1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override lateinit var spec: Resourcequotaspec_core_v1_k8s1_16
  override var status: Resourcequotastatus_core_v1_k8s1_16? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class ResourceQuota_core_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourceQuota_core_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override lateinit var spec: Resourcequotaspec_core_v1_k8s1_17
  override var status: Resourcequotastatus_core_v1_k8s1_17? = null
}
typealias ResourceQuota_core_v1_k8s1_18Impl = ResourceQuota_core_v1_k8s1_17Impl
typealias ResourceQuota_core_v1_k8s1_19Impl = ResourceQuota_core_v1_k8s1_18Impl
typealias ResourceQuota_core_v1_k8s1_20Impl = ResourceQuota_core_v1_k8s1_19Impl
typealias ResourceQuota_core_v1_k8s1_21Impl = ResourceQuota_core_v1_k8s1_20Impl