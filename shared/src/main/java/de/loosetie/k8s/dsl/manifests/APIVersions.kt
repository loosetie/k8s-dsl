package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface APIVersions_meta_v1_k8s1_16: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "meta/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "APIVersions"
  /** a map of client CIDR to server address that is serving this group. This is to help clients reach servers in the most
network-efficient way possible. Clients can use the appropriate server address as per the CIDR that they match. In case
of multiple matches, clients should use the longest matching CIDR. The server returns only those CIDRs that it thinks
that the client can match. For example: the master will return an internal IP CIDR only, if the client reaches the
server using an internal IP. Server looks at X-Forwarded-For header or X-Real-Ip header or request.RemoteAddr (in that
order) to get the client IP. */
  val serverAddressByClientCIDRs: List<ServerAddressByClientCIDR_meta_v1_k8s1_16>?
  /** versions are the api versions that are available. */
  @K8sDslMarker var versions: List<String>?
}      
typealias APIVersions_meta_v1_k8s1_17 = APIVersions_meta_v1_k8s1_16       
typealias APIVersions_meta_v1_k8s1_18 = APIVersions_meta_v1_k8s1_17       
typealias APIVersions_meta_v1_k8s1_19 = APIVersions_meta_v1_k8s1_18       
typealias APIVersions_meta_v1_k8s1_20 = APIVersions_meta_v1_k8s1_19       
typealias APIVersions_meta_v1_k8s1_21 = APIVersions_meta_v1_k8s1_20 