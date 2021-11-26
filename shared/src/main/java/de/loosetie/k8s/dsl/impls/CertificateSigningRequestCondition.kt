package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("lastUpdateTime", "message", "reason", "type")
class CertificateSigningRequestCondition_certificates_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CertificateSigningRequestCondition_certificates_k8s_io_v1beta1_k8s1_16, HasParent {
  override var lastUpdateTime: Time_meta_v1_k8s1_16? = null
  override var message: String? = null
  override var reason: String? = null
  override var type: String? = null
}
typealias CertificateSigningRequestCondition_certificates_k8s_io_v1beta1_k8s1_17Impl = CertificateSigningRequestCondition_certificates_k8s_io_v1beta1_k8s1_16Impl
typealias CertificateSigningRequestCondition_certificates_k8s_io_v1beta1_k8s1_18Impl = CertificateSigningRequestCondition_certificates_k8s_io_v1beta1_k8s1_17Impl
@JsonPropertyOrder("lastTransitionTime", "lastUpdateTime", "message", "reason", "status", "type")
class CertificateSigningRequestCondition_certificates_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CertificateSigningRequestCondition_certificates_k8s_io_v1_k8s1_19, HasParent {
  override var lastTransitionTime: Time_meta_v1_k8s1_19? = null
  override var lastUpdateTime: Time_meta_v1_k8s1_19? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}
typealias CertificateSigningRequestCondition_certificates_k8s_io_v1_k8s1_20Impl = CertificateSigningRequestCondition_certificates_k8s_io_v1_k8s1_19Impl
typealias CertificateSigningRequestCondition_certificates_k8s_io_v1_k8s1_21Impl = CertificateSigningRequestCondition_certificates_k8s_io_v1_k8s1_20Impl