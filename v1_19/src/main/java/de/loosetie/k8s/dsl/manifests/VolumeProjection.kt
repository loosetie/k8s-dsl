package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface VolumeProjection_core_v1_k8s1_19: K8sManifest {
  /** information about the configMap data to project */
  val configMap: ConfigMapProjection_core_v1_k8s1_19?
  /** information about the downwardAPI data to project */
  val downwardAPI: DownwardAPIProjection_core_v1_k8s1_19?
  /** information about the secret data to project */
  val secret: SecretProjection_core_v1_k8s1_19?
  /** information about the serviceAccountToken data to project */
  val serviceAccountToken: ServiceAccountTokenProjection_core_v1_k8s1_19?
}