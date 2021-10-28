package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("accessModes", "dataSource", "resources", "selector", "storageClassName", "volumeMode", "volumeName")
class Persistentvolumeclaimspec_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Persistentvolumeclaimspec_core_v1_k8s1_16, HasParent {
  override var accessModes: List<String>? = null
  override var dataSource: TypedLocalObjectReference_core_v1_k8s1_16? = null
  override var resources: ResourceRequirements_core_v1_k8s1_16? = null
  override var selector: LabelSelector_meta_v1_k8s1_16? = null
  override var storageClassName: String? = null
  override var volumeMode: String? = null
  override var volumeName: String? = null
}
typealias Persistentvolumeclaimspec_core_v1_k8s1_17Impl = Persistentvolumeclaimspec_core_v1_k8s1_16Impl
@JsonPropertyOrder("accessModes", "dataSource", "resources", "selector", "storageClassName", "volumeMode", "volumeName")
class Persistentvolumeclaimspec_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Persistentvolumeclaimspec_core_v1_k8s1_18, HasParent {
  override var accessModes: List<String>? = null
  override var dataSource: TypedLocalObjectReference_core_v1_k8s1_18? = null
  override var resources: ResourceRequirements_core_v1_k8s1_18? = null
  override var selector: LabelSelector_meta_v1_k8s1_18? = null
  override var storageClassName: String? = null
  override var volumeMode: String? = null
  override var volumeName: String? = null
}
typealias Persistentvolumeclaimspec_core_v1_k8s1_19Impl = Persistentvolumeclaimspec_core_v1_k8s1_18Impl
@JsonPropertyOrder("accessModes", "dataSource", "resources", "selector", "storageClassName", "volumeMode", "volumeName")
class Persistentvolumeclaimspec_core_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Persistentvolumeclaimspec_core_v1_k8s1_20, HasParent {
  override var accessModes: List<String>? = null
  override var dataSource: TypedLocalObjectReference_core_v1_k8s1_20? = null
  override var resources: ResourceRequirements_core_v1_k8s1_20? = null
  override var selector: LabelSelector_meta_v1_k8s1_20? = null
  override var storageClassName: String? = null
  override var volumeMode: String? = null
  override var volumeName: String? = null
}
typealias Persistentvolumeclaimspec_core_v1_k8s1_21Impl = Persistentvolumeclaimspec_core_v1_k8s1_20Impl