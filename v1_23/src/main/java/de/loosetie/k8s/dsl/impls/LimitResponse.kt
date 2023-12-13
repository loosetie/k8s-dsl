package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("queuing", "type")
class LimitResponse_flowcontrol_apiserver_k8s_io_v1beta2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LimitResponse_flowcontrol_apiserver_k8s_io_v1beta2, HasParent {
  override var queuing: QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1beta2? = null
  override var type: String? = null
}