package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("drivers")
class Csinodespec_storage_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Csinodespec_storage_k8s_io_v1beta1_k8s1_16, HasParent {
  override var drivers: List<CSINodeDriver_storage_k8s_io_v1beta1_k8s1_16>? = null
}
@JsonPropertyOrder("drivers")
class Csinodespec_storage_k8s_io_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Csinodespec_storage_k8s_io_v1_k8s1_17, HasParent {
  override var drivers: List<CSINodeDriver_storage_k8s_io_v1_k8s1_17>? = null
}
typealias Csinodespec_storage_k8s_io_v1_k8s1_18Impl = Csinodespec_storage_k8s_io_v1_k8s1_17Impl
typealias Csinodespec_storage_k8s_io_v1_k8s1_19Impl = Csinodespec_storage_k8s_io_v1_k8s1_18Impl
typealias Csinodespec_storage_k8s_io_v1_k8s1_20Impl = Csinodespec_storage_k8s_io_v1_k8s1_19Impl
typealias Csinodespec_storage_k8s_io_v1_k8s1_21Impl = Csinodespec_storage_k8s_io_v1_k8s1_20Impl