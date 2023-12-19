package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("clusterTrustBundle", "configMap", "downwardAPI", "secret", "serviceAccountToken")
class VolumeProjection_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeProjection_core_v1, HasParent {
  override var clusterTrustBundle: ClusterTrustBundleProjection_core_v1? = null
  override var configMap: ConfigMapProjection_core_v1? = null
  override var downwardAPI: DownwardAPIProjection_core_v1? = null
  override var secret: SecretProjection_core_v1? = null
  override var serviceAccountToken: ServiceAccountTokenProjection_core_v1? = null
}