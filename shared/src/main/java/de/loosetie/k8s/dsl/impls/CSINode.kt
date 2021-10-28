package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class CSINode_storage_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSINode_storage_k8s_io_v1beta1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override lateinit var spec: Csinodespec_storage_k8s_io_v1beta1_k8s1_16
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class CSINode_storage_k8s_io_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSINode_storage_k8s_io_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override lateinit var spec: Csinodespec_storage_k8s_io_v1_k8s1_17
}


typealias CSINode_storage_k8s_io_v1_k8s1_18Impl = CSINode_storage_k8s_io_v1_k8s1_17Impl


typealias CSINode_storage_k8s_io_v1_k8s1_19Impl = CSINode_storage_k8s_io_v1_k8s1_18Impl


typealias CSINode_storage_k8s_io_v1_k8s1_20Impl = CSINode_storage_k8s_io_v1_k8s1_19Impl


typealias CSINode_storage_k8s_io_v1_k8s1_21Impl = CSINode_storage_k8s_io_v1_k8s1_20Impl

