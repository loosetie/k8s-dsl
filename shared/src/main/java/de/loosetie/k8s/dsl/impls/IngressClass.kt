package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class IngressClass_networking_k8s_io_v1beta1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressClass_networking_k8s_io_v1beta1_k8s1_18, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_18
  override lateinit var spec: Ingressclassspec_networking_k8s_io_v1beta1_k8s1_18
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class IngressClass_networking_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressClass_networking_k8s_io_v1_k8s1_19, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_19
  override lateinit var spec: Ingressclassspec_networking_k8s_io_v1_k8s1_19
}


typealias IngressClass_networking_k8s_io_v1_k8s1_20Impl = IngressClass_networking_k8s_io_v1_k8s1_19Impl


@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class IngressClass_networking_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressClass_networking_k8s_io_v1_k8s1_21, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_21
  override lateinit var spec: Ingressclassspec_networking_k8s_io_v1_k8s1_21
}

