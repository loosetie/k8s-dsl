package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "handler", "overhead", "scheduling")
class RuntimeClass_node_k8s_io_v1beta1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RuntimeClass_node_k8s_io_v1beta1, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1
  override var handler: String? = null
  override var overhead: Overhead_node_k8s_io_v1beta1? = null
  override var scheduling: Scheduling_node_k8s_io_v1beta1? = null
}