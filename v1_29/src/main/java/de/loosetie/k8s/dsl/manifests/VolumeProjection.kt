package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface VolumeProjection_core_v1: K8sManifest {
  /** ClusterTrustBundle allows a pod to access the `.spec.trustBundle` field of ClusterTrustBundle objects in an
auto-updating file. Alpha, gated by the ClusterTrustBundleProjection feature gate. ClusterTrustBundle objects can either
be selected by name, or by the combination of signer name and a label selector. Kubelet performs aggressive
normalization of the PEM contents written into the pod filesystem. Esoteric PEM features such as inter-block comments
and block headers are stripped. Certificates are deduplicated. The ordering of certificates within the file is
arbitrary, and Kubelet may change the order over time. */
  val clusterTrustBundle: ClusterTrustBundleProjection_core_v1?
  /** configMap information about the configMap data to project */
  val configMap: ConfigMapProjection_core_v1?
  /** downwardAPI information about the downwardAPI data to project */
  val downwardAPI: DownwardAPIProjection_core_v1?
  /** secret information about the secret data to project */
  val secret: SecretProjection_core_v1?
  /** serviceAccountToken is information about the serviceAccountToken data to project */
  val serviceAccountToken: ServiceAccountTokenProjection_core_v1?
}