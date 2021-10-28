package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("controller", "parameters")
class Ingressclassspec_networking_k8s_io_v1beta1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Ingressclassspec_networking_k8s_io_v1beta1_k8s1_18, HasParent {
  override var controller: String? = null
  override var parameters: TypedLocalObjectReference_core_v1_k8s1_18? = null
}
@JsonPropertyOrder("controller", "parameters")
class Ingressclassspec_networking_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Ingressclassspec_networking_k8s_io_v1_k8s1_19, HasParent {
  override var controller: String? = null
  override var parameters: TypedLocalObjectReference_core_v1_k8s1_19? = null
}


typealias Ingressclassspec_networking_k8s_io_v1_k8s1_20Impl = Ingressclassspec_networking_k8s_io_v1_k8s1_19Impl


@JsonPropertyOrder("controller", "parameters")
class Ingressclassspec_networking_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Ingressclassspec_networking_k8s_io_v1_k8s1_21, HasParent {
  override var controller: String? = null
  override var parameters: IngressClassParametersReference_networking_k8s_io_v1_k8s1_21? = null
}

