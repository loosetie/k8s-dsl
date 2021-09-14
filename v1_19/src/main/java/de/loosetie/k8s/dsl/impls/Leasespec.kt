package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("acquireTime", "holderIdentity", "leaseDurationSeconds", "leaseTransitions", "renewTime")
class Leasespec_coordination_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Leasespec_coordination_k8s_io_v1_k8s1_19, HasParent {
  override var acquireTime: MicroTime_meta_v1_k8s1_19? = null
  override var holderIdentity: String? = null
  override var leaseDurationSeconds: Int? = null
  override var leaseTransitions: Int? = null
  override var renewTime: MicroTime_meta_v1_k8s1_19? = null
}