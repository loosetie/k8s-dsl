package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("metadata", "spec")
class Resourceclaimtemplatespec_resource_k8s_io_v1alpha2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Resourceclaimtemplatespec_resource_k8s_io_v1alpha2, HasParent {
  override var metadata: ObjectMeta_meta_v1? = null
  override var spec: Resourceclaimspec_resource_k8s_io_v1alpha2? = null
}