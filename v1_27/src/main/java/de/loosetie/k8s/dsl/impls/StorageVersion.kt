package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
open class StorageVersion_internal_apiserver_k8s_io_v1alpha1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
  @JsonIgnore
  override val helmVariables: MutableMap<String, String> = mutableMapOf(),
      
)
: StorageVersion_internal_apiserver_k8s_io_v1alpha1, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1
  override lateinit var spec: Storageversionspec_internal_apiserver_k8s_io_v1alpha1
  override var status: Storageversionstatus_internal_apiserver_k8s_io_v1alpha1? = null
}