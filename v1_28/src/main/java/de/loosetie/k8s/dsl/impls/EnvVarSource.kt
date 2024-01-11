package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("configMapKeyRef", "fieldRef", "resourceFieldRef", "secretKeyRef")
open class EnvVarSource_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: EnvVarSource_core_v1, HasParent {
  override var configMapKeyRef: ConfigMapKeySelector_core_v1? = null
  override var fieldRef: ObjectFieldSelector_core_v1? = null
  override var resourceFieldRef: ResourceFieldSelector_core_v1? = null
  override var secretKeyRef: SecretKeySelector_core_v1? = null
}