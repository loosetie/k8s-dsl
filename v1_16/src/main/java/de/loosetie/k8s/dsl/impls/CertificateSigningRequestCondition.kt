package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("lastUpdateTime", "message", "reason", "type")
class CertificateSigningRequestCondition_certificates_k8s_io_v1beta1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CertificateSigningRequestCondition_certificates_k8s_io_v1beta1, HasParent {
  override var lastUpdateTime: Time_meta_v1? = null
  override var message: String? = null
  override var reason: String? = null
  override var type: String? = null
}