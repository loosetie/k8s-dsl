package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface QuobyteVolumeSource_core_v1: K8sManifest {
  /** group to map volume access to Default is no group */
  @K8sDslMarker var group: String?
  /** readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false. */
  @K8sDslMarker var readOnly: Boolean?
  /** registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple
entries are separated with commas) which acts as the central registry for volumes */
  @K8sDslMarker var registry: String?
  /** tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by
the plugin */
  @K8sDslMarker var tenant: String?
  /** user to map volume access to Defaults to serivceaccount user */
  @K8sDslMarker var user: String?
  /** volume is a string that references an already created Quobyte volume by name. */
  @K8sDslMarker var volume: String?
}