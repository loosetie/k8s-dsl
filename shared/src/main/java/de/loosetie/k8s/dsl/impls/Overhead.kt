package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("podFixed")
class Overhead_node_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Overhead_node_k8s_io_v1beta1_k8s1_16, HasParent {
  override var podFixed: de.loosetie.k8s.dsl.types.LimitsAndRequests? = null
}
typealias Overhead_node_k8s_io_v1beta1_k8s1_17Impl = Overhead_node_k8s_io_v1beta1_k8s1_16Impl
typealias Overhead_node_k8s_io_v1beta1_k8s1_18Impl = Overhead_node_k8s_io_v1beta1_k8s1_17Impl
typealias Overhead_node_k8s_io_v1beta1_k8s1_19Impl = Overhead_node_k8s_io_v1beta1_k8s1_18Impl
@JsonPropertyOrder("podFixed")
class Overhead_node_k8s_io_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Overhead_node_k8s_io_v1_k8s1_20, HasParent {
  override var podFixed: de.loosetie.k8s.dsl.types.LimitsAndRequests? = null
}


typealias Overhead_node_k8s_io_v1_k8s1_21Impl = Overhead_node_k8s_io_v1_k8s1_20Impl

