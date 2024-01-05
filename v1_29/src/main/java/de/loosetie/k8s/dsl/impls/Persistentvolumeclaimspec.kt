package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("accessModes", "dataSource", "dataSourceRef", "resources", "selector", "storageClassName", "volumeAttributesClassName", "volumeMode", "volumeName")
class Persistentvolumeclaimspec_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Persistentvolumeclaimspec_core_v1, HasParent {
  override var accessModes: List<String>? = null
  override var dataSource: TypedLocalObjectReference_core_v1? = null
  override var dataSourceRef: TypedObjectReference_core_v1? = null
  override var resources: VolumeResourceRequirements_core_v1? = null
  override var selector: LabelSelector_meta_v1? = null
  override var storageClassName: String? = null
  override var volumeAttributesClassName: String? = null
  override var volumeMode: String? = null
  override var volumeName: String? = null
}