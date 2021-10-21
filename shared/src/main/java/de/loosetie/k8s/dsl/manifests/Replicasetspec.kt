package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Replicasetspec_apps_v1_k8s1_16: K8sManifest {
  /** Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to
be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) */
  @K8sDslMarker var minReadySeconds: Int?
  /** Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified.
Defaults to 1. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller */
  @K8sDslMarker var replicas: Int?
  /** Selector is a label query over pods that should match the replica count. Label keys and values that must match in order
to be controlled by this replica set. It must match the pod template's labels. More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  val selector: LabelSelector_meta_v1_k8s1_16?
  /** Template is the object that describes the pod that will be created if insufficient replicas are detected. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
  val template: Podtemplatespec_core_v1_k8s1_16?
}      
@K8sDslMarker
interface Replicasetspec_apps_v1_k8s1_17: K8sManifest {
  /** Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to
be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) */
  @K8sDslMarker var minReadySeconds: Int?
  /** Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified.
Defaults to 1. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller */
  @K8sDslMarker var replicas: Int?
  /** Selector is a label query over pods that should match the replica count. Label keys and values that must match in order
to be controlled by this replica set. It must match the pod template's labels. More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  val selector: LabelSelector_meta_v1_k8s1_17?
  /** Template is the object that describes the pod that will be created if insufficient replicas are detected. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
  val template: Podtemplatespec_core_v1_k8s1_17?
}      
@K8sDslMarker
interface Replicasetspec_apps_v1_k8s1_18: K8sManifest {
  /** Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to
be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) */
  @K8sDslMarker var minReadySeconds: Int?
  /** Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified.
Defaults to 1. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller */
  @K8sDslMarker var replicas: Int?
  /** Selector is a label query over pods that should match the replica count. Label keys and values that must match in order
to be controlled by this replica set. It must match the pod template's labels. More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  val selector: LabelSelector_meta_v1_k8s1_18?
  /** Template is the object that describes the pod that will be created if insufficient replicas are detected. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
  val template: Podtemplatespec_core_v1_k8s1_18?
}      
@K8sDslMarker
interface Replicasetspec_apps_v1_k8s1_19: K8sManifest {
  /** Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to
be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) */
  @K8sDslMarker var minReadySeconds: Int?
  /** Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified.
Defaults to 1. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller */
  @K8sDslMarker var replicas: Int?
  /** Selector is a label query over pods that should match the replica count. Label keys and values that must match in order
to be controlled by this replica set. It must match the pod template's labels. More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  val selector: LabelSelector_meta_v1_k8s1_19?
  /** Template is the object that describes the pod that will be created if insufficient replicas are detected. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
  val template: Podtemplatespec_core_v1_k8s1_19?
}      
@K8sDslMarker
interface Replicasetspec_apps_v1_k8s1_20: K8sManifest {
  /** Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to
be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) */
  @K8sDslMarker var minReadySeconds: Int?
  /** Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified.
Defaults to 1. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller */
  @K8sDslMarker var replicas: Int?
  /** Selector is a label query over pods that should match the replica count. Label keys and values that must match in order
to be controlled by this replica set. It must match the pod template's labels. More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  val selector: LabelSelector_meta_v1_k8s1_20?
  /** Template is the object that describes the pod that will be created if insufficient replicas are detected. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
  val template: Podtemplatespec_core_v1_k8s1_20?
}      
@K8sDslMarker
interface Replicasetspec_apps_v1_k8s1_21: K8sManifest {
  /** Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to
be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) */
  @K8sDslMarker var minReadySeconds: Int?
  /** Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified.
Defaults to 1. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller */
  @K8sDslMarker var replicas: Int?
  /** Selector is a label query over pods that should match the replica count. Label keys and values that must match in order
to be controlled by this replica set. It must match the pod template's labels. More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  val selector: LabelSelector_meta_v1_k8s1_21?
  /** Template is the object that describes the pod that will be created if insufficient replicas are detected. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
  val template: Podtemplatespec_core_v1_k8s1_21?
}