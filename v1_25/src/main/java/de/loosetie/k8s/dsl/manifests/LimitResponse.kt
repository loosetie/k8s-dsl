package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface LimitResponse_flowcontrol_apiserver_k8s_io_v1beta1: K8sManifest {
  /** `queuing` holds the configuration parameters for queuing. This field may be non-empty only if `type` is `"Queue"`. */
  val queuing: QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1beta1?
  /** `type` is "Queue" or "Reject". "Queue" means that requests that can not be executed upon arrival are held in a queue
until they can be executed or a queuing limit is reached. "Reject" means that requests that can not be executed upon
arrival are rejected. Required. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface LimitResponse_flowcontrol_apiserver_k8s_io_v1beta2: K8sManifest {
  /** `queuing` holds the configuration parameters for queuing. This field may be non-empty only if `type` is `"Queue"`. */
  val queuing: QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1beta2?
  /** `type` is "Queue" or "Reject". "Queue" means that requests that can not be executed upon arrival are held in a queue
until they can be executed or a queuing limit is reached. "Reject" means that requests that can not be executed upon
arrival are rejected. Required. */
  @K8sDslMarker var type: String?
}