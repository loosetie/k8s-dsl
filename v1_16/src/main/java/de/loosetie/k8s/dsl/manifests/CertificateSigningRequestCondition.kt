package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface CertificateSigningRequestCondition_certificates_k8s_io_v1beta1: K8sManifest {
  /** timestamp for the last update to this condition */
  val lastUpdateTime: Time_meta_v1?
  /** human readable message with details about the request state */
  @K8sDslMarker var message: String?
  /** brief reason for the request state */
  @K8sDslMarker var reason: String?
  /** request approval state, currently Approved or Denied. */
  @K8sDslMarker var type: String?
}