package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Deploymentspec_apps_v1: K8sManifest {
  /** Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to
be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) */
  @K8sDslMarker var minReadySeconds: Int?
  /** Indicates that the deployment is paused. */
  @K8sDslMarker var paused: Boolean?
  /** The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment
controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be
surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused.
Defaults to 600s. */
  @K8sDslMarker var progressDeadlineSeconds: Int?
  /** Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1. */
  @K8sDslMarker var replicas: Int?
  /** The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and
not specified. Defaults to 10. */
  @K8sDslMarker var revisionHistoryLimit: Int?
  /** Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this
deployment. It must match the pod template's labels. */
  val selector: LabelSelector_meta_v1?
  /** The deployment strategy to use to replace existing pods with new ones. */
  val strategy: Deploymentstrategy_apps_v1?
  /** Template describes the pods that will be created. The only allowed template.spec.restartPolicy value is "Always". */
  val template: Podtemplatespec_core_v1?
}