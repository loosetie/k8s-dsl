package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Certificatesigningrequestspec_certificates_k8s_io_v1beta1: K8sManifest {
  /** Extra information about the requesting user. See user.Info interface for details. */
  @K8sDslMarker var extra: Any?
  /** Group information about the requesting user. See user.Info interface for details. */
  @K8sDslMarker var groups: List<String>?
  /** Base64-encoded PKCS#10 CSR data */
  @K8sDslMarker var request: String?
  /** UID information about the requesting user. See user.Info interface for details. */
  @K8sDslMarker var uid: String?
  /** allowedUsages specifies a set of usage contexts the key will be valid for. See:
https://tools.ietf.org/html/rfc5280#section-4.2.1.3 https://tools.ietf.org/html/rfc5280#section-4.2.1.12 */
  @K8sDslMarker var usages: List<String>?
  /** Information about the requesting user. See user.Info interface for details. */
  @K8sDslMarker var username: String?
}