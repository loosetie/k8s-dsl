package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Event_core_v1: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Event"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1
  /** What action was taken/failed regarding to the Regarding object. */
  @K8sDslMarker var action: String?
  /** The number of times this event has occurred. */
  @K8sDslMarker var count: Int?
  /** Time when this Event was first observed. */
  val eventTime: MicroTime_meta_v1?
  /** The time at which the event was first recorded. (Time of server receipt is in TypeMeta.) */
  val firstTimestamp: Time_meta_v1?
  /** The object that this event is about. */
  val involvedObject: ObjectReference_core_v1?
  /** The time at which the most recent occurrence of this event was recorded. */
  val lastTimestamp: Time_meta_v1?
  /** A human-readable description of the status of this operation. */
  @K8sDslMarker var message: String?
  /** This should be a short, machine understandable string that gives the reason for the transition into the object's current
status. */
  @K8sDslMarker var reason: String?
  /** Optional secondary object for more complex actions. */
  val related: ObjectReference_core_v1?
  /** Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. */
  @K8sDslMarker var reportingComponent: String?
  /** ID of the controller instance, e.g. `kubelet-xyzf`. */
  @K8sDslMarker var reportingInstance: String?
  /** Data about the Event series this event represents or nil if it's a singleton Event. */
  val series: EventSeries_core_v1?
  /** The component reporting this event. Should be a short machine understandable string. */
  val source: EventSource_core_v1?
  /** Type of this event (Normal, Warning), new types could be added in the future */
  @K8sDslMarker var type: String?
}