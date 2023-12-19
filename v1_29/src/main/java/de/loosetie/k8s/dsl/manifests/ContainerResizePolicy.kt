package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ContainerResizePolicy_core_v1: K8sManifest {
  /** Name of the resource to which this resource resize policy applies. Supported values: cpu, memory. */
  @K8sDslMarker var resourceName: String?
  /** Restart policy to apply when specified resource is resized. If not specified, it defaults to NotRequired. */
  @K8sDslMarker var restartPolicy: String?
}