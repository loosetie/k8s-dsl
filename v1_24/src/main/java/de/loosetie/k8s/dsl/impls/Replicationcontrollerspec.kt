package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("minReadySeconds", "replicas", "selector", "template")
open class Replicationcontrollerspec_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Replicationcontrollerspec_core_v1, HasParent {
  override var minReadySeconds: Int? = null
  override var replicas: Int? = null
  override var selector: Map<String, String>? = null
  override var template: Podtemplatespec_core_v1? = null
}