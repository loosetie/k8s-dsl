package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class PriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1alpha1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1alpha1, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1
  override lateinit var spec: Prioritylevelconfigurationspec_flowcontrol_apiserver_k8s_io_v1alpha1
  override var status: Prioritylevelconfigurationstatus_flowcontrol_apiserver_k8s_io_v1alpha1? = null
}