package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Containerstatus_core_v1_k8s1_21: K8sManifest {
  /** This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated. */
  @K8sDslMarker var name: String?
  /** Container's ID in the format 'docker://<container_id>'. */
  @K8sDslMarker var containerID: String?
  /** The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images */
  @K8sDslMarker var image: String?
  /** ImageID of the container's image. */
  @K8sDslMarker var imageID: String?
  /** Details about the container's last termination condition. */
  val lastState: ContainerState_core_v1_k8s1_21?
  /** Specifies whether the container has passed its readiness probe. */
  @K8sDslMarker var ready: Boolean?
  /** The number of times the container has been restarted, currently based on the number of dead containers that have not yet
been removed. Note that this is calculated from dead containers. But those containers are subject to garbage collection.
This value will get capped at 5 by GC. */
  @K8sDslMarker var restartCount: Int?
  /** Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is
considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always
true when no startupProbe is defined. */
  @K8sDslMarker var started: Boolean?
  /** Details about the container's current condition. */
  val state: ContainerState_core_v1_k8s1_21?
}