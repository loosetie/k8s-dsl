package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class LimitRange_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LimitRange_core_v1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override lateinit var spec: Limitrangespec_core_v1_k8s1_16
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class LimitRange_core_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LimitRange_core_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override lateinit var spec: Limitrangespec_core_v1_k8s1_17
}
typealias LimitRange_core_v1_k8s1_18Impl = LimitRange_core_v1_k8s1_17Impl
typealias LimitRange_core_v1_k8s1_19Impl = LimitRange_core_v1_k8s1_18Impl
typealias LimitRange_core_v1_k8s1_20Impl = LimitRange_core_v1_k8s1_19Impl
typealias LimitRange_core_v1_k8s1_21Impl = LimitRange_core_v1_k8s1_20Impl