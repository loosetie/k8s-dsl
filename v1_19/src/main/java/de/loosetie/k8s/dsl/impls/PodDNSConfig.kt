package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("nameservers", "options", "searches")
class PodDNSConfig_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodDNSConfig_core_v1_k8s1_19, HasParent {
  override var nameservers: List<String>? = null
  override var options: List<PodDNSConfigOption_core_v1_k8s1_19>? = null
  override var searches: List<String>? = null
}