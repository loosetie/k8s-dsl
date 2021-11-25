package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "data", "revision")
class ControllerRevision_apps_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ControllerRevision_apps_v1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override var data: ByteArray? = null
  override var revision: Int? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "data", "revision")
class ControllerRevision_apps_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ControllerRevision_apps_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override var data: ByteArray? = null
  override var revision: Int? = null
}
typealias ControllerRevision_apps_v1_k8s1_18Impl = ControllerRevision_apps_v1_k8s1_17Impl
typealias ControllerRevision_apps_v1_k8s1_19Impl = ControllerRevision_apps_v1_k8s1_18Impl
typealias ControllerRevision_apps_v1_k8s1_20Impl = ControllerRevision_apps_v1_k8s1_19Impl
typealias ControllerRevision_apps_v1_k8s1_21Impl = ControllerRevision_apps_v1_k8s1_20Impl