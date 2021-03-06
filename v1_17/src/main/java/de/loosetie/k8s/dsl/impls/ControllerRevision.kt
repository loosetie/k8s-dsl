package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "data", "revision")
class ControllerRevision_apps_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ControllerRevision_apps_v1, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1
  override var data: ByteArray? = null
  override var revision: Int? = null
}