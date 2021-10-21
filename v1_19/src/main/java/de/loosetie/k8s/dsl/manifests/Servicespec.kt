package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Servicespec_core_v1_k8s1_19: K8sManifest {
  /** clusterIP is the IP address of the service and is usually assigned randomly by the master. If an address is specified
manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail.
This field can not be changed through updates. Valid values are "None", empty string (""), or a valid IP address. "None"
can be specified for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and
LoadBalancer. Ignored if type is ExternalName. More info:
https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies */
  @K8sDslMarker var clusterIP: String?
  /** externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service. These
IPs are not managed by Kubernetes. The user is responsible for ensuring that traffic arrives at a node with this IP. A
common example is external load-balancers that are not part of the Kubernetes system. */
  @K8sDslMarker var externalIPs: List<String>?
  /** externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service. No
proxying will be involved. Must be a valid RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires Type to
be ExternalName. */
  @K8sDslMarker var externalName: String?
  /** externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints.
"Local" preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks
potentially imbalanced traffic spreading. "Cluster" obscures the client source IP and may cause a second hop to another
node, but should have good overall load-spreading. */
  @K8sDslMarker var externalTrafficPolicy: String?
  /** healthCheckNodePort specifies the healthcheck nodePort for the service. If not specified, HealthCheckNodePort is created
by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the
client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local. */
  @K8sDslMarker var healthCheckNodePort: Int?
  /** ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4 vs. IPv6) when the
IPv6DualStack feature gate is enabled. In a dual-stack cluster, you can specify ipFamily when creating a ClusterIP
Service to determine whether the controller will allocate an IPv4 or IPv6 IP for it, and you can specify ipFamily when
creating a headless Service to determine whether it will have IPv4 or IPv6 Endpoints. In either case, if you do not
specify an ipFamily explicitly, it will default to the cluster's primary IP family. This field is part of an alpha
feature, and you should not make any assumptions about its semantics other than those described above. In particular,
you should not assume that it can (or cannot) be changed after creation time; that it can only have the values "IPv4"
and "IPv6"; or that its current value on a given Service correctly reflects the current state of that Service. (For
ClusterIP Services, look at clusterIP to see if the Service is IPv4 or IPv6. For headless Services, look at the
endpoints, which may be dual-stack in the future. For ExternalName Services, ipFamily has no meaning, but it may be set
to an irrelevant value anyway.) */
  @K8sDslMarker var ipFamily: String?
  /** Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field. This
feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is
created. This field will be ignored if the cloud-provider does not support the feature. */
  @K8sDslMarker var loadBalancerIP: String?
  /** If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be
restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature."
More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/ */
  @K8sDslMarker var loadBalancerSourceRanges: List<String>?
  /** The list of ports that are exposed by this service. More info:
https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies */
  val ports: List<ServicePort_core_v1_k8s1_19>?
  /** publishNotReadyAddresses indicates that any agent which deals with endpoints for this Service should disregard any
indications of ready/not-ready. The primary use case for setting this field is for a StatefulSet's Headless Service to
propagate SRV DNS records for its Pods for the purpose of peer discovery. The Kubernetes controllers that generate
Endpoints and EndpointSlice resources for Services interpret this to mean that all endpoints are considered "ready" even
if the Pods themselves are not. Agents which consume only Kubernetes generated endpoints through the Endpoints or
EndpointSlice resources can safely assume this behavior. */
  @K8sDslMarker var publishNotReadyAddresses: Boolean?
  /** Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is
assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types
ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info:
https://kubernetes.io/docs/concepts/services-networking/service/ */
  @K8sDslMarker var selector: Any?
  /** Supports "ClientIP" and "None". Used to maintain session affinity. Enable client IP based session affinity. Must be
ClientIP or None. Defaults to None. More info:
https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies */
  @K8sDslMarker var sessionAffinity: String?
  /** sessionAffinityConfig contains the configurations of session affinity. */
  val sessionAffinityConfig: SessionAffinityConfig_core_v1_k8s1_19?
  /** topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially
sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy=Local. Topology
keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key
with available backends. If this field is specified and all entries have no backends that match the topology of the
client, the service has no backends for that client and connections should fail. The special value "`*`" may be used to
mean "any topology". This catch-all value, if used, only makes sense as the last value in the list. If this is not
specified or empty, no topology constraints will be applied. */
  @K8sDslMarker var topologyKeys: List<String>?
  /** type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort,
and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address
for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual
construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published
as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which
routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the
current cloud) which routes to the clusterIP. More info:
https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types */
  @K8sDslMarker var type: String?
}