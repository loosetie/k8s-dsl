package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Cronjobstatus_batch_v1beta1_k8s1_16: K8sManifest {
  /** A list of pointers to currently running jobs. */
  val active: List<ObjectReference_core_v1_k8s1_16>?
  /** Information when was the last time the job was successfully scheduled. */
  val lastScheduleTime: Time_meta_v1_k8s1_16?
}      
typealias Cronjobstatus_batch_v1beta1_k8s1_17 = Cronjobstatus_batch_v1beta1_k8s1_16       
typealias Cronjobstatus_batch_v1beta1_k8s1_18 = Cronjobstatus_batch_v1beta1_k8s1_17       
typealias Cronjobstatus_batch_v1beta1_k8s1_19 = Cronjobstatus_batch_v1beta1_k8s1_18       
typealias Cronjobstatus_batch_v1beta1_k8s1_20 = Cronjobstatus_batch_v1beta1_k8s1_19       
@K8sDslMarker
interface Cronjobstatus_batch_v1_k8s1_21: K8sManifest {
  /** A list of pointers to currently running jobs. */
  val active: List<ObjectReference_core_v1_k8s1_21>?
  /** Information when was the last time the job was successfully scheduled. */
  val lastScheduleTime: Time_meta_v1_k8s1_21?
  /** Information when was the last time the job successfully completed. */
  val lastSuccessfulTime: Time_meta_v1_k8s1_21?
}