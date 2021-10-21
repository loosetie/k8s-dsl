package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface EndpointAddress_core_v1_k8s1_16: K8sManifest {
  /** The Hostname of this endpoint */
  @K8sDslMarker var hostname: String?
  /** The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast
((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components,
like kube-proxy, are not IPv6 ready. */
  @K8sDslMarker var ip: String?
  /** Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node. */
  @K8sDslMarker var nodeName: String?
  /** Reference to object providing the endpoint. */
  val targetRef: ObjectReference_core_v1_k8s1_16?
}      
typealias EndpointAddress_core_v1_k8s1_17 = EndpointAddress_core_v1_k8s1_16       
typealias EndpointAddress_core_v1_k8s1_18 = EndpointAddress_core_v1_k8s1_17       
typealias EndpointAddress_core_v1_k8s1_19 = EndpointAddress_core_v1_k8s1_18       
typealias EndpointAddress_core_v1_k8s1_20 = EndpointAddress_core_v1_k8s1_19       
typealias EndpointAddress_core_v1_k8s1_21 = EndpointAddress_core_v1_k8s1_20 