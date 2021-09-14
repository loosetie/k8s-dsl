package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface SeccompProfile_core_v1_k8s1_21: K8sManifest {
  /** localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on
the node to work. Must be a descending path, relative to the kubelet's configured seccomp profile location. Must only be
set if type is "Localhost". */
  @K8sDslMarker var localhostProfile: String?
  /** type indicates which kind of seccomp profile will be applied. Valid options are: Localhost - a profile defined in a file
on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no
profile should be applied. */
  @K8sDslMarker var type: String?
}