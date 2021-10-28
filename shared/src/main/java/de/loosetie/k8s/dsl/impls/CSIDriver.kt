package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class CSIDriver_storage_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSIDriver_storage_k8s_io_v1beta1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override lateinit var spec: Csidriverspec_storage_k8s_io_v1beta1_k8s1_16
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class CSIDriver_storage_k8s_io_v1beta1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSIDriver_storage_k8s_io_v1beta1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override lateinit var spec: Csidriverspec_storage_k8s_io_v1beta1_k8s1_17
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class CSIDriver_storage_k8s_io_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSIDriver_storage_k8s_io_v1_k8s1_18, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_18
  override lateinit var spec: Csidriverspec_storage_k8s_io_v1_k8s1_18
}


typealias CSIDriver_storage_k8s_io_v1_k8s1_19Impl = CSIDriver_storage_k8s_io_v1_k8s1_18Impl


typealias CSIDriver_storage_k8s_io_v1_k8s1_20Impl = CSIDriver_storage_k8s_io_v1_k8s1_19Impl


@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class CSIDriver_storage_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSIDriver_storage_k8s_io_v1_k8s1_21, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_21
  override lateinit var spec: Csidriverspec_storage_k8s_io_v1_k8s1_21
}

