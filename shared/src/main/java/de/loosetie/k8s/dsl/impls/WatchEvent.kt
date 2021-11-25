package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("object", "type")
class WatchEvent_meta_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WatchEvent_meta_v1_k8s1_16, HasParent {
  override var `object`: Any? = null
  override var type: String? = null
}
typealias WatchEvent_meta_v1_k8s1_17Impl = WatchEvent_meta_v1_k8s1_16Impl
typealias WatchEvent_meta_v1_k8s1_18Impl = WatchEvent_meta_v1_k8s1_17Impl
typealias WatchEvent_meta_v1_k8s1_19Impl = WatchEvent_meta_v1_k8s1_18Impl
typealias WatchEvent_meta_v1_k8s1_20Impl = WatchEvent_meta_v1_k8s1_19Impl
typealias WatchEvent_meta_v1_k8s1_21Impl = WatchEvent_meta_v1_k8s1_20Impl