package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface CertificateSigningRequestCondition_certificates_k8s_io_v1beta1_k8s1_16: K8sManifest {
  /** timestamp for the last update to this condition */
  val lastUpdateTime: Time_meta_v1_k8s1_16?
  /** human readable message with details about the request state */
  @K8sDslMarker var message: String?
  /** brief reason for the request state */
  @K8sDslMarker var reason: String?
  /** request approval state, currently Approved or Denied. */
  @K8sDslMarker var type: String?
}      
typealias CertificateSigningRequestCondition_certificates_k8s_io_v1beta1_k8s1_17 = CertificateSigningRequestCondition_certificates_k8s_io_v1beta1_k8s1_16       
typealias CertificateSigningRequestCondition_certificates_k8s_io_v1beta1_k8s1_18 = CertificateSigningRequestCondition_certificates_k8s_io_v1beta1_k8s1_17       
@K8sDslMarker
interface CertificateSigningRequestCondition_certificates_k8s_io_v1_k8s1_19: K8sManifest {
  /** lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new
condition type is added or an existing condition's status is changed, the server defaults this to the current time. */
  val lastTransitionTime: Time_meta_v1_k8s1_19?
  /** lastUpdateTime is the time of the last update to this condition */
  val lastUpdateTime: Time_meta_v1_k8s1_19?
  /** message contains a human readable message with details about the request state */
  @K8sDslMarker var message: String?
  /** reason indicates a brief reason for the request state */
  @K8sDslMarker var reason: String?
  /** status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or
"Unknown". */
  @K8sDslMarker var status: String?
  /** type of the condition. Known conditions are "Approved", "Denied", and "Failed". An "Approved" condition is added via the
/approval subresource, indicating the request was approved and should be issued by the signer. A "Denied" condition is
added via the /approval subresource, indicating the request was denied and should not be issued by the signer. A
"Failed" condition is added via the /status subresource, indicating the signer failed to issue the certificate. Approved
and Denied conditions are mutually exclusive. Approved, Denied, and Failed conditions cannot be removed once added. Only
one condition of a given type is allowed. */
  @K8sDslMarker var type: String?
}

      
typealias CertificateSigningRequestCondition_certificates_k8s_io_v1_k8s1_20 = CertificateSigningRequestCondition_certificates_k8s_io_v1_k8s1_19 

      
typealias CertificateSigningRequestCondition_certificates_k8s_io_v1_k8s1_21 = CertificateSigningRequestCondition_certificates_k8s_io_v1_k8s1_20 

