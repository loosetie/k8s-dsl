package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("certificate", "conditions")
class Certificatesigningrequeststatus_certificates_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Certificatesigningrequeststatus_certificates_k8s_io_v1beta1_k8s1_16, HasParent {
  override var certificate: String? = null
  override var conditions: List<CertificateSigningRequestCondition_certificates_k8s_io_v1beta1_k8s1_16>? = null
}
typealias Certificatesigningrequeststatus_certificates_k8s_io_v1beta1_k8s1_17Impl = Certificatesigningrequeststatus_certificates_k8s_io_v1beta1_k8s1_16Impl
typealias Certificatesigningrequeststatus_certificates_k8s_io_v1beta1_k8s1_18Impl = Certificatesigningrequeststatus_certificates_k8s_io_v1beta1_k8s1_17Impl
@JsonPropertyOrder("certificate", "conditions")
class Certificatesigningrequeststatus_certificates_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Certificatesigningrequeststatus_certificates_k8s_io_v1_k8s1_19, HasParent {
  override var certificate: String? = null
  override var conditions: List<CertificateSigningRequestCondition_certificates_k8s_io_v1_k8s1_19>? = null
}
typealias Certificatesigningrequeststatus_certificates_k8s_io_v1_k8s1_20Impl = Certificatesigningrequeststatus_certificates_k8s_io_v1_k8s1_19Impl
typealias Certificatesigningrequeststatus_certificates_k8s_io_v1_k8s1_21Impl = Certificatesigningrequeststatus_certificates_k8s_io_v1_k8s1_20Impl