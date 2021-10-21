package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.CSINodeDriver_storage_k8s_io_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.Csinodespec_storage_k8s_io_v1_k8s1_18

@JsonPropertyOrder("drivers")
class Csinodespec_storage_k8s_io_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Csinodespec_storage_k8s_io_v1_k8s1_18, HasParent {
  override var drivers: List<CSINodeDriver_storage_k8s_io_v1_k8s1_18>? = null
}