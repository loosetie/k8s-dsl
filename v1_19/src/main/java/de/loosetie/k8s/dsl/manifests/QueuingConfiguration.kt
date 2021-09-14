package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19: K8sManifest {
  /** `handSize` is a small positive number that configures the shuffle sharding of requests into queues. When enqueuing a
request at this priority level the request's flow identifier (a string pair) is hashed and the hash value is used to
shuffle the list of queues and deal a hand of the size specified here. The request is put into one of the shortest
queues in that hand. `handSize` must be no larger than `queues`, and should be significantly smaller (so that a few
heavy flows do not saturate most of the queues). See the user-facing documentation for more extensive guidance on
setting this field. This field has a default value of 8. */
  @K8sDslMarker var handSize: Int?
  /** `queueLengthLimit` is the maximum number of requests allowed to be waiting in a given queue of this priority level at a
time; excess requests are rejected. This value must be positive. If not specified, it will be defaulted to 50. */
  @K8sDslMarker var queueLengthLimit: Int?
  /** `queues` is the number of queues for this priority level. The queues exist independently at each apiserver. The value
must be positive. Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of
associated flow schemas irrelevant. This field has a default value of 64. */
  @K8sDslMarker var queues: Int?
}