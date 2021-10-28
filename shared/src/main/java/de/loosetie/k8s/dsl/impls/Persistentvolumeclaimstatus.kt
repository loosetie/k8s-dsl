package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("accessModes", "capacity", "conditions", "phase")
class Persistentvolumeclaimstatus_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Persistentvolumeclaimstatus_core_v1_k8s1_16, HasParent {
  override var accessModes: List<String>? = null
  override var capacity: Any? = null
  override var conditions: List<PersistentVolumeClaimCondition_core_v1_k8s1_16>? = null
  override var phase: String? = null
}
typealias Persistentvolumeclaimstatus_core_v1_k8s1_17Impl = Persistentvolumeclaimstatus_core_v1_k8s1_16Impl
typealias Persistentvolumeclaimstatus_core_v1_k8s1_18Impl = Persistentvolumeclaimstatus_core_v1_k8s1_17Impl
typealias Persistentvolumeclaimstatus_core_v1_k8s1_19Impl = Persistentvolumeclaimstatus_core_v1_k8s1_18Impl
typealias Persistentvolumeclaimstatus_core_v1_k8s1_20Impl = Persistentvolumeclaimstatus_core_v1_k8s1_19Impl
typealias Persistentvolumeclaimstatus_core_v1_k8s1_21Impl = Persistentvolumeclaimstatus_core_v1_k8s1_20Impl