package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("commonEncodingVersion", "conditions", "storageVersions")
class Storageversionstatus_internal_apiserver_k8s_io_v1alpha1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Storageversionstatus_internal_apiserver_k8s_io_v1alpha1_k8s1_21, HasParent {
  override var commonEncodingVersion: String? = null
  override var conditions: List<StorageVersionCondition_internal_apiserver_k8s_io_v1alpha1_k8s1_21>? = null
  override var storageVersions: List<ServerStorageVersion_internal_apiserver_k8s_io_v1alpha1_k8s1_21>? = null
}