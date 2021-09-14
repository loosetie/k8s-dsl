package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "value", "valueFrom")
class EnvVar_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EnvVar_core_v1_k8s1_19, HasParent {
  override var name: String? = null
  override var value: String? = null
  override var valueFrom: EnvVarSource_core_v1_k8s1_19? = null
}