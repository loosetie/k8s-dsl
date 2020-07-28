package de.loosetie.k8s.dsl

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonPropertyOrder("name", "args", "command", "env", "envFrom", "image", "imagePullPolicy", "lifecycle", "livenessProbe", "ports", "readinessProbe", "resources", "securityContext", "startupProbe", "stdin", "stdinOnce", "terminationMessagePath", "terminationMessagePolicy", "tty", "volumeDevices", "volumeMounts", "workingDir")
class Container_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Container_v1_core, HasParent {
  override var name: String? = null
  override var args: List<String>? = null
  override var command: List<String>? = null
  override var env: List<EnvVar_v1_core>? = null
  override var envFrom: List<EnvFromSource_v1_core>? = null
  override var image: String? = null
  override var imagePullPolicy: String? = null
  override var lifecycle: Lifecycle_v1_core? = null
  override var livenessProbe: Probe_v1_core? = null
  override var ports: List<ContainerPort_v1_core>? = null
  override var readinessProbe: Probe_v1_core? = null
  override var resources: ResourceRequirements_v1_core? = null
  override var securityContext: SecurityContext_v1_core? = null
  override var startupProbe: Probe_v1_core? = null
  override var stdin: Boolean? = null
  override var stdinOnce: Boolean? = null
  override var terminationMessagePath: String? = null
  override var terminationMessagePolicy: String? = null
  override var tty: Boolean? = null
  override var volumeDevices: List<VolumeDevice_v1_core>? = null
  override var volumeMounts: List<VolumeMount_v1_core>? = null
  override var workingDir: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class CronJob_v1beta1_batchImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CronJob_v1beta1_batch, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Cronjobspec_v1beta1_batch
  override var status: Cronjobstatus_v1beta1_batch? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class DaemonSet_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DaemonSet_v1_apps, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Daemonsetspec_v1_apps
  override var status: Daemonsetstatus_v1_apps? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class Deployment_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Deployment_v1_apps, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Deploymentspec_v1_apps
  override var status: Deploymentstatus_v1_apps? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class Job_v1_batchImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Job_v1_batch, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Jobspec_v1_batch
  override var status: Jobstatus_v1_batch? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class Pod_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Pod_v1_core, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Podspec_v1_core
  override var status: Podstatus_v1_core? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class ReplicaSet_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ReplicaSet_v1_apps, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Replicasetspec_v1_apps
  override var status: Replicasetstatus_v1_apps? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class ReplicationController_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ReplicationController_v1_core, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Replicationcontrollerspec_v1_core
  override var status: Replicationcontrollerstatus_v1_core? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class StatefulSet_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StatefulSet_v1_apps, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Statefulsetspec_v1_apps
  override var status: Statefulsetstatus_v1_apps? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "subsets")
class Endpoints_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Endpoints_v1_core, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var subsets: List<EndpointSubset_v1_core>? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "addressType", "endpoints", "ports")
class EndpointSlice_v1alpha1_discovery_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointSlice_v1alpha1_discovery_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var addressType: String? = null
  override var endpoints: List<Endpoint_v1alpha1_discovery_k8s_io>? = null
  override var ports: List<EndpointPort_v1alpha1_discovery_k8s_io>? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class Ingress_v1beta1_networking_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Ingress_v1beta1_networking_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Ingressspec_v1beta1_networking_k8s_io
  override var status: Ingressstatus_v1beta1_networking_k8s_io? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class Service_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Service_v1_core, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Servicespec_v1_core
  override var status: Servicestatus_v1_core? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "binaryData", "data")
class ConfigMap_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMap_v1_core, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var binaryData: Map<String, String>? = null
  override var data: Map<String, String>? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class CSIDriver_v1beta1_storage_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSIDriver_v1beta1_storage_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Csidriverspec_v1beta1_storage_k8s_io
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class CSINode_v1beta1_storage_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSINode_v1beta1_storage_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Csinodespec_v1beta1_storage_k8s_io
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "data", "stringData", "type")
class Secret_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Secret_v1_core, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var data: Map<String, String>? = null
  override var stringData: Map<String, String>? = null
  override var type: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class PersistentVolumeClaim_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PersistentVolumeClaim_v1_core, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Persistentvolumeclaimspec_v1_core
  override var status: Persistentvolumeclaimstatus_v1_core? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "allowVolumeExpansion", "allowedTopologies", "mountOptions", "parameters", "provisioner", "reclaimPolicy", "volumeBindingMode")
class StorageClass_v1_storage_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StorageClass_v1_storage_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var allowVolumeExpansion: Boolean? = null
  override var allowedTopologies: List<TopologySelectorTerm_v1_core>? = null
  override var mountOptions: List<String>? = null
  override var parameters: Map<String, String>? = null
  override var provisioner: String? = null
  override var reclaimPolicy: String? = null
  override var volumeBindingMode: String? = null
}

@JsonPropertyOrder("name", "awsElasticBlockStore", "azureDisk", "azureFile", "cephfs", "cinder", "configMap", "csi", "downwardAPI", "emptyDir", "fc", "flexVolume", "flocker", "gcePersistentDisk", "gitRepo", "glusterfs", "hostPath", "iscsi", "nfs", "persistentVolumeClaim", "photonPersistentDisk", "portworxVolume", "projected", "quobyte", "rbd", "scaleIO", "secret", "storageos", "vsphereVolume")
class Volume_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Volume_v1_core, HasParent {
  override var name: String? = null
  override var awsElasticBlockStore: AWSElasticBlockStoreVolumeSource_v1_core? = null
  override var azureDisk: AzureDiskVolumeSource_v1_core? = null
  override var azureFile: AzureFileVolumeSource_v1_core? = null
  override var cephfs: CephFSVolumeSource_v1_core? = null
  override var cinder: CinderVolumeSource_v1_core? = null
  override var configMap: ConfigMapVolumeSource_v1_core? = null
  override var csi: CSIVolumeSource_v1_core? = null
  override var downwardAPI: DownwardAPIVolumeSource_v1_core? = null
  override var emptyDir: EmptyDirVolumeSource_v1_core? = null
  override var fc: FCVolumeSource_v1_core? = null
  override var flexVolume: FlexVolumeSource_v1_core? = null
  override var flocker: FlockerVolumeSource_v1_core? = null
  override var gcePersistentDisk: GCEPersistentDiskVolumeSource_v1_core? = null
  override var gitRepo: GitRepoVolumeSource_v1_core? = null
  override var glusterfs: GlusterfsVolumeSource_v1_core? = null
  override var hostPath: HostPathVolumeSource_v1_core? = null
  override var iscsi: ISCSIVolumeSource_v1_core? = null
  override var nfs: NFSVolumeSource_v1_core? = null
  override var persistentVolumeClaim: PersistentVolumeClaimVolumeSource_v1_core? = null
  override var photonPersistentDisk: PhotonPersistentDiskVolumeSource_v1_core? = null
  override var portworxVolume: PortworxVolumeSource_v1_core? = null
  override var projected: ProjectedVolumeSource_v1_core? = null
  override var quobyte: QuobyteVolumeSource_v1_core? = null
  override var rbd: RBDVolumeSource_v1_core? = null
  override var scaleIO: ScaleIOVolumeSource_v1_core? = null
  override var secret: SecretVolumeSource_v1_core? = null
  override var storageos: StorageOSVolumeSource_v1_core? = null
  override var vsphereVolume: VsphereVirtualDiskVolumeSource_v1_core? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class VolumeAttachment_v1_storage_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeAttachment_v1_storage_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Volumeattachmentspec_v1_storage_k8s_io
  override var status: Volumeattachmentstatus_v1_storage_k8s_io? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "data", "revision")
class ControllerRevision_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ControllerRevision_v1_apps, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var data: ByteArray? = null
  override var revision: Int? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class CustomResourceDefinition_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceDefinition_v1_apiextensions_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Customresourcedefinitionspec_v1_apiextensions_k8s_io
  override var status: Customresourcedefinitionstatus_v1_apiextensions_k8s_io? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "action", "count", "eventTime", "firstTimestamp", "involvedObject", "lastTimestamp", "message", "reason", "related", "reportingComponent", "reportingInstance", "series", "source", "type")
class Event_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Event_v1_core, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var action: String? = null
  override var count: Int? = null
  override var eventTime: MicroTime_v1_meta? = null
  override var firstTimestamp: Time_v1_meta? = null
  override var involvedObject: ObjectReference_v1_core? = null
  override var lastTimestamp: Time_v1_meta? = null
  override var message: String? = null
  override var reason: String? = null
  override var related: ObjectReference_v1_core? = null
  override var reportingComponent: String? = null
  override var reportingInstance: String? = null
  override var series: EventSeries_v1_core? = null
  override var source: EventSource_v1_core? = null
  override var type: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class LimitRange_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LimitRange_v1_core, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Limitrangespec_v1_core
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class HorizontalPodAutoscaler_v1_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HorizontalPodAutoscaler_v1_autoscaling, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Horizontalpodautoscalerspec_v1_autoscaling
  override var status: Horizontalpodautoscalerstatus_v1_autoscaling? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "webhooks")
class MutatingWebhookConfiguration_v1_admissionregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MutatingWebhookConfiguration_v1_admissionregistration_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var webhooks: List<MutatingWebhook_v1_admissionregistration_k8s_io>? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "webhooks")
class ValidatingWebhookConfiguration_v1_admissionregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ValidatingWebhookConfiguration_v1_admissionregistration_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var webhooks: List<ValidatingWebhook_v1_admissionregistration_k8s_io>? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "template")
class PodTemplate_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodTemplate_v1_core, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var template: Podtemplatespec_v1_core? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class PodDisruptionBudget_v1beta1_policyImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodDisruptionBudget_v1beta1_policy, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Poddisruptionbudgetspec_v1beta1_policy
  override var status: Poddisruptionbudgetstatus_v1beta1_policy? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "description", "globalDefault", "preemptionPolicy", "value")
class PriorityClass_v1_scheduling_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PriorityClass_v1_scheduling_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var description: String? = null
  override var globalDefault: Boolean? = null
  override var preemptionPolicy: String? = null
  override var value: Int? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class PodPreset_v1alpha1_settings_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodPreset_v1alpha1_settings_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Podpresetspec_v1alpha1_settings_k8s_io
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class PodSecurityPolicy_v1beta1_policyImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodSecurityPolicy_v1beta1_policy, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Podsecuritypolicyspec_v1beta1_policy
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class APIService_v1_apiregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: APIService_v1_apiregistration_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Apiservicespec_v1_apiregistration_k8s_io
  override var status: Apiservicestatus_v1_apiregistration_k8s_io? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class AuditSink_v1alpha1_auditregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AuditSink_v1alpha1_auditregistration_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Auditsinkspec_v1alpha1_auditregistration_k8s_io
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "target")
class Binding_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Binding_v1_core, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var target: ObjectReference_v1_core? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class CertificateSigningRequest_v1beta1_certificates_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CertificateSigningRequest_v1beta1_certificates_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Certificatesigningrequestspec_v1beta1_certificates_k8s_io
  override var status: Certificatesigningrequeststatus_v1beta1_certificates_k8s_io? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "aggregationRule", "rules")
class ClusterRole_v1_rbac_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ClusterRole_v1_rbac_authorization_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var aggregationRule: AggregationRule_v1_rbac_authorization_k8s_io? = null
  override var rules: List<PolicyRule_v1_rbac_authorization_k8s_io>? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "roleRef", "subjects")
class ClusterRoleBinding_v1_rbac_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ClusterRoleBinding_v1_rbac_authorization_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var roleRef: RoleRef_v1_rbac_authorization_k8s_io? = null
  override var subjects: List<Subject_v1_rbac_authorization_k8s_io>? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "conditions")
class ComponentStatus_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ComponentStatus_v1_core, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var conditions: List<ComponentCondition_v1_core>? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class Lease_v1_coordination_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Lease_v1_coordination_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Leasespec_v1_coordination_k8s_io
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class LocalSubjectAccessReview_v1_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LocalSubjectAccessReview_v1_authorization_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Subjectaccessreviewspec_v1_authorization_k8s_io
  override var status: Subjectaccessreviewstatus_v1_authorization_k8s_io? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class Namespace_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Namespace_v1_core, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Namespacespec_v1_core
  override var status: Namespacestatus_v1_core? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class Node_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Node_v1_core, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Nodespec_v1_core
  override var status: Nodestatus_v1_core? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class PersistentVolume_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PersistentVolume_v1_core, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Persistentvolumespec_v1_core
  override var status: Persistentvolumestatus_v1_core? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class ResourceQuota_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourceQuota_v1_core, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Resourcequotaspec_v1_core
  override var status: Resourcequotastatus_v1_core? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "rules")
class Role_v1_rbac_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Role_v1_rbac_authorization_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var rules: List<PolicyRule_v1_rbac_authorization_k8s_io>? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "roleRef", "subjects")
class RoleBinding_v1_rbac_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RoleBinding_v1_rbac_authorization_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var roleRef: RoleRef_v1_rbac_authorization_k8s_io? = null
  override var subjects: List<Subject_v1_rbac_authorization_k8s_io>? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "handler", "overhead", "scheduling")
class RuntimeClass_v1beta1_node_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RuntimeClass_v1beta1_node_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var handler: String? = null
  override var overhead: Overhead_v1beta1_node_k8s_io? = null
  override var scheduling: Scheduling_v1beta1_node_k8s_io? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class SelfSubjectAccessReview_v1_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SelfSubjectAccessReview_v1_authorization_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Selfsubjectaccessreviewspec_v1_authorization_k8s_io
  override var status: Subjectaccessreviewstatus_v1_authorization_k8s_io? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class SelfSubjectRulesReview_v1_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SelfSubjectRulesReview_v1_authorization_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Selfsubjectrulesreviewspec_v1_authorization_k8s_io
  override var status: SubjectRulesReviewStatus_v1_authorization_k8s_io? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "automountServiceAccountToken", "imagePullSecrets", "secrets")
class ServiceAccount_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceAccount_v1_core, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var automountServiceAccountToken: Boolean? = null
  override var imagePullSecrets: List<LocalObjectReference_v1_core>? = null
  override var secrets: List<ObjectReference_v1_core>? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class SubjectAccessReview_v1_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SubjectAccessReview_v1_authorization_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Subjectaccessreviewspec_v1_authorization_k8s_io
  override var status: Subjectaccessreviewstatus_v1_authorization_k8s_io? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class TokenRequest_v1_authentication_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: TokenRequest_v1_authentication_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Tokenrequestspec_v1_authentication_k8s_io
  override var status: Tokenrequeststatus_v1_authentication_k8s_io? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class TokenReview_v1_authentication_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: TokenReview_v1_authentication_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Tokenreviewspec_v1_authentication_k8s_io
  override var status: Tokenreviewstatus_v1_authentication_k8s_io? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class NetworkPolicy_v1_networking_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NetworkPolicy_v1_networking_k8s_io, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override lateinit var spec: Networkpolicyspec_v1_networking_k8s_io
}

@JsonPropertyOrder("apiVersion", "kind", "name", "preferredVersion", "serverAddressByClientCIDRs", "versions")
class APIGroup_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: APIGroup_v1_meta, HasParent {
  override var name: String? = null
  override var preferredVersion: GroupVersionForDiscovery_v1_meta? = null
  override var serverAddressByClientCIDRs: List<ServerAddressByClientCIDR_v1_meta>? = null
  override var versions: List<GroupVersionForDiscovery_v1_meta>? = null
}

@JsonPropertyOrder("kind", "name", "categories", "group", "namespaced", "shortNames", "singularName", "storageVersionHash", "verbs", "version")
class APIResource_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: APIResource_v1_meta, HasParent {
  override var kind: String? = null
  override var name: String? = null
  override var categories: List<String>? = null
  override var group: String? = null
  override var namespaced: Boolean? = null
  override var shortNames: List<String>? = null
  override var singularName: String? = null
  override var storageVersionHash: String? = null
  override var verbs: List<String>? = null
  override var version: String? = null
}

@JsonPropertyOrder("lastTransitionTime", "message", "reason", "status", "type")
class APIServiceCondition_v1_apiregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: APIServiceCondition_v1_apiregistration_k8s_io, HasParent {
  override var lastTransitionTime: Time_v1_meta? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "serverAddressByClientCIDRs", "versions")
class APIVersions_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: APIVersions_v1_meta, HasParent {
  override var serverAddressByClientCIDRs: List<ServerAddressByClientCIDR_v1_meta>? = null
  override var versions: List<String>? = null
}

@JsonPropertyOrder("fsType", "partition", "readOnly", "volumeID")
class AWSElasticBlockStoreVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AWSElasticBlockStoreVolumeSource_v1_core, HasParent {
  override var fsType: String? = null
  override var partition: Int? = null
  override var readOnly: Boolean? = null
  override var volumeID: String? = null
}

@JsonPropertyOrder("nodeAffinity", "podAffinity", "podAntiAffinity")
class Affinity_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Affinity_v1_core, HasParent {
  override var nodeAffinity: NodeAffinity_v1_core? = null
  override var podAffinity: PodAffinity_v1_core? = null
  override var podAntiAffinity: PodAntiAffinity_v1_core? = null
}

@JsonPropertyOrder("clusterRoleSelectors")
class AggregationRule_v1_rbac_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AggregationRule_v1_rbac_authorization_k8s_io, HasParent {
  override var clusterRoleSelectors: List<LabelSelector_v1_meta>? = null
}

@JsonPropertyOrder("name")
class AllowedCSIDriver_v1beta1_policyImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AllowedCSIDriver_v1beta1_policy, HasParent {
  override var name: String? = null
}

@JsonPropertyOrder("driver")
class AllowedFlexVolume_v1beta1_policyImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AllowedFlexVolume_v1beta1_policy, HasParent {
  override var driver: String? = null
}

@JsonPropertyOrder("pathPrefix", "readOnly")
class AllowedHostPath_v1beta1_policyImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AllowedHostPath_v1beta1_policy, HasParent {
  override var pathPrefix: String? = null
  override var readOnly: Boolean? = null
}

@JsonPropertyOrder("name", "devicePath")
class AttachedVolume_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AttachedVolume_v1_core, HasParent {
  override var name: String? = null
  override var devicePath: String? = null
}

@JsonPropertyOrder("kind", "cachingMode", "diskName", "diskURI", "fsType", "readOnly")
class AzureDiskVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AzureDiskVolumeSource_v1_core, HasParent {
  override var kind: String? = null
  override var cachingMode: String? = null
  override var diskName: String? = null
  override var diskURI: String? = null
  override var fsType: String? = null
  override var readOnly: Boolean? = null
}

@JsonPropertyOrder("readOnly", "secretName", "secretNamespace", "shareName")
class AzureFilePersistentVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AzureFilePersistentVolumeSource_v1_core, HasParent {
  override var readOnly: Boolean? = null
  override var secretName: String? = null
  override var secretNamespace: String? = null
  override var shareName: String? = null
}

@JsonPropertyOrder("readOnly", "secretName", "shareName")
class AzureFileVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AzureFileVolumeSource_v1_core, HasParent {
  override var readOnly: Boolean? = null
  override var secretName: String? = null
  override var shareName: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "name", "uid")
class BoundObjectReference_v1_authentication_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: BoundObjectReference_v1_authentication_k8s_io, HasParent {
  override var name: String? = null
  override var uid: String? = null
}

@JsonPropertyOrder("name", "allocatable", "nodeID", "topologyKeys")
class CSINodeDriver_v1beta1_storage_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSINodeDriver_v1beta1_storage_k8s_io, HasParent {
  override var name: String? = null
  override var allocatable: VolumeNodeResources_v1beta1_storage_k8s_io? = null
  override var nodeID: String? = null
  override var topologyKeys: List<String>? = null
}

@JsonPropertyOrder("controllerExpandSecretRef", "controllerPublishSecretRef", "driver", "fsType", "nodePublishSecretRef", "nodeStageSecretRef", "readOnly", "volumeAttributes", "volumeHandle")
class CSIPersistentVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSIPersistentVolumeSource_v1_core, HasParent {
  override var controllerExpandSecretRef: SecretReference_v1_core? = null
  override var controllerPublishSecretRef: SecretReference_v1_core? = null
  override var driver: String? = null
  override var fsType: String? = null
  override var nodePublishSecretRef: SecretReference_v1_core? = null
  override var nodeStageSecretRef: SecretReference_v1_core? = null
  override var readOnly: Boolean? = null
  override var volumeAttributes: Map<String, String>? = null
  override var volumeHandle: String? = null
}

@JsonPropertyOrder("driver", "fsType", "nodePublishSecretRef", "readOnly", "volumeAttributes")
class CSIVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSIVolumeSource_v1_core, HasParent {
  override var driver: String? = null
  override var fsType: String? = null
  override var nodePublishSecretRef: LocalObjectReference_v1_core? = null
  override var readOnly: Boolean? = null
  override var volumeAttributes: Map<String, String>? = null
}

@JsonPropertyOrder("add", "drop")
class Capabilities_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Capabilities_v1_core, HasParent {
  override var add: List<String>? = null
  override var drop: List<String>? = null
}

@JsonPropertyOrder("monitors", "path", "readOnly", "secretFile", "secretRef", "user")
class CephFSPersistentVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CephFSPersistentVolumeSource_v1_core, HasParent {
  override var monitors: List<String>? = null
  override var path: String? = null
  override var readOnly: Boolean? = null
  override var secretFile: String? = null
  override var secretRef: SecretReference_v1_core? = null
  override var user: String? = null
}

@JsonPropertyOrder("monitors", "path", "readOnly", "secretFile", "secretRef", "user")
class CephFSVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CephFSVolumeSource_v1_core, HasParent {
  override var monitors: List<String>? = null
  override var path: String? = null
  override var readOnly: Boolean? = null
  override var secretFile: String? = null
  override var secretRef: LocalObjectReference_v1_core? = null
  override var user: String? = null
}

@JsonPropertyOrder("lastUpdateTime", "message", "reason", "type")
class CertificateSigningRequestCondition_v1beta1_certificates_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CertificateSigningRequestCondition_v1beta1_certificates_k8s_io, HasParent {
  override var lastUpdateTime: Time_v1_meta? = null
  override var message: String? = null
  override var reason: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("fsType", "readOnly", "secretRef", "volumeID")
class CinderPersistentVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CinderPersistentVolumeSource_v1_core, HasParent {
  override var fsType: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: SecretReference_v1_core? = null
  override var volumeID: String? = null
}

@JsonPropertyOrder("fsType", "readOnly", "secretRef", "volumeID")
class CinderVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CinderVolumeSource_v1_core, HasParent {
  override var fsType: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: LocalObjectReference_v1_core? = null
  override var volumeID: String? = null
}

@JsonPropertyOrder("timeoutSeconds")
class ClientIPConfig_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ClientIPConfig_v1_core, HasParent {
  override var timeoutSeconds: Int? = null
}

@JsonPropertyOrder("error", "message", "status", "type")
class ComponentCondition_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ComponentCondition_v1_core, HasParent {
  override var error: String? = null
  override var message: String? = null
  override var status: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("name", "optional")
class ConfigMapEnvSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMapEnvSource_v1_core, HasParent {
  override var name: String? = null
  override var optional: Boolean? = null
}

@JsonPropertyOrder("name", "key", "optional")
class ConfigMapKeySelector_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMapKeySelector_v1_core, HasParent {
  override var name: String? = null
  override var key: String? = null
  override var optional: Boolean? = null
}

@JsonPropertyOrder("namespace", "name", "kubeletConfigKey", "resourceVersion", "uid")
class ConfigMapNodeConfigSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMapNodeConfigSource_v1_core, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var kubeletConfigKey: String? = null
  override var resourceVersion: String? = null
  override var uid: String? = null
}

@JsonPropertyOrder("name", "items", "optional")
class ConfigMapProjection_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMapProjection_v1_core, HasParent {
  override var name: String? = null
  override var items: List<KeyToPath_v1_core>? = null
  override var optional: Boolean? = null
}

@JsonPropertyOrder("name", "defaultMode", "items", "optional")
class ConfigMapVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMapVolumeSource_v1_core, HasParent {
  override var name: String? = null
  override var defaultMode: Int? = null
  override var items: List<KeyToPath_v1_core>? = null
  override var optional: Boolean? = null
}

@JsonPropertyOrder("names", "sizeBytes")
class ContainerImage_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ContainerImage_v1_core, HasParent {
  override var names: List<String>? = null
  override var sizeBytes: Int? = null
}

@JsonPropertyOrder("name", "containerPort", "hostIP", "hostPort", "protocol")
class ContainerPort_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ContainerPort_v1_core, HasParent {
  override var name: String? = null
  override var containerPort: Int? = null
  override var hostIP: String? = null
  override var hostPort: Int? = null
  override var protocol: String? = null
}

@JsonPropertyOrder("running", "terminated", "waiting")
class ContainerState_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ContainerState_v1_core, HasParent {
  override var running: ContainerStateRunning_v1_core? = null
  override var terminated: ContainerStateTerminated_v1_core? = null
  override var waiting: ContainerStateWaiting_v1_core? = null
}

@JsonPropertyOrder("startedAt")
class ContainerStateRunning_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ContainerStateRunning_v1_core, HasParent {
  override var startedAt: Time_v1_meta? = null
}

@JsonPropertyOrder("containerID", "exitCode", "finishedAt", "message", "reason", "signal", "startedAt")
class ContainerStateTerminated_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ContainerStateTerminated_v1_core, HasParent {
  override var containerID: String? = null
  override var exitCode: Int? = null
  override var finishedAt: Time_v1_meta? = null
  override var message: String? = null
  override var reason: String? = null
  override var signal: Int? = null
  override var startedAt: Time_v1_meta? = null
}

@JsonPropertyOrder("message", "reason")
class ContainerStateWaiting_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ContainerStateWaiting_v1_core, HasParent {
  override var message: String? = null
  override var reason: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "name")
class CrossVersionObjectReference_v1_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CrossVersionObjectReference_v1_autoscaling, HasParent {
  override var name: String? = null
}

@JsonPropertyOrder("name", "description", "format", "jsonPath", "priority", "type")
class CustomResourceColumnDefinition_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceColumnDefinition_v1_apiextensions_k8s_io, HasParent {
  override var name: String? = null
  override var description: String? = null
  override var format: String? = null
  override var jsonPath: String? = null
  override var priority: Int? = null
  override var type: String? = null
}

@JsonPropertyOrder("strategy", "webhook")
class CustomResourceConversion_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceConversion_v1_apiextensions_k8s_io, HasParent {
  override var strategy: String? = null
  override var webhook: WebhookConversion_v1_apiextensions_k8s_io? = null
}

@JsonPropertyOrder("lastTransitionTime", "message", "reason", "status", "type")
class CustomResourceDefinitionCondition_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceDefinitionCondition_v1_apiextensions_k8s_io, HasParent {
  override var lastTransitionTime: Time_v1_meta? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("kind", "categories", "listKind", "plural", "shortNames", "singular")
class CustomResourceDefinitionNames_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceDefinitionNames_v1_apiextensions_k8s_io, HasParent {
  override var kind: String? = null
  override var categories: List<String>? = null
  override var listKind: String? = null
  override var plural: String? = null
  override var shortNames: List<String>? = null
  override var singular: String? = null
}

@JsonPropertyOrder("name", "additionalPrinterColumns", "schema", "served", "storage", "subresources")
class CustomResourceDefinitionVersion_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceDefinitionVersion_v1_apiextensions_k8s_io, HasParent {
  override var name: String? = null
  override var additionalPrinterColumns: List<CustomResourceColumnDefinition_v1_apiextensions_k8s_io>? = null
  override var schema: CustomResourceValidation_v1_apiextensions_k8s_io? = null
  override var served: Boolean? = null
  override var storage: Boolean? = null
  override var subresources: CustomResourceSubresources_v1_apiextensions_k8s_io? = null
}

@JsonPropertyOrder("labelSelectorPath", "specReplicasPath", "statusReplicasPath")
class CustomResourceSubresourceScale_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceSubresourceScale_v1_apiextensions_k8s_io, HasParent {
  override var labelSelectorPath: String? = null
  override var specReplicasPath: String? = null
  override var statusReplicasPath: String? = null
}

@JsonPropertyOrder("")
class CustomResourceSubresourceStatus_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceSubresourceStatus_v1_apiextensions_k8s_io, HasParent {
  
}

@JsonPropertyOrder("scale", "status")
class CustomResourceSubresources_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceSubresources_v1_apiextensions_k8s_io, HasParent {
  override var scale: CustomResourceSubresourceScale_v1_apiextensions_k8s_io? = null
  override var status: CustomResourceSubresourceStatus_v1_apiextensions_k8s_io? = null
}

@JsonPropertyOrder("openAPIV3Schema")
class CustomResourceValidation_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceValidation_v1_apiextensions_k8s_io, HasParent {
  override var openAPIV3Schema: JSONSchemaProps_v1_apiextensions_k8s_io? = null
}

@JsonPropertyOrder("Port")
class DaemonEndpoint_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DaemonEndpoint_v1_core, HasParent {
  override var Port: Int? = null
}

@JsonPropertyOrder("lastTransitionTime", "message", "reason", "status", "type")
class DaemonSetCondition_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DaemonSetCondition_v1_apps, HasParent {
  override var lastTransitionTime: Time_v1_meta? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("rollingUpdate", "type")
class DaemonSetUpdateStrategy_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DaemonSetUpdateStrategy_v1_apps, HasParent {
  override var rollingUpdate: Rollingupdatedaemonset_v1_apps? = null
  override var type: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "dryRun", "gracePeriodSeconds", "orphanDependents", "preconditions", "propagationPolicy")
class DeleteOptions_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DeleteOptions_v1_meta, HasParent {
  override var dryRun: List<String>? = null
  override var gracePeriodSeconds: Int? = null
  override var orphanDependents: Boolean? = null
  override var preconditions: Preconditions_v1_meta? = null
  override var propagationPolicy: String? = null
}

@JsonPropertyOrder("lastTransitionTime", "lastUpdateTime", "message", "reason", "status", "type")
class DeploymentCondition_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DeploymentCondition_v1_apps, HasParent {
  override var lastTransitionTime: Time_v1_meta? = null
  override var lastUpdateTime: Time_v1_meta? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("items")
class DownwardAPIProjection_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DownwardAPIProjection_v1_core, HasParent {
  override var items: List<DownwardAPIVolumeFile_v1_core>? = null
}

@JsonPropertyOrder("fieldRef", "mode", "path", "resourceFieldRef")
class DownwardAPIVolumeFile_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DownwardAPIVolumeFile_v1_core, HasParent {
  override var fieldRef: ObjectFieldSelector_v1_core? = null
  override var mode: Int? = null
  override var path: String? = null
  override var resourceFieldRef: ResourceFieldSelector_v1_core? = null
}

@JsonPropertyOrder("defaultMode", "items")
class DownwardAPIVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DownwardAPIVolumeSource_v1_core, HasParent {
  override var defaultMode: Int? = null
  override var items: List<DownwardAPIVolumeFile_v1_core>? = null
}

@JsonPropertyOrder("medium", "sizeLimit")
class EmptyDirVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EmptyDirVolumeSource_v1_core, HasParent {
  override var medium: String? = null
  override var sizeLimit: Quantity_resource_core? = null
}

@JsonPropertyOrder("addresses", "conditions", "hostname", "targetRef", "topology")
class Endpoint_v1alpha1_discovery_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Endpoint_v1alpha1_discovery_k8s_io, HasParent {
  override var addresses: List<String>? = null
  override var conditions: EndpointConditions_v1alpha1_discovery_k8s_io? = null
  override var hostname: String? = null
  override var targetRef: ObjectReference_v1_core? = null
  override var topology: Any? = null
}

@JsonPropertyOrder("hostname", "ip", "nodeName", "targetRef")
class EndpointAddress_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointAddress_v1_core, HasParent {
  override var hostname: String? = null
  override var ip: String? = null
  override var nodeName: String? = null
  override var targetRef: ObjectReference_v1_core? = null
}

@JsonPropertyOrder("ready")
class EndpointConditions_v1alpha1_discovery_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointConditions_v1alpha1_discovery_k8s_io, HasParent {
  override var ready: Boolean? = null
}

@JsonPropertyOrder("name", "port", "protocol")
class EndpointPort_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointPort_v1_core, HasParent {
  override var name: String? = null
  override var port: Int? = null
  override var protocol: String? = null
}

@JsonPropertyOrder("addresses", "notReadyAddresses", "ports")
class EndpointSubset_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointSubset_v1_core, HasParent {
  override var addresses: List<EndpointAddress_v1_core>? = null
  override var notReadyAddresses: List<EndpointAddress_v1_core>? = null
  override var ports: List<EndpointPort_v1_core>? = null
}

@JsonPropertyOrder("configMapRef", "prefix", "secretRef")
class EnvFromSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EnvFromSource_v1_core, HasParent {
  override var configMapRef: ConfigMapEnvSource_v1_core? = null
  override var prefix: String? = null
  override var secretRef: SecretEnvSource_v1_core? = null
}

@JsonPropertyOrder("name", "value", "valueFrom")
class EnvVar_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EnvVar_v1_core, HasParent {
  override var name: String? = null
  override var value: String? = null
  override var valueFrom: EnvVarSource_v1_core? = null
}

@JsonPropertyOrder("configMapKeyRef", "fieldRef", "resourceFieldRef", "secretKeyRef")
class EnvVarSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EnvVarSource_v1_core, HasParent {
  override var configMapKeyRef: ConfigMapKeySelector_v1_core? = null
  override var fieldRef: ObjectFieldSelector_v1_core? = null
  override var resourceFieldRef: ResourceFieldSelector_v1_core? = null
  override var secretKeyRef: SecretKeySelector_v1_core? = null
}

@JsonPropertyOrder("name", "args", "command", "env", "envFrom", "image", "imagePullPolicy", "lifecycle", "livenessProbe", "ports", "readinessProbe", "resources", "securityContext", "startupProbe", "stdin", "stdinOnce", "targetContainerName", "terminationMessagePath", "terminationMessagePolicy", "tty", "volumeDevices", "volumeMounts", "workingDir")
class EphemeralContainer_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EphemeralContainer_v1_core, HasParent {
  override var name: String? = null
  override var args: List<String>? = null
  override var command: List<String>? = null
  override var env: List<EnvVar_v1_core>? = null
  override var envFrom: List<EnvFromSource_v1_core>? = null
  override var image: String? = null
  override var imagePullPolicy: String? = null
  override var lifecycle: Lifecycle_v1_core? = null
  override var livenessProbe: Probe_v1_core? = null
  override var ports: List<ContainerPort_v1_core>? = null
  override var readinessProbe: Probe_v1_core? = null
  override var resources: ResourceRequirements_v1_core? = null
  override var securityContext: SecurityContext_v1_core? = null
  override var startupProbe: Probe_v1_core? = null
  override var stdin: Boolean? = null
  override var stdinOnce: Boolean? = null
  override var targetContainerName: String? = null
  override var terminationMessagePath: String? = null
  override var terminationMessagePolicy: String? = null
  override var tty: Boolean? = null
  override var volumeDevices: List<VolumeDevice_v1_core>? = null
  override var volumeMounts: List<VolumeMount_v1_core>? = null
  override var workingDir: String? = null
}

@JsonPropertyOrder("count", "lastObservedTime", "state")
class EventSeries_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EventSeries_v1_core, HasParent {
  override var count: Int? = null
  override var lastObservedTime: MicroTime_v1_meta? = null
  override var state: String? = null
}

@JsonPropertyOrder("component", "host")
class EventSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EventSource_v1_core, HasParent {
  override var component: String? = null
  override var host: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "deleteOptions")
class Eviction_v1beta1_policyImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Eviction_v1beta1_policy, HasParent {
  override lateinit var metadata: ObjectMeta_v1_meta
  override var deleteOptions: DeleteOptions_v1_meta? = null
}

@JsonPropertyOrder("command")
class ExecAction_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ExecAction_v1_core, HasParent {
  override var command: List<String>? = null
}

@JsonPropertyOrder("description", "url")
class ExternalDocumentation_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ExternalDocumentation_v1_apiextensions_k8s_io, HasParent {
  override var description: String? = null
  override var url: String? = null
}

@JsonPropertyOrder("metric", "target")
class ExternalMetricSource_v2beta2_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ExternalMetricSource_v2beta2_autoscaling, HasParent {
  override var metric: MetricIdentifier_v2beta2_autoscaling? = null
  override var target: MetricTarget_v2beta2_autoscaling? = null
}

@JsonPropertyOrder("current", "metric")
class ExternalMetricStatus_v2beta2_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ExternalMetricStatus_v2beta2_autoscaling, HasParent {
  override var current: MetricValueStatus_v2beta2_autoscaling? = null
  override var metric: MetricIdentifier_v2beta2_autoscaling? = null
}

@JsonPropertyOrder("fsType", "lun", "readOnly", "targetWWNs", "wwids")
class FCVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FCVolumeSource_v1_core, HasParent {
  override var fsType: String? = null
  override var lun: Int? = null
  override var readOnly: Boolean? = null
  override var targetWWNs: List<String>? = null
  override var wwids: List<String>? = null
}

@JsonPropertyOrder("ranges", "rule")
class FSGroupStrategyOptions_v1beta1_policyImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FSGroupStrategyOptions_v1beta1_policy, HasParent {
  override var ranges: List<IDRange_v1beta1_policy>? = null
  override var rule: String? = null
}

@JsonPropertyOrder("")
class FieldsV1_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FieldsV1_v1_meta, HasParent {
  
}

@JsonPropertyOrder("driver", "fsType", "options", "readOnly", "secretRef")
class FlexPersistentVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FlexPersistentVolumeSource_v1_core, HasParent {
  override var driver: String? = null
  override var fsType: String? = null
  override var options: Map<String, String>? = null
  override var readOnly: Boolean? = null
  override var secretRef: SecretReference_v1_core? = null
}

@JsonPropertyOrder("driver", "fsType", "options", "readOnly", "secretRef")
class FlexVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FlexVolumeSource_v1_core, HasParent {
  override var driver: String? = null
  override var fsType: String? = null
  override var options: Map<String, String>? = null
  override var readOnly: Boolean? = null
  override var secretRef: LocalObjectReference_v1_core? = null
}

@JsonPropertyOrder("datasetName", "datasetUUID")
class FlockerVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FlockerVolumeSource_v1_core, HasParent {
  override var datasetName: String? = null
  override var datasetUUID: String? = null
}

@JsonPropertyOrder("fsType", "partition", "pdName", "readOnly")
class GCEPersistentDiskVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: GCEPersistentDiskVolumeSource_v1_core, HasParent {
  override var fsType: String? = null
  override var partition: Int? = null
  override var pdName: String? = null
  override var readOnly: Boolean? = null
}

@JsonPropertyOrder("directory", "repository", "revision")
class GitRepoVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: GitRepoVolumeSource_v1_core, HasParent {
  override var directory: String? = null
  override var repository: String? = null
  override var revision: String? = null
}

@JsonPropertyOrder("endpoints", "endpointsNamespace", "path", "readOnly")
class GlusterfsPersistentVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: GlusterfsPersistentVolumeSource_v1_core, HasParent {
  override var endpoints: String? = null
  override var endpointsNamespace: String? = null
  override var path: String? = null
  override var readOnly: Boolean? = null
}

@JsonPropertyOrder("endpoints", "path", "readOnly")
class GlusterfsVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: GlusterfsVolumeSource_v1_core, HasParent {
  override var endpoints: String? = null
  override var path: String? = null
  override var readOnly: Boolean? = null
}

@JsonPropertyOrder("groupVersion", "version")
class GroupVersionForDiscovery_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: GroupVersionForDiscovery_v1_meta, HasParent {
  override var groupVersion: String? = null
  override var version: String? = null
}

@JsonPropertyOrder("host", "httpHeaders", "path", "port", "scheme")
class HTTPGetAction_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HTTPGetAction_v1_core, HasParent {
  override var host: String? = null
  override var httpHeaders: List<HTTPHeader_v1_core>? = null
  override var path: String? = null
  override var port: de.loosetie.k8s.dsl.types.IntOrString? = null
  override var scheme: String? = null
}

@JsonPropertyOrder("name", "value")
class HTTPHeader_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HTTPHeader_v1_core, HasParent {
  override var name: String? = null
  override var value: String? = null
}

@JsonPropertyOrder("backend", "path")
class HTTPIngressPath_v1beta1_networking_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HTTPIngressPath_v1beta1_networking_k8s_io, HasParent {
  override var backend: IngressBackend_v1beta1_networking_k8s_io? = null
  override var path: String? = null
}

@JsonPropertyOrder("paths")
class HTTPIngressRuleValue_v1beta1_networking_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HTTPIngressRuleValue_v1beta1_networking_k8s_io, HasParent {
  override var paths: List<HTTPIngressPath_v1beta1_networking_k8s_io>? = null
}

@JsonPropertyOrder("exec", "httpGet", "tcpSocket")
class Handler_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Handler_v1_core, HasParent {
  override var exec: ExecAction_v1_core? = null
  override var httpGet: HTTPGetAction_v1_core? = null
  override var tcpSocket: TCPSocketAction_v1_core? = null
}

@JsonPropertyOrder("lastTransitionTime", "message", "reason", "status", "type")
class HorizontalPodAutoscalerCondition_v2beta2_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HorizontalPodAutoscalerCondition_v2beta2_autoscaling, HasParent {
  override var lastTransitionTime: Time_v1_meta? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("hostnames", "ip")
class HostAlias_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HostAlias_v1_core, HasParent {
  override var hostnames: List<String>? = null
  override var ip: String? = null
}

@JsonPropertyOrder("path", "type")
class HostPathVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HostPathVolumeSource_v1_core, HasParent {
  override var path: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("max", "min")
class HostPortRange_v1beta1_policyImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HostPortRange_v1beta1_policy, HasParent {
  override var max: Int? = null
  override var min: Int? = null
}

@JsonPropertyOrder("max", "min")
class IDRange_v1beta1_policyImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IDRange_v1beta1_policy, HasParent {
  override var max: Int? = null
  override var min: Int? = null
}

@JsonPropertyOrder("cidr", "except")
class IPBlock_v1_networking_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IPBlock_v1_networking_k8s_io, HasParent {
  override var cidr: String? = null
  override var except: List<String>? = null
}

@JsonPropertyOrder("chapAuthDiscovery", "chapAuthSession", "fsType", "initiatorName", "iqn", "iscsiInterface", "lun", "portals", "readOnly", "secretRef", "targetPortal")
class ISCSIPersistentVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ISCSIPersistentVolumeSource_v1_core, HasParent {
  override var chapAuthDiscovery: Boolean? = null
  override var chapAuthSession: Boolean? = null
  override var fsType: String? = null
  override var initiatorName: String? = null
  override var iqn: String? = null
  override var iscsiInterface: String? = null
  override var lun: Int? = null
  override var portals: List<String>? = null
  override var readOnly: Boolean? = null
  override var secretRef: SecretReference_v1_core? = null
  override var targetPortal: String? = null
}

@JsonPropertyOrder("chapAuthDiscovery", "chapAuthSession", "fsType", "initiatorName", "iqn", "iscsiInterface", "lun", "portals", "readOnly", "secretRef", "targetPortal")
class ISCSIVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ISCSIVolumeSource_v1_core, HasParent {
  override var chapAuthDiscovery: Boolean? = null
  override var chapAuthSession: Boolean? = null
  override var fsType: String? = null
  override var initiatorName: String? = null
  override var iqn: String? = null
  override var iscsiInterface: String? = null
  override var lun: Int? = null
  override var portals: List<String>? = null
  override var readOnly: Boolean? = null
  override var secretRef: LocalObjectReference_v1_core? = null
  override var targetPortal: String? = null
}

@JsonPropertyOrder("serviceName", "servicePort")
class IngressBackend_v1beta1_networking_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressBackend_v1beta1_networking_k8s_io, HasParent {
  override var serviceName: String? = null
  override var servicePort: de.loosetie.k8s.dsl.types.IntOrString? = null
}

@JsonPropertyOrder("host", "http")
class IngressRule_v1beta1_networking_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressRule_v1beta1_networking_k8s_io, HasParent {
  override var host: String? = null
  override var http: HTTPIngressRuleValue_v1beta1_networking_k8s_io? = null
}

@JsonPropertyOrder("hosts", "secretName")
class IngressTLS_v1beta1_networking_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressTLS_v1beta1_networking_k8s_io, HasParent {
  override var hosts: List<String>? = null
  override var secretName: String? = null
}

@JsonPropertyOrder("")
class JSON_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: JSON_v1_apiextensions_k8s_io, HasParent {
  
}

@JsonPropertyOrder("\$ref", "\$schema", "additionalItems", "additionalProperties", "allOf", "anyOf", "default", "definitions", "dependencies", "description", "enum", "example", "exclusiveMaximum", "exclusiveMinimum", "externalDocs", "format", "id", "items", "maxItems", "maxLength", "maxProperties", "maximum", "minItems", "minLength", "minProperties", "minimum", "multipleOf", "not", "nullable", "oneOf", "pattern", "patternProperties", "properties", "required", "title", "type", "uniqueItems", "x-kubernetes-embedded-resource", "x-kubernetes-int-or-string", "x-kubernetes-list-map-keys", "x-kubernetes-list-type", "x-kubernetes-preserve-unknown-fields")
class JSONSchemaProps_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: JSONSchemaProps_v1_apiextensions_k8s_io, HasParent {
  override var `$ref`: String? = null
  override var `$schema`: String? = null
  override var additionalItems: JSONSchemaPropsOrBool_v1_apiextensions_k8s_io? = null
  override var additionalProperties: JSONSchemaPropsOrBool_v1_apiextensions_k8s_io? = null
  override var allOf: List<JSONSchemaProps_v1_apiextensions_k8s_io>? = null
  override var anyOf: List<JSONSchemaProps_v1_apiextensions_k8s_io>? = null
  override var default: JSON_v1_apiextensions_k8s_io? = null
  override var definitions: Any? = null
  override var dependencies: Any? = null
  override var description: String? = null
  override var enum: List<JSON_v1_apiextensions_k8s_io>? = null
  override var example: JSON_v1_apiextensions_k8s_io? = null
  override var exclusiveMaximum: Boolean? = null
  override var exclusiveMinimum: Boolean? = null
  override var externalDocs: ExternalDocumentation_v1_apiextensions_k8s_io? = null
  override var format: String? = null
  override var id: String? = null
  override var items: JSONSchemaPropsOrArray_v1_apiextensions_k8s_io? = null
  override var maxItems: Int? = null
  override var maxLength: Int? = null
  override var maxProperties: Int? = null
  override var maximum: Number? = null
  override var minItems: Int? = null
  override var minLength: Int? = null
  override var minProperties: Int? = null
  override var minimum: Number? = null
  override var multipleOf: Number? = null
  override var not: JSONSchemaProps_v1_apiextensions_k8s_io? = null
  override var nullable: Boolean? = null
  override var oneOf: List<JSONSchemaProps_v1_apiextensions_k8s_io>? = null
  override var pattern: String? = null
  override var patternProperties: Any? = null
  override var properties: Any? = null
  override var required: List<String>? = null
  override var title: String? = null
  override var type: String? = null
  override var uniqueItems: Boolean? = null
  override var `x-kubernetes-embedded-resource`: Boolean? = null
  override var `x-kubernetes-int-or-string`: Boolean? = null
  override var `x-kubernetes-list-map-keys`: List<String>? = null
  override var `x-kubernetes-list-type`: String? = null
  override var `x-kubernetes-preserve-unknown-fields`: Boolean? = null
}

@JsonPropertyOrder("")
class JSONSchemaPropsOrArray_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: JSONSchemaPropsOrArray_v1_apiextensions_k8s_io, HasParent {
  
}

@JsonPropertyOrder("")
class JSONSchemaPropsOrBool_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: JSONSchemaPropsOrBool_v1_apiextensions_k8s_io, HasParent {
  
}

@JsonPropertyOrder("lastProbeTime", "lastTransitionTime", "message", "reason", "status", "type")
class JobCondition_v1_batchImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: JobCondition_v1_batch, HasParent {
  override var lastProbeTime: Time_v1_meta? = null
  override var lastTransitionTime: Time_v1_meta? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("metadata", "spec")
class JobTemplateSpec_v1beta1_batchImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: JobTemplateSpec_v1beta1_batch, HasParent {
  override var metadata: ObjectMeta_v1_meta? = null
  override var spec: Jobspec_v1_batch? = null
}

@JsonPropertyOrder("key", "mode", "path")
class KeyToPath_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: KeyToPath_v1_core, HasParent {
  override var key: String? = null
  override var mode: Int? = null
  override var path: String? = null
}

@JsonPropertyOrder("matchExpressions", "matchLabels")
class LabelSelector_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LabelSelector_v1_meta, HasParent {
  override var matchExpressions: List<LabelSelectorRequirement_v1_meta>? = null
  override var matchLabels: Map<String, String>? = null
}

@JsonPropertyOrder("key", "operator", "values")
class LabelSelectorRequirement_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LabelSelectorRequirement_v1_meta, HasParent {
  override var key: String? = null
  override var operator: String? = null
  override var values: List<String>? = null
}

@JsonPropertyOrder("postStart", "preStop")
class Lifecycle_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Lifecycle_v1_core, HasParent {
  override var postStart: Handler_v1_core? = null
  override var preStop: Handler_v1_core? = null
}

@JsonPropertyOrder("default", "defaultRequest", "max", "maxLimitRequestRatio", "min", "type")
class LimitRangeItem_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LimitRangeItem_v1_core, HasParent {
  override var default: de.loosetie.k8s.dsl.types.CpuMem? = null
  override var defaultRequest: de.loosetie.k8s.dsl.types.CpuMem? = null
  override var max: de.loosetie.k8s.dsl.types.CpuMem? = null
  override var maxLimitRequestRatio: de.loosetie.k8s.dsl.types.CpuMem? = null
  override var min: de.loosetie.k8s.dsl.types.CpuMem? = null
  override var type: String? = null
}

@JsonPropertyOrder("continue", "remainingItemCount", "resourceVersion", "selfLink")
class ListMeta_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ListMeta_v1_meta, HasParent {
  override var `continue`: String? = null
  override var remainingItemCount: Int? = null
  override var resourceVersion: String? = null
  override var selfLink: String? = null
}

@JsonPropertyOrder("hostname", "ip")
class LoadBalancerIngress_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LoadBalancerIngress_v1_core, HasParent {
  override var hostname: String? = null
  override var ip: String? = null
}

@JsonPropertyOrder("ingress")
class LoadBalancerStatus_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LoadBalancerStatus_v1_core, HasParent {
  override var ingress: List<LoadBalancerIngress_v1_core>? = null
}

@JsonPropertyOrder("name")
class LocalObjectReference_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LocalObjectReference_v1_core, HasParent {
  override var name: String? = null
}

@JsonPropertyOrder("fsType", "path")
class LocalVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LocalVolumeSource_v1_core, HasParent {
  override var fsType: String? = null
  override var path: String? = null
}

@JsonPropertyOrder("apiVersion", "fieldsType", "fieldsV1", "manager", "operation", "time")
class ManagedFieldsEntry_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ManagedFieldsEntry_v1_meta, HasParent {
  override var apiVersion: String? = null
  override var fieldsType: String? = null
  override var fieldsV1: FieldsV1_v1_meta? = null
  override var manager: String? = null
  override var operation: String? = null
  override var time: Time_v1_meta? = null
}

@JsonPropertyOrder("name", "selector")
class MetricIdentifier_v2beta2_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MetricIdentifier_v2beta2_autoscaling, HasParent {
  override var name: String? = null
  override var selector: LabelSelector_v1_meta? = null
}

@JsonPropertyOrder("external", "object", "pods", "resource", "type")
class MetricSpec_v2beta2_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MetricSpec_v2beta2_autoscaling, HasParent {
  override var external: ExternalMetricSource_v2beta2_autoscaling? = null
  override var `object`: ObjectMetricSource_v2beta2_autoscaling? = null
  override var pods: PodsMetricSource_v2beta2_autoscaling? = null
  override var resource: ResourceMetricSource_v2beta2_autoscaling? = null
  override var type: String? = null
}

@JsonPropertyOrder("external", "object", "pods", "resource", "type")
class MetricStatus_v2beta2_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MetricStatus_v2beta2_autoscaling, HasParent {
  override var external: ExternalMetricStatus_v2beta2_autoscaling? = null
  override var `object`: ObjectMetricStatus_v2beta2_autoscaling? = null
  override var pods: PodsMetricStatus_v2beta2_autoscaling? = null
  override var resource: ResourceMetricStatus_v2beta2_autoscaling? = null
  override var type: String? = null
}

@JsonPropertyOrder("averageUtilization", "averageValue", "type", "value")
class MetricTarget_v2beta2_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MetricTarget_v2beta2_autoscaling, HasParent {
  override var averageUtilization: Int? = null
  override var averageValue: Quantity_resource_core? = null
  override var type: String? = null
  override var value: Quantity_resource_core? = null
}

@JsonPropertyOrder("averageUtilization", "averageValue", "value")
class MetricValueStatus_v2beta2_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MetricValueStatus_v2beta2_autoscaling, HasParent {
  override var averageUtilization: Int? = null
  override var averageValue: Quantity_resource_core? = null
  override var value: Quantity_resource_core? = null
}

@JsonPropertyOrder("")
class MicroTime_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MicroTime_v1_meta, HasParent {
  
}

@JsonPropertyOrder("name", "admissionReviewVersions", "clientConfig", "failurePolicy", "matchPolicy", "namespaceSelector", "objectSelector", "reinvocationPolicy", "rules", "sideEffects", "timeoutSeconds")
class MutatingWebhook_v1_admissionregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MutatingWebhook_v1_admissionregistration_k8s_io, HasParent {
  override var name: String? = null
  override var admissionReviewVersions: List<String>? = null
  override var clientConfig: WebhookClientConfig_v1_admissionregistration_k8s_io? = null
  override var failurePolicy: String? = null
  override var matchPolicy: String? = null
  override var namespaceSelector: LabelSelector_v1_meta? = null
  override var objectSelector: LabelSelector_v1_meta? = null
  override var reinvocationPolicy: String? = null
  override var rules: List<RuleWithOperations_v1_admissionregistration_k8s_io>? = null
  override var sideEffects: String? = null
  override var timeoutSeconds: Int? = null
}

@JsonPropertyOrder("path", "readOnly", "server")
class NFSVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NFSVolumeSource_v1_core, HasParent {
  override var path: String? = null
  override var readOnly: Boolean? = null
  override var server: String? = null
}

@JsonPropertyOrder("lastTransitionTime", "message", "reason", "status", "type")
class NamespaceCondition_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NamespaceCondition_v1_core, HasParent {
  override var lastTransitionTime: Time_v1_meta? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("ports", "to")
class NetworkPolicyEgressRule_v1_networking_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NetworkPolicyEgressRule_v1_networking_k8s_io, HasParent {
  override var ports: List<NetworkPolicyPort_v1_networking_k8s_io>? = null
  override var to: List<NetworkPolicyPeer_v1_networking_k8s_io>? = null
}

@JsonPropertyOrder("from", "ports")
class NetworkPolicyIngressRule_v1_networking_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NetworkPolicyIngressRule_v1_networking_k8s_io, HasParent {
  override var from: List<NetworkPolicyPeer_v1_networking_k8s_io>? = null
  override var ports: List<NetworkPolicyPort_v1_networking_k8s_io>? = null
}

@JsonPropertyOrder("ipBlock", "namespaceSelector", "podSelector")
class NetworkPolicyPeer_v1_networking_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NetworkPolicyPeer_v1_networking_k8s_io, HasParent {
  override var ipBlock: IPBlock_v1_networking_k8s_io? = null
  override var namespaceSelector: LabelSelector_v1_meta? = null
  override var podSelector: LabelSelector_v1_meta? = null
}

@JsonPropertyOrder("port", "protocol")
class NetworkPolicyPort_v1_networking_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NetworkPolicyPort_v1_networking_k8s_io, HasParent {
  override var port: de.loosetie.k8s.dsl.types.IntOrString? = null
  override var protocol: String? = null
}

@JsonPropertyOrder("address", "type")
class NodeAddress_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeAddress_v1_core, HasParent {
  override var address: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("preferredDuringSchedulingIgnoredDuringExecution", "requiredDuringSchedulingIgnoredDuringExecution")
class NodeAffinity_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeAffinity_v1_core, HasParent {
  override var preferredDuringSchedulingIgnoredDuringExecution: List<PreferredSchedulingTerm_v1_core>? = null
  override var requiredDuringSchedulingIgnoredDuringExecution: NodeSelector_v1_core? = null
}

@JsonPropertyOrder("lastHeartbeatTime", "lastTransitionTime", "message", "reason", "status", "type")
class NodeCondition_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeCondition_v1_core, HasParent {
  override var lastHeartbeatTime: Time_v1_meta? = null
  override var lastTransitionTime: Time_v1_meta? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("configMap")
class NodeConfigSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeConfigSource_v1_core, HasParent {
  override var configMap: ConfigMapNodeConfigSource_v1_core? = null
}

@JsonPropertyOrder("active", "assigned", "error", "lastKnownGood")
class NodeConfigStatus_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeConfigStatus_v1_core, HasParent {
  override var active: NodeConfigSource_v1_core? = null
  override var assigned: NodeConfigSource_v1_core? = null
  override var error: String? = null
  override var lastKnownGood: NodeConfigSource_v1_core? = null
}

@JsonPropertyOrder("kubeletEndpoint")
class NodeDaemonEndpoints_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeDaemonEndpoints_v1_core, HasParent {
  override var kubeletEndpoint: DaemonEndpoint_v1_core? = null
}

@JsonPropertyOrder("nodeSelectorTerms")
class NodeSelector_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeSelector_v1_core, HasParent {
  override var nodeSelectorTerms: List<NodeSelectorTerm_v1_core>? = null
}

@JsonPropertyOrder("key", "operator", "values")
class NodeSelectorRequirement_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeSelectorRequirement_v1_core, HasParent {
  override var key: String? = null
  override var operator: String? = null
  override var values: List<String>? = null
}

@JsonPropertyOrder("matchExpressions", "matchFields")
class NodeSelectorTerm_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeSelectorTerm_v1_core, HasParent {
  override var matchExpressions: List<NodeSelectorRequirement_v1_core>? = null
  override var matchFields: List<NodeSelectorRequirement_v1_core>? = null
}

@JsonPropertyOrder("architecture", "bootID", "containerRuntimeVersion", "kernelVersion", "kubeProxyVersion", "kubeletVersion", "machineID", "operatingSystem", "osImage", "systemUUID")
class NodeSystemInfo_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeSystemInfo_v1_core, HasParent {
  override var architecture: String? = null
  override var bootID: String? = null
  override var containerRuntimeVersion: String? = null
  override var kernelVersion: String? = null
  override var kubeProxyVersion: String? = null
  override var kubeletVersion: String? = null
  override var machineID: String? = null
  override var operatingSystem: String? = null
  override var osImage: String? = null
  override var systemUUID: String? = null
}

@JsonPropertyOrder("path", "verb")
class NonResourceAttributes_v1_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NonResourceAttributes_v1_authorization_k8s_io, HasParent {
  override var path: String? = null
  override var verb: String? = null
}

@JsonPropertyOrder("nonResourceURLs", "verbs")
class NonResourceRule_v1_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NonResourceRule_v1_authorization_k8s_io, HasParent {
  override var nonResourceURLs: List<String>? = null
  override var verbs: List<String>? = null
}

@JsonPropertyOrder("apiVersion", "fieldPath")
class ObjectFieldSelector_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ObjectFieldSelector_v1_core, HasParent {
  override var apiVersion: String? = null
  override var fieldPath: String? = null
}

@JsonPropertyOrder("namespace", "name", "labels", "annotations", "clusterName", "creationTimestamp", "deletionGracePeriodSeconds", "deletionTimestamp", "finalizers", "generateName", "generation", "managedFields", "ownerReferences", "resourceVersion", "selfLink", "uid")
class ObjectMeta_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ObjectMeta_v1_meta, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var labels: Map<String, String>? = null
  override var annotations: Map<String, String>? = null
  override var clusterName: String? = null
  override var creationTimestamp: Time_v1_meta? = null
  override var deletionGracePeriodSeconds: Int? = null
  override var deletionTimestamp: Time_v1_meta? = null
  override var finalizers: List<String>? = null
  override var generateName: String? = null
  override var generation: Int? = null
  override var managedFields: List<ManagedFieldsEntry_v1_meta>? = null
  override var ownerReferences: List<OwnerReference_v1_meta>? = null
  override var resourceVersion: String? = null
  override var selfLink: String? = null
  override var uid: String? = null
}

@JsonPropertyOrder("describedObject", "metric", "target")
class ObjectMetricSource_v2beta2_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ObjectMetricSource_v2beta2_autoscaling, HasParent {
  override var describedObject: CrossVersionObjectReference_v2beta2_autoscaling? = null
  override var metric: MetricIdentifier_v2beta2_autoscaling? = null
  override var target: MetricTarget_v2beta2_autoscaling? = null
}

@JsonPropertyOrder("current", "describedObject", "metric")
class ObjectMetricStatus_v2beta2_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ObjectMetricStatus_v2beta2_autoscaling, HasParent {
  override var current: MetricValueStatus_v2beta2_autoscaling? = null
  override var describedObject: CrossVersionObjectReference_v2beta2_autoscaling? = null
  override var metric: MetricIdentifier_v2beta2_autoscaling? = null
}

@JsonPropertyOrder("apiVersion", "kind", "namespace", "name", "fieldPath", "resourceVersion", "uid")
class ObjectReference_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ObjectReference_v1_core, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var fieldPath: String? = null
  override var resourceVersion: String? = null
  override var uid: String? = null
}

@JsonPropertyOrder("podFixed")
class Overhead_v1beta1_node_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Overhead_v1beta1_node_k8s_io, HasParent {
  override var podFixed: de.loosetie.k8s.dsl.types.LimitsAndRequests? = null
}

@JsonPropertyOrder("apiVersion", "kind", "name", "blockOwnerDeletion", "controller", "uid")
class OwnerReference_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: OwnerReference_v1_meta, HasParent {
  override var name: String? = null
  override var blockOwnerDeletion: Boolean? = null
  override var controller: Boolean? = null
  override var uid: String? = null
}

@JsonPropertyOrder("")
class Patch_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Patch_v1_meta, HasParent {
  
}

@JsonPropertyOrder("lastProbeTime", "lastTransitionTime", "message", "reason", "status", "type")
class PersistentVolumeClaimCondition_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PersistentVolumeClaimCondition_v1_core, HasParent {
  override var lastProbeTime: Time_v1_meta? = null
  override var lastTransitionTime: Time_v1_meta? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("claimName", "readOnly")
class PersistentVolumeClaimVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PersistentVolumeClaimVolumeSource_v1_core, HasParent {
  override var claimName: String? = null
  override var readOnly: Boolean? = null
}

@JsonPropertyOrder("fsType", "pdID")
class PhotonPersistentDiskVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PhotonPersistentDiskVolumeSource_v1_core, HasParent {
  override var fsType: String? = null
  override var pdID: String? = null
}

@JsonPropertyOrder("preferredDuringSchedulingIgnoredDuringExecution", "requiredDuringSchedulingIgnoredDuringExecution")
class PodAffinity_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodAffinity_v1_core, HasParent {
  override var preferredDuringSchedulingIgnoredDuringExecution: List<WeightedPodAffinityTerm_v1_core>? = null
  override var requiredDuringSchedulingIgnoredDuringExecution: List<PodAffinityTerm_v1_core>? = null
}

@JsonPropertyOrder("labelSelector", "namespaces", "topologyKey")
class PodAffinityTerm_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodAffinityTerm_v1_core, HasParent {
  override var labelSelector: LabelSelector_v1_meta? = null
  override var namespaces: List<String>? = null
  override var topologyKey: String? = null
}

@JsonPropertyOrder("preferredDuringSchedulingIgnoredDuringExecution", "requiredDuringSchedulingIgnoredDuringExecution")
class PodAntiAffinity_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodAntiAffinity_v1_core, HasParent {
  override var preferredDuringSchedulingIgnoredDuringExecution: List<WeightedPodAffinityTerm_v1_core>? = null
  override var requiredDuringSchedulingIgnoredDuringExecution: List<PodAffinityTerm_v1_core>? = null
}

@JsonPropertyOrder("lastProbeTime", "lastTransitionTime", "message", "reason", "status", "type")
class PodCondition_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodCondition_v1_core, HasParent {
  override var lastProbeTime: Time_v1_meta? = null
  override var lastTransitionTime: Time_v1_meta? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("nameservers", "options", "searches")
class PodDNSConfig_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodDNSConfig_v1_core, HasParent {
  override var nameservers: List<String>? = null
  override var options: List<PodDNSConfigOption_v1_core>? = null
  override var searches: List<String>? = null
}

@JsonPropertyOrder("name", "value")
class PodDNSConfigOption_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodDNSConfigOption_v1_core, HasParent {
  override var name: String? = null
  override var value: String? = null
}

@JsonPropertyOrder("ip")
class PodIP_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodIP_v1_core, HasParent {
  override var ip: String? = null
}

@JsonPropertyOrder("conditionType")
class PodReadinessGate_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodReadinessGate_v1_core, HasParent {
  override var conditionType: String? = null
}

@JsonPropertyOrder("fsGroup", "runAsGroup", "runAsNonRoot", "runAsUser", "seLinuxOptions", "supplementalGroups", "sysctls", "windowsOptions")
class PodSecurityContext_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodSecurityContext_v1_core, HasParent {
  override var fsGroup: Int? = null
  override var runAsGroup: Int? = null
  override var runAsNonRoot: Boolean? = null
  override var runAsUser: Int? = null
  override var seLinuxOptions: SELinuxOptions_v1_core? = null
  override var supplementalGroups: List<Int>? = null
  override var sysctls: List<Sysctl_v1_core>? = null
  override var windowsOptions: WindowsSecurityContextOptions_v1_core? = null
}

@JsonPropertyOrder("metric", "target")
class PodsMetricSource_v2beta2_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodsMetricSource_v2beta2_autoscaling, HasParent {
  override var metric: MetricIdentifier_v2beta2_autoscaling? = null
  override var target: MetricTarget_v2beta2_autoscaling? = null
}

@JsonPropertyOrder("current", "metric")
class PodsMetricStatus_v2beta2_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodsMetricStatus_v2beta2_autoscaling, HasParent {
  override var current: MetricValueStatus_v2beta2_autoscaling? = null
  override var metric: MetricIdentifier_v2beta2_autoscaling? = null
}

@JsonPropertyOrder("level", "stages")
class Policy_v1alpha1_auditregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Policy_v1alpha1_auditregistration_k8s_io, HasParent {
  override var level: String? = null
  override var stages: List<String>? = null
}

@JsonPropertyOrder("apiGroups", "nonResourceURLs", "resourceNames", "resources", "verbs")
class PolicyRule_v1_rbac_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PolicyRule_v1_rbac_authorization_k8s_io, HasParent {
  override var apiGroups: List<String>? = null
  override var nonResourceURLs: List<String>? = null
  override var resourceNames: List<String>? = null
  override var resources: List<String>? = null
  override var verbs: List<String>? = null
}

@JsonPropertyOrder("fsType", "readOnly", "volumeID")
class PortworxVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PortworxVolumeSource_v1_core, HasParent {
  override var fsType: String? = null
  override var readOnly: Boolean? = null
  override var volumeID: String? = null
}

@JsonPropertyOrder("resourceVersion", "uid")
class Preconditions_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Preconditions_v1_meta, HasParent {
  override var resourceVersion: String? = null
  override var uid: String? = null
}

@JsonPropertyOrder("preference", "weight")
class PreferredSchedulingTerm_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PreferredSchedulingTerm_v1_core, HasParent {
  override var preference: NodeSelectorTerm_v1_core? = null
  override var weight: Int? = null
}

@JsonPropertyOrder("exec", "failureThreshold", "httpGet", "initialDelaySeconds", "periodSeconds", "successThreshold", "tcpSocket", "timeoutSeconds")
class Probe_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Probe_v1_core, HasParent {
  override var exec: ExecAction_v1_core? = null
  override var failureThreshold: Int? = null
  override var httpGet: HTTPGetAction_v1_core? = null
  override var initialDelaySeconds: Int? = null
  override var periodSeconds: Int? = null
  override var successThreshold: Int? = null
  override var tcpSocket: TCPSocketAction_v1_core? = null
  override var timeoutSeconds: Int? = null
}

@JsonPropertyOrder("defaultMode", "sources")
class ProjectedVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ProjectedVolumeSource_v1_core, HasParent {
  override var defaultMode: Int? = null
  override var sources: List<VolumeProjection_v1_core>? = null
}

@JsonPropertyOrder("")
class Quantity_resource_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Quantity_resource_core, HasParent {
  
}

@JsonPropertyOrder("group", "readOnly", "registry", "tenant", "user", "volume")
class QuobyteVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: QuobyteVolumeSource_v1_core, HasParent {
  override var group: String? = null
  override var readOnly: Boolean? = null
  override var registry: String? = null
  override var tenant: String? = null
  override var user: String? = null
  override var volume: String? = null
}

@JsonPropertyOrder("fsType", "image", "keyring", "monitors", "pool", "readOnly", "secretRef", "user")
class RBDPersistentVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RBDPersistentVolumeSource_v1_core, HasParent {
  override var fsType: String? = null
  override var image: String? = null
  override var keyring: String? = null
  override var monitors: List<String>? = null
  override var pool: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: SecretReference_v1_core? = null
  override var user: String? = null
}

@JsonPropertyOrder("fsType", "image", "keyring", "monitors", "pool", "readOnly", "secretRef", "user")
class RBDVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RBDVolumeSource_v1_core, HasParent {
  override var fsType: String? = null
  override var image: String? = null
  override var keyring: String? = null
  override var monitors: List<String>? = null
  override var pool: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: LocalObjectReference_v1_core? = null
  override var user: String? = null
}

@JsonPropertyOrder("lastTransitionTime", "message", "reason", "status", "type")
class ReplicaSetCondition_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ReplicaSetCondition_v1_apps, HasParent {
  override var lastTransitionTime: Time_v1_meta? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("lastTransitionTime", "message", "reason", "status", "type")
class ReplicationControllerCondition_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ReplicationControllerCondition_v1_core, HasParent {
  override var lastTransitionTime: Time_v1_meta? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("namespace", "name", "group", "resource", "subresource", "verb", "version")
class ResourceAttributes_v1_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourceAttributes_v1_authorization_k8s_io, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var group: String? = null
  override var resource: String? = null
  override var subresource: String? = null
  override var verb: String? = null
  override var version: String? = null
}

@JsonPropertyOrder("containerName", "divisor", "resource")
class ResourceFieldSelector_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourceFieldSelector_v1_core, HasParent {
  override var containerName: String? = null
  override var divisor: Quantity_resource_core? = null
  override var resource: String? = null
}

@JsonPropertyOrder("name", "target")
class ResourceMetricSource_v2beta2_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourceMetricSource_v2beta2_autoscaling, HasParent {
  override var name: String? = null
  override var target: MetricTarget_v2beta2_autoscaling? = null
}

@JsonPropertyOrder("name", "current")
class ResourceMetricStatus_v2beta2_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourceMetricStatus_v2beta2_autoscaling, HasParent {
  override var name: String? = null
  override var current: MetricValueStatus_v2beta2_autoscaling? = null
}

@JsonPropertyOrder("limits", "requests")
class ResourceRequirements_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourceRequirements_v1_core, HasParent {
  override var limits: de.loosetie.k8s.dsl.types.LimitsAndRequests? = null
  override var requests: de.loosetie.k8s.dsl.types.LimitsAndRequests? = null
}

@JsonPropertyOrder("apiGroups", "resourceNames", "resources", "verbs")
class ResourceRule_v1_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourceRule_v1_authorization_k8s_io, HasParent {
  override var apiGroups: List<String>? = null
  override var resourceNames: List<String>? = null
  override var resources: List<String>? = null
  override var verbs: List<String>? = null
}

@JsonPropertyOrder("kind", "name", "apiGroup")
class RoleRef_v1_rbac_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RoleRef_v1_rbac_authorization_k8s_io, HasParent {
  override var kind: String? = null
  override var name: String? = null
  override var apiGroup: String? = null
}

@JsonPropertyOrder("revision")
class RollbackConfig_v1beta1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RollbackConfig_v1beta1_apps, HasParent {
  override var revision: Int? = null
}

@JsonPropertyOrder("partition")
class RollingUpdateStatefulSetStrategy_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RollingUpdateStatefulSetStrategy_v1_apps, HasParent {
  override var partition: Int? = null
}

@JsonPropertyOrder("apiGroups", "apiVersions", "operations", "resources", "scope")
class RuleWithOperations_v1_admissionregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RuleWithOperations_v1_admissionregistration_k8s_io, HasParent {
  override var apiGroups: List<String>? = null
  override var apiVersions: List<String>? = null
  override var operations: List<String>? = null
  override var resources: List<String>? = null
  override var scope: String? = null
}

@JsonPropertyOrder("ranges", "rule")
class RunAsGroupStrategyOptions_v1beta1_policyImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RunAsGroupStrategyOptions_v1beta1_policy, HasParent {
  override var ranges: List<IDRange_v1beta1_policy>? = null
  override var rule: String? = null
}

@JsonPropertyOrder("ranges", "rule")
class RunAsUserStrategyOptions_v1beta1_policyImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RunAsUserStrategyOptions_v1beta1_policy, HasParent {
  override var ranges: List<IDRange_v1beta1_policy>? = null
  override var rule: String? = null
}

@JsonPropertyOrder("allowedRuntimeClassNames", "defaultRuntimeClassName")
class RuntimeClassStrategyOptions_v1beta1_policyImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RuntimeClassStrategyOptions_v1beta1_policy, HasParent {
  override var allowedRuntimeClassNames: List<String>? = null
  override var defaultRuntimeClassName: String? = null
}

@JsonPropertyOrder("level", "role", "type", "user")
class SELinuxOptions_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SELinuxOptions_v1_core, HasParent {
  override var level: String? = null
  override var role: String? = null
  override var type: String? = null
  override var user: String? = null
}

@JsonPropertyOrder("rule", "seLinuxOptions")
class SELinuxStrategyOptions_v1beta1_policyImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SELinuxStrategyOptions_v1beta1_policy, HasParent {
  override var rule: String? = null
  override var seLinuxOptions: SELinuxOptions_v1_core? = null
}

@JsonPropertyOrder("fsType", "gateway", "protectionDomain", "readOnly", "secretRef", "sslEnabled", "storageMode", "storagePool", "system", "volumeName")
class ScaleIOPersistentVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ScaleIOPersistentVolumeSource_v1_core, HasParent {
  override var fsType: String? = null
  override var gateway: String? = null
  override var protectionDomain: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: SecretReference_v1_core? = null
  override var sslEnabled: Boolean? = null
  override var storageMode: String? = null
  override var storagePool: String? = null
  override var system: String? = null
  override var volumeName: String? = null
}

@JsonPropertyOrder("fsType", "gateway", "protectionDomain", "readOnly", "secretRef", "sslEnabled", "storageMode", "storagePool", "system", "volumeName")
class ScaleIOVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ScaleIOVolumeSource_v1_core, HasParent {
  override var fsType: String? = null
  override var gateway: String? = null
  override var protectionDomain: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: LocalObjectReference_v1_core? = null
  override var sslEnabled: Boolean? = null
  override var storageMode: String? = null
  override var storagePool: String? = null
  override var system: String? = null
  override var volumeName: String? = null
}

@JsonPropertyOrder("nodeSelector", "tolerations")
class Scheduling_v1beta1_node_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Scheduling_v1beta1_node_k8s_io, HasParent {
  override var nodeSelector: Map<String, String>? = null
  override var tolerations: List<Toleration_v1_core>? = null
}

@JsonPropertyOrder("matchExpressions")
class ScopeSelector_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ScopeSelector_v1_core, HasParent {
  override var matchExpressions: List<ScopedResourceSelectorRequirement_v1_core>? = null
}

@JsonPropertyOrder("operator", "scopeName", "values")
class ScopedResourceSelectorRequirement_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ScopedResourceSelectorRequirement_v1_core, HasParent {
  override var operator: String? = null
  override var scopeName: String? = null
  override var values: List<String>? = null
}

@JsonPropertyOrder("name", "optional")
class SecretEnvSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SecretEnvSource_v1_core, HasParent {
  override var name: String? = null
  override var optional: Boolean? = null
}

@JsonPropertyOrder("name", "key", "optional")
class SecretKeySelector_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SecretKeySelector_v1_core, HasParent {
  override var name: String? = null
  override var key: String? = null
  override var optional: Boolean? = null
}

@JsonPropertyOrder("name", "items", "optional")
class SecretProjection_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SecretProjection_v1_core, HasParent {
  override var name: String? = null
  override var items: List<KeyToPath_v1_core>? = null
  override var optional: Boolean? = null
}

@JsonPropertyOrder("namespace", "name")
class SecretReference_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SecretReference_v1_core, HasParent {
  override var namespace: String? = null
  override var name: String? = null
}

@JsonPropertyOrder("defaultMode", "items", "optional", "secretName")
class SecretVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SecretVolumeSource_v1_core, HasParent {
  override var defaultMode: Int? = null
  override var items: List<KeyToPath_v1_core>? = null
  override var optional: Boolean? = null
  override var secretName: String? = null
}

@JsonPropertyOrder("allowPrivilegeEscalation", "capabilities", "privileged", "procMount", "readOnlyRootFilesystem", "runAsGroup", "runAsNonRoot", "runAsUser", "seLinuxOptions", "windowsOptions")
class SecurityContext_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SecurityContext_v1_core, HasParent {
  override var allowPrivilegeEscalation: Boolean? = null
  override var capabilities: Capabilities_v1_core? = null
  override var privileged: Boolean? = null
  override var procMount: String? = null
  override var readOnlyRootFilesystem: Boolean? = null
  override var runAsGroup: Int? = null
  override var runAsNonRoot: Boolean? = null
  override var runAsUser: Int? = null
  override var seLinuxOptions: SELinuxOptions_v1_core? = null
  override var windowsOptions: WindowsSecurityContextOptions_v1_core? = null
}

@JsonPropertyOrder("clientCIDR", "serverAddress")
class ServerAddressByClientCIDR_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServerAddressByClientCIDR_v1_meta, HasParent {
  override var clientCIDR: String? = null
  override var serverAddress: String? = null
}

@JsonPropertyOrder("audience", "expirationSeconds", "path")
class ServiceAccountTokenProjection_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceAccountTokenProjection_v1_core, HasParent {
  override var audience: String? = null
  override var expirationSeconds: Int? = null
  override var path: String? = null
}

@JsonPropertyOrder("name", "nodePort", "port", "protocol", "targetPort")
class ServicePort_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServicePort_v1_core, HasParent {
  override var name: String? = null
  override var nodePort: Int? = null
  override var port: Int? = null
  override var protocol: String? = null
  override var targetPort: de.loosetie.k8s.dsl.types.IntOrString? = null
}

@JsonPropertyOrder("namespace", "name", "path", "port")
class ServiceReference_v1_admissionregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceReference_v1_admissionregistration_k8s_io, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var path: String? = null
  override var port: Int? = null
}

@JsonPropertyOrder("clientIP")
class SessionAffinityConfig_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SessionAffinityConfig_v1_core, HasParent {
  override var clientIP: ClientIPConfig_v1_core? = null
}

@JsonPropertyOrder("lastTransitionTime", "message", "reason", "status", "type")
class StatefulSetCondition_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StatefulSetCondition_v1_apps, HasParent {
  override var lastTransitionTime: Time_v1_meta? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("rollingUpdate", "type")
class StatefulSetUpdateStrategy_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StatefulSetUpdateStrategy_v1_apps, HasParent {
  override var rollingUpdate: RollingUpdateStatefulSetStrategy_v1_apps? = null
  override var type: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "code", "details", "message", "reason", "status")
class Status_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Status_v1_meta, HasParent {
  override lateinit var metadata: ListMeta_v1_meta
  override var code: Int? = null
  override var details: StatusDetails_v1_meta? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
}

@JsonPropertyOrder("field", "message", "reason")
class StatusCause_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StatusCause_v1_meta, HasParent {
  override var field: String? = null
  override var message: String? = null
  override var reason: String? = null
}

@JsonPropertyOrder("kind", "name", "causes", "group", "retryAfterSeconds", "uid")
class StatusDetails_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StatusDetails_v1_meta, HasParent {
  override var kind: String? = null
  override var name: String? = null
  override var causes: List<StatusCause_v1_meta>? = null
  override var group: String? = null
  override var retryAfterSeconds: Int? = null
  override var uid: String? = null
}

@JsonPropertyOrder("fsType", "readOnly", "secretRef", "volumeName", "volumeNamespace")
class StorageOSPersistentVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StorageOSPersistentVolumeSource_v1_core, HasParent {
  override var fsType: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: ObjectReference_v1_core? = null
  override var volumeName: String? = null
  override var volumeNamespace: String? = null
}

@JsonPropertyOrder("fsType", "readOnly", "secretRef", "volumeName", "volumeNamespace")
class StorageOSVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StorageOSVolumeSource_v1_core, HasParent {
  override var fsType: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: LocalObjectReference_v1_core? = null
  override var volumeName: String? = null
  override var volumeNamespace: String? = null
}

@JsonPropertyOrder("kind", "namespace", "name", "apiGroup")
class Subject_v1_rbac_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Subject_v1_rbac_authorization_k8s_io, HasParent {
  override var kind: String? = null
  override var namespace: String? = null
  override var name: String? = null
  override var apiGroup: String? = null
}

@JsonPropertyOrder("evaluationError", "incomplete", "nonResourceRules", "resourceRules")
class SubjectRulesReviewStatus_v1_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SubjectRulesReviewStatus_v1_authorization_k8s_io, HasParent {
  override var evaluationError: String? = null
  override var incomplete: Boolean? = null
  override var nonResourceRules: List<NonResourceRule_v1_authorization_k8s_io>? = null
  override var resourceRules: List<ResourceRule_v1_authorization_k8s_io>? = null
}

@JsonPropertyOrder("ranges", "rule")
class SupplementalGroupsStrategyOptions_v1beta1_policyImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SupplementalGroupsStrategyOptions_v1beta1_policy, HasParent {
  override var ranges: List<IDRange_v1beta1_policy>? = null
  override var rule: String? = null
}

@JsonPropertyOrder("name", "value")
class Sysctl_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Sysctl_v1_core, HasParent {
  override var name: String? = null
  override var value: String? = null
}

@JsonPropertyOrder("host", "port")
class TCPSocketAction_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: TCPSocketAction_v1_core, HasParent {
  override var host: String? = null
  override var port: de.loosetie.k8s.dsl.types.IntOrString? = null
}

@JsonPropertyOrder("effect", "key", "timeAdded", "value")
class Taint_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Taint_v1_core, HasParent {
  override var effect: String? = null
  override var key: String? = null
  override var timeAdded: Time_v1_meta? = null
  override var value: String? = null
}

@JsonPropertyOrder("")
class Time_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Time_v1_meta, HasParent {
  
}

@JsonPropertyOrder("effect", "key", "operator", "tolerationSeconds", "value")
class Toleration_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Toleration_v1_core, HasParent {
  override var effect: String? = null
  override var key: String? = null
  override var operator: String? = null
  override var tolerationSeconds: Int? = null
  override var value: String? = null
}

@JsonPropertyOrder("key", "values")
class TopologySelectorLabelRequirement_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: TopologySelectorLabelRequirement_v1_core, HasParent {
  override var key: String? = null
  override var values: List<String>? = null
}

@JsonPropertyOrder("matchLabelExpressions")
class TopologySelectorTerm_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: TopologySelectorTerm_v1_core, HasParent {
  override var matchLabelExpressions: List<TopologySelectorLabelRequirement_v1_core>? = null
}

@JsonPropertyOrder("labelSelector", "maxSkew", "topologyKey", "whenUnsatisfiable")
class TopologySpreadConstraint_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: TopologySpreadConstraint_v1_core, HasParent {
  override var labelSelector: LabelSelector_v1_meta? = null
  override var maxSkew: Int? = null
  override var topologyKey: String? = null
  override var whenUnsatisfiable: String? = null
}

@JsonPropertyOrder("kind", "name", "apiGroup")
class TypedLocalObjectReference_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: TypedLocalObjectReference_v1_core, HasParent {
  override var kind: String? = null
  override var name: String? = null
  override var apiGroup: String? = null
}

@JsonPropertyOrder("extra", "groups", "uid", "username")
class UserInfo_v1_authentication_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: UserInfo_v1_authentication_k8s_io, HasParent {
  override var extra: Any? = null
  override var groups: List<String>? = null
  override var uid: String? = null
  override var username: String? = null
}

@JsonPropertyOrder("name", "admissionReviewVersions", "clientConfig", "failurePolicy", "matchPolicy", "namespaceSelector", "objectSelector", "rules", "sideEffects", "timeoutSeconds")
class ValidatingWebhook_v1_admissionregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ValidatingWebhook_v1_admissionregistration_k8s_io, HasParent {
  override var name: String? = null
  override var admissionReviewVersions: List<String>? = null
  override var clientConfig: WebhookClientConfig_v1_admissionregistration_k8s_io? = null
  override var failurePolicy: String? = null
  override var matchPolicy: String? = null
  override var namespaceSelector: LabelSelector_v1_meta? = null
  override var objectSelector: LabelSelector_v1_meta? = null
  override var rules: List<RuleWithOperations_v1_admissionregistration_k8s_io>? = null
  override var sideEffects: String? = null
  override var timeoutSeconds: Int? = null
}

@JsonPropertyOrder("inlineVolumeSpec", "persistentVolumeName")
class VolumeAttachmentSource_v1_storage_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeAttachmentSource_v1_storage_k8s_io, HasParent {
  override var inlineVolumeSpec: Persistentvolumespec_v1_core? = null
  override var persistentVolumeName: String? = null
}

@JsonPropertyOrder("name", "devicePath")
class VolumeDevice_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeDevice_v1_core, HasParent {
  override var name: String? = null
  override var devicePath: String? = null
}

@JsonPropertyOrder("message", "time")
class VolumeError_v1_storage_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeError_v1_storage_k8s_io, HasParent {
  override var message: String? = null
  override var time: Time_v1_meta? = null
}

@JsonPropertyOrder("name", "mountPath", "mountPropagation", "readOnly", "subPath", "subPathExpr")
class VolumeMount_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeMount_v1_core, HasParent {
  override var name: String? = null
  override var mountPath: String? = null
  override var mountPropagation: String? = null
  override var readOnly: Boolean? = null
  override var subPath: String? = null
  override var subPathExpr: String? = null
}

@JsonPropertyOrder("required")
class VolumeNodeAffinity_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeNodeAffinity_v1_core, HasParent {
  override var required: NodeSelector_v1_core? = null
}

@JsonPropertyOrder("count")
class VolumeNodeResources_v1beta1_storage_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeNodeResources_v1beta1_storage_k8s_io, HasParent {
  override var count: Int? = null
}

@JsonPropertyOrder("configMap", "downwardAPI", "secret", "serviceAccountToken")
class VolumeProjection_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeProjection_v1_core, HasParent {
  override var configMap: ConfigMapProjection_v1_core? = null
  override var downwardAPI: DownwardAPIProjection_v1_core? = null
  override var secret: SecretProjection_v1_core? = null
  override var serviceAccountToken: ServiceAccountTokenProjection_v1_core? = null
}

@JsonPropertyOrder("fsType", "storagePolicyID", "storagePolicyName", "volumePath")
class VsphereVirtualDiskVolumeSource_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VsphereVirtualDiskVolumeSource_v1_core, HasParent {
  override var fsType: String? = null
  override var storagePolicyID: String? = null
  override var storagePolicyName: String? = null
  override var volumePath: String? = null
}

@JsonPropertyOrder("object", "type")
class WatchEvent_v1_metaImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WatchEvent_v1_meta, HasParent {
  override var `object`: Any? = null
  override var type: String? = null
}

@JsonPropertyOrder("clientConfig", "throttle")
class Webhook_v1alpha1_auditregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Webhook_v1alpha1_auditregistration_k8s_io, HasParent {
  override var clientConfig: WebhookClientConfig_v1alpha1_auditregistration_k8s_io? = null
  override var throttle: WebhookThrottleConfig_v1alpha1_auditregistration_k8s_io? = null
}

@JsonPropertyOrder("caBundle", "service", "url")
class WebhookClientConfig_v1_admissionregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WebhookClientConfig_v1_admissionregistration_k8s_io, HasParent {
  override var caBundle: String? = null
  override var service: ServiceReference_v1_admissionregistration_k8s_io? = null
  override var url: String? = null
}

@JsonPropertyOrder("clientConfig", "conversionReviewVersions")
class WebhookConversion_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WebhookConversion_v1_apiextensions_k8s_io, HasParent {
  override var clientConfig: WebhookClientConfig_v1_apiextensions_k8s_io? = null
  override var conversionReviewVersions: List<String>? = null
}

@JsonPropertyOrder("burst", "qps")
class WebhookThrottleConfig_v1alpha1_auditregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WebhookThrottleConfig_v1alpha1_auditregistration_k8s_io, HasParent {
  override var burst: Int? = null
  override var qps: Int? = null
}

@JsonPropertyOrder("podAffinityTerm", "weight")
class WeightedPodAffinityTerm_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WeightedPodAffinityTerm_v1_core, HasParent {
  override var podAffinityTerm: PodAffinityTerm_v1_core? = null
  override var weight: Int? = null
}

@JsonPropertyOrder("gmsaCredentialSpec", "gmsaCredentialSpecName", "runAsUserName")
class WindowsSecurityContextOptions_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WindowsSecurityContextOptions_v1_core, HasParent {
  override var gmsaCredentialSpec: String? = null
  override var gmsaCredentialSpecName: String? = null
  override var runAsUserName: String? = null
}

@JsonPropertyOrder("name", "port", "protocol")
class EndpointPort_v1alpha1_discovery_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointPort_v1alpha1_discovery_k8s_io, HasParent {
  override var name: String? = null
  override var port: Int? = null
  override var protocol: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "name")
class CrossVersionObjectReference_v2beta2_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CrossVersionObjectReference_v2beta2_autoscaling, HasParent {
  override var name: String? = null
}

@JsonPropertyOrder("caBundle", "service", "url")
class WebhookClientConfig_v1alpha1_auditregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WebhookClientConfig_v1alpha1_auditregistration_k8s_io, HasParent {
  override var caBundle: String? = null
  override var service: ServiceReference_v1alpha1_auditregistration_k8s_io? = null
  override var url: String? = null
}

@JsonPropertyOrder("caBundle", "service", "url")
class WebhookClientConfig_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WebhookClientConfig_v1_apiextensions_k8s_io, HasParent {
  override var caBundle: String? = null
  override var service: ServiceReference_v1_apiextensions_k8s_io? = null
  override var url: String? = null
}

@JsonPropertyOrder("namespace", "name", "path", "port")
class ServiceReference_v1alpha1_auditregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceReference_v1alpha1_auditregistration_k8s_io, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var path: String? = null
  override var port: Int? = null
}

@JsonPropertyOrder("namespace", "name", "path", "port")
class ServiceReference_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceReference_v1_apiextensions_k8s_io, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var path: String? = null
  override var port: Int? = null
}

@JsonPropertyOrder("concurrencyPolicy", "failedJobsHistoryLimit", "jobTemplate", "schedule", "startingDeadlineSeconds", "successfulJobsHistoryLimit", "suspend")
class Cronjobspec_v1beta1_batchImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Cronjobspec_v1beta1_batch, HasParent {
  override var concurrencyPolicy: String? = null
  override var failedJobsHistoryLimit: Int? = null
  override var jobTemplate: JobTemplateSpec_v1beta1_batch? = null
  override var schedule: String? = null
  override var startingDeadlineSeconds: Int? = null
  override var successfulJobsHistoryLimit: Int? = null
  override var suspend: Boolean? = null
}

@JsonPropertyOrder("active", "lastScheduleTime")
class Cronjobstatus_v1beta1_batchImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Cronjobstatus_v1beta1_batch, HasParent {
  override var active: List<ObjectReference_v1_core>? = null
  override var lastScheduleTime: Time_v1_meta? = null
}

@JsonPropertyOrder("minReadySeconds", "revisionHistoryLimit", "selector", "template", "updateStrategy")
class Daemonsetspec_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Daemonsetspec_v1_apps, HasParent {
  override var minReadySeconds: Int? = null
  override var revisionHistoryLimit: Int? = null
  override var selector: LabelSelector_v1_meta? = null
  override var template: Podtemplatespec_v1_core? = null
  override var updateStrategy: DaemonSetUpdateStrategy_v1_apps? = null
}

@JsonPropertyOrder("collisionCount", "conditions", "currentNumberScheduled", "desiredNumberScheduled", "numberAvailable", "numberMisscheduled", "numberReady", "numberUnavailable", "observedGeneration", "updatedNumberScheduled")
class Daemonsetstatus_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Daemonsetstatus_v1_apps, HasParent {
  override var collisionCount: Int? = null
  override var conditions: List<DaemonSetCondition_v1_apps>? = null
  override var currentNumberScheduled: Int? = null
  override var desiredNumberScheduled: Int? = null
  override var numberAvailable: Int? = null
  override var numberMisscheduled: Int? = null
  override var numberReady: Int? = null
  override var numberUnavailable: Int? = null
  override var observedGeneration: Int? = null
  override var updatedNumberScheduled: Int? = null
}

@JsonPropertyOrder("minReadySeconds", "paused", "progressDeadlineSeconds", "replicas", "revisionHistoryLimit", "selector", "strategy", "template")
class Deploymentspec_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Deploymentspec_v1_apps, HasParent {
  override var minReadySeconds: Int? = null
  override var paused: Boolean? = null
  override var progressDeadlineSeconds: Int? = null
  override var replicas: Int? = null
  override var revisionHistoryLimit: Int? = null
  override var selector: LabelSelector_v1_meta? = null
  override var strategy: Deploymentstrategy_v1_apps? = null
  override var template: Podtemplatespec_v1_core? = null
}

@JsonPropertyOrder("availableReplicas", "collisionCount", "conditions", "observedGeneration", "readyReplicas", "replicas", "unavailableReplicas", "updatedReplicas")
class Deploymentstatus_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Deploymentstatus_v1_apps, HasParent {
  override var availableReplicas: Int? = null
  override var collisionCount: Int? = null
  override var conditions: List<DeploymentCondition_v1_apps>? = null
  override var observedGeneration: Int? = null
  override var readyReplicas: Int? = null
  override var replicas: Int? = null
  override var unavailableReplicas: Int? = null
  override var updatedReplicas: Int? = null
}

@JsonPropertyOrder("activeDeadlineSeconds", "backoffLimit", "completions", "manualSelector", "parallelism", "selector", "template", "ttlSecondsAfterFinished")
class Jobspec_v1_batchImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Jobspec_v1_batch, HasParent {
  override var activeDeadlineSeconds: Int? = null
  override var backoffLimit: Int? = null
  override var completions: Int? = null
  override var manualSelector: Boolean? = null
  override var parallelism: Int? = null
  override var selector: LabelSelector_v1_meta? = null
  override var template: Podtemplatespec_v1_core? = null
  override var ttlSecondsAfterFinished: Int? = null
}

@JsonPropertyOrder("active", "completionTime", "conditions", "failed", "startTime", "succeeded")
class Jobstatus_v1_batchImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Jobstatus_v1_batch, HasParent {
  override var active: Int? = null
  override var completionTime: Time_v1_meta? = null
  override var conditions: List<JobCondition_v1_batch>? = null
  override var failed: Int? = null
  override var startTime: Time_v1_meta? = null
  override var succeeded: Int? = null
}

@JsonPropertyOrder("activeDeadlineSeconds", "affinity", "automountServiceAccountToken", "containers", "dnsConfig", "dnsPolicy", "enableServiceLinks", "ephemeralContainers", "hostAliases", "hostIPC", "hostNetwork", "hostPID", "hostname", "imagePullSecrets", "initContainers", "nodeName", "nodeSelector", "overhead", "preemptionPolicy", "priority", "priorityClassName", "readinessGates", "restartPolicy", "runtimeClassName", "schedulerName", "securityContext", "serviceAccount", "serviceAccountName", "shareProcessNamespace", "subdomain", "terminationGracePeriodSeconds", "tolerations", "topologySpreadConstraints", "volumes")
class Podspec_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Podspec_v1_core, HasParent {
  override var activeDeadlineSeconds: Int? = null
  override var affinity: Affinity_v1_core? = null
  override var automountServiceAccountToken: Boolean? = null
  override var containers: List<Container_v1_core>? = null
  override var dnsConfig: PodDNSConfig_v1_core? = null
  override var dnsPolicy: String? = null
  override var enableServiceLinks: Boolean? = null
  override var ephemeralContainers: List<EphemeralContainer_v1_core>? = null
  override var hostAliases: List<HostAlias_v1_core>? = null
  override var hostIPC: Boolean? = null
  override var hostNetwork: Boolean? = null
  override var hostPID: Boolean? = null
  override var hostname: String? = null
  override var imagePullSecrets: List<LocalObjectReference_v1_core>? = null
  override var initContainers: List<Container_v1_core>? = null
  override var nodeName: String? = null
  override var nodeSelector: Map<String, String>? = null
  override var overhead: de.loosetie.k8s.dsl.types.LimitsAndRequests? = null
  override var preemptionPolicy: String? = null
  override var priority: Int? = null
  override var priorityClassName: String? = null
  override var readinessGates: List<PodReadinessGate_v1_core>? = null
  override var restartPolicy: String? = null
  override var runtimeClassName: String? = null
  override var schedulerName: String? = null
  override var securityContext: PodSecurityContext_v1_core? = null
  override var serviceAccount: String? = null
  override var serviceAccountName: String? = null
  override var shareProcessNamespace: Boolean? = null
  override var subdomain: String? = null
  override var terminationGracePeriodSeconds: Int? = null
  override var tolerations: List<Toleration_v1_core>? = null
  override var topologySpreadConstraints: List<TopologySpreadConstraint_v1_core>? = null
  override var volumes: List<Volume_v1_core>? = null
}

@JsonPropertyOrder("conditions", "containerStatuses", "ephemeralContainerStatuses", "hostIP", "initContainerStatuses", "message", "nominatedNodeName", "phase", "podIP", "podIPs", "qosClass", "reason", "startTime")
class Podstatus_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Podstatus_v1_core, HasParent {
  override var conditions: List<PodCondition_v1_core>? = null
  override var containerStatuses: List<Containerstatus_v1_core>? = null
  override var ephemeralContainerStatuses: List<Containerstatus_v1_core>? = null
  override var hostIP: String? = null
  override var initContainerStatuses: List<Containerstatus_v1_core>? = null
  override var message: String? = null
  override var nominatedNodeName: String? = null
  override var phase: String? = null
  override var podIP: String? = null
  override var podIPs: List<PodIP_v1_core>? = null
  override var qosClass: String? = null
  override var reason: String? = null
  override var startTime: Time_v1_meta? = null
}

@JsonPropertyOrder("minReadySeconds", "replicas", "selector", "template")
class Replicasetspec_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Replicasetspec_v1_apps, HasParent {
  override var minReadySeconds: Int? = null
  override var replicas: Int? = null
  override var selector: LabelSelector_v1_meta? = null
  override var template: Podtemplatespec_v1_core? = null
}

@JsonPropertyOrder("availableReplicas", "conditions", "fullyLabeledReplicas", "observedGeneration", "readyReplicas", "replicas")
class Replicasetstatus_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Replicasetstatus_v1_apps, HasParent {
  override var availableReplicas: Int? = null
  override var conditions: List<ReplicaSetCondition_v1_apps>? = null
  override var fullyLabeledReplicas: Int? = null
  override var observedGeneration: Int? = null
  override var readyReplicas: Int? = null
  override var replicas: Int? = null
}

@JsonPropertyOrder("minReadySeconds", "replicas", "selector", "template")
class Replicationcontrollerspec_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Replicationcontrollerspec_v1_core, HasParent {
  override var minReadySeconds: Int? = null
  override var replicas: Int? = null
  override var selector: Map<String, String>? = null
  override var template: Podtemplatespec_v1_core? = null
}

@JsonPropertyOrder("availableReplicas", "conditions", "fullyLabeledReplicas", "observedGeneration", "readyReplicas", "replicas")
class Replicationcontrollerstatus_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Replicationcontrollerstatus_v1_core, HasParent {
  override var availableReplicas: Int? = null
  override var conditions: List<ReplicationControllerCondition_v1_core>? = null
  override var fullyLabeledReplicas: Int? = null
  override var observedGeneration: Int? = null
  override var readyReplicas: Int? = null
  override var replicas: Int? = null
}

@JsonPropertyOrder("podManagementPolicy", "replicas", "revisionHistoryLimit", "selector", "serviceName", "template", "updateStrategy", "volumeClaimTemplates")
class Statefulsetspec_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Statefulsetspec_v1_apps, HasParent {
  override var podManagementPolicy: String? = null
  override var replicas: Int? = null
  override var revisionHistoryLimit: Int? = null
  override var selector: LabelSelector_v1_meta? = null
  override var serviceName: String? = null
  override var template: Podtemplatespec_v1_core? = null
  override var updateStrategy: StatefulSetUpdateStrategy_v1_apps? = null
  override var volumeClaimTemplates: List<PersistentVolumeClaim_v1_core>? = null
}

@JsonPropertyOrder("collisionCount", "conditions", "currentReplicas", "currentRevision", "observedGeneration", "readyReplicas", "replicas", "updateRevision", "updatedReplicas")
class Statefulsetstatus_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Statefulsetstatus_v1_apps, HasParent {
  override var collisionCount: Int? = null
  override var conditions: List<StatefulSetCondition_v1_apps>? = null
  override var currentReplicas: Int? = null
  override var currentRevision: String? = null
  override var observedGeneration: Int? = null
  override var readyReplicas: Int? = null
  override var replicas: Int? = null
  override var updateRevision: String? = null
  override var updatedReplicas: Int? = null
}

@JsonPropertyOrder("backend", "rules", "tls")
class Ingressspec_v1beta1_networking_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Ingressspec_v1beta1_networking_k8s_io, HasParent {
  override var backend: IngressBackend_v1beta1_networking_k8s_io? = null
  override var rules: List<IngressRule_v1beta1_networking_k8s_io>? = null
  override var tls: List<IngressTLS_v1beta1_networking_k8s_io>? = null
}

@JsonPropertyOrder("loadBalancer")
class Ingressstatus_v1beta1_networking_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Ingressstatus_v1beta1_networking_k8s_io, HasParent {
  override var loadBalancer: LoadBalancerStatus_v1_core? = null
}

@JsonPropertyOrder("clusterIP", "externalIPs", "externalName", "externalTrafficPolicy", "healthCheckNodePort", "ipFamily", "loadBalancerIP", "loadBalancerSourceRanges", "ports", "publishNotReadyAddresses", "selector", "sessionAffinity", "sessionAffinityConfig", "type")
class Servicespec_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Servicespec_v1_core, HasParent {
  override var clusterIP: String? = null
  override var externalIPs: List<String>? = null
  override var externalName: String? = null
  override var externalTrafficPolicy: String? = null
  override var healthCheckNodePort: Int? = null
  override var ipFamily: String? = null
  override var loadBalancerIP: String? = null
  override var loadBalancerSourceRanges: List<String>? = null
  override var ports: List<ServicePort_v1_core>? = null
  override var publishNotReadyAddresses: Boolean? = null
  override var selector: Map<String, String>? = null
  override var sessionAffinity: String? = null
  override var sessionAffinityConfig: SessionAffinityConfig_v1_core? = null
  override var type: String? = null
}

@JsonPropertyOrder("loadBalancer")
class Servicestatus_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Servicestatus_v1_core, HasParent {
  override var loadBalancer: LoadBalancerStatus_v1_core? = null
}

@JsonPropertyOrder("attachRequired", "podInfoOnMount", "volumeLifecycleModes")
class Csidriverspec_v1beta1_storage_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Csidriverspec_v1beta1_storage_k8s_io, HasParent {
  override var attachRequired: Boolean? = null
  override var podInfoOnMount: Boolean? = null
  override var volumeLifecycleModes: List<String>? = null
}

@JsonPropertyOrder("drivers")
class Csinodespec_v1beta1_storage_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Csinodespec_v1beta1_storage_k8s_io, HasParent {
  override var drivers: List<CSINodeDriver_v1beta1_storage_k8s_io>? = null
}

@JsonPropertyOrder("accessModes", "dataSource", "resources", "selector", "storageClassName", "volumeMode", "volumeName")
class Persistentvolumeclaimspec_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Persistentvolumeclaimspec_v1_core, HasParent {
  override var accessModes: List<String>? = null
  override var dataSource: TypedLocalObjectReference_v1_core? = null
  override var resources: ResourceRequirements_v1_core? = null
  override var selector: LabelSelector_v1_meta? = null
  override var storageClassName: String? = null
  override var volumeMode: String? = null
  override var volumeName: String? = null
}

@JsonPropertyOrder("accessModes", "capacity", "conditions", "phase")
class Persistentvolumeclaimstatus_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Persistentvolumeclaimstatus_v1_core, HasParent {
  override var accessModes: List<String>? = null
  override var capacity: Any? = null
  override var conditions: List<PersistentVolumeClaimCondition_v1_core>? = null
  override var phase: String? = null
}

@JsonPropertyOrder("attacher", "nodeName", "source")
class Volumeattachmentspec_v1_storage_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Volumeattachmentspec_v1_storage_k8s_io, HasParent {
  override var attacher: String? = null
  override var nodeName: String? = null
  override var source: VolumeAttachmentSource_v1_storage_k8s_io? = null
}

@JsonPropertyOrder("attachError", "attached", "attachmentMetadata", "detachError")
class Volumeattachmentstatus_v1_storage_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Volumeattachmentstatus_v1_storage_k8s_io, HasParent {
  override var attachError: VolumeError_v1_storage_k8s_io? = null
  override var attached: Boolean? = null
  override var attachmentMetadata: Any? = null
  override var detachError: VolumeError_v1_storage_k8s_io? = null
}

@JsonPropertyOrder("conversion", "group", "names", "preserveUnknownFields", "scope", "versions")
class Customresourcedefinitionspec_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Customresourcedefinitionspec_v1_apiextensions_k8s_io, HasParent {
  override var conversion: CustomResourceConversion_v1_apiextensions_k8s_io? = null
  override var group: String? = null
  override var names: CustomResourceDefinitionNames_v1_apiextensions_k8s_io? = null
  override var preserveUnknownFields: Boolean? = null
  override var scope: String? = null
  override var versions: List<CustomResourceDefinitionVersion_v1_apiextensions_k8s_io>? = null
}

@JsonPropertyOrder("acceptedNames", "conditions", "storedVersions")
class Customresourcedefinitionstatus_v1_apiextensions_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Customresourcedefinitionstatus_v1_apiextensions_k8s_io, HasParent {
  override var acceptedNames: CustomResourceDefinitionNames_v1_apiextensions_k8s_io? = null
  override var conditions: List<CustomResourceDefinitionCondition_v1_apiextensions_k8s_io>? = null
  override var storedVersions: List<String>? = null
}

@JsonPropertyOrder("limits")
class Limitrangespec_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Limitrangespec_v1_core, HasParent {
  override var limits: List<LimitRangeItem_v1_core>? = null
}

@JsonPropertyOrder("maxReplicas", "minReplicas", "scaleTargetRef", "targetCPUUtilizationPercentage")
class Horizontalpodautoscalerspec_v1_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Horizontalpodautoscalerspec_v1_autoscaling, HasParent {
  override var maxReplicas: Int? = null
  override var minReplicas: Int? = null
  override var scaleTargetRef: CrossVersionObjectReference_v1_autoscaling? = null
  override var targetCPUUtilizationPercentage: Int? = null
}

@JsonPropertyOrder("currentCPUUtilizationPercentage", "currentReplicas", "desiredReplicas", "lastScaleTime", "observedGeneration")
class Horizontalpodautoscalerstatus_v1_autoscalingImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Horizontalpodautoscalerstatus_v1_autoscaling, HasParent {
  override var currentCPUUtilizationPercentage: Int? = null
  override var currentReplicas: Int? = null
  override var desiredReplicas: Int? = null
  override var lastScaleTime: Time_v1_meta? = null
  override var observedGeneration: Int? = null
}

@JsonPropertyOrder("metadata", "spec")
class Podtemplatespec_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Podtemplatespec_v1_core, HasParent {
  override var metadata: ObjectMeta_v1_meta? = null
  override var spec: Podspec_v1_core? = null
}

@JsonPropertyOrder("maxUnavailable", "minAvailable", "selector")
class Poddisruptionbudgetspec_v1beta1_policyImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Poddisruptionbudgetspec_v1beta1_policy, HasParent {
  override var maxUnavailable: de.loosetie.k8s.dsl.types.IntOrPercentage? = null
  override var minAvailable: de.loosetie.k8s.dsl.types.IntOrPercentage? = null
  override var selector: LabelSelector_v1_meta? = null
}

@JsonPropertyOrder("currentHealthy", "desiredHealthy", "disruptedPods", "disruptionsAllowed", "expectedPods", "observedGeneration")
class Poddisruptionbudgetstatus_v1beta1_policyImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Poddisruptionbudgetstatus_v1beta1_policy, HasParent {
  override var currentHealthy: Int? = null
  override var desiredHealthy: Int? = null
  override var disruptedPods: Any? = null
  override var disruptionsAllowed: Int? = null
  override var expectedPods: Int? = null
  override var observedGeneration: Int? = null
}

@JsonPropertyOrder("env", "envFrom", "selector", "volumeMounts", "volumes")
class Podpresetspec_v1alpha1_settings_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Podpresetspec_v1alpha1_settings_k8s_io, HasParent {
  override var env: List<EnvVar_v1_core>? = null
  override var envFrom: List<EnvFromSource_v1_core>? = null
  override var selector: LabelSelector_v1_meta? = null
  override var volumeMounts: List<VolumeMount_v1_core>? = null
  override var volumes: List<Volume_v1_core>? = null
}

@JsonPropertyOrder("allowPrivilegeEscalation", "allowedCSIDrivers", "allowedCapabilities", "allowedFlexVolumes", "allowedHostPaths", "allowedProcMountTypes", "allowedUnsafeSysctls", "defaultAddCapabilities", "defaultAllowPrivilegeEscalation", "forbiddenSysctls", "fsGroup", "hostIPC", "hostNetwork", "hostPID", "hostPorts", "privileged", "readOnlyRootFilesystem", "requiredDropCapabilities", "runAsGroup", "runAsUser", "runtimeClass", "seLinux", "supplementalGroups", "volumes")
class Podsecuritypolicyspec_v1beta1_policyImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Podsecuritypolicyspec_v1beta1_policy, HasParent {
  override var allowPrivilegeEscalation: Boolean? = null
  override var allowedCSIDrivers: List<AllowedCSIDriver_v1beta1_policy>? = null
  override var allowedCapabilities: List<String>? = null
  override var allowedFlexVolumes: List<AllowedFlexVolume_v1beta1_policy>? = null
  override var allowedHostPaths: List<AllowedHostPath_v1beta1_policy>? = null
  override var allowedProcMountTypes: List<String>? = null
  override var allowedUnsafeSysctls: List<String>? = null
  override var defaultAddCapabilities: List<String>? = null
  override var defaultAllowPrivilegeEscalation: Boolean? = null
  override var forbiddenSysctls: List<String>? = null
  override var fsGroup: FSGroupStrategyOptions_v1beta1_policy? = null
  override var hostIPC: Boolean? = null
  override var hostNetwork: Boolean? = null
  override var hostPID: Boolean? = null
  override var hostPorts: List<HostPortRange_v1beta1_policy>? = null
  override var privileged: Boolean? = null
  override var readOnlyRootFilesystem: Boolean? = null
  override var requiredDropCapabilities: List<String>? = null
  override var runAsGroup: RunAsGroupStrategyOptions_v1beta1_policy? = null
  override var runAsUser: RunAsUserStrategyOptions_v1beta1_policy? = null
  override var runtimeClass: RuntimeClassStrategyOptions_v1beta1_policy? = null
  override var seLinux: SELinuxStrategyOptions_v1beta1_policy? = null
  override var supplementalGroups: SupplementalGroupsStrategyOptions_v1beta1_policy? = null
  override var volumes: List<String>? = null
}

@JsonPropertyOrder("caBundle", "group", "groupPriorityMinimum", "insecureSkipTLSVerify", "service", "version", "versionPriority")
class Apiservicespec_v1_apiregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Apiservicespec_v1_apiregistration_k8s_io, HasParent {
  override var caBundle: String? = null
  override var group: String? = null
  override var groupPriorityMinimum: Int? = null
  override var insecureSkipTLSVerify: Boolean? = null
  override var service: ServiceReference_v1_apiregistration_k8s_io? = null
  override var version: String? = null
  override var versionPriority: Int? = null
}

@JsonPropertyOrder("conditions")
class Apiservicestatus_v1_apiregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Apiservicestatus_v1_apiregistration_k8s_io, HasParent {
  override var conditions: List<APIServiceCondition_v1_apiregistration_k8s_io>? = null
}

@JsonPropertyOrder("policy", "webhook")
class Auditsinkspec_v1alpha1_auditregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Auditsinkspec_v1alpha1_auditregistration_k8s_io, HasParent {
  override var policy: Policy_v1alpha1_auditregistration_k8s_io? = null
  override var webhook: Webhook_v1alpha1_auditregistration_k8s_io? = null
}

@JsonPropertyOrder("extra", "groups", "request", "uid", "usages", "username")
class Certificatesigningrequestspec_v1beta1_certificates_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Certificatesigningrequestspec_v1beta1_certificates_k8s_io, HasParent {
  override var extra: Any? = null
  override var groups: List<String>? = null
  override var request: String? = null
  override var uid: String? = null
  override var usages: List<String>? = null
  override var username: String? = null
}

@JsonPropertyOrder("certificate", "conditions")
class Certificatesigningrequeststatus_v1beta1_certificates_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Certificatesigningrequeststatus_v1beta1_certificates_k8s_io, HasParent {
  override var certificate: String? = null
  override var conditions: List<CertificateSigningRequestCondition_v1beta1_certificates_k8s_io>? = null
}

@JsonPropertyOrder("acquireTime", "holderIdentity", "leaseDurationSeconds", "leaseTransitions", "renewTime")
class Leasespec_v1_coordination_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Leasespec_v1_coordination_k8s_io, HasParent {
  override var acquireTime: MicroTime_v1_meta? = null
  override var holderIdentity: String? = null
  override var leaseDurationSeconds: Int? = null
  override var leaseTransitions: Int? = null
  override var renewTime: MicroTime_v1_meta? = null
}

@JsonPropertyOrder("extra", "groups", "nonResourceAttributes", "resourceAttributes", "uid", "user")
class Subjectaccessreviewspec_v1_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Subjectaccessreviewspec_v1_authorization_k8s_io, HasParent {
  override var extra: Any? = null
  override var groups: List<String>? = null
  override var nonResourceAttributes: NonResourceAttributes_v1_authorization_k8s_io? = null
  override var resourceAttributes: ResourceAttributes_v1_authorization_k8s_io? = null
  override var uid: String? = null
  override var user: String? = null
}

@JsonPropertyOrder("allowed", "denied", "evaluationError", "reason")
class Subjectaccessreviewstatus_v1_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Subjectaccessreviewstatus_v1_authorization_k8s_io, HasParent {
  override var allowed: Boolean? = null
  override var denied: Boolean? = null
  override var evaluationError: String? = null
  override var reason: String? = null
}

@JsonPropertyOrder("finalizers")
class Namespacespec_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Namespacespec_v1_core, HasParent {
  override var finalizers: List<String>? = null
}

@JsonPropertyOrder("conditions", "phase")
class Namespacestatus_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Namespacestatus_v1_core, HasParent {
  override var conditions: List<NamespaceCondition_v1_core>? = null
  override var phase: String? = null
}

@JsonPropertyOrder("configSource", "externalID", "podCIDR", "podCIDRs", "providerID", "taints", "unschedulable")
class Nodespec_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Nodespec_v1_core, HasParent {
  override var configSource: NodeConfigSource_v1_core? = null
  override var externalID: String? = null
  override var podCIDR: String? = null
  override var podCIDRs: List<String>? = null
  override var providerID: String? = null
  override var taints: List<Taint_v1_core>? = null
  override var unschedulable: Boolean? = null
}

@JsonPropertyOrder("addresses", "allocatable", "capacity", "conditions", "config", "daemonEndpoints", "images", "nodeInfo", "phase", "volumesAttached", "volumesInUse")
class Nodestatus_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Nodestatus_v1_core, HasParent {
  override var addresses: List<NodeAddress_v1_core>? = null
  override var allocatable: Any? = null
  override var capacity: Any? = null
  override var conditions: List<NodeCondition_v1_core>? = null
  override var config: NodeConfigStatus_v1_core? = null
  override var daemonEndpoints: NodeDaemonEndpoints_v1_core? = null
  override var images: List<ContainerImage_v1_core>? = null
  override var nodeInfo: NodeSystemInfo_v1_core? = null
  override var phase: String? = null
  override var volumesAttached: List<AttachedVolume_v1_core>? = null
  override var volumesInUse: List<String>? = null
}

@JsonPropertyOrder("accessModes", "awsElasticBlockStore", "azureDisk", "azureFile", "capacity", "cephfs", "cinder", "claimRef", "csi", "fc", "flexVolume", "flocker", "gcePersistentDisk", "glusterfs", "hostPath", "iscsi", "local", "mountOptions", "nfs", "nodeAffinity", "persistentVolumeReclaimPolicy", "photonPersistentDisk", "portworxVolume", "quobyte", "rbd", "scaleIO", "storageClassName", "storageos", "volumeMode", "vsphereVolume")
class Persistentvolumespec_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Persistentvolumespec_v1_core, HasParent {
  override var accessModes: List<String>? = null
  override var awsElasticBlockStore: AWSElasticBlockStoreVolumeSource_v1_core? = null
  override var azureDisk: AzureDiskVolumeSource_v1_core? = null
  override var azureFile: AzureFilePersistentVolumeSource_v1_core? = null
  override var capacity: de.loosetie.k8s.dsl.types.Capacity? = null
  override var cephfs: CephFSPersistentVolumeSource_v1_core? = null
  override var cinder: CinderPersistentVolumeSource_v1_core? = null
  override var claimRef: ObjectReference_v1_core? = null
  override var csi: CSIPersistentVolumeSource_v1_core? = null
  override var fc: FCVolumeSource_v1_core? = null
  override var flexVolume: FlexPersistentVolumeSource_v1_core? = null
  override var flocker: FlockerVolumeSource_v1_core? = null
  override var gcePersistentDisk: GCEPersistentDiskVolumeSource_v1_core? = null
  override var glusterfs: GlusterfsPersistentVolumeSource_v1_core? = null
  override var hostPath: HostPathVolumeSource_v1_core? = null
  override var iscsi: ISCSIPersistentVolumeSource_v1_core? = null
  override var local: LocalVolumeSource_v1_core? = null
  override var mountOptions: List<String>? = null
  override var nfs: NFSVolumeSource_v1_core? = null
  override var nodeAffinity: VolumeNodeAffinity_v1_core? = null
  override var persistentVolumeReclaimPolicy: String? = null
  override var photonPersistentDisk: PhotonPersistentDiskVolumeSource_v1_core? = null
  override var portworxVolume: PortworxVolumeSource_v1_core? = null
  override var quobyte: QuobyteVolumeSource_v1_core? = null
  override var rbd: RBDPersistentVolumeSource_v1_core? = null
  override var scaleIO: ScaleIOPersistentVolumeSource_v1_core? = null
  override var storageClassName: String? = null
  override var storageos: StorageOSPersistentVolumeSource_v1_core? = null
  override var volumeMode: String? = null
  override var vsphereVolume: VsphereVirtualDiskVolumeSource_v1_core? = null
}

@JsonPropertyOrder("message", "phase", "reason")
class Persistentvolumestatus_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Persistentvolumestatus_v1_core, HasParent {
  override var message: String? = null
  override var phase: String? = null
  override var reason: String? = null
}

@JsonPropertyOrder("hard", "scopeSelector", "scopes")
class Resourcequotaspec_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Resourcequotaspec_v1_core, HasParent {
  override var hard: Map<String, de.loosetie.k8s.dsl.types.DoubleOrString>? = null
  override var scopeSelector: ScopeSelector_v1_core? = null
  override var scopes: List<String>? = null
}

@JsonPropertyOrder("hard", "used")
class Resourcequotastatus_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Resourcequotastatus_v1_core, HasParent {
  override var hard: Any? = null
  override var used: Any? = null
}

@JsonPropertyOrder("nonResourceAttributes", "resourceAttributes")
class Selfsubjectaccessreviewspec_v1_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Selfsubjectaccessreviewspec_v1_authorization_k8s_io, HasParent {
  override var nonResourceAttributes: NonResourceAttributes_v1_authorization_k8s_io? = null
  override var resourceAttributes: ResourceAttributes_v1_authorization_k8s_io? = null
}

@JsonPropertyOrder("namespace")
class Selfsubjectrulesreviewspec_v1_authorization_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Selfsubjectrulesreviewspec_v1_authorization_k8s_io, HasParent {
  override var namespace: String? = null
}

@JsonPropertyOrder("audiences", "boundObjectRef", "expirationSeconds")
class Tokenrequestspec_v1_authentication_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Tokenrequestspec_v1_authentication_k8s_io, HasParent {
  override var audiences: List<String>? = null
  override var boundObjectRef: BoundObjectReference_v1_authentication_k8s_io? = null
  override var expirationSeconds: Int? = null
}

@JsonPropertyOrder("expirationTimestamp", "token")
class Tokenrequeststatus_v1_authentication_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Tokenrequeststatus_v1_authentication_k8s_io, HasParent {
  override var expirationTimestamp: Time_v1_meta? = null
  override var token: String? = null
}

@JsonPropertyOrder("audiences", "token")
class Tokenreviewspec_v1_authentication_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Tokenreviewspec_v1_authentication_k8s_io, HasParent {
  override var audiences: List<String>? = null
  override var token: String? = null
}

@JsonPropertyOrder("audiences", "authenticated", "error", "user")
class Tokenreviewstatus_v1_authentication_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Tokenreviewstatus_v1_authentication_k8s_io, HasParent {
  override var audiences: List<String>? = null
  override var authenticated: Boolean? = null
  override var error: String? = null
  override var user: UserInfo_v1_authentication_k8s_io? = null
}

@JsonPropertyOrder("egress", "ingress", "podSelector", "policyTypes")
class Networkpolicyspec_v1_networking_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Networkpolicyspec_v1_networking_k8s_io, HasParent {
  override var egress: List<NetworkPolicyEgressRule_v1_networking_k8s_io>? = null
  override var ingress: List<NetworkPolicyIngressRule_v1_networking_k8s_io>? = null
  override var podSelector: LabelSelector_v1_meta? = null
  override var policyTypes: List<String>? = null
}

@JsonPropertyOrder("maxUnavailable")
class Rollingupdatedaemonset_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Rollingupdatedaemonset_v1_apps, HasParent {
  override var maxUnavailable: de.loosetie.k8s.dsl.types.IntOrPercentage? = null
}

@JsonPropertyOrder("namespace", "name", "port")
class ServiceReference_v1_apiregistration_k8s_ioImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceReference_v1_apiregistration_k8s_io, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var port: Int? = null
}

@JsonPropertyOrder("rollingUpdate", "type")
class Deploymentstrategy_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Deploymentstrategy_v1_apps, HasParent {
  override var rollingUpdate: Rollingupdatedeployment_v1_apps? = null
  override var type: String? = null
}

@JsonPropertyOrder("name", "containerID", "image", "imageID", "lastState", "ready", "restartCount", "started", "state")
class Containerstatus_v1_coreImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Containerstatus_v1_core, HasParent {
  override var name: String? = null
  override var containerID: String? = null
  override var image: String? = null
  override var imageID: String? = null
  override var lastState: ContainerState_v1_core? = null
  override var ready: Boolean? = null
  override var restartCount: Int? = null
  override var started: Boolean? = null
  override var state: ContainerState_v1_core? = null
}

@JsonPropertyOrder("maxSurge", "maxUnavailable")
class Rollingupdatedeployment_v1_appsImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Rollingupdatedeployment_v1_apps, HasParent {
  override var maxSurge: de.loosetie.k8s.dsl.types.IntOrPercentage? = null
  override var maxUnavailable: de.loosetie.k8s.dsl.types.IntOrPercentage? = null
}