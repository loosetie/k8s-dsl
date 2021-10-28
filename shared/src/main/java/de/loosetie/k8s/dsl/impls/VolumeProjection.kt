package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("configMap", "downwardAPI", "secret", "serviceAccountToken")
class VolumeProjection_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeProjection_core_v1_k8s1_16, HasParent {
  override var configMap: ConfigMapProjection_core_v1_k8s1_16? = null
  override var downwardAPI: DownwardAPIProjection_core_v1_k8s1_16? = null
  override var secret: SecretProjection_core_v1_k8s1_16? = null
  override var serviceAccountToken: ServiceAccountTokenProjection_core_v1_k8s1_16? = null
}
typealias VolumeProjection_core_v1_k8s1_17Impl = VolumeProjection_core_v1_k8s1_16Impl
typealias VolumeProjection_core_v1_k8s1_18Impl = VolumeProjection_core_v1_k8s1_17Impl
typealias VolumeProjection_core_v1_k8s1_19Impl = VolumeProjection_core_v1_k8s1_18Impl
typealias VolumeProjection_core_v1_k8s1_20Impl = VolumeProjection_core_v1_k8s1_19Impl
typealias VolumeProjection_core_v1_k8s1_21Impl = VolumeProjection_core_v1_k8s1_20Impl