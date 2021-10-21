package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Servicespec_core_v1_k8s1_16: K8sManifest {
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
  /** ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4 vs. IPv6). If a specific
IP family is requested, the clusterIP field will be allocated from that family, if it is available in the cluster. If no
IP family is requested, the cluster's primary IP family will be used. Other IP fields (loadBalancerIP,
loadBalancerSourceRanges, externalIPs) and controllers which allocate external load-balancers should use the same IP
family. Endpoints for this Service will be of this family. This field is immutable after creation. Assigning a
ServiceIPFamily not available in the cluster (e.g. IPv6 in IPv4 only cluster) is an error condition and will fail during
clusterIP assignment. */
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
  val ports: List<ServicePort_core_v1_k8s1_16>?
  /** publishNotReadyAddresses, when set to true, indicates that DNS implementations must publish the notReadyAddresses of
subsets for the Endpoints associated with the Service. The default value is false. The primary use case for setting this
field is to use a StatefulSet's Headless Service to propagate SRV records for its Pods without respect to their
readiness for purpose of peer discovery. */
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
  val sessionAffinityConfig: SessionAffinityConfig_core_v1_k8s1_16?
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
@K8sDslMarker
interface Servicespec_core_v1_k8s1_17: Servicespec_core_v1_k8s1_16 {
  /** topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially
sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy=Local. Topology
keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key
with available backends. If this field is specified and all entries have no backends that match the topology of the
client, the service has no backends for that client and connections should fail. The special value "`*`" may be used to
mean "any topology". This catch-all value, if used, only makes sense as the last value in the list. If this is not
specified or empty, no topology constraints will be applied. */
  @K8sDslMarker var topologyKeys: List<String>?
}      
typealias Servicespec_core_v1_k8s1_18 = Servicespec_core_v1_k8s1_17       
@K8sDslMarker
interface Servicespec_core_v1_k8s1_19: Servicespec_core_v1_k8s1_18 {
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
  override var ipFamily: String?
  /** publishNotReadyAddresses indicates that any agent which deals with endpoints for this Service should disregard any
indications of ready/not-ready. The primary use case for setting this field is for a StatefulSet's Headless Service to
propagate SRV DNS records for its Pods for the purpose of peer discovery. The Kubernetes controllers that generate
Endpoints and EndpointSlice resources for Services interpret this to mean that all endpoints are considered "ready" even
if the Pods themselves are not. Agents which consume only Kubernetes generated endpoints through the Endpoints or
EndpointSlice resources can safely assume this behavior. */
  override var publishNotReadyAddresses: Boolean?
}      
@K8sDslMarker
interface Servicespec_core_v1_k8s1_20: Servicespec_core_v1_k8s1_19 {
  /** allocateLoadBalancerNodePorts defines if NodePorts will be automatically allocated for services with type LoadBalancer.
Default is "true". It may be set to "false" if the cluster load-balancer does not rely on NodePorts.
allocateLoadBalancerNodePorts may only be set for services with type LoadBalancer and will be cleared if the type is
changed to any other type. This field is alpha-level and is only honored by servers that enable the
ServiceLBNodePortControl feature. */
  @K8sDslMarker var allocateLoadBalancerNodePorts: Boolean?
  /** clusterIP is the IP address of the service and is usually assigned randomly. If an address is specified manually, is
in-range (as per system configuration), and is not in use, it will be allocated to the service; otherwise creation of
the service will fail. This field may not be changed through updates unless the type field is also being changed to
ExternalName (which requires this field to be blank) or the type field is being changed from ExternalName (in which case
this field may optionally be specified, as describe above). Valid values are "None", empty string (""), or a valid IP
address. Setting this to "None" makes a "headless service" (no virtual IP), which is useful when direct endpoint
connections are preferred and proxying is not required. Only applies to types ClusterIP, NodePort, and LoadBalancer. If
this field is specified when creating a Service of type ExternalName, creation will fail. This field will be wiped when
updating a Service to type ExternalName. More info:
https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies */
  override var clusterIP: String?
  /** ClusterIPs is a list of IP addresses assigned to this service, and are usually assigned randomly. If an address is
specified manually, is in-range (as per system configuration), and is not in use, it will be allocated to the service;
otherwise creation of the service will fail. This field may not be changed through updates unless the type field is also
being changed to ExternalName (which requires this field to be empty) or the type field is being changed from
ExternalName (in which case this field may optionally be specified, as describe above). Valid values are "None", empty
string (""), or a valid IP address. Setting this to "None" makes a "headless service" (no virtual IP), which is useful
when direct endpoint connections are preferred and proxying is not required. Only applies to types ClusterIP, NodePort,
and LoadBalancer. If this field is specified when creating a Service of type ExternalName, creation will fail. This
field will be wiped when updating a Service to type ExternalName. If this field is not specified, it will be initialized
from the clusterIP field. If this field is specified, clients must ensure that clusterIPs[0] and clusterIP have the same
value. Unless the "IPv6DualStack" feature gate is enabled, this field is limited to one value, which must be the same as
the clusterIP field. If the feature gate is enabled, this field may hold a maximum of two entries (dual-stack IPs, in
either order). These IPs must correspond to the values of the ipFamilies field. Both clusterIPs and ipFamilies are
governed by the ipFamilyPolicy field. More info:
https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies */
  @K8sDslMarker var clusterIPs: List<String>?
  /** externalName is the external reference that discovery mechanisms will return as an alias for this service (e.g. a DNS
CNAME record). No proxying will be involved. Must be a lowercase RFC-1123 hostname (https://tools.ietf.org/html/rfc1123)
and requires Type to be */
  override var externalName: String?
  /** healthCheckNodePort specifies the healthcheck nodePort for the service. This only applies when type is set to
LoadBalancer and externalTrafficPolicy is set to Local. If a value is specified, is in-range, and is not in use, it will
be used. If not specified, a value will be automatically allocated. External systems (e.g. load-balancers) can use this
port to determine if a given node holds endpoints for this service or not. If this field is specified when creating a
Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need
it (e.g. changing type). */
  override var healthCheckNodePort: Int?
  /** IPFamilies is a list of IP families (e.g. IPv4, IPv6) assigned to this service, and is gated by the "IPv6DualStack"
feature gate. This field is usually assigned automatically based on cluster configuration and the ipFamilyPolicy field.
If this field is specified manually, the requested family is available in the cluster, and ipFamilyPolicy allows it, it
will be used; otherwise creation of the service will fail. This field is conditionally mutable: it allows for adding or
removing a secondary IP family, but it does not allow changing the primary IP family of the Service. Valid values are
"IPv4" and "IPv6". This field only applies to Services of types ClusterIP, NodePort, and LoadBalancer, and does apply to
"headless" services. This field will be wiped when updating a Service to type ExternalName. This field may hold a
maximum of two entries (dual-stack families, in either order). These families must correspond to the values of the
clusterIPs field, if specified. Both clusterIPs and ipFamilies are governed by the ipFamilyPolicy field. */
  @K8sDslMarker var ipFamilies: List<String>?
  /** IPFamilyPolicy represents the dual-stack-ness requested or required by this Service, and is gated by the "IPv6DualStack"
feature gate. If there is no value provided, then this field will be set to SingleStack. Services can be "SingleStack"
(a single IP family), "PreferDualStack" (two IP families on dual-stack configured clusters or a single IP family on
single-stack clusters), or "RequireDualStack" (two IP families on dual-stack configured clusters, otherwise fail). The
ipFamilies and clusterIPs fields depend on the value of this field. This field will be wiped when updating a service to
type ExternalName. */
  @K8sDslMarker var ipFamilyPolicy: String?
  /** topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially
sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy=Local. Topology
keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key
with available backends. If this field is specified and all entries have no backends that match the topology of the
client, the service has no backends for that client and connections should fail. The special value "`*`" may be used to
mean "any topology". This catch-all value, if used, only makes sense as the last value in the list. If this is not
specified or empty, no topology constraints will be applied. This field is alpha-level and is only honored by servers
that enable the ServiceTopology feature. */
  override var topologyKeys: List<String>?
  /** type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort,
and LoadBalancer. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are
determined by the selector or if that is not specified, by manual construction of an Endpoints object or EndpointSlice
objects. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather
than a virtual IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the same endpoints
as the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current
cloud) which routes to the same endpoints as the clusterIP. "ExternalName" aliases this service to the specified
externalName. Several other fields do not apply to ExternalName services. More info:
https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types */
  override var type: String?
}      
@K8sDslMarker
interface Servicespec_core_v1_k8s1_21: Servicespec_core_v1_k8s1_20 {
  /** externalName is the external reference that discovery mechanisms will return as an alias for this service (e.g. a DNS
CNAME record). No proxying will be involved. Must be a lowercase RFC-1123 hostname (https://tools.ietf.org/html/rfc1123)
and requires `type` to be "ExternalName". */
  override var externalName: String?
  /** InternalTrafficPolicy specifies if the cluster internal traffic should be routed to all endpoints or node-local
endpoints only. "Cluster" routes internal traffic to a Service to all endpoints. "Local" routes traffic to node-local
endpoints only, traffic is dropped if no node-local endpoints are ready. The default value is "Cluster". */
  @K8sDslMarker var internalTrafficPolicy: String?
  /** loadBalancerClass is the class of the load balancer implementation this Service belongs to. If specified, the value of
this field must be a label-style identifier, with an optional prefix, e.g. "internal-vip" or "example.com/internal-vip".
Unprefixed names are reserved for end-users. This field can only be set when the Service type is 'LoadBalancer'. If not
set, the default load balancer implementation is used, today this is typically done through the cloud provider
integration, but should apply for any default implementation. If set, it is assumed that a load balancer implementation
is watching for Services with a matching class. Any default load balancer implementation (e.g. cloud providers) should
ignore Services that set this field. This field can only be set when creating or updating a Service to type
'LoadBalancer'. Once set, it can not be changed. This field will be wiped when a service is updated to a non
'LoadBalancer' type. */
  @K8sDslMarker var loadBalancerClass: String?
  /** topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially
sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy=Local. Topology
keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key
with available backends. If this field is specified and all entries have no backends that match the topology of the
client, the service has no backends for that client and connections should fail. The special value "`*`" may be used to
mean "any topology". This catch-all value, if used, only makes sense as the last value in the list. If this is not
specified or empty, no topology constraints will be applied. This field is alpha-level and is only honored by servers
that enable the ServiceTopology feature. This field is deprecated and will be removed in a future version. */
  override var topologyKeys: List<String>?
}