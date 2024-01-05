package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "mountPath", "mountPropagation", "readOnly", "subPath", "subPathExpr")
class VolumeMount_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: VolumeMount_core_v1, HasParent {
  override var name: String? = null
  override var mountPath: String? = null
  override var mountPropagation: String? = null
  override var readOnly: Boolean? = null
  override var subPath: String? = null
  override var subPathExpr: String? = null
}