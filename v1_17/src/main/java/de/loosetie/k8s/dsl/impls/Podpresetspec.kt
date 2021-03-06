package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("env", "envFrom", "selector", "volumeMounts", "volumes")
class Podpresetspec_settings_k8s_io_v1alpha1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Podpresetspec_settings_k8s_io_v1alpha1, HasParent {
  override var env: List<EnvVar_core_v1>? = null
  override var envFrom: List<EnvFromSource_core_v1>? = null
  override var selector: LabelSelector_meta_v1? = null
  override var volumeMounts: List<VolumeMount_core_v1>? = null
  override var volumes: List<Volume_core_v1>? = null
}