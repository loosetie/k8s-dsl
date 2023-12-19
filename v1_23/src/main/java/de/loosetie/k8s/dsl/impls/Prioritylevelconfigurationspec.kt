package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("limited", "type")
class Prioritylevelconfigurationspec_flowcontrol_apiserver_k8s_io_v1beta1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Prioritylevelconfigurationspec_flowcontrol_apiserver_k8s_io_v1beta1, HasParent {
  override var limited: LimitedPriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta1? = null
  override var type: String? = null
}