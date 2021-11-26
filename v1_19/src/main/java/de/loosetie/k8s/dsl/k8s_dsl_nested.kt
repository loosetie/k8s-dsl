package de.loosetie.k8s.dsl

import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.manifests.*
import de.loosetie.k8s.dsl.impls.*

/** preferredVersion is the version preferred by the API server, which probably is the storage version. */
@K8sDslMarker
fun APIGroup.preferredVersion(init: GroupVersionForDiscovery.() -> Unit) {
  this as APIGroup_meta_v1_k8s1_19Impl
  GroupVersionForDiscovery_meta_v1_k8s1_19Impl(this)
    .also { preferredVersion = it }
    .apply(init)
}

/** a map of client CIDR to server address that is serving this group. This is to help clients reach servers in the most
network-efficient way possible. Clients can use the appropriate server address as per the CIDR that they match. In case
of multiple matches, clients should use the longest matching CIDR. The server returns only those CIDRs that it thinks
that the client can match. For example: the master will return an internal IP CIDR only, if the client reaches the
server using an internal IP. Server looks at X-Forwarded-For header or X-Real-Ip header or request.RemoteAddr (in that
order) to get the client IP. */
@K8sDslMarker
fun APIGroup.serverAddressByClientCIDRs(init: ServerAddressByClientCIDR.() -> Unit) {
  this as APIGroup_meta_v1_k8s1_19Impl
  ServerAddressByClientCIDR_meta_v1_k8s1_19Impl(this)
    .also { serverAddressByClientCIDRs = serverAddressByClientCIDRs?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** versions are the versions supported in this group. */
@K8sDslMarker
fun APIGroup.versions(init: GroupVersionForDiscovery.() -> Unit) {
  this as APIGroup_meta_v1_k8s1_19Impl
  GroupVersionForDiscovery_meta_v1_k8s1_19Impl(this)
    .also { versions = versions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Last time the condition transitioned from one status to another. */
@K8sDslMarker
fun APIServiceCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as APIServiceCondition_apiregistration_k8s_io_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun APIService.metadata(init: ObjectMeta.() -> Unit) {
  this as APIService_apiregistration_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec contains information for locating and communicating with a server */
@K8sDslMarker
fun APIService.spec(init: Apiservicespec.() -> Unit) {
  this as APIService_apiregistration_k8s_io_v1_k8s1_19Impl
  Apiservicespec_apiregistration_k8s_io_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status contains derived information about an API server */
@K8sDslMarker
fun APIService.status(init: Apiservicestatus.() -> Unit) {
  this as APIService_apiregistration_k8s_io_v1_k8s1_19Impl
  Apiservicestatus_apiregistration_k8s_io_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** a map of client CIDR to server address that is serving this group. This is to help clients reach servers in the most
network-efficient way possible. Clients can use the appropriate server address as per the CIDR that they match. In case
of multiple matches, clients should use the longest matching CIDR. The server returns only those CIDRs that it thinks
that the client can match. For example: the master will return an internal IP CIDR only, if the client reaches the
server using an internal IP. Server looks at X-Forwarded-For header or X-Real-Ip header or request.RemoteAddr (in that
order) to get the client IP. */
@K8sDslMarker
fun APIVersions.serverAddressByClientCIDRs(init: ServerAddressByClientCIDR.() -> Unit) {
  this as APIVersions_meta_v1_k8s1_19Impl
  ServerAddressByClientCIDR_meta_v1_k8s1_19Impl(this)
    .also { serverAddressByClientCIDRs = serverAddressByClientCIDRs?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Describes node affinity scheduling rules for the pod. */
@K8sDslMarker
fun Affinity.nodeAffinity(init: NodeAffinity.() -> Unit) {
  this as Affinity_core_v1_k8s1_19Impl
  NodeAffinity_core_v1_k8s1_19Impl(this)
    .also { nodeAffinity = it }
    .apply(init)
}

/** Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)). */
@K8sDslMarker
fun Affinity.podAffinity(init: PodAffinity.() -> Unit) {
  this as Affinity_core_v1_k8s1_19Impl
  PodAffinity_core_v1_k8s1_19Impl(this)
    .also { podAffinity = it }
    .apply(init)
}

/** Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other
pod(s)). */
@K8sDslMarker
fun Affinity.podAntiAffinity(init: PodAntiAffinity.() -> Unit) {
  this as Affinity_core_v1_k8s1_19Impl
  PodAntiAffinity_core_v1_k8s1_19Impl(this)
    .also { podAntiAffinity = it }
    .apply(init)
}

/** ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of
the selectors match, then the ClusterRole's permissions will be added */
@K8sDslMarker
fun AggregationRule.clusterRoleSelectors(init: LabelSelector.() -> Unit) {
  this as AggregationRule_rbac_authorization_k8s_io_v1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { clusterRoleSelectors = clusterRoleSelectors?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Binding.metadata(init: ObjectMeta.() -> Unit) {
  this as Binding_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** The target object that you want to bind to the standard object. */
@K8sDslMarker
fun Binding.target(init: ObjectReference.() -> Unit) {
  this as Binding_core_v1_k8s1_19Impl
  ObjectReference_core_v1_k8s1_19Impl(this)
    .also { target = it }
    .apply(init)
}

/** Standard object metadata. metadata.Name indicates the name of the CSI driver that this object refers to; it MUST be the
same name returned by the CSI GetPluginName() call for that driver. The driver name must be 63 characters or less,
beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and alphanumerics between.
More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun CSIDriver.metadata(init: ObjectMeta.() -> Unit) {
  this as CSIDriver_storage_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the CSI Driver. */
@K8sDslMarker
fun CSIDriver.spec(init: Csidriverspec.() -> Unit) {
  this as CSIDriver_storage_k8s_io_v1_k8s1_19Impl
  Csidriverspec_storage_k8s_io_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** allocatable represents the volume resources of a node that are available for scheduling. This field is beta. */
@K8sDslMarker
fun CSINodeDriver.allocatable(init: VolumeNodeResources.() -> Unit) {
  this as CSINodeDriver_storage_k8s_io_v1_k8s1_19Impl
  VolumeNodeResources_storage_k8s_io_v1_k8s1_19Impl(this)
    .also { allocatable = it }
    .apply(init)
}

/** metadata.name must be the Kubernetes node name. */
@K8sDslMarker
fun CSINode.metadata(init: ObjectMeta.() -> Unit) {
  this as CSINode_storage_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** spec is the specification of CSINode */
@K8sDslMarker
fun CSINode.spec(init: Csinodespec.() -> Unit) {
  this as CSINode_storage_k8s_io_v1_k8s1_19Impl
  Csinodespec_storage_k8s_io_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** ControllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver
to complete the CSI ControllerExpandVolume call. This is an alpha field and requires enabling ExpandCSIVolumes feature
gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one
secret, all secrets are passed. */
@K8sDslMarker
fun CSIPersistentVolumeSource.controllerExpandSecretRef(init: SecretReference.() -> Unit) {
  this as CSIPersistentVolumeSource_core_v1_k8s1_19Impl
  SecretReference_core_v1_k8s1_19Impl(this)
    .also { controllerExpandSecretRef = it }
    .apply(init)
}

/** ControllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI
driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may
be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed. */
@K8sDslMarker
fun CSIPersistentVolumeSource.controllerPublishSecretRef(init: SecretReference.() -> Unit) {
  this as CSIPersistentVolumeSource_core_v1_k8s1_19Impl
  SecretReference_core_v1_k8s1_19Impl(this)
    .also { controllerPublishSecretRef = it }
    .apply(init)
}

/** NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to
complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret
is required. If the secret object contains more than one secret, all secrets are passed. */
@K8sDslMarker
fun CSIPersistentVolumeSource.nodePublishSecretRef(init: SecretReference.() -> Unit) {
  this as CSIPersistentVolumeSource_core_v1_k8s1_19Impl
  SecretReference_core_v1_k8s1_19Impl(this)
    .also { nodePublishSecretRef = it }
    .apply(init)
}

/** NodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to
complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be
empty if no secret is required. If the secret object contains more than one secret, all secrets are passed. */
@K8sDslMarker
fun CSIPersistentVolumeSource.nodeStageSecretRef(init: SecretReference.() -> Unit) {
  this as CSIPersistentVolumeSource_core_v1_k8s1_19Impl
  SecretReference_core_v1_k8s1_19Impl(this)
    .also { nodeStageSecretRef = it }
    .apply(init)
}

/** NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to
complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret
is required. If the secret object contains more than one secret, all secret references are passed. */
@K8sDslMarker
fun CSIVolumeSource.nodePublishSecretRef(init: LocalObjectReference.() -> Unit) {
  this as CSIVolumeSource_core_v1_k8s1_19Impl
  LocalObjectReference_core_v1_k8s1_19Impl(this)
    .also { nodePublishSecretRef = it }
    .apply(init)
}

/** Optional: SecretRef is reference to the authentication secret for User, default is empty. More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
@K8sDslMarker
fun CephFSPersistentVolumeSource.secretRef(init: SecretReference.() -> Unit) {
  this as CephFSPersistentVolumeSource_core_v1_k8s1_19Impl
  SecretReference_core_v1_k8s1_19Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** Optional: SecretRef is reference to the authentication secret for User, default is empty. More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
@K8sDslMarker
fun CephFSVolumeSource.secretRef(init: LocalObjectReference.() -> Unit) {
  this as CephFSVolumeSource_core_v1_k8s1_19Impl
  LocalObjectReference_core_v1_k8s1_19Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new
condition type is added or an existing condition's status is changed, the server defaults this to the current time. */
@K8sDslMarker
fun CertificateSigningRequestCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as CertificateSigningRequestCondition_certificates_k8s_io_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** lastUpdateTime is the time of the last update to this condition */
@K8sDslMarker
fun CertificateSigningRequestCondition.lastUpdateTime(init: Time.() -> Unit) {
  this as CertificateSigningRequestCondition_certificates_k8s_io_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastUpdateTime = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun CertificateSigningRequest.metadata(init: ObjectMeta.() -> Unit) {
  this as CertificateSigningRequest_certificates_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** spec contains the certificate request, and is immutable after creation. Only the request, signerName, and usages fields
can be set on creation. Other fields are derived by Kubernetes and cannot be modified by users. */
@K8sDslMarker
fun CertificateSigningRequest.spec(init: Certificatesigningrequestspec.() -> Unit) {
  this as CertificateSigningRequest_certificates_k8s_io_v1_k8s1_19Impl
  Certificatesigningrequestspec_certificates_k8s_io_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** status contains information about whether the request is approved or denied, and the certificate issued by the signer,
or the failure condition indicating signer failure. */
@K8sDslMarker
fun CertificateSigningRequest.status(init: Certificatesigningrequeststatus.() -> Unit) {
  this as CertificateSigningRequest_certificates_k8s_io_v1_k8s1_19Impl
  Certificatesigningrequeststatus_certificates_k8s_io_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** Optional: points to a secret object containing parameters used to connect to OpenStack. */
@K8sDslMarker
fun CinderPersistentVolumeSource.secretRef(init: SecretReference.() -> Unit) {
  this as CinderPersistentVolumeSource_core_v1_k8s1_19Impl
  SecretReference_core_v1_k8s1_19Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** Optional: points to a secret object containing parameters used to connect to OpenStack. */
@K8sDslMarker
fun CinderVolumeSource.secretRef(init: LocalObjectReference.() -> Unit) {
  this as CinderVolumeSource_core_v1_k8s1_19Impl
  LocalObjectReference_core_v1_k8s1_19Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** Standard object's metadata. */
@K8sDslMarker
fun ClusterRoleBinding.metadata(init: ObjectMeta.() -> Unit) {
  this as ClusterRoleBinding_rbac_authorization_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must
return an error. */
@K8sDslMarker
fun ClusterRoleBinding.roleRef(init: RoleRef.() -> Unit) {
  this as ClusterRoleBinding_rbac_authorization_k8s_io_v1_k8s1_19Impl
  RoleRef_rbac_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { roleRef = it }
    .apply(init)
}

/** Subjects holds references to the objects the role applies to. */
@K8sDslMarker
fun ClusterRoleBinding.subjects(init: Subject_rbac_authorization_k8s_io_v1_k8s1_19.() -> Unit) {
  this as ClusterRoleBinding_rbac_authorization_k8s_io_v1_k8s1_19Impl
  Subject_rbac_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { subjects = subjects?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is
set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller. */
@K8sDslMarker
fun ClusterRole.aggregationRule(init: AggregationRule.() -> Unit) {
  this as ClusterRole_rbac_authorization_k8s_io_v1_k8s1_19Impl
  AggregationRule_rbac_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { aggregationRule = it }
    .apply(init)
}

/** Standard object's metadata. */
@K8sDslMarker
fun ClusterRole.metadata(init: ObjectMeta.() -> Unit) {
  this as ClusterRole_rbac_authorization_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Rules holds all the PolicyRules for this ClusterRole */
@K8sDslMarker
fun ClusterRole.rules(init: PolicyRule.() -> Unit) {
  this as ClusterRole_rbac_authorization_k8s_io_v1_k8s1_19Impl
  PolicyRule_rbac_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { rules = rules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of component conditions observed */
@K8sDslMarker
fun ComponentStatus.conditions(init: ComponentCondition.() -> Unit) {
  this as ComponentStatus_core_v1_k8s1_19Impl
  ComponentCondition_core_v1_k8s1_19Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun ComponentStatus.metadata(init: ObjectMeta.() -> Unit) {
  this as ComponentStatus_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a
file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified
paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume
setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with
'..'. */
@K8sDslMarker
fun ConfigMapProjection.items(init: KeyToPath.() -> Unit) {
  this as ConfigMapProjection_core_v1_k8s1_19Impl
  KeyToPath_core_v1_k8s1_19Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a
file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified
paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume
setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with
'..'. */
@K8sDslMarker
fun ConfigMapVolumeSource.items(init: KeyToPath.() -> Unit) {
  this as ConfigMapVolumeSource_core_v1_k8s1_19Impl
  KeyToPath_core_v1_k8s1_19Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun ConfigMap.metadata(init: ObjectMeta.() -> Unit) {
  this as ConfigMap_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Time at which the container was last (re-)started */
@K8sDslMarker
fun ContainerStateRunning.startedAt(init: Time.() -> Unit) {
  this as ContainerStateRunning_core_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { startedAt = it }
    .apply(init)
}

/** Time at which the container last terminated */
@K8sDslMarker
fun ContainerStateTerminated.finishedAt(init: Time.() -> Unit) {
  this as ContainerStateTerminated_core_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { finishedAt = it }
    .apply(init)
}

/** Time at which previous execution of the container started */
@K8sDslMarker
fun ContainerStateTerminated.startedAt(init: Time.() -> Unit) {
  this as ContainerStateTerminated_core_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { startedAt = it }
    .apply(init)
}

/** Details about a running container */
@K8sDslMarker
fun ContainerState.running(init: ContainerStateRunning.() -> Unit) {
  this as ContainerState_core_v1_k8s1_19Impl
  ContainerStateRunning_core_v1_k8s1_19Impl(this)
    .also { running = it }
    .apply(init)
}

/** Details about a terminated container */
@K8sDslMarker
fun ContainerState.terminated(init: ContainerStateTerminated.() -> Unit) {
  this as ContainerState_core_v1_k8s1_19Impl
  ContainerStateTerminated_core_v1_k8s1_19Impl(this)
    .also { terminated = it }
    .apply(init)
}

/** Details about a waiting container */
@K8sDslMarker
fun ContainerState.waiting(init: ContainerStateWaiting.() -> Unit) {
  this as ContainerState_core_v1_k8s1_19Impl
  ContainerStateWaiting_core_v1_k8s1_19Impl(this)
    .also { waiting = it }
    .apply(init)
}

/** List of environment variables to set in the container. Cannot be updated. */
@K8sDslMarker
fun Container.env(init: EnvVar.() -> Unit) {
  this as Container_core_v1_k8s1_19Impl
  EnvVar_core_v1_k8s1_19Impl(this)
    .also { env = env?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of sources to populate environment variables in the container. The keys defined within a source must be a
C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in
multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a
duplicate key will take precedence. Cannot be updated. */
@K8sDslMarker
fun Container.envFrom(init: EnvFromSource.() -> Unit) {
  this as Container_core_v1_k8s1_19Impl
  EnvFromSource_core_v1_k8s1_19Impl(this)
    .also { envFrom = envFrom?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Actions that the management system should take in response to container lifecycle events. Cannot be updated. */
@K8sDslMarker
fun Container.lifecycle(init: Lifecycle.() -> Unit) {
  this as Container_core_v1_k8s1_19Impl
  Lifecycle_core_v1_k8s1_19Impl(this)
    .also { lifecycle = it }
    .apply(init)
}

/** Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
@K8sDslMarker
fun Container.livenessProbe(init: Probe.() -> Unit) {
  this as Container_core_v1_k8s1_19Impl
  Probe_core_v1_k8s1_19Impl(this)
    .also { livenessProbe = it }
    .apply(init)
}

/** List of ports to expose from the container. Exposing a port here gives the system additional information about the
network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that
port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be
accessible from the network. Cannot be updated. */
@K8sDslMarker
fun Container.ports(init: ContainerPort.() -> Unit) {
  this as Container_core_v1_k8s1_19Impl
  ContainerPort_core_v1_k8s1_19Impl(this)
    .also { ports = ports?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails.
Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
@K8sDslMarker
fun Container.readinessProbe(init: Probe.() -> Unit) {
  this as Container_core_v1_k8s1_19Impl
  Probe_core_v1_k8s1_19Impl(this)
    .also { readinessProbe = it }
    .apply(init)
}

/** Compute Resources required by this container. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/ */
@K8sDslMarker
fun Container.resources(init: ResourceRequirements.() -> Unit) {
  this as Container_core_v1_k8s1_19Impl
  ResourceRequirements_core_v1_k8s1_19Impl(this)
    .also { resources = it }
    .apply(init)
}

/** Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More
info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/ */
@K8sDslMarker
fun Container.securityContext(init: SecurityContext.() -> Unit) {
  this as Container_core_v1_k8s1_19Impl
  SecurityContext_core_v1_k8s1_19Impl(this)
    .also { securityContext = it }
    .apply(init)
}

/** StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this
completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be
used to provide different probe parameters at the beginning of a Pod's lifecycle, when it might take a long time to load
data or warm a cache, than during steady-state operation. This cannot be updated. This is a beta feature enabled by the
StartupProbe feature flag. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
@K8sDslMarker
fun Container.startupProbe(init: Probe.() -> Unit) {
  this as Container_core_v1_k8s1_19Impl
  Probe_core_v1_k8s1_19Impl(this)
    .also { startupProbe = it }
    .apply(init)
}

/** volumeDevices is the list of block devices to be used by the container. */
@K8sDslMarker
fun Container.volumeDevices(init: VolumeDevice.() -> Unit) {
  this as Container_core_v1_k8s1_19Impl
  VolumeDevice_core_v1_k8s1_19Impl(this)
    .also { volumeDevices = volumeDevices?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Pod volumes to mount into the container's filesystem. Cannot be updated. */
@K8sDslMarker
fun Container.volumeMounts(init: VolumeMount.() -> Unit) {
  this as Container_core_v1_k8s1_19Impl
  VolumeMount_core_v1_k8s1_19Impl(this)
    .also { volumeMounts = volumeMounts?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun ControllerRevision.metadata(init: ObjectMeta.() -> Unit) {
  this as ControllerRevision_apps_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun CronJob.metadata(init: ObjectMeta.() -> Unit) {
  this as CronJob_batch_v1beta1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired behavior of a cron job, including the schedule. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun CronJob.spec(init: Cronjobspec.() -> Unit) {
  this as CronJob_batch_v1beta1_k8s1_19Impl
  Cronjobspec_batch_v1beta1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Current status of a cron job. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun CronJob.status(init: Cronjobstatus.() -> Unit) {
  this as CronJob_batch_v1beta1_k8s1_19Impl
  Cronjobstatus_batch_v1beta1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** webhook describes how to call the conversion webhook. Required when `strategy` is set to `Webhook`. */
@K8sDslMarker
fun CustomResourceConversion.webhook(init: WebhookConversion.() -> Unit) {
  this as CustomResourceConversion_apiextensions_k8s_io_v1_k8s1_19Impl
  WebhookConversion_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { webhook = it }
    .apply(init)
}

/** lastTransitionTime last time the condition transitioned from one status to another. */
@K8sDslMarker
fun CustomResourceDefinitionCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as CustomResourceDefinitionCondition_apiextensions_k8s_io_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** additionalPrinterColumns specifies additional columns returned in Table output. See
https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If no columns
are specified, a single column displaying the age of the custom resource is used. */
@K8sDslMarker
fun CustomResourceDefinitionVersion.additionalPrinterColumns(init: CustomResourceColumnDefinition.() -> Unit) {
  this as CustomResourceDefinitionVersion_apiextensions_k8s_io_v1_k8s1_19Impl
  CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { additionalPrinterColumns = additionalPrinterColumns?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** schema describes the schema used for validation, pruning, and defaulting of this version of the custom resource. */
@K8sDslMarker
fun CustomResourceDefinitionVersion.schema(init: CustomResourceValidation.() -> Unit) {
  this as CustomResourceDefinitionVersion_apiextensions_k8s_io_v1_k8s1_19Impl
  CustomResourceValidation_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { schema = it }
    .apply(init)
}

/** subresources specify what subresources this version of the defined custom resource have. */
@K8sDslMarker
fun CustomResourceDefinitionVersion.subresources(init: CustomResourceSubresources.() -> Unit) {
  this as CustomResourceDefinitionVersion_apiextensions_k8s_io_v1_k8s1_19Impl
  CustomResourceSubresources_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { subresources = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun CustomResourceDefinition.metadata(init: ObjectMeta.() -> Unit) {
  this as CustomResourceDefinition_apiextensions_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** spec describes how the user wants the resources to appear */
@K8sDslMarker
fun CustomResourceDefinition.spec(init: Customresourcedefinitionspec.() -> Unit) {
  this as CustomResourceDefinition_apiextensions_k8s_io_v1_k8s1_19Impl
  Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** status indicates the actual state of the CustomResourceDefinition */
@K8sDslMarker
fun CustomResourceDefinition.status(init: Customresourcedefinitionstatus.() -> Unit) {
  this as CustomResourceDefinition_apiextensions_k8s_io_v1_k8s1_19Impl
  Customresourcedefinitionstatus_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object. */
@K8sDslMarker
fun CustomResourceSubresources.scale(init: CustomResourceSubresourceScale.() -> Unit) {
  this as CustomResourceSubresources_apiextensions_k8s_io_v1_k8s1_19Impl
  CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { scale = it }
    .apply(init)
}

/** status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom
resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource
`/status` subresource ignore changes to anything other than the `status` stanza of the object. */
@K8sDslMarker
fun CustomResourceSubresources.status(init: CustomResourceSubresourceStatus.() -> Unit) {
  this as CustomResourceSubresources_apiextensions_k8s_io_v1_k8s1_19Impl
  CustomResourceSubresourceStatus_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning. */
@K8sDslMarker
fun CustomResourceValidation.openAPIV3Schema(init: JSONSchemaProps.() -> Unit) {
  this as CustomResourceValidation_apiextensions_k8s_io_v1_k8s1_19Impl
  JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { openAPIV3Schema = it }
    .apply(init)
}

/** Last time the condition transitioned from one status to another. */
@K8sDslMarker
fun DaemonSetCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as DaemonSetCondition_apps_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** Rolling update config params. Present only if type = "RollingUpdate". */
@K8sDslMarker
fun DaemonSetUpdateStrategy.rollingUpdate(init: Rollingupdatedaemonset.() -> Unit) {
  this as DaemonSetUpdateStrategy_apps_v1_k8s1_19Impl
  Rollingupdatedaemonset_apps_v1_k8s1_19Impl(this)
    .also { rollingUpdate = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun DaemonSet.metadata(init: ObjectMeta.() -> Unit) {
  this as DaemonSet_apps_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** The desired behavior of this daemon set. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun DaemonSet.spec(init: Daemonsetspec.() -> Unit) {
  this as DaemonSet_apps_v1_k8s1_19Impl
  Daemonsetspec_apps_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** The current status of this daemon set. This data may be out of date by some window of time. Populated by the system.
Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun DaemonSet.status(init: Daemonsetstatus.() -> Unit) {
  this as DaemonSet_apps_v1_k8s1_19Impl
  Daemonsetstatus_apps_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** Must be fulfilled before a deletion is carried out. If not possible, a 409 Conflict status will be returned. */
@K8sDslMarker
fun DeleteOptions.preconditions(init: Preconditions.() -> Unit) {
  this as DeleteOptions_meta_v1_k8s1_19Impl
  Preconditions_meta_v1_k8s1_19Impl(this)
    .also { preconditions = it }
    .apply(init)
}

/** Last time the condition transitioned from one status to another. */
@K8sDslMarker
fun DeploymentCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as DeploymentCondition_apps_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** The last time this condition was updated. */
@K8sDslMarker
fun DeploymentCondition.lastUpdateTime(init: Time.() -> Unit) {
  this as DeploymentCondition_apps_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastUpdateTime = it }
    .apply(init)
}

/** Standard object metadata. */
@K8sDslMarker
fun Deployment.metadata(init: ObjectMeta.() -> Unit) {
  this as Deployment_apps_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired behavior of the Deployment. */
@K8sDslMarker
fun Deployment.spec(init: Deploymentspec.() -> Unit) {
  this as Deployment_apps_v1_k8s1_19Impl
  Deploymentspec_apps_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Most recently observed status of the Deployment. */
@K8sDslMarker
fun Deployment.status(init: Deploymentstatus.() -> Unit) {
  this as Deployment_apps_v1_k8s1_19Impl
  Deploymentstatus_apps_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** Items is a list of DownwardAPIVolume file */
@K8sDslMarker
fun DownwardAPIProjection.items(init: DownwardAPIVolumeFile.() -> Unit) {
  this as DownwardAPIProjection_core_v1_k8s1_19Impl
  DownwardAPIVolumeFile_core_v1_k8s1_19Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Required: Selects a field of the pod: only annotations, labels, name and namespace are supported. */
@K8sDslMarker
fun DownwardAPIVolumeFile.fieldRef(init: ObjectFieldSelector.() -> Unit) {
  this as DownwardAPIVolumeFile_core_v1_k8s1_19Impl
  ObjectFieldSelector_core_v1_k8s1_19Impl(this)
    .also { fieldRef = it }
    .apply(init)
}

/** Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and
requests.memory) are currently supported. */
@K8sDslMarker
fun DownwardAPIVolumeFile.resourceFieldRef(init: ResourceFieldSelector.() -> Unit) {
  this as DownwardAPIVolumeFile_core_v1_k8s1_19Impl
  ResourceFieldSelector_core_v1_k8s1_19Impl(this)
    .also { resourceFieldRef = it }
    .apply(init)
}

/** Items is a list of downward API volume file */
@K8sDslMarker
fun DownwardAPIVolumeSource.items(init: DownwardAPIVolumeFile.() -> Unit) {
  this as DownwardAPIVolumeSource_core_v1_k8s1_19Impl
  DownwardAPIVolumeFile_core_v1_k8s1_19Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Total amount of local storage required for this EmptyDir volume. The size limit is also applicable for memory medium.
The maximum usage on memory medium EmptyDir would be the minimum value between the SizeLimit specified here and the sum
of memory limits of all containers in a pod. The default is nil which means that the limit is undefined. More info:
http://kubernetes.io/docs/user-guide/volumes#emptydir */
@K8sDslMarker
fun EmptyDirVolumeSource.sizeLimit(init: Quantity.() -> Unit) {
  this as EmptyDirVolumeSource_core_v1_k8s1_19Impl
  Quantity_core_resource_k8s1_19Impl(this)
    .also { sizeLimit = it }
    .apply(init)
}

/** Reference to object providing the endpoint. */
@K8sDslMarker
fun EndpointAddress.targetRef(init: ObjectReference.() -> Unit) {
  this as EndpointAddress_core_v1_k8s1_19Impl
  ObjectReference_core_v1_k8s1_19Impl(this)
    .also { targetRef = it }
    .apply(init)
}

/** endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints. */
@K8sDslMarker
fun EndpointSlice.endpoints(init: Endpoint.() -> Unit) {
  this as EndpointSlice_discovery_k8s_io_v1beta1_k8s1_19Impl
  Endpoint_discovery_k8s_io_v1beta1_k8s1_19Impl(this)
    .also { endpoints = endpoints?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. */
@K8sDslMarker
fun EndpointSlice.metadata(init: ObjectMeta.() -> Unit) {
  this as EndpointSlice_discovery_k8s_io_v1beta1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name.
When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it
indicates "all ports". Each slice may include a maximum of 100 ports. */
@K8sDslMarker
fun EndpointSlice.ports(init: EndpointPort_discovery_k8s_io_v1beta1_k8s1_19.() -> Unit) {
  this as EndpointSlice_discovery_k8s_io_v1beta1_k8s1_19Impl
  EndpointPort_discovery_k8s_io_v1beta1_k8s1_19Impl(this)
    .also { ports = ports?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load
balancers and clients to utilize. */
@K8sDslMarker
fun EndpointSubset.addresses(init: EndpointAddress.() -> Unit) {
  this as EndpointSubset_core_v1_k8s1_19Impl
  EndpointAddress_core_v1_k8s1_19Impl(this)
    .also { addresses = addresses?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished
starting, have recently failed a readiness check, or have recently failed a liveness check. */
@K8sDslMarker
fun EndpointSubset.notReadyAddresses(init: EndpointAddress.() -> Unit) {
  this as EndpointSubset_core_v1_k8s1_19Impl
  EndpointAddress_core_v1_k8s1_19Impl(this)
    .also { notReadyAddresses = notReadyAddresses?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Port numbers available on the related IP addresses. */
@K8sDslMarker
fun EndpointSubset.ports(init: EndpointPort.() -> Unit) {
  this as EndpointSubset_core_v1_k8s1_19Impl
  EndpointPort_core_v1_k8s1_19Impl(this)
    .also { ports = ports?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** conditions contains information about the current status of the endpoint. */
@K8sDslMarker
fun Endpoint.conditions(init: EndpointConditions.() -> Unit) {
  this as Endpoint_discovery_k8s_io_v1beta1_k8s1_19Impl
  EndpointConditions_discovery_k8s_io_v1beta1_k8s1_19Impl(this)
    .also { conditions = it }
    .apply(init)
}

/** targetRef is a reference to a Kubernetes object that represents this endpoint. */
@K8sDslMarker
fun Endpoint.targetRef(init: ObjectReference.() -> Unit) {
  this as Endpoint_discovery_k8s_io_v1beta1_k8s1_19Impl
  ObjectReference_core_v1_k8s1_19Impl(this)
    .also { targetRef = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Endpoints.metadata(init: ObjectMeta.() -> Unit) {
  this as Endpoints_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** The set of all endpoints is the union of all subsets. Addresses are placed into subsets according to the IPs they share.
A single address with multiple ports, some of which are ready and some of which are not (because they come from
different containers) will result in the address being displayed in different subsets for the different ports. No
address will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses and ports that
comprise a service. */
@K8sDslMarker
fun Endpoints.subsets(init: EndpointSubset.() -> Unit) {
  this as Endpoints_core_v1_k8s1_19Impl
  EndpointSubset_core_v1_k8s1_19Impl(this)
    .also { subsets = subsets?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** The ConfigMap to select from */
@K8sDslMarker
fun EnvFromSource.configMapRef(init: ConfigMapEnvSource.() -> Unit) {
  this as EnvFromSource_core_v1_k8s1_19Impl
  ConfigMapEnvSource_core_v1_k8s1_19Impl(this)
    .also { configMapRef = it }
    .apply(init)
}

/** The Secret to select from */
@K8sDslMarker
fun EnvFromSource.secretRef(init: SecretEnvSource.() -> Unit) {
  this as EnvFromSource_core_v1_k8s1_19Impl
  SecretEnvSource_core_v1_k8s1_19Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** Selects a key of a ConfigMap. */
@K8sDslMarker
fun EnvVarSource.configMapKeyRef(init: ConfigMapKeySelector.() -> Unit) {
  this as EnvVarSource_core_v1_k8s1_19Impl
  ConfigMapKeySelector_core_v1_k8s1_19Impl(this)
    .also { configMapKeyRef = it }
    .apply(init)
}

/** Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`,
`metadata.annotations['<KEY>']`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs. */
@K8sDslMarker
fun EnvVarSource.fieldRef(init: ObjectFieldSelector.() -> Unit) {
  this as EnvVarSource_core_v1_k8s1_19Impl
  ObjectFieldSelector_core_v1_k8s1_19Impl(this)
    .also { fieldRef = it }
    .apply(init)
}

/** Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory,
limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported. */
@K8sDslMarker
fun EnvVarSource.resourceFieldRef(init: ResourceFieldSelector.() -> Unit) {
  this as EnvVarSource_core_v1_k8s1_19Impl
  ResourceFieldSelector_core_v1_k8s1_19Impl(this)
    .also { resourceFieldRef = it }
    .apply(init)
}

/** Selects a key of a secret in the pod's namespace */
@K8sDslMarker
fun EnvVarSource.secretKeyRef(init: SecretKeySelector.() -> Unit) {
  this as EnvVarSource_core_v1_k8s1_19Impl
  SecretKeySelector_core_v1_k8s1_19Impl(this)
    .also { secretKeyRef = it }
    .apply(init)
}

/** Source for the environment variable's value. Cannot be used if value is not empty. */
@K8sDslMarker
fun EnvVar.valueFrom(init: EnvVarSource.() -> Unit) {
  this as EnvVar_core_v1_k8s1_19Impl
  EnvVarSource_core_v1_k8s1_19Impl(this)
    .also { valueFrom = it }
    .apply(init)
}

/** List of environment variables to set in the container. Cannot be updated. */
@K8sDslMarker
fun EphemeralContainer.env(init: EnvVar.() -> Unit) {
  this as EphemeralContainer_core_v1_k8s1_19Impl
  EnvVar_core_v1_k8s1_19Impl(this)
    .also { env = env?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of sources to populate environment variables in the container. The keys defined within a source must be a
C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in
multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a
duplicate key will take precedence. Cannot be updated. */
@K8sDslMarker
fun EphemeralContainer.envFrom(init: EnvFromSource.() -> Unit) {
  this as EphemeralContainer_core_v1_k8s1_19Impl
  EnvFromSource_core_v1_k8s1_19Impl(this)
    .also { envFrom = envFrom?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Lifecycle is not allowed for ephemeral containers. */
@K8sDslMarker
fun EphemeralContainer.lifecycle(init: Lifecycle.() -> Unit) {
  this as EphemeralContainer_core_v1_k8s1_19Impl
  Lifecycle_core_v1_k8s1_19Impl(this)
    .also { lifecycle = it }
    .apply(init)
}

/** Probes are not allowed for ephemeral containers. */
@K8sDslMarker
fun EphemeralContainer.livenessProbe(init: Probe.() -> Unit) {
  this as EphemeralContainer_core_v1_k8s1_19Impl
  Probe_core_v1_k8s1_19Impl(this)
    .also { livenessProbe = it }
    .apply(init)
}

/** Ports are not allowed for ephemeral containers. */
@K8sDslMarker
fun EphemeralContainer.ports(init: ContainerPort.() -> Unit) {
  this as EphemeralContainer_core_v1_k8s1_19Impl
  ContainerPort_core_v1_k8s1_19Impl(this)
    .also { ports = ports?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Probes are not allowed for ephemeral containers. */
@K8sDslMarker
fun EphemeralContainer.readinessProbe(init: Probe.() -> Unit) {
  this as EphemeralContainer_core_v1_k8s1_19Impl
  Probe_core_v1_k8s1_19Impl(this)
    .also { readinessProbe = it }
    .apply(init)
}

/** Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the
pod. */
@K8sDslMarker
fun EphemeralContainer.resources(init: ResourceRequirements.() -> Unit) {
  this as EphemeralContainer_core_v1_k8s1_19Impl
  ResourceRequirements_core_v1_k8s1_19Impl(this)
    .also { resources = it }
    .apply(init)
}

/** SecurityContext is not allowed for ephemeral containers. */
@K8sDslMarker
fun EphemeralContainer.securityContext(init: SecurityContext.() -> Unit) {
  this as EphemeralContainer_core_v1_k8s1_19Impl
  SecurityContext_core_v1_k8s1_19Impl(this)
    .also { securityContext = it }
    .apply(init)
}

/** Probes are not allowed for ephemeral containers. */
@K8sDslMarker
fun EphemeralContainer.startupProbe(init: Probe.() -> Unit) {
  this as EphemeralContainer_core_v1_k8s1_19Impl
  Probe_core_v1_k8s1_19Impl(this)
    .also { startupProbe = it }
    .apply(init)
}

/** volumeDevices is the list of block devices to be used by the container. */
@K8sDslMarker
fun EphemeralContainer.volumeDevices(init: VolumeDevice.() -> Unit) {
  this as EphemeralContainer_core_v1_k8s1_19Impl
  VolumeDevice_core_v1_k8s1_19Impl(this)
    .also { volumeDevices = volumeDevices?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Pod volumes to mount into the container's filesystem. Cannot be updated. */
@K8sDslMarker
fun EphemeralContainer.volumeMounts(init: VolumeMount.() -> Unit) {
  this as EphemeralContainer_core_v1_k8s1_19Impl
  VolumeMount_core_v1_k8s1_19Impl(this)
    .also { volumeMounts = volumeMounts?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Will be used to create a stand-alone PVC to provision the volume. The pod in which this EphemeralVolumeSource is
embedded will be the owner of the PVC, i.e. the PVC will be deleted together with the pod. The name of the PVC will be
`<pod name>-<volume name>` where `<volume name>` is the name from the `PodSpec.Volumes` array entry. Pod validation will
reject the pod if the concatenated name is not valid for a PVC (for example, too long). An existing PVC with that name
that is not owned by the pod will `*`not`*` be used for the pod to avoid using an unrelated volume by mistake. Starting
the pod is then blocked until the unrelated PVC is removed. If such a pre-created PVC is meant to be used by the pod,
the PVC has to updated with an owner reference to the pod once the pod exists. Normally this should not be necessary,
but it may be useful when manually reconstructing a broken cluster. This field is read-only and no changes will be made
by Kubernetes to the PVC after it has been created. Required, must not be nil. */
@K8sDslMarker
fun EphemeralVolumeSource.volumeClaimTemplate(init: PersistentVolumeClaimTemplate.() -> Unit) {
  this as EphemeralVolumeSource_core_v1_k8s1_19Impl
  PersistentVolumeClaimTemplate_core_v1_k8s1_19Impl(this)
    .also { volumeClaimTemplate = it }
    .apply(init)
}

/** Time of the last occurrence observed */
@K8sDslMarker
fun EventSeries.lastObservedTime(init: MicroTime.() -> Unit) {
  this as EventSeries_core_v1_k8s1_19Impl
  MicroTime_meta_v1_k8s1_19Impl(this)
    .also { lastObservedTime = it }
    .apply(init)
}

/** Time when this Event was first observed. */
@K8sDslMarker
fun Event.eventTime(init: MicroTime.() -> Unit) {
  this as Event_core_v1_k8s1_19Impl
  MicroTime_meta_v1_k8s1_19Impl(this)
    .also { eventTime = it }
    .apply(init)
}

/** The time at which the event was first recorded. (Time of server receipt is in TypeMeta.) */
@K8sDslMarker
fun Event.firstTimestamp(init: Time.() -> Unit) {
  this as Event_core_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { firstTimestamp = it }
    .apply(init)
}

/** The object that this event is about. */
@K8sDslMarker
fun Event.involvedObject(init: ObjectReference.() -> Unit) {
  this as Event_core_v1_k8s1_19Impl
  ObjectReference_core_v1_k8s1_19Impl(this)
    .also { involvedObject = it }
    .apply(init)
}

/** The time at which the most recent occurrence of this event was recorded. */
@K8sDslMarker
fun Event.lastTimestamp(init: Time.() -> Unit) {
  this as Event_core_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastTimestamp = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Event.metadata(init: ObjectMeta.() -> Unit) {
  this as Event_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Optional secondary object for more complex actions. */
@K8sDslMarker
fun Event.related(init: ObjectReference.() -> Unit) {
  this as Event_core_v1_k8s1_19Impl
  ObjectReference_core_v1_k8s1_19Impl(this)
    .also { related = it }
    .apply(init)
}

/** Data about the Event series this event represents or nil if it's a singleton Event. */
@K8sDslMarker
fun Event.series(init: EventSeries.() -> Unit) {
  this as Event_core_v1_k8s1_19Impl
  EventSeries_core_v1_k8s1_19Impl(this)
    .also { series = it }
    .apply(init)
}

/** The component reporting this event. Should be a short machine understandable string. */
@K8sDslMarker
fun Event.source(init: EventSource.() -> Unit) {
  this as Event_core_v1_k8s1_19Impl
  EventSource_core_v1_k8s1_19Impl(this)
    .also { source = it }
    .apply(init)
}

/** DeleteOptions may be provided */
@K8sDslMarker
fun Eviction.deleteOptions(init: DeleteOptions.() -> Unit) {
  this as Eviction_policy_v1beta1_k8s1_19Impl
  DeleteOptions_meta_v1_k8s1_19Impl(this)
    .also { deleteOptions = it }
    .apply(init)
}

/** ObjectMeta describes the pod that is being evicted. */
@K8sDslMarker
fun Eviction.metadata(init: ObjectMeta.() -> Unit) {
  this as Eviction_policy_v1beta1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** metric identifies the target metric by name and selector */
@K8sDslMarker
fun ExternalMetricSource.metric(init: MetricIdentifier.() -> Unit) {
  this as ExternalMetricSource_autoscaling_v2beta2_k8s1_19Impl
  MetricIdentifier_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { metric = it }
    .apply(init)
}

/** target specifies the target value for the given metric */
@K8sDslMarker
fun ExternalMetricSource.target(init: MetricTarget.() -> Unit) {
  this as ExternalMetricSource_autoscaling_v2beta2_k8s1_19Impl
  MetricTarget_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { target = it }
    .apply(init)
}

/** current contains the current value for the given metric */
@K8sDslMarker
fun ExternalMetricStatus.current(init: MetricValueStatus.() -> Unit) {
  this as ExternalMetricStatus_autoscaling_v2beta2_k8s1_19Impl
  MetricValueStatus_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { current = it }
    .apply(init)
}

/** metric identifies the target metric by name and selector */
@K8sDslMarker
fun ExternalMetricStatus.metric(init: MetricIdentifier.() -> Unit) {
  this as ExternalMetricStatus_autoscaling_v2beta2_k8s1_19Impl
  MetricIdentifier_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { metric = it }
    .apply(init)
}

/** ranges are the allowed ranges of fs groups. If you would like to force a single fs group then supply a single range with
the same start and end. Required for MustRunAs. */
@K8sDslMarker
fun FSGroupStrategyOptions.ranges(init: IDRange.() -> Unit) {
  this as FSGroupStrategyOptions_policy_v1beta1_k8s1_19Impl
  IDRange_policy_v1beta1_k8s1_19Impl(this)
    .also { ranges = ranges?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts.
This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are
passed to the plugin scripts. */
@K8sDslMarker
fun FlexPersistentVolumeSource.secretRef(init: SecretReference.() -> Unit) {
  this as FlexPersistentVolumeSource_core_v1_k8s1_19Impl
  SecretReference_core_v1_k8s1_19Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts.
This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are
passed to the plugin scripts. */
@K8sDslMarker
fun FlexVolumeSource.secretRef(init: LocalObjectReference.() -> Unit) {
  this as FlexVolumeSource_core_v1_k8s1_19Impl
  LocalObjectReference_core_v1_k8s1_19Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** `lastTransitionTime` is the last time the condition transitioned from one status to another. */
@K8sDslMarker
fun FlowSchemaCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** `metadata` is the standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun FlowSchema.metadata(init: ObjectMeta.() -> Unit) {
  this as FlowSchema_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** `spec` is the specification of the desired behavior of a FlowSchema. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun FlowSchema.spec(init: Flowschemaspec.() -> Unit) {
  this as FlowSchema_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  Flowschemaspec_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** `status` is the current status of a FlowSchema. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun FlowSchema.status(init: Flowschemastatus.() -> Unit) {
  this as FlowSchema_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  Flowschemastatus_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** policies is a list of potential scaling polices which can be used during scaling. At least one policy must be specified,
otherwise the HPAScalingRules will be discarded as invalid */
@K8sDslMarker
fun HPAScalingRules.policies(init: HPAScalingPolicy.() -> Unit) {
  this as HPAScalingRules_autoscaling_v2beta2_k8s1_19Impl
  HPAScalingPolicy_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { policies = policies?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Custom headers to set in the request. HTTP allows repeated headers. */
@K8sDslMarker
fun HTTPGetAction.httpHeaders(init: HTTPHeader.() -> Unit) {
  this as HTTPGetAction_core_v1_k8s1_19Impl
  HTTPHeader_core_v1_k8s1_19Impl(this)
    .also { httpHeaders = httpHeaders?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
IANA_SVC_NAME. */
@K8sDslMarker
fun HTTPGetAction.port(string: String) {
  this as HTTPGetAction_core_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrString(string)
    .also { port = it }
}

/** Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
IANA_SVC_NAME. */
@K8sDslMarker
fun HTTPGetAction.port(int: Int) {
  this as HTTPGetAction_core_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrString(int)
    .also { port = it }
}

/** Backend defines the referenced service endpoint to which the traffic will be forwarded to. */
@K8sDslMarker
fun HTTPIngressPath.backend(init: IngressBackend.() -> Unit) {
  this as HTTPIngressPath_networking_k8s_io_v1_k8s1_19Impl
  IngressBackend_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { backend = it }
    .apply(init)
}

/** A collection of paths that map requests to backends. */
@K8sDslMarker
fun HTTPIngressRuleValue.paths(init: HTTPIngressPath.() -> Unit) {
  this as HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_19Impl
  HTTPIngressPath_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { paths = paths?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** One and only one of the following should be specified. Exec specifies the action to take. */
@K8sDslMarker
fun Handler.exec(init: ExecAction.() -> Unit) {
  this as Handler_core_v1_k8s1_19Impl
  ExecAction_core_v1_k8s1_19Impl(this)
    .also { exec = it }
    .apply(init)
}

/** HTTPGet specifies the http request to perform. */
@K8sDslMarker
fun Handler.httpGet(init: HTTPGetAction.() -> Unit) {
  this as Handler_core_v1_k8s1_19Impl
  HTTPGetAction_core_v1_k8s1_19Impl(this)
    .also { httpGet = it }
    .apply(init)
}

/** TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported */
@K8sDslMarker
fun Handler.tcpSocket(init: TCPSocketAction.() -> Unit) {
  this as Handler_core_v1_k8s1_19Impl
  TCPSocketAction_core_v1_k8s1_19Impl(this)
    .also { tcpSocket = it }
    .apply(init)
}

/** scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to scale down to minReplicas
pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used). */
@K8sDslMarker
fun HorizontalPodAutoscalerBehavior.scaleDown(init: HPAScalingRules.() -> Unit) {
  this as HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_19Impl
  HPAScalingRules_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { scaleDown = it }
    .apply(init)
}

/** scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of: `*` increase no more than 4
pods per 60 seconds `*` double the number of pods per 60 seconds No stabilization is used. */
@K8sDslMarker
fun HorizontalPodAutoscalerBehavior.scaleUp(init: HPAScalingRules.() -> Unit) {
  this as HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_19Impl
  HPAScalingRules_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { scaleUp = it }
    .apply(init)
}

/** lastTransitionTime is the last time the condition transitioned from one status to another */
@K8sDslMarker
fun HorizontalPodAutoscalerCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as HorizontalPodAutoscalerCondition_autoscaling_v2beta2_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** Standard object metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun HorizontalPodAutoscaler.metadata(init: ObjectMeta.() -> Unit) {
  this as HorizontalPodAutoscaler_autoscaling_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** behaviour of autoscaler. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status. */
@K8sDslMarker
fun HorizontalPodAutoscaler.spec(init: Horizontalpodautoscalerspec.() -> Unit) {
  this as HorizontalPodAutoscaler_autoscaling_v1_k8s1_19Impl
  Horizontalpodautoscalerspec_autoscaling_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** current information about the autoscaler. */
@K8sDslMarker
fun HorizontalPodAutoscaler.status(init: Horizontalpodautoscalerstatus.() -> Unit) {
  this as HorizontalPodAutoscaler_autoscaling_v1_k8s1_19Impl
  Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** CHAP Secret for iSCSI target and initiator authentication */
@K8sDslMarker
fun ISCSIPersistentVolumeSource.secretRef(init: SecretReference.() -> Unit) {
  this as ISCSIPersistentVolumeSource_core_v1_k8s1_19Impl
  SecretReference_core_v1_k8s1_19Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** CHAP Secret for iSCSI target and initiator authentication */
@K8sDslMarker
fun ISCSIVolumeSource.secretRef(init: LocalObjectReference.() -> Unit) {
  this as ISCSIVolumeSource_core_v1_k8s1_19Impl
  LocalObjectReference_core_v1_k8s1_19Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is
specified, a service.Name and service.Port must not be specified. This is a mutually exclusive setting with "Service". */
@K8sDslMarker
fun IngressBackend.resource(init: TypedLocalObjectReference.() -> Unit) {
  this as IngressBackend_networking_k8s_io_v1_k8s1_19Impl
  TypedLocalObjectReference_core_v1_k8s1_19Impl(this)
    .also { resource = it }
    .apply(init)
}

/** Service references a Service as a Backend. This is a mutually exclusive setting with "Resource". */
@K8sDslMarker
fun IngressBackend.service(init: IngressServiceBackend.() -> Unit) {
  this as IngressBackend_networking_k8s_io_v1_k8s1_19Impl
  IngressServiceBackend_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { service = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun IngressClass.metadata(init: ObjectMeta.() -> Unit) {
  this as IngressClass_networking_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec is the desired state of the IngressClass. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun IngressClass.spec(init: Ingressclassspec.() -> Unit) {
  this as IngressClass_networking_k8s_io_v1_k8s1_19Impl
  Ingressclassspec_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun IngressRule.http(init: HTTPIngressRuleValue.() -> Unit) {
  this as IngressRule_networking_k8s_io_v1_k8s1_19Impl
  HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { http = it }
    .apply(init)
}

/** Port of the referenced service. A port name or port number is required for a IngressServiceBackend. */
@K8sDslMarker
fun IngressServiceBackend.port(init: ServiceBackendPort.() -> Unit) {
  this as IngressServiceBackend_networking_k8s_io_v1_k8s1_19Impl
  ServiceBackendPort_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { port = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Ingress.metadata(init: ObjectMeta.() -> Unit) {
  this as Ingress_networking_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec is the desired state of the Ingress. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Ingress.spec(init: Ingressspec.() -> Unit) {
  this as Ingress_networking_k8s_io_v1_k8s1_19Impl
  Ingressspec_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is the current state of the Ingress. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Ingress.status(init: Ingressstatus.() -> Unit) {
  this as Ingress_networking_k8s_io_v1_k8s1_19Impl
  Ingressstatus_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.additionalItems(init: JSONSchemaPropsOrBool.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_19Impl
  JSONSchemaPropsOrBool_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { additionalItems = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.additionalProperties(init: JSONSchemaPropsOrBool.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_19Impl
  JSONSchemaPropsOrBool_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { additionalProperties = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.allOf(init: JSONSchemaProps.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_19Impl
  JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { allOf = allOf?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.anyOf(init: JSONSchemaProps.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_19Impl
  JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { anyOf = anyOf?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting
feature gate. Defaulting requires spec.preserveUnknownFields to be false. */
@K8sDslMarker
fun JSONSchemaProps.default(init: JSON.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_19Impl
  JSON_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { default = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.enum(init: JSON.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_19Impl
  JSON_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { enum = enum?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.example(init: JSON.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_19Impl
  JSON_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { example = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.externalDocs(init: ExternalDocumentation.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_19Impl
  ExternalDocumentation_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { externalDocs = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.items(init: JSONSchemaPropsOrArray.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_19Impl
  JSONSchemaPropsOrArray_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { items = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.not(init: JSONSchemaProps.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_19Impl
  JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { not = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.oneOf(init: JSONSchemaProps.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_19Impl
  JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { oneOf = oneOf?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Last time the condition was checked. */
@K8sDslMarker
fun JobCondition.lastProbeTime(init: Time.() -> Unit) {
  this as JobCondition_batch_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastProbeTime = it }
    .apply(init)
}

/** Last time the condition transit from one status to another. */
@K8sDslMarker
fun JobCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as JobCondition_batch_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** Standard object's metadata of the jobs created from this template. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun JobTemplateSpec.metadata(init: ObjectMeta.() -> Unit) {
  this as JobTemplateSpec_batch_v1beta1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired behavior of the job. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun JobTemplateSpec.spec(init: Jobspec.() -> Unit) {
  this as JobTemplateSpec_batch_v1beta1_k8s1_19Impl
  Jobspec_batch_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Job.metadata(init: ObjectMeta.() -> Unit) {
  this as Job_batch_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired behavior of a job. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Job.spec(init: Jobspec.() -> Unit) {
  this as Job_batch_v1_k8s1_19Impl
  Jobspec_batch_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Current status of a job. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Job.status(init: Jobstatus.() -> Unit) {
  this as Job_batch_v1_k8s1_19Impl
  Jobstatus_batch_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** matchExpressions is a list of label selector requirements. The requirements are ANDed. */
@K8sDslMarker
fun LabelSelector.matchExpressions(init: LabelSelectorRequirement.() -> Unit) {
  this as LabelSelector_meta_v1_k8s1_19Impl
  LabelSelectorRequirement_meta_v1_k8s1_19Impl(this)
    .also { matchExpressions = matchExpressions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Lease.metadata(init: ObjectMeta.() -> Unit) {
  this as Lease_coordination_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the Lease. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Lease.spec(init: Leasespec.() -> Unit) {
  this as Lease_coordination_k8s_io_v1_k8s1_19Impl
  Leasespec_coordination_k8s_io_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** PostStart is called immediately after a container is created. If the handler fails, the container is terminated and
restarted according to its restart policy. Other management of the container blocks until the hook completes. More info:
https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks */
@K8sDslMarker
fun Lifecycle.postStart(init: Handler.() -> Unit) {
  this as Lifecycle_core_v1_k8s1_19Impl
  Handler_core_v1_k8s1_19Impl(this)
    .also { postStart = it }
    .apply(init)
}

/** PreStop is called immediately before a container is terminated due to an API request or management event such as
liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes
or exits. The reason for termination is passed to the handler. The Pod's termination grace period countdown begins
before the PreStop hooked is executed. Regardless of the outcome of the handler, the container will eventually terminate
within the Pod's termination grace period. Other management of the container blocks until the hook completes or until
the termination grace period is reached. More info:
https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks */
@K8sDslMarker
fun Lifecycle.preStop(init: Handler.() -> Unit) {
  this as Lifecycle_core_v1_k8s1_19Impl
  Handler_core_v1_k8s1_19Impl(this)
    .also { preStop = it }
    .apply(init)
}

/** Default resource requirement limit value by resource name if resource limit is omitted. */
@K8sDslMarker
fun LimitRangeItem.default(init: de.loosetie.k8s.dsl.types.CpuMem.() -> Unit) {
  this as LimitRangeItem_core_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.CpuMem(this)
    .also { default = it }
    .apply(init)
}

/** DefaultRequest is the default resource requirement request value by resource name if resource request is omitted. */
@K8sDslMarker
fun LimitRangeItem.defaultRequest(init: de.loosetie.k8s.dsl.types.CpuMem.() -> Unit) {
  this as LimitRangeItem_core_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.CpuMem(this)
    .also { defaultRequest = it }
    .apply(init)
}

/** Max usage constraints on this kind by resource name. */
@K8sDslMarker
fun LimitRangeItem.max(init: de.loosetie.k8s.dsl.types.CpuMem.() -> Unit) {
  this as LimitRangeItem_core_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.CpuMem(this)
    .also { max = it }
    .apply(init)
}

/** MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit
divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource. */
@K8sDslMarker
fun LimitRangeItem.maxLimitRequestRatio(init: de.loosetie.k8s.dsl.types.CpuMem.() -> Unit) {
  this as LimitRangeItem_core_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.CpuMem(this)
    .also { maxLimitRequestRatio = it }
    .apply(init)
}

/** Min usage constraints on this kind by resource name. */
@K8sDslMarker
fun LimitRangeItem.min(init: de.loosetie.k8s.dsl.types.CpuMem.() -> Unit) {
  this as LimitRangeItem_core_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.CpuMem(this)
    .also { min = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun LimitRange.metadata(init: ObjectMeta.() -> Unit) {
  this as LimitRange_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the limits enforced. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun LimitRange.spec(init: Limitrangespec.() -> Unit) {
  this as LimitRange_core_v1_k8s1_19Impl
  Limitrangespec_core_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** `queuing` holds the configuration parameters for queuing. This field may be non-empty only if `type` is `"Queue"`. */
@K8sDslMarker
fun LimitResponse.queuing(init: QueuingConfiguration.() -> Unit) {
  this as LimitResponse_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { queuing = it }
    .apply(init)
}

/** `limitResponse` indicates what to do with requests that can not be executed right now */
@K8sDslMarker
fun LimitedPriorityLevelConfiguration.limitResponse(init: LimitResponse.() -> Unit) {
  this as LimitedPriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  LimitResponse_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { limitResponse = it }
    .apply(init)
}

/** Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to
these ingress points. */
@K8sDslMarker
fun LoadBalancerStatus.ingress(init: LoadBalancerIngress.() -> Unit) {
  this as LoadBalancerStatus_core_v1_k8s1_19Impl
  LoadBalancerIngress_core_v1_k8s1_19Impl(this)
    .also { ingress = ingress?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun LocalSubjectAccessReview.metadata(init: ObjectMeta.() -> Unit) {
  this as LocalSubjectAccessReview_authorization_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec holds information about the request being evaluated. spec.namespace must be equal to the namespace you made the
request against. If empty, it is defaulted. */
@K8sDslMarker
fun LocalSubjectAccessReview.spec(init: Subjectaccessreviewspec.() -> Unit) {
  this as LocalSubjectAccessReview_authorization_k8s_io_v1_k8s1_19Impl
  Subjectaccessreviewspec_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is filled in by the server and indicates whether the request is allowed or not */
@K8sDslMarker
fun LocalSubjectAccessReview.status(init: Subjectaccessreviewstatus.() -> Unit) {
  this as LocalSubjectAccessReview_authorization_k8s_io_v1_k8s1_19Impl
  Subjectaccessreviewstatus_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** FieldsV1 holds the first JSON version format as described in the "FieldsV1" type. */
@K8sDslMarker
fun ManagedFieldsEntry.fieldsV1(init: FieldsV1.() -> Unit) {
  this as ManagedFieldsEntry_meta_v1_k8s1_19Impl
  FieldsV1_meta_v1_k8s1_19Impl(this)
    .also { fieldsV1 = it }
    .apply(init)
}

/** Time is timestamp of when these fields were set. It should always be empty if Operation is 'Apply' */
@K8sDslMarker
fun ManagedFieldsEntry.time(init: Time.() -> Unit) {
  this as ManagedFieldsEntry_meta_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { time = it }
    .apply(init)
}

/** selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed
as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will
be used to gather metrics. */
@K8sDslMarker
fun MetricIdentifier.selector(init: LabelSelector.() -> Unit) {
  this as MetricIdentifier_autoscaling_v2beta2_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { selector = it }
    .apply(init)
}

/** external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on
information coming from components running outside of cluster (for example length of queue in cloud messaging service,
or QPS from loadbalancer running outside of cluster). */
@K8sDslMarker
fun MetricSpec.external(init: ExternalMetricSource.() -> Unit) {
  this as MetricSpec_autoscaling_v2beta2_k8s1_19Impl
  ExternalMetricSource_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { external = it }
    .apply(init)
}

/** object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object). */
@K8sDslMarker
fun MetricSpec.`object`(init: ObjectMetricSource.() -> Unit) {
  this as MetricSpec_autoscaling_v2beta2_k8s1_19Impl
  ObjectMetricSource_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { `object` = it }
    .apply(init)
}

/** pods refers to a metric describing each pod in the current scale target (for example,
transactions-processed-per-second). The values will be averaged together before being compared to the target value. */
@K8sDslMarker
fun MetricSpec.pods(init: PodsMetricSource.() -> Unit) {
  this as MetricSpec_autoscaling_v2beta2_k8s1_19Impl
  PodsMetricSource_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { pods = it }
    .apply(init)
}

/** resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing
each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special
scaling options on top of those available to normal per-pod metrics using the "pods" source. */
@K8sDslMarker
fun MetricSpec.resource(init: ResourceMetricSource.() -> Unit) {
  this as MetricSpec_autoscaling_v2beta2_k8s1_19Impl
  ResourceMetricSource_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { resource = it }
    .apply(init)
}

/** external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on
information coming from components running outside of cluster (for example length of queue in cloud messaging service,
or QPS from loadbalancer running outside of cluster). */
@K8sDslMarker
fun MetricStatus.external(init: ExternalMetricStatus.() -> Unit) {
  this as MetricStatus_autoscaling_v2beta2_k8s1_19Impl
  ExternalMetricStatus_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { external = it }
    .apply(init)
}

/** object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object). */
@K8sDslMarker
fun MetricStatus.`object`(init: ObjectMetricStatus.() -> Unit) {
  this as MetricStatus_autoscaling_v2beta2_k8s1_19Impl
  ObjectMetricStatus_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { `object` = it }
    .apply(init)
}

/** pods refers to a metric describing each pod in the current scale target (for example,
transactions-processed-per-second). The values will be averaged together before being compared to the target value. */
@K8sDslMarker
fun MetricStatus.pods(init: PodsMetricStatus.() -> Unit) {
  this as MetricStatus_autoscaling_v2beta2_k8s1_19Impl
  PodsMetricStatus_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { pods = it }
    .apply(init)
}

/** resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing
each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special
scaling options on top of those available to normal per-pod metrics using the "pods" source. */
@K8sDslMarker
fun MetricStatus.resource(init: ResourceMetricStatus.() -> Unit) {
  this as MetricStatus_autoscaling_v2beta2_k8s1_19Impl
  ResourceMetricStatus_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { resource = it }
    .apply(init)
}

/** averageValue is the target value of the average of the metric across all relevant pods (as a quantity) */
@K8sDslMarker
fun MetricTarget.averageValue(init: Quantity.() -> Unit) {
  this as MetricTarget_autoscaling_v2beta2_k8s1_19Impl
  Quantity_core_resource_k8s1_19Impl(this)
    .also { averageValue = it }
    .apply(init)
}

/** value is the target value of the metric (as a quantity). */
@K8sDslMarker
fun MetricTarget.value(init: Quantity.() -> Unit) {
  this as MetricTarget_autoscaling_v2beta2_k8s1_19Impl
  Quantity_core_resource_k8s1_19Impl(this)
    .also { value = it }
    .apply(init)
}

/** averageValue is the current value of the average of the metric across all relevant pods (as a quantity) */
@K8sDslMarker
fun MetricValueStatus.averageValue(init: Quantity.() -> Unit) {
  this as MetricValueStatus_autoscaling_v2beta2_k8s1_19Impl
  Quantity_core_resource_k8s1_19Impl(this)
    .also { averageValue = it }
    .apply(init)
}

/** value is the current value of the metric (as a quantity). */
@K8sDslMarker
fun MetricValueStatus.value(init: Quantity.() -> Unit) {
  this as MetricValueStatus_autoscaling_v2beta2_k8s1_19Impl
  Quantity_core_resource_k8s1_19Impl(this)
    .also { value = it }
    .apply(init)
}

/** Standard object metadata; More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata. */
@K8sDslMarker
fun MutatingWebhookConfiguration.metadata(init: ObjectMeta.() -> Unit) {
  this as MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Webhooks is a list of webhooks and the affected resources and operations. */
@K8sDslMarker
fun MutatingWebhookConfiguration.webhooks(init: MutatingWebhook.() -> Unit) {
  this as MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_19Impl
  MutatingWebhook_admissionregistration_k8s_io_v1_k8s1_19Impl(this)
    .also { webhooks = webhooks?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** ClientConfig defines how to communicate with the hook. Required */
@K8sDslMarker
fun MutatingWebhook.clientConfig(init: WebhookClientConfig.() -> Unit) {
  this as MutatingWebhook_admissionregistration_k8s_io_v1_k8s1_19Impl
  WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_19Impl(this)
    .also { clientConfig = it }
    .apply(init)
}

/** NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches
the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is
another cluster scoped resource, it never skips the webhook. For example, to run the webhook on any objects whose
namespace is not associated with "runlevel" of "0" or "1"; you will set the selector as follows: "namespaceSelector": {
"matchExpressions": [ { "key": "runlevel", "operator": "NotIn", "values": [ "0", "1" ] } ] } If instead you want to only
run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set
the selector as follows: "namespaceSelector": { "matchExpressions": [ { "key": "environment", "operator": "In",
"values": [ "prod", "staging" ] } ] } See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for
more examples of label selectors. Default to the empty LabelSelector, which matches everything. */
@K8sDslMarker
fun MutatingWebhook.namespaceSelector(init: LabelSelector.() -> Unit) {
  this as MutatingWebhook_admissionregistration_k8s_io_v1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { namespaceSelector = it }
    .apply(init)
}

/** ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is
evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if
either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete)
or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match.
Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the
labels. Default to the empty LabelSelector, which matches everything. */
@K8sDslMarker
fun MutatingWebhook.objectSelector(init: LabelSelector.() -> Unit) {
  this as MutatingWebhook_admissionregistration_k8s_io_v1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { objectSelector = it }
    .apply(init)
}

/** Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an
operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and
MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely
disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests
for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects. */
@K8sDslMarker
fun MutatingWebhook.rules(init: RuleWithOperations.() -> Unit) {
  this as MutatingWebhook_admissionregistration_k8s_io_v1_k8s1_19Impl
  RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_19Impl(this)
    .also { rules = rules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun NamespaceCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as NamespaceCondition_core_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Namespace.metadata(init: ObjectMeta.() -> Unit) {
  this as Namespace_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the behavior of the Namespace. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Namespace.spec(init: Namespacespec.() -> Unit) {
  this as Namespace_core_v1_k8s1_19Impl
  Namespacespec_core_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status describes the current status of a Namespace. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Namespace.status(init: Namespacestatus.() -> Unit) {
  this as Namespace_core_v1_k8s1_19Impl
  Namespacestatus_core_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is
empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at
least one item, then this rule allows traffic only if the traffic matches at least one port in the list. */
@K8sDslMarker
fun NetworkPolicyEgressRule.ports(init: NetworkPolicyPort.() -> Unit) {
  this as NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_19Impl
  NetworkPolicyPort_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { ports = ports?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a
logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by
destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic
matches at least one item in the to list. */
@K8sDslMarker
fun NetworkPolicyEgressRule.to(init: NetworkPolicyPeer.() -> Unit) {
  this as NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_19Impl
  NetworkPolicyPeer_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { to = to?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a
logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by
source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches
at least one item in the from list. */
@K8sDslMarker
fun NetworkPolicyIngressRule.from(init: NetworkPolicyPeer.() -> Unit) {
  this as NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_19Impl
  NetworkPolicyPeer_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { from = from?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined
using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If
this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least
one port in the list. */
@K8sDslMarker
fun NetworkPolicyIngressRule.ports(init: NetworkPolicyPort.() -> Unit) {
  this as NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_19Impl
  NetworkPolicyPort_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { ports = ports?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be. */
@K8sDslMarker
fun NetworkPolicyPeer.ipBlock(init: IPBlock.() -> Unit) {
  this as NetworkPolicyPeer_networking_k8s_io_v1_k8s1_19Impl
  IPBlock_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { ipBlock = it }
    .apply(init)
}

/** Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but
empty, it selects all namespaces. If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods
matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces
selected by NamespaceSelector. */
@K8sDslMarker
fun NetworkPolicyPeer.namespaceSelector(init: LabelSelector.() -> Unit) {
  this as NetworkPolicyPeer_networking_k8s_io_v1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { namespaceSelector = it }
    .apply(init)
}

/** This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty,
it selects all pods. If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching
PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the
policy's own Namespace. */
@K8sDslMarker
fun NetworkPolicyPeer.podSelector(init: LabelSelector.() -> Unit) {
  this as NetworkPolicyPeer_networking_k8s_io_v1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { podSelector = it }
    .apply(init)
}

/** The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided,
this matches all port names and numbers. */
@K8sDslMarker
fun NetworkPolicyPort.port(string: String) {
  this as NetworkPolicyPort_networking_k8s_io_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrString(string)
    .also { port = it }
}

/** The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided,
this matches all port names and numbers. */
@K8sDslMarker
fun NetworkPolicyPort.port(int: Int) {
  this as NetworkPolicyPort_networking_k8s_io_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrString(int)
    .also { port = it }
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun NetworkPolicy.metadata(init: ObjectMeta.() -> Unit) {
  this as NetworkPolicy_networking_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired behavior for this NetworkPolicy. */
@K8sDslMarker
fun NetworkPolicy.spec(init: Networkpolicyspec.() -> Unit) {
  this as NetworkPolicy_networking_k8s_io_v1_k8s1_19Impl
  Networkpolicyspec_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but
it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the
greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request,
requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and
adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are
the most preferred. */
@K8sDslMarker
fun NodeAffinity.preferredDuringSchedulingIgnoredDuringExecution(init: PreferredSchedulingTerm.() -> Unit) {
  this as NodeAffinity_core_v1_k8s1_19Impl
  PreferredSchedulingTerm_core_v1_k8s1_19Impl(this)
    .also { preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto
the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g.
due to an update), the system may or may not try to eventually evict the pod from its node. */
@K8sDslMarker
fun NodeAffinity.requiredDuringSchedulingIgnoredDuringExecution(init: NodeSelector.() -> Unit) {
  this as NodeAffinity_core_v1_k8s1_19Impl
  NodeSelector_core_v1_k8s1_19Impl(this)
    .also { requiredDuringSchedulingIgnoredDuringExecution = it }
    .apply(init)
}

/** Last time we got an update on a given condition. */
@K8sDslMarker
fun NodeCondition.lastHeartbeatTime(init: Time.() -> Unit) {
  this as NodeCondition_core_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastHeartbeatTime = it }
    .apply(init)
}

/** Last time the condition transit from one status to another. */
@K8sDslMarker
fun NodeCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as NodeCondition_core_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** ConfigMap is a reference to a Node's ConfigMap */
@K8sDslMarker
fun NodeConfigSource.configMap(init: ConfigMapNodeConfigSource.() -> Unit) {
  this as NodeConfigSource_core_v1_k8s1_19Impl
  ConfigMapNodeConfigSource_core_v1_k8s1_19Impl(this)
    .also { configMap = it }
    .apply(init)
}

/** Active reports the checkpointed config the node is actively using. Active will represent either the current version of
the Assigned config, or the current LastKnownGood config, depending on whether attempting to use the Assigned config
results in an error. */
@K8sDslMarker
fun NodeConfigStatus.active(init: NodeConfigSource.() -> Unit) {
  this as NodeConfigStatus_core_v1_k8s1_19Impl
  NodeConfigSource_core_v1_k8s1_19Impl(this)
    .also { active = it }
    .apply(init)
}

/** Assigned reports the checkpointed config the node will try to use. When Node.Spec.ConfigSource is updated, the node
checkpoints the associated config payload to local disk, along with a record indicating intended config. The node refers
to this record to choose its config checkpoint, and reports this record in Assigned. Assigned only updates in the status
after the record has been checkpointed to disk. When the Kubelet is restarted, it tries to make the Assigned config the
Active config by loading and validating the checkpointed payload identified by Assigned. */
@K8sDslMarker
fun NodeConfigStatus.assigned(init: NodeConfigSource.() -> Unit) {
  this as NodeConfigStatus_core_v1_k8s1_19Impl
  NodeConfigSource_core_v1_k8s1_19Impl(this)
    .also { assigned = it }
    .apply(init)
}

/** LastKnownGood reports the checkpointed config the node will fall back to when it encounters an error attempting to use
the Assigned config. The Assigned config becomes the LastKnownGood config when the node determines that the Assigned
config is stable and correct. This is currently implemented as a 10-minute soak period starting when the local record of
Assigned config is updated. If the Assigned config is Active at the end of this period, it becomes the LastKnownGood.
Note that if Spec.ConfigSource is reset to nil (use local defaults), the LastKnownGood is also immediately reset to nil,
because the local default config is always assumed good. You should not make assumptions about the node's method of
determining config stability and correctness, as this may change or become configurable in the future. */
@K8sDslMarker
fun NodeConfigStatus.lastKnownGood(init: NodeConfigSource.() -> Unit) {
  this as NodeConfigStatus_core_v1_k8s1_19Impl
  NodeConfigSource_core_v1_k8s1_19Impl(this)
    .also { lastKnownGood = it }
    .apply(init)
}

/** Endpoint on which Kubelet is listening. */
@K8sDslMarker
fun NodeDaemonEndpoints.kubeletEndpoint(init: DaemonEndpoint.() -> Unit) {
  this as NodeDaemonEndpoints_core_v1_k8s1_19Impl
  DaemonEndpoint_core_v1_k8s1_19Impl(this)
    .also { kubeletEndpoint = it }
    .apply(init)
}

/** A list of node selector requirements by node's labels. */
@K8sDslMarker
fun NodeSelectorTerm.matchExpressions(init: NodeSelectorRequirement.() -> Unit) {
  this as NodeSelectorTerm_core_v1_k8s1_19Impl
  NodeSelectorRequirement_core_v1_k8s1_19Impl(this)
    .also { matchExpressions = matchExpressions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** A list of node selector requirements by node's fields. */
@K8sDslMarker
fun NodeSelectorTerm.matchFields(init: NodeSelectorRequirement.() -> Unit) {
  this as NodeSelectorTerm_core_v1_k8s1_19Impl
  NodeSelectorRequirement_core_v1_k8s1_19Impl(this)
    .also { matchFields = matchFields?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Required. A list of node selector terms. The terms are ORed. */
@K8sDslMarker
fun NodeSelector.nodeSelectorTerms(init: NodeSelectorTerm.() -> Unit) {
  this as NodeSelector_core_v1_k8s1_19Impl
  NodeSelectorTerm_core_v1_k8s1_19Impl(this)
    .also { nodeSelectorTerms = nodeSelectorTerms?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Node.metadata(init: ObjectMeta.() -> Unit) {
  this as Node_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the behavior of a node.
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Node.spec(init: Nodespec.() -> Unit) {
  this as Node_core_v1_k8s1_19Impl
  Nodespec_core_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Most recently observed status of the node. Populated by the system. Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Node.status(init: Nodestatus.() -> Unit) {
  this as Node_core_v1_k8s1_19Impl
  Nodestatus_core_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be
set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339
form and is in UTC. Populated by the system. Read-only. Null for lists. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun ObjectMeta.creationTimestamp(init: Time.() -> Unit) {
  this as ObjectMeta_meta_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { creationTimestamp = it }
    .apply(init)
}

/** DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is set by the server when
a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be
deleted (no longer visible from resource lists, and not reachable by name) after the time in this field, once the
finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once the deletionTimestamp
is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may
be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will
react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will
send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the
presence of network partitions, this object may still exist after this timestamp, until an administrator or automated
process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been
requested. Populated by the system when a graceful deletion is requested. Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun ObjectMeta.deletionTimestamp(init: Time.() -> Unit) {
  this as ObjectMeta_meta_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { deletionTimestamp = it }
    .apply(init)
}

/** ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow. This is mostly for
internal housekeeping, and users typically shouldn't need to set or understand this field. A workflow can be the user's
name, a controller's name, or the name of a specific apply path like "ci-cd". The set of fields is always in the version
that the workflow used when modifying the object. */
@K8sDslMarker
fun ObjectMeta.managedFields(init: ManagedFieldsEntry.() -> Unit) {
  this as ObjectMeta_meta_v1_k8s1_19Impl
  ManagedFieldsEntry_meta_v1_k8s1_19Impl(this)
    .also { managedFields = managedFields?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage
collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the
controller field set to true. There cannot be more than one managing controller. */
@K8sDslMarker
fun ObjectMeta.ownerReferences(init: OwnerReference.() -> Unit) {
  this as ObjectMeta_meta_v1_k8s1_19Impl
  OwnerReference_meta_v1_k8s1_19Impl(this)
    .also { ownerReferences = ownerReferences?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun ObjectMetricSource.describedObject(init: CrossVersionObjectReference_autoscaling_v2beta2_k8s1_19.() -> Unit) {
  this as ObjectMetricSource_autoscaling_v2beta2_k8s1_19Impl
  CrossVersionObjectReference_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { describedObject = it }
    .apply(init)
}

/** metric identifies the target metric by name and selector */
@K8sDslMarker
fun ObjectMetricSource.metric(init: MetricIdentifier.() -> Unit) {
  this as ObjectMetricSource_autoscaling_v2beta2_k8s1_19Impl
  MetricIdentifier_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { metric = it }
    .apply(init)
}

/** target specifies the target value for the given metric */
@K8sDslMarker
fun ObjectMetricSource.target(init: MetricTarget.() -> Unit) {
  this as ObjectMetricSource_autoscaling_v2beta2_k8s1_19Impl
  MetricTarget_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { target = it }
    .apply(init)
}

/** current contains the current value for the given metric */
@K8sDslMarker
fun ObjectMetricStatus.current(init: MetricValueStatus.() -> Unit) {
  this as ObjectMetricStatus_autoscaling_v2beta2_k8s1_19Impl
  MetricValueStatus_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { current = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun ObjectMetricStatus.describedObject(init: CrossVersionObjectReference_autoscaling_v2beta2_k8s1_19.() -> Unit) {
  this as ObjectMetricStatus_autoscaling_v2beta2_k8s1_19Impl
  CrossVersionObjectReference_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { describedObject = it }
    .apply(init)
}

/** metric identifies the target metric by name and selector */
@K8sDslMarker
fun ObjectMetricStatus.metric(init: MetricIdentifier.() -> Unit) {
  this as ObjectMetricStatus_autoscaling_v2beta2_k8s1_19Impl
  MetricIdentifier_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { metric = it }
    .apply(init)
}

/** PodFixed represents the fixed resource overhead associated with running a pod. */
@K8sDslMarker
fun Overhead.podFixed(init: de.loosetie.k8s.dsl.types.LimitsAndRequests.() -> Unit) {
  this as Overhead_node_k8s_io_v1beta1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.LimitsAndRequests(this)
    .also { podFixed = it }
    .apply(init)
}

/** Last time we probed the condition. */
@K8sDslMarker
fun PersistentVolumeClaimCondition.lastProbeTime(init: Time.() -> Unit) {
  this as PersistentVolumeClaimCondition_core_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastProbeTime = it }
    .apply(init)
}

/** Last time the condition transitioned from one status to another. */
@K8sDslMarker
fun PersistentVolumeClaimCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as PersistentVolumeClaimCondition_core_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and
will be rejected during validation. */
@K8sDslMarker
fun PersistentVolumeClaimTemplate.metadata(init: ObjectMeta.() -> Unit) {
  this as PersistentVolumeClaimTemplate_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created
from this template. The same fields as in a PersistentVolumeClaim are also valid here. */
@K8sDslMarker
fun PersistentVolumeClaimTemplate.spec(init: Persistentvolumeclaimspec.() -> Unit) {
  this as PersistentVolumeClaimTemplate_core_v1_k8s1_19Impl
  Persistentvolumeclaimspec_core_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun PersistentVolumeClaim.metadata(init: ObjectMeta.() -> Unit) {
  this as PersistentVolumeClaim_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the desired characteristics of a volume requested by a pod author. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
@K8sDslMarker
fun PersistentVolumeClaim.spec(init: Persistentvolumeclaimspec.() -> Unit) {
  this as PersistentVolumeClaim_core_v1_k8s1_19Impl
  Persistentvolumeclaimspec_core_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status represents the current information/status of a persistent volume claim. Read-only. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
@K8sDslMarker
fun PersistentVolumeClaim.status(init: Persistentvolumeclaimstatus.() -> Unit) {
  this as PersistentVolumeClaim_core_v1_k8s1_19Impl
  Persistentvolumeclaimstatus_core_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun PersistentVolume.metadata(init: ObjectMeta.() -> Unit) {
  this as PersistentVolume_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines a specification of a persistent volume owned by the cluster. Provisioned by an administrator. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes */
@K8sDslMarker
fun PersistentVolume.spec(init: Persistentvolumespec.() -> Unit) {
  this as PersistentVolume_core_v1_k8s1_19Impl
  Persistentvolumespec_core_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status represents the current information/status for the persistent volume. Populated by the system. Read-only. More
info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes */
@K8sDslMarker
fun PersistentVolume.status(init: Persistentvolumestatus.() -> Unit) {
  this as PersistentVolume_core_v1_k8s1_19Impl
  Persistentvolumestatus_core_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** A label query over a set of resources, in this case pods. */
@K8sDslMarker
fun PodAffinityTerm.labelSelector(init: LabelSelector.() -> Unit) {
  this as PodAffinityTerm_core_v1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { labelSelector = it }
    .apply(init)
}

/** The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but
it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the
greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request,
requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and
adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the
highest sum are the most preferred. */
@K8sDslMarker
fun PodAffinity.preferredDuringSchedulingIgnoredDuringExecution(init: WeightedPodAffinityTerm.() -> Unit) {
  this as PodAffinity_core_v1_k8s1_19Impl
  WeightedPodAffinityTerm_core_v1_k8s1_19Impl(this)
    .also { preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto
the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g.
due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are
multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be
satisfied. */
@K8sDslMarker
fun PodAffinity.requiredDuringSchedulingIgnoredDuringExecution(init: PodAffinityTerm.() -> Unit) {
  this as PodAffinity_core_v1_k8s1_19Impl
  PodAffinityTerm_core_v1_k8s1_19Impl(this)
    .also { requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field,
but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with
the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request,
requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field
and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with
the highest sum are the most preferred. */
@K8sDslMarker
fun PodAntiAffinity.preferredDuringSchedulingIgnoredDuringExecution(init: WeightedPodAffinityTerm.() -> Unit) {
  this as PodAntiAffinity_core_v1_k8s1_19Impl
  WeightedPodAffinityTerm_core_v1_k8s1_19Impl(this)
    .also { preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled
onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod
execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node.
When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all
terms must be satisfied. */
@K8sDslMarker
fun PodAntiAffinity.requiredDuringSchedulingIgnoredDuringExecution(init: PodAffinityTerm.() -> Unit) {
  this as PodAntiAffinity_core_v1_k8s1_19Impl
  PodAffinityTerm_core_v1_k8s1_19Impl(this)
    .also { requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Last time we probed the condition. */
@K8sDslMarker
fun PodCondition.lastProbeTime(init: Time.() -> Unit) {
  this as PodCondition_core_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastProbeTime = it }
    .apply(init)
}

/** Last time the condition transitioned from one status to another. */
@K8sDslMarker
fun PodCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as PodCondition_core_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries
will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy. */
@K8sDslMarker
fun PodDNSConfig.options(init: PodDNSConfigOption.() -> Unit) {
  this as PodDNSConfig_core_v1_k8s1_19Impl
  PodDNSConfigOption_core_v1_k8s1_19Impl(this)
    .also { options = options?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun PodDisruptionBudget.metadata(init: ObjectMeta.() -> Unit) {
  this as PodDisruptionBudget_policy_v1beta1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired behavior of the PodDisruptionBudget. */
@K8sDslMarker
fun PodDisruptionBudget.spec(init: Poddisruptionbudgetspec.() -> Unit) {
  this as PodDisruptionBudget_policy_v1beta1_k8s1_19Impl
  Poddisruptionbudgetspec_policy_v1beta1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Most recently observed status of the PodDisruptionBudget. */
@K8sDslMarker
fun PodDisruptionBudget.status(init: Poddisruptionbudgetstatus.() -> Unit) {
  this as PodDisruptionBudget_policy_v1beta1_k8s1_19Impl
  Poddisruptionbudgetstatus_policy_v1beta1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun PodPreset.metadata(init: ObjectMeta.() -> Unit) {
  this as PodPreset_settings_k8s_io_v1alpha1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun PodPreset.spec(init: Podpresetspec.() -> Unit) {
  this as PodPreset_settings_k8s_io_v1alpha1_k8s1_19Impl
  Podpresetspec_settings_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random
SELinux context for each container. May also be set in SecurityContext. If set in both SecurityContext and
PodSecurityContext, the value specified in SecurityContext takes precedence for that container. */
@K8sDslMarker
fun PodSecurityContext.seLinuxOptions(init: SELinuxOptions.() -> Unit) {
  this as PodSecurityContext_core_v1_k8s1_19Impl
  SELinuxOptions_core_v1_k8s1_19Impl(this)
    .also { seLinuxOptions = it }
    .apply(init)
}

/** The seccomp options to use by the containers in this pod. */
@K8sDslMarker
fun PodSecurityContext.seccompProfile(init: SeccompProfile.() -> Unit) {
  this as PodSecurityContext_core_v1_k8s1_19Impl
  SeccompProfile_core_v1_k8s1_19Impl(this)
    .also { seccompProfile = it }
    .apply(init)
}

/** Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime)
might fail to launch. */
@K8sDslMarker
fun PodSecurityContext.sysctls(init: Sysctl.() -> Unit) {
  this as PodSecurityContext_core_v1_k8s1_19Impl
  Sysctl_core_v1_k8s1_19Impl(this)
    .also { sysctls = sysctls?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** The Windows specific settings applied to all containers. If unspecified, the options within a container's
SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in
SecurityContext takes precedence. */
@K8sDslMarker
fun PodSecurityContext.windowsOptions(init: WindowsSecurityContextOptions.() -> Unit) {
  this as PodSecurityContext_core_v1_k8s1_19Impl
  WindowsSecurityContextOptions_core_v1_k8s1_19Impl(this)
    .also { windowsOptions = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun PodSecurityPolicy.metadata(init: ObjectMeta.() -> Unit) {
  this as PodSecurityPolicy_policy_v1beta1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** spec defines the policy enforced. */
@K8sDslMarker
fun PodSecurityPolicy.spec(init: Podsecuritypolicyspec.() -> Unit) {
  this as PodSecurityPolicy_policy_v1beta1_k8s1_19Impl
  Podsecuritypolicyspec_policy_v1beta1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun PodTemplate.metadata(init: ObjectMeta.() -> Unit) {
  this as PodTemplate_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Template defines the pods that will be created from this pod template.
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun PodTemplate.template(init: Podtemplatespec.() -> Unit) {
  this as PodTemplate_core_v1_k8s1_19Impl
  Podtemplatespec_core_v1_k8s1_19Impl(this)
    .also { template = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Pod.metadata(init: ObjectMeta.() -> Unit) {
  this as Pod_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired behavior of the pod. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Pod.spec(init: Podspec.() -> Unit) {
  this as Pod_core_v1_k8s1_19Impl
  Podspec_core_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Most recently observed status of the pod. This data may not be up to date. Populated by the system. Read-only. More
info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Pod.status(init: Podstatus.() -> Unit) {
  this as Pod_core_v1_k8s1_19Impl
  Podstatus_core_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** metric identifies the target metric by name and selector */
@K8sDslMarker
fun PodsMetricSource.metric(init: MetricIdentifier.() -> Unit) {
  this as PodsMetricSource_autoscaling_v2beta2_k8s1_19Impl
  MetricIdentifier_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { metric = it }
    .apply(init)
}

/** target specifies the target value for the given metric */
@K8sDslMarker
fun PodsMetricSource.target(init: MetricTarget.() -> Unit) {
  this as PodsMetricSource_autoscaling_v2beta2_k8s1_19Impl
  MetricTarget_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { target = it }
    .apply(init)
}

/** current contains the current value for the given metric */
@K8sDslMarker
fun PodsMetricStatus.current(init: MetricValueStatus.() -> Unit) {
  this as PodsMetricStatus_autoscaling_v2beta2_k8s1_19Impl
  MetricValueStatus_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { current = it }
    .apply(init)
}

/** metric identifies the target metric by name and selector */
@K8sDslMarker
fun PodsMetricStatus.metric(init: MetricIdentifier.() -> Unit) {
  this as PodsMetricStatus_autoscaling_v2beta2_k8s1_19Impl
  MetricIdentifier_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { metric = it }
    .apply(init)
}

/** `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the
target non-resource URL. */
@K8sDslMarker
fun PolicyRulesWithSubjects.nonResourceRules(init: NonResourcePolicyRule.() -> Unit) {
  this as PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { nonResourceRules = nonResourceRules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target
resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty. */
@K8sDslMarker
fun PolicyRulesWithSubjects.resourceRules(init: ResourcePolicyRule.() -> Unit) {
  this as PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { resourceRules = resourceRules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one
member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches
every request. Required. */
@K8sDslMarker
fun PolicyRulesWithSubjects.subjects(init: Subject.() -> Unit) {
  this as PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  Subject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { subjects = subjects?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** A node selector term, associated with the corresponding weight. */
@K8sDslMarker
fun PreferredSchedulingTerm.preference(init: NodeSelectorTerm.() -> Unit) {
  this as PreferredSchedulingTerm_core_v1_k8s1_19Impl
  NodeSelectorTerm_core_v1_k8s1_19Impl(this)
    .also { preference = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun PriorityClass.metadata(init: ObjectMeta.() -> Unit) {
  this as PriorityClass_scheduling_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** `lastTransitionTime` is the last time the condition transitioned from one status to another. */
@K8sDslMarker
fun PriorityLevelConfigurationCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as PriorityLevelConfigurationCondition_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** `metadata` is the standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun PriorityLevelConfiguration.metadata(init: ObjectMeta.() -> Unit) {
  this as PriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** `spec` is the specification of the desired behavior of a "request-priority". More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun PriorityLevelConfiguration.spec(init: Prioritylevelconfigurationspec.() -> Unit) {
  this as PriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  Prioritylevelconfigurationspec_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** `status` is the current status of a "request-priority". More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun PriorityLevelConfiguration.status(init: Prioritylevelconfigurationstatus.() -> Unit) {
  this as PriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  Prioritylevelconfigurationstatus_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** One and only one of the following should be specified. Exec specifies the action to take. */
@K8sDslMarker
fun Probe.exec(init: ExecAction.() -> Unit) {
  this as Probe_core_v1_k8s1_19Impl
  ExecAction_core_v1_k8s1_19Impl(this)
    .also { exec = it }
    .apply(init)
}

/** HTTPGet specifies the http request to perform. */
@K8sDslMarker
fun Probe.httpGet(init: HTTPGetAction.() -> Unit) {
  this as Probe_core_v1_k8s1_19Impl
  HTTPGetAction_core_v1_k8s1_19Impl(this)
    .also { httpGet = it }
    .apply(init)
}

/** TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported */
@K8sDslMarker
fun Probe.tcpSocket(init: TCPSocketAction.() -> Unit) {
  this as Probe_core_v1_k8s1_19Impl
  TCPSocketAction_core_v1_k8s1_19Impl(this)
    .also { tcpSocket = it }
    .apply(init)
}

/** list of volume projections */
@K8sDslMarker
fun ProjectedVolumeSource.sources(init: VolumeProjection.() -> Unit) {
  this as ProjectedVolumeSource_core_v1_k8s1_19Impl
  VolumeProjection_core_v1_k8s1_19Impl(this)
    .also { sources = sources?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info:
https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
@K8sDslMarker
fun RBDPersistentVolumeSource.secretRef(init: SecretReference.() -> Unit) {
  this as RBDPersistentVolumeSource_core_v1_k8s1_19Impl
  SecretReference_core_v1_k8s1_19Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info:
https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
@K8sDslMarker
fun RBDVolumeSource.secretRef(init: LocalObjectReference.() -> Unit) {
  this as RBDVolumeSource_core_v1_k8s1_19Impl
  LocalObjectReference_core_v1_k8s1_19Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** The last time the condition transitioned from one status to another. */
@K8sDslMarker
fun ReplicaSetCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as ReplicaSetCondition_apps_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s) that the ReplicaSet manages.
Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun ReplicaSet.metadata(init: ObjectMeta.() -> Unit) {
  this as ReplicaSet_apps_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the specification of the desired behavior of the ReplicaSet. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun ReplicaSet.spec(init: Replicasetspec.() -> Unit) {
  this as ReplicaSet_apps_v1_k8s1_19Impl
  Replicasetspec_apps_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is the most recently observed status of the ReplicaSet. This data may be out of date by some window of time.
Populated by the system. Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun ReplicaSet.status(init: Replicasetstatus.() -> Unit) {
  this as ReplicaSet_apps_v1_k8s1_19Impl
  Replicasetstatus_apps_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** The last time the condition transitioned from one status to another. */
@K8sDslMarker
fun ReplicationControllerCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as ReplicationControllerCondition_core_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** If the Labels of a ReplicationController are empty, they are defaulted to be the same as the Pod(s) that the replication
controller manages. Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun ReplicationController.metadata(init: ObjectMeta.() -> Unit) {
  this as ReplicationController_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the specification of the desired behavior of the replication controller. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun ReplicationController.spec(init: Replicationcontrollerspec.() -> Unit) {
  this as ReplicationController_core_v1_k8s1_19Impl
  Replicationcontrollerspec_core_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is the most recently observed status of the replication controller. This data may be out of date by some window
of time. Populated by the system. Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun ReplicationController.status(init: Replicationcontrollerstatus.() -> Unit) {
  this as ReplicationController_core_v1_k8s1_19Impl
  Replicationcontrollerstatus_core_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** Specifies the output format of the exposed resources, defaults to "1" */
@K8sDslMarker
fun ResourceFieldSelector.divisor(init: Quantity.() -> Unit) {
  this as ResourceFieldSelector_core_v1_k8s1_19Impl
  Quantity_core_resource_k8s1_19Impl(this)
    .also { divisor = it }
    .apply(init)
}

/** target specifies the target value for the given metric */
@K8sDslMarker
fun ResourceMetricSource.target(init: MetricTarget.() -> Unit) {
  this as ResourceMetricSource_autoscaling_v2beta2_k8s1_19Impl
  MetricTarget_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { target = it }
    .apply(init)
}

/** current contains the current value for the given metric */
@K8sDslMarker
fun ResourceMetricStatus.current(init: MetricValueStatus.() -> Unit) {
  this as ResourceMetricStatus_autoscaling_v2beta2_k8s1_19Impl
  MetricValueStatus_autoscaling_v2beta2_k8s1_19Impl(this)
    .also { current = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun ResourceQuota.metadata(init: ObjectMeta.() -> Unit) {
  this as ResourceQuota_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the desired quota.
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun ResourceQuota.spec(init: Resourcequotaspec.() -> Unit) {
  this as ResourceQuota_core_v1_k8s1_19Impl
  Resourcequotaspec_core_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status defines the actual enforced quota and its current usage.
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun ResourceQuota.status(init: Resourcequotastatus.() -> Unit) {
  this as ResourceQuota_core_v1_k8s1_19Impl
  Resourcequotastatus_core_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** Limits describes the maximum amount of compute resources allowed. More info:
https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/ */
@K8sDslMarker
fun ResourceRequirements.limits(init: de.loosetie.k8s.dsl.types.LimitsAndRequests.() -> Unit) {
  this as ResourceRequirements_core_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.LimitsAndRequests(this)
    .also { limits = it }
    .apply(init)
}

/** Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults
to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info:
https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/ */
@K8sDslMarker
fun ResourceRequirements.requests(init: de.loosetie.k8s.dsl.types.LimitsAndRequests.() -> Unit) {
  this as ResourceRequirements_core_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.LimitsAndRequests(this)
    .also { requests = it }
    .apply(init)
}

/** Standard object's metadata. */
@K8sDslMarker
fun RoleBinding.metadata(init: ObjectMeta.() -> Unit) {
  this as RoleBinding_rbac_authorization_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be
resolved, the Authorizer must return an error. */
@K8sDslMarker
fun RoleBinding.roleRef(init: RoleRef.() -> Unit) {
  this as RoleBinding_rbac_authorization_k8s_io_v1_k8s1_19Impl
  RoleRef_rbac_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { roleRef = it }
    .apply(init)
}

/** Subjects holds references to the objects the role applies to. */
@K8sDslMarker
fun RoleBinding.subjects(init: Subject_rbac_authorization_k8s_io_v1_k8s1_19.() -> Unit) {
  this as RoleBinding_rbac_authorization_k8s_io_v1_k8s1_19Impl
  Subject_rbac_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { subjects = subjects?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. */
@K8sDslMarker
fun Role.metadata(init: ObjectMeta.() -> Unit) {
  this as Role_rbac_authorization_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Rules holds all the PolicyRules for this Role */
@K8sDslMarker
fun Role.rules(init: PolicyRule.() -> Unit) {
  this as Role_rbac_authorization_k8s_io_v1_k8s1_19Impl
  PolicyRule_rbac_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { rules = rules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** ranges are the allowed ranges of gids that may be used. If you would like to force a single gid then supply a single
range with the same start and end. Required for MustRunAs. */
@K8sDslMarker
fun RunAsGroupStrategyOptions.ranges(init: IDRange.() -> Unit) {
  this as RunAsGroupStrategyOptions_policy_v1beta1_k8s1_19Impl
  IDRange_policy_v1beta1_k8s1_19Impl(this)
    .also { ranges = ranges?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** ranges are the allowed ranges of uids that may be used. If you would like to force a single uid then supply a single
range with the same start and end. Required for MustRunAs. */
@K8sDslMarker
fun RunAsUserStrategyOptions.ranges(init: IDRange.() -> Unit) {
  this as RunAsUserStrategyOptions_policy_v1beta1_k8s1_19Impl
  IDRange_policy_v1beta1_k8s1_19Impl(this)
    .also { ranges = ranges?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun RuntimeClass.metadata(init: ObjectMeta.() -> Unit) {
  this as RuntimeClass_node_k8s_io_v1beta1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see
https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15,
and is only honored by servers that enable the PodOverhead feature. */
@K8sDslMarker
fun RuntimeClass.overhead(init: Overhead.() -> Unit) {
  this as RuntimeClass_node_k8s_io_v1beta1_k8s1_19Impl
  Overhead_node_k8s_io_v1beta1_k8s1_19Impl(this)
    .also { overhead = it }
    .apply(init)
}

/** Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes
that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes. */
@K8sDslMarker
fun RuntimeClass.scheduling(init: Scheduling.() -> Unit) {
  this as RuntimeClass_node_k8s_io_v1beta1_k8s1_19Impl
  Scheduling_node_k8s_io_v1beta1_k8s1_19Impl(this)
    .also { scheduling = it }
    .apply(init)
}

/** seLinuxOptions required to run as; required for MustRunAs More info:
https://kubernetes.io/docs/tasks/configure-pod-container/security-context/ */
@K8sDslMarker
fun SELinuxStrategyOptions.seLinuxOptions(init: SELinuxOptions.() -> Unit) {
  this as SELinuxStrategyOptions_policy_v1beta1_k8s1_19Impl
  SELinuxOptions_core_v1_k8s1_19Impl(this)
    .also { seLinuxOptions = it }
    .apply(init)
}

/** SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login
operation will fail. */
@K8sDslMarker
fun ScaleIOPersistentVolumeSource.secretRef(init: SecretReference.() -> Unit) {
  this as ScaleIOPersistentVolumeSource_core_v1_k8s1_19Impl
  SecretReference_core_v1_k8s1_19Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login
operation will fail. */
@K8sDslMarker
fun ScaleIOVolumeSource.secretRef(init: LocalObjectReference.() -> Unit) {
  this as ScaleIOVolumeSource_core_v1_k8s1_19Impl
  LocalObjectReference_core_v1_k8s1_19Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively
unioning the set of nodes tolerated by the pod and the RuntimeClass. */
@K8sDslMarker
fun Scheduling.tolerations(init: Toleration.() -> Unit) {
  this as Scheduling_node_k8s_io_v1beta1_k8s1_19Impl
  Toleration_core_v1_k8s1_19Impl(this)
    .also { tolerations = tolerations?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** A list of scope selector requirements by scope of the resources. */
@K8sDslMarker
fun ScopeSelector.matchExpressions(init: ScopedResourceSelectorRequirement.() -> Unit) {
  this as ScopeSelector_core_v1_k8s1_19Impl
  ScopedResourceSelectorRequirement_core_v1_k8s1_19Impl(this)
    .also { matchExpressions = matchExpressions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a
file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified
paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup
will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'. */
@K8sDslMarker
fun SecretProjection.items(init: KeyToPath.() -> Unit) {
  this as SecretProjection_core_v1_k8s1_19Impl
  KeyToPath_core_v1_k8s1_19Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a
file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified
paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup
will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'. */
@K8sDslMarker
fun SecretVolumeSource.items(init: KeyToPath.() -> Unit) {
  this as SecretVolumeSource_core_v1_k8s1_19Impl
  KeyToPath_core_v1_k8s1_19Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Secret.metadata(init: ObjectMeta.() -> Unit) {
  this as Secret_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the
container runtime. */
@K8sDslMarker
fun SecurityContext.capabilities(init: Capabilities.() -> Unit) {
  this as SecurityContext_core_v1_k8s1_19Impl
  Capabilities_core_v1_k8s1_19Impl(this)
    .also { capabilities = it }
    .apply(init)
}

/** The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux
context for each container. May also be set in PodSecurityContext. If set in both SecurityContext and
PodSecurityContext, the value specified in SecurityContext takes precedence. */
@K8sDslMarker
fun SecurityContext.seLinuxOptions(init: SELinuxOptions.() -> Unit) {
  this as SecurityContext_core_v1_k8s1_19Impl
  SELinuxOptions_core_v1_k8s1_19Impl(this)
    .also { seLinuxOptions = it }
    .apply(init)
}

/** The seccomp options to use by this container. If seccomp options are provided at both the pod & container level, the
container options override the pod options. */
@K8sDslMarker
fun SecurityContext.seccompProfile(init: SeccompProfile.() -> Unit) {
  this as SecurityContext_core_v1_k8s1_19Impl
  SeccompProfile_core_v1_k8s1_19Impl(this)
    .also { seccompProfile = it }
    .apply(init)
}

/** The Windows specific settings applied to all containers. If unspecified, the options from the PodSecurityContext will be
used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. */
@K8sDslMarker
fun SecurityContext.windowsOptions(init: WindowsSecurityContextOptions.() -> Unit) {
  this as SecurityContext_core_v1_k8s1_19Impl
  WindowsSecurityContextOptions_core_v1_k8s1_19Impl(this)
    .also { windowsOptions = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun SelfSubjectAccessReview.metadata(init: ObjectMeta.() -> Unit) {
  this as SelfSubjectAccessReview_authorization_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec holds information about the request being evaluated. user and groups must be empty */
@K8sDslMarker
fun SelfSubjectAccessReview.spec(init: Selfsubjectaccessreviewspec.() -> Unit) {
  this as SelfSubjectAccessReview_authorization_k8s_io_v1_k8s1_19Impl
  Selfsubjectaccessreviewspec_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is filled in by the server and indicates whether the request is allowed or not */
@K8sDslMarker
fun SelfSubjectAccessReview.status(init: Subjectaccessreviewstatus.() -> Unit) {
  this as SelfSubjectAccessReview_authorization_k8s_io_v1_k8s1_19Impl
  Subjectaccessreviewstatus_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun SelfSubjectRulesReview.metadata(init: ObjectMeta.() -> Unit) {
  this as SelfSubjectRulesReview_authorization_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec holds information about the request being evaluated. */
@K8sDslMarker
fun SelfSubjectRulesReview.spec(init: Selfsubjectrulesreviewspec.() -> Unit) {
  this as SelfSubjectRulesReview_authorization_k8s_io_v1_k8s1_19Impl
  Selfsubjectrulesreviewspec_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is filled in by the server and indicates the set of actions a user can perform. */
@K8sDslMarker
fun SelfSubjectRulesReview.status(init: SubjectRulesReviewStatus.() -> Unit) {
  this as SelfSubjectRulesReview_authorization_k8s_io_v1_k8s1_19Impl
  SubjectRulesReviewStatus_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that
reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but
ImagePullSecrets are only accessed by the kubelet. More info:
https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod */
@K8sDslMarker
fun ServiceAccount.imagePullSecrets(init: LocalObjectReference.() -> Unit) {
  this as ServiceAccount_core_v1_k8s1_19Impl
  LocalObjectReference_core_v1_k8s1_19Impl(this)
    .also { imagePullSecrets = imagePullSecrets?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun ServiceAccount.metadata(init: ObjectMeta.() -> Unit) {
  this as ServiceAccount_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info:
https://kubernetes.io/docs/concepts/configuration/secret */
@K8sDslMarker
fun ServiceAccount.secrets(init: ObjectReference.() -> Unit) {
  this as ServiceAccount_core_v1_k8s1_19Impl
  ObjectReference_core_v1_k8s1_19Impl(this)
    .also { secrets = secrets?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name
must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports.
If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services
with clusterIP=None, and should be omitted or set equal to the 'port' field. More info:
https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service */
@K8sDslMarker
fun ServicePort.targetPort(string: String) {
  this as ServicePort_core_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrString(string)
    .also { targetPort = it }
}

/** Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name
must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports.
If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services
with clusterIP=None, and should be omitted or set equal to the 'port' field. More info:
https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service */
@K8sDslMarker
fun ServicePort.targetPort(int: Int) {
  this as ServicePort_core_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrString(int)
    .also { targetPort = it }
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Service.metadata(init: ObjectMeta.() -> Unit) {
  this as Service_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the behavior of a service.
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Service.spec(init: Servicespec.() -> Unit) {
  this as Service_core_v1_k8s1_19Impl
  Servicespec_core_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Most recently observed status of the service. Populated by the system. Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Service.status(init: Servicestatus.() -> Unit) {
  this as Service_core_v1_k8s1_19Impl
  Servicestatus_core_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** clientIP contains the configurations of Client IP based session affinity. */
@K8sDslMarker
fun SessionAffinityConfig.clientIP(init: ClientIPConfig.() -> Unit) {
  this as SessionAffinityConfig_core_v1_k8s1_19Impl
  ClientIPConfig_core_v1_k8s1_19Impl(this)
    .also { clientIP = it }
    .apply(init)
}

/** Last time the condition transitioned from one status to another. */
@K8sDslMarker
fun StatefulSetCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as StatefulSetCondition_apps_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType. */
@K8sDslMarker
fun StatefulSetUpdateStrategy.rollingUpdate(init: RollingUpdateStatefulSetStrategy.() -> Unit) {
  this as StatefulSetUpdateStrategy_apps_v1_k8s1_19Impl
  RollingUpdateStatefulSetStrategy_apps_v1_k8s1_19Impl(this)
    .also { rollingUpdate = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun StatefulSet.metadata(init: ObjectMeta.() -> Unit) {
  this as StatefulSet_apps_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the desired identities of pods in this set. */
@K8sDslMarker
fun StatefulSet.spec(init: Statefulsetspec.() -> Unit) {
  this as StatefulSet_apps_v1_k8s1_19Impl
  Statefulsetspec_apps_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time. */
@K8sDslMarker
fun StatefulSet.status(init: Statefulsetstatus.() -> Unit) {
  this as StatefulSet_apps_v1_k8s1_19Impl
  Statefulsetstatus_apps_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide
detailed causes. */
@K8sDslMarker
fun StatusDetails.causes(init: StatusCause.() -> Unit) {
  this as StatusDetails_meta_v1_k8s1_19Impl
  StatusCause_meta_v1_k8s1_19Impl(this)
    .also { causes = causes?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Extended data associated with the reason. Each reason may define its own extended details. This field is optional and
the data returned is not guaranteed to conform to any schema except that defined by the reason type. */
@K8sDslMarker
fun Status.details(init: StatusDetails.() -> Unit) {
  this as Status_meta_v1_k8s1_19Impl
  StatusDetails_meta_v1_k8s1_19Impl(this)
    .also { details = it }
    .apply(init)
}

/** Standard list metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
@K8sDslMarker
fun Status.metadata(init: ListMeta.() -> Unit) {
  this as Status_meta_v1_k8s1_19Impl
  ListMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported
topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only
honored by servers that enable the VolumeScheduling feature. */
@K8sDslMarker
fun StorageClass.allowedTopologies(init: TopologySelectorTerm.() -> Unit) {
  this as StorageClass_storage_k8s_io_v1_k8s1_19Impl
  TopologySelectorTerm_core_v1_k8s1_19Impl(this)
    .also { allowedTopologies = allowedTopologies?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun StorageClass.metadata(init: ObjectMeta.() -> Unit) {
  this as StorageClass_storage_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** SecretRef specifies the secret to use for obtaining the StorageOS API credentials. If not specified, default values will
be attempted. */
@K8sDslMarker
fun StorageOSPersistentVolumeSource.secretRef(init: ObjectReference.() -> Unit) {
  this as StorageOSPersistentVolumeSource_core_v1_k8s1_19Impl
  ObjectReference_core_v1_k8s1_19Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** SecretRef specifies the secret to use for obtaining the StorageOS API credentials. If not specified, default values will
be attempted. */
@K8sDslMarker
fun StorageOSVolumeSource.secretRef(init: LocalObjectReference.() -> Unit) {
  this as StorageOSVolumeSource_core_v1_k8s1_19Impl
  LocalObjectReference_core_v1_k8s1_19Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun SubjectAccessReview.metadata(init: ObjectMeta.() -> Unit) {
  this as SubjectAccessReview_authorization_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec holds information about the request being evaluated */
@K8sDslMarker
fun SubjectAccessReview.spec(init: Subjectaccessreviewspec.() -> Unit) {
  this as SubjectAccessReview_authorization_k8s_io_v1_k8s1_19Impl
  Subjectaccessreviewspec_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is filled in by the server and indicates whether the request is allowed or not */
@K8sDslMarker
fun SubjectAccessReview.status(init: Subjectaccessreviewstatus.() -> Unit) {
  this as SubjectAccessReview_authorization_k8s_io_v1_k8s1_19Impl
  Subjectaccessreviewstatus_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn't
significant, may contain duplicates, and possibly be incomplete. */
@K8sDslMarker
fun SubjectRulesReviewStatus.nonResourceRules(init: NonResourceRule.() -> Unit) {
  this as SubjectRulesReviewStatus_authorization_k8s_io_v1_k8s1_19Impl
  NonResourceRule_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { nonResourceRules = nonResourceRules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn't
significant, may contain duplicates, and possibly be incomplete. */
@K8sDslMarker
fun SubjectRulesReviewStatus.resourceRules(init: ResourceRule.() -> Unit) {
  this as SubjectRulesReviewStatus_authorization_k8s_io_v1_k8s1_19Impl
  ResourceRule_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { resourceRules = resourceRules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun Subject.group(init: GroupSubject.() -> Unit) {
  this as Subject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  GroupSubject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { group = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun Subject.serviceAccount(init: ServiceAccountSubject.() -> Unit) {
  this as Subject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  ServiceAccountSubject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { serviceAccount = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun Subject.user(init: UserSubject.() -> Unit) {
  this as Subject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  UserSubject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { user = it }
    .apply(init)
}

/** ranges are the allowed ranges of supplemental groups. If you would like to force a single supplemental group then supply
a single range with the same start and end. Required for MustRunAs. */
@K8sDslMarker
fun SupplementalGroupsStrategyOptions.ranges(init: IDRange.() -> Unit) {
  this as SupplementalGroupsStrategyOptions_policy_v1beta1_k8s1_19Impl
  IDRange_policy_v1beta1_k8s1_19Impl(this)
    .also { ranges = ranges?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
IANA_SVC_NAME. */
@K8sDslMarker
fun TCPSocketAction.port(string: String) {
  this as TCPSocketAction_core_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrString(string)
    .also { port = it }
}

/** Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
IANA_SVC_NAME. */
@K8sDslMarker
fun TCPSocketAction.port(int: Int) {
  this as TCPSocketAction_core_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrString(int)
    .also { port = it }
}

/** TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints. */
@K8sDslMarker
fun Taint.timeAdded(init: Time.() -> Unit) {
  this as Taint_core_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { timeAdded = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun TokenRequest.metadata(init: ObjectMeta.() -> Unit) {
  this as TokenRequest_authentication_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun TokenRequest.spec(init: Tokenrequestspec.() -> Unit) {
  this as TokenRequest_authentication_k8s_io_v1_k8s1_19Impl
  Tokenrequestspec_authentication_k8s_io_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun TokenRequest.status(init: Tokenrequeststatus.() -> Unit) {
  this as TokenRequest_authentication_k8s_io_v1_k8s1_19Impl
  Tokenrequeststatus_authentication_k8s_io_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun TokenReview.metadata(init: ObjectMeta.() -> Unit) {
  this as TokenReview_authentication_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec holds information about the request being evaluated */
@K8sDslMarker
fun TokenReview.spec(init: Tokenreviewspec.() -> Unit) {
  this as TokenReview_authentication_k8s_io_v1_k8s1_19Impl
  Tokenreviewspec_authentication_k8s_io_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is filled in by the server and indicates whether the request can be authenticated. */
@K8sDslMarker
fun TokenReview.status(init: Tokenreviewstatus.() -> Unit) {
  this as TokenReview_authentication_k8s_io_v1_k8s1_19Impl
  Tokenreviewstatus_authentication_k8s_io_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** A list of topology selector requirements by labels. */
@K8sDslMarker
fun TopologySelectorTerm.matchLabelExpressions(init: TopologySelectorLabelRequirement.() -> Unit) {
  this as TopologySelectorTerm_core_v1_k8s1_19Impl
  TopologySelectorLabelRequirement_core_v1_k8s1_19Impl(this)
    .also { matchLabelExpressions = matchLabelExpressions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** LabelSelector is used to find matching pods. Pods that match this label selector are counted to determine the number of
pods in their corresponding topology domain. */
@K8sDslMarker
fun TopologySpreadConstraint.labelSelector(init: LabelSelector.() -> Unit) {
  this as TopologySpreadConstraint_core_v1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { labelSelector = it }
    .apply(init)
}

/** Standard object metadata; More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata. */
@K8sDslMarker
fun ValidatingWebhookConfiguration.metadata(init: ObjectMeta.() -> Unit) {
  this as ValidatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Webhooks is a list of webhooks and the affected resources and operations. */
@K8sDslMarker
fun ValidatingWebhookConfiguration.webhooks(init: ValidatingWebhook.() -> Unit) {
  this as ValidatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_19Impl
  ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_19Impl(this)
    .also { webhooks = webhooks?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** ClientConfig defines how to communicate with the hook. Required */
@K8sDslMarker
fun ValidatingWebhook.clientConfig(init: WebhookClientConfig.() -> Unit) {
  this as ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_19Impl
  WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_19Impl(this)
    .also { clientConfig = it }
    .apply(init)
}

/** NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches
the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is
another cluster scoped resource, it never skips the webhook. For example, to run the webhook on any objects whose
namespace is not associated with "runlevel" of "0" or "1"; you will set the selector as follows: "namespaceSelector": {
"matchExpressions": [ { "key": "runlevel", "operator": "NotIn", "values": [ "0", "1" ] } ] } If instead you want to only
run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set
the selector as follows: "namespaceSelector": { "matchExpressions": [ { "key": "environment", "operator": "In",
"values": [ "prod", "staging" ] } ] } See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels for
more examples of label selectors. Default to the empty LabelSelector, which matches everything. */
@K8sDslMarker
fun ValidatingWebhook.namespaceSelector(init: LabelSelector.() -> Unit) {
  this as ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { namespaceSelector = it }
    .apply(init)
}

/** ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is
evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if
either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete)
or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match.
Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the
labels. Default to the empty LabelSelector, which matches everything. */
@K8sDslMarker
fun ValidatingWebhook.objectSelector(init: LabelSelector.() -> Unit) {
  this as ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { objectSelector = it }
    .apply(init)
}

/** Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an
operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and
MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely
disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests
for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects. */
@K8sDslMarker
fun ValidatingWebhook.rules(init: RuleWithOperations.() -> Unit) {
  this as ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_19Impl
  RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_19Impl(this)
    .also { rules = rules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline
VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's
inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the
CSIMigration feature. */
@K8sDslMarker
fun VolumeAttachmentSource.inlineVolumeSpec(init: Persistentvolumespec.() -> Unit) {
  this as VolumeAttachmentSource_storage_k8s_io_v1_k8s1_19Impl
  Persistentvolumespec_core_v1_k8s1_19Impl(this)
    .also { inlineVolumeSpec = it }
    .apply(init)
}

/** Standard object metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun VolumeAttachment.metadata(init: ObjectMeta.() -> Unit) {
  this as VolumeAttachment_storage_k8s_io_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system. */
@K8sDslMarker
fun VolumeAttachment.spec(init: Volumeattachmentspec.() -> Unit) {
  this as VolumeAttachment_storage_k8s_io_v1_k8s1_19Impl
  Volumeattachmentspec_storage_k8s_io_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the
external-attacher. */
@K8sDslMarker
fun VolumeAttachment.status(init: Volumeattachmentstatus.() -> Unit) {
  this as VolumeAttachment_storage_k8s_io_v1_k8s1_19Impl
  Volumeattachmentstatus_storage_k8s_io_v1_k8s1_19Impl(this)
    .also { status = it }
    .apply(init)
}

/** Time the error was encountered. */
@K8sDslMarker
fun VolumeError.time(init: Time.() -> Unit) {
  this as VolumeError_storage_k8s_io_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { time = it }
    .apply(init)
}

/** Required specifies hard node constraints that must be met. */
@K8sDslMarker
fun VolumeNodeAffinity.required(init: NodeSelector.() -> Unit) {
  this as VolumeNodeAffinity_core_v1_k8s1_19Impl
  NodeSelector_core_v1_k8s1_19Impl(this)
    .also { required = it }
    .apply(init)
}

/** information about the configMap data to project */
@K8sDslMarker
fun VolumeProjection.configMap(init: ConfigMapProjection.() -> Unit) {
  this as VolumeProjection_core_v1_k8s1_19Impl
  ConfigMapProjection_core_v1_k8s1_19Impl(this)
    .also { configMap = it }
    .apply(init)
}

/** information about the downwardAPI data to project */
@K8sDslMarker
fun VolumeProjection.downwardAPI(init: DownwardAPIProjection.() -> Unit) {
  this as VolumeProjection_core_v1_k8s1_19Impl
  DownwardAPIProjection_core_v1_k8s1_19Impl(this)
    .also { downwardAPI = it }
    .apply(init)
}

/** information about the secret data to project */
@K8sDslMarker
fun VolumeProjection.secret(init: SecretProjection.() -> Unit) {
  this as VolumeProjection_core_v1_k8s1_19Impl
  SecretProjection_core_v1_k8s1_19Impl(this)
    .also { secret = it }
    .apply(init)
}

/** information about the serviceAccountToken data to project */
@K8sDslMarker
fun VolumeProjection.serviceAccountToken(init: ServiceAccountTokenProjection.() -> Unit) {
  this as VolumeProjection_core_v1_k8s1_19Impl
  ServiceAccountTokenProjection_core_v1_k8s1_19Impl(this)
    .also { serviceAccountToken = it }
    .apply(init)
}

/** AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to
the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
@K8sDslMarker
fun Volume.awsElasticBlockStore(init: AWSElasticBlockStoreVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  AWSElasticBlockStoreVolumeSource_core_v1_k8s1_19Impl(this)
    .also { awsElasticBlockStore = it }
    .apply(init)
}

/** AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod. */
@K8sDslMarker
fun Volume.azureDisk(init: AzureDiskVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  AzureDiskVolumeSource_core_v1_k8s1_19Impl(this)
    .also { azureDisk = it }
    .apply(init)
}

/** AzureFile represents an Azure File Service mount on the host and bind mount to the pod. */
@K8sDslMarker
fun Volume.azureFile(init: AzureFileVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  AzureFileVolumeSource_core_v1_k8s1_19Impl(this)
    .also { azureFile = it }
    .apply(init)
}

/** CephFS represents a Ceph FS mount on the host that shares a pod's lifetime */
@K8sDslMarker
fun Volume.cephfs(init: CephFSVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  CephFSVolumeSource_core_v1_k8s1_19Impl(this)
    .also { cephfs = it }
    .apply(init)
}

/** Cinder represents a cinder volume attached and mounted on kubelets host machine. More info:
https://examples.k8s.io/mysql-cinder-pd/README.md */
@K8sDslMarker
fun Volume.cinder(init: CinderVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  CinderVolumeSource_core_v1_k8s1_19Impl(this)
    .also { cinder = it }
    .apply(init)
}

/** ConfigMap represents a configMap that should populate this volume */
@K8sDslMarker
fun Volume.configMap(init: ConfigMapVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  ConfigMapVolumeSource_core_v1_k8s1_19Impl(this)
    .also { configMap = it }
    .apply(init)
}

/** CSI (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta
feature). */
@K8sDslMarker
fun Volume.csi(init: CSIVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  CSIVolumeSource_core_v1_k8s1_19Impl(this)
    .also { csi = it }
    .apply(init)
}

/** DownwardAPI represents downward API about the pod that should populate this volume */
@K8sDslMarker
fun Volume.downwardAPI(init: DownwardAPIVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  DownwardAPIVolumeSource_core_v1_k8s1_19Impl(this)
    .also { downwardAPI = it }
    .apply(init)
}

/** EmptyDir represents a temporary directory that shares a pod's lifetime. More info:
https://kubernetes.io/docs/concepts/storage/volumes#emptydir */
@K8sDslMarker
fun Volume.emptyDir(init: EmptyDirVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  EmptyDirVolumeSource_core_v1_k8s1_19Impl(this)
    .also { emptyDir = it }
    .apply(init)
}

/** Ephemeral represents a volume that is handled by a cluster storage driver (Alpha feature). The volume's lifecycle is
tied to the pod that defines it - it will be created before the pod starts, and deleted when the pod is removed. Use
this if: a) the volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot or
capacity tracking are needed, c) the storage driver is specified through a storage class, and d) the storage driver
supports dynamic volume provisioning through a PersistentVolumeClaim (see EphemeralVolumeSource for more information on
the connection between this volume type and PersistentVolumeClaim). Use PersistentVolumeClaim or one of the
vendor-specific APIs for volumes that persist for longer than the lifecycle of an individual pod. Use CSI for
light-weight local ephemeral volumes if the CSI driver is meant to be used that way - see the documentation of the
driver for more information. A pod can use both types of ephemeral volumes and persistent volumes at the same time. */
@K8sDslMarker
fun Volume.ephemeral(init: EphemeralVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  EphemeralVolumeSource_core_v1_k8s1_19Impl(this)
    .also { ephemeral = it }
    .apply(init)
}

/** FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod. */
@K8sDslMarker
fun Volume.fc(init: FCVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  FCVolumeSource_core_v1_k8s1_19Impl(this)
    .also { fc = it }
    .apply(init)
}

/** FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin. */
@K8sDslMarker
fun Volume.flexVolume(init: FlexVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  FlexVolumeSource_core_v1_k8s1_19Impl(this)
    .also { flexVolume = it }
    .apply(init)
}

/** Flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service
being running */
@K8sDslMarker
fun Volume.flocker(init: FlockerVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  FlockerVolumeSource_core_v1_k8s1_19Impl(this)
    .also { flocker = it }
    .apply(init)
}

/** GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the
pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk */
@K8sDslMarker
fun Volume.gcePersistentDisk(init: GCEPersistentDiskVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  GCEPersistentDiskVolumeSource_core_v1_k8s1_19Impl(this)
    .also { gcePersistentDisk = it }
    .apply(init)
}

/** GitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a
container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the
EmptyDir into the Pod's container. */
@K8sDslMarker
fun Volume.gitRepo(init: GitRepoVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  GitRepoVolumeSource_core_v1_k8s1_19Impl(this)
    .also { gitRepo = it }
    .apply(init)
}

/** Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info:
https://examples.k8s.io/volumes/glusterfs/README.md */
@K8sDslMarker
fun Volume.glusterfs(init: GlusterfsVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  GlusterfsVolumeSource_core_v1_k8s1_19Impl(this)
    .also { glusterfs = it }
    .apply(init)
}

/** HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This
is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers
will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath */
@K8sDslMarker
fun Volume.hostPath(init: HostPathVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  HostPathVolumeSource_core_v1_k8s1_19Impl(this)
    .also { hostPath = it }
    .apply(init)
}

/** ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More
info: https://examples.k8s.io/volumes/iscsi/README.md */
@K8sDslMarker
fun Volume.iscsi(init: ISCSIVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  ISCSIVolumeSource_core_v1_k8s1_19Impl(this)
    .also { iscsi = it }
    .apply(init)
}

/** NFS represents an NFS mount on the host that shares a pod's lifetime More info:
https://kubernetes.io/docs/concepts/storage/volumes#nfs */
@K8sDslMarker
fun Volume.nfs(init: NFSVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  NFSVolumeSource_core_v1_k8s1_19Impl(this)
    .also { nfs = it }
    .apply(init)
}

/** PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
@K8sDslMarker
fun Volume.persistentVolumeClaim(init: PersistentVolumeClaimVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  PersistentVolumeClaimVolumeSource_core_v1_k8s1_19Impl(this)
    .also { persistentVolumeClaim = it }
    .apply(init)
}

/** PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine */
@K8sDslMarker
fun Volume.photonPersistentDisk(init: PhotonPersistentDiskVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  PhotonPersistentDiskVolumeSource_core_v1_k8s1_19Impl(this)
    .also { photonPersistentDisk = it }
    .apply(init)
}

/** PortworxVolume represents a portworx volume attached and mounted on kubelets host machine */
@K8sDslMarker
fun Volume.portworxVolume(init: PortworxVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  PortworxVolumeSource_core_v1_k8s1_19Impl(this)
    .also { portworxVolume = it }
    .apply(init)
}

/** Items for all in one resources secrets, configmaps, and downward API */
@K8sDslMarker
fun Volume.projected(init: ProjectedVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  ProjectedVolumeSource_core_v1_k8s1_19Impl(this)
    .also { projected = it }
    .apply(init)
}

/** Quobyte represents a Quobyte mount on the host that shares a pod's lifetime */
@K8sDslMarker
fun Volume.quobyte(init: QuobyteVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  QuobyteVolumeSource_core_v1_k8s1_19Impl(this)
    .also { quobyte = it }
    .apply(init)
}

/** RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info:
https://examples.k8s.io/volumes/rbd/README.md */
@K8sDslMarker
fun Volume.rbd(init: RBDVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  RBDVolumeSource_core_v1_k8s1_19Impl(this)
    .also { rbd = it }
    .apply(init)
}

/** ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes. */
@K8sDslMarker
fun Volume.scaleIO(init: ScaleIOVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  ScaleIOVolumeSource_core_v1_k8s1_19Impl(this)
    .also { scaleIO = it }
    .apply(init)
}

/** Secret represents a secret that should populate this volume. More info:
https://kubernetes.io/docs/concepts/storage/volumes#secret */
@K8sDslMarker
fun Volume.secret(init: SecretVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  SecretVolumeSource_core_v1_k8s1_19Impl(this)
    .also { secret = it }
    .apply(init)
}

/** StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes. */
@K8sDslMarker
fun Volume.storageos(init: StorageOSVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  StorageOSVolumeSource_core_v1_k8s1_19Impl(this)
    .also { storageos = it }
    .apply(init)
}

/** VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine */
@K8sDslMarker
fun Volume.vsphereVolume(init: VsphereVirtualDiskVolumeSource.() -> Unit) {
  this as Volume_core_v1_k8s1_19Impl
  VsphereVirtualDiskVolumeSource_core_v1_k8s1_19Impl(this)
    .also { vsphereVolume = it }
    .apply(init)
}

/** `service` is a reference to the service for this webhook. Either `service` or `url` must be specified. If the webhook is
running within the cluster, then you should use `service`. */
@K8sDslMarker
fun WebhookClientConfig.service(init: ServiceReference.() -> Unit) {
  this as WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_19Impl
  ServiceReference_admissionregistration_k8s_io_v1_k8s1_19Impl(this)
    .also { service = it }
    .apply(init)
}

/** service is a reference to the service for this webhook. Either service or url must be specified. If the webhook is
running within the cluster, then you should use `service`. */
@K8sDslMarker
fun WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_19.service(init: ServiceReference_apiextensions_k8s_io_v1_k8s1_19.() -> Unit) {
  this as WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_19Impl
  ServiceReference_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { service = it }
    .apply(init)
}

/** clientConfig is the instructions for how to call the webhook if strategy is `Webhook`. */
@K8sDslMarker
fun WebhookConversion.clientConfig(init: WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_19.() -> Unit) {
  this as WebhookConversion_apiextensions_k8s_io_v1_k8s1_19Impl
  WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { clientConfig = it }
    .apply(init)
}

/** Required. A pod affinity term, associated with the corresponding weight. */
@K8sDslMarker
fun WeightedPodAffinityTerm.podAffinityTerm(init: PodAffinityTerm.() -> Unit) {
  this as WeightedPodAffinityTerm_core_v1_k8s1_19Impl
  PodAffinityTerm_core_v1_k8s1_19Impl(this)
    .also { podAffinityTerm = it }
    .apply(init)
}

/** Service is a reference to the service for this API server. It must communicate on port 443. If the Service is nil, that
means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the
normal handler chain to be fulfilled. */
@K8sDslMarker
fun Apiservicespec.service(init: ServiceReference_apiregistration_k8s_io_v1_k8s1_19.() -> Unit) {
  this as Apiservicespec_apiregistration_k8s_io_v1_k8s1_19Impl
  ServiceReference_apiregistration_k8s_io_v1_k8s1_19Impl(this)
    .also { service = it }
    .apply(init)
}

/** Current service state of apiService. */
@K8sDslMarker
fun Apiservicestatus.conditions(init: APIServiceCondition.() -> Unit) {
  this as Apiservicestatus_apiregistration_k8s_io_v1_k8s1_19Impl
  APIServiceCondition_apiregistration_k8s_io_v1_k8s1_19Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** conditions applied to the request. Known conditions are "Approved", "Denied", and "Failed". */
@K8sDslMarker
fun Certificatesigningrequeststatus.conditions(init: CertificateSigningRequestCondition.() -> Unit) {
  this as Certificatesigningrequeststatus_certificates_k8s_io_v1_k8s1_19Impl
  CertificateSigningRequestCondition_certificates_k8s_io_v1_k8s1_19Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Details about the container's last termination condition. */
@K8sDslMarker
fun Containerstatus.lastState(init: ContainerState.() -> Unit) {
  this as Containerstatus_core_v1_k8s1_19Impl
  ContainerState_core_v1_k8s1_19Impl(this)
    .also { lastState = it }
    .apply(init)
}

/** Details about the container's current condition. */
@K8sDslMarker
fun Containerstatus.state(init: ContainerState.() -> Unit) {
  this as Containerstatus_core_v1_k8s1_19Impl
  ContainerState_core_v1_k8s1_19Impl(this)
    .also { state = it }
    .apply(init)
}

/** Specifies the job that will be created when executing a CronJob. */
@K8sDslMarker
fun Cronjobspec.jobTemplate(init: JobTemplateSpec.() -> Unit) {
  this as Cronjobspec_batch_v1beta1_k8s1_19Impl
  JobTemplateSpec_batch_v1beta1_k8s1_19Impl(this)
    .also { jobTemplate = it }
    .apply(init)
}

/** A list of pointers to currently running jobs. */
@K8sDslMarker
fun Cronjobstatus.active(init: ObjectReference.() -> Unit) {
  this as Cronjobstatus_batch_v1beta1_k8s1_19Impl
  ObjectReference_core_v1_k8s1_19Impl(this)
    .also { active = active?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Information when was the last time the job was successfully scheduled. */
@K8sDslMarker
fun Cronjobstatus.lastScheduleTime(init: Time.() -> Unit) {
  this as Cronjobstatus_batch_v1beta1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastScheduleTime = it }
    .apply(init)
}

/** drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this
can become empty. */
@K8sDslMarker
fun Csinodespec.drivers(init: CSINodeDriver.() -> Unit) {
  this as Csinodespec_storage_k8s_io_v1_k8s1_19Impl
  CSINodeDriver_storage_k8s_io_v1_k8s1_19Impl(this)
    .also { drivers = drivers?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** conversion defines conversion settings for the CRD. */
@K8sDslMarker
fun Customresourcedefinitionspec.conversion(init: CustomResourceConversion.() -> Unit) {
  this as Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_19Impl
  CustomResourceConversion_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { conversion = it }
    .apply(init)
}

/** names specify the resource and kind names for the custom resource. */
@K8sDslMarker
fun Customresourcedefinitionspec.names(init: CustomResourceDefinitionNames.() -> Unit) {
  this as Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_19Impl
  CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { names = it }
    .apply(init)
}

/** versions is the list of all API versions of the defined custom resource. Version names are used to compute the order in
which served versions are listed in API discovery. If the version string is "kube-like", it will sort above non
"kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are
followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor
version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and
then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2,
v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10. */
@K8sDslMarker
fun Customresourcedefinitionspec.versions(init: CustomResourceDefinitionVersion.() -> Unit) {
  this as Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_19Impl
  CustomResourceDefinitionVersion_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { versions = versions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in
spec. */
@K8sDslMarker
fun Customresourcedefinitionstatus.acceptedNames(init: CustomResourceDefinitionNames.() -> Unit) {
  this as Customresourcedefinitionstatus_apiextensions_k8s_io_v1_k8s1_19Impl
  CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { acceptedNames = it }
    .apply(init)
}

/** conditions indicate state for particular aspects of a CustomResourceDefinition */
@K8sDslMarker
fun Customresourcedefinitionstatus.conditions(init: CustomResourceDefinitionCondition.() -> Unit) {
  this as Customresourcedefinitionstatus_apiextensions_k8s_io_v1_k8s1_19Impl
  CustomResourceDefinitionCondition_apiextensions_k8s_io_v1_k8s1_19Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod
template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
@K8sDslMarker
fun Daemonsetspec.selector(init: LabelSelector.() -> Unit) {
  this as Daemonsetspec_apps_v1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { selector = it }
    .apply(init)
}

/** An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every
node that matches the template's node selector (or on every node if no node selector is specified). More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
@K8sDslMarker
fun Daemonsetspec.template(init: Podtemplatespec.() -> Unit) {
  this as Daemonsetspec_apps_v1_k8s1_19Impl
  Podtemplatespec_core_v1_k8s1_19Impl(this)
    .also { template = it }
    .apply(init)
}

/** An update strategy to replace existing DaemonSet pods with new pods. */
@K8sDslMarker
fun Daemonsetspec.updateStrategy(init: DaemonSetUpdateStrategy.() -> Unit) {
  this as Daemonsetspec_apps_v1_k8s1_19Impl
  DaemonSetUpdateStrategy_apps_v1_k8s1_19Impl(this)
    .also { updateStrategy = it }
    .apply(init)
}

/** Represents the latest available observations of a DaemonSet's current state. */
@K8sDslMarker
fun Daemonsetstatus.conditions(init: DaemonSetCondition.() -> Unit) {
  this as Daemonsetstatus_apps_v1_k8s1_19Impl
  DaemonSetCondition_apps_v1_k8s1_19Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this
deployment. It must match the pod template's labels. */
@K8sDslMarker
fun Deploymentspec.selector(init: LabelSelector.() -> Unit) {
  this as Deploymentspec_apps_v1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { selector = it }
    .apply(init)
}

/** The deployment strategy to use to replace existing pods with new ones. */
@K8sDslMarker
fun Deploymentspec.strategy(init: Deploymentstrategy.() -> Unit) {
  this as Deploymentspec_apps_v1_k8s1_19Impl
  Deploymentstrategy_apps_v1_k8s1_19Impl(this)
    .also { strategy = it }
    .apply(init)
}

/** Template describes the pods that will be created. */
@K8sDslMarker
fun Deploymentspec.template(init: Podtemplatespec.() -> Unit) {
  this as Deploymentspec_apps_v1_k8s1_19Impl
  Podtemplatespec_core_v1_k8s1_19Impl(this)
    .also { template = it }
    .apply(init)
}

/** Represents the latest available observations of a deployment's current state. */
@K8sDslMarker
fun Deploymentstatus.conditions(init: DeploymentCondition.() -> Unit) {
  this as Deploymentstatus_apps_v1_k8s1_19Impl
  DeploymentCondition_apps_v1_k8s1_19Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate. */
@K8sDslMarker
fun Deploymentstrategy.rollingUpdate(init: Rollingupdatedeployment.() -> Unit) {
  this as Deploymentstrategy_apps_v1_k8s1_19Impl
  Rollingupdatedeployment_apps_v1_k8s1_19Impl(this)
    .also { rollingUpdate = it }
    .apply(init)
}

/** `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies
that the distinguisher is disabled and thus will always be the empty string. */
@K8sDslMarker
fun Flowschemaspec.distinguisherMethod(init: FlowDistinguisherMethod.() -> Unit) {
  this as Flowschemaspec_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { distinguisherMethod = it }
    .apply(init)
}

/** `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be
resolved, the FlowSchema will be ignored and marked as invalid in its status. Required. */
@K8sDslMarker
fun Flowschemaspec.priorityLevelConfiguration(init: PriorityLevelConfigurationReference.() -> Unit) {
  this as Flowschemaspec_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  PriorityLevelConfigurationReference_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { priorityLevelConfiguration = it }
    .apply(init)
}

/** `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least
one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema. */
@K8sDslMarker
fun Flowschemaspec.rules(init: PolicyRulesWithSubjects.() -> Unit) {
  this as Flowschemaspec_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { rules = rules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** `conditions` is a list of the current states of FlowSchema. */
@K8sDslMarker
fun Flowschemastatus.conditions(init: FlowSchemaCondition.() -> Unit) {
  this as Flowschemastatus_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** reference to scaled resource; horizontal pod autoscaler will learn the current resource consumption and will set the
desired number of pods by using its Scale subresource. */
@K8sDslMarker
fun Horizontalpodautoscalerspec.scaleTargetRef(init: CrossVersionObjectReference.() -> Unit) {
  this as Horizontalpodautoscalerspec_autoscaling_v1_k8s1_19Impl
  CrossVersionObjectReference_autoscaling_v1_k8s1_19Impl(this)
    .also { scaleTargetRef = it }
    .apply(init)
}

/** last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number
of pods is changed. */
@K8sDslMarker
fun Horizontalpodautoscalerstatus.lastScaleTime(init: Time.() -> Unit) {
  this as Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { lastScaleTime = it }
    .apply(init)
}

/** Parameters is a link to a custom resource containing additional configuration for the controller. This is optional if
the controller does not require extra parameters. */
@K8sDslMarker
fun Ingressclassspec.parameters(init: TypedLocalObjectReference.() -> Unit) {
  this as Ingressclassspec_networking_k8s_io_v1_k8s1_19Impl
  TypedLocalObjectReference_core_v1_k8s1_19Impl(this)
    .also { parameters = it }
    .apply(init)
}

/** DefaultBackend is the backend that should handle requests that don't match any rule. If Rules are not specified,
DefaultBackend must be specified. If DefaultBackend is not set, the handling of requests that do not match any of the
rules will be up to the Ingress controller. */
@K8sDslMarker
fun Ingressspec.defaultBackend(init: IngressBackend.() -> Unit) {
  this as Ingressspec_networking_k8s_io_v1_k8s1_19Impl
  IngressBackend_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { defaultBackend = it }
    .apply(init)
}

/** A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the
default backend. */
@K8sDslMarker
fun Ingressspec.rules(init: IngressRule.() -> Unit) {
  this as Ingressspec_networking_k8s_io_v1_k8s1_19Impl
  IngressRule_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { rules = rules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify
different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS
extension, if the ingress controller fulfilling the ingress supports SNI. */
@K8sDslMarker
fun Ingressspec.tls(init: IngressTLS.() -> Unit) {
  this as Ingressspec_networking_k8s_io_v1_k8s1_19Impl
  IngressTLS_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { tls = tls?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** LoadBalancer contains the current status of the load-balancer. */
@K8sDslMarker
fun Ingressstatus.loadBalancer(init: LoadBalancerStatus.() -> Unit) {
  this as Ingressstatus_networking_k8s_io_v1_k8s1_19Impl
  LoadBalancerStatus_core_v1_k8s1_19Impl(this)
    .also { loadBalancer = it }
    .apply(init)
}

/** A label query over pods that should match the pod count. Normally, the system sets this field for you. More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
@K8sDslMarker
fun Jobspec.selector(init: LabelSelector.() -> Unit) {
  this as Jobspec_batch_v1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { selector = it }
    .apply(init)
}

/** Describes the pod that will be created when executing a job. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ */
@K8sDslMarker
fun Jobspec.template(init: Podtemplatespec.() -> Unit) {
  this as Jobspec_batch_v1_k8s1_19Impl
  Podtemplatespec_core_v1_k8s1_19Impl(this)
    .also { template = it }
    .apply(init)
}

/** Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate
operations. It is represented in RFC3339 form and is in UTC. */
@K8sDslMarker
fun Jobstatus.completionTime(init: Time.() -> Unit) {
  this as Jobstatus_batch_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { completionTime = it }
    .apply(init)
}

/** The latest available observations of an object's current state. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ */
@K8sDslMarker
fun Jobstatus.conditions(init: JobCondition.() -> Unit) {
  this as Jobstatus_batch_v1_k8s1_19Impl
  JobCondition_batch_v1_k8s1_19Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before
order across separate operations. It is represented in RFC3339 form and is in UTC. */
@K8sDslMarker
fun Jobstatus.startTime(init: Time.() -> Unit) {
  this as Jobstatus_batch_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { startTime = it }
    .apply(init)
}

/** acquireTime is a time when the current lease was acquired. */
@K8sDslMarker
fun Leasespec.acquireTime(init: MicroTime.() -> Unit) {
  this as Leasespec_coordination_k8s_io_v1_k8s1_19Impl
  MicroTime_meta_v1_k8s1_19Impl(this)
    .also { acquireTime = it }
    .apply(init)
}

/** renewTime is a time when the current holder of a lease has last updated the lease. */
@K8sDslMarker
fun Leasespec.renewTime(init: MicroTime.() -> Unit) {
  this as Leasespec_coordination_k8s_io_v1_k8s1_19Impl
  MicroTime_meta_v1_k8s1_19Impl(this)
    .also { renewTime = it }
    .apply(init)
}

/** Limits is the list of LimitRangeItem objects that are enforced. */
@K8sDslMarker
fun Limitrangespec.limits(init: LimitRangeItem.() -> Unit) {
  this as Limitrangespec_core_v1_k8s1_19Impl
  LimitRangeItem_core_v1_k8s1_19Impl(this)
    .also { limits = limits?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Represents the latest available observations of a namespace's current state. */
@K8sDslMarker
fun Namespacestatus.conditions(init: NamespaceCondition.() -> Unit) {
  this as Namespacestatus_core_v1_k8s1_19Impl
  NamespaceCondition_core_v1_k8s1_19Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of egress rules to be applied to the selected pods. Outgoing traffic is allowed if there are no NetworkPolicies
selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule
across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this
NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by
default). This field is beta-level in 1.8 */
@K8sDslMarker
fun Networkpolicyspec.egress(init: NetworkPolicyEgressRule.() -> Unit) {
  this as Networkpolicyspec_networking_k8s_io_v1_k8s1_19Impl
  NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { egress = egress?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if there are no NetworkPolicies
selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic source is the pod's local node,
OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches
the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the
pods it selects are isolated by default) */
@K8sDslMarker
fun Networkpolicyspec.ingress(init: NetworkPolicyIngressRule.() -> Unit) {
  this as Networkpolicyspec_networking_k8s_io_v1_k8s1_19Impl
  NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_19Impl(this)
    .also { ingress = ingress?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Selects the pods to which this NetworkPolicy object applies. The array of ingress rules is applied to any pods selected
by this field. Multiple network policies can select the same set of pods. In this case, the ingress rules for each are
combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector
matches all pods in this namespace. */
@K8sDslMarker
fun Networkpolicyspec.podSelector(init: LabelSelector.() -> Unit) {
  this as Networkpolicyspec_networking_k8s_io_v1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { podSelector = it }
    .apply(init)
}

/** If specified, the source to get node configuration from The DynamicKubeletConfig feature gate must be enabled for the
Kubelet to use this field */
@K8sDslMarker
fun Nodespec.configSource(init: NodeConfigSource.() -> Unit) {
  this as Nodespec_core_v1_k8s1_19Impl
  NodeConfigSource_core_v1_k8s1_19Impl(this)
    .also { configSource = it }
    .apply(init)
}

/** If specified, the node's taints. */
@K8sDslMarker
fun Nodespec.taints(init: Taint.() -> Unit) {
  this as Nodespec_core_v1_k8s1_19Impl
  Taint_core_v1_k8s1_19Impl(this)
    .also { taints = taints?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of addresses reachable to the node. Queried from cloud provider, if available. More info:
https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key
is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a
full-replacement patch. See http://pr.k8s.io/79391 for an example. */
@K8sDslMarker
fun Nodestatus.addresses(init: NodeAddress.() -> Unit) {
  this as Nodestatus_core_v1_k8s1_19Impl
  NodeAddress_core_v1_k8s1_19Impl(this)
    .also { addresses = addresses?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Conditions is an array of current observed node conditions. More info:
https://kubernetes.io/docs/concepts/nodes/node/#condition */
@K8sDslMarker
fun Nodestatus.conditions(init: NodeCondition.() -> Unit) {
  this as Nodestatus_core_v1_k8s1_19Impl
  NodeCondition_core_v1_k8s1_19Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Status of the config assigned to the node via the dynamic Kubelet config feature. */
@K8sDslMarker
fun Nodestatus.config(init: NodeConfigStatus.() -> Unit) {
  this as Nodestatus_core_v1_k8s1_19Impl
  NodeConfigStatus_core_v1_k8s1_19Impl(this)
    .also { config = it }
    .apply(init)
}

/** Endpoints of daemons running on the Node. */
@K8sDslMarker
fun Nodestatus.daemonEndpoints(init: NodeDaemonEndpoints.() -> Unit) {
  this as Nodestatus_core_v1_k8s1_19Impl
  NodeDaemonEndpoints_core_v1_k8s1_19Impl(this)
    .also { daemonEndpoints = it }
    .apply(init)
}

/** List of container images on this node */
@K8sDslMarker
fun Nodestatus.images(init: ContainerImage.() -> Unit) {
  this as Nodestatus_core_v1_k8s1_19Impl
  ContainerImage_core_v1_k8s1_19Impl(this)
    .also { images = images?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info */
@K8sDslMarker
fun Nodestatus.nodeInfo(init: NodeSystemInfo.() -> Unit) {
  this as Nodestatus_core_v1_k8s1_19Impl
  NodeSystemInfo_core_v1_k8s1_19Impl(this)
    .also { nodeInfo = it }
    .apply(init)
}

/** List of volumes that are attached to the node. */
@K8sDslMarker
fun Nodestatus.volumesAttached(init: AttachedVolume.() -> Unit) {
  this as Nodestatus_core_v1_k8s1_19Impl
  AttachedVolume_core_v1_k8s1_19Impl(this)
    .also { volumesAttached = volumesAttached?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** This field can be used to specify either: `*` An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot
- Beta) `*` An existing PVC (PersistentVolumeClaim) `*` An existing custom resource/object that implements data
population (Alpha) In order to use VolumeSnapshot object types, the appropriate feature gate must be enabled
(VolumeSnapshotDataSource or AnyVolumeDataSource) If the provisioner or an external controller can support the specified
data source, it will create a new volume based on the contents of the specified data source. If the specified data
source is not supported, the volume will not be created and the failure will be reported as an event. In the future, we
plan to support more data source types and the behavior of the provisioner may change. */
@K8sDslMarker
fun Persistentvolumeclaimspec.dataSource(init: TypedLocalObjectReference.() -> Unit) {
  this as Persistentvolumeclaimspec_core_v1_k8s1_19Impl
  TypedLocalObjectReference_core_v1_k8s1_19Impl(this)
    .also { dataSource = it }
    .apply(init)
}

/** Resources represents the minimum resources the volume should have. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources */
@K8sDslMarker
fun Persistentvolumeclaimspec.resources(init: ResourceRequirements.() -> Unit) {
  this as Persistentvolumeclaimspec_core_v1_k8s1_19Impl
  ResourceRequirements_core_v1_k8s1_19Impl(this)
    .also { resources = it }
    .apply(init)
}

/** A label query over volumes to consider for binding. */
@K8sDslMarker
fun Persistentvolumeclaimspec.selector(init: LabelSelector.() -> Unit) {
  this as Persistentvolumeclaimspec_core_v1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { selector = it }
    .apply(init)
}

/** Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will
be set to 'ResizeStarted'. */
@K8sDslMarker
fun Persistentvolumeclaimstatus.conditions(init: PersistentVolumeClaimCondition.() -> Unit) {
  this as Persistentvolumeclaimstatus_core_v1_k8s1_19Impl
  PersistentVolumeClaimCondition_core_v1_k8s1_19Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to
the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
@K8sDslMarker
fun Persistentvolumespec.awsElasticBlockStore(init: AWSElasticBlockStoreVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  AWSElasticBlockStoreVolumeSource_core_v1_k8s1_19Impl(this)
    .also { awsElasticBlockStore = it }
    .apply(init)
}

/** AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod. */
@K8sDslMarker
fun Persistentvolumespec.azureDisk(init: AzureDiskVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  AzureDiskVolumeSource_core_v1_k8s1_19Impl(this)
    .also { azureDisk = it }
    .apply(init)
}

/** AzureFile represents an Azure File Service mount on the host and bind mount to the pod. */
@K8sDslMarker
fun Persistentvolumespec.azureFile(init: AzureFilePersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  AzureFilePersistentVolumeSource_core_v1_k8s1_19Impl(this)
    .also { azureFile = it }
    .apply(init)
}

/** A description of the persistent volume's resources and capacity. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity */
@K8sDslMarker
fun Persistentvolumespec.capacity(init: de.loosetie.k8s.dsl.types.Capacity.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.Capacity(this)
    .also { capacity = it }
    .apply(init)
}

/** CephFS represents a Ceph FS mount on the host that shares a pod's lifetime */
@K8sDslMarker
fun Persistentvolumespec.cephfs(init: CephFSPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  CephFSPersistentVolumeSource_core_v1_k8s1_19Impl(this)
    .also { cephfs = it }
    .apply(init)
}

/** Cinder represents a cinder volume attached and mounted on kubelets host machine. More info:
https://examples.k8s.io/mysql-cinder-pd/README.md */
@K8sDslMarker
fun Persistentvolumespec.cinder(init: CinderPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  CinderPersistentVolumeSource_core_v1_k8s1_19Impl(this)
    .also { cinder = it }
    .apply(init)
}

/** ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil
when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding */
@K8sDslMarker
fun Persistentvolumespec.claimRef(init: ObjectReference.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  ObjectReference_core_v1_k8s1_19Impl(this)
    .also { claimRef = it }
    .apply(init)
}

/** CSI represents storage that is handled by an external CSI driver (Beta feature). */
@K8sDslMarker
fun Persistentvolumespec.csi(init: CSIPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  CSIPersistentVolumeSource_core_v1_k8s1_19Impl(this)
    .also { csi = it }
    .apply(init)
}

/** FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod. */
@K8sDslMarker
fun Persistentvolumespec.fc(init: FCVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  FCVolumeSource_core_v1_k8s1_19Impl(this)
    .also { fc = it }
    .apply(init)
}

/** FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin. */
@K8sDslMarker
fun Persistentvolumespec.flexVolume(init: FlexPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  FlexPersistentVolumeSource_core_v1_k8s1_19Impl(this)
    .also { flexVolume = it }
    .apply(init)
}

/** Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage. This
depends on the Flocker control service being running */
@K8sDslMarker
fun Persistentvolumespec.flocker(init: FlockerVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  FlockerVolumeSource_core_v1_k8s1_19Impl(this)
    .also { flocker = it }
    .apply(init)
}

/** GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the
pod. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk */
@K8sDslMarker
fun Persistentvolumespec.gcePersistentDisk(init: GCEPersistentDiskVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  GCEPersistentDiskVolumeSource_core_v1_k8s1_19Impl(this)
    .also { gcePersistentDisk = it }
    .apply(init)
}

/** Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More
info: https://examples.k8s.io/volumes/glusterfs/README.md */
@K8sDslMarker
fun Persistentvolumespec.glusterfs(init: GlusterfsPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  GlusterfsPersistentVolumeSource_core_v1_k8s1_19Impl(this)
    .also { glusterfs = it }
    .apply(init)
}

/** HostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node
development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster.
More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath */
@K8sDslMarker
fun Persistentvolumespec.hostPath(init: HostPathVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  HostPathVolumeSource_core_v1_k8s1_19Impl(this)
    .also { hostPath = it }
    .apply(init)
}

/** ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
Provisioned by an admin. */
@K8sDslMarker
fun Persistentvolumespec.iscsi(init: ISCSIPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  ISCSIPersistentVolumeSource_core_v1_k8s1_19Impl(this)
    .also { iscsi = it }
    .apply(init)
}

/** Local represents directly-attached storage with node affinity */
@K8sDslMarker
fun Persistentvolumespec.local(init: LocalVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  LocalVolumeSource_core_v1_k8s1_19Impl(this)
    .also { local = it }
    .apply(init)
}

/** NFS represents an NFS mount on the host. Provisioned by an admin. More info:
https://kubernetes.io/docs/concepts/storage/volumes#nfs */
@K8sDslMarker
fun Persistentvolumespec.nfs(init: NFSVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  NFSVolumeSource_core_v1_k8s1_19Impl(this)
    .also { nfs = it }
    .apply(init)
}

/** NodeAffinity defines constraints that limit what nodes this volume can be accessed from. This field influences the
scheduling of pods that use this volume. */
@K8sDslMarker
fun Persistentvolumespec.nodeAffinity(init: VolumeNodeAffinity.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  VolumeNodeAffinity_core_v1_k8s1_19Impl(this)
    .also { nodeAffinity = it }
    .apply(init)
}

/** PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine */
@K8sDslMarker
fun Persistentvolumespec.photonPersistentDisk(init: PhotonPersistentDiskVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  PhotonPersistentDiskVolumeSource_core_v1_k8s1_19Impl(this)
    .also { photonPersistentDisk = it }
    .apply(init)
}

/** PortworxVolume represents a portworx volume attached and mounted on kubelets host machine */
@K8sDslMarker
fun Persistentvolumespec.portworxVolume(init: PortworxVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  PortworxVolumeSource_core_v1_k8s1_19Impl(this)
    .also { portworxVolume = it }
    .apply(init)
}

/** Quobyte represents a Quobyte mount on the host that shares a pod's lifetime */
@K8sDslMarker
fun Persistentvolumespec.quobyte(init: QuobyteVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  QuobyteVolumeSource_core_v1_k8s1_19Impl(this)
    .also { quobyte = it }
    .apply(init)
}

/** RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info:
https://examples.k8s.io/volumes/rbd/README.md */
@K8sDslMarker
fun Persistentvolumespec.rbd(init: RBDPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  RBDPersistentVolumeSource_core_v1_k8s1_19Impl(this)
    .also { rbd = it }
    .apply(init)
}

/** ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes. */
@K8sDslMarker
fun Persistentvolumespec.scaleIO(init: ScaleIOPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  ScaleIOPersistentVolumeSource_core_v1_k8s1_19Impl(this)
    .also { scaleIO = it }
    .apply(init)
}

/** StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More
info: https://examples.k8s.io/volumes/storageos/README.md */
@K8sDslMarker
fun Persistentvolumespec.storageos(init: StorageOSPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  StorageOSPersistentVolumeSource_core_v1_k8s1_19Impl(this)
    .also { storageos = it }
    .apply(init)
}

/** VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine */
@K8sDslMarker
fun Persistentvolumespec.vsphereVolume(init: VsphereVirtualDiskVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1_k8s1_19Impl
  VsphereVirtualDiskVolumeSource_core_v1_k8s1_19Impl(this)
    .also { vsphereVolume = it }
    .apply(init)
}

/** Label query over pods whose evictions are managed by the disruption budget. */
@K8sDslMarker
fun Poddisruptionbudgetspec.selector(init: LabelSelector.() -> Unit) {
  this as Poddisruptionbudgetspec_policy_v1beta1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { selector = it }
    .apply(init)
}

/** An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e.
even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a
mutually exclusive setting with "minAvailable".

			When you specify an integer, it represents a number of Pods. When
you specify a percentage by setting the value to a string representation of a percentage (eg. "50%"), it represents a
percentage of total Pods. */
@K8sDslMarker
fun Poddisruptionbudgetspec.maxUnavailable(percentage: String) {
  this as Poddisruptionbudgetspec_policy_v1beta1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrPercentage(percentage)
    .also { maxUnavailable = it }
}

/** An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e.
even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a
mutually exclusive setting with "minAvailable".

			When you specify an integer, it represents a number of Pods. When
you specify a percentage by setting the value to a string representation of a percentage (eg. "50%"), it represents a
percentage of total Pods. */
@K8sDslMarker
fun Poddisruptionbudgetspec.maxUnavailable(int: Int) {
  this as Poddisruptionbudgetspec_policy_v1beta1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrPercentage(int)
    .also { maxUnavailable = it }
}

/** An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the
eviction, i.e. even in the absence of the evicted pod. So for example you can prevent all voluntary evictions by
specifying "100%".

			When you specify an integer, it represents a number of Pods. When you specify a percentage by
setting the value to a string representation of a percentage (eg. "50%"), it represents a percentage of total Pods. */
@K8sDslMarker
fun Poddisruptionbudgetspec.minAvailable(percentage: String) {
  this as Poddisruptionbudgetspec_policy_v1beta1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrPercentage(percentage)
    .also { minAvailable = it }
}

/** An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the
eviction, i.e. even in the absence of the evicted pod. So for example you can prevent all voluntary evictions by
specifying "100%".

			When you specify an integer, it represents a number of Pods. When you specify a percentage by
setting the value to a string representation of a percentage (eg. "50%"), it represents a percentage of total Pods. */
@K8sDslMarker
fun Poddisruptionbudgetspec.minAvailable(int: Int) {
  this as Poddisruptionbudgetspec_policy_v1beta1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrPercentage(int)
    .also { minAvailable = it }
}

/** Env defines the collection of EnvVar to inject into containers. */
@K8sDslMarker
fun Podpresetspec.env(init: EnvVar.() -> Unit) {
  this as Podpresetspec_settings_k8s_io_v1alpha1_k8s1_19Impl
  EnvVar_core_v1_k8s1_19Impl(this)
    .also { env = env?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** EnvFrom defines the collection of EnvFromSource to inject into containers. */
@K8sDslMarker
fun Podpresetspec.envFrom(init: EnvFromSource.() -> Unit) {
  this as Podpresetspec_settings_k8s_io_v1alpha1_k8s1_19Impl
  EnvFromSource_core_v1_k8s1_19Impl(this)
    .also { envFrom = envFrom?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Selector is a label query over a set of resources, in this case pods. Required. */
@K8sDslMarker
fun Podpresetspec.selector(init: LabelSelector.() -> Unit) {
  this as Podpresetspec_settings_k8s_io_v1alpha1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { selector = it }
    .apply(init)
}

/** VolumeMounts defines the collection of VolumeMount to inject into containers. */
@K8sDslMarker
fun Podpresetspec.volumeMounts(init: VolumeMount.() -> Unit) {
  this as Podpresetspec_settings_k8s_io_v1alpha1_k8s1_19Impl
  VolumeMount_core_v1_k8s1_19Impl(this)
    .also { volumeMounts = volumeMounts?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Volumes defines the collection of Volume to inject into the pod. */
@K8sDslMarker
fun Podpresetspec.volumes(init: Volume.() -> Unit) {
  this as Podpresetspec_settings_k8s_io_v1alpha1_k8s1_19Impl
  Volume_core_v1_k8s1_19Impl(this)
    .also { volumes = volumes?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** AllowedCSIDrivers is an allowlist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An
empty value indicates that any CSI driver can be used for inline ephemeral volumes. This is a beta field, and is only
honored if the API server enables the CSIInlineVolume feature gate. */
@K8sDslMarker
fun Podsecuritypolicyspec.allowedCSIDrivers(init: AllowedCSIDriver.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1_k8s1_19Impl
  AllowedCSIDriver_policy_v1beta1_k8s1_19Impl(this)
    .also { allowedCSIDrivers = allowedCSIDrivers?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** allowedFlexVolumes is an allowlist of Flexvolumes. Empty or nil indicates that all Flexvolumes may be used. This
parameter is effective only when the usage of the Flexvolumes is allowed in the "volumes" field. */
@K8sDslMarker
fun Podsecuritypolicyspec.allowedFlexVolumes(init: AllowedFlexVolume.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1_k8s1_19Impl
  AllowedFlexVolume_policy_v1beta1_k8s1_19Impl(this)
    .also { allowedFlexVolumes = allowedFlexVolumes?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** allowedHostPaths is an allowlist of host paths. Empty indicates that all host paths may be used. */
@K8sDslMarker
fun Podsecuritypolicyspec.allowedHostPaths(init: AllowedHostPath.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1_k8s1_19Impl
  AllowedHostPath_policy_v1beta1_k8s1_19Impl(this)
    .also { allowedHostPaths = allowedHostPaths?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** fsGroup is the strategy that will dictate what fs group is used by the SecurityContext. */
@K8sDslMarker
fun Podsecuritypolicyspec.fsGroup(init: FSGroupStrategyOptions.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1_k8s1_19Impl
  FSGroupStrategyOptions_policy_v1beta1_k8s1_19Impl(this)
    .also { fsGroup = it }
    .apply(init)
}

/** hostPorts determines which host port ranges are allowed to be exposed. */
@K8sDslMarker
fun Podsecuritypolicyspec.hostPorts(init: HostPortRange.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1_k8s1_19Impl
  HostPortRange_policy_v1beta1_k8s1_19Impl(this)
    .also { hostPorts = hostPorts?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set. If this field is omitted,
the pod's RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled. */
@K8sDslMarker
fun Podsecuritypolicyspec.runAsGroup(init: RunAsGroupStrategyOptions.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1_k8s1_19Impl
  RunAsGroupStrategyOptions_policy_v1beta1_k8s1_19Impl(this)
    .also { runAsGroup = it }
    .apply(init)
}

/** runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set. */
@K8sDslMarker
fun Podsecuritypolicyspec.runAsUser(init: RunAsUserStrategyOptions.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1_k8s1_19Impl
  RunAsUserStrategyOptions_policy_v1beta1_k8s1_19Impl(this)
    .also { runAsUser = it }
    .apply(init)
}

/** runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod. If this field is omitted, the
pod's runtimeClassName field is unrestricted. Enforcement of this field depends on the RuntimeClass feature gate being
enabled. */
@K8sDslMarker
fun Podsecuritypolicyspec.runtimeClass(init: RuntimeClassStrategyOptions.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1_k8s1_19Impl
  RuntimeClassStrategyOptions_policy_v1beta1_k8s1_19Impl(this)
    .also { runtimeClass = it }
    .apply(init)
}

/** seLinux is the strategy that will dictate the allowable labels that may be set. */
@K8sDslMarker
fun Podsecuritypolicyspec.seLinux(init: SELinuxStrategyOptions.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1_k8s1_19Impl
  SELinuxStrategyOptions_policy_v1beta1_k8s1_19Impl(this)
    .also { seLinux = it }
    .apply(init)
}

/** supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext. */
@K8sDslMarker
fun Podsecuritypolicyspec.supplementalGroups(init: SupplementalGroupsStrategyOptions.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1_k8s1_19Impl
  SupplementalGroupsStrategyOptions_policy_v1beta1_k8s1_19Impl(this)
    .also { supplementalGroups = it }
    .apply(init)
}

/** If specified, the pod's scheduling constraints */
@K8sDslMarker
fun Podspec.affinity(init: Affinity.() -> Unit) {
  this as Podspec_core_v1_k8s1_19Impl
  Affinity_core_v1_k8s1_19Impl(this)
    .also { affinity = it }
    .apply(init)
}

/** List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one
container in a Pod. Cannot be updated. */
@K8sDslMarker
fun Podspec.containers(init: Container.() -> Unit) {
  this as Podspec_core_v1_k8s1_19Impl
  Container_core_v1_k8s1_19Impl(this)
    .also { containers = containers?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based
on DNSPolicy. */
@K8sDslMarker
fun Podspec.dnsConfig(init: PodDNSConfig.() -> Unit) {
  this as Podspec_core_v1_k8s1_19Impl
  PodDNSConfig_core_v1_k8s1_19Impl(this)
    .also { dnsConfig = it }
    .apply(init)
}

/** List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform
user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified
by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers
subresource. This field is alpha-level and is only honored by servers that enable the EphemeralContainers feature. */
@K8sDslMarker
fun Podspec.ephemeralContainers(init: EphemeralContainer.() -> Unit) {
  this as Podspec_core_v1_k8s1_19Impl
  EphemeralContainer_core_v1_k8s1_19Impl(this)
    .also { ephemeralContainers = ephemeralContainers?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is
only valid for non-hostNetwork pods. */
@K8sDslMarker
fun Podspec.hostAliases(init: HostAlias.() -> Unit) {
  this as Podspec_core_v1_k8s1_19Impl
  HostAlias_core_v1_k8s1_19Impl(this)
    .also { hostAliases = hostAliases?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images
used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use.
For example, in the case of docker, only DockerConfig type secrets are honored. More info:
https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod */
@K8sDslMarker
fun Podspec.imagePullSecrets(init: LocalObjectReference.() -> Unit) {
  this as Podspec_core_v1_k8s1_19Impl
  LocalObjectReference_core_v1_k8s1_19Impl(this)
    .also { imagePullSecrets = imagePullSecrets?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being
started. If any init container fails, the pod is considered to have failed and is handled according to its
restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers
may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an
init container are taken into account during scheduling by finding the highest request/limit for each resource type, and
then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a
similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/init-containers/ */
@K8sDslMarker
fun Podspec.initContainers(init: Container.() -> Unit) {
  this as Podspec_core_v1_k8s1_19Impl
  Container_core_v1_k8s1_19Impl(this)
    .also { initContainers = initContainers?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be
autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is
enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create
requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will
be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More
info: https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes
v1.16, and is only honored by servers that enable the PodOverhead feature. */
@K8sDslMarker
fun Podspec.overhead(init: de.loosetie.k8s.dsl.types.LimitsAndRequests.() -> Unit) {
  this as Podspec_core_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.LimitsAndRequests(this)
    .also { overhead = it }
    .apply(init)
}

/** If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready
AND all conditions specified in the readiness gates have status equal to "True" More info:
https://git.k8s.io/enhancements/keps/sig-network/0007-pod-ready%2B%2B.md */
@K8sDslMarker
fun Podspec.readinessGates(init: PodReadinessGate.() -> Unit) {
  this as Podspec_core_v1_k8s1_19Impl
  PodReadinessGate_core_v1_k8s1_19Impl(this)
    .also { readinessGates = readinessGates?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty. See type
description for default values of each field. */
@K8sDslMarker
fun Podspec.securityContext(init: PodSecurityContext.() -> Unit) {
  this as Podspec_core_v1_k8s1_19Impl
  PodSecurityContext_core_v1_k8s1_19Impl(this)
    .also { securityContext = it }
    .apply(init)
}

/** If specified, the pod's tolerations. */
@K8sDslMarker
fun Podspec.tolerations(init: Toleration.() -> Unit) {
  this as Podspec_core_v1_k8s1_19Impl
  Toleration_core_v1_k8s1_19Impl(this)
    .also { tolerations = tolerations?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule
pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed. */
@K8sDslMarker
fun Podspec.topologySpreadConstraints(init: TopologySpreadConstraint.() -> Unit) {
  this as Podspec_core_v1_k8s1_19Impl
  TopologySpreadConstraint_core_v1_k8s1_19Impl(this)
    .also { topologySpreadConstraints = topologySpreadConstraints?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of volumes that can be mounted by containers belonging to the pod. More info:
https://kubernetes.io/docs/concepts/storage/volumes */
@K8sDslMarker
fun Podspec.volumes(init: Volume.() -> Unit) {
  this as Podspec_core_v1_k8s1_19Impl
  Volume_core_v1_k8s1_19Impl(this)
    .also { volumes = volumes?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions */
@K8sDslMarker
fun Podstatus.conditions(init: PodCondition.() -> Unit) {
  this as Podstatus_core_v1_k8s1_19Impl
  PodCondition_core_v1_k8s1_19Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** The list has one entry per container in the manifest. Each entry is currently the output of `docker inspect`. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status */
@K8sDslMarker
fun Podstatus.containerStatuses(init: Containerstatus.() -> Unit) {
  this as Podstatus_core_v1_k8s1_19Impl
  Containerstatus_core_v1_k8s1_19Impl(this)
    .also { containerStatuses = containerStatuses?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Status for any ephemeral containers that have run in this pod. This field is alpha-level and is only populated by
servers that enable the EphemeralContainers feature. */
@K8sDslMarker
fun Podstatus.ephemeralContainerStatuses(init: Containerstatus.() -> Unit) {
  this as Podstatus_core_v1_k8s1_19Impl
  Containerstatus_core_v1_k8s1_19Impl(this)
    .also { ephemeralContainerStatuses = ephemeralContainerStatuses?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** The list has one entry per init container in the manifest. The most recent successful init container will have ready =
true, the most recently started container will have startTime set. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status */
@K8sDslMarker
fun Podstatus.initContainerStatuses(init: Containerstatus.() -> Unit) {
  this as Podstatus_core_v1_k8s1_19Impl
  Containerstatus_core_v1_k8s1_19Impl(this)
    .also { initContainerStatuses = initContainerStatuses?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP
field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated
yet. */
@K8sDslMarker
fun Podstatus.podIPs(init: PodIP.() -> Unit) {
  this as Podstatus_core_v1_k8s1_19Impl
  PodIP_core_v1_k8s1_19Impl(this)
    .also { podIPs = podIPs?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the
container image(s) for the pod. */
@K8sDslMarker
fun Podstatus.startTime(init: Time.() -> Unit) {
  this as Podstatus_core_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { startTime = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Podtemplatespec.metadata(init: ObjectMeta.() -> Unit) {
  this as Podtemplatespec_core_v1_k8s1_19Impl
  ObjectMeta_meta_v1_k8s1_19Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired behavior of the pod. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Podtemplatespec.spec(init: Podspec.() -> Unit) {
  this as Podtemplatespec_core_v1_k8s1_19Impl
  Podspec_core_v1_k8s1_19Impl(this)
    .also { spec = it }
    .apply(init)
}

/** `limited` specifies how requests are handled for a Limited priority level. This field must be non-empty if and only if
`type` is `"Limited"`. */
@K8sDslMarker
fun Prioritylevelconfigurationspec.limited(init: LimitedPriorityLevelConfiguration.() -> Unit) {
  this as Prioritylevelconfigurationspec_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  LimitedPriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { limited = it }
    .apply(init)
}

/** `conditions` is the current state of "request-priority". */
@K8sDslMarker
fun Prioritylevelconfigurationstatus.conditions(init: PriorityLevelConfigurationCondition.() -> Unit) {
  this as Prioritylevelconfigurationstatus_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl
  PriorityLevelConfigurationCondition_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Selector is a label query over pods that should match the replica count. Label keys and values that must match in order
to be controlled by this replica set. It must match the pod template's labels. More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
@K8sDslMarker
fun Replicasetspec.selector(init: LabelSelector.() -> Unit) {
  this as Replicasetspec_apps_v1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { selector = it }
    .apply(init)
}

/** Template is the object that describes the pod that will be created if insufficient replicas are detected. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
@K8sDslMarker
fun Replicasetspec.template(init: Podtemplatespec.() -> Unit) {
  this as Replicasetspec_apps_v1_k8s1_19Impl
  Podtemplatespec_core_v1_k8s1_19Impl(this)
    .also { template = it }
    .apply(init)
}

/** Represents the latest available observations of a replica set's current state. */
@K8sDslMarker
fun Replicasetstatus.conditions(init: ReplicaSetCondition.() -> Unit) {
  this as Replicasetstatus_apps_v1_k8s1_19Impl
  ReplicaSetCondition_apps_v1_k8s1_19Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Template is the object that describes the pod that will be created if insufficient replicas are detected. This takes
precedence over a TemplateRef. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
@K8sDslMarker
fun Replicationcontrollerspec.template(init: Podtemplatespec.() -> Unit) {
  this as Replicationcontrollerspec_core_v1_k8s1_19Impl
  Podtemplatespec_core_v1_k8s1_19Impl(this)
    .also { template = it }
    .apply(init)
}

/** Represents the latest available observations of a replication controller's current state. */
@K8sDslMarker
fun Replicationcontrollerstatus.conditions(init: ReplicationControllerCondition.() -> Unit) {
  this as Replicationcontrollerstatus_core_v1_k8s1_19Impl
  ReplicationControllerCondition_core_v1_k8s1_19Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed
using ScopeSelectorOperator in combination with possible values. For a resource to match, both scopes AND scopeSelector
(if specified in spec), must be matched. */
@K8sDslMarker
fun Resourcequotaspec.scopeSelector(init: ScopeSelector.() -> Unit) {
  this as Resourcequotaspec_core_v1_k8s1_19Impl
  ScopeSelector_core_v1_k8s1_19Impl(this)
    .also { scopeSelector = it }
    .apply(init)
}

/** The maximum number of DaemonSet pods that can be unavailable during the update. Value can be an absolute number (ex: 5)
or a percentage of total number of DaemonSet pods at the start of the update (ex: 10%). Absolute number is calculated
from percentage by rounding up. This cannot be 0. Default value is 1. Example: when this is set to 30%, at most 30% of
the total number of nodes that should be running the daemon pod (i.e. status.desiredNumberScheduled) can have their pods
stopped for an update at any given time. The update starts by stopping at most 30% of those DaemonSet pods and then
brings up new DaemonSet pods in their place. Once the new pods are available, it then proceeds onto other DaemonSet
pods, thus ensuring that at least 70% of original number of DaemonSet pods are available at all times during the update. */
@K8sDslMarker
fun Rollingupdatedaemonset.maxUnavailable(percentage: String) {
  this as Rollingupdatedaemonset_apps_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrPercentage(percentage)
    .also { maxUnavailable = it }
}

/** The maximum number of DaemonSet pods that can be unavailable during the update. Value can be an absolute number (ex: 5)
or a percentage of total number of DaemonSet pods at the start of the update (ex: 10%). Absolute number is calculated
from percentage by rounding up. This cannot be 0. Default value is 1. Example: when this is set to 30%, at most 30% of
the total number of nodes that should be running the daemon pod (i.e. status.desiredNumberScheduled) can have their pods
stopped for an update at any given time. The update starts by stopping at most 30% of those DaemonSet pods and then
brings up new DaemonSet pods in their place. Once the new pods are available, it then proceeds onto other DaemonSet
pods, thus ensuring that at least 70% of original number of DaemonSet pods are available at all times during the update. */
@K8sDslMarker
fun Rollingupdatedaemonset.maxUnavailable(int: Int) {
  this as Rollingupdatedaemonset_apps_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrPercentage(int)
    .also { maxUnavailable = it }
}

/** The maximum number of pods that can be scheduled above the desired number of pods. Value can be an absolute number (ex:
5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated
from percentage by rounding up. Defaults to 25%. Example: when this is set to 30%, the new ReplicaSet can be scaled up
immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired
pods. Once old pods have been killed, new ReplicaSet can be scaled up further, ensuring that total number of pods
running at any time during the update is at most 130% of desired pods. */
@K8sDslMarker
fun Rollingupdatedeployment.maxSurge(percentage: String) {
  this as Rollingupdatedeployment_apps_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrPercentage(percentage)
    .also { maxSurge = it }
}

/** The maximum number of pods that can be scheduled above the desired number of pods. Value can be an absolute number (ex:
5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated
from percentage by rounding up. Defaults to 25%. Example: when this is set to 30%, the new ReplicaSet can be scaled up
immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired
pods. Once old pods have been killed, new ReplicaSet can be scaled up further, ensuring that total number of pods
running at any time during the update is at most 130% of desired pods. */
@K8sDslMarker
fun Rollingupdatedeployment.maxSurge(int: Int) {
  this as Rollingupdatedeployment_apps_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrPercentage(int)
    .also { maxSurge = it }
}

/** The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a
percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0
if MaxSurge is 0. Defaults to 25%. Example: when this is set to 30%, the old ReplicaSet can be scaled down to 70% of
desired pods immediately when the rolling update starts. Once new pods are ready, old ReplicaSet can be scaled down
further, followed by scaling up the new ReplicaSet, ensuring that the total number of pods available at all times during
the update is at least 70% of desired pods. */
@K8sDslMarker
fun Rollingupdatedeployment.maxUnavailable(percentage: String) {
  this as Rollingupdatedeployment_apps_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrPercentage(percentage)
    .also { maxUnavailable = it }
}

/** The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a
percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0
if MaxSurge is 0. Defaults to 25%. Example: when this is set to 30%, the old ReplicaSet can be scaled down to 70% of
desired pods immediately when the rolling update starts. Once new pods are ready, old ReplicaSet can be scaled down
further, followed by scaling up the new ReplicaSet, ensuring that the total number of pods available at all times during
the update is at least 70% of desired pods. */
@K8sDslMarker
fun Rollingupdatedeployment.maxUnavailable(int: Int) {
  this as Rollingupdatedeployment_apps_v1_k8s1_19Impl
  de.loosetie.k8s.dsl.types.IntOrPercentage(int)
    .also { maxUnavailable = it }
}

/** NonResourceAttributes describes information for a non-resource access request */
@K8sDslMarker
fun Selfsubjectaccessreviewspec.nonResourceAttributes(init: NonResourceAttributes.() -> Unit) {
  this as Selfsubjectaccessreviewspec_authorization_k8s_io_v1_k8s1_19Impl
  NonResourceAttributes_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { nonResourceAttributes = it }
    .apply(init)
}

/** ResourceAuthorizationAttributes describes information for a resource access request */
@K8sDslMarker
fun Selfsubjectaccessreviewspec.resourceAttributes(init: ResourceAttributes.() -> Unit) {
  this as Selfsubjectaccessreviewspec_authorization_k8s_io_v1_k8s1_19Impl
  ResourceAttributes_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { resourceAttributes = it }
    .apply(init)
}

/** The list of ports that are exposed by this service. More info:
https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies */
@K8sDslMarker
fun Servicespec.ports(init: ServicePort.() -> Unit) {
  this as Servicespec_core_v1_k8s1_19Impl
  ServicePort_core_v1_k8s1_19Impl(this)
    .also { ports = ports?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** sessionAffinityConfig contains the configurations of session affinity. */
@K8sDslMarker
fun Servicespec.sessionAffinityConfig(init: SessionAffinityConfig.() -> Unit) {
  this as Servicespec_core_v1_k8s1_19Impl
  SessionAffinityConfig_core_v1_k8s1_19Impl(this)
    .also { sessionAffinityConfig = it }
    .apply(init)
}

/** LoadBalancer contains the current status of the load-balancer, if one is present. */
@K8sDslMarker
fun Servicestatus.loadBalancer(init: LoadBalancerStatus.() -> Unit) {
  this as Servicestatus_core_v1_k8s1_19Impl
  LoadBalancerStatus_core_v1_k8s1_19Impl(this)
    .also { loadBalancer = it }
    .apply(init)
}

/** selector is a label query over pods that should match the replica count. It must match the pod template's labels. More
info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
@K8sDslMarker
fun Statefulsetspec.selector(init: LabelSelector.() -> Unit) {
  this as Statefulsetspec_apps_v1_k8s1_19Impl
  LabelSelector_meta_v1_k8s1_19Impl(this)
    .also { selector = it }
    .apply(init)
}

/** template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod
stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet. */
@K8sDslMarker
fun Statefulsetspec.template(init: Podtemplatespec.() -> Unit) {
  this as Statefulsetspec_apps_v1_k8s1_19Impl
  Podtemplatespec_core_v1_k8s1_19Impl(this)
    .also { template = it }
    .apply(init)
}

/** updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a
revision is made to Template. */
@K8sDslMarker
fun Statefulsetspec.updateStrategy(init: StatefulSetUpdateStrategy.() -> Unit) {
  this as Statefulsetspec_apps_v1_k8s1_19Impl
  StatefulSetUpdateStrategy_apps_v1_k8s1_19Impl(this)
    .also { updateStrategy = it }
    .apply(init)
}

/** volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible
for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must
have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence
over any volumes in the template, with the same name. */
@K8sDslMarker
fun Statefulsetspec.volumeClaimTemplates(init: PersistentVolumeClaim.() -> Unit) {
  this as Statefulsetspec_apps_v1_k8s1_19Impl
  PersistentVolumeClaim_core_v1_k8s1_19Impl(this)
    .also { volumeClaimTemplates = volumeClaimTemplates?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Represents the latest available observations of a statefulset's current state. */
@K8sDslMarker
fun Statefulsetstatus.conditions(init: StatefulSetCondition.() -> Unit) {
  this as Statefulsetstatus_apps_v1_k8s1_19Impl
  StatefulSetCondition_apps_v1_k8s1_19Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** NonResourceAttributes describes information for a non-resource access request */
@K8sDslMarker
fun Subjectaccessreviewspec.nonResourceAttributes(init: NonResourceAttributes.() -> Unit) {
  this as Subjectaccessreviewspec_authorization_k8s_io_v1_k8s1_19Impl
  NonResourceAttributes_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { nonResourceAttributes = it }
    .apply(init)
}

/** ResourceAuthorizationAttributes describes information for a resource access request */
@K8sDslMarker
fun Subjectaccessreviewspec.resourceAttributes(init: ResourceAttributes.() -> Unit) {
  this as Subjectaccessreviewspec_authorization_k8s_io_v1_k8s1_19Impl
  ResourceAttributes_authorization_k8s_io_v1_k8s1_19Impl(this)
    .also { resourceAttributes = it }
    .apply(init)
}

/** BoundObjectRef is a reference to an object that the token will be bound to. The token will only be valid for as long as
the bound object exists. NOTE: The API server's TokenReview endpoint will validate the BoundObjectRef, but other
audiences may not. Keep ExpirationSeconds small if you want prompt revocation. */
@K8sDslMarker
fun Tokenrequestspec.boundObjectRef(init: BoundObjectReference.() -> Unit) {
  this as Tokenrequestspec_authentication_k8s_io_v1_k8s1_19Impl
  BoundObjectReference_authentication_k8s_io_v1_k8s1_19Impl(this)
    .also { boundObjectRef = it }
    .apply(init)
}

/** ExpirationTimestamp is the time of expiration of the returned token. */
@K8sDslMarker
fun Tokenrequeststatus.expirationTimestamp(init: Time.() -> Unit) {
  this as Tokenrequeststatus_authentication_k8s_io_v1_k8s1_19Impl
  Time_meta_v1_k8s1_19Impl(this)
    .also { expirationTimestamp = it }
    .apply(init)
}

/** User is the UserInfo associated with the provided token. */
@K8sDslMarker
fun Tokenreviewstatus.user(init: UserInfo.() -> Unit) {
  this as Tokenreviewstatus_authentication_k8s_io_v1_k8s1_19Impl
  UserInfo_authentication_k8s_io_v1_k8s1_19Impl(this)
    .also { user = it }
    .apply(init)
}

/** Source represents the volume that should be attached. */
@K8sDslMarker
fun Volumeattachmentspec.source(init: VolumeAttachmentSource.() -> Unit) {
  this as Volumeattachmentspec_storage_k8s_io_v1_k8s1_19Impl
  VolumeAttachmentSource_storage_k8s_io_v1_k8s1_19Impl(this)
    .also { source = it }
    .apply(init)
}

/** The last error encountered during attach operation, if any. This field must only be set by the entity completing the
attach operation, i.e. the external-attacher. */
@K8sDslMarker
fun Volumeattachmentstatus.attachError(init: VolumeError.() -> Unit) {
  this as Volumeattachmentstatus_storage_k8s_io_v1_k8s1_19Impl
  VolumeError_storage_k8s_io_v1_k8s1_19Impl(this)
    .also { attachError = it }
    .apply(init)
}

/** The last error encountered during detach operation, if any. This field must only be set by the entity completing the
detach operation, i.e. the external-attacher. */
@K8sDslMarker
fun Volumeattachmentstatus.detachError(init: VolumeError.() -> Unit) {
  this as Volumeattachmentstatus_storage_k8s_io_v1_k8s1_19Impl
  VolumeError_storage_k8s_io_v1_k8s1_19Impl(this)
    .also { detachError = it }
    .apply(init)
}