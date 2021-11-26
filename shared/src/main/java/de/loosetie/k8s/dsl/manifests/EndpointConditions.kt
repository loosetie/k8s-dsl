package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface EndpointConditions_discovery_k8s_io_v1alpha1_k8s1_16: K8sManifest {
  /** ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the
endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready. */
  @K8sDslMarker var ready: Boolean?
}      
@K8sDslMarker
interface EndpointConditions_discovery_k8s_io_v1beta1_k8s1_17: K8sManifest {
  /** ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the
endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready. */
  @K8sDslMarker var ready: Boolean?
}      
typealias EndpointConditions_discovery_k8s_io_v1beta1_k8s1_18 = EndpointConditions_discovery_k8s_io_v1beta1_k8s1_17       
typealias EndpointConditions_discovery_k8s_io_v1beta1_k8s1_19 = EndpointConditions_discovery_k8s_io_v1beta1_k8s1_18       
@K8sDslMarker
interface EndpointConditions_discovery_k8s_io_v1beta1_k8s1_20: EndpointConditions_discovery_k8s_io_v1beta1_k8s1_19 {
  /** ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the
endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready.
For compatibility reasons, ready should never be "true" for terminating endpoints. */
  override var ready: Boolean?
  /** serving is identical to ready except that it is set regardless of the terminating state of endpoints. This condition
should be set to true for a ready endpoint that is terminating. If nil, consumers should defer to the ready condition.
This field can be enabled with the EndpointSliceTerminatingCondition feature gate. */
  @K8sDslMarker var serving: Boolean?
  /** terminating indicates that this endpoint is terminating. A nil value indicates an unknown state. Consumers should
interpret this unknown state to mean that the endpoint is not terminating. This field can be enabled with the
EndpointSliceTerminatingCondition feature gate. */
  @K8sDslMarker var terminating: Boolean?
}      
@K8sDslMarker
interface EndpointConditions_discovery_k8s_io_v1_k8s1_21: K8sManifest {
  /** ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the
endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready.
For compatibility reasons, ready should never be "true" for terminating endpoints. */
  @K8sDslMarker var ready: Boolean?
  /** serving is identical to ready except that it is set regardless of the terminating state of endpoints. This condition
should be set to true for a ready endpoint that is terminating. If nil, consumers should defer to the ready condition.
This field can be enabled with the EndpointSliceTerminatingCondition feature gate. */
  @K8sDslMarker var serving: Boolean?
  /** terminating indicates that this endpoint is terminating. A nil value indicates an unknown state. Consumers should
interpret this unknown state to mean that the endpoint is not terminating. This field can be enabled with the
EndpointSliceTerminatingCondition feature gate. */
  @K8sDslMarker var terminating: Boolean?
}