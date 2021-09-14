package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.CertificateSigningRequest_certificates_k8s_io_v1beta1_k8s1_18
import de.loosetie.k8s.dsl.manifests.Certificatesigningrequestspec_certificates_k8s_io_v1beta1_k8s1_18
import de.loosetie.k8s.dsl.manifests.Certificatesigningrequeststatus_certificates_k8s_io_v1beta1_k8s1_18
import de.loosetie.k8s.dsl.manifests.ObjectMeta_meta_v1_k8s1_18

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class CertificateSigningRequest_certificates_k8s_io_v1beta1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CertificateSigningRequest_certificates_k8s_io_v1beta1_k8s1_18, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_18
  override lateinit var spec: Certificatesigningrequestspec_certificates_k8s_io_v1beta1_k8s1_18
  override var status: Certificatesigningrequeststatus_certificates_k8s_io_v1beta1_k8s1_18? = null
}