package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "labelSelector", "optional", "path", "signerName")
open class ClusterTrustBundleProjection_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: ClusterTrustBundleProjection_core_v1, HasParent {
  override var name: String? = null
  override var labelSelector: LabelSelector_meta_v1? = null
  override var optional: Boolean? = null
  override var path: String? = null
  override var signerName: String? = null
}