package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Daemonsetspec_apps_v1_k8s1_16: K8sManifest {
  /** The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container
crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready). */
  @K8sDslMarker var minReadySeconds: Int?
  /** The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not
specified. Defaults to 10. */
  @K8sDslMarker var revisionHistoryLimit: Int?
  /** A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod
template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  val selector: LabelSelector_meta_v1_k8s1_16?
  /** An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every
node that matches the template's node selector (or on every node if no node selector is specified). More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
  val template: Podtemplatespec_core_v1_k8s1_16?
  /** An update strategy to replace existing DaemonSet pods with new pods. */
  val updateStrategy: DaemonSetUpdateStrategy_apps_v1_k8s1_16?
}      
@K8sDslMarker
interface Daemonsetspec_apps_v1_k8s1_17: K8sManifest {
  /** The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container
crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready). */
  @K8sDslMarker var minReadySeconds: Int?
  /** The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not
specified. Defaults to 10. */
  @K8sDslMarker var revisionHistoryLimit: Int?
  /** A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod
template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  val selector: LabelSelector_meta_v1_k8s1_17?
  /** An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every
node that matches the template's node selector (or on every node if no node selector is specified). More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
  val template: Podtemplatespec_core_v1_k8s1_17?
  /** An update strategy to replace existing DaemonSet pods with new pods. */
  val updateStrategy: DaemonSetUpdateStrategy_apps_v1_k8s1_17?
}      
@K8sDslMarker
interface Daemonsetspec_apps_v1_k8s1_18: K8sManifest {
  /** The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container
crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready). */
  @K8sDslMarker var minReadySeconds: Int?
  /** The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not
specified. Defaults to 10. */
  @K8sDslMarker var revisionHistoryLimit: Int?
  /** A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod
template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  val selector: LabelSelector_meta_v1_k8s1_18?
  /** An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every
node that matches the template's node selector (or on every node if no node selector is specified). More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
  val template: Podtemplatespec_core_v1_k8s1_18?
  /** An update strategy to replace existing DaemonSet pods with new pods. */
  val updateStrategy: DaemonSetUpdateStrategy_apps_v1_k8s1_18?
}      
@K8sDslMarker
interface Daemonsetspec_apps_v1_k8s1_19: K8sManifest {
  /** The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container
crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready). */
  @K8sDslMarker var minReadySeconds: Int?
  /** The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not
specified. Defaults to 10. */
  @K8sDslMarker var revisionHistoryLimit: Int?
  /** A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod
template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  val selector: LabelSelector_meta_v1_k8s1_19?
  /** An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every
node that matches the template's node selector (or on every node if no node selector is specified). More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
  val template: Podtemplatespec_core_v1_k8s1_19?
  /** An update strategy to replace existing DaemonSet pods with new pods. */
  val updateStrategy: DaemonSetUpdateStrategy_apps_v1_k8s1_19?
}      
@K8sDslMarker
interface Daemonsetspec_apps_v1_k8s1_20: K8sManifest {
  /** The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container
crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready). */
  @K8sDslMarker var minReadySeconds: Int?
  /** The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not
specified. Defaults to 10. */
  @K8sDslMarker var revisionHistoryLimit: Int?
  /** A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod
template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  val selector: LabelSelector_meta_v1_k8s1_20?
  /** An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every
node that matches the template's node selector (or on every node if no node selector is specified). More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
  val template: Podtemplatespec_core_v1_k8s1_20?
  /** An update strategy to replace existing DaemonSet pods with new pods. */
  val updateStrategy: DaemonSetUpdateStrategy_apps_v1_k8s1_20?
}      
@K8sDslMarker
interface Daemonsetspec_apps_v1_k8s1_21: K8sManifest {
  /** The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container
crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready). */
  @K8sDslMarker var minReadySeconds: Int?
  /** The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not
specified. Defaults to 10. */
  @K8sDslMarker var revisionHistoryLimit: Int?
  /** A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod
template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  val selector: LabelSelector_meta_v1_k8s1_21?
  /** An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every
node that matches the template's node selector (or on every node if no node selector is specified). More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
  val template: Podtemplatespec_core_v1_k8s1_21?
  /** An update strategy to replace existing DaemonSet pods with new pods. */
  val updateStrategy: DaemonSetUpdateStrategy_apps_v1_k8s1_21?
}