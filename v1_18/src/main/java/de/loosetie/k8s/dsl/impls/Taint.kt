package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("effect", "key", "timeAdded", "value")
class Taint_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Taint_core_v1_k8s1_18, HasParent {
  override var effect: String? = null
  override var key: String? = null
  override var timeAdded: Time_meta_v1_k8s1_18? = null
  override var value: String? = null
}