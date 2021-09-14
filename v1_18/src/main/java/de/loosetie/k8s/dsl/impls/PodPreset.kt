package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class PodPreset_settings_k8s_io_v1alpha1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodPreset_settings_k8s_io_v1alpha1_k8s1_18, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_18
  override lateinit var spec: Podpresetspec_settings_k8s_io_v1alpha1_k8s1_18
}