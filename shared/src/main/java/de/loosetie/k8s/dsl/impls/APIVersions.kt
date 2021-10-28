package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "serverAddressByClientCIDRs", "versions")
class APIVersions_meta_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: APIVersions_meta_v1_k8s1_16, HasParent {
  override var serverAddressByClientCIDRs: List<ServerAddressByClientCIDR_meta_v1_k8s1_16>? = null
  override var versions: List<String>? = null
}
typealias APIVersions_meta_v1_k8s1_17Impl = APIVersions_meta_v1_k8s1_16Impl
typealias APIVersions_meta_v1_k8s1_18Impl = APIVersions_meta_v1_k8s1_17Impl
typealias APIVersions_meta_v1_k8s1_19Impl = APIVersions_meta_v1_k8s1_18Impl
typealias APIVersions_meta_v1_k8s1_20Impl = APIVersions_meta_v1_k8s1_19Impl
typealias APIVersions_meta_v1_k8s1_21Impl = APIVersions_meta_v1_k8s1_20Impl