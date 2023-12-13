package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PodOS_core_v1: K8sManifest {
  /** Name is the name of the operating system. The currently supported values are linux and windows. Additional value may be
defined in future and can be one of:
https://github.com/opencontainers/runtime-spec/blob/master/config.md#platform-specific-configuration Clients should
expect to handle additional values and treat unrecognized values in this field as os: null */
  @K8sDslMarker var name: String?
}