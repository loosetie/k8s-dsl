package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("hard", "used")
class Resourcequotastatus_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Resourcequotastatus_core_v1_k8s1_16, HasParent {
  override var hard: Any? = null
  override var used: Any? = null
}
typealias Resourcequotastatus_core_v1_k8s1_17Impl = Resourcequotastatus_core_v1_k8s1_16Impl
typealias Resourcequotastatus_core_v1_k8s1_18Impl = Resourcequotastatus_core_v1_k8s1_17Impl
typealias Resourcequotastatus_core_v1_k8s1_19Impl = Resourcequotastatus_core_v1_k8s1_18Impl
typealias Resourcequotastatus_core_v1_k8s1_20Impl = Resourcequotastatus_core_v1_k8s1_19Impl
typealias Resourcequotastatus_core_v1_k8s1_21Impl = Resourcequotastatus_core_v1_k8s1_20Impl