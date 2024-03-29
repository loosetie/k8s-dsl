package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Cronjobstatus_batch_v1: K8sManifest {
  /** A list of pointers to currently running jobs. */
  val active: List<ObjectReference_core_v1>?
  /** Information when was the last time the job was successfully scheduled. */
  val lastScheduleTime: Time_meta_v1?
  /** Information when was the last time the job successfully completed. */
  val lastSuccessfulTime: Time_meta_v1?
}