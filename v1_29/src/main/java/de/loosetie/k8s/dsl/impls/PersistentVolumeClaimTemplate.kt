package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("metadata", "spec")
open class PersistentVolumeClaimTemplate_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: PersistentVolumeClaimTemplate_core_v1, HasParent {
  override var metadata: ObjectMeta_meta_v1? = null
  override var spec: Persistentvolumeclaimspec_core_v1? = null
}