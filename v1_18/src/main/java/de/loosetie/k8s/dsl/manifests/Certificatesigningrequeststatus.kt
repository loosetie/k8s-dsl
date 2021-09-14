package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Certificatesigningrequeststatus_certificates_k8s_io_v1beta1_k8s1_18: K8sManifest {
  /** If request was approved, the controller will place the issued certificate here. */
  @K8sDslMarker var certificate: String?
  /** Conditions applied to the request, such as approval or denial. */
  val conditions: List<CertificateSigningRequestCondition_certificates_k8s_io_v1beta1_k8s1_18>?
}