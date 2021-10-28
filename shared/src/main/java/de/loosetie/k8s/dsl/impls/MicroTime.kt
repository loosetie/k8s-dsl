package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("")
class MicroTime_meta_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MicroTime_meta_v1_k8s1_16, HasParent {
  
}
typealias MicroTime_meta_v1_k8s1_17Impl = MicroTime_meta_v1_k8s1_16Impl
typealias MicroTime_meta_v1_k8s1_18Impl = MicroTime_meta_v1_k8s1_17Impl
typealias MicroTime_meta_v1_k8s1_19Impl = MicroTime_meta_v1_k8s1_18Impl
typealias MicroTime_meta_v1_k8s1_20Impl = MicroTime_meta_v1_k8s1_19Impl
typealias MicroTime_meta_v1_k8s1_21Impl = MicroTime_meta_v1_k8s1_20Impl