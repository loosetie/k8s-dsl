package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PriorityClass_scheduling_k8s_io_v1_k8s1_20: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "scheduling.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "PriorityClass"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1_k8s1_20
  /** description is an arbitrary string that usually provides guidelines on when this priority class should be used. */
  @K8sDslMarker var description: String?
  /** globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not
have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one
PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default
PriorityClasses will be used as the default priority. */
  @K8sDslMarker var globalDefault: Boolean?
  /** PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to
PreemptLowerPriority if unset. This field is beta-level, gated by the NonPreemptingPriority feature-gate. */
  @K8sDslMarker var preemptionPolicy: String?
  /** The value of this priority class. This is the actual priority that pods receive when they have the name of this class in
their pod spec. */
  @K8sDslMarker var value: Int?
}