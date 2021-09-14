package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ExecAction_core_v1_k8s1_18: K8sManifest {
  /** Command is the command line to execute inside the container, the working directory for the command is root ('/') in the
container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions
('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as
live/healthy and non-zero is unhealthy. */
  @K8sDslMarker var command: List<String>?
}