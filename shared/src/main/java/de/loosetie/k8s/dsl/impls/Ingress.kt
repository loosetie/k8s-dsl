package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class Ingress_networking_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Ingress_networking_k8s_io_v1beta1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override lateinit var spec: Ingressspec_networking_k8s_io_v1beta1_k8s1_16
  override var status: Ingressstatus_networking_k8s_io_v1beta1_k8s1_16? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class Ingress_networking_k8s_io_v1beta1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Ingress_networking_k8s_io_v1beta1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override lateinit var spec: Ingressspec_networking_k8s_io_v1beta1_k8s1_17
  override var status: Ingressstatus_networking_k8s_io_v1beta1_k8s1_17? = null
}
typealias Ingress_networking_k8s_io_v1beta1_k8s1_18Impl = Ingress_networking_k8s_io_v1beta1_k8s1_17Impl
@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class Ingress_networking_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Ingress_networking_k8s_io_v1_k8s1_19, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_19
  override lateinit var spec: Ingressspec_networking_k8s_io_v1_k8s1_19
  override var status: Ingressstatus_networking_k8s_io_v1_k8s1_19? = null
}


typealias Ingress_networking_k8s_io_v1_k8s1_20Impl = Ingress_networking_k8s_io_v1_k8s1_19Impl


typealias Ingress_networking_k8s_io_v1_k8s1_21Impl = Ingress_networking_k8s_io_v1_k8s1_20Impl

