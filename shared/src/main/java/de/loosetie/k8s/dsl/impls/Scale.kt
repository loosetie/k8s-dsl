package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class Scale_apps_v1beta2_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Scale_apps_v1beta2_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override lateinit var spec: Scalespec_apps_v1beta1_k8s1_17
  override var status: Scalestatus_apps_v1beta1_k8s1_17? = null
}



