package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Customresourcedefinitionstatus_apiextensions_k8s_io_v1: K8sManifest {
  /** acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in
spec. */
  val acceptedNames: CustomResourceDefinitionNames_apiextensions_k8s_io_v1?
  /** conditions indicate state for particular aspects of a CustomResourceDefinition */
  val conditions: List<CustomResourceDefinitionCondition_apiextensions_k8s_io_v1>?
  /** storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a
migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to
another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list.
Versions may not be removed from `spec.versions` while they exist in this list. */
  @K8sDslMarker var storedVersions: List<String>?
}