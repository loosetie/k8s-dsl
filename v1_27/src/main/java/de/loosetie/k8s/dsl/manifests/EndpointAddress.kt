package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface EndpointAddress_core_v1: K8sManifest {
  /** The Hostname of this endpoint */
  @K8sDslMarker var hostname: String?
  /** The IP of this endpoint. May not be loopback (127.0.0.0/8 or ::1), link-local (169.254.0.0/16 or fe80::/10), or
link-local multicast (224.0.0.0/24 or ff02::/16). */
  @K8sDslMarker var ip: String?
  /** Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node. */
  @K8sDslMarker var nodeName: String?
  /** Reference to object providing the endpoint. */
  val targetRef: ObjectReference_core_v1?
}