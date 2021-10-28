package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class PodPreset_settings_k8s_io_v1alpha1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodPreset_settings_k8s_io_v1alpha1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override lateinit var spec: Podpresetspec_settings_k8s_io_v1alpha1_k8s1_16
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class PodPreset_settings_k8s_io_v1alpha1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodPreset_settings_k8s_io_v1alpha1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override lateinit var spec: Podpresetspec_settings_k8s_io_v1alpha1_k8s1_17
}
typealias PodPreset_settings_k8s_io_v1alpha1_k8s1_18Impl = PodPreset_settings_k8s_io_v1alpha1_k8s1_17Impl
@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class PodPreset_settings_k8s_io_v1alpha1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodPreset_settings_k8s_io_v1alpha1_k8s1_19, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_19
  override lateinit var spec: Podpresetspec_settings_k8s_io_v1alpha1_k8s1_19
}

