package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "namespace", "name", "fieldPath", "resourceVersion", "uid")
class ObjectReference_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ObjectReference_core_v1_k8s1_16, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var fieldPath: String? = null
  override var resourceVersion: String? = null
  override var uid: String? = null
}
typealias ObjectReference_core_v1_k8s1_17Impl = ObjectReference_core_v1_k8s1_16Impl
typealias ObjectReference_core_v1_k8s1_18Impl = ObjectReference_core_v1_k8s1_17Impl
typealias ObjectReference_core_v1_k8s1_19Impl = ObjectReference_core_v1_k8s1_18Impl
typealias ObjectReference_core_v1_k8s1_20Impl = ObjectReference_core_v1_k8s1_19Impl
typealias ObjectReference_core_v1_k8s1_21Impl = ObjectReference_core_v1_k8s1_20Impl