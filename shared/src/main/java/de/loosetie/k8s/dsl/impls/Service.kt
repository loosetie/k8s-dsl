package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class Service_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Service_core_v1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override lateinit var spec: Servicespec_core_v1_k8s1_16
  override var status: Servicestatus_core_v1_k8s1_16? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class Service_core_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Service_core_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override lateinit var spec: Servicespec_core_v1_k8s1_17
  override var status: Servicestatus_core_v1_k8s1_17? = null
}
typealias Service_core_v1_k8s1_18Impl = Service_core_v1_k8s1_17Impl
typealias Service_core_v1_k8s1_19Impl = Service_core_v1_k8s1_18Impl
@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class Service_core_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Service_core_v1_k8s1_20, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_20
  override lateinit var spec: Servicespec_core_v1_k8s1_20
  override var status: Servicestatus_core_v1_k8s1_20? = null
}
typealias Service_core_v1_k8s1_21Impl = Service_core_v1_k8s1_20Impl