package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Lifecycle_core_v1: K8sManifest {
  /** PostStart is called immediately after a container is created. If the handler fails, the container is terminated and
restarted according to its restart policy. Other management of the container blocks until the hook completes. More info:
https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks */
  val postStart: LifecycleHandler_core_v1?
  /** PreStop is called immediately before a container is terminated due to an API request or management event such as
liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes
or exits. The Pod's termination grace period countdown begins before the PreStop hook is executed. Regardless of the
outcome of the handler, the container will eventually terminate within the Pod's termination grace period (unless
delayed by finalizers). Other management of the container blocks until the hook completes or until the termination grace
period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks */
  val preStop: LifecycleHandler_core_v1?
}