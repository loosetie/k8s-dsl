package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Event_events_k8s_io_v1: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "events.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Event"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1
  /** action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be
empty for new Events and it can have at most 128 characters. */
  @K8sDslMarker var action: String?
  /** deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type. */
  @K8sDslMarker var deprecatedCount: Int?
  /** deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type. */
  val deprecatedFirstTimestamp: Time_meta_v1?
  /** deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type. */
  val deprecatedLastTimestamp: Time_meta_v1?
  /** deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type. */
  val deprecatedSource: EventSource_core_v1?
  /** eventTime is the time when this Event was first observed. It is required. */
  val eventTime: MicroTime_meta_v1?
  /** note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries
should be prepared to handle values up to 64kB. */
  @K8sDslMarker var note: String?
  /** reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at
most 128 characters. */
  @K8sDslMarker var reason: String?
  /** regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g.
ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet
object. */
  val regarding: ObjectReference_core_v1?
  /** related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or
deletion of related object. */
  val related: ObjectReference_core_v1?
  /** reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field
cannot be empty for new Events. */
  @K8sDslMarker var reportingController: String?
  /** reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events
and it can have at most 128 characters. */
  @K8sDslMarker var reportingInstance: String?
  /** series is data about the Event series this event represents or nil if it's a singleton Event. */
  val series: EventSeries_events_k8s_io_v1?
  /** type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This
field cannot be empty for new Events. */
  @K8sDslMarker var type: String?
}