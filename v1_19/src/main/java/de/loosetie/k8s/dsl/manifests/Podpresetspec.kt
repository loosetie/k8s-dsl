package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Podpresetspec_settings_k8s_io_v1alpha1_k8s1_19: K8sManifest {
  /** Env defines the collection of EnvVar to inject into containers. */
  val env: List<EnvVar_core_v1_k8s1_19>?
  /** EnvFrom defines the collection of EnvFromSource to inject into containers. */
  val envFrom: List<EnvFromSource_core_v1_k8s1_19>?
  /** Selector is a label query over a set of resources, in this case pods. Required. */
  val selector: LabelSelector_meta_v1_k8s1_19?
  /** VolumeMounts defines the collection of VolumeMount to inject into containers. */
  val volumeMounts: List<VolumeMount_core_v1_k8s1_19>?
  /** Volumes defines the collection of Volume to inject into the pod. */
  val volumes: List<Volume_core_v1_k8s1_19>?
}