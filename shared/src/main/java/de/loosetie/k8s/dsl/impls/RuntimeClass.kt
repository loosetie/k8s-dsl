package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "handler", "overhead", "scheduling")
class RuntimeClass_node_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RuntimeClass_node_k8s_io_v1beta1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override var handler: String? = null
  override var overhead: Overhead_node_k8s_io_v1beta1_k8s1_16? = null
  override var scheduling: Scheduling_node_k8s_io_v1beta1_k8s1_16? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "handler", "overhead", "scheduling")
class RuntimeClass_node_k8s_io_v1beta1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RuntimeClass_node_k8s_io_v1beta1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override var handler: String? = null
  override var overhead: Overhead_node_k8s_io_v1beta1_k8s1_17? = null
  override var scheduling: Scheduling_node_k8s_io_v1beta1_k8s1_17? = null
}
typealias RuntimeClass_node_k8s_io_v1beta1_k8s1_18Impl = RuntimeClass_node_k8s_io_v1beta1_k8s1_17Impl
typealias RuntimeClass_node_k8s_io_v1beta1_k8s1_19Impl = RuntimeClass_node_k8s_io_v1beta1_k8s1_18Impl
@JsonPropertyOrder("apiVersion", "kind", "metadata", "handler", "overhead", "scheduling")
class RuntimeClass_node_k8s_io_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RuntimeClass_node_k8s_io_v1_k8s1_20, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_20
  override var handler: String? = null
  override var overhead: Overhead_node_k8s_io_v1_k8s1_20? = null
  override var scheduling: Scheduling_node_k8s_io_v1_k8s1_20? = null
}


typealias RuntimeClass_node_k8s_io_v1_k8s1_21Impl = RuntimeClass_node_k8s_io_v1_k8s1_20Impl

