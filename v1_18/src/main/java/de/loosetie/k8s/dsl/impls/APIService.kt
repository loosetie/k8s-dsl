package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.APIService_apiregistration_k8s_io_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.Apiservicespec_apiregistration_k8s_io_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.Apiservicestatus_apiregistration_k8s_io_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.ObjectMeta_meta_v1_k8s1_18

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class APIService_apiregistration_k8s_io_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: APIService_apiregistration_k8s_io_v1_k8s1_18, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_18
  override lateinit var spec: Apiservicespec_apiregistration_k8s_io_v1_k8s1_18
  override var status: Apiservicestatus_apiregistration_k8s_io_v1_k8s1_18? = null
}