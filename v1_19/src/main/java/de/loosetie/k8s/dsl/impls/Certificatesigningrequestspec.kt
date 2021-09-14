package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("extra", "groups", "request", "signerName", "uid", "usages", "username")
class Certificatesigningrequestspec_certificates_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Certificatesigningrequestspec_certificates_k8s_io_v1_k8s1_19, HasParent {
  override var extra: Any? = null
  override var groups: List<String>? = null
  override var request: String? = null
  override var signerName: String? = null
  override var uid: String? = null
  override var usages: List<String>? = null
  override var username: String? = null
}