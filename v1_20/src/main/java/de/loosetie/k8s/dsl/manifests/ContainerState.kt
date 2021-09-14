package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ContainerState_core_v1_k8s1_20: K8sManifest {
  /** Details about a running container */
  val running: ContainerStateRunning_core_v1_k8s1_20?
  /** Details about a terminated container */
  val terminated: ContainerStateTerminated_core_v1_k8s1_20?
  /** Details about a waiting container */
  val waiting: ContainerStateWaiting_core_v1_k8s1_20?
}