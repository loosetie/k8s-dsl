package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("namespace", "name", "labels", "annotations", "clusterName", "creationTimestamp", "deletionGracePeriodSeconds", "deletionTimestamp", "finalizers", "generateName", "generation", "managedFields", "ownerReferences", "resourceVersion", "selfLink", "uid")
open class ObjectMeta_meta_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: ObjectMeta_meta_v1, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var labels: Map<String, String>? = null
  override var annotations: Map<String, String>? = null
  override var clusterName: String? = null
  override var creationTimestamp: Time_meta_v1? = null
  override var deletionGracePeriodSeconds: Int? = null
  override var deletionTimestamp: Time_meta_v1? = null
  override var finalizers: List<String>? = null
  override var generateName: String? = null
  override var generation: Int? = null
  override var managedFields: List<ManagedFieldsEntry_meta_v1>? = null
  override var ownerReferences: List<OwnerReference_meta_v1>? = null
  override var resourceVersion: String? = null
  override var selfLink: String? = null
  override var uid: String? = null
}