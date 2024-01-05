package de.loosetie.k8s.dsl

import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.manifests.*
import de.loosetie.k8s.dsl.impls.*

/** preferredVersion is the version preferred by the API server, which probably is the storage version. */
@K8sDslMarker
fun APIGroup.preferredVersion(init: GroupVersionForDiscovery.() -> Unit) {
  this as APIGroup_meta_v1Impl
  GroupVersionForDiscovery_meta_v1Impl(this)
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
  this as APIGroup_meta_v1Impl
  ServerAddressByClientCIDR_meta_v1Impl(this)
    .also { serverAddressByClientCIDRs = serverAddressByClientCIDRs?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** versions are the versions supported in this group. */
@K8sDslMarker
fun APIGroup.versions(init: GroupVersionForDiscovery.() -> Unit) {
  this as APIGroup_meta_v1Impl
  GroupVersionForDiscovery_meta_v1Impl(this)
    .also { versions = versions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Last time the condition transitioned from one status to another. */
@K8sDslMarker
fun APIServiceCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as APIServiceCondition_apiregistration_k8s_io_v1Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun APIService.metadata(init: ObjectMeta.() -> Unit) {
  this as APIService_apiregistration_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec contains information for locating and communicating with a server */
@K8sDslMarker
fun APIService.spec(init: Apiservicespec.() -> Unit) {
  this as APIService_apiregistration_k8s_io_v1Impl
  Apiservicespec_apiregistration_k8s_io_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status contains derived information about an API server */
@K8sDslMarker
fun APIService.status(init: Apiservicestatus.() -> Unit) {
  this as APIService_apiregistration_k8s_io_v1Impl
  Apiservicestatus_apiregistration_k8s_io_v1Impl(this)
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
  this as APIVersions_meta_v1Impl
  ServerAddressByClientCIDR_meta_v1Impl(this)
    .also { serverAddressByClientCIDRs = serverAddressByClientCIDRs?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Describes node affinity scheduling rules for the pod. */
@K8sDslMarker
fun Affinity.nodeAffinity(init: NodeAffinity.() -> Unit) {
  this as Affinity_core_v1Impl
  NodeAffinity_core_v1Impl(this)
    .also { nodeAffinity = it }
    .apply(init)
}

/** Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)). */
@K8sDslMarker
fun Affinity.podAffinity(init: PodAffinity.() -> Unit) {
  this as Affinity_core_v1Impl
  PodAffinity_core_v1Impl(this)
    .also { podAffinity = it }
    .apply(init)
}

/** Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other
pod(s)). */
@K8sDslMarker
fun Affinity.podAntiAffinity(init: PodAntiAffinity.() -> Unit) {
  this as Affinity_core_v1Impl
  PodAntiAffinity_core_v1Impl(this)
    .also { podAntiAffinity = it }
    .apply(init)
}

/** ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of
the selectors match, then the ClusterRole's permissions will be added */
@K8sDslMarker
fun AggregationRule.clusterRoleSelectors(init: LabelSelector.() -> Unit) {
  this as AggregationRule_rbac_authorization_k8s_io_v1Impl
  LabelSelector_meta_v1Impl(this)
    .also { clusterRoleSelectors = clusterRoleSelectors?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Binding.metadata(init: ObjectMeta.() -> Unit) {
  this as Binding_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** The target object that you want to bind to the standard object. */
@K8sDslMarker
fun Binding.target(init: ObjectReference.() -> Unit) {
  this as Binding_core_v1Impl
  ObjectReference_core_v1Impl(this)
    .also { target = it }
    .apply(init)
}

/** Standard object metadata. metadata.Name indicates the name of the CSI driver that this object refers to; it MUST be the
same name returned by the CSI GetPluginName() call for that driver. The driver name must be 63 characters or less,
beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and alphanumerics between.
More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun CSIDriver.metadata(init: ObjectMeta.() -> Unit) {
  this as CSIDriver_storage_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the CSI Driver. */
@K8sDslMarker
fun CSIDriver.spec(init: Csidriverspec.() -> Unit) {
  this as CSIDriver_storage_k8s_io_v1Impl
  Csidriverspec_storage_k8s_io_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** allocatable represents the volume resources of a node that are available for scheduling. This field is beta. */
@K8sDslMarker
fun CSINodeDriver.allocatable(init: VolumeNodeResources.() -> Unit) {
  this as CSINodeDriver_storage_k8s_io_v1Impl
  VolumeNodeResources_storage_k8s_io_v1Impl(this)
    .also { allocatable = it }
    .apply(init)
}

/** metadata.name must be the Kubernetes node name. */
@K8sDslMarker
fun CSINode.metadata(init: ObjectMeta.() -> Unit) {
  this as CSINode_storage_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** spec is the specification of CSINode */
@K8sDslMarker
fun CSINode.spec(init: Csinodespec.() -> Unit) {
  this as CSINode_storage_k8s_io_v1Impl
  Csinodespec_storage_k8s_io_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** controllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver
to complete the CSI ControllerExpandVolume call. This is an alpha field and requires enabling ExpandCSIVolumes feature
gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one
secret, all secrets are passed. */
@K8sDslMarker
fun CSIPersistentVolumeSource.controllerExpandSecretRef(init: SecretReference.() -> Unit) {
  this as CSIPersistentVolumeSource_core_v1Impl
  SecretReference_core_v1Impl(this)
    .also { controllerExpandSecretRef = it }
    .apply(init)
}

/** controllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI
driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may
be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed. */
@K8sDslMarker
fun CSIPersistentVolumeSource.controllerPublishSecretRef(init: SecretReference.() -> Unit) {
  this as CSIPersistentVolumeSource_core_v1Impl
  SecretReference_core_v1Impl(this)
    .also { controllerPublishSecretRef = it }
    .apply(init)
}

/** nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to
complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret
is required. If the secret object contains more than one secret, all secrets are passed. */
@K8sDslMarker
fun CSIPersistentVolumeSource.nodePublishSecretRef(init: SecretReference.() -> Unit) {
  this as CSIPersistentVolumeSource_core_v1Impl
  SecretReference_core_v1Impl(this)
    .also { nodePublishSecretRef = it }
    .apply(init)
}

/** nodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to
complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be
empty if no secret is required. If the secret object contains more than one secret, all secrets are passed. */
@K8sDslMarker
fun CSIPersistentVolumeSource.nodeStageSecretRef(init: SecretReference.() -> Unit) {
  this as CSIPersistentVolumeSource_core_v1Impl
  SecretReference_core_v1Impl(this)
    .also { nodeStageSecretRef = it }
    .apply(init)
}

/** Capacity is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and
parameters that match the previous fields. The semantic is currently (CSI spec 1.2) defined as: The available capacity,
in bytes, of the storage that can be used to provision volumes. If not set, that information is currently unavailable. */
@K8sDslMarker
fun CSIStorageCapacity_storage_k8s_io_v1.capacity(init: Quantity.() -> Unit) {
  this as CSIStorageCapacity_storage_k8s_io_v1Impl
  Quantity_core_resourceImpl(this)
    .also { capacity = it }
    .apply(init)
}

/** MaximumVolumeSize is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with
topology and parameters that match the previous fields. This is defined since CSI spec 1.4.0 as the largest size that
may be used in a CreateVolumeRequest.capacity_range.required_bytes field to create a volume with the same parameters as
those in GetCapacityRequest. The corresponding value in the Kubernetes API is ResourceRequirements.Requests in a volume
claim. */
@K8sDslMarker
fun CSIStorageCapacity_storage_k8s_io_v1.maximumVolumeSize(init: Quantity.() -> Unit) {
  this as CSIStorageCapacity_storage_k8s_io_v1Impl
  Quantity_core_resourceImpl(this)
    .also { maximumVolumeSize = it }
    .apply(init)
}

/** Standard object's metadata. The name has no particular meaning. It must be be a DNS subdomain (dots allowed, 253
characters). To ensure that there are no conflicts with other CSI drivers on the cluster, the recommendation is to use
csisc-<uuid>, a generated name, or a reverse-domain name which ends with the unique CSI driver name. Objects are
namespaced. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun CSIStorageCapacity_storage_k8s_io_v1.metadata(init: ObjectMeta.() -> Unit) {
  this as CSIStorageCapacity_storage_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** NodeTopology defines which nodes have access to the storage for which capacity was reported. If not set, the storage is
not accessible from any node in the cluster. If empty, the storage is accessible from all nodes. This field is
immutable. */
@K8sDslMarker
fun CSIStorageCapacity_storage_k8s_io_v1.nodeTopology(init: LabelSelector.() -> Unit) {
  this as CSIStorageCapacity_storage_k8s_io_v1Impl
  LabelSelector_meta_v1Impl(this)
    .also { nodeTopology = it }
    .apply(init)
}

/** Capacity is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and
parameters that match the previous fields. The semantic is currently (CSI spec 1.2) defined as: The available capacity,
in bytes, of the storage that can be used to provision volumes. If not set, that information is currently unavailable. */
@K8sDslMarker
fun CSIStorageCapacity.capacity(init: Quantity.() -> Unit) {
  this as CSIStorageCapacity_storage_k8s_io_v1beta1Impl
  Quantity_core_resourceImpl(this)
    .also { capacity = it }
    .apply(init)
}

/** MaximumVolumeSize is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with
topology and parameters that match the previous fields. This is defined since CSI spec 1.4.0 as the largest size that
may be used in a CreateVolumeRequest.capacity_range.required_bytes field to create a volume with the same parameters as
those in GetCapacityRequest. The corresponding value in the Kubernetes API is ResourceRequirements.Requests in a volume
claim. */
@K8sDslMarker
fun CSIStorageCapacity.maximumVolumeSize(init: Quantity.() -> Unit) {
  this as CSIStorageCapacity_storage_k8s_io_v1beta1Impl
  Quantity_core_resourceImpl(this)
    .also { maximumVolumeSize = it }
    .apply(init)
}

/** Standard object's metadata. The name has no particular meaning. It must be be a DNS subdomain (dots allowed, 253
characters). To ensure that there are no conflicts with other CSI drivers on the cluster, the recommendation is to use
csisc-<uuid>, a generated name, or a reverse-domain name which ends with the unique CSI driver name. Objects are
namespaced. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun CSIStorageCapacity.metadata(init: ObjectMeta.() -> Unit) {
  this as CSIStorageCapacity_storage_k8s_io_v1beta1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** NodeTopology defines which nodes have access to the storage for which capacity was reported. If not set, the storage is
not accessible from any node in the cluster. If empty, the storage is accessible from all nodes. This field is
immutable. */
@K8sDslMarker
fun CSIStorageCapacity.nodeTopology(init: LabelSelector.() -> Unit) {
  this as CSIStorageCapacity_storage_k8s_io_v1beta1Impl
  LabelSelector_meta_v1Impl(this)
    .also { nodeTopology = it }
    .apply(init)
}

/** nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to
complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret
is required. If the secret object contains more than one secret, all secret references are passed. */
@K8sDslMarker
fun CSIVolumeSource.nodePublishSecretRef(init: LocalObjectReference.() -> Unit) {
  this as CSIVolumeSource_core_v1Impl
  LocalObjectReference_core_v1Impl(this)
    .also { nodePublishSecretRef = it }
    .apply(init)
}

/** secretRef is Optional: SecretRef is reference to the authentication secret for User, default is empty. More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
@K8sDslMarker
fun CephFSPersistentVolumeSource.secretRef(init: SecretReference.() -> Unit) {
  this as CephFSPersistentVolumeSource_core_v1Impl
  SecretReference_core_v1Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** secretRef is Optional: SecretRef is reference to the authentication secret for User, default is empty. More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
@K8sDslMarker
fun CephFSVolumeSource.secretRef(init: LocalObjectReference.() -> Unit) {
  this as CephFSVolumeSource_core_v1Impl
  LocalObjectReference_core_v1Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new
condition type is added or an existing condition's status is changed, the server defaults this to the current time. */
@K8sDslMarker
fun CertificateSigningRequestCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as CertificateSigningRequestCondition_certificates_k8s_io_v1Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** lastUpdateTime is the time of the last update to this condition */
@K8sDslMarker
fun CertificateSigningRequestCondition.lastUpdateTime(init: Time.() -> Unit) {
  this as CertificateSigningRequestCondition_certificates_k8s_io_v1Impl
  Time_meta_v1Impl(this)
    .also { lastUpdateTime = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun CertificateSigningRequest.metadata(init: ObjectMeta.() -> Unit) {
  this as CertificateSigningRequest_certificates_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** spec contains the certificate request, and is immutable after creation. Only the request, signerName, expirationSeconds,
and usages fields can be set on creation. Other fields are derived by Kubernetes and cannot be modified by users. */
@K8sDslMarker
fun CertificateSigningRequest.spec(init: Certificatesigningrequestspec.() -> Unit) {
  this as CertificateSigningRequest_certificates_k8s_io_v1Impl
  Certificatesigningrequestspec_certificates_k8s_io_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** status contains information about whether the request is approved or denied, and the certificate issued by the signer,
or the failure condition indicating signer failure. */
@K8sDslMarker
fun CertificateSigningRequest.status(init: Certificatesigningrequeststatus.() -> Unit) {
  this as CertificateSigningRequest_certificates_k8s_io_v1Impl
  Certificatesigningrequeststatus_certificates_k8s_io_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** secretRef is Optional: points to a secret object containing parameters used to connect to OpenStack. */
@K8sDslMarker
fun CinderPersistentVolumeSource.secretRef(init: SecretReference.() -> Unit) {
  this as CinderPersistentVolumeSource_core_v1Impl
  SecretReference_core_v1Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** secretRef is optional: points to a secret object containing parameters used to connect to OpenStack. */
@K8sDslMarker
fun CinderVolumeSource.secretRef(init: LocalObjectReference.() -> Unit) {
  this as CinderVolumeSource_core_v1Impl
  LocalObjectReference_core_v1Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** Standard object's metadata. */
@K8sDslMarker
fun ClusterRoleBinding.metadata(init: ObjectMeta.() -> Unit) {
  this as ClusterRoleBinding_rbac_authorization_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must
return an error. */
@K8sDslMarker
fun ClusterRoleBinding.roleRef(init: RoleRef.() -> Unit) {
  this as ClusterRoleBinding_rbac_authorization_k8s_io_v1Impl
  RoleRef_rbac_authorization_k8s_io_v1Impl(this)
    .also { roleRef = it }
    .apply(init)
}

/** Subjects holds references to the objects the role applies to. */
@K8sDslMarker
fun ClusterRoleBinding.subjects(init: Subject_rbac_authorization_k8s_io_v1.() -> Unit) {
  this as ClusterRoleBinding_rbac_authorization_k8s_io_v1Impl
  Subject_rbac_authorization_k8s_io_v1Impl(this)
    .also { subjects = subjects?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is
set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller. */
@K8sDslMarker
fun ClusterRole.aggregationRule(init: AggregationRule.() -> Unit) {
  this as ClusterRole_rbac_authorization_k8s_io_v1Impl
  AggregationRule_rbac_authorization_k8s_io_v1Impl(this)
    .also { aggregationRule = it }
    .apply(init)
}

/** Standard object's metadata. */
@K8sDslMarker
fun ClusterRole.metadata(init: ObjectMeta.() -> Unit) {
  this as ClusterRole_rbac_authorization_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Rules holds all the PolicyRules for this ClusterRole */
@K8sDslMarker
fun ClusterRole.rules(init: PolicyRule.() -> Unit) {
  this as ClusterRole_rbac_authorization_k8s_io_v1Impl
  PolicyRule_rbac_authorization_k8s_io_v1Impl(this)
    .also { rules = rules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of component conditions observed */
@K8sDslMarker
fun ComponentStatus.conditions(init: ComponentCondition.() -> Unit) {
  this as ComponentStatus_core_v1Impl
  ComponentCondition_core_v1Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun ComponentStatus.metadata(init: ObjectMeta.() -> Unit) {
  this as ComponentStatus_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** lastTransitionTime is the last time the condition transitioned from one status to another. This should be when the
underlying condition changed. If that is not known, then using the time when the API field changed is acceptable. */
@K8sDslMarker
fun Condition.lastTransitionTime(init: Time.() -> Unit) {
  this as Condition_meta_v1Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** items if unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the
volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into
the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap,
the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or
start with '..'. */
@K8sDslMarker
fun ConfigMapProjection.items(init: KeyToPath.() -> Unit) {
  this as ConfigMapProjection_core_v1Impl
  KeyToPath_core_v1Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** items if unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the
volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into
the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap,
the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or
start with '..'. */
@K8sDslMarker
fun ConfigMapVolumeSource.items(init: KeyToPath.() -> Unit) {
  this as ConfigMapVolumeSource_core_v1Impl
  KeyToPath_core_v1Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun ConfigMap.metadata(init: ObjectMeta.() -> Unit) {
  this as ConfigMap_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** target specifies the target value for the given metric */
@K8sDslMarker
fun ContainerResourceMetricSource.target(init: MetricTarget.() -> Unit) {
  this as ContainerResourceMetricSource_autoscaling_v2Impl
  MetricTarget_autoscaling_v2Impl(this)
    .also { target = it }
    .apply(init)
}

/** current contains the current value for the given metric */
@K8sDslMarker
fun ContainerResourceMetricStatus.current(init: MetricValueStatus.() -> Unit) {
  this as ContainerResourceMetricStatus_autoscaling_v2Impl
  MetricValueStatus_autoscaling_v2Impl(this)
    .also { current = it }
    .apply(init)
}

/** Time at which the container was last (re-)started */
@K8sDslMarker
fun ContainerStateRunning.startedAt(init: Time.() -> Unit) {
  this as ContainerStateRunning_core_v1Impl
  Time_meta_v1Impl(this)
    .also { startedAt = it }
    .apply(init)
}

/** Time at which the container last terminated */
@K8sDslMarker
fun ContainerStateTerminated.finishedAt(init: Time.() -> Unit) {
  this as ContainerStateTerminated_core_v1Impl
  Time_meta_v1Impl(this)
    .also { finishedAt = it }
    .apply(init)
}

/** Time at which previous execution of the container started */
@K8sDslMarker
fun ContainerStateTerminated.startedAt(init: Time.() -> Unit) {
  this as ContainerStateTerminated_core_v1Impl
  Time_meta_v1Impl(this)
    .also { startedAt = it }
    .apply(init)
}

/** Details about a running container */
@K8sDslMarker
fun ContainerState.running(init: ContainerStateRunning.() -> Unit) {
  this as ContainerState_core_v1Impl
  ContainerStateRunning_core_v1Impl(this)
    .also { running = it }
    .apply(init)
}

/** Details about a terminated container */
@K8sDslMarker
fun ContainerState.terminated(init: ContainerStateTerminated.() -> Unit) {
  this as ContainerState_core_v1Impl
  ContainerStateTerminated_core_v1Impl(this)
    .also { terminated = it }
    .apply(init)
}

/** Details about a waiting container */
@K8sDslMarker
fun ContainerState.waiting(init: ContainerStateWaiting.() -> Unit) {
  this as ContainerState_core_v1Impl
  ContainerStateWaiting_core_v1Impl(this)
    .also { waiting = it }
    .apply(init)
}

/** List of environment variables to set in the container. Cannot be updated. */
@K8sDslMarker
fun Container.env(init: EnvVar.() -> Unit) {
  this as Container_core_v1Impl
  EnvVar_core_v1Impl(this)
    .also { env = env?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of sources to populate environment variables in the container. The keys defined within a source must be a
C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in
multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a
duplicate key will take precedence. Cannot be updated. */
@K8sDslMarker
fun Container.envFrom(init: EnvFromSource.() -> Unit) {
  this as Container_core_v1Impl
  EnvFromSource_core_v1Impl(this)
    .also { envFrom = envFrom?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Actions that the management system should take in response to container lifecycle events. Cannot be updated. */
@K8sDslMarker
fun Container.lifecycle(init: Lifecycle.() -> Unit) {
  this as Container_core_v1Impl
  Lifecycle_core_v1Impl(this)
    .also { lifecycle = it }
    .apply(init)
}

/** Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
@K8sDslMarker
fun Container.livenessProbe(init: Probe.() -> Unit) {
  this as Container_core_v1Impl
  Probe_core_v1Impl(this)
    .also { livenessProbe = it }
    .apply(init)
}

/** List of ports to expose from the container. Exposing a port here gives the system additional information about the
network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that
port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be
accessible from the network. Cannot be updated. */
@K8sDslMarker
fun Container.ports(init: ContainerPort.() -> Unit) {
  this as Container_core_v1Impl
  ContainerPort_core_v1Impl(this)
    .also { ports = ports?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails.
Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
@K8sDslMarker
fun Container.readinessProbe(init: Probe.() -> Unit) {
  this as Container_core_v1Impl
  Probe_core_v1Impl(this)
    .also { readinessProbe = it }
    .apply(init)
}

/** Compute Resources required by this container. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/ */
@K8sDslMarker
fun Container.resources(init: ResourceRequirements.() -> Unit) {
  this as Container_core_v1Impl
  ResourceRequirements_core_v1Impl(this)
    .also { resources = it }
    .apply(init)
}

/** SecurityContext defines the security options the container should be run with. If set, the fields of SecurityContext
override the equivalent fields of PodSecurityContext. More info:
https://kubernetes.io/docs/tasks/configure-pod-container/security-context/ */
@K8sDslMarker
fun Container.securityContext(init: SecurityContext.() -> Unit) {
  this as Container_core_v1Impl
  SecurityContext_core_v1Impl(this)
    .also { securityContext = it }
    .apply(init)
}

/** StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this
completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be
used to provide different probe parameters at the beginning of a Pod's lifecycle, when it might take a long time to load
data or warm a cache, than during steady-state operation. This cannot be updated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
@K8sDslMarker
fun Container.startupProbe(init: Probe.() -> Unit) {
  this as Container_core_v1Impl
  Probe_core_v1Impl(this)
    .also { startupProbe = it }
    .apply(init)
}

/** volumeDevices is the list of block devices to be used by the container. */
@K8sDslMarker
fun Container.volumeDevices(init: VolumeDevice.() -> Unit) {
  this as Container_core_v1Impl
  VolumeDevice_core_v1Impl(this)
    .also { volumeDevices = volumeDevices?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Pod volumes to mount into the container's filesystem. Cannot be updated. */
@K8sDslMarker
fun Container.volumeMounts(init: VolumeMount.() -> Unit) {
  this as Container_core_v1Impl
  VolumeMount_core_v1Impl(this)
    .also { volumeMounts = volumeMounts?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun ControllerRevision.metadata(init: ObjectMeta.() -> Unit) {
  this as ControllerRevision_apps_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun CronJob.metadata(init: ObjectMeta.() -> Unit) {
  this as CronJob_batch_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired behavior of a cron job, including the schedule. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun CronJob.spec(init: Cronjobspec.() -> Unit) {
  this as CronJob_batch_v1Impl
  Cronjobspec_batch_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Current status of a cron job. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun CronJob.status(init: Cronjobstatus.() -> Unit) {
  this as CronJob_batch_v1Impl
  Cronjobstatus_batch_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** webhook describes how to call the conversion webhook. Required when `strategy` is set to `Webhook`. */
@K8sDslMarker
fun CustomResourceConversion.webhook(init: WebhookConversion.() -> Unit) {
  this as CustomResourceConversion_apiextensions_k8s_io_v1Impl
  WebhookConversion_apiextensions_k8s_io_v1Impl(this)
    .also { webhook = it }
    .apply(init)
}

/** lastTransitionTime last time the condition transitioned from one status to another. */
@K8sDslMarker
fun CustomResourceDefinitionCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as CustomResourceDefinitionCondition_apiextensions_k8s_io_v1Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** additionalPrinterColumns specifies additional columns returned in Table output. See
https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If no columns
are specified, a single column displaying the age of the custom resource is used. */
@K8sDslMarker
fun CustomResourceDefinitionVersion.additionalPrinterColumns(init: CustomResourceColumnDefinition.() -> Unit) {
  this as CustomResourceDefinitionVersion_apiextensions_k8s_io_v1Impl
  CustomResourceColumnDefinition_apiextensions_k8s_io_v1Impl(this)
    .also { additionalPrinterColumns = additionalPrinterColumns?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** schema describes the schema used for validation, pruning, and defaulting of this version of the custom resource. */
@K8sDslMarker
fun CustomResourceDefinitionVersion.schema(init: CustomResourceValidation.() -> Unit) {
  this as CustomResourceDefinitionVersion_apiextensions_k8s_io_v1Impl
  CustomResourceValidation_apiextensions_k8s_io_v1Impl(this)
    .also { schema = it }
    .apply(init)
}

/** subresources specify what subresources this version of the defined custom resource have. */
@K8sDslMarker
fun CustomResourceDefinitionVersion.subresources(init: CustomResourceSubresources.() -> Unit) {
  this as CustomResourceDefinitionVersion_apiextensions_k8s_io_v1Impl
  CustomResourceSubresources_apiextensions_k8s_io_v1Impl(this)
    .also { subresources = it }
    .apply(init)
}

/** Standard object's metadata More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun CustomResourceDefinition.metadata(init: ObjectMeta.() -> Unit) {
  this as CustomResourceDefinition_apiextensions_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** spec describes how the user wants the resources to appear */
@K8sDslMarker
fun CustomResourceDefinition.spec(init: Customresourcedefinitionspec.() -> Unit) {
  this as CustomResourceDefinition_apiextensions_k8s_io_v1Impl
  Customresourcedefinitionspec_apiextensions_k8s_io_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** status indicates the actual state of the CustomResourceDefinition */
@K8sDslMarker
fun CustomResourceDefinition.status(init: Customresourcedefinitionstatus.() -> Unit) {
  this as CustomResourceDefinition_apiextensions_k8s_io_v1Impl
  Customresourcedefinitionstatus_apiextensions_k8s_io_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object. */
@K8sDslMarker
fun CustomResourceSubresources.scale(init: CustomResourceSubresourceScale.() -> Unit) {
  this as CustomResourceSubresources_apiextensions_k8s_io_v1Impl
  CustomResourceSubresourceScale_apiextensions_k8s_io_v1Impl(this)
    .also { scale = it }
    .apply(init)
}

/** status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom
resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource
`/status` subresource ignore changes to anything other than the `status` stanza of the object. */
@K8sDslMarker
fun CustomResourceSubresources.status(init: CustomResourceSubresourceStatus.() -> Unit) {
  this as CustomResourceSubresources_apiextensions_k8s_io_v1Impl
  CustomResourceSubresourceStatus_apiextensions_k8s_io_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning. */
@K8sDslMarker
fun CustomResourceValidation.openAPIV3Schema(init: JSONSchemaProps.() -> Unit) {
  this as CustomResourceValidation_apiextensions_k8s_io_v1Impl
  JSONSchemaProps_apiextensions_k8s_io_v1Impl(this)
    .also { openAPIV3Schema = it }
    .apply(init)
}

/** Last time the condition transitioned from one status to another. */
@K8sDslMarker
fun DaemonSetCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as DaemonSetCondition_apps_v1Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** Rolling update config params. Present only if type = "RollingUpdate". */
@K8sDslMarker
fun DaemonSetUpdateStrategy.rollingUpdate(init: Rollingupdatedaemonset.() -> Unit) {
  this as DaemonSetUpdateStrategy_apps_v1Impl
  Rollingupdatedaemonset_apps_v1Impl(this)
    .also { rollingUpdate = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun DaemonSet.metadata(init: ObjectMeta.() -> Unit) {
  this as DaemonSet_apps_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** The desired behavior of this daemon set. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun DaemonSet.spec(init: Daemonsetspec.() -> Unit) {
  this as DaemonSet_apps_v1Impl
  Daemonsetspec_apps_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** The current status of this daemon set. This data may be out of date by some window of time. Populated by the system.
Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun DaemonSet.status(init: Daemonsetstatus.() -> Unit) {
  this as DaemonSet_apps_v1Impl
  Daemonsetstatus_apps_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** Must be fulfilled before a deletion is carried out. If not possible, a 409 Conflict status will be returned. */
@K8sDslMarker
fun DeleteOptions.preconditions(init: Preconditions.() -> Unit) {
  this as DeleteOptions_meta_v1Impl
  Preconditions_meta_v1Impl(this)
    .also { preconditions = it }
    .apply(init)
}

/** Last time the condition transitioned from one status to another. */
@K8sDslMarker
fun DeploymentCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as DeploymentCondition_apps_v1Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** The last time this condition was updated. */
@K8sDslMarker
fun DeploymentCondition.lastUpdateTime(init: Time.() -> Unit) {
  this as DeploymentCondition_apps_v1Impl
  Time_meta_v1Impl(this)
    .also { lastUpdateTime = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Deployment.metadata(init: ObjectMeta.() -> Unit) {
  this as Deployment_apps_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired behavior of the Deployment. */
@K8sDslMarker
fun Deployment.spec(init: Deploymentspec.() -> Unit) {
  this as Deployment_apps_v1Impl
  Deploymentspec_apps_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Most recently observed status of the Deployment. */
@K8sDslMarker
fun Deployment.status(init: Deploymentstatus.() -> Unit) {
  this as Deployment_apps_v1Impl
  Deploymentstatus_apps_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** Items is a list of DownwardAPIVolume file */
@K8sDslMarker
fun DownwardAPIProjection.items(init: DownwardAPIVolumeFile.() -> Unit) {
  this as DownwardAPIProjection_core_v1Impl
  DownwardAPIVolumeFile_core_v1Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Required: Selects a field of the pod: only annotations, labels, name and namespace are supported. */
@K8sDslMarker
fun DownwardAPIVolumeFile.fieldRef(init: ObjectFieldSelector.() -> Unit) {
  this as DownwardAPIVolumeFile_core_v1Impl
  ObjectFieldSelector_core_v1Impl(this)
    .also { fieldRef = it }
    .apply(init)
}

/** Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and
requests.memory) are currently supported. */
@K8sDslMarker
fun DownwardAPIVolumeFile.resourceFieldRef(init: ResourceFieldSelector.() -> Unit) {
  this as DownwardAPIVolumeFile_core_v1Impl
  ResourceFieldSelector_core_v1Impl(this)
    .also { resourceFieldRef = it }
    .apply(init)
}

/** Items is a list of downward API volume file */
@K8sDslMarker
fun DownwardAPIVolumeSource.items(init: DownwardAPIVolumeFile.() -> Unit) {
  this as DownwardAPIVolumeSource_core_v1Impl
  DownwardAPIVolumeFile_core_v1Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** sizeLimit is the total amount of local storage required for this EmptyDir volume. The size limit is also applicable for
memory medium. The maximum usage on memory medium EmptyDir would be the minimum value between the SizeLimit specified
here and the sum of memory limits of all containers in a pod. The default is nil which means that the limit is
undefined. More info: http://kubernetes.io/docs/user-guide/volumes#emptydir */
@K8sDslMarker
fun EmptyDirVolumeSource.sizeLimit(init: Quantity.() -> Unit) {
  this as EmptyDirVolumeSource_core_v1Impl
  Quantity_core_resourceImpl(this)
    .also { sizeLimit = it }
    .apply(init)
}

/** Reference to object providing the endpoint. */
@K8sDslMarker
fun EndpointAddress.targetRef(init: ObjectReference.() -> Unit) {
  this as EndpointAddress_core_v1Impl
  ObjectReference_core_v1Impl(this)
    .also { targetRef = it }
    .apply(init)
}

/** forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing. */
@K8sDslMarker
fun EndpointHints.forZones(init: ForZone.() -> Unit) {
  this as EndpointHints_discovery_k8s_io_v1Impl
  ForZone_discovery_k8s_io_v1Impl(this)
    .also { forZones = forZones?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints. */
@K8sDslMarker
fun EndpointSlice.endpoints(init: Endpoint.() -> Unit) {
  this as EndpointSlice_discovery_k8s_io_v1Impl
  Endpoint_discovery_k8s_io_v1Impl(this)
    .also { endpoints = endpoints?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. */
@K8sDslMarker
fun EndpointSlice.metadata(init: ObjectMeta.() -> Unit) {
  this as EndpointSlice_discovery_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name.
When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it
indicates "all ports". Each slice may include a maximum of 100 ports. */
@K8sDslMarker
fun EndpointSlice.ports(init: EndpointPort_discovery_k8s_io_v1.() -> Unit) {
  this as EndpointSlice_discovery_k8s_io_v1Impl
  EndpointPort_discovery_k8s_io_v1Impl(this)
    .also { ports = ports?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load
balancers and clients to utilize. */
@K8sDslMarker
fun EndpointSubset.addresses(init: EndpointAddress.() -> Unit) {
  this as EndpointSubset_core_v1Impl
  EndpointAddress_core_v1Impl(this)
    .also { addresses = addresses?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished
starting, have recently failed a readiness check, or have recently failed a liveness check. */
@K8sDslMarker
fun EndpointSubset.notReadyAddresses(init: EndpointAddress.() -> Unit) {
  this as EndpointSubset_core_v1Impl
  EndpointAddress_core_v1Impl(this)
    .also { notReadyAddresses = notReadyAddresses?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Port numbers available on the related IP addresses. */
@K8sDslMarker
fun EndpointSubset.ports(init: EndpointPort.() -> Unit) {
  this as EndpointSubset_core_v1Impl
  EndpointPort_core_v1Impl(this)
    .also { ports = ports?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** conditions contains information about the current status of the endpoint. */
@K8sDslMarker
fun Endpoint.conditions(init: EndpointConditions.() -> Unit) {
  this as Endpoint_discovery_k8s_io_v1Impl
  EndpointConditions_discovery_k8s_io_v1Impl(this)
    .also { conditions = it }
    .apply(init)
}

/** hints contains information associated with how an endpoint should be consumed. */
@K8sDslMarker
fun Endpoint.hints(init: EndpointHints.() -> Unit) {
  this as Endpoint_discovery_k8s_io_v1Impl
  EndpointHints_discovery_k8s_io_v1Impl(this)
    .also { hints = it }
    .apply(init)
}

/** targetRef is a reference to a Kubernetes object that represents this endpoint. */
@K8sDslMarker
fun Endpoint.targetRef(init: ObjectReference.() -> Unit) {
  this as Endpoint_discovery_k8s_io_v1Impl
  ObjectReference_core_v1Impl(this)
    .also { targetRef = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Endpoints.metadata(init: ObjectMeta.() -> Unit) {
  this as Endpoints_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
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
  this as Endpoints_core_v1Impl
  EndpointSubset_core_v1Impl(this)
    .also { subsets = subsets?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** The ConfigMap to select from */
@K8sDslMarker
fun EnvFromSource.configMapRef(init: ConfigMapEnvSource.() -> Unit) {
  this as EnvFromSource_core_v1Impl
  ConfigMapEnvSource_core_v1Impl(this)
    .also { configMapRef = it }
    .apply(init)
}

/** The Secret to select from */
@K8sDslMarker
fun EnvFromSource.secretRef(init: SecretEnvSource.() -> Unit) {
  this as EnvFromSource_core_v1Impl
  SecretEnvSource_core_v1Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** Selects a key of a ConfigMap. */
@K8sDslMarker
fun EnvVarSource.configMapKeyRef(init: ConfigMapKeySelector.() -> Unit) {
  this as EnvVarSource_core_v1Impl
  ConfigMapKeySelector_core_v1Impl(this)
    .also { configMapKeyRef = it }
    .apply(init)
}

/** Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`,
`metadata.annotations['<KEY>']`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs. */
@K8sDslMarker
fun EnvVarSource.fieldRef(init: ObjectFieldSelector.() -> Unit) {
  this as EnvVarSource_core_v1Impl
  ObjectFieldSelector_core_v1Impl(this)
    .also { fieldRef = it }
    .apply(init)
}

/** Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory,
limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported. */
@K8sDslMarker
fun EnvVarSource.resourceFieldRef(init: ResourceFieldSelector.() -> Unit) {
  this as EnvVarSource_core_v1Impl
  ResourceFieldSelector_core_v1Impl(this)
    .also { resourceFieldRef = it }
    .apply(init)
}

/** Selects a key of a secret in the pod's namespace */
@K8sDslMarker
fun EnvVarSource.secretKeyRef(init: SecretKeySelector.() -> Unit) {
  this as EnvVarSource_core_v1Impl
  SecretKeySelector_core_v1Impl(this)
    .also { secretKeyRef = it }
    .apply(init)
}

/** Source for the environment variable's value. Cannot be used if value is not empty. */
@K8sDslMarker
fun EnvVar.valueFrom(init: EnvVarSource.() -> Unit) {
  this as EnvVar_core_v1Impl
  EnvVarSource_core_v1Impl(this)
    .also { valueFrom = it }
    .apply(init)
}

/** List of environment variables to set in the container. Cannot be updated. */
@K8sDslMarker
fun EphemeralContainer.env(init: EnvVar.() -> Unit) {
  this as EphemeralContainer_core_v1Impl
  EnvVar_core_v1Impl(this)
    .also { env = env?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of sources to populate environment variables in the container. The keys defined within a source must be a
C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in
multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a
duplicate key will take precedence. Cannot be updated. */
@K8sDslMarker
fun EphemeralContainer.envFrom(init: EnvFromSource.() -> Unit) {
  this as EphemeralContainer_core_v1Impl
  EnvFromSource_core_v1Impl(this)
    .also { envFrom = envFrom?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Lifecycle is not allowed for ephemeral containers. */
@K8sDslMarker
fun EphemeralContainer.lifecycle(init: Lifecycle.() -> Unit) {
  this as EphemeralContainer_core_v1Impl
  Lifecycle_core_v1Impl(this)
    .also { lifecycle = it }
    .apply(init)
}

/** Probes are not allowed for ephemeral containers. */
@K8sDslMarker
fun EphemeralContainer.livenessProbe(init: Probe.() -> Unit) {
  this as EphemeralContainer_core_v1Impl
  Probe_core_v1Impl(this)
    .also { livenessProbe = it }
    .apply(init)
}

/** Ports are not allowed for ephemeral containers. */
@K8sDslMarker
fun EphemeralContainer.ports(init: ContainerPort.() -> Unit) {
  this as EphemeralContainer_core_v1Impl
  ContainerPort_core_v1Impl(this)
    .also { ports = ports?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Probes are not allowed for ephemeral containers. */
@K8sDslMarker
fun EphemeralContainer.readinessProbe(init: Probe.() -> Unit) {
  this as EphemeralContainer_core_v1Impl
  Probe_core_v1Impl(this)
    .also { readinessProbe = it }
    .apply(init)
}

/** Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the
pod. */
@K8sDslMarker
fun EphemeralContainer.resources(init: ResourceRequirements.() -> Unit) {
  this as EphemeralContainer_core_v1Impl
  ResourceRequirements_core_v1Impl(this)
    .also { resources = it }
    .apply(init)
}

/** Optional: SecurityContext defines the security options the ephemeral container should be run with. If set, the fields of
SecurityContext override the equivalent fields of PodSecurityContext. */
@K8sDslMarker
fun EphemeralContainer.securityContext(init: SecurityContext.() -> Unit) {
  this as EphemeralContainer_core_v1Impl
  SecurityContext_core_v1Impl(this)
    .also { securityContext = it }
    .apply(init)
}

/** Probes are not allowed for ephemeral containers. */
@K8sDslMarker
fun EphemeralContainer.startupProbe(init: Probe.() -> Unit) {
  this as EphemeralContainer_core_v1Impl
  Probe_core_v1Impl(this)
    .also { startupProbe = it }
    .apply(init)
}

/** volumeDevices is the list of block devices to be used by the container. */
@K8sDslMarker
fun EphemeralContainer.volumeDevices(init: VolumeDevice.() -> Unit) {
  this as EphemeralContainer_core_v1Impl
  VolumeDevice_core_v1Impl(this)
    .also { volumeDevices = volumeDevices?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Pod volumes to mount into the container's filesystem. Subpath mounts are not allowed for ephemeral containers. Cannot be
updated. */
@K8sDslMarker
fun EphemeralContainer.volumeMounts(init: VolumeMount.() -> Unit) {
  this as EphemeralContainer_core_v1Impl
  VolumeMount_core_v1Impl(this)
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
  this as EphemeralVolumeSource_core_v1Impl
  PersistentVolumeClaimTemplate_core_v1Impl(this)
    .also { volumeClaimTemplate = it }
    .apply(init)
}

/** lastObservedTime is the time when last Event from the series was seen before last heartbeat. */
@K8sDslMarker
fun EventSeries.lastObservedTime(init: MicroTime.() -> Unit) {
  this as EventSeries_events_k8s_io_v1Impl
  MicroTime_meta_v1Impl(this)
    .also { lastObservedTime = it }
    .apply(init)
}

/** deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type. */
@K8sDslMarker
fun Event.deprecatedFirstTimestamp(init: Time.() -> Unit) {
  this as Event_events_k8s_io_v1Impl
  Time_meta_v1Impl(this)
    .also { deprecatedFirstTimestamp = it }
    .apply(init)
}

/** deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type. */
@K8sDslMarker
fun Event.deprecatedLastTimestamp(init: Time.() -> Unit) {
  this as Event_events_k8s_io_v1Impl
  Time_meta_v1Impl(this)
    .also { deprecatedLastTimestamp = it }
    .apply(init)
}

/** deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type. */
@K8sDslMarker
fun Event.deprecatedSource(init: EventSource.() -> Unit) {
  this as Event_events_k8s_io_v1Impl
  EventSource_core_v1Impl(this)
    .also { deprecatedSource = it }
    .apply(init)
}

/** eventTime is the time when this Event was first observed. It is required. */
@K8sDslMarker
fun Event.eventTime(init: MicroTime.() -> Unit) {
  this as Event_events_k8s_io_v1Impl
  MicroTime_meta_v1Impl(this)
    .also { eventTime = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Event.metadata(init: ObjectMeta.() -> Unit) {
  this as Event_events_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g.
ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet
object. */
@K8sDslMarker
fun Event.regarding(init: ObjectReference.() -> Unit) {
  this as Event_events_k8s_io_v1Impl
  ObjectReference_core_v1Impl(this)
    .also { regarding = it }
    .apply(init)
}

/** related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or
deletion of related object. */
@K8sDslMarker
fun Event.related(init: ObjectReference.() -> Unit) {
  this as Event_events_k8s_io_v1Impl
  ObjectReference_core_v1Impl(this)
    .also { related = it }
    .apply(init)
}

/** series is data about the Event series this event represents or nil if it's a singleton Event. */
@K8sDslMarker
fun Event.series(init: EventSeries.() -> Unit) {
  this as Event_events_k8s_io_v1Impl
  EventSeries_events_k8s_io_v1Impl(this)
    .also { series = it }
    .apply(init)
}

/** DeleteOptions may be provided */
@K8sDslMarker
fun Eviction.deleteOptions(init: DeleteOptions.() -> Unit) {
  this as Eviction_policy_v1Impl
  DeleteOptions_meta_v1Impl(this)
    .also { deleteOptions = it }
    .apply(init)
}

/** ObjectMeta describes the pod that is being evicted. */
@K8sDslMarker
fun Eviction.metadata(init: ObjectMeta.() -> Unit) {
  this as Eviction_policy_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** metric identifies the target metric by name and selector */
@K8sDslMarker
fun ExternalMetricSource.metric(init: MetricIdentifier.() -> Unit) {
  this as ExternalMetricSource_autoscaling_v2Impl
  MetricIdentifier_autoscaling_v2Impl(this)
    .also { metric = it }
    .apply(init)
}

/** target specifies the target value for the given metric */
@K8sDslMarker
fun ExternalMetricSource.target(init: MetricTarget.() -> Unit) {
  this as ExternalMetricSource_autoscaling_v2Impl
  MetricTarget_autoscaling_v2Impl(this)
    .also { target = it }
    .apply(init)
}

/** current contains the current value for the given metric */
@K8sDslMarker
fun ExternalMetricStatus.current(init: MetricValueStatus.() -> Unit) {
  this as ExternalMetricStatus_autoscaling_v2Impl
  MetricValueStatus_autoscaling_v2Impl(this)
    .also { current = it }
    .apply(init)
}

/** metric identifies the target metric by name and selector */
@K8sDslMarker
fun ExternalMetricStatus.metric(init: MetricIdentifier.() -> Unit) {
  this as ExternalMetricStatus_autoscaling_v2Impl
  MetricIdentifier_autoscaling_v2Impl(this)
    .also { metric = it }
    .apply(init)
}

/** ranges are the allowed ranges of fs groups. If you would like to force a single fs group then supply a single range with
the same start and end. Required for MustRunAs. */
@K8sDslMarker
fun FSGroupStrategyOptions.ranges(init: IDRange.() -> Unit) {
  this as FSGroupStrategyOptions_policy_v1beta1Impl
  IDRange_policy_v1beta1Impl(this)
    .also { ranges = ranges?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** secretRef is Optional: SecretRef is reference to the secret object containing sensitive information to pass to the
plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret,
all secrets are passed to the plugin scripts. */
@K8sDslMarker
fun FlexPersistentVolumeSource.secretRef(init: SecretReference.() -> Unit) {
  this as FlexPersistentVolumeSource_core_v1Impl
  SecretReference_core_v1Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** secretRef is Optional: secretRef is reference to the secret object containing sensitive information to pass to the
plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret,
all secrets are passed to the plugin scripts. */
@K8sDslMarker
fun FlexVolumeSource.secretRef(init: LocalObjectReference.() -> Unit) {
  this as FlexVolumeSource_core_v1Impl
  LocalObjectReference_core_v1Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** `lastTransitionTime` is the last time the condition transitioned from one status to another. */
@K8sDslMarker
fun FlowSchemaCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1beta2Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** `metadata` is the standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun FlowSchema.metadata(init: ObjectMeta.() -> Unit) {
  this as FlowSchema_flowcontrol_apiserver_k8s_io_v1beta2Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** `spec` is the specification of the desired behavior of a FlowSchema. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun FlowSchema.spec(init: Flowschemaspec.() -> Unit) {
  this as FlowSchema_flowcontrol_apiserver_k8s_io_v1beta2Impl
  Flowschemaspec_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { spec = it }
    .apply(init)
}

/** `status` is the current status of a FlowSchema. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun FlowSchema.status(init: Flowschemastatus.() -> Unit) {
  this as FlowSchema_flowcontrol_apiserver_k8s_io_v1beta2Impl
  Flowschemastatus_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { status = it }
    .apply(init)
}

/** policies is a list of potential scaling polices which can be used during scaling. At least one policy must be specified,
otherwise the HPAScalingRules will be discarded as invalid */
@K8sDslMarker
fun HPAScalingRules.policies(init: HPAScalingPolicy.() -> Unit) {
  this as HPAScalingRules_autoscaling_v2Impl
  HPAScalingPolicy_autoscaling_v2Impl(this)
    .also { policies = policies?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Custom headers to set in the request. HTTP allows repeated headers. */
@K8sDslMarker
fun HTTPGetAction.httpHeaders(init: HTTPHeader.() -> Unit) {
  this as HTTPGetAction_core_v1Impl
  HTTPHeader_core_v1Impl(this)
    .also { httpHeaders = httpHeaders?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
IANA_SVC_NAME. */
@K8sDslMarker
fun HTTPGetAction.port(string: String) {
  this as HTTPGetAction_core_v1Impl
  de.loosetie.k8s.dsl.types.IntOrString(string)
    .also { port = it }
}

/** Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
IANA_SVC_NAME. */
@K8sDslMarker
fun HTTPGetAction.port(int: Int) {
  this as HTTPGetAction_core_v1Impl
  de.loosetie.k8s.dsl.types.IntOrString(int)
    .also { port = it }
}

/** Backend defines the referenced service endpoint to which the traffic will be forwarded to. */
@K8sDslMarker
fun HTTPIngressPath.backend(init: IngressBackend.() -> Unit) {
  this as HTTPIngressPath_networking_k8s_io_v1Impl
  IngressBackend_networking_k8s_io_v1Impl(this)
    .also { backend = it }
    .apply(init)
}

/** A collection of paths that map requests to backends. */
@K8sDslMarker
fun HTTPIngressRuleValue.paths(init: HTTPIngressPath.() -> Unit) {
  this as HTTPIngressRuleValue_networking_k8s_io_v1Impl
  HTTPIngressPath_networking_k8s_io_v1Impl(this)
    .also { paths = paths?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to scale down to minReplicas
pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used). */
@K8sDslMarker
fun HorizontalPodAutoscalerBehavior.scaleDown(init: HPAScalingRules.() -> Unit) {
  this as HorizontalPodAutoscalerBehavior_autoscaling_v2Impl
  HPAScalingRules_autoscaling_v2Impl(this)
    .also { scaleDown = it }
    .apply(init)
}

/** scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of: `*` increase no more than 4
pods per 60 seconds `*` double the number of pods per 60 seconds No stabilization is used. */
@K8sDslMarker
fun HorizontalPodAutoscalerBehavior.scaleUp(init: HPAScalingRules.() -> Unit) {
  this as HorizontalPodAutoscalerBehavior_autoscaling_v2Impl
  HPAScalingRules_autoscaling_v2Impl(this)
    .also { scaleUp = it }
    .apply(init)
}

/** lastTransitionTime is the last time the condition transitioned from one status to another */
@K8sDslMarker
fun HorizontalPodAutoscalerCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as HorizontalPodAutoscalerCondition_autoscaling_v2Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** metadata is the standard object metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun HorizontalPodAutoscaler.metadata(init: ObjectMeta.() -> Unit) {
  this as HorizontalPodAutoscaler_autoscaling_v2Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** spec is the specification for the behaviour of the autoscaler. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status. */
@K8sDslMarker
fun HorizontalPodAutoscaler.spec(init: Horizontalpodautoscalerspec.() -> Unit) {
  this as HorizontalPodAutoscaler_autoscaling_v2Impl
  Horizontalpodautoscalerspec_autoscaling_v2Impl(this)
    .also { spec = it }
    .apply(init)
}

/** status is the current information about the autoscaler. */
@K8sDslMarker
fun HorizontalPodAutoscaler.status(init: Horizontalpodautoscalerstatus.() -> Unit) {
  this as HorizontalPodAutoscaler_autoscaling_v2Impl
  Horizontalpodautoscalerstatus_autoscaling_v2Impl(this)
    .also { status = it }
    .apply(init)
}

/** secretRef is the CHAP Secret for iSCSI target and initiator authentication */
@K8sDslMarker
fun ISCSIPersistentVolumeSource.secretRef(init: SecretReference.() -> Unit) {
  this as ISCSIPersistentVolumeSource_core_v1Impl
  SecretReference_core_v1Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** secretRef is the CHAP Secret for iSCSI target and initiator authentication */
@K8sDslMarker
fun ISCSIVolumeSource.secretRef(init: LocalObjectReference.() -> Unit) {
  this as ISCSIVolumeSource_core_v1Impl
  LocalObjectReference_core_v1Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is
specified, a service.Name and service.Port must not be specified. This is a mutually exclusive setting with "Service". */
@K8sDslMarker
fun IngressBackend.resource(init: TypedLocalObjectReference.() -> Unit) {
  this as IngressBackend_networking_k8s_io_v1Impl
  TypedLocalObjectReference_core_v1Impl(this)
    .also { resource = it }
    .apply(init)
}

/** Service references a Service as a Backend. This is a mutually exclusive setting with "Resource". */
@K8sDslMarker
fun IngressBackend.service(init: IngressServiceBackend.() -> Unit) {
  this as IngressBackend_networking_k8s_io_v1Impl
  IngressServiceBackend_networking_k8s_io_v1Impl(this)
    .also { service = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun IngressClass.metadata(init: ObjectMeta.() -> Unit) {
  this as IngressClass_networking_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec is the desired state of the IngressClass. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun IngressClass.spec(init: Ingressclassspec.() -> Unit) {
  this as IngressClass_networking_k8s_io_v1Impl
  Ingressclassspec_networking_k8s_io_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun IngressRule.http(init: HTTPIngressRuleValue.() -> Unit) {
  this as IngressRule_networking_k8s_io_v1Impl
  HTTPIngressRuleValue_networking_k8s_io_v1Impl(this)
    .also { http = it }
    .apply(init)
}

/** Port of the referenced service. A port name or port number is required for a IngressServiceBackend. */
@K8sDslMarker
fun IngressServiceBackend.port(init: ServiceBackendPort.() -> Unit) {
  this as IngressServiceBackend_networking_k8s_io_v1Impl
  ServiceBackendPort_networking_k8s_io_v1Impl(this)
    .also { port = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Ingress.metadata(init: ObjectMeta.() -> Unit) {
  this as Ingress_networking_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec is the desired state of the Ingress. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Ingress.spec(init: Ingressspec.() -> Unit) {
  this as Ingress_networking_k8s_io_v1Impl
  Ingressspec_networking_k8s_io_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is the current state of the Ingress. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Ingress.status(init: Ingressstatus.() -> Unit) {
  this as Ingress_networking_k8s_io_v1Impl
  Ingressstatus_networking_k8s_io_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.additionalItems(init: JSONSchemaPropsOrBool.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1Impl
  JSONSchemaPropsOrBool_apiextensions_k8s_io_v1Impl(this)
    .also { additionalItems = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.additionalProperties(init: JSONSchemaPropsOrBool.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1Impl
  JSONSchemaPropsOrBool_apiextensions_k8s_io_v1Impl(this)
    .also { additionalProperties = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.allOf(init: JSONSchemaProps.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1Impl
  JSONSchemaProps_apiextensions_k8s_io_v1Impl(this)
    .also { allOf = allOf?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.anyOf(init: JSONSchemaProps.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1Impl
  JSONSchemaProps_apiextensions_k8s_io_v1Impl(this)
    .also { anyOf = anyOf?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting
feature gate. Defaulting requires spec.preserveUnknownFields to be false. */
@K8sDslMarker
fun JSONSchemaProps.default(init: JSON.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1Impl
  JSON_apiextensions_k8s_io_v1Impl(this)
    .also { default = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.enum(init: JSON.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1Impl
  JSON_apiextensions_k8s_io_v1Impl(this)
    .also { enum = enum?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.example(init: JSON.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1Impl
  JSON_apiextensions_k8s_io_v1Impl(this)
    .also { example = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.externalDocs(init: ExternalDocumentation.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1Impl
  ExternalDocumentation_apiextensions_k8s_io_v1Impl(this)
    .also { externalDocs = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.items(init: JSONSchemaPropsOrArray.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1Impl
  JSONSchemaPropsOrArray_apiextensions_k8s_io_v1Impl(this)
    .also { items = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.not(init: JSONSchemaProps.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1Impl
  JSONSchemaProps_apiextensions_k8s_io_v1Impl(this)
    .also { not = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun JSONSchemaProps.oneOf(init: JSONSchemaProps.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1Impl
  JSONSchemaProps_apiextensions_k8s_io_v1Impl(this)
    .also { oneOf = oneOf?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** x-kubernetes-validations describes a list of validation rules written in the CEL expression language. This field is an
alpha-level. Using this field requires the feature gate `CustomResourceValidationExpressions` to be enabled. */
@K8sDslMarker
fun JSONSchemaProps.`x-kubernetes-validations`(init: ValidationRule.() -> Unit) {
  this as JSONSchemaProps_apiextensions_k8s_io_v1Impl
  ValidationRule_apiextensions_k8s_io_v1Impl(this)
    .also { `x-kubernetes-validations` = `x-kubernetes-validations`?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Last time the condition was checked. */
@K8sDslMarker
fun JobCondition.lastProbeTime(init: Time.() -> Unit) {
  this as JobCondition_batch_v1Impl
  Time_meta_v1Impl(this)
    .also { lastProbeTime = it }
    .apply(init)
}

/** Last time the condition transit from one status to another. */
@K8sDslMarker
fun JobCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as JobCondition_batch_v1Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** Standard object's metadata of the jobs created from this template. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun JobTemplateSpec.metadata(init: ObjectMeta.() -> Unit) {
  this as JobTemplateSpec_batch_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired behavior of the job. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun JobTemplateSpec.spec(init: Jobspec.() -> Unit) {
  this as JobTemplateSpec_batch_v1Impl
  Jobspec_batch_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Job.metadata(init: ObjectMeta.() -> Unit) {
  this as Job_batch_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired behavior of a job. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Job.spec(init: Jobspec.() -> Unit) {
  this as Job_batch_v1Impl
  Jobspec_batch_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Current status of a job. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Job.status(init: Jobstatus.() -> Unit) {
  this as Job_batch_v1Impl
  Jobstatus_batch_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** matchExpressions is a list of label selector requirements. The requirements are ANDed. */
@K8sDslMarker
fun LabelSelector.matchExpressions(init: LabelSelectorRequirement.() -> Unit) {
  this as LabelSelector_meta_v1Impl
  LabelSelectorRequirement_meta_v1Impl(this)
    .also { matchExpressions = matchExpressions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Lease.metadata(init: ObjectMeta.() -> Unit) {
  this as Lease_coordination_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the Lease. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Lease.spec(init: Leasespec.() -> Unit) {
  this as Lease_coordination_k8s_io_v1Impl
  Leasespec_coordination_k8s_io_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Exec specifies the action to take. */
@K8sDslMarker
fun LifecycleHandler.exec(init: ExecAction.() -> Unit) {
  this as LifecycleHandler_core_v1Impl
  ExecAction_core_v1Impl(this)
    .also { exec = it }
    .apply(init)
}

/** HTTPGet specifies the http request to perform. */
@K8sDslMarker
fun LifecycleHandler.httpGet(init: HTTPGetAction.() -> Unit) {
  this as LifecycleHandler_core_v1Impl
  HTTPGetAction_core_v1Impl(this)
    .also { httpGet = it }
    .apply(init)
}

/** Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no
validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified. */
@K8sDslMarker
fun LifecycleHandler.tcpSocket(init: TCPSocketAction.() -> Unit) {
  this as LifecycleHandler_core_v1Impl
  TCPSocketAction_core_v1Impl(this)
    .also { tcpSocket = it }
    .apply(init)
}

/** PostStart is called immediately after a container is created. If the handler fails, the container is terminated and
restarted according to its restart policy. Other management of the container blocks until the hook completes. More info:
https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks */
@K8sDslMarker
fun Lifecycle.postStart(init: LifecycleHandler.() -> Unit) {
  this as Lifecycle_core_v1Impl
  LifecycleHandler_core_v1Impl(this)
    .also { postStart = it }
    .apply(init)
}

/** PreStop is called immediately before a container is terminated due to an API request or management event such as
liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes
or exits. The Pod's termination grace period countdown begins before the PreStop hook is executed. Regardless of the
outcome of the handler, the container will eventually terminate within the Pod's termination grace period (unless
delayed by finalizers). Other management of the container blocks until the hook completes or until the termination grace
period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks */
@K8sDslMarker
fun Lifecycle.preStop(init: LifecycleHandler.() -> Unit) {
  this as Lifecycle_core_v1Impl
  LifecycleHandler_core_v1Impl(this)
    .also { preStop = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun LimitRange.metadata(init: ObjectMeta.() -> Unit) {
  this as LimitRange_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the limits enforced. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun LimitRange.spec(init: Limitrangespec.() -> Unit) {
  this as LimitRange_core_v1Impl
  Limitrangespec_core_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** `queuing` holds the configuration parameters for queuing. This field may be non-empty only if `type` is `"Queue"`. */
@K8sDslMarker
fun LimitResponse.queuing(init: QueuingConfiguration.() -> Unit) {
  this as LimitResponse_flowcontrol_apiserver_k8s_io_v1beta2Impl
  QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { queuing = it }
    .apply(init)
}

/** `limitResponse` indicates what to do with requests that can not be executed right now */
@K8sDslMarker
fun LimitedPriorityLevelConfiguration.limitResponse(init: LimitResponse.() -> Unit) {
  this as LimitedPriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta2Impl
  LimitResponse_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { limitResponse = it }
    .apply(init)
}

/** Ports is a list of records of service ports If used, every port defined in the service should have an entry in it */
@K8sDslMarker
fun LoadBalancerIngress.ports(init: PortStatus.() -> Unit) {
  this as LoadBalancerIngress_core_v1Impl
  PortStatus_core_v1Impl(this)
    .also { ports = ports?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to
these ingress points. */
@K8sDslMarker
fun LoadBalancerStatus.ingress(init: LoadBalancerIngress.() -> Unit) {
  this as LoadBalancerStatus_core_v1Impl
  LoadBalancerIngress_core_v1Impl(this)
    .also { ingress = ingress?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard list metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun LocalSubjectAccessReview.metadata(init: ObjectMeta.() -> Unit) {
  this as LocalSubjectAccessReview_authorization_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec holds information about the request being evaluated. spec.namespace must be equal to the namespace you made the
request against. If empty, it is defaulted. */
@K8sDslMarker
fun LocalSubjectAccessReview.spec(init: Subjectaccessreviewspec.() -> Unit) {
  this as LocalSubjectAccessReview_authorization_k8s_io_v1Impl
  Subjectaccessreviewspec_authorization_k8s_io_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is filled in by the server and indicates whether the request is allowed or not */
@K8sDslMarker
fun LocalSubjectAccessReview.status(init: Subjectaccessreviewstatus.() -> Unit) {
  this as LocalSubjectAccessReview_authorization_k8s_io_v1Impl
  Subjectaccessreviewstatus_authorization_k8s_io_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** FieldsV1 holds the first JSON version format as described in the "FieldsV1" type. */
@K8sDslMarker
fun ManagedFieldsEntry.fieldsV1(init: FieldsV1.() -> Unit) {
  this as ManagedFieldsEntry_meta_v1Impl
  FieldsV1_meta_v1Impl(this)
    .also { fieldsV1 = it }
    .apply(init)
}

/** Time is the timestamp of when the ManagedFields entry was added. The timestamp will also be updated if a field is added,
the manager changes any of the owned fields value or removes a field. The timestamp does not update when a field is
removed from the entry because another manager took it over. */
@K8sDslMarker
fun ManagedFieldsEntry.time(init: Time.() -> Unit) {
  this as ManagedFieldsEntry_meta_v1Impl
  Time_meta_v1Impl(this)
    .also { time = it }
    .apply(init)
}

/** selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed
as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will
be used to gather metrics. */
@K8sDslMarker
fun MetricIdentifier.selector(init: LabelSelector.() -> Unit) {
  this as MetricIdentifier_autoscaling_v2Impl
  LabelSelector_meta_v1Impl(this)
    .also { selector = it }
    .apply(init)
}

/** containerResource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes
describing a single container in each pod of the current scale target (e.g. CPU or memory). Such metrics are built in to
Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods"
source. This is an alpha feature and can be enabled by the HPAContainerMetrics feature flag. */
@K8sDslMarker
fun MetricSpec.containerResource(init: ContainerResourceMetricSource.() -> Unit) {
  this as MetricSpec_autoscaling_v2Impl
  ContainerResourceMetricSource_autoscaling_v2Impl(this)
    .also { containerResource = it }
    .apply(init)
}

/** external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on
information coming from components running outside of cluster (for example length of queue in cloud messaging service,
or QPS from loadbalancer running outside of cluster). */
@K8sDslMarker
fun MetricSpec.external(init: ExternalMetricSource.() -> Unit) {
  this as MetricSpec_autoscaling_v2Impl
  ExternalMetricSource_autoscaling_v2Impl(this)
    .also { external = it }
    .apply(init)
}

/** object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object). */
@K8sDslMarker
fun MetricSpec.`object`(init: ObjectMetricSource.() -> Unit) {
  this as MetricSpec_autoscaling_v2Impl
  ObjectMetricSource_autoscaling_v2Impl(this)
    .also { `object` = it }
    .apply(init)
}

/** pods refers to a metric describing each pod in the current scale target (for example,
transactions-processed-per-second). The values will be averaged together before being compared to the target value. */
@K8sDslMarker
fun MetricSpec.pods(init: PodsMetricSource.() -> Unit) {
  this as MetricSpec_autoscaling_v2Impl
  PodsMetricSource_autoscaling_v2Impl(this)
    .also { pods = it }
    .apply(init)
}

/** resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing
each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special
scaling options on top of those available to normal per-pod metrics using the "pods" source. */
@K8sDslMarker
fun MetricSpec.resource(init: ResourceMetricSource.() -> Unit) {
  this as MetricSpec_autoscaling_v2Impl
  ResourceMetricSource_autoscaling_v2Impl(this)
    .also { resource = it }
    .apply(init)
}

/** container resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes
describing a single container in each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to
Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods"
source. */
@K8sDslMarker
fun MetricStatus.containerResource(init: ContainerResourceMetricStatus.() -> Unit) {
  this as MetricStatus_autoscaling_v2Impl
  ContainerResourceMetricStatus_autoscaling_v2Impl(this)
    .also { containerResource = it }
    .apply(init)
}

/** external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on
information coming from components running outside of cluster (for example length of queue in cloud messaging service,
or QPS from loadbalancer running outside of cluster). */
@K8sDslMarker
fun MetricStatus.external(init: ExternalMetricStatus.() -> Unit) {
  this as MetricStatus_autoscaling_v2Impl
  ExternalMetricStatus_autoscaling_v2Impl(this)
    .also { external = it }
    .apply(init)
}

/** object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object). */
@K8sDslMarker
fun MetricStatus.`object`(init: ObjectMetricStatus.() -> Unit) {
  this as MetricStatus_autoscaling_v2Impl
  ObjectMetricStatus_autoscaling_v2Impl(this)
    .also { `object` = it }
    .apply(init)
}

/** pods refers to a metric describing each pod in the current scale target (for example,
transactions-processed-per-second). The values will be averaged together before being compared to the target value. */
@K8sDslMarker
fun MetricStatus.pods(init: PodsMetricStatus.() -> Unit) {
  this as MetricStatus_autoscaling_v2Impl
  PodsMetricStatus_autoscaling_v2Impl(this)
    .also { pods = it }
    .apply(init)
}

/** resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing
each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special
scaling options on top of those available to normal per-pod metrics using the "pods" source. */
@K8sDslMarker
fun MetricStatus.resource(init: ResourceMetricStatus.() -> Unit) {
  this as MetricStatus_autoscaling_v2Impl
  ResourceMetricStatus_autoscaling_v2Impl(this)
    .also { resource = it }
    .apply(init)
}

/** averageValue is the target value of the average of the metric across all relevant pods (as a quantity) */
@K8sDslMarker
fun MetricTarget.averageValue(init: Quantity.() -> Unit) {
  this as MetricTarget_autoscaling_v2Impl
  Quantity_core_resourceImpl(this)
    .also { averageValue = it }
    .apply(init)
}

/** value is the target value of the metric (as a quantity). */
@K8sDslMarker
fun MetricTarget.value(init: Quantity.() -> Unit) {
  this as MetricTarget_autoscaling_v2Impl
  Quantity_core_resourceImpl(this)
    .also { value = it }
    .apply(init)
}

/** averageValue is the current value of the average of the metric across all relevant pods (as a quantity) */
@K8sDslMarker
fun MetricValueStatus.averageValue(init: Quantity.() -> Unit) {
  this as MetricValueStatus_autoscaling_v2Impl
  Quantity_core_resourceImpl(this)
    .also { averageValue = it }
    .apply(init)
}

/** value is the current value of the metric (as a quantity). */
@K8sDslMarker
fun MetricValueStatus.value(init: Quantity.() -> Unit) {
  this as MetricValueStatus_autoscaling_v2Impl
  Quantity_core_resourceImpl(this)
    .also { value = it }
    .apply(init)
}

/** Standard object metadata; More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata. */
@K8sDslMarker
fun MutatingWebhookConfiguration.metadata(init: ObjectMeta.() -> Unit) {
  this as MutatingWebhookConfiguration_admissionregistration_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Webhooks is a list of webhooks and the affected resources and operations. */
@K8sDslMarker
fun MutatingWebhookConfiguration.webhooks(init: MutatingWebhook.() -> Unit) {
  this as MutatingWebhookConfiguration_admissionregistration_k8s_io_v1Impl
  MutatingWebhook_admissionregistration_k8s_io_v1Impl(this)
    .also { webhooks = webhooks?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** ClientConfig defines how to communicate with the hook. Required */
@K8sDslMarker
fun MutatingWebhook.clientConfig(init: WebhookClientConfig.() -> Unit) {
  this as MutatingWebhook_admissionregistration_k8s_io_v1Impl
  WebhookClientConfig_admissionregistration_k8s_io_v1Impl(this)
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
  this as MutatingWebhook_admissionregistration_k8s_io_v1Impl
  LabelSelector_meta_v1Impl(this)
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
  this as MutatingWebhook_admissionregistration_k8s_io_v1Impl
  LabelSelector_meta_v1Impl(this)
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
  this as MutatingWebhook_admissionregistration_k8s_io_v1Impl
  RuleWithOperations_admissionregistration_k8s_io_v1Impl(this)
    .also { rules = rules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun NamespaceCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as NamespaceCondition_core_v1Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Namespace.metadata(init: ObjectMeta.() -> Unit) {
  this as Namespace_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the behavior of the Namespace. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Namespace.spec(init: Namespacespec.() -> Unit) {
  this as Namespace_core_v1Impl
  Namespacespec_core_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status describes the current status of a Namespace. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Namespace.status(init: Namespacestatus.() -> Unit) {
  this as Namespace_core_v1Impl
  Namespacestatus_core_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is
empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at
least one item, then this rule allows traffic only if the traffic matches at least one port in the list. */
@K8sDslMarker
fun NetworkPolicyEgressRule.ports(init: NetworkPolicyPort.() -> Unit) {
  this as NetworkPolicyEgressRule_networking_k8s_io_v1Impl
  NetworkPolicyPort_networking_k8s_io_v1Impl(this)
    .also { ports = ports?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a
logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by
destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic
matches at least one item in the to list. */
@K8sDslMarker
fun NetworkPolicyEgressRule.to(init: NetworkPolicyPeer.() -> Unit) {
  this as NetworkPolicyEgressRule_networking_k8s_io_v1Impl
  NetworkPolicyPeer_networking_k8s_io_v1Impl(this)
    .also { to = to?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a
logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by
source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches
at least one item in the from list. */
@K8sDslMarker
fun NetworkPolicyIngressRule.from(init: NetworkPolicyPeer.() -> Unit) {
  this as NetworkPolicyIngressRule_networking_k8s_io_v1Impl
  NetworkPolicyPeer_networking_k8s_io_v1Impl(this)
    .also { from = from?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined
using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If
this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least
one port in the list. */
@K8sDslMarker
fun NetworkPolicyIngressRule.ports(init: NetworkPolicyPort.() -> Unit) {
  this as NetworkPolicyIngressRule_networking_k8s_io_v1Impl
  NetworkPolicyPort_networking_k8s_io_v1Impl(this)
    .also { ports = ports?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be. */
@K8sDslMarker
fun NetworkPolicyPeer.ipBlock(init: IPBlock.() -> Unit) {
  this as NetworkPolicyPeer_networking_k8s_io_v1Impl
  IPBlock_networking_k8s_io_v1Impl(this)
    .also { ipBlock = it }
    .apply(init)
}

/** Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but
empty, it selects all namespaces. If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods
matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces
selected by NamespaceSelector. */
@K8sDslMarker
fun NetworkPolicyPeer.namespaceSelector(init: LabelSelector.() -> Unit) {
  this as NetworkPolicyPeer_networking_k8s_io_v1Impl
  LabelSelector_meta_v1Impl(this)
    .also { namespaceSelector = it }
    .apply(init)
}

/** This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty,
it selects all pods. If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching
PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the
policy's own Namespace. */
@K8sDslMarker
fun NetworkPolicyPeer.podSelector(init: LabelSelector.() -> Unit) {
  this as NetworkPolicyPeer_networking_k8s_io_v1Impl
  LabelSelector_meta_v1Impl(this)
    .also { podSelector = it }
    .apply(init)
}

/** The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided,
this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched. */
@K8sDslMarker
fun NetworkPolicyPort.port(string: String) {
  this as NetworkPolicyPort_networking_k8s_io_v1Impl
  de.loosetie.k8s.dsl.types.IntOrString(string)
    .also { port = it }
}

/** The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided,
this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched. */
@K8sDslMarker
fun NetworkPolicyPort.port(int: Int) {
  this as NetworkPolicyPort_networking_k8s_io_v1Impl
  de.loosetie.k8s.dsl.types.IntOrString(int)
    .also { port = it }
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun NetworkPolicy.metadata(init: ObjectMeta.() -> Unit) {
  this as NetworkPolicy_networking_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired behavior for this NetworkPolicy. */
@K8sDslMarker
fun NetworkPolicy.spec(init: Networkpolicyspec.() -> Unit) {
  this as NetworkPolicy_networking_k8s_io_v1Impl
  Networkpolicyspec_networking_k8s_io_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is the current state of the NetworkPolicy. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun NetworkPolicy.status(init: Networkpolicystatus.() -> Unit) {
  this as NetworkPolicy_networking_k8s_io_v1Impl
  Networkpolicystatus_networking_k8s_io_v1Impl(this)
    .also { status = it }
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
  this as NodeAffinity_core_v1Impl
  PreferredSchedulingTerm_core_v1Impl(this)
    .also { preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto
the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g.
due to an update), the system may or may not try to eventually evict the pod from its node. */
@K8sDslMarker
fun NodeAffinity.requiredDuringSchedulingIgnoredDuringExecution(init: NodeSelector.() -> Unit) {
  this as NodeAffinity_core_v1Impl
  NodeSelector_core_v1Impl(this)
    .also { requiredDuringSchedulingIgnoredDuringExecution = it }
    .apply(init)
}

/** Last time we got an update on a given condition. */
@K8sDslMarker
fun NodeCondition.lastHeartbeatTime(init: Time.() -> Unit) {
  this as NodeCondition_core_v1Impl
  Time_meta_v1Impl(this)
    .also { lastHeartbeatTime = it }
    .apply(init)
}

/** Last time the condition transit from one status to another. */
@K8sDslMarker
fun NodeCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as NodeCondition_core_v1Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** ConfigMap is a reference to a Node's ConfigMap */
@K8sDslMarker
fun NodeConfigSource.configMap(init: ConfigMapNodeConfigSource.() -> Unit) {
  this as NodeConfigSource_core_v1Impl
  ConfigMapNodeConfigSource_core_v1Impl(this)
    .also { configMap = it }
    .apply(init)
}

/** Active reports the checkpointed config the node is actively using. Active will represent either the current version of
the Assigned config, or the current LastKnownGood config, depending on whether attempting to use the Assigned config
results in an error. */
@K8sDslMarker
fun NodeConfigStatus.active(init: NodeConfigSource.() -> Unit) {
  this as NodeConfigStatus_core_v1Impl
  NodeConfigSource_core_v1Impl(this)
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
  this as NodeConfigStatus_core_v1Impl
  NodeConfigSource_core_v1Impl(this)
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
  this as NodeConfigStatus_core_v1Impl
  NodeConfigSource_core_v1Impl(this)
    .also { lastKnownGood = it }
    .apply(init)
}

/** Endpoint on which Kubelet is listening. */
@K8sDslMarker
fun NodeDaemonEndpoints.kubeletEndpoint(init: DaemonEndpoint.() -> Unit) {
  this as NodeDaemonEndpoints_core_v1Impl
  DaemonEndpoint_core_v1Impl(this)
    .also { kubeletEndpoint = it }
    .apply(init)
}

/** A list of node selector requirements by node's labels. */
@K8sDslMarker
fun NodeSelectorTerm.matchExpressions(init: NodeSelectorRequirement.() -> Unit) {
  this as NodeSelectorTerm_core_v1Impl
  NodeSelectorRequirement_core_v1Impl(this)
    .also { matchExpressions = matchExpressions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** A list of node selector requirements by node's fields. */
@K8sDslMarker
fun NodeSelectorTerm.matchFields(init: NodeSelectorRequirement.() -> Unit) {
  this as NodeSelectorTerm_core_v1Impl
  NodeSelectorRequirement_core_v1Impl(this)
    .also { matchFields = matchFields?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Required. A list of node selector terms. The terms are ORed. */
@K8sDslMarker
fun NodeSelector.nodeSelectorTerms(init: NodeSelectorTerm.() -> Unit) {
  this as NodeSelector_core_v1Impl
  NodeSelectorTerm_core_v1Impl(this)
    .also { nodeSelectorTerms = nodeSelectorTerms?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Node.metadata(init: ObjectMeta.() -> Unit) {
  this as Node_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the behavior of a node.
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Node.spec(init: Nodespec.() -> Unit) {
  this as Node_core_v1Impl
  Nodespec_core_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Most recently observed status of the node. Populated by the system. Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Node.status(init: Nodestatus.() -> Unit) {
  this as Node_core_v1Impl
  Nodestatus_core_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be
set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339
form and is in UTC. Populated by the system. Read-only. Null for lists. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun ObjectMeta.creationTimestamp(init: Time.() -> Unit) {
  this as ObjectMeta_meta_v1Impl
  Time_meta_v1Impl(this)
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
  this as ObjectMeta_meta_v1Impl
  Time_meta_v1Impl(this)
    .also { deletionTimestamp = it }
    .apply(init)
}

/** ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow. This is mostly for
internal housekeeping, and users typically shouldn't need to set or understand this field. A workflow can be the user's
name, a controller's name, or the name of a specific apply path like "ci-cd". The set of fields is always in the version
that the workflow used when modifying the object. */
@K8sDslMarker
fun ObjectMeta.managedFields(init: ManagedFieldsEntry.() -> Unit) {
  this as ObjectMeta_meta_v1Impl
  ManagedFieldsEntry_meta_v1Impl(this)
    .also { managedFields = managedFields?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage
collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the
controller field set to true. There cannot be more than one managing controller. */
@K8sDslMarker
fun ObjectMeta.ownerReferences(init: OwnerReference.() -> Unit) {
  this as ObjectMeta_meta_v1Impl
  OwnerReference_meta_v1Impl(this)
    .also { ownerReferences = ownerReferences?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** describedObject specifies the descriptions of a object,such as kind,name apiVersion */
@K8sDslMarker
fun ObjectMetricSource.describedObject(init: CrossVersionObjectReference.() -> Unit) {
  this as ObjectMetricSource_autoscaling_v2Impl
  CrossVersionObjectReference_autoscaling_v2Impl(this)
    .also { describedObject = it }
    .apply(init)
}

/** metric identifies the target metric by name and selector */
@K8sDslMarker
fun ObjectMetricSource.metric(init: MetricIdentifier.() -> Unit) {
  this as ObjectMetricSource_autoscaling_v2Impl
  MetricIdentifier_autoscaling_v2Impl(this)
    .also { metric = it }
    .apply(init)
}

/** target specifies the target value for the given metric */
@K8sDslMarker
fun ObjectMetricSource.target(init: MetricTarget.() -> Unit) {
  this as ObjectMetricSource_autoscaling_v2Impl
  MetricTarget_autoscaling_v2Impl(this)
    .also { target = it }
    .apply(init)
}

/** current contains the current value for the given metric */
@K8sDslMarker
fun ObjectMetricStatus.current(init: MetricValueStatus.() -> Unit) {
  this as ObjectMetricStatus_autoscaling_v2Impl
  MetricValueStatus_autoscaling_v2Impl(this)
    .also { current = it }
    .apply(init)
}

/** DescribedObject specifies the descriptions of a object,such as kind,name apiVersion */
@K8sDslMarker
fun ObjectMetricStatus.describedObject(init: CrossVersionObjectReference.() -> Unit) {
  this as ObjectMetricStatus_autoscaling_v2Impl
  CrossVersionObjectReference_autoscaling_v2Impl(this)
    .also { describedObject = it }
    .apply(init)
}

/** metric identifies the target metric by name and selector */
@K8sDslMarker
fun ObjectMetricStatus.metric(init: MetricIdentifier.() -> Unit) {
  this as ObjectMetricStatus_autoscaling_v2Impl
  MetricIdentifier_autoscaling_v2Impl(this)
    .also { metric = it }
    .apply(init)
}

/** lastProbeTime is the time we probed the condition. */
@K8sDslMarker
fun PersistentVolumeClaimCondition.lastProbeTime(init: Time.() -> Unit) {
  this as PersistentVolumeClaimCondition_core_v1Impl
  Time_meta_v1Impl(this)
    .also { lastProbeTime = it }
    .apply(init)
}

/** lastTransitionTime is the time the condition transitioned from one status to another. */
@K8sDslMarker
fun PersistentVolumeClaimCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as PersistentVolumeClaimCondition_core_v1Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and
will be rejected during validation. */
@K8sDslMarker
fun PersistentVolumeClaimTemplate.metadata(init: ObjectMeta.() -> Unit) {
  this as PersistentVolumeClaimTemplate_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created
from this template. The same fields as in a PersistentVolumeClaim are also valid here. */
@K8sDslMarker
fun PersistentVolumeClaimTemplate.spec(init: Persistentvolumeclaimspec.() -> Unit) {
  this as PersistentVolumeClaimTemplate_core_v1Impl
  Persistentvolumeclaimspec_core_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun PersistentVolumeClaim.metadata(init: ObjectMeta.() -> Unit) {
  this as PersistentVolumeClaim_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** spec defines the desired characteristics of a volume requested by a pod author. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
@K8sDslMarker
fun PersistentVolumeClaim.spec(init: Persistentvolumeclaimspec.() -> Unit) {
  this as PersistentVolumeClaim_core_v1Impl
  Persistentvolumeclaimspec_core_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** status represents the current information/status of a persistent volume claim. Read-only. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
@K8sDslMarker
fun PersistentVolumeClaim.status(init: Persistentvolumeclaimstatus.() -> Unit) {
  this as PersistentVolumeClaim_core_v1Impl
  Persistentvolumeclaimstatus_core_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun PersistentVolume.metadata(init: ObjectMeta.() -> Unit) {
  this as PersistentVolume_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** spec defines a specification of a persistent volume owned by the cluster. Provisioned by an administrator. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes */
@K8sDslMarker
fun PersistentVolume.spec(init: Persistentvolumespec.() -> Unit) {
  this as PersistentVolume_core_v1Impl
  Persistentvolumespec_core_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** status represents the current information/status for the persistent volume. Populated by the system. Read-only. More
info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes */
@K8sDslMarker
fun PersistentVolume.status(init: Persistentvolumestatus.() -> Unit) {
  this as PersistentVolume_core_v1Impl
  Persistentvolumestatus_core_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** A label query over a set of resources, in this case pods. */
@K8sDslMarker
fun PodAffinityTerm.labelSelector(init: LabelSelector.() -> Unit) {
  this as PodAffinityTerm_core_v1Impl
  LabelSelector_meta_v1Impl(this)
    .also { labelSelector = it }
    .apply(init)
}

/** A label query over the set of namespaces that the term applies to. The term is applied to the union of the namespaces
selected by this field and the ones listed in the namespaces field. null selector and null or empty namespaces list
means "this pod's namespace". An empty selector ({}) matches all namespaces. */
@K8sDslMarker
fun PodAffinityTerm.namespaceSelector(init: LabelSelector.() -> Unit) {
  this as PodAffinityTerm_core_v1Impl
  LabelSelector_meta_v1Impl(this)
    .also { namespaceSelector = it }
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
  this as PodAffinity_core_v1Impl
  WeightedPodAffinityTerm_core_v1Impl(this)
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
  this as PodAffinity_core_v1Impl
  PodAffinityTerm_core_v1Impl(this)
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
  this as PodAntiAffinity_core_v1Impl
  WeightedPodAffinityTerm_core_v1Impl(this)
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
  this as PodAntiAffinity_core_v1Impl
  PodAffinityTerm_core_v1Impl(this)
    .also { requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Last time we probed the condition. */
@K8sDslMarker
fun PodCondition.lastProbeTime(init: Time.() -> Unit) {
  this as PodCondition_core_v1Impl
  Time_meta_v1Impl(this)
    .also { lastProbeTime = it }
    .apply(init)
}

/** Last time the condition transitioned from one status to another. */
@K8sDslMarker
fun PodCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as PodCondition_core_v1Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries
will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy. */
@K8sDslMarker
fun PodDNSConfig.options(init: PodDNSConfigOption.() -> Unit) {
  this as PodDNSConfig_core_v1Impl
  PodDNSConfigOption_core_v1Impl(this)
    .also { options = options?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun PodDisruptionBudget.metadata(init: ObjectMeta.() -> Unit) {
  this as PodDisruptionBudget_policy_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired behavior of the PodDisruptionBudget. */
@K8sDslMarker
fun PodDisruptionBudget.spec(init: Poddisruptionbudgetspec.() -> Unit) {
  this as PodDisruptionBudget_policy_v1Impl
  Poddisruptionbudgetspec_policy_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Most recently observed status of the PodDisruptionBudget. */
@K8sDslMarker
fun PodDisruptionBudget.status(init: Poddisruptionbudgetstatus.() -> Unit) {
  this as PodDisruptionBudget_policy_v1Impl
  Poddisruptionbudgetstatus_policy_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random
SELinux context for each container. May also be set in SecurityContext. If set in both SecurityContext and
PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field
cannot be set when spec.os.name is windows. */
@K8sDslMarker
fun PodSecurityContext.seLinuxOptions(init: SELinuxOptions.() -> Unit) {
  this as PodSecurityContext_core_v1Impl
  SELinuxOptions_core_v1Impl(this)
    .also { seLinuxOptions = it }
    .apply(init)
}

/** The seccomp options to use by the containers in this pod. Note that this field cannot be set when spec.os.name is
windows. */
@K8sDslMarker
fun PodSecurityContext.seccompProfile(init: SeccompProfile.() -> Unit) {
  this as PodSecurityContext_core_v1Impl
  SeccompProfile_core_v1Impl(this)
    .also { seccompProfile = it }
    .apply(init)
}

/** Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime)
might fail to launch. Note that this field cannot be set when spec.os.name is windows. */
@K8sDslMarker
fun PodSecurityContext.sysctls(init: Sysctl.() -> Unit) {
  this as PodSecurityContext_core_v1Impl
  Sysctl_core_v1Impl(this)
    .also { sysctls = sysctls?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** The Windows specific settings applied to all containers. If unspecified, the options within a container's
SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in
SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is linux. */
@K8sDslMarker
fun PodSecurityContext.windowsOptions(init: WindowsSecurityContextOptions.() -> Unit) {
  this as PodSecurityContext_core_v1Impl
  WindowsSecurityContextOptions_core_v1Impl(this)
    .also { windowsOptions = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun PodSecurityPolicy.metadata(init: ObjectMeta.() -> Unit) {
  this as PodSecurityPolicy_policy_v1beta1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** spec defines the policy enforced. */
@K8sDslMarker
fun PodSecurityPolicy.spec(init: Podsecuritypolicyspec.() -> Unit) {
  this as PodSecurityPolicy_policy_v1beta1Impl
  Podsecuritypolicyspec_policy_v1beta1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun PodTemplate.metadata(init: ObjectMeta.() -> Unit) {
  this as PodTemplate_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Template defines the pods that will be created from this pod template.
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun PodTemplate.template(init: Podtemplatespec.() -> Unit) {
  this as PodTemplate_core_v1Impl
  Podtemplatespec_core_v1Impl(this)
    .also { template = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Pod.metadata(init: ObjectMeta.() -> Unit) {
  this as Pod_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired behavior of the pod. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Pod.spec(init: Podspec.() -> Unit) {
  this as Pod_core_v1Impl
  Podspec_core_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Most recently observed status of the pod. This data may not be up to date. Populated by the system. Read-only. More
info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Pod.status(init: Podstatus.() -> Unit) {
  this as Pod_core_v1Impl
  Podstatus_core_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** metric identifies the target metric by name and selector */
@K8sDslMarker
fun PodsMetricSource.metric(init: MetricIdentifier.() -> Unit) {
  this as PodsMetricSource_autoscaling_v2Impl
  MetricIdentifier_autoscaling_v2Impl(this)
    .also { metric = it }
    .apply(init)
}

/** target specifies the target value for the given metric */
@K8sDslMarker
fun PodsMetricSource.target(init: MetricTarget.() -> Unit) {
  this as PodsMetricSource_autoscaling_v2Impl
  MetricTarget_autoscaling_v2Impl(this)
    .also { target = it }
    .apply(init)
}

/** current contains the current value for the given metric */
@K8sDslMarker
fun PodsMetricStatus.current(init: MetricValueStatus.() -> Unit) {
  this as PodsMetricStatus_autoscaling_v2Impl
  MetricValueStatus_autoscaling_v2Impl(this)
    .also { current = it }
    .apply(init)
}

/** metric identifies the target metric by name and selector */
@K8sDslMarker
fun PodsMetricStatus.metric(init: MetricIdentifier.() -> Unit) {
  this as PodsMetricStatus_autoscaling_v2Impl
  MetricIdentifier_autoscaling_v2Impl(this)
    .also { metric = it }
    .apply(init)
}

/** `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the
target non-resource URL. */
@K8sDslMarker
fun PolicyRulesWithSubjects.nonResourceRules(init: NonResourcePolicyRule.() -> Unit) {
  this as PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1beta2Impl
  NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { nonResourceRules = nonResourceRules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target
resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty. */
@K8sDslMarker
fun PolicyRulesWithSubjects.resourceRules(init: ResourcePolicyRule.() -> Unit) {
  this as PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1beta2Impl
  ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { resourceRules = resourceRules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one
member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches
every request. Required. */
@K8sDslMarker
fun PolicyRulesWithSubjects.subjects(init: Subject.() -> Unit) {
  this as PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1beta2Impl
  Subject_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { subjects = subjects?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** A node selector term, associated with the corresponding weight. */
@K8sDslMarker
fun PreferredSchedulingTerm.preference(init: NodeSelectorTerm.() -> Unit) {
  this as PreferredSchedulingTerm_core_v1Impl
  NodeSelectorTerm_core_v1Impl(this)
    .also { preference = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun PriorityClass.metadata(init: ObjectMeta.() -> Unit) {
  this as PriorityClass_scheduling_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** `lastTransitionTime` is the last time the condition transitioned from one status to another. */
@K8sDslMarker
fun PriorityLevelConfigurationCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as PriorityLevelConfigurationCondition_flowcontrol_apiserver_k8s_io_v1beta2Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** `metadata` is the standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun PriorityLevelConfiguration.metadata(init: ObjectMeta.() -> Unit) {
  this as PriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta2Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** `spec` is the specification of the desired behavior of a "request-priority". More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun PriorityLevelConfiguration.spec(init: Prioritylevelconfigurationspec.() -> Unit) {
  this as PriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta2Impl
  Prioritylevelconfigurationspec_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { spec = it }
    .apply(init)
}

/** `status` is the current status of a "request-priority". More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun PriorityLevelConfiguration.status(init: Prioritylevelconfigurationstatus.() -> Unit) {
  this as PriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta2Impl
  Prioritylevelconfigurationstatus_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { status = it }
    .apply(init)
}

/** Exec specifies the action to take. */
@K8sDslMarker
fun Probe.exec(init: ExecAction.() -> Unit) {
  this as Probe_core_v1Impl
  ExecAction_core_v1Impl(this)
    .also { exec = it }
    .apply(init)
}

/** GRPC specifies an action involving a GRPC port. This is a beta field and requires enabling GRPCContainerProbe feature
gate. */
@K8sDslMarker
fun Probe.grpc(init: GRPCAction.() -> Unit) {
  this as Probe_core_v1Impl
  GRPCAction_core_v1Impl(this)
    .also { grpc = it }
    .apply(init)
}

/** HTTPGet specifies the http request to perform. */
@K8sDslMarker
fun Probe.httpGet(init: HTTPGetAction.() -> Unit) {
  this as Probe_core_v1Impl
  HTTPGetAction_core_v1Impl(this)
    .also { httpGet = it }
    .apply(init)
}

/** TCPSocket specifies an action involving a TCP port. */
@K8sDslMarker
fun Probe.tcpSocket(init: TCPSocketAction.() -> Unit) {
  this as Probe_core_v1Impl
  TCPSocketAction_core_v1Impl(this)
    .also { tcpSocket = it }
    .apply(init)
}

/** sources is the list of volume projections */
@K8sDslMarker
fun ProjectedVolumeSource.sources(init: VolumeProjection.() -> Unit) {
  this as ProjectedVolumeSource_core_v1Impl
  VolumeProjection_core_v1Impl(this)
    .also { sources = sources?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** secretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info:
https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
@K8sDslMarker
fun RBDPersistentVolumeSource.secretRef(init: SecretReference.() -> Unit) {
  this as RBDPersistentVolumeSource_core_v1Impl
  SecretReference_core_v1Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** secretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info:
https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
@K8sDslMarker
fun RBDVolumeSource.secretRef(init: LocalObjectReference.() -> Unit) {
  this as RBDVolumeSource_core_v1Impl
  LocalObjectReference_core_v1Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** The last time the condition transitioned from one status to another. */
@K8sDslMarker
fun ReplicaSetCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as ReplicaSetCondition_apps_v1Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s) that the ReplicaSet manages.
Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun ReplicaSet.metadata(init: ObjectMeta.() -> Unit) {
  this as ReplicaSet_apps_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the specification of the desired behavior of the ReplicaSet. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun ReplicaSet.spec(init: Replicasetspec.() -> Unit) {
  this as ReplicaSet_apps_v1Impl
  Replicasetspec_apps_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is the most recently observed status of the ReplicaSet. This data may be out of date by some window of time.
Populated by the system. Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun ReplicaSet.status(init: Replicasetstatus.() -> Unit) {
  this as ReplicaSet_apps_v1Impl
  Replicasetstatus_apps_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** The last time the condition transitioned from one status to another. */
@K8sDslMarker
fun ReplicationControllerCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as ReplicationControllerCondition_core_v1Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** If the Labels of a ReplicationController are empty, they are defaulted to be the same as the Pod(s) that the replication
controller manages. Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun ReplicationController.metadata(init: ObjectMeta.() -> Unit) {
  this as ReplicationController_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the specification of the desired behavior of the replication controller. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun ReplicationController.spec(init: Replicationcontrollerspec.() -> Unit) {
  this as ReplicationController_core_v1Impl
  Replicationcontrollerspec_core_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is the most recently observed status of the replication controller. This data may be out of date by some window
of time. Populated by the system. Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun ReplicationController.status(init: Replicationcontrollerstatus.() -> Unit) {
  this as ReplicationController_core_v1Impl
  Replicationcontrollerstatus_core_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** Specifies the output format of the exposed resources, defaults to "1" */
@K8sDslMarker
fun ResourceFieldSelector.divisor(init: Quantity.() -> Unit) {
  this as ResourceFieldSelector_core_v1Impl
  Quantity_core_resourceImpl(this)
    .also { divisor = it }
    .apply(init)
}

/** target specifies the target value for the given metric */
@K8sDslMarker
fun ResourceMetricSource.target(init: MetricTarget.() -> Unit) {
  this as ResourceMetricSource_autoscaling_v2Impl
  MetricTarget_autoscaling_v2Impl(this)
    .also { target = it }
    .apply(init)
}

/** current contains the current value for the given metric */
@K8sDslMarker
fun ResourceMetricStatus.current(init: MetricValueStatus.() -> Unit) {
  this as ResourceMetricStatus_autoscaling_v2Impl
  MetricValueStatus_autoscaling_v2Impl(this)
    .also { current = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun ResourceQuota.metadata(init: ObjectMeta.() -> Unit) {
  this as ResourceQuota_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the desired quota.
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun ResourceQuota.spec(init: Resourcequotaspec.() -> Unit) {
  this as ResourceQuota_core_v1Impl
  Resourcequotaspec_core_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status defines the actual enforced quota and its current usage.
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun ResourceQuota.status(init: Resourcequotastatus.() -> Unit) {
  this as ResourceQuota_core_v1Impl
  Resourcequotastatus_core_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** Limits describes the maximum amount of compute resources allowed. More info:
https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/ */
@K8sDslMarker
fun ResourceRequirements.limits(init: de.loosetie.k8s.dsl.types.LimitsAndRequests.() -> Unit) {
  this as ResourceRequirements_core_v1Impl
  de.loosetie.k8s.dsl.types.LimitsAndRequests(this)
    .also { limits = it }
    .apply(init)
}

/** Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults
to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info:
https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/ */
@K8sDslMarker
fun ResourceRequirements.requests(init: de.loosetie.k8s.dsl.types.LimitsAndRequests.() -> Unit) {
  this as ResourceRequirements_core_v1Impl
  de.loosetie.k8s.dsl.types.LimitsAndRequests(this)
    .also { requests = it }
    .apply(init)
}

/** Standard object's metadata. */
@K8sDslMarker
fun RoleBinding.metadata(init: ObjectMeta.() -> Unit) {
  this as RoleBinding_rbac_authorization_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be
resolved, the Authorizer must return an error. */
@K8sDslMarker
fun RoleBinding.roleRef(init: RoleRef.() -> Unit) {
  this as RoleBinding_rbac_authorization_k8s_io_v1Impl
  RoleRef_rbac_authorization_k8s_io_v1Impl(this)
    .also { roleRef = it }
    .apply(init)
}

/** Subjects holds references to the objects the role applies to. */
@K8sDslMarker
fun RoleBinding.subjects(init: Subject_rbac_authorization_k8s_io_v1.() -> Unit) {
  this as RoleBinding_rbac_authorization_k8s_io_v1Impl
  Subject_rbac_authorization_k8s_io_v1Impl(this)
    .also { subjects = subjects?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. */
@K8sDslMarker
fun Role.metadata(init: ObjectMeta.() -> Unit) {
  this as Role_rbac_authorization_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Rules holds all the PolicyRules for this Role */
@K8sDslMarker
fun Role.rules(init: PolicyRule.() -> Unit) {
  this as Role_rbac_authorization_k8s_io_v1Impl
  PolicyRule_rbac_authorization_k8s_io_v1Impl(this)
    .also { rules = rules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a
percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding up. This can not be 0.
Defaults to 1. This field is alpha-level and is only honored by servers that enable the MaxUnavailableStatefulSet
feature. The field applies to all pods in the range 0 to Replicas-1. That means if there is any unavailable pod in the
range 0 to Replicas-1, it will be counted towards MaxUnavailable. */
@K8sDslMarker
fun RollingUpdateStatefulSetStrategy.maxUnavailable(percentage: String) {
  this as RollingUpdateStatefulSetStrategy_apps_v1Impl
  de.loosetie.k8s.dsl.types.IntOrPercentage(percentage)
    .also { maxUnavailable = it }
}

/** The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a
percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding up. This can not be 0.
Defaults to 1. This field is alpha-level and is only honored by servers that enable the MaxUnavailableStatefulSet
feature. The field applies to all pods in the range 0 to Replicas-1. That means if there is any unavailable pod in the
range 0 to Replicas-1, it will be counted towards MaxUnavailable. */
@K8sDslMarker
fun RollingUpdateStatefulSetStrategy.maxUnavailable(int: Int) {
  this as RollingUpdateStatefulSetStrategy_apps_v1Impl
  de.loosetie.k8s.dsl.types.IntOrPercentage(int)
    .also { maxUnavailable = it }
}

/** ranges are the allowed ranges of gids that may be used. If you would like to force a single gid then supply a single
range with the same start and end. Required for MustRunAs. */
@K8sDslMarker
fun RunAsGroupStrategyOptions.ranges(init: IDRange.() -> Unit) {
  this as RunAsGroupStrategyOptions_policy_v1beta1Impl
  IDRange_policy_v1beta1Impl(this)
    .also { ranges = ranges?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** ranges are the allowed ranges of uids that may be used. If you would like to force a single uid then supply a single
range with the same start and end. Required for MustRunAs. */
@K8sDslMarker
fun RunAsUserStrategyOptions.ranges(init: IDRange.() -> Unit) {
  this as RunAsUserStrategyOptions_policy_v1beta1Impl
  IDRange_policy_v1beta1Impl(this)
    .also { ranges = ranges?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun RuntimeClass.metadata(init: ObjectMeta.() -> Unit) {
  this as RuntimeClass_node_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see
https://kubernetes.io/docs/concepts/scheduling-eviction/pod-overhead/ */
@K8sDslMarker
fun RuntimeClass.overhead(init: Overhead.() -> Unit) {
  this as RuntimeClass_node_k8s_io_v1Impl
  Overhead_node_k8s_io_v1Impl(this)
    .also { overhead = it }
    .apply(init)
}

/** Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes
that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes. */
@K8sDslMarker
fun RuntimeClass.scheduling(init: Scheduling.() -> Unit) {
  this as RuntimeClass_node_k8s_io_v1Impl
  Scheduling_node_k8s_io_v1Impl(this)
    .also { scheduling = it }
    .apply(init)
}

/** seLinuxOptions required to run as; required for MustRunAs More info:
https://kubernetes.io/docs/tasks/configure-pod-container/security-context/ */
@K8sDslMarker
fun SELinuxStrategyOptions.seLinuxOptions(init: SELinuxOptions.() -> Unit) {
  this as SELinuxStrategyOptions_policy_v1beta1Impl
  SELinuxOptions_core_v1Impl(this)
    .also { seLinuxOptions = it }
    .apply(init)
}

/** secretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login
operation will fail. */
@K8sDslMarker
fun ScaleIOPersistentVolumeSource.secretRef(init: SecretReference.() -> Unit) {
  this as ScaleIOPersistentVolumeSource_core_v1Impl
  SecretReference_core_v1Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** secretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login
operation will fail. */
@K8sDslMarker
fun ScaleIOVolumeSource.secretRef(init: LocalObjectReference.() -> Unit) {
  this as ScaleIOVolumeSource_core_v1Impl
  LocalObjectReference_core_v1Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** Standard object metadata; More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata. */
@K8sDslMarker
fun Scale.metadata(init: ObjectMeta.() -> Unit) {
  this as Scale_autoscaling_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively
unioning the set of nodes tolerated by the pod and the RuntimeClass. */
@K8sDslMarker
fun Scheduling.tolerations(init: Toleration.() -> Unit) {
  this as Scheduling_node_k8s_io_v1Impl
  Toleration_core_v1Impl(this)
    .also { tolerations = tolerations?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** A list of scope selector requirements by scope of the resources. */
@K8sDslMarker
fun ScopeSelector.matchExpressions(init: ScopedResourceSelectorRequirement.() -> Unit) {
  this as ScopeSelector_core_v1Impl
  ScopedResourceSelectorRequirement_core_v1Impl(this)
    .also { matchExpressions = matchExpressions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** items if unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume
as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the
specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the
volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start
with '..'. */
@K8sDslMarker
fun SecretProjection.items(init: KeyToPath.() -> Unit) {
  this as SecretProjection_core_v1Impl
  KeyToPath_core_v1Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** items If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume
as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the
specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the
volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start
with '..'. */
@K8sDslMarker
fun SecretVolumeSource.items(init: KeyToPath.() -> Unit) {
  this as SecretVolumeSource_core_v1Impl
  KeyToPath_core_v1Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Secret.metadata(init: ObjectMeta.() -> Unit) {
  this as Secret_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the
container runtime. Note that this field cannot be set when spec.os.name is windows. */
@K8sDslMarker
fun SecurityContext.capabilities(init: Capabilities.() -> Unit) {
  this as SecurityContext_core_v1Impl
  Capabilities_core_v1Impl(this)
    .also { capabilities = it }
    .apply(init)
}

/** The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux
context for each container. May also be set in PodSecurityContext. If set in both SecurityContext and
PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when
spec.os.name is windows. */
@K8sDslMarker
fun SecurityContext.seLinuxOptions(init: SELinuxOptions.() -> Unit) {
  this as SecurityContext_core_v1Impl
  SELinuxOptions_core_v1Impl(this)
    .also { seLinuxOptions = it }
    .apply(init)
}

/** The seccomp options to use by this container. If seccomp options are provided at both the pod & container level, the
container options override the pod options. Note that this field cannot be set when spec.os.name is windows. */
@K8sDslMarker
fun SecurityContext.seccompProfile(init: SeccompProfile.() -> Unit) {
  this as SecurityContext_core_v1Impl
  SeccompProfile_core_v1Impl(this)
    .also { seccompProfile = it }
    .apply(init)
}

/** The Windows specific settings applied to all containers. If unspecified, the options from the PodSecurityContext will be
used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
Note that this field cannot be set when spec.os.name is linux. */
@K8sDslMarker
fun SecurityContext.windowsOptions(init: WindowsSecurityContextOptions.() -> Unit) {
  this as SecurityContext_core_v1Impl
  WindowsSecurityContextOptions_core_v1Impl(this)
    .also { windowsOptions = it }
    .apply(init)
}

/** Standard list metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun SelfSubjectAccessReview.metadata(init: ObjectMeta.() -> Unit) {
  this as SelfSubjectAccessReview_authorization_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec holds information about the request being evaluated. user and groups must be empty */
@K8sDslMarker
fun SelfSubjectAccessReview.spec(init: Selfsubjectaccessreviewspec.() -> Unit) {
  this as SelfSubjectAccessReview_authorization_k8s_io_v1Impl
  Selfsubjectaccessreviewspec_authorization_k8s_io_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is filled in by the server and indicates whether the request is allowed or not */
@K8sDslMarker
fun SelfSubjectAccessReview.status(init: Subjectaccessreviewstatus.() -> Unit) {
  this as SelfSubjectAccessReview_authorization_k8s_io_v1Impl
  Subjectaccessreviewstatus_authorization_k8s_io_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** Standard list metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun SelfSubjectRulesReview.metadata(init: ObjectMeta.() -> Unit) {
  this as SelfSubjectRulesReview_authorization_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec holds information about the request being evaluated. */
@K8sDslMarker
fun SelfSubjectRulesReview.spec(init: Selfsubjectrulesreviewspec.() -> Unit) {
  this as SelfSubjectRulesReview_authorization_k8s_io_v1Impl
  Selfsubjectrulesreviewspec_authorization_k8s_io_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is filled in by the server and indicates the set of actions a user can perform. */
@K8sDslMarker
fun SelfSubjectRulesReview.status(init: SubjectRulesReviewStatus.() -> Unit) {
  this as SelfSubjectRulesReview_authorization_k8s_io_v1Impl
  SubjectRulesReviewStatus_authorization_k8s_io_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that
reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but
ImagePullSecrets are only accessed by the kubelet. More info:
https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod */
@K8sDslMarker
fun ServiceAccount.imagePullSecrets(init: LocalObjectReference.() -> Unit) {
  this as ServiceAccount_core_v1Impl
  LocalObjectReference_core_v1Impl(this)
    .also { imagePullSecrets = imagePullSecrets?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun ServiceAccount.metadata(init: ObjectMeta.() -> Unit) {
  this as ServiceAccount_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Secrets is a list of the secrets in the same namespace that pods running using this ServiceAccount are allowed to use.
Pods are only limited to this list if this service account has a "kubernetes.io/enforce-mountable-secrets" annotation
set to "true". This field should not be used to find auto-generated service account token secrets for use outside of
pods. Instead, tokens can be requested directly using the TokenRequest API, or service account token secrets can be
manually created. More info: https://kubernetes.io/docs/concepts/configuration/secret */
@K8sDslMarker
fun ServiceAccount.secrets(init: ObjectReference.() -> Unit) {
  this as ServiceAccount_core_v1Impl
  ObjectReference_core_v1Impl(this)
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
  this as ServicePort_core_v1Impl
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
  this as ServicePort_core_v1Impl
  de.loosetie.k8s.dsl.types.IntOrString(int)
    .also { targetPort = it }
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Service.metadata(init: ObjectMeta.() -> Unit) {
  this as Service_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the behavior of a service.
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Service.spec(init: Servicespec.() -> Unit) {
  this as Service_core_v1Impl
  Servicespec_core_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Most recently observed status of the service. Populated by the system. Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Service.status(init: Servicestatus.() -> Unit) {
  this as Service_core_v1Impl
  Servicestatus_core_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** clientIP contains the configurations of Client IP based session affinity. */
@K8sDslMarker
fun SessionAffinityConfig.clientIP(init: ClientIPConfig.() -> Unit) {
  this as SessionAffinityConfig_core_v1Impl
  ClientIPConfig_core_v1Impl(this)
    .also { clientIP = it }
    .apply(init)
}

/** Last time the condition transitioned from one status to another. */
@K8sDslMarker
fun StatefulSetCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as StatefulSetCondition_apps_v1Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType. */
@K8sDslMarker
fun StatefulSetUpdateStrategy.rollingUpdate(init: RollingUpdateStatefulSetStrategy.() -> Unit) {
  this as StatefulSetUpdateStrategy_apps_v1Impl
  RollingUpdateStatefulSetStrategy_apps_v1Impl(this)
    .also { rollingUpdate = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun StatefulSet.metadata(init: ObjectMeta.() -> Unit) {
  this as StatefulSet_apps_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the desired identities of pods in this set. */
@K8sDslMarker
fun StatefulSet.spec(init: Statefulsetspec.() -> Unit) {
  this as StatefulSet_apps_v1Impl
  Statefulsetspec_apps_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time. */
@K8sDslMarker
fun StatefulSet.status(init: Statefulsetstatus.() -> Unit) {
  this as StatefulSet_apps_v1Impl
  Statefulsetstatus_apps_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide
detailed causes. */
@K8sDslMarker
fun StatusDetails.causes(init: StatusCause.() -> Unit) {
  this as StatusDetails_meta_v1Impl
  StatusCause_meta_v1Impl(this)
    .also { causes = causes?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Extended data associated with the reason. Each reason may define its own extended details. This field is optional and
the data returned is not guaranteed to conform to any schema except that defined by the reason type. */
@K8sDslMarker
fun Status.details(init: StatusDetails.() -> Unit) {
  this as Status_meta_v1Impl
  StatusDetails_meta_v1Impl(this)
    .also { details = it }
    .apply(init)
}

/** Standard list metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
@K8sDslMarker
fun Status.metadata(init: ListMeta.() -> Unit) {
  this as Status_meta_v1Impl
  ListMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported
topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only
honored by servers that enable the VolumeScheduling feature. */
@K8sDslMarker
fun StorageClass.allowedTopologies(init: TopologySelectorTerm.() -> Unit) {
  this as StorageClass_storage_k8s_io_v1Impl
  TopologySelectorTerm_core_v1Impl(this)
    .also { allowedTopologies = allowedTopologies?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun StorageClass.metadata(init: ObjectMeta.() -> Unit) {
  this as StorageClass_storage_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** secretRef specifies the secret to use for obtaining the StorageOS API credentials. If not specified, default values will
be attempted. */
@K8sDslMarker
fun StorageOSPersistentVolumeSource.secretRef(init: ObjectReference.() -> Unit) {
  this as StorageOSPersistentVolumeSource_core_v1Impl
  ObjectReference_core_v1Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** secretRef specifies the secret to use for obtaining the StorageOS API credentials. If not specified, default values will
be attempted. */
@K8sDslMarker
fun StorageOSVolumeSource.secretRef(init: LocalObjectReference.() -> Unit) {
  this as StorageOSVolumeSource_core_v1Impl
  LocalObjectReference_core_v1Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** Last time the condition transitioned from one status to another. */
@K8sDslMarker
fun StorageVersionCondition.lastTransitionTime(init: Time.() -> Unit) {
  this as StorageVersionCondition_internal_apiserver_k8s_io_v1alpha1Impl
  Time_meta_v1Impl(this)
    .also { lastTransitionTime = it }
    .apply(init)
}

/** The name is <group>.<resource>. */
@K8sDslMarker
fun StorageVersion.metadata(init: ObjectMeta.() -> Unit) {
  this as StorageVersion_internal_apiserver_k8s_io_v1alpha1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec is an empty spec. It is here to comply with Kubernetes API style. */
@K8sDslMarker
fun StorageVersion.spec(init: Storageversionspec.() -> Unit) {
  this as StorageVersion_internal_apiserver_k8s_io_v1alpha1Impl
  Storageversionspec_internal_apiserver_k8s_io_v1alpha1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** API server instances report the version they can decode and the version they encode objects to when persisting objects
in the backend. */
@K8sDslMarker
fun StorageVersion.status(init: Storageversionstatus.() -> Unit) {
  this as StorageVersion_internal_apiserver_k8s_io_v1alpha1Impl
  Storageversionstatus_internal_apiserver_k8s_io_v1alpha1Impl(this)
    .also { status = it }
    .apply(init)
}

/** Standard list metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun SubjectAccessReview.metadata(init: ObjectMeta.() -> Unit) {
  this as SubjectAccessReview_authorization_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec holds information about the request being evaluated */
@K8sDslMarker
fun SubjectAccessReview.spec(init: Subjectaccessreviewspec.() -> Unit) {
  this as SubjectAccessReview_authorization_k8s_io_v1Impl
  Subjectaccessreviewspec_authorization_k8s_io_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is filled in by the server and indicates whether the request is allowed or not */
@K8sDslMarker
fun SubjectAccessReview.status(init: Subjectaccessreviewstatus.() -> Unit) {
  this as SubjectAccessReview_authorization_k8s_io_v1Impl
  Subjectaccessreviewstatus_authorization_k8s_io_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn't
significant, may contain duplicates, and possibly be incomplete. */
@K8sDslMarker
fun SubjectRulesReviewStatus.nonResourceRules(init: NonResourceRule.() -> Unit) {
  this as SubjectRulesReviewStatus_authorization_k8s_io_v1Impl
  NonResourceRule_authorization_k8s_io_v1Impl(this)
    .also { nonResourceRules = nonResourceRules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn't
significant, may contain duplicates, and possibly be incomplete. */
@K8sDslMarker
fun SubjectRulesReviewStatus.resourceRules(init: ResourceRule.() -> Unit) {
  this as SubjectRulesReviewStatus_authorization_k8s_io_v1Impl
  ResourceRule_authorization_k8s_io_v1Impl(this)
    .also { resourceRules = resourceRules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** `group` matches based on user group name. */
@K8sDslMarker
fun Subject.group(init: GroupSubject.() -> Unit) {
  this as Subject_flowcontrol_apiserver_k8s_io_v1beta2Impl
  GroupSubject_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { group = it }
    .apply(init)
}

/** `serviceAccount` matches ServiceAccounts. */
@K8sDslMarker
fun Subject.serviceAccount(init: ServiceAccountSubject.() -> Unit) {
  this as Subject_flowcontrol_apiserver_k8s_io_v1beta2Impl
  ServiceAccountSubject_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { serviceAccount = it }
    .apply(init)
}

/** `user` matches based on username. */
@K8sDslMarker
fun Subject.user(init: UserSubject.() -> Unit) {
  this as Subject_flowcontrol_apiserver_k8s_io_v1beta2Impl
  UserSubject_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { user = it }
    .apply(init)
}

/** ranges are the allowed ranges of supplemental groups. If you would like to force a single supplemental group then supply
a single range with the same start and end. Required for MustRunAs. */
@K8sDslMarker
fun SupplementalGroupsStrategyOptions.ranges(init: IDRange.() -> Unit) {
  this as SupplementalGroupsStrategyOptions_policy_v1beta1Impl
  IDRange_policy_v1beta1Impl(this)
    .also { ranges = ranges?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
IANA_SVC_NAME. */
@K8sDslMarker
fun TCPSocketAction.port(string: String) {
  this as TCPSocketAction_core_v1Impl
  de.loosetie.k8s.dsl.types.IntOrString(string)
    .also { port = it }
}

/** Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
IANA_SVC_NAME. */
@K8sDslMarker
fun TCPSocketAction.port(int: Int) {
  this as TCPSocketAction_core_v1Impl
  de.loosetie.k8s.dsl.types.IntOrString(int)
    .also { port = it }
}

/** TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints. */
@K8sDslMarker
fun Taint.timeAdded(init: Time.() -> Unit) {
  this as Taint_core_v1Impl
  Time_meta_v1Impl(this)
    .also { timeAdded = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun TokenRequest.metadata(init: ObjectMeta.() -> Unit) {
  this as TokenRequest_authentication_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec holds information about the request being evaluated */
@K8sDslMarker
fun TokenRequest.spec(init: Tokenrequestspec.() -> Unit) {
  this as TokenRequest_authentication_k8s_io_v1Impl
  Tokenrequestspec_authentication_k8s_io_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is filled in by the server and indicates whether the token can be authenticated. */
@K8sDslMarker
fun TokenRequest.status(init: Tokenrequeststatus.() -> Unit) {
  this as TokenRequest_authentication_k8s_io_v1Impl
  Tokenrequeststatus_authentication_k8s_io_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun TokenReview.metadata(init: ObjectMeta.() -> Unit) {
  this as TokenReview_authentication_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec holds information about the request being evaluated */
@K8sDslMarker
fun TokenReview.spec(init: Tokenreviewspec.() -> Unit) {
  this as TokenReview_authentication_k8s_io_v1Impl
  Tokenreviewspec_authentication_k8s_io_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is filled in by the server and indicates whether the request can be authenticated. */
@K8sDslMarker
fun TokenReview.status(init: Tokenreviewstatus.() -> Unit) {
  this as TokenReview_authentication_k8s_io_v1Impl
  Tokenreviewstatus_authentication_k8s_io_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** A list of topology selector requirements by labels. */
@K8sDslMarker
fun TopologySelectorTerm.matchLabelExpressions(init: TopologySelectorLabelRequirement.() -> Unit) {
  this as TopologySelectorTerm_core_v1Impl
  TopologySelectorLabelRequirement_core_v1Impl(this)
    .also { matchLabelExpressions = matchLabelExpressions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** LabelSelector is used to find matching pods. Pods that match this label selector are counted to determine the number of
pods in their corresponding topology domain. */
@K8sDslMarker
fun TopologySpreadConstraint.labelSelector(init: LabelSelector.() -> Unit) {
  this as TopologySpreadConstraint_core_v1Impl
  LabelSelector_meta_v1Impl(this)
    .also { labelSelector = it }
    .apply(init)
}

/** Standard object metadata; More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata. */
@K8sDslMarker
fun ValidatingWebhookConfiguration.metadata(init: ObjectMeta.() -> Unit) {
  this as ValidatingWebhookConfiguration_admissionregistration_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Webhooks is a list of webhooks and the affected resources and operations. */
@K8sDslMarker
fun ValidatingWebhookConfiguration.webhooks(init: ValidatingWebhook.() -> Unit) {
  this as ValidatingWebhookConfiguration_admissionregistration_k8s_io_v1Impl
  ValidatingWebhook_admissionregistration_k8s_io_v1Impl(this)
    .also { webhooks = webhooks?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** ClientConfig defines how to communicate with the hook. Required */
@K8sDslMarker
fun ValidatingWebhook.clientConfig(init: WebhookClientConfig.() -> Unit) {
  this as ValidatingWebhook_admissionregistration_k8s_io_v1Impl
  WebhookClientConfig_admissionregistration_k8s_io_v1Impl(this)
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
  this as ValidatingWebhook_admissionregistration_k8s_io_v1Impl
  LabelSelector_meta_v1Impl(this)
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
  this as ValidatingWebhook_admissionregistration_k8s_io_v1Impl
  LabelSelector_meta_v1Impl(this)
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
  this as ValidatingWebhook_admissionregistration_k8s_io_v1Impl
  RuleWithOperations_admissionregistration_k8s_io_v1Impl(this)
    .also { rules = rules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline
VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's
inline VolumeSource to a PersistentVolumeSpec. This field is beta-level and is only honored by servers that enabled the
CSIMigration feature. */
@K8sDslMarker
fun VolumeAttachmentSource.inlineVolumeSpec(init: Persistentvolumespec.() -> Unit) {
  this as VolumeAttachmentSource_storage_k8s_io_v1Impl
  Persistentvolumespec_core_v1Impl(this)
    .also { inlineVolumeSpec = it }
    .apply(init)
}

/** Standard object metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun VolumeAttachment.metadata(init: ObjectMeta.() -> Unit) {
  this as VolumeAttachment_storage_k8s_io_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system. */
@K8sDslMarker
fun VolumeAttachment.spec(init: Volumeattachmentspec.() -> Unit) {
  this as VolumeAttachment_storage_k8s_io_v1Impl
  Volumeattachmentspec_storage_k8s_io_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the
external-attacher. */
@K8sDslMarker
fun VolumeAttachment.status(init: Volumeattachmentstatus.() -> Unit) {
  this as VolumeAttachment_storage_k8s_io_v1Impl
  Volumeattachmentstatus_storage_k8s_io_v1Impl(this)
    .also { status = it }
    .apply(init)
}

/** Time the error was encountered. */
@K8sDslMarker
fun VolumeError.time(init: Time.() -> Unit) {
  this as VolumeError_storage_k8s_io_v1Impl
  Time_meta_v1Impl(this)
    .also { time = it }
    .apply(init)
}

/** required specifies hard node constraints that must be met. */
@K8sDslMarker
fun VolumeNodeAffinity.required(init: NodeSelector.() -> Unit) {
  this as VolumeNodeAffinity_core_v1Impl
  NodeSelector_core_v1Impl(this)
    .also { required = it }
    .apply(init)
}

/** configMap information about the configMap data to project */
@K8sDslMarker
fun VolumeProjection.configMap(init: ConfigMapProjection.() -> Unit) {
  this as VolumeProjection_core_v1Impl
  ConfigMapProjection_core_v1Impl(this)
    .also { configMap = it }
    .apply(init)
}

/** downwardAPI information about the downwardAPI data to project */
@K8sDslMarker
fun VolumeProjection.downwardAPI(init: DownwardAPIProjection.() -> Unit) {
  this as VolumeProjection_core_v1Impl
  DownwardAPIProjection_core_v1Impl(this)
    .also { downwardAPI = it }
    .apply(init)
}

/** secret information about the secret data to project */
@K8sDslMarker
fun VolumeProjection.secret(init: SecretProjection.() -> Unit) {
  this as VolumeProjection_core_v1Impl
  SecretProjection_core_v1Impl(this)
    .also { secret = it }
    .apply(init)
}

/** serviceAccountToken is information about the serviceAccountToken data to project */
@K8sDslMarker
fun VolumeProjection.serviceAccountToken(init: ServiceAccountTokenProjection.() -> Unit) {
  this as VolumeProjection_core_v1Impl
  ServiceAccountTokenProjection_core_v1Impl(this)
    .also { serviceAccountToken = it }
    .apply(init)
}

/** awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to
the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
@K8sDslMarker
fun Volume.awsElasticBlockStore(init: AWSElasticBlockStoreVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  AWSElasticBlockStoreVolumeSource_core_v1Impl(this)
    .also { awsElasticBlockStore = it }
    .apply(init)
}

/** azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod. */
@K8sDslMarker
fun Volume.azureDisk(init: AzureDiskVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  AzureDiskVolumeSource_core_v1Impl(this)
    .also { azureDisk = it }
    .apply(init)
}

/** azureFile represents an Azure File Service mount on the host and bind mount to the pod. */
@K8sDslMarker
fun Volume.azureFile(init: AzureFileVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  AzureFileVolumeSource_core_v1Impl(this)
    .also { azureFile = it }
    .apply(init)
}

/** cephFS represents a Ceph FS mount on the host that shares a pod's lifetime */
@K8sDslMarker
fun Volume.cephfs(init: CephFSVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  CephFSVolumeSource_core_v1Impl(this)
    .also { cephfs = it }
    .apply(init)
}

/** cinder represents a cinder volume attached and mounted on kubelets host machine. More info:
https://examples.k8s.io/mysql-cinder-pd/README.md */
@K8sDslMarker
fun Volume.cinder(init: CinderVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  CinderVolumeSource_core_v1Impl(this)
    .also { cinder = it }
    .apply(init)
}

/** configMap represents a configMap that should populate this volume */
@K8sDslMarker
fun Volume.configMap(init: ConfigMapVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  ConfigMapVolumeSource_core_v1Impl(this)
    .also { configMap = it }
    .apply(init)
}

/** csi (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta
feature). */
@K8sDslMarker
fun Volume.csi(init: CSIVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  CSIVolumeSource_core_v1Impl(this)
    .also { csi = it }
    .apply(init)
}

/** downwardAPI represents downward API about the pod that should populate this volume */
@K8sDslMarker
fun Volume.downwardAPI(init: DownwardAPIVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  DownwardAPIVolumeSource_core_v1Impl(this)
    .also { downwardAPI = it }
    .apply(init)
}

/** emptyDir represents a temporary directory that shares a pod's lifetime. More info:
https://kubernetes.io/docs/concepts/storage/volumes#emptydir */
@K8sDslMarker
fun Volume.emptyDir(init: EmptyDirVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  EmptyDirVolumeSource_core_v1Impl(this)
    .also { emptyDir = it }
    .apply(init)
}

/** ephemeral represents a volume that is handled by a cluster storage driver. The volume's lifecycle is tied to the pod
that defines it - it will be created before the pod starts, and deleted when the pod is removed. Use this if: a) the
volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot or capacity
tracking are needed, c) the storage driver is specified through a storage class, and d) the storage driver supports
dynamic volume provisioning through a PersistentVolumeClaim (see EphemeralVolumeSource for more information on the
connection between this volume type and PersistentVolumeClaim). Use PersistentVolumeClaim or one of the vendor-specific
APIs for volumes that persist for longer than the lifecycle of an individual pod. Use CSI for light-weight local
ephemeral volumes if the CSI driver is meant to be used that way - see the documentation of the driver for more
information. A pod can use both types of ephemeral volumes and persistent volumes at the same time. */
@K8sDslMarker
fun Volume.ephemeral(init: EphemeralVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  EphemeralVolumeSource_core_v1Impl(this)
    .also { ephemeral = it }
    .apply(init)
}

/** fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod. */
@K8sDslMarker
fun Volume.fc(init: FCVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  FCVolumeSource_core_v1Impl(this)
    .also { fc = it }
    .apply(init)
}

/** flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin. */
@K8sDslMarker
fun Volume.flexVolume(init: FlexVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  FlexVolumeSource_core_v1Impl(this)
    .also { flexVolume = it }
    .apply(init)
}

/** flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service
being running */
@K8sDslMarker
fun Volume.flocker(init: FlockerVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  FlockerVolumeSource_core_v1Impl(this)
    .also { flocker = it }
    .apply(init)
}

/** gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the
pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk */
@K8sDslMarker
fun Volume.gcePersistentDisk(init: GCEPersistentDiskVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  GCEPersistentDiskVolumeSource_core_v1Impl(this)
    .also { gcePersistentDisk = it }
    .apply(init)
}

/** gitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a
container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the
EmptyDir into the Pod's container. */
@K8sDslMarker
fun Volume.gitRepo(init: GitRepoVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  GitRepoVolumeSource_core_v1Impl(this)
    .also { gitRepo = it }
    .apply(init)
}

/** glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info:
https://examples.k8s.io/volumes/glusterfs/README.md */
@K8sDslMarker
fun Volume.glusterfs(init: GlusterfsVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  GlusterfsVolumeSource_core_v1Impl(this)
    .also { glusterfs = it }
    .apply(init)
}

/** hostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This
is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers
will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath */
@K8sDslMarker
fun Volume.hostPath(init: HostPathVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  HostPathVolumeSource_core_v1Impl(this)
    .also { hostPath = it }
    .apply(init)
}

/** iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More
info: https://examples.k8s.io/volumes/iscsi/README.md */
@K8sDslMarker
fun Volume.iscsi(init: ISCSIVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  ISCSIVolumeSource_core_v1Impl(this)
    .also { iscsi = it }
    .apply(init)
}

/** nfs represents an NFS mount on the host that shares a pod's lifetime More info:
https://kubernetes.io/docs/concepts/storage/volumes#nfs */
@K8sDslMarker
fun Volume.nfs(init: NFSVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  NFSVolumeSource_core_v1Impl(this)
    .also { nfs = it }
    .apply(init)
}

/** persistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
@K8sDslMarker
fun Volume.persistentVolumeClaim(init: PersistentVolumeClaimVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  PersistentVolumeClaimVolumeSource_core_v1Impl(this)
    .also { persistentVolumeClaim = it }
    .apply(init)
}

/** photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine */
@K8sDslMarker
fun Volume.photonPersistentDisk(init: PhotonPersistentDiskVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  PhotonPersistentDiskVolumeSource_core_v1Impl(this)
    .also { photonPersistentDisk = it }
    .apply(init)
}

/** portworxVolume represents a portworx volume attached and mounted on kubelets host machine */
@K8sDslMarker
fun Volume.portworxVolume(init: PortworxVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  PortworxVolumeSource_core_v1Impl(this)
    .also { portworxVolume = it }
    .apply(init)
}

/** projected items for all in one resources secrets, configmaps, and downward API */
@K8sDslMarker
fun Volume.projected(init: ProjectedVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  ProjectedVolumeSource_core_v1Impl(this)
    .also { projected = it }
    .apply(init)
}

/** quobyte represents a Quobyte mount on the host that shares a pod's lifetime */
@K8sDslMarker
fun Volume.quobyte(init: QuobyteVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  QuobyteVolumeSource_core_v1Impl(this)
    .also { quobyte = it }
    .apply(init)
}

/** rbd represents a Rados Block Device mount on the host that shares a pod's lifetime. More info:
https://examples.k8s.io/volumes/rbd/README.md */
@K8sDslMarker
fun Volume.rbd(init: RBDVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  RBDVolumeSource_core_v1Impl(this)
    .also { rbd = it }
    .apply(init)
}

/** scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes. */
@K8sDslMarker
fun Volume.scaleIO(init: ScaleIOVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  ScaleIOVolumeSource_core_v1Impl(this)
    .also { scaleIO = it }
    .apply(init)
}

/** secret represents a secret that should populate this volume. More info:
https://kubernetes.io/docs/concepts/storage/volumes#secret */
@K8sDslMarker
fun Volume.secret(init: SecretVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  SecretVolumeSource_core_v1Impl(this)
    .also { secret = it }
    .apply(init)
}

/** storageOS represents a StorageOS volume attached and mounted on Kubernetes nodes. */
@K8sDslMarker
fun Volume.storageos(init: StorageOSVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  StorageOSVolumeSource_core_v1Impl(this)
    .also { storageos = it }
    .apply(init)
}

/** vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine */
@K8sDslMarker
fun Volume.vsphereVolume(init: VsphereVirtualDiskVolumeSource.() -> Unit) {
  this as Volume_core_v1Impl
  VsphereVirtualDiskVolumeSource_core_v1Impl(this)
    .also { vsphereVolume = it }
    .apply(init)
}

/** `service` is a reference to the service for this webhook. Either `service` or `url` must be specified. If the webhook is
running within the cluster, then you should use `service`. */
@K8sDslMarker
fun WebhookClientConfig.service(init: ServiceReference.() -> Unit) {
  this as WebhookClientConfig_admissionregistration_k8s_io_v1Impl
  ServiceReference_admissionregistration_k8s_io_v1Impl(this)
    .also { service = it }
    .apply(init)
}

/** service is a reference to the service for this webhook. Either service or url must be specified. If the webhook is
running within the cluster, then you should use `service`. */
@K8sDslMarker
fun WebhookClientConfig_apiextensions_k8s_io_v1.service(init: ServiceReference_apiextensions_k8s_io_v1.() -> Unit) {
  this as WebhookClientConfig_apiextensions_k8s_io_v1Impl
  ServiceReference_apiextensions_k8s_io_v1Impl(this)
    .also { service = it }
    .apply(init)
}

/** clientConfig is the instructions for how to call the webhook if strategy is `Webhook`. */
@K8sDslMarker
fun WebhookConversion.clientConfig(init: WebhookClientConfig_apiextensions_k8s_io_v1.() -> Unit) {
  this as WebhookConversion_apiextensions_k8s_io_v1Impl
  WebhookClientConfig_apiextensions_k8s_io_v1Impl(this)
    .also { clientConfig = it }
    .apply(init)
}

/** Required. A pod affinity term, associated with the corresponding weight. */
@K8sDslMarker
fun WeightedPodAffinityTerm.podAffinityTerm(init: PodAffinityTerm.() -> Unit) {
  this as WeightedPodAffinityTerm_core_v1Impl
  PodAffinityTerm_core_v1Impl(this)
    .also { podAffinityTerm = it }
    .apply(init)
}

/** Service is a reference to the service for this API server. It must communicate on port 443. If the Service is nil, that
means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the
normal handler chain to be fulfilled. */
@K8sDslMarker
fun Apiservicespec.service(init: ServiceReference_apiregistration_k8s_io_v1.() -> Unit) {
  this as Apiservicespec_apiregistration_k8s_io_v1Impl
  ServiceReference_apiregistration_k8s_io_v1Impl(this)
    .also { service = it }
    .apply(init)
}

/** Current service state of apiService. */
@K8sDslMarker
fun Apiservicestatus.conditions(init: APIServiceCondition.() -> Unit) {
  this as Apiservicestatus_apiregistration_k8s_io_v1Impl
  APIServiceCondition_apiregistration_k8s_io_v1Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** conditions applied to the request. Known conditions are "Approved", "Denied", and "Failed". */
@K8sDslMarker
fun Certificatesigningrequeststatus.conditions(init: CertificateSigningRequestCondition.() -> Unit) {
  this as Certificatesigningrequeststatus_certificates_k8s_io_v1Impl
  CertificateSigningRequestCondition_certificates_k8s_io_v1Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Details about the container's last termination condition. */
@K8sDslMarker
fun Containerstatus.lastState(init: ContainerState.() -> Unit) {
  this as Containerstatus_core_v1Impl
  ContainerState_core_v1Impl(this)
    .also { lastState = it }
    .apply(init)
}

/** Details about the container's current condition. */
@K8sDslMarker
fun Containerstatus.state(init: ContainerState.() -> Unit) {
  this as Containerstatus_core_v1Impl
  ContainerState_core_v1Impl(this)
    .also { state = it }
    .apply(init)
}

/** Specifies the job that will be created when executing a CronJob. */
@K8sDslMarker
fun Cronjobspec.jobTemplate(init: JobTemplateSpec.() -> Unit) {
  this as Cronjobspec_batch_v1Impl
  JobTemplateSpec_batch_v1Impl(this)
    .also { jobTemplate = it }
    .apply(init)
}

/** A list of pointers to currently running jobs. */
@K8sDslMarker
fun Cronjobstatus.active(init: ObjectReference.() -> Unit) {
  this as Cronjobstatus_batch_v1Impl
  ObjectReference_core_v1Impl(this)
    .also { active = active?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Information when was the last time the job was successfully scheduled. */
@K8sDslMarker
fun Cronjobstatus.lastScheduleTime(init: Time.() -> Unit) {
  this as Cronjobstatus_batch_v1Impl
  Time_meta_v1Impl(this)
    .also { lastScheduleTime = it }
    .apply(init)
}

/** Information when was the last time the job successfully completed. */
@K8sDslMarker
fun Cronjobstatus.lastSuccessfulTime(init: Time.() -> Unit) {
  this as Cronjobstatus_batch_v1Impl
  Time_meta_v1Impl(this)
    .also { lastSuccessfulTime = it }
    .apply(init)
}

/** TokenRequests indicates the CSI driver needs pods' service account tokens it is mounting volume for to do necessary
authentication. Kubelet will pass the tokens in VolumeContext in the CSI NodePublishVolume calls. The CSI driver should
parse and validate the following VolumeContext: "csi.storage.k8s.io/serviceAccount.tokens": { "<audience>": { "token":
<token>, "expirationTimestamp": <expiration timestamp in RFC3339>, }, ... } Note: Audience in each TokenRequest should
be different and at most one token is empty string. To receive a new token after expiry, RequiresRepublish can be used
to trigger NodePublishVolume periodically. */
@K8sDslMarker
fun Csidriverspec.tokenRequests(init: TokenRequest_storage_k8s_io_v1.() -> Unit) {
  this as Csidriverspec_storage_k8s_io_v1Impl
  TokenRequest_storage_k8s_io_v1Impl(this)
    .also { tokenRequests = tokenRequests?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this
can become empty. */
@K8sDslMarker
fun Csinodespec.drivers(init: CSINodeDriver.() -> Unit) {
  this as Csinodespec_storage_k8s_io_v1Impl
  CSINodeDriver_storage_k8s_io_v1Impl(this)
    .also { drivers = drivers?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** conversion defines conversion settings for the CRD. */
@K8sDslMarker
fun Customresourcedefinitionspec.conversion(init: CustomResourceConversion.() -> Unit) {
  this as Customresourcedefinitionspec_apiextensions_k8s_io_v1Impl
  CustomResourceConversion_apiextensions_k8s_io_v1Impl(this)
    .also { conversion = it }
    .apply(init)
}

/** names specify the resource and kind names for the custom resource. */
@K8sDslMarker
fun Customresourcedefinitionspec.names(init: CustomResourceDefinitionNames.() -> Unit) {
  this as Customresourcedefinitionspec_apiextensions_k8s_io_v1Impl
  CustomResourceDefinitionNames_apiextensions_k8s_io_v1Impl(this)
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
  this as Customresourcedefinitionspec_apiextensions_k8s_io_v1Impl
  CustomResourceDefinitionVersion_apiextensions_k8s_io_v1Impl(this)
    .also { versions = versions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in
spec. */
@K8sDslMarker
fun Customresourcedefinitionstatus.acceptedNames(init: CustomResourceDefinitionNames.() -> Unit) {
  this as Customresourcedefinitionstatus_apiextensions_k8s_io_v1Impl
  CustomResourceDefinitionNames_apiextensions_k8s_io_v1Impl(this)
    .also { acceptedNames = it }
    .apply(init)
}

/** conditions indicate state for particular aspects of a CustomResourceDefinition */
@K8sDslMarker
fun Customresourcedefinitionstatus.conditions(init: CustomResourceDefinitionCondition.() -> Unit) {
  this as Customresourcedefinitionstatus_apiextensions_k8s_io_v1Impl
  CustomResourceDefinitionCondition_apiextensions_k8s_io_v1Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod
template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
@K8sDslMarker
fun Daemonsetspec.selector(init: LabelSelector.() -> Unit) {
  this as Daemonsetspec_apps_v1Impl
  LabelSelector_meta_v1Impl(this)
    .also { selector = it }
    .apply(init)
}

/** An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every
node that matches the template's node selector (or on every node if no node selector is specified). More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
@K8sDslMarker
fun Daemonsetspec.template(init: Podtemplatespec.() -> Unit) {
  this as Daemonsetspec_apps_v1Impl
  Podtemplatespec_core_v1Impl(this)
    .also { template = it }
    .apply(init)
}

/** An update strategy to replace existing DaemonSet pods with new pods. */
@K8sDslMarker
fun Daemonsetspec.updateStrategy(init: DaemonSetUpdateStrategy.() -> Unit) {
  this as Daemonsetspec_apps_v1Impl
  DaemonSetUpdateStrategy_apps_v1Impl(this)
    .also { updateStrategy = it }
    .apply(init)
}

/** Represents the latest available observations of a DaemonSet's current state. */
@K8sDslMarker
fun Daemonsetstatus.conditions(init: DaemonSetCondition.() -> Unit) {
  this as Daemonsetstatus_apps_v1Impl
  DaemonSetCondition_apps_v1Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this
deployment. It must match the pod template's labels. */
@K8sDslMarker
fun Deploymentspec.selector(init: LabelSelector.() -> Unit) {
  this as Deploymentspec_apps_v1Impl
  LabelSelector_meta_v1Impl(this)
    .also { selector = it }
    .apply(init)
}

/** The deployment strategy to use to replace existing pods with new ones. */
@K8sDslMarker
fun Deploymentspec.strategy(init: Deploymentstrategy.() -> Unit) {
  this as Deploymentspec_apps_v1Impl
  Deploymentstrategy_apps_v1Impl(this)
    .also { strategy = it }
    .apply(init)
}

/** Template describes the pods that will be created. */
@K8sDslMarker
fun Deploymentspec.template(init: Podtemplatespec.() -> Unit) {
  this as Deploymentspec_apps_v1Impl
  Podtemplatespec_core_v1Impl(this)
    .also { template = it }
    .apply(init)
}

/** Represents the latest available observations of a deployment's current state. */
@K8sDslMarker
fun Deploymentstatus.conditions(init: DeploymentCondition.() -> Unit) {
  this as Deploymentstatus_apps_v1Impl
  DeploymentCondition_apps_v1Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate. */
@K8sDslMarker
fun Deploymentstrategy.rollingUpdate(init: Rollingupdatedeployment.() -> Unit) {
  this as Deploymentstrategy_apps_v1Impl
  Rollingupdatedeployment_apps_v1Impl(this)
    .also { rollingUpdate = it }
    .apply(init)
}

/** `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies
that the distinguisher is disabled and thus will always be the empty string. */
@K8sDslMarker
fun Flowschemaspec.distinguisherMethod(init: FlowDistinguisherMethod.() -> Unit) {
  this as Flowschemaspec_flowcontrol_apiserver_k8s_io_v1beta2Impl
  FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { distinguisherMethod = it }
    .apply(init)
}

/** `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be
resolved, the FlowSchema will be ignored and marked as invalid in its status. Required. */
@K8sDslMarker
fun Flowschemaspec.priorityLevelConfiguration(init: PriorityLevelConfigurationReference.() -> Unit) {
  this as Flowschemaspec_flowcontrol_apiserver_k8s_io_v1beta2Impl
  PriorityLevelConfigurationReference_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { priorityLevelConfiguration = it }
    .apply(init)
}

/** `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least
one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema. */
@K8sDslMarker
fun Flowschemaspec.rules(init: PolicyRulesWithSubjects.() -> Unit) {
  this as Flowschemaspec_flowcontrol_apiserver_k8s_io_v1beta2Impl
  PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { rules = rules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** `conditions` is a list of the current states of FlowSchema. */
@K8sDslMarker
fun Flowschemastatus.conditions(init: FlowSchemaCondition.() -> Unit) {
  this as Flowschemastatus_flowcontrol_apiserver_k8s_io_v1beta2Impl
  FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** behavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields
respectively). If not set, the default HPAScalingRules for scale up and scale down are used. */
@K8sDslMarker
fun Horizontalpodautoscalerspec.behavior(init: HorizontalPodAutoscalerBehavior.() -> Unit) {
  this as Horizontalpodautoscalerspec_autoscaling_v2Impl
  HorizontalPodAutoscalerBehavior_autoscaling_v2Impl(this)
    .also { behavior = it }
    .apply(init)
}

/** metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count
across all metrics will be used). The desired replica count is calculated multiplying the ratio between the target value
and the current value by the current number of pods. Ergo, metrics used must decrease as the pod count is increased, and
vice-versa. See the individual metric source types for more information about how each type of metric must respond. If
not set, the default metric will be set to 80% average CPU utilization. */
@K8sDslMarker
fun Horizontalpodautoscalerspec.metrics(init: MetricSpec.() -> Unit) {
  this as Horizontalpodautoscalerspec_autoscaling_v2Impl
  MetricSpec_autoscaling_v2Impl(this)
    .also { metrics = metrics?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as
well as to actually change the replica count. */
@K8sDslMarker
fun Horizontalpodautoscalerspec.scaleTargetRef(init: CrossVersionObjectReference.() -> Unit) {
  this as Horizontalpodautoscalerspec_autoscaling_v2Impl
  CrossVersionObjectReference_autoscaling_v2Impl(this)
    .also { scaleTargetRef = it }
    .apply(init)
}

/** conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those
conditions are met. */
@K8sDslMarker
fun Horizontalpodautoscalerstatus.conditions(init: HorizontalPodAutoscalerCondition.() -> Unit) {
  this as Horizontalpodautoscalerstatus_autoscaling_v2Impl
  HorizontalPodAutoscalerCondition_autoscaling_v2Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** currentMetrics is the last read state of the metrics used by this autoscaler. */
@K8sDslMarker
fun Horizontalpodautoscalerstatus.currentMetrics(init: MetricStatus.() -> Unit) {
  this as Horizontalpodautoscalerstatus_autoscaling_v2Impl
  MetricStatus_autoscaling_v2Impl(this)
    .also { currentMetrics = currentMetrics?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control
how often the number of pods is changed. */
@K8sDslMarker
fun Horizontalpodautoscalerstatus.lastScaleTime(init: Time.() -> Unit) {
  this as Horizontalpodautoscalerstatus_autoscaling_v2Impl
  Time_meta_v1Impl(this)
    .also { lastScaleTime = it }
    .apply(init)
}

/** Parameters is a link to a custom resource containing additional configuration for the controller. This is optional if
the controller does not require extra parameters. */
@K8sDslMarker
fun Ingressclassspec.parameters(init: IngressClassParametersReference.() -> Unit) {
  this as Ingressclassspec_networking_k8s_io_v1Impl
  IngressClassParametersReference_networking_k8s_io_v1Impl(this)
    .also { parameters = it }
    .apply(init)
}

/** DefaultBackend is the backend that should handle requests that don't match any rule. If Rules are not specified,
DefaultBackend must be specified. If DefaultBackend is not set, the handling of requests that do not match any of the
rules will be up to the Ingress controller. */
@K8sDslMarker
fun Ingressspec.defaultBackend(init: IngressBackend.() -> Unit) {
  this as Ingressspec_networking_k8s_io_v1Impl
  IngressBackend_networking_k8s_io_v1Impl(this)
    .also { defaultBackend = it }
    .apply(init)
}

/** A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the
default backend. */
@K8sDslMarker
fun Ingressspec.rules(init: IngressRule.() -> Unit) {
  this as Ingressspec_networking_k8s_io_v1Impl
  IngressRule_networking_k8s_io_v1Impl(this)
    .also { rules = rules?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify
different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS
extension, if the ingress controller fulfilling the ingress supports SNI. */
@K8sDslMarker
fun Ingressspec.tls(init: IngressTLS.() -> Unit) {
  this as Ingressspec_networking_k8s_io_v1Impl
  IngressTLS_networking_k8s_io_v1Impl(this)
    .also { tls = tls?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** LoadBalancer contains the current status of the load-balancer. */
@K8sDslMarker
fun Ingressstatus.loadBalancer(init: LoadBalancerStatus.() -> Unit) {
  this as Ingressstatus_networking_k8s_io_v1Impl
  LoadBalancerStatus_core_v1Impl(this)
    .also { loadBalancer = it }
    .apply(init)
}

/** A label query over pods that should match the pod count. Normally, the system sets this field for you. More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
@K8sDslMarker
fun Jobspec.selector(init: LabelSelector.() -> Unit) {
  this as Jobspec_batch_v1Impl
  LabelSelector_meta_v1Impl(this)
    .also { selector = it }
    .apply(init)
}

/** Describes the pod that will be created when executing a job. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ */
@K8sDslMarker
fun Jobspec.template(init: Podtemplatespec.() -> Unit) {
  this as Jobspec_batch_v1Impl
  Podtemplatespec_core_v1Impl(this)
    .also { template = it }
    .apply(init)
}

/** Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate
operations. It is represented in RFC3339 form and is in UTC. The completion time is only set when the job finishes
successfully. */
@K8sDslMarker
fun Jobstatus.completionTime(init: Time.() -> Unit) {
  this as Jobstatus_batch_v1Impl
  Time_meta_v1Impl(this)
    .also { completionTime = it }
    .apply(init)
}

/** The latest available observations of an object's current state. When a Job fails, one of the conditions will have type
"Failed" and status true. When a Job is suspended, one of the conditions will have type "Suspended" and status true;
when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions
will have type "Complete" and status true. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ */
@K8sDslMarker
fun Jobstatus.conditions(init: JobCondition.() -> Unit) {
  this as Jobstatus_batch_v1Impl
  JobCondition_batch_v1Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Represents time when the job controller started processing a job. When a Job is created in the suspended state, this
field is not set until the first time it is resumed. This field is reset every time a Job is resumed from suspension. It
is represented in RFC3339 form and is in UTC. */
@K8sDslMarker
fun Jobstatus.startTime(init: Time.() -> Unit) {
  this as Jobstatus_batch_v1Impl
  Time_meta_v1Impl(this)
    .also { startTime = it }
    .apply(init)
}

/** UncountedTerminatedPods holds the UIDs of Pods that have terminated but the job controller hasn't yet accounted for in
the status counters. The job controller creates pods with a finalizer. When a pod terminates (succeeded or failed), the
controller does three steps to account for it in the job status: (1) Add the pod UID to the arrays in this field. (2)
Remove the pod finalizer. (3) Remove the pod UID from the arrays while increasing the corresponding counter. This field
is beta-level. The job controller only makes use of this field when the feature gate JobTrackingWithFinalizers is
enabled (enabled by default). Old jobs might not be tracked using this field, in which case the field remains null. */
@K8sDslMarker
fun Jobstatus.uncountedTerminatedPods(init: UncountedTerminatedPods.() -> Unit) {
  this as Jobstatus_batch_v1Impl
  UncountedTerminatedPods_batch_v1Impl(this)
    .also { uncountedTerminatedPods = it }
    .apply(init)
}

/** acquireTime is a time when the current lease was acquired. */
@K8sDslMarker
fun Leasespec.acquireTime(init: MicroTime.() -> Unit) {
  this as Leasespec_coordination_k8s_io_v1Impl
  MicroTime_meta_v1Impl(this)
    .also { acquireTime = it }
    .apply(init)
}

/** renewTime is a time when the current holder of a lease has last updated the lease. */
@K8sDslMarker
fun Leasespec.renewTime(init: MicroTime.() -> Unit) {
  this as Leasespec_coordination_k8s_io_v1Impl
  MicroTime_meta_v1Impl(this)
    .also { renewTime = it }
    .apply(init)
}

/** Limits is the list of LimitRangeItem objects that are enforced. */
@K8sDslMarker
fun Limitrangespec.limits(init: LimitRangeItem.() -> Unit) {
  this as Limitrangespec_core_v1Impl
  LimitRangeItem_core_v1Impl(this)
    .also { limits = limits?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Represents the latest available observations of a namespace's current state. */
@K8sDslMarker
fun Namespacestatus.conditions(init: NamespaceCondition.() -> Unit) {
  this as Namespacestatus_core_v1Impl
  NamespaceCondition_core_v1Impl(this)
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
  this as Networkpolicyspec_networking_k8s_io_v1Impl
  NetworkPolicyEgressRule_networking_k8s_io_v1Impl(this)
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
  this as Networkpolicyspec_networking_k8s_io_v1Impl
  NetworkPolicyIngressRule_networking_k8s_io_v1Impl(this)
    .also { ingress = ingress?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Selects the pods to which this NetworkPolicy object applies. The array of ingress rules is applied to any pods selected
by this field. Multiple network policies can select the same set of pods. In this case, the ingress rules for each are
combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector
matches all pods in this namespace. */
@K8sDslMarker
fun Networkpolicyspec.podSelector(init: LabelSelector.() -> Unit) {
  this as Networkpolicyspec_networking_k8s_io_v1Impl
  LabelSelector_meta_v1Impl(this)
    .also { podSelector = it }
    .apply(init)
}

/** Conditions holds an array of metav1.Condition that describe the state of the NetworkPolicy. Current service state */
@K8sDslMarker
fun Networkpolicystatus.conditions(init: Condition.() -> Unit) {
  this as Networkpolicystatus_networking_k8s_io_v1Impl
  Condition_meta_v1Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Deprecated: Previously used to specify the source of the node's configuration for the DynamicKubeletConfig feature. This
feature is removed from Kubelets as of 1.24 and will be fully removed in 1.26. */
@K8sDslMarker
fun Nodespec.configSource(init: NodeConfigSource.() -> Unit) {
  this as Nodespec_core_v1Impl
  NodeConfigSource_core_v1Impl(this)
    .also { configSource = it }
    .apply(init)
}

/** If specified, the node's taints. */
@K8sDslMarker
fun Nodespec.taints(init: Taint.() -> Unit) {
  this as Nodespec_core_v1Impl
  Taint_core_v1Impl(this)
    .also { taints = taints?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of addresses reachable to the node. Queried from cloud provider, if available. More info:
https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key
is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a
full-replacement patch. See http://pr.k8s.io/79391 for an example. */
@K8sDslMarker
fun Nodestatus.addresses(init: NodeAddress.() -> Unit) {
  this as Nodestatus_core_v1Impl
  NodeAddress_core_v1Impl(this)
    .also { addresses = addresses?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Conditions is an array of current observed node conditions. More info:
https://kubernetes.io/docs/concepts/nodes/node/#condition */
@K8sDslMarker
fun Nodestatus.conditions(init: NodeCondition.() -> Unit) {
  this as Nodestatus_core_v1Impl
  NodeCondition_core_v1Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Status of the config assigned to the node via the dynamic Kubelet config feature. */
@K8sDslMarker
fun Nodestatus.config(init: NodeConfigStatus.() -> Unit) {
  this as Nodestatus_core_v1Impl
  NodeConfigStatus_core_v1Impl(this)
    .also { config = it }
    .apply(init)
}

/** Endpoints of daemons running on the Node. */
@K8sDslMarker
fun Nodestatus.daemonEndpoints(init: NodeDaemonEndpoints.() -> Unit) {
  this as Nodestatus_core_v1Impl
  NodeDaemonEndpoints_core_v1Impl(this)
    .also { daemonEndpoints = it }
    .apply(init)
}

/** List of container images on this node */
@K8sDslMarker
fun Nodestatus.images(init: ContainerImage.() -> Unit) {
  this as Nodestatus_core_v1Impl
  ContainerImage_core_v1Impl(this)
    .also { images = images?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info */
@K8sDslMarker
fun Nodestatus.nodeInfo(init: NodeSystemInfo.() -> Unit) {
  this as Nodestatus_core_v1Impl
  NodeSystemInfo_core_v1Impl(this)
    .also { nodeInfo = it }
    .apply(init)
}

/** List of volumes that are attached to the node. */
@K8sDslMarker
fun Nodestatus.volumesAttached(init: AttachedVolume.() -> Unit) {
  this as Nodestatus_core_v1Impl
  AttachedVolume_core_v1Impl(this)
    .also { volumesAttached = volumesAttached?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** dataSource field can be used to specify either: `*` An existing VolumeSnapshot object
(snapshot.storage.k8s.io/VolumeSnapshot) `*` An existing PVC (PersistentVolumeClaim) If the provisioner or an external
controller can support the specified data source, it will create a new volume based on the contents of the specified
data source. If the AnyVolumeDataSource feature gate is enabled, this field will always have the same contents as the
DataSourceRef field. */
@K8sDslMarker
fun Persistentvolumeclaimspec.dataSource(init: TypedLocalObjectReference.() -> Unit) {
  this as Persistentvolumeclaimspec_core_v1Impl
  TypedLocalObjectReference_core_v1Impl(this)
    .also { dataSource = it }
    .apply(init)
}

/** dataSourceRef specifies the object from which to populate the volume with data, if a non-empty volume is desired. This
may be any local object from a non-empty API group (non core object) or a PersistentVolumeClaim object. When this field
is specified, volume binding will only succeed if the type of the specified object matches some installed volume
populator or dynamic provisioner. This field will replace the functionality of the DataSource field and as such if both
fields are non-empty, they must have the same value. For backwards compatibility, both fields (DataSource and
DataSourceRef) will be set to the same value automatically if one of them is empty and the other is non-empty. There are
two important differences between DataSource and DataSourceRef: `*` While DataSource only allows two specific types of
objects, DataSourceRef allows any non-core object, as well as PersistentVolumeClaim objects. `*` While DataSource
ignores disallowed values (dropping them), DataSourceRef preserves all values, and generates an error if a disallowed
value is specified. (Beta) Using this field requires the AnyVolumeDataSource feature gate to be enabled. */
@K8sDslMarker
fun Persistentvolumeclaimspec.dataSourceRef(init: TypedLocalObjectReference.() -> Unit) {
  this as Persistentvolumeclaimspec_core_v1Impl
  TypedLocalObjectReference_core_v1Impl(this)
    .also { dataSourceRef = it }
    .apply(init)
}

/** resources represents the minimum resources the volume should have. If RecoverVolumeExpansionFailure feature is enabled
users are allowed to specify resource requirements that are lower than previous value but must still be higher than
capacity recorded in the status field of the claim. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources */
@K8sDslMarker
fun Persistentvolumeclaimspec.resources(init: ResourceRequirements.() -> Unit) {
  this as Persistentvolumeclaimspec_core_v1Impl
  ResourceRequirements_core_v1Impl(this)
    .also { resources = it }
    .apply(init)
}

/** selector is a label query over volumes to consider for binding. */
@K8sDslMarker
fun Persistentvolumeclaimspec.selector(init: LabelSelector.() -> Unit) {
  this as Persistentvolumeclaimspec_core_v1Impl
  LabelSelector_meta_v1Impl(this)
    .also { selector = it }
    .apply(init)
}

/** conditions is the current Condition of persistent volume claim. If underlying persistent volume is being resized then
the Condition will be set to 'ResizeStarted'. */
@K8sDslMarker
fun Persistentvolumeclaimstatus.conditions(init: PersistentVolumeClaimCondition.() -> Unit) {
  this as Persistentvolumeclaimstatus_core_v1Impl
  PersistentVolumeClaimCondition_core_v1Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to
the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
@K8sDslMarker
fun Persistentvolumespec.awsElasticBlockStore(init: AWSElasticBlockStoreVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  AWSElasticBlockStoreVolumeSource_core_v1Impl(this)
    .also { awsElasticBlockStore = it }
    .apply(init)
}

/** azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod. */
@K8sDslMarker
fun Persistentvolumespec.azureDisk(init: AzureDiskVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  AzureDiskVolumeSource_core_v1Impl(this)
    .also { azureDisk = it }
    .apply(init)
}

/** azureFile represents an Azure File Service mount on the host and bind mount to the pod. */
@K8sDslMarker
fun Persistentvolumespec.azureFile(init: AzureFilePersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  AzureFilePersistentVolumeSource_core_v1Impl(this)
    .also { azureFile = it }
    .apply(init)
}

/** cephFS represents a Ceph FS mount on the host that shares a pod's lifetime */
@K8sDslMarker
fun Persistentvolumespec.cephfs(init: CephFSPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  CephFSPersistentVolumeSource_core_v1Impl(this)
    .also { cephfs = it }
    .apply(init)
}

/** cinder represents a cinder volume attached and mounted on kubelets host machine. More info:
https://examples.k8s.io/mysql-cinder-pd/README.md */
@K8sDslMarker
fun Persistentvolumespec.cinder(init: CinderPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  CinderPersistentVolumeSource_core_v1Impl(this)
    .also { cinder = it }
    .apply(init)
}

/** claimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil
when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding */
@K8sDslMarker
fun Persistentvolumespec.claimRef(init: ObjectReference.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  ObjectReference_core_v1Impl(this)
    .also { claimRef = it }
    .apply(init)
}

/** csi represents storage that is handled by an external CSI driver (Beta feature). */
@K8sDslMarker
fun Persistentvolumespec.csi(init: CSIPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  CSIPersistentVolumeSource_core_v1Impl(this)
    .also { csi = it }
    .apply(init)
}

/** fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod. */
@K8sDslMarker
fun Persistentvolumespec.fc(init: FCVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  FCVolumeSource_core_v1Impl(this)
    .also { fc = it }
    .apply(init)
}

/** flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin. */
@K8sDslMarker
fun Persistentvolumespec.flexVolume(init: FlexPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  FlexPersistentVolumeSource_core_v1Impl(this)
    .also { flexVolume = it }
    .apply(init)
}

/** flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage. This
depends on the Flocker control service being running */
@K8sDslMarker
fun Persistentvolumespec.flocker(init: FlockerVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  FlockerVolumeSource_core_v1Impl(this)
    .also { flocker = it }
    .apply(init)
}

/** gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the
pod. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk */
@K8sDslMarker
fun Persistentvolumespec.gcePersistentDisk(init: GCEPersistentDiskVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  GCEPersistentDiskVolumeSource_core_v1Impl(this)
    .also { gcePersistentDisk = it }
    .apply(init)
}

/** glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More
info: https://examples.k8s.io/volumes/glusterfs/README.md */
@K8sDslMarker
fun Persistentvolumespec.glusterfs(init: GlusterfsPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  GlusterfsPersistentVolumeSource_core_v1Impl(this)
    .also { glusterfs = it }
    .apply(init)
}

/** hostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node
development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster.
More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath */
@K8sDslMarker
fun Persistentvolumespec.hostPath(init: HostPathVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  HostPathVolumeSource_core_v1Impl(this)
    .also { hostPath = it }
    .apply(init)
}

/** iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
Provisioned by an admin. */
@K8sDslMarker
fun Persistentvolumespec.iscsi(init: ISCSIPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  ISCSIPersistentVolumeSource_core_v1Impl(this)
    .also { iscsi = it }
    .apply(init)
}

/** local represents directly-attached storage with node affinity */
@K8sDslMarker
fun Persistentvolumespec.local(init: LocalVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  LocalVolumeSource_core_v1Impl(this)
    .also { local = it }
    .apply(init)
}

/** nfs represents an NFS mount on the host. Provisioned by an admin. More info:
https://kubernetes.io/docs/concepts/storage/volumes#nfs */
@K8sDslMarker
fun Persistentvolumespec.nfs(init: NFSVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  NFSVolumeSource_core_v1Impl(this)
    .also { nfs = it }
    .apply(init)
}

/** nodeAffinity defines constraints that limit what nodes this volume can be accessed from. This field influences the
scheduling of pods that use this volume. */
@K8sDslMarker
fun Persistentvolumespec.nodeAffinity(init: VolumeNodeAffinity.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  VolumeNodeAffinity_core_v1Impl(this)
    .also { nodeAffinity = it }
    .apply(init)
}

/** photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine */
@K8sDslMarker
fun Persistentvolumespec.photonPersistentDisk(init: PhotonPersistentDiskVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  PhotonPersistentDiskVolumeSource_core_v1Impl(this)
    .also { photonPersistentDisk = it }
    .apply(init)
}

/** portworxVolume represents a portworx volume attached and mounted on kubelets host machine */
@K8sDslMarker
fun Persistentvolumespec.portworxVolume(init: PortworxVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  PortworxVolumeSource_core_v1Impl(this)
    .also { portworxVolume = it }
    .apply(init)
}

/** quobyte represents a Quobyte mount on the host that shares a pod's lifetime */
@K8sDslMarker
fun Persistentvolumespec.quobyte(init: QuobyteVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  QuobyteVolumeSource_core_v1Impl(this)
    .also { quobyte = it }
    .apply(init)
}

/** rbd represents a Rados Block Device mount on the host that shares a pod's lifetime. More info:
https://examples.k8s.io/volumes/rbd/README.md */
@K8sDslMarker
fun Persistentvolumespec.rbd(init: RBDPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  RBDPersistentVolumeSource_core_v1Impl(this)
    .also { rbd = it }
    .apply(init)
}

/** scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes. */
@K8sDslMarker
fun Persistentvolumespec.scaleIO(init: ScaleIOPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  ScaleIOPersistentVolumeSource_core_v1Impl(this)
    .also { scaleIO = it }
    .apply(init)
}

/** storageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More
info: https://examples.k8s.io/volumes/storageos/README.md */
@K8sDslMarker
fun Persistentvolumespec.storageos(init: StorageOSPersistentVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  StorageOSPersistentVolumeSource_core_v1Impl(this)
    .also { storageos = it }
    .apply(init)
}

/** vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine */
@K8sDslMarker
fun Persistentvolumespec.vsphereVolume(init: VsphereVirtualDiskVolumeSource.() -> Unit) {
  this as Persistentvolumespec_core_v1Impl
  VsphereVirtualDiskVolumeSource_core_v1Impl(this)
    .also { vsphereVolume = it }
    .apply(init)
}

/** Label query over pods whose evictions are managed by the disruption budget. A null selector will match no pods, while an
empty ({}) selector will select all pods within the namespace. */
@K8sDslMarker
fun Poddisruptionbudgetspec.selector(init: LabelSelector.() -> Unit) {
  this as Poddisruptionbudgetspec_policy_v1Impl
  LabelSelector_meta_v1Impl(this)
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
  this as Poddisruptionbudgetspec_policy_v1Impl
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
  this as Poddisruptionbudgetspec_policy_v1Impl
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
  this as Poddisruptionbudgetspec_policy_v1Impl
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
  this as Poddisruptionbudgetspec_policy_v1Impl
  de.loosetie.k8s.dsl.types.IntOrPercentage(int)
    .also { minAvailable = it }
}

/** Conditions contain conditions for PDB. The disruption controller sets the DisruptionAllowed condition. The following are
known values for the reason field (additional reasons could be added in the future): - SyncFailed: The controller
encountered an error and wasn't able to compute the number of allowed disruptions. Therefore no disruptions are allowed
and the status of the condition will be False. - InsufficientPods: The number of pods are either at or below the number
required by the PodDisruptionBudget. No disruptions are allowed and the status of the condition will be False. -
SufficientPods: There are more pods than required by the PodDisruptionBudget. The condition will be True, and the number
of allowed disruptions are provided by the disruptionsAllowed property. */
@K8sDslMarker
fun Poddisruptionbudgetstatus.conditions(init: Condition.() -> Unit) {
  this as Poddisruptionbudgetstatus_policy_v1Impl
  Condition_meta_v1Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** AllowedCSIDrivers is an allowlist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An
empty value indicates that any CSI driver can be used for inline ephemeral volumes. This is a beta field, and is only
honored if the API server enables the CSIInlineVolume feature gate. */
@K8sDslMarker
fun Podsecuritypolicyspec.allowedCSIDrivers(init: AllowedCSIDriver.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1Impl
  AllowedCSIDriver_policy_v1beta1Impl(this)
    .also { allowedCSIDrivers = allowedCSIDrivers?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** allowedFlexVolumes is an allowlist of Flexvolumes. Empty or nil indicates that all Flexvolumes may be used. This
parameter is effective only when the usage of the Flexvolumes is allowed in the "volumes" field. */
@K8sDslMarker
fun Podsecuritypolicyspec.allowedFlexVolumes(init: AllowedFlexVolume.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1Impl
  AllowedFlexVolume_policy_v1beta1Impl(this)
    .also { allowedFlexVolumes = allowedFlexVolumes?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** allowedHostPaths is an allowlist of host paths. Empty indicates that all host paths may be used. */
@K8sDslMarker
fun Podsecuritypolicyspec.allowedHostPaths(init: AllowedHostPath.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1Impl
  AllowedHostPath_policy_v1beta1Impl(this)
    .also { allowedHostPaths = allowedHostPaths?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** fsGroup is the strategy that will dictate what fs group is used by the SecurityContext. */
@K8sDslMarker
fun Podsecuritypolicyspec.fsGroup(init: FSGroupStrategyOptions.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1Impl
  FSGroupStrategyOptions_policy_v1beta1Impl(this)
    .also { fsGroup = it }
    .apply(init)
}

/** hostPorts determines which host port ranges are allowed to be exposed. */
@K8sDslMarker
fun Podsecuritypolicyspec.hostPorts(init: HostPortRange.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1Impl
  HostPortRange_policy_v1beta1Impl(this)
    .also { hostPorts = hostPorts?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set. If this field is omitted,
the pod's RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled. */
@K8sDslMarker
fun Podsecuritypolicyspec.runAsGroup(init: RunAsGroupStrategyOptions.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1Impl
  RunAsGroupStrategyOptions_policy_v1beta1Impl(this)
    .also { runAsGroup = it }
    .apply(init)
}

/** runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set. */
@K8sDslMarker
fun Podsecuritypolicyspec.runAsUser(init: RunAsUserStrategyOptions.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1Impl
  RunAsUserStrategyOptions_policy_v1beta1Impl(this)
    .also { runAsUser = it }
    .apply(init)
}

/** runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod. If this field is omitted, the
pod's runtimeClassName field is unrestricted. Enforcement of this field depends on the RuntimeClass feature gate being
enabled. */
@K8sDslMarker
fun Podsecuritypolicyspec.runtimeClass(init: RuntimeClassStrategyOptions.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1Impl
  RuntimeClassStrategyOptions_policy_v1beta1Impl(this)
    .also { runtimeClass = it }
    .apply(init)
}

/** seLinux is the strategy that will dictate the allowable labels that may be set. */
@K8sDslMarker
fun Podsecuritypolicyspec.seLinux(init: SELinuxStrategyOptions.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1Impl
  SELinuxStrategyOptions_policy_v1beta1Impl(this)
    .also { seLinux = it }
    .apply(init)
}

/** supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext. */
@K8sDslMarker
fun Podsecuritypolicyspec.supplementalGroups(init: SupplementalGroupsStrategyOptions.() -> Unit) {
  this as Podsecuritypolicyspec_policy_v1beta1Impl
  SupplementalGroupsStrategyOptions_policy_v1beta1Impl(this)
    .also { supplementalGroups = it }
    .apply(init)
}

/** If specified, the pod's scheduling constraints */
@K8sDslMarker
fun Podspec.affinity(init: Affinity.() -> Unit) {
  this as Podspec_core_v1Impl
  Affinity_core_v1Impl(this)
    .also { affinity = it }
    .apply(init)
}

/** List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one
container in a Pod. Cannot be updated. */
@K8sDslMarker
fun Podspec.containers(init: Container.() -> Unit) {
  this as Podspec_core_v1Impl
  Container_core_v1Impl(this)
    .also { containers = containers?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based
on DNSPolicy. */
@K8sDslMarker
fun Podspec.dnsConfig(init: PodDNSConfig.() -> Unit) {
  this as Podspec_core_v1Impl
  PodDNSConfig_core_v1Impl(this)
    .also { dnsConfig = it }
    .apply(init)
}

/** List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform
user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified
by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers
subresource. This field is beta-level and available on clusters that haven't disabled the EphemeralContainers feature
gate. */
@K8sDslMarker
fun Podspec.ephemeralContainers(init: EphemeralContainer.() -> Unit) {
  this as Podspec_core_v1Impl
  EphemeralContainer_core_v1Impl(this)
    .also { ephemeralContainers = ephemeralContainers?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is
only valid for non-hostNetwork pods. */
@K8sDslMarker
fun Podspec.hostAliases(init: HostAlias.() -> Unit) {
  this as Podspec_core_v1Impl
  HostAlias_core_v1Impl(this)
    .also { hostAliases = hostAliases?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images
used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use.
More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod */
@K8sDslMarker
fun Podspec.imagePullSecrets(init: LocalObjectReference.() -> Unit) {
  this as Podspec_core_v1Impl
  LocalObjectReference_core_v1Impl(this)
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
  this as Podspec_core_v1Impl
  Container_core_v1Impl(this)
    .also { initContainers = initContainers?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Specifies the OS of the containers in the pod. Some pod and container fields are restricted if this is set. If the OS
field is set to linux, the following fields must be unset: -securityContext.windowsOptions If the OS field is set to
windows, following fields must be unset: - spec.hostPID - spec.hostIPC - spec.securityContext.seLinuxOptions -
spec.securityContext.seccompProfile - spec.securityContext.fsGroup - spec.securityContext.fsGroupChangePolicy -
spec.securityContext.sysctls - spec.shareProcessNamespace - spec.securityContext.runAsUser -
spec.securityContext.runAsGroup - spec.securityContext.supplementalGroups -
spec.containers[`*`].securityContext.seLinuxOptions - spec.containers[`*`].securityContext.seccompProfile -
spec.containers[`*`].securityContext.capabilities - spec.containers[`*`].securityContext.readOnlyRootFilesystem -
spec.containers[`*`].securityContext.privileged - spec.containers[`*`].securityContext.allowPrivilegeEscalation -
spec.containers[`*`].securityContext.procMount - spec.containers[`*`].securityContext.runAsUser -
spec.containers[`*`].securityContext.runAsGroup This is a beta field and requires the IdentifyPodOS feature */
@K8sDslMarker
fun Podspec.os(init: PodOS.() -> Unit) {
  this as Podspec_core_v1Impl
  PodOS_core_v1Impl(this)
    .also { os = it }
    .apply(init)
}

/** If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready
AND all conditions specified in the readiness gates have status equal to "True" More info:
https://git.k8s.io/enhancements/keps/sig-network/580-pod-readiness-gates */
@K8sDslMarker
fun Podspec.readinessGates(init: PodReadinessGate.() -> Unit) {
  this as Podspec_core_v1Impl
  PodReadinessGate_core_v1Impl(this)
    .also { readinessGates = readinessGates?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty. See type
description for default values of each field. */
@K8sDslMarker
fun Podspec.securityContext(init: PodSecurityContext.() -> Unit) {
  this as Podspec_core_v1Impl
  PodSecurityContext_core_v1Impl(this)
    .also { securityContext = it }
    .apply(init)
}

/** If specified, the pod's tolerations. */
@K8sDslMarker
fun Podspec.tolerations(init: Toleration.() -> Unit) {
  this as Podspec_core_v1Impl
  Toleration_core_v1Impl(this)
    .also { tolerations = tolerations?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule
pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed. */
@K8sDslMarker
fun Podspec.topologySpreadConstraints(init: TopologySpreadConstraint.() -> Unit) {
  this as Podspec_core_v1Impl
  TopologySpreadConstraint_core_v1Impl(this)
    .also { topologySpreadConstraints = topologySpreadConstraints?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of volumes that can be mounted by containers belonging to the pod. More info:
https://kubernetes.io/docs/concepts/storage/volumes */
@K8sDslMarker
fun Podspec.volumes(init: Volume.() -> Unit) {
  this as Podspec_core_v1Impl
  Volume_core_v1Impl(this)
    .also { volumes = volumes?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions */
@K8sDslMarker
fun Podstatus.conditions(init: PodCondition.() -> Unit) {
  this as Podstatus_core_v1Impl
  PodCondition_core_v1Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** The list has one entry per container in the manifest. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status */
@K8sDslMarker
fun Podstatus.containerStatuses(init: Containerstatus.() -> Unit) {
  this as Podstatus_core_v1Impl
  Containerstatus_core_v1Impl(this)
    .also { containerStatuses = containerStatuses?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Status for any ephemeral containers that have run in this pod. This field is beta-level and available on clusters that
haven't disabled the EphemeralContainers feature gate. */
@K8sDslMarker
fun Podstatus.ephemeralContainerStatuses(init: Containerstatus.() -> Unit) {
  this as Podstatus_core_v1Impl
  Containerstatus_core_v1Impl(this)
    .also { ephemeralContainerStatuses = ephemeralContainerStatuses?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** The list has one entry per init container in the manifest. The most recent successful init container will have ready =
true, the most recently started container will have startTime set. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status */
@K8sDslMarker
fun Podstatus.initContainerStatuses(init: Containerstatus.() -> Unit) {
  this as Podstatus_core_v1Impl
  Containerstatus_core_v1Impl(this)
    .also { initContainerStatuses = initContainerStatuses?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP
field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated
yet. */
@K8sDslMarker
fun Podstatus.podIPs(init: PodIP.() -> Unit) {
  this as Podstatus_core_v1Impl
  PodIP_core_v1Impl(this)
    .also { podIPs = podIPs?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the
container image(s) for the pod. */
@K8sDslMarker
fun Podstatus.startTime(init: Time.() -> Unit) {
  this as Podstatus_core_v1Impl
  Time_meta_v1Impl(this)
    .also { startTime = it }
    .apply(init)
}

/** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun Podtemplatespec.metadata(init: ObjectMeta.() -> Unit) {
  this as Podtemplatespec_core_v1Impl
  ObjectMeta_meta_v1Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Specification of the desired behavior of the pod. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
@K8sDslMarker
fun Podtemplatespec.spec(init: Podspec.() -> Unit) {
  this as Podtemplatespec_core_v1Impl
  Podspec_core_v1Impl(this)
    .also { spec = it }
    .apply(init)
}

/** `limited` specifies how requests are handled for a Limited priority level. This field must be non-empty if and only if
`type` is `"Limited"`. */
@K8sDslMarker
fun Prioritylevelconfigurationspec.limited(init: LimitedPriorityLevelConfiguration.() -> Unit) {
  this as Prioritylevelconfigurationspec_flowcontrol_apiserver_k8s_io_v1beta2Impl
  LimitedPriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { limited = it }
    .apply(init)
}

/** `conditions` is the current state of "request-priority". */
@K8sDslMarker
fun Prioritylevelconfigurationstatus.conditions(init: PriorityLevelConfigurationCondition.() -> Unit) {
  this as Prioritylevelconfigurationstatus_flowcontrol_apiserver_k8s_io_v1beta2Impl
  PriorityLevelConfigurationCondition_flowcontrol_apiserver_k8s_io_v1beta2Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Selector is a label query over pods that should match the replica count. Label keys and values that must match in order
to be controlled by this replica set. It must match the pod template's labels. More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
@K8sDslMarker
fun Replicasetspec.selector(init: LabelSelector.() -> Unit) {
  this as Replicasetspec_apps_v1Impl
  LabelSelector_meta_v1Impl(this)
    .also { selector = it }
    .apply(init)
}

/** Template is the object that describes the pod that will be created if insufficient replicas are detected. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
@K8sDslMarker
fun Replicasetspec.template(init: Podtemplatespec.() -> Unit) {
  this as Replicasetspec_apps_v1Impl
  Podtemplatespec_core_v1Impl(this)
    .also { template = it }
    .apply(init)
}

/** Represents the latest available observations of a replica set's current state. */
@K8sDslMarker
fun Replicasetstatus.conditions(init: ReplicaSetCondition.() -> Unit) {
  this as Replicasetstatus_apps_v1Impl
  ReplicaSetCondition_apps_v1Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Template is the object that describes the pod that will be created if insufficient replicas are detected. This takes
precedence over a TemplateRef. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
@K8sDslMarker
fun Replicationcontrollerspec.template(init: Podtemplatespec.() -> Unit) {
  this as Replicationcontrollerspec_core_v1Impl
  Podtemplatespec_core_v1Impl(this)
    .also { template = it }
    .apply(init)
}

/** Represents the latest available observations of a replication controller's current state. */
@K8sDslMarker
fun Replicationcontrollerstatus.conditions(init: ReplicationControllerCondition.() -> Unit) {
  this as Replicationcontrollerstatus_core_v1Impl
  ReplicationControllerCondition_core_v1Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed
using ScopeSelectorOperator in combination with possible values. For a resource to match, both scopes AND scopeSelector
(if specified in spec), must be matched. */
@K8sDslMarker
fun Resourcequotaspec.scopeSelector(init: ScopeSelector.() -> Unit) {
  this as Resourcequotaspec_core_v1Impl
  ScopeSelector_core_v1Impl(this)
    .also { scopeSelector = it }
    .apply(init)
}

/** The maximum number of nodes with an existing available DaemonSet pod that can have an updated DaemonSet pod during
during an update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0
if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up to a minimum of 1. Default value is
0. Example: when this is set to 30%, at most 30% of the total number of nodes that should be running the daemon pod
(i.e. status.desiredNumberScheduled) can have their a new pod created before the old pod is marked as deleted. The
update starts by launching new pods on 30% of nodes. Once an updated pod is available (Ready for at least
minReadySeconds) the old DaemonSet pod on that node is marked deleted. If the old pod becomes unavailable for any reason
(Ready transitions to false, is evicted, or is drained) an updated pod is immediatedly created on that node without
considering surge limits. Allowing surge implies the possibility that the resources consumed by the daemonset on any
given node can double if the readiness check fails, and so resource intensive daemonsets should take into account that
they may cause evictions during disruption. This is beta field and enabled/disabled by DaemonSetUpdateSurge feature
gate. */
@K8sDslMarker
fun Rollingupdatedaemonset.maxSurge(percentage: String) {
  this as Rollingupdatedaemonset_apps_v1Impl
  de.loosetie.k8s.dsl.types.IntOrPercentage(percentage)
    .also { maxSurge = it }
}

/** The maximum number of nodes with an existing available DaemonSet pod that can have an updated DaemonSet pod during
during an update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0
if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up to a minimum of 1. Default value is
0. Example: when this is set to 30%, at most 30% of the total number of nodes that should be running the daemon pod
(i.e. status.desiredNumberScheduled) can have their a new pod created before the old pod is marked as deleted. The
update starts by launching new pods on 30% of nodes. Once an updated pod is available (Ready for at least
minReadySeconds) the old DaemonSet pod on that node is marked deleted. If the old pod becomes unavailable for any reason
(Ready transitions to false, is evicted, or is drained) an updated pod is immediatedly created on that node without
considering surge limits. Allowing surge implies the possibility that the resources consumed by the daemonset on any
given node can double if the readiness check fails, and so resource intensive daemonsets should take into account that
they may cause evictions during disruption. This is beta field and enabled/disabled by DaemonSetUpdateSurge feature
gate. */
@K8sDslMarker
fun Rollingupdatedaemonset.maxSurge(int: Int) {
  this as Rollingupdatedaemonset_apps_v1Impl
  de.loosetie.k8s.dsl.types.IntOrPercentage(int)
    .also { maxSurge = it }
}

/** The maximum number of DaemonSet pods that can be unavailable during the update. Value can be an absolute number (ex: 5)
or a percentage of total number of DaemonSet pods at the start of the update (ex: 10%). Absolute number is calculated
from percentage by rounding up. This cannot be 0 if MaxSurge is 0 Default value is 1. Example: when this is set to 30%,
at most 30% of the total number of nodes that should be running the daemon pod (i.e. status.desiredNumberScheduled) can
have their pods stopped for an update at any given time. The update starts by stopping at most 30% of those DaemonSet
pods and then brings up new DaemonSet pods in their place. Once the new pods are available, it then proceeds onto other
DaemonSet pods, thus ensuring that at least 70% of original number of DaemonSet pods are available at all times during
the update. */
@K8sDslMarker
fun Rollingupdatedaemonset.maxUnavailable(percentage: String) {
  this as Rollingupdatedaemonset_apps_v1Impl
  de.loosetie.k8s.dsl.types.IntOrPercentage(percentage)
    .also { maxUnavailable = it }
}

/** The maximum number of DaemonSet pods that can be unavailable during the update. Value can be an absolute number (ex: 5)
or a percentage of total number of DaemonSet pods at the start of the update (ex: 10%). Absolute number is calculated
from percentage by rounding up. This cannot be 0 if MaxSurge is 0 Default value is 1. Example: when this is set to 30%,
at most 30% of the total number of nodes that should be running the daemon pod (i.e. status.desiredNumberScheduled) can
have their pods stopped for an update at any given time. The update starts by stopping at most 30% of those DaemonSet
pods and then brings up new DaemonSet pods in their place. Once the new pods are available, it then proceeds onto other
DaemonSet pods, thus ensuring that at least 70% of original number of DaemonSet pods are available at all times during
the update. */
@K8sDslMarker
fun Rollingupdatedaemonset.maxUnavailable(int: Int) {
  this as Rollingupdatedaemonset_apps_v1Impl
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
  this as Rollingupdatedeployment_apps_v1Impl
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
  this as Rollingupdatedeployment_apps_v1Impl
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
  this as Rollingupdatedeployment_apps_v1Impl
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
  this as Rollingupdatedeployment_apps_v1Impl
  de.loosetie.k8s.dsl.types.IntOrPercentage(int)
    .also { maxUnavailable = it }
}

/** NonResourceAttributes describes information for a non-resource access request */
@K8sDslMarker
fun Selfsubjectaccessreviewspec.nonResourceAttributes(init: NonResourceAttributes.() -> Unit) {
  this as Selfsubjectaccessreviewspec_authorization_k8s_io_v1Impl
  NonResourceAttributes_authorization_k8s_io_v1Impl(this)
    .also { nonResourceAttributes = it }
    .apply(init)
}

/** ResourceAuthorizationAttributes describes information for a resource access request */
@K8sDslMarker
fun Selfsubjectaccessreviewspec.resourceAttributes(init: ResourceAttributes.() -> Unit) {
  this as Selfsubjectaccessreviewspec_authorization_k8s_io_v1Impl
  ResourceAttributes_authorization_k8s_io_v1Impl(this)
    .also { resourceAttributes = it }
    .apply(init)
}

/** The list of ports that are exposed by this service. More info:
https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies */
@K8sDslMarker
fun Servicespec.ports(init: ServicePort.() -> Unit) {
  this as Servicespec_core_v1Impl
  ServicePort_core_v1Impl(this)
    .also { ports = ports?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** sessionAffinityConfig contains the configurations of session affinity. */
@K8sDslMarker
fun Servicespec.sessionAffinityConfig(init: SessionAffinityConfig.() -> Unit) {
  this as Servicespec_core_v1Impl
  SessionAffinityConfig_core_v1Impl(this)
    .also { sessionAffinityConfig = it }
    .apply(init)
}

/** Current service state */
@K8sDslMarker
fun Servicestatus.conditions(init: Condition.() -> Unit) {
  this as Servicestatus_core_v1Impl
  Condition_meta_v1Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** LoadBalancer contains the current status of the load-balancer, if one is present. */
@K8sDslMarker
fun Servicestatus.loadBalancer(init: LoadBalancerStatus.() -> Unit) {
  this as Servicestatus_core_v1Impl
  LoadBalancerStatus_core_v1Impl(this)
    .also { loadBalancer = it }
    .apply(init)
}

/** persistentVolumeClaimRetentionPolicy describes the lifecycle of persistent volume claims created from
volumeClaimTemplates. By default, all persistent volume claims are created as needed and retained until manually
deleted. This policy allows the lifecycle to be altered, for example by deleting persistent volume claims when their
stateful set is deleted, or when their pod is scaled down. This requires the StatefulSetAutoDeletePVC feature gate to be
enabled, which is alpha. +optional */
@K8sDslMarker
fun Statefulsetspec.persistentVolumeClaimRetentionPolicy(init: StatefulSetPersistentVolumeClaimRetentionPolicy.() -> Unit) {
  this as Statefulsetspec_apps_v1Impl
  StatefulSetPersistentVolumeClaimRetentionPolicy_apps_v1Impl(this)
    .also { persistentVolumeClaimRetentionPolicy = it }
    .apply(init)
}

/** selector is a label query over pods that should match the replica count. It must match the pod template's labels. More
info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
@K8sDslMarker
fun Statefulsetspec.selector(init: LabelSelector.() -> Unit) {
  this as Statefulsetspec_apps_v1Impl
  LabelSelector_meta_v1Impl(this)
    .also { selector = it }
    .apply(init)
}

/** template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod
stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet. */
@K8sDslMarker
fun Statefulsetspec.template(init: Podtemplatespec.() -> Unit) {
  this as Statefulsetspec_apps_v1Impl
  Podtemplatespec_core_v1Impl(this)
    .also { template = it }
    .apply(init)
}

/** updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a
revision is made to Template. */
@K8sDslMarker
fun Statefulsetspec.updateStrategy(init: StatefulSetUpdateStrategy.() -> Unit) {
  this as Statefulsetspec_apps_v1Impl
  StatefulSetUpdateStrategy_apps_v1Impl(this)
    .also { updateStrategy = it }
    .apply(init)
}

/** volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible
for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must
have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence
over any volumes in the template, with the same name. */
@K8sDslMarker
fun Statefulsetspec.volumeClaimTemplates(init: PersistentVolumeClaim.() -> Unit) {
  this as Statefulsetspec_apps_v1Impl
  PersistentVolumeClaim_core_v1Impl(this)
    .also { volumeClaimTemplates = volumeClaimTemplates?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Represents the latest available observations of a statefulset's current state. */
@K8sDslMarker
fun Statefulsetstatus.conditions(init: StatefulSetCondition.() -> Unit) {
  this as Statefulsetstatus_apps_v1Impl
  StatefulSetCondition_apps_v1Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** The latest available observations of the storageVersion's state. */
@K8sDslMarker
fun Storageversionstatus.conditions(init: StorageVersionCondition.() -> Unit) {
  this as Storageversionstatus_internal_apiserver_k8s_io_v1alpha1Impl
  StorageVersionCondition_internal_apiserver_k8s_io_v1alpha1Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** The reported versions per API server instance. */
@K8sDslMarker
fun Storageversionstatus.storageVersions(init: ServerStorageVersion.() -> Unit) {
  this as Storageversionstatus_internal_apiserver_k8s_io_v1alpha1Impl
  ServerStorageVersion_internal_apiserver_k8s_io_v1alpha1Impl(this)
    .also { storageVersions = storageVersions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** NonResourceAttributes describes information for a non-resource access request */
@K8sDslMarker
fun Subjectaccessreviewspec.nonResourceAttributes(init: NonResourceAttributes.() -> Unit) {
  this as Subjectaccessreviewspec_authorization_k8s_io_v1Impl
  NonResourceAttributes_authorization_k8s_io_v1Impl(this)
    .also { nonResourceAttributes = it }
    .apply(init)
}

/** ResourceAuthorizationAttributes describes information for a resource access request */
@K8sDslMarker
fun Subjectaccessreviewspec.resourceAttributes(init: ResourceAttributes.() -> Unit) {
  this as Subjectaccessreviewspec_authorization_k8s_io_v1Impl
  ResourceAttributes_authorization_k8s_io_v1Impl(this)
    .also { resourceAttributes = it }
    .apply(init)
}

/** BoundObjectRef is a reference to an object that the token will be bound to. The token will only be valid for as long as
the bound object exists. NOTE: The API server's TokenReview endpoint will validate the BoundObjectRef, but other
audiences may not. Keep ExpirationSeconds small if you want prompt revocation. */
@K8sDslMarker
fun Tokenrequestspec.boundObjectRef(init: BoundObjectReference.() -> Unit) {
  this as Tokenrequestspec_authentication_k8s_io_v1Impl
  BoundObjectReference_authentication_k8s_io_v1Impl(this)
    .also { boundObjectRef = it }
    .apply(init)
}

/** ExpirationTimestamp is the time of expiration of the returned token. */
@K8sDslMarker
fun Tokenrequeststatus.expirationTimestamp(init: Time.() -> Unit) {
  this as Tokenrequeststatus_authentication_k8s_io_v1Impl
  Time_meta_v1Impl(this)
    .also { expirationTimestamp = it }
    .apply(init)
}

/** User is the UserInfo associated with the provided token. */
@K8sDslMarker
fun Tokenreviewstatus.user(init: UserInfo.() -> Unit) {
  this as Tokenreviewstatus_authentication_k8s_io_v1Impl
  UserInfo_authentication_k8s_io_v1Impl(this)
    .also { user = it }
    .apply(init)
}

/** Source represents the volume that should be attached. */
@K8sDslMarker
fun Volumeattachmentspec.source(init: VolumeAttachmentSource.() -> Unit) {
  this as Volumeattachmentspec_storage_k8s_io_v1Impl
  VolumeAttachmentSource_storage_k8s_io_v1Impl(this)
    .also { source = it }
    .apply(init)
}

/** The last error encountered during attach operation, if any. This field must only be set by the entity completing the
attach operation, i.e. the external-attacher. */
@K8sDslMarker
fun Volumeattachmentstatus.attachError(init: VolumeError.() -> Unit) {
  this as Volumeattachmentstatus_storage_k8s_io_v1Impl
  VolumeError_storage_k8s_io_v1Impl(this)
    .also { attachError = it }
    .apply(init)
}

/** The last error encountered during detach operation, if any. This field must only be set by the entity completing the
detach operation, i.e. the external-attacher. */
@K8sDslMarker
fun Volumeattachmentstatus.detachError(init: VolumeError.() -> Unit) {
  this as Volumeattachmentstatus_storage_k8s_io_v1Impl
  VolumeError_storage_k8s_io_v1Impl(this)
    .also { detachError = it }
    .apply(init)
}