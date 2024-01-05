package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class CertificateSigningRequest_certificates_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
  @JsonIgnore
  override val helmVariables: MutableMap<String, String> = mutableMapOf(),
      
)
: CertificateSigningRequest_certificates_k8s_io_v1, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1
  override lateinit var spec: Certificatesigningrequestspec_certificates_k8s_io_v1
  override var status: Certificatesigningrequeststatus_certificates_k8s_io_v1? = null
}