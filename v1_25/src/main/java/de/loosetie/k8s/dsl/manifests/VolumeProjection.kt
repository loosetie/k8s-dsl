package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface VolumeProjection_core_v1: K8sManifest {
  /** configMap information about the configMap data to project */
  val configMap: ConfigMapProjection_core_v1?
  /** downwardAPI information about the downwardAPI data to project */
  val downwardAPI: DownwardAPIProjection_core_v1?
  /** secret information about the secret data to project */
  val secret: SecretProjection_core_v1?
  /** serviceAccountToken is information about the serviceAccountToken data to project */
  val serviceAccountToken: ServiceAccountTokenProjection_core_v1?
}