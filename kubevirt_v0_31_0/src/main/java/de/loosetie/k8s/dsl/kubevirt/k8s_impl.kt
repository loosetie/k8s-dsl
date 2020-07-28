package de.loosetie.k8s.dsl.kubevirt

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent

@JsonPropertyOrder("apiVersion", "kind", "name", "preferredVersion", "serverAddressByClientCIDRs", "versions")
class APIGroup_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: APIGroup_v1_, HasParent {
  override var name: String? = null
  override var preferredVersion: GroupVersionForDiscovery_v1_? = null
  override var serverAddressByClientCIDRs: List<ServerAddressByClientCIDR_v1_>? = null
  override var versions: List<GroupVersionForDiscovery_v1_>? = null
}

@JsonPropertyOrder("apiVersion", "kind", "groups")
class APIGroupList_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: APIGroupList_v1_, HasParent {
  override var groups: List<APIGroup_v1_>? = null
}

@JsonPropertyOrder("kind", "name", "categories", "group", "namespaced", "shortNames", "singularName", "storageVersionHash", "verbs", "version")
class APIResource_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: APIResource_v1_, HasParent {
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

@JsonPropertyOrder("apiVersion", "kind", "groupVersion", "resources")
class APIResourceList_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: APIResourceList_v1_, HasParent {
  override var groupVersion: String? = null
  override var resources: List<APIResource_v1_>? = null
}

@JsonPropertyOrder("nodeAffinity", "podAffinity", "podAntiAffinity")
class Affinity_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Affinity_v1_, HasParent {
  override var nodeAffinity: NodeAffinity_v1_? = null
  override var podAffinity: PodAffinity_v1_? = null
  override var podAntiAffinity: PodAntiAffinity_v1_? = null
}

@JsonPropertyOrder("bios", "efi")
class Bootloader_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Bootloader_v1_, HasParent {
  override var bios: Any? = null
  override var efi: EFI_v1_? = null
}

@JsonPropertyOrder("bus", "readonly", "tray")
class CDRomTarget_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CDRomTarget_v1_, HasParent {
  override var bus: String? = null
  override var readonly: Boolean? = null
  override var tray: String? = null
}

@JsonPropertyOrder("cores", "dedicatedCpuPlacement", "features", "isolateEmulatorThread", "model", "sockets", "threads")
class CPU_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CPU_v1_, HasParent {
  override var cores: Long? = null
  override var dedicatedCpuPlacement: Boolean? = null
  override var features: List<CPUFeature_v1_>? = null
  override var isolateEmulatorThread: Boolean? = null
  override var model: String? = null
  override var sockets: Long? = null
  override var threads: Long? = null
}

@JsonPropertyOrder("name", "policy")
class CPUFeature_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CPUFeature_v1_, HasParent {
  override var name: String? = null
  override var policy: String? = null
}

@JsonPropertyOrder("asset", "manufacturer", "serial", "sku", "version")
class Chassis_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Chassis_v1_, HasParent {
  
}

@JsonPropertyOrder("timer", "timezone", "utc")
class Clock_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Clock_v1_, HasParent {
  override var timer: Timer_v1_? = null
  override var timezone: String? = null
  override var utc: ClockOffsetUTC_v1_? = null
}

@JsonPropertyOrder("offsetSeconds")
class ClockOffsetUTC_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ClockOffsetUTC_v1_, HasParent {
  override var offsetSeconds: Int? = null
}

@JsonPropertyOrder("networkData", "networkDataBase64", "networkDataSecretRef", "secretRef", "userData", "userDataBase64")
class CloudInitConfigDriveSource_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CloudInitConfigDriveSource_v1_, HasParent {
  override var networkData: String? = null
  override var networkDataBase64: String? = null
  override var networkDataSecretRef: LocalObjectReference_v1_? = null
  override var secretRef: LocalObjectReference_v1_? = null
  override var userData: String? = null
  override var userDataBase64: String? = null
}

@JsonPropertyOrder("networkData", "networkDataBase64", "networkDataSecretRef", "secretRef", "userData", "userDataBase64")
class CloudInitNoCloudSource_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CloudInitNoCloudSource_v1_, HasParent {
  override var networkData: String? = null
  override var networkDataBase64: String? = null
  override var networkDataSecretRef: LocalObjectReference_v1_? = null
  override var secretRef: LocalObjectReference_v1_? = null
  override var userData: String? = null
  override var userDataBase64: String? = null
}

@JsonPropertyOrder("name", "optional", "volumeLabel")
class ConfigMapVolumeSource_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMapVolumeSource_v1_, HasParent {
  override var name: String? = null
  override var optional: Boolean? = null
  override var volumeLabel: String? = null
}

@JsonPropertyOrder("image", "imagePullPolicy", "imagePullSecret", "path")
class ContainerDiskSource_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ContainerDiskSource_v1_, HasParent {
  override var image: String? = null
  override var imagePullPolicy: String? = null
  override var imagePullSecret: String? = null
  override var path: String? = null
}

@JsonPropertyOrder("bootFileName", "ntpServers", "privateOptions", "tftpServerName")
class DHCPOptions_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DHCPOptions_v1_, HasParent {
  override var bootFileName: String? = null
  override var ntpServers: List<String>? = null
  override var privateOptions: List<DHCPPrivateOptions_v1_>? = null
  override var tftpServerName: String? = null
}

@JsonPropertyOrder("option", "value")
class DHCPPrivateOptions_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DHCPPrivateOptions_v1_, HasParent {
  override var option: Int? = null
  override var value: String? = null
}

@JsonPropertyOrder("name")
class DataVolumeSource_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DataVolumeSource_v1_, HasParent {
  override var name: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "dryRun", "gracePeriodSeconds", "orphanDependents", "preconditions", "propagationPolicy")
class DeleteOptions_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DeleteOptions_v1_, HasParent {
  override var dryRun: List<String>? = null
  override var gracePeriodSeconds: Long? = null
  override var orphanDependents: Boolean? = null
  override var preconditions: Preconditions_v1_? = null
  override var propagationPolicy: String? = null
}

@JsonPropertyOrder("autoattachGraphicsDevice", "autoattachPodInterface", "autoattachSerialConsole", "blockMultiQueue", "disks", "gpus", "inputs", "interfaces", "networkInterfaceMultiqueue", "rng", "watchdog")
class Devices_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Devices_v1_, HasParent {
  override var autoattachGraphicsDevice: Boolean? = null
  override var autoattachPodInterface: Boolean? = null
  override var autoattachSerialConsole: Boolean? = null
  override var blockMultiQueue: Boolean? = null
  override var disks: List<Disk_v1_>? = null
  override var gpus: List<GPU_v1_>? = null
  override var inputs: List<Input_v1_>? = null
  override var interfaces: List<Interface_v1_>? = null
  override var networkInterfaceMultiqueue: Boolean? = null
  override var rng: Any? = null
  override var watchdog: Watchdog_v1_? = null
}

@JsonPropertyOrder("name", "bootOrder", "cache", "cdrom", "dedicatedIOThread", "disk", "floppy", "lun", "serial", "tag")
class Disk_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Disk_v1_, HasParent {
  override var name: String? = null
  override var bootOrder: Int? = null
  override var cache: String? = null
  override var cdrom: CDRomTarget_v1_? = null
  override var dedicatedIOThread: Boolean? = null
  override var disk: DiskTarget_v1_? = null
  override var floppy: FloppyTarget_v1_? = null
  override var lun: LunTarget_v1_? = null
  override var serial: String? = null
  override var tag: String? = null
}

@JsonPropertyOrder("bus", "pciAddress", "readonly")
class DiskTarget_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DiskTarget_v1_, HasParent {
  override var bus: String? = null
  override var pciAddress: String? = null
  override var readonly: Boolean? = null
}

@JsonPropertyOrder("chassis", "clock", "cpu", "devices", "features", "firmware", "ioThreadsPolicy", "machine", "memory", "resources")
class DomainSpec_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DomainSpec_v1_, HasParent {
  override var chassis: Chassis_v1_? = null
  override var clock: Clock_v1_? = null
  override var cpu: CPU_v1_? = null
  override var devices: Devices_v1_? = null
  override var features: Features_v1_? = null
  override var firmware: Firmware_v1_? = null
  override var ioThreadsPolicy: String? = null
  override var machine: Machine_v1_? = null
  override var memory: Memory_v1_? = null
  override var resources: ResourceRequirements_v1_? = null
}

@JsonPropertyOrder("secureBoot")
class EFI_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EFI_v1_, HasParent {
  override var secureBoot: Boolean? = null
}

@JsonPropertyOrder("capacity")
class EmptyDiskSource_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EmptyDiskSource_v1_, HasParent {
  override var capacity: String? = null
}

@JsonPropertyOrder("persistentVolumeClaim")
class EphemeralVolumeSource_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EphemeralVolumeSource_v1_, HasParent {
  override var persistentVolumeClaim: PersistentVolumeClaimVolumeSource_v1_? = null
}

@JsonPropertyOrder("enabled", "endOfInterrupt")
class FeatureAPIC_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FeatureAPIC_v1_, HasParent {
  override var enabled: Boolean? = null
  override var endOfInterrupt: Boolean? = null
}

@JsonPropertyOrder("evmcs", "frequencies", "ipi", "reenlightenment", "relaxed", "reset", "runtime", "spinlocks", "synic", "synictimer", "tlbflush", "vapic", "vendorid", "vpindex")
class FeatureHyperv_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FeatureHyperv_v1_, HasParent {
  override var evmcs: FeatureState_v1_? = null
  override var frequencies: FeatureState_v1_? = null
  override var ipi: FeatureState_v1_? = null
  override var reenlightenment: FeatureState_v1_? = null
  override var relaxed: FeatureState_v1_? = null
  override var reset: FeatureState_v1_? = null
  override var runtime: FeatureState_v1_? = null
  override var spinlocks: FeatureSpinlocks_v1_? = null
  override var synic: FeatureState_v1_? = null
  override var synictimer: FeatureState_v1_? = null
  override var tlbflush: FeatureState_v1_? = null
  override var vapic: FeatureState_v1_? = null
  override var vendorid: FeatureVendorID_v1_? = null
  override var vpindex: FeatureState_v1_? = null
}

@JsonPropertyOrder("enabled", "spinlocks")
class FeatureSpinlocks_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FeatureSpinlocks_v1_, HasParent {
  override var enabled: Boolean? = null
  override var spinlocks: Long? = null
}

@JsonPropertyOrder("enabled")
class FeatureState_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FeatureState_v1_, HasParent {
  override var enabled: Boolean? = null
}

@JsonPropertyOrder("enabled", "vendorid")
class FeatureVendorID_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FeatureVendorID_v1_, HasParent {
  override var enabled: Boolean? = null
  override var vendorid: String? = null
}

@JsonPropertyOrder("acpi", "apic", "hyperv", "smm")
class Features_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Features_v1_, HasParent {
  override var acpi: FeatureState_v1_? = null
  override var apic: FeatureAPIC_v1_? = null
  override var hyperv: FeatureHyperv_v1_? = null
  override var smm: FeatureState_v1_? = null
}

@JsonPropertyOrder("bootloader", "serial", "uuid")
class Firmware_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Firmware_v1_, HasParent {
  override var bootloader: Bootloader_v1_? = null
  override var serial: String? = null
  override var uuid: String? = null
}

@JsonPropertyOrder("readonly", "tray")
class FloppyTarget_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FloppyTarget_v1_, HasParent {
  override var readonly: Boolean? = null
  override var tray: String? = null
}

@JsonPropertyOrder("name", "deviceName")
class GPU_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: GPU_v1_, HasParent {
  override var name: String? = null
  override var deviceName: String? = null
}

@JsonPropertyOrder("groupVersion", "version")
class GroupVersionForDiscovery_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: GroupVersionForDiscovery_v1_, HasParent {
  override var groupVersion: String? = null
  override var version: String? = null
}

@JsonPropertyOrder("present", "tickPolicy")
class HPETTimer_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HPETTimer_v1_, HasParent {
  override var present: Boolean? = null
  override var tickPolicy: String? = null
}

@JsonPropertyOrder("host", "httpHeaders", "path", "scheme")
class HTTPGetAction_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HTTPGetAction_v1_, HasParent {
  override var host: String? = null
  override var httpHeaders: List<HTTPHeader_v1_>? = null
  override var path: String? = null
  override var scheme: String? = null
}

@JsonPropertyOrder("name", "value")
class HTTPHeader_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HTTPHeader_v1_, HasParent {
  override var name: String? = null
  override var value: String? = null
}

@JsonPropertyOrder("capacity", "path", "shared", "type")
class HostDisk_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HostDisk_v1_, HasParent {
  override var capacity: String? = null
  override var path: String? = null
  override var shared: Boolean? = null
  override var type: String? = null
}

@JsonPropertyOrder("pageSize")
class Hugepages_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Hugepages_v1_, HasParent {
  override var pageSize: String? = null
}

@JsonPropertyOrder("present")
class HypervTimer_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HypervTimer_v1_, HasParent {
  override var present: Boolean? = null
}

@JsonPropertyOrder("action")
class I6300ESBWatchdog_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: I6300ESBWatchdog_v1_, HasParent {
  override var action: String? = null
}

@JsonPropertyOrder("name", "bus", "type")
class Input_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Input_v1_, HasParent {
  override var name: String? = null
  override var bus: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("name", "bootOrder", "bridge", "dhcpOptions", "macAddress", "masquerade", "model", "pciAddress", "ports", "slirp", "sriov", "tag")
class Interface_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Interface_v1_, HasParent {
  override var name: String? = null
  override var bootOrder: Int? = null
  override var bridge: Any? = null
  override var dhcpOptions: DHCPOptions_v1_? = null
  override var macAddress: String? = null
  override var masquerade: Any? = null
  override var model: String? = null
  override var pciAddress: String? = null
  override var ports: List<Port_v1_>? = null
  override var slirp: Any? = null
  override var sriov: Any? = null
  override var tag: String? = null
}

@JsonPropertyOrder("present")
class KVMTimer_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: KVMTimer_v1_, HasParent {
  override var present: Boolean? = null
}

@JsonPropertyOrder("matchExpressions", "matchLabels")
class LabelSelector_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LabelSelector_v1_, HasParent {
  override var matchExpressions: List<LabelSelectorRequirement_v1_>? = null
  override var matchLabels: Map<String,String>? = null
}

@JsonPropertyOrder("key", "operator", "values")
class LabelSelectorRequirement_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LabelSelectorRequirement_v1_, HasParent {
  override var key: String? = null
  override var operator: String? = null
  override var values: List<String>? = null
}

@JsonPropertyOrder("continue", "remainingItemCount", "resourceVersion", "selfLink")
class ListMeta_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ListMeta_v1_, HasParent {
  override var `continue`: String? = null
  override var remainingItemCount: Long? = null
  override var resourceVersion: String? = null
  override var selfLink: String? = null
}

@JsonPropertyOrder("name")
class LocalObjectReference_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LocalObjectReference_v1_, HasParent {
  override var name: String? = null
}

@JsonPropertyOrder("bus", "readonly")
class LunTarget_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LunTarget_v1_, HasParent {
  override var bus: String? = null
  override var readonly: Boolean? = null
}

@JsonPropertyOrder("type")
class Machine_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Machine_v1_, HasParent {
  override var type: String? = null
}

@JsonPropertyOrder("apiVersion", "fieldsType", "fieldsV1", "manager", "operation", "time")
class ManagedFieldsEntry_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ManagedFieldsEntry_v1_, HasParent {
  override var apiVersion: String? = null
  override var fieldsType: String? = null
  override var fieldsV1: String? = null
  override var manager: String? = null
  override var operation: String? = null
  override var time: String? = null
}

@JsonPropertyOrder("guest", "hugepages")
class Memory_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Memory_v1_, HasParent {
  override var guest: String? = null
  override var hugepages: Hugepages_v1_? = null
}

@JsonPropertyOrder("default", "networkName")
class MultusNetwork_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MultusNetwork_v1_, HasParent {
  override var default: Boolean? = null
  override var networkName: String? = null
}

@JsonPropertyOrder("name", "multus", "pod")
class Network_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Network_v1_, HasParent {
  override var name: String? = null
  override var multus: MultusNetwork_v1_? = null
  override var pod: PodNetwork_v1_? = null
}

@JsonPropertyOrder("preferredDuringSchedulingIgnoredDuringExecution", "requiredDuringSchedulingIgnoredDuringExecution")
class NodeAffinity_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeAffinity_v1_, HasParent {
  override var preferredDuringSchedulingIgnoredDuringExecution: List<PreferredSchedulingTerm_v1_>? = null
  override var requiredDuringSchedulingIgnoredDuringExecution: NodeSelector_v1_? = null
}

@JsonPropertyOrder("nodeSelectorTerms")
class NodeSelector_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeSelector_v1_, HasParent {
  override var nodeSelectorTerms: List<NodeSelectorTerm_v1_>? = null
}

@JsonPropertyOrder("key", "operator", "values")
class NodeSelectorRequirement_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeSelectorRequirement_v1_, HasParent {
  override var key: String? = null
  override var operator: String? = null
  override var values: List<String>? = null
}

@JsonPropertyOrder("matchExpressions", "matchFields")
class NodeSelectorTerm_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeSelectorTerm_v1_, HasParent {
  override var matchExpressions: List<NodeSelectorRequirement_v1_>? = null
  override var matchFields: List<NodeSelectorRequirement_v1_>? = null
}

@JsonPropertyOrder("namespace", "name", "labels", "annotations", "clusterName", "deletionGracePeriodSeconds", "deletionTimestamp", "finalizers", "generateName", "generation", "managedFields", "ownerReferences", "resourceVersion", "selfLink", "uid")
class ObjectMeta_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ObjectMeta_v1_, HasParent {
  override var namespace: String? = null
  override var name: String? = null
  override var labels: Map<String,String>? = null
  override var annotations: Map<String,String>? = null
  override var clusterName: String? = null
  override var deletionGracePeriodSeconds: Long? = null
  override var deletionTimestamp: String? = null
  override var finalizers: List<String>? = null
  override var generateName: String? = null
  override var generation: Long? = null
  override var managedFields: List<ManagedFieldsEntry_v1_>? = null
  override var ownerReferences: List<OwnerReference_v1_>? = null
  override var resourceVersion: String? = null
  override var selfLink: String? = null
  override var uid: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "name", "blockOwnerDeletion", "controller", "uid")
class OwnerReference_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: OwnerReference_v1_, HasParent {
  override var name: String? = null
  override var blockOwnerDeletion: Boolean? = null
  override var controller: Boolean? = null
  override var uid: String? = null
}

@JsonPropertyOrder("present", "tickPolicy")
class PITTimer_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PITTimer_v1_, HasParent {
  override var present: Boolean? = null
  override var tickPolicy: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class PersistentVolumeClaim_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PersistentVolumeClaim_v1_, HasParent {
  override lateinit var metadata: ObjectMeta_v1_
  override lateinit var spec: PersistentVolumeClaimSpec_v1_
  override var status: PersistentVolumeClaimStatus_v1_? = null
}

@JsonPropertyOrder("message", "reason", "status", "type")
class PersistentVolumeClaimCondition_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PersistentVolumeClaimCondition_v1_, HasParent {
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}

@JsonPropertyOrder("accessModes", "dataSource", "resources", "selector", "storageClassName", "volumeMode", "volumeName")
class PersistentVolumeClaimSpec_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PersistentVolumeClaimSpec_v1_, HasParent {
  override var accessModes: List<String>? = null
  override var dataSource: TypedLocalObjectReference_v1_? = null
  override var resources: ResourceRequirements_v1_? = null
  override var selector: LabelSelector_v1_? = null
  override var storageClassName: String? = null
  override var volumeMode: String? = null
  override var volumeName: String? = null
}

@JsonPropertyOrder("accessModes", "capacity", "conditions", "phase")
class PersistentVolumeClaimStatus_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PersistentVolumeClaimStatus_v1_, HasParent {
  override var accessModes: List<String>? = null
  override var capacity: String? = null
  override var conditions: List<PersistentVolumeClaimCondition_v1_>? = null
  override var phase: String? = null
}

@JsonPropertyOrder("claimName", "readOnly")
class PersistentVolumeClaimVolumeSource_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PersistentVolumeClaimVolumeSource_v1_, HasParent {
  override var claimName: String? = null
  override var readOnly: Boolean? = null
}

@JsonPropertyOrder("preferredDuringSchedulingIgnoredDuringExecution", "requiredDuringSchedulingIgnoredDuringExecution")
class PodAffinity_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodAffinity_v1_, HasParent {
  override var preferredDuringSchedulingIgnoredDuringExecution: List<WeightedPodAffinityTerm_v1_>? = null
  override var requiredDuringSchedulingIgnoredDuringExecution: List<PodAffinityTerm_v1_>? = null
}

@JsonPropertyOrder("labelSelector", "namespaces", "topologyKey")
class PodAffinityTerm_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodAffinityTerm_v1_, HasParent {
  override var labelSelector: LabelSelector_v1_? = null
  override var namespaces: List<String>? = null
  override var topologyKey: String? = null
}

@JsonPropertyOrder("preferredDuringSchedulingIgnoredDuringExecution", "requiredDuringSchedulingIgnoredDuringExecution")
class PodAntiAffinity_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodAntiAffinity_v1_, HasParent {
  override var preferredDuringSchedulingIgnoredDuringExecution: List<WeightedPodAffinityTerm_v1_>? = null
  override var requiredDuringSchedulingIgnoredDuringExecution: List<PodAffinityTerm_v1_>? = null
}

@JsonPropertyOrder("nameservers", "options", "searches")
class PodDNSConfig_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodDNSConfig_v1_, HasParent {
  override var nameservers: List<String>? = null
  override var options: List<PodDNSConfigOption_v1_>? = null
  override var searches: List<String>? = null
}

@JsonPropertyOrder("name", "value")
class PodDNSConfigOption_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodDNSConfigOption_v1_, HasParent {
  override var name: String? = null
  override var value: String? = null
}

@JsonPropertyOrder("vmNetworkCIDR")
class PodNetwork_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodNetwork_v1_, HasParent {
  override var vmNetworkCIDR: String? = null
}

@JsonPropertyOrder("name", "port", "protocol")
class Port_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Port_v1_, HasParent {
  override var name: String? = null
  override var port: Int? = null
  override var protocol: String? = null
}

@JsonPropertyOrder("resourceVersion", "uid")
class Preconditions_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Preconditions_v1_, HasParent {
  override var resourceVersion: String? = null
  override var uid: String? = null
}

@JsonPropertyOrder("preference", "weight")
class PreferredSchedulingTerm_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PreferredSchedulingTerm_v1_, HasParent {
  override var preference: NodeSelectorTerm_v1_? = null
  override var weight: Int? = null
}

@JsonPropertyOrder("failureThreshold", "httpGet", "initialDelaySeconds", "periodSeconds", "successThreshold", "tcpSocket", "timeoutSeconds")
class Probe_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Probe_v1_, HasParent {
  override var failureThreshold: Int? = null
  override var httpGet: HTTPGetAction_v1_? = null
  override var initialDelaySeconds: Int? = null
  override var periodSeconds: Int? = null
  override var successThreshold: Int? = null
  override var tcpSocket: TCPSocketAction_v1_? = null
  override var timeoutSeconds: Int? = null
}

@JsonPropertyOrder("present", "tickPolicy", "track")
class RTCTimer_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RTCTimer_v1_, HasParent {
  override var present: Boolean? = null
  override var tickPolicy: String? = null
  override var track: String? = null
}

@JsonPropertyOrder("limits", "overcommitGuestOverhead", "requests")
class ResourceRequirements_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourceRequirements_v1_, HasParent {
  override var limits: de.loosetie.k8s.dsl.types.CpuMem? = null
  override var overcommitGuestOverhead: Boolean? = null
  override var requests: de.loosetie.k8s.dsl.types.CpuMem? = null
}

@JsonPropertyOrder("apiVersion", "kind", "gracePeriodSeconds")
class RestartOptions_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RestartOptions_v1_, HasParent {
  override var gracePeriodSeconds: Long? = null
}

@JsonPropertyOrder("paths")
class RootPaths_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RootPaths_v1_, HasParent {
  override var paths: List<String>? = null
}

@JsonPropertyOrder("optional", "secretName", "volumeLabel")
class SecretVolumeSource_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SecretVolumeSource_v1_, HasParent {
  override var optional: Boolean? = null
  override var secretName: String? = null
  override var volumeLabel: String? = null
}

@JsonPropertyOrder("clientCIDR", "serverAddress")
class ServerAddressByClientCIDR_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServerAddressByClientCIDR_v1_, HasParent {
  override var clientCIDR: String? = null
  override var serverAddress: String? = null
}

@JsonPropertyOrder("serviceAccountName")
class ServiceAccountVolumeSource_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServiceAccountVolumeSource_v1_, HasParent {
  override var serviceAccountName: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "code", "details", "message", "reason", "status")
class Status_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Status_v1_, HasParent {
  override lateinit var metadata: ListMeta_v1_
  override var code: Int? = null
  override var details: StatusDetails_v1_? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
}

@JsonPropertyOrder("field", "message", "reason")
class StatusCause_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StatusCause_v1_, HasParent {
  override var field: String? = null
  override var message: String? = null
  override var reason: String? = null
}

@JsonPropertyOrder("kind", "name", "causes", "group", "retryAfterSeconds", "uid")
class StatusDetails_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StatusDetails_v1_, HasParent {
  override var kind: String? = null
  override var name: String? = null
  override var causes: List<StatusCause_v1_>? = null
  override var group: String? = null
  override var retryAfterSeconds: Int? = null
  override var uid: String? = null
}

@JsonPropertyOrder("host")
class TCPSocketAction_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: TCPSocketAction_v1_, HasParent {
  override var host: String? = null
}

@JsonPropertyOrder("hpet", "hyperv", "kvm", "pit", "rtc")
class Timer_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Timer_v1_, HasParent {
  override var hpet: HPETTimer_v1_? = null
  override var hyperv: HypervTimer_v1_? = null
  override var kvm: KVMTimer_v1_? = null
  override var pit: PITTimer_v1_? = null
  override var rtc: RTCTimer_v1_? = null
}

@JsonPropertyOrder("effect", "key", "operator", "tolerationSeconds", "value")
class Toleration_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Toleration_v1_, HasParent {
  override var effect: String? = null
  override var key: String? = null
  override var operator: String? = null
  override var tolerationSeconds: Long? = null
  override var value: String? = null
}

@JsonPropertyOrder("kind", "name", "apiGroup")
class TypedLocalObjectReference_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: TypedLocalObjectReference_v1_, HasParent {
  override var kind: String? = null
  override var name: String? = null
  override var apiGroup: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class VirtualMachine_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachine_v1_, HasParent {
  override lateinit var metadata: ObjectMeta_v1_
  override lateinit var spec: VirtualMachineSpec_v1_
  override var status: VirtualMachineStatus_v1_? = null
}

@JsonPropertyOrder("message", "reason", "status", "type")
class VirtualMachineCondition_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineCondition_v1_, HasParent {
  
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class VirtualMachineInstance_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstance_v1_, HasParent {
  override lateinit var metadata: ObjectMeta_v1_
  override lateinit var spec: VirtualMachineInstanceSpec_v1_
  override var status: VirtualMachineInstanceStatus_v1_? = null
}

@JsonPropertyOrder("message", "reason", "status", "type")
class VirtualMachineInstanceCondition_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceCondition_v1_, HasParent {
  
}

@JsonPropertyOrder("diskName", "fileSystemType", "mountPoint", "totalBytes", "usedBytes")
class VirtualMachineInstanceFileSystem_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceFileSystem_v1_, HasParent {
  
}

@JsonPropertyOrder("disks")
class VirtualMachineInstanceFileSystemInfo_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceFileSystemInfo_v1_, HasParent {
  
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "items")
class VirtualMachineInstanceFileSystemList_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceFileSystemList_v1_, HasParent {
  override lateinit var metadata: ListMeta_v1_
  override var items: List<VirtualMachineInstanceFileSystem_v1_>? = null
}

@JsonPropertyOrder("apiVersion", "kind", "fsInfo", "guestAgentVersion", "hostname", "os", "timezone", "userList")
class VirtualMachineInstanceGuestAgentInfo_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceGuestAgentInfo_v1_, HasParent {
  override var fsInfo: VirtualMachineInstanceFileSystemInfo_v1_? = null
  override var guestAgentVersion: String? = null
  override var hostname: String? = null
  override var os: VirtualMachineInstanceGuestOSInfo_v1_? = null
  override var timezone: String? = null
  override var userList: List<VirtualMachineInstanceGuestOSUser_v1_>? = null
}

@JsonPropertyOrder("name", "id", "kernelRelease", "kernelVersion", "machine", "prettyName", "version", "versionId")
class VirtualMachineInstanceGuestOSInfo_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceGuestOSInfo_v1_, HasParent {
  override var name: String? = null
  override var id: String? = null
  override var kernelRelease: String? = null
  override var kernelVersion: String? = null
  override var machine: String? = null
  override var prettyName: String? = null
  override var version: String? = null
  override var versionId: String? = null
}

@JsonPropertyOrder("domain", "loginTime", "userName")
class VirtualMachineInstanceGuestOSUser_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceGuestOSUser_v1_, HasParent {
  
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "items")
class VirtualMachineInstanceGuestOSUserList_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceGuestOSUserList_v1_, HasParent {
  override lateinit var metadata: ListMeta_v1_
  override var items: List<VirtualMachineInstanceGuestOSUser_v1_>? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "items")
class VirtualMachineInstanceList_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceList_v1_, HasParent {
  override lateinit var metadata: ListMeta_v1_
  override var items: List<VirtualMachineInstance_v1_>? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class VirtualMachineInstanceMigration_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceMigration_v1_, HasParent {
  override lateinit var metadata: ObjectMeta_v1_
  override lateinit var spec: VirtualMachineInstanceMigrationSpec_v1_
  override var status: VirtualMachineInstanceMigrationStatus_v1_? = null
}

@JsonPropertyOrder("message", "reason", "status", "type")
class VirtualMachineInstanceMigrationCondition_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceMigrationCondition_v1_, HasParent {
  
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "items")
class VirtualMachineInstanceMigrationList_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceMigrationList_v1_, HasParent {
  override lateinit var metadata: ListMeta_v1_
  override var items: List<VirtualMachineInstanceMigration_v1_>? = null
}

@JsonPropertyOrder("vmiName")
class VirtualMachineInstanceMigrationSpec_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceMigrationSpec_v1_, HasParent {
  override var vmiName: String? = null
}

@JsonPropertyOrder("abortRequested", "abortStatus", "completed", "endTimestamp", "failed", "migrationUid", "sourceNode", "startTimestamp", "targetDirectMigrationNodePorts", "targetNode", "targetNodeAddress", "targetNodeDomainDetected", "targetPod")
class VirtualMachineInstanceMigrationState_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceMigrationState_v1_, HasParent {
  override var abortRequested: Boolean? = null
  override var abortStatus: String? = null
  override var completed: Boolean? = null
  override var endTimestamp: String? = null
  override var failed: Boolean? = null
  override var migrationUid: String? = null
  override var sourceNode: String? = null
  override var startTimestamp: String? = null
  override var targetDirectMigrationNodePorts: Map<String, Int>? = null
  override var targetNode: String? = null
  override var targetNodeAddress: String? = null
  override var targetNodeDomainDetected: Boolean? = null
  override var targetPod: String? = null
}

@JsonPropertyOrder("conditions", "phase")
class VirtualMachineInstanceMigrationStatus_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceMigrationStatus_v1_, HasParent {
  
}

@JsonPropertyOrder("name", "interfaceName", "ipAddress", "ipAddresses", "mac")
class VirtualMachineInstanceNetworkInterface_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceNetworkInterface_v1_, HasParent {
  override var name: String? = null
  override var interfaceName: String? = null
  override var ipAddress: String? = null
  override var ipAddresses: List<String>? = null
  override var mac: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec")
class VirtualMachineInstancePreset_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstancePreset_v1_, HasParent {
  override lateinit var metadata: ObjectMeta_v1_
  override lateinit var spec: VirtualMachineInstancePresetSpec_v1_
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "items")
class VirtualMachineInstancePresetList_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstancePresetList_v1_, HasParent {
  override lateinit var metadata: ListMeta_v1_
  override var items: List<VirtualMachineInstancePreset_v1_>? = null
}

@JsonPropertyOrder("domain", "selector")
class VirtualMachineInstancePresetSpec_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstancePresetSpec_v1_, HasParent {
  override var domain: DomainSpec_v1_? = null
  override var selector: LabelSelector_v1_? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class VirtualMachineInstanceReplicaSet_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceReplicaSet_v1_, HasParent {
  override lateinit var metadata: ObjectMeta_v1_
  override lateinit var spec: VirtualMachineInstanceReplicaSetSpec_v1_
  override var status: VirtualMachineInstanceReplicaSetStatus_v1_? = null
}

@JsonPropertyOrder("message", "reason", "status", "type")
class VirtualMachineInstanceReplicaSetCondition_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceReplicaSetCondition_v1_, HasParent {
  
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "items")
class VirtualMachineInstanceReplicaSetList_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceReplicaSetList_v1_, HasParent {
  override lateinit var metadata: ListMeta_v1_
  override var items: List<VirtualMachineInstanceReplicaSet_v1_>? = null
}

@JsonPropertyOrder("paused", "replicas", "selector", "template")
class VirtualMachineInstanceReplicaSetSpec_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceReplicaSetSpec_v1_, HasParent {
  override var paused: Boolean? = null
  override var replicas: Int? = null
  override var selector: LabelSelector_v1_? = null
  override var template: VirtualMachineInstanceTemplateSpec_v1_? = null
}

@JsonPropertyOrder("conditions", "labelSelector", "readyReplicas", "replicas")
class VirtualMachineInstanceReplicaSetStatus_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceReplicaSetStatus_v1_, HasParent {
  override var conditions: List<VirtualMachineInstanceReplicaSetCondition_v1_>? = null
  override var labelSelector: String? = null
  override var readyReplicas: Int? = null
  override var replicas: Int? = null
}

@JsonPropertyOrder("affinity", "dnsConfig", "dnsPolicy", "domain", "evictionStrategy", "hostname", "livenessProbe", "networks", "nodeSelector", "priorityClassName", "readinessProbe", "schedulerName", "subdomain", "terminationGracePeriodSeconds", "tolerations", "volumes")
class VirtualMachineInstanceSpec_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceSpec_v1_, HasParent {
  override var affinity: Affinity_v1_? = null
  override var dnsConfig: PodDNSConfig_v1_? = null
  override var dnsPolicy: String? = null
  override var domain: DomainSpec_v1_? = null
  override var evictionStrategy: String? = null
  override var hostname: String? = null
  override var livenessProbe: Probe_v1_? = null
  override var networks: List<Network_v1_>? = null
  override var nodeSelector: Map<String,String>? = null
  override var priorityClassName: String? = null
  override var readinessProbe: Probe_v1_? = null
  override var schedulerName: String? = null
  override var subdomain: String? = null
  override var terminationGracePeriodSeconds: Long? = null
  override var tolerations: List<Toleration_v1_>? = null
  override var volumes: List<Volume_v1_>? = null
}

@JsonPropertyOrder("activePods", "conditions", "guestOSInfo", "interfaces", "migrationMethod", "migrationState", "nodeName", "phase", "qosClass", "reason")
class VirtualMachineInstanceStatus_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceStatus_v1_, HasParent {
  override var activePods: Map<String,String>? = null
  override var conditions: List<VirtualMachineInstanceCondition_v1_>? = null
  override var guestOSInfo: VirtualMachineInstanceGuestOSInfo_v1_? = null
  override var interfaces: List<VirtualMachineInstanceNetworkInterface_v1_>? = null
  override var migrationMethod: String? = null
  override var migrationState: VirtualMachineInstanceMigrationState_v1_? = null
  override var nodeName: String? = null
  override var phase: String? = null
  override var qosClass: String? = null
  override var reason: String? = null
}

@JsonPropertyOrder("metadata", "spec")
class VirtualMachineInstanceTemplateSpec_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineInstanceTemplateSpec_v1_, HasParent {
  override var metadata: ObjectMeta_v1_? = null
  override var spec: VirtualMachineInstanceSpec_v1_? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "items")
class VirtualMachineList_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineList_v1_, HasParent {
  override lateinit var metadata: ListMeta_v1_
  override var items: List<VirtualMachine_v1_>? = null
}

@JsonPropertyOrder("dataVolumeTemplates", "runStrategy", "running", "template")
class VirtualMachineSpec_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineSpec_v1_, HasParent {
  override var dataVolumeTemplates: List<DataVolume_v1alpha1_>? = null
  override var runStrategy: String? = null
  override var running: Boolean? = null
  override var template: VirtualMachineInstanceTemplateSpec_v1_? = null
}

@JsonPropertyOrder("action", "data", "uid")
class VirtualMachineStateChangeRequest_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineStateChangeRequest_v1_, HasParent {
  override var action: String? = null
  override var data: Map<String,String>? = null
  override var uid: String? = null
}

@JsonPropertyOrder("conditions", "created", "ready", "snapshotInProgress", "stateChangeRequests")
class VirtualMachineStatus_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineStatus_v1_, HasParent {
  override var conditions: List<VirtualMachineCondition_v1_>? = null
  override var created: Boolean? = null
  override var ready: Boolean? = null
  override var snapshotInProgress: String? = null
  override var stateChangeRequests: List<VirtualMachineStateChangeRequest_v1_>? = null
}

@JsonPropertyOrder("name", "cloudInitConfigDrive", "cloudInitNoCloud", "configMap", "containerDisk", "dataVolume", "emptyDisk", "ephemeral", "hostDisk", "persistentVolumeClaim", "secret", "serviceAccount")
class Volume_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Volume_v1_, HasParent {
  override var name: String? = null
  override var cloudInitConfigDrive: CloudInitConfigDriveSource_v1_? = null
  override var cloudInitNoCloud: CloudInitNoCloudSource_v1_? = null
  override var configMap: ConfigMapVolumeSource_v1_? = null
  override var containerDisk: ContainerDiskSource_v1_? = null
  override var dataVolume: DataVolumeSource_v1_? = null
  override var emptyDisk: EmptyDiskSource_v1_? = null
  override var ephemeral: EphemeralVolumeSource_v1_? = null
  override var hostDisk: HostDisk_v1_? = null
  override var persistentVolumeClaim: PersistentVolumeClaimVolumeSource_v1_? = null
  override var secret: SecretVolumeSource_v1_? = null
  override var serviceAccount: ServiceAccountVolumeSource_v1_? = null
}

@JsonPropertyOrder("object", "type")
class WatchEvent_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WatchEvent_v1_, HasParent {
  override var `object`: Any? = null
  override var type: String? = null
}

@JsonPropertyOrder("name", "i6300esb")
class Watchdog_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Watchdog_v1_, HasParent {
  override var name: String? = null
  override var i6300esb: I6300ESBWatchdog_v1_? = null
}

@JsonPropertyOrder("podAffinityTerm", "weight")
class WeightedPodAffinityTerm_v1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WeightedPodAffinityTerm_v1_, HasParent {
  override var podAffinityTerm: PodAffinityTerm_v1_? = null
  override var weight: Int? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class DataVolume_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DataVolume_v1alpha1_, HasParent {
  override lateinit var metadata: ObjectMeta_v1_
  override lateinit var spec: DataVolumeSpec_v1alpha1_
  override var status: DataVolumeStatus_v1alpha1_? = null
}

@JsonPropertyOrder("blank", "http", "pvc", "registry", "s3", "upload")
class DataVolumeSource_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DataVolumeSource_v1alpha1_, HasParent {
  
}

@JsonPropertyOrder("certConfigMap", "secretRef", "url")
class DataVolumeSourceHTTP_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DataVolumeSourceHTTP_v1alpha1_, HasParent {
  override var certConfigMap: String? = null
  override var secretRef: String? = null
  override var url: String? = null
}

@JsonPropertyOrder("namespace", "name")
class DataVolumeSourcePVC_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DataVolumeSourcePVC_v1alpha1_, HasParent {
  
}

@JsonPropertyOrder("certConfigMap", "secretRef", "url")
class DataVolumeSourceRegistry_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DataVolumeSourceRegistry_v1alpha1_, HasParent {
  override var certConfigMap: String? = null
  override var secretRef: String? = null
  override var url: String? = null
}

@JsonPropertyOrder("secretRef", "url")
class DataVolumeSourceS3_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DataVolumeSourceS3_v1alpha1_, HasParent {
  override var secretRef: String? = null
  override var url: String? = null
}

@JsonPropertyOrder("contentType", "pvc", "source")
class DataVolumeSpec_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DataVolumeSpec_v1alpha1_, HasParent {
  override var contentType: String? = null
  override var pvc: PersistentVolumeClaimSpec_v1_? = null
  override var source: DataVolumeSource_v1alpha1_? = null
}

@JsonPropertyOrder("phase", "progress")
class DataVolumeStatus_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DataVolumeStatus_v1alpha1_, HasParent {
  override var phase: String? = null
  override var progress: String? = null
}

@JsonPropertyOrder("virtualMachine")
class SourceSpec_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SourceSpec_v1alpha1_, HasParent {
  
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class VirtualMachineSnapshot_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineSnapshot_v1alpha1_, HasParent {
  override lateinit var metadata: ObjectMeta_v1_
  override lateinit var spec: VirtualMachineSnapshotSpec_v1alpha1_
  override var status: VirtualMachineSnapshotStatus_v1alpha1_? = null
}

@JsonPropertyOrder("message", "reason", "status", "type")
class VirtualMachineSnapshotCondition_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineSnapshotCondition_v1alpha1_, HasParent {
  
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class VirtualMachineSnapshotContent_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineSnapshotContent_v1alpha1_, HasParent {
  override lateinit var metadata: ObjectMeta_v1_
  override lateinit var spec: VirtualMachineSnapshotContentSpec_v1alpha1_
  override var status: VirtualMachineSnapshotContentStatus_v1alpha1_? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "items")
class VirtualMachineSnapshotContentList_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineSnapshotContentList_v1alpha1_, HasParent {
  override lateinit var metadata: ListMeta_v1_
  override var items: List<VirtualMachineSnapshotContent_v1alpha1_>? = null
}

@JsonPropertyOrder("source", "virtualMachineSnapshotName", "volumeBackups")
class VirtualMachineSnapshotContentSpec_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineSnapshotContentSpec_v1alpha1_, HasParent {
  
}

@JsonPropertyOrder("creationTime", "error", "readyToUse", "volumeSnapshotStatus")
class VirtualMachineSnapshotContentStatus_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineSnapshotContentStatus_v1alpha1_, HasParent {
  
}

@JsonPropertyOrder("message", "time")
class VirtualMachineSnapshotError_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineSnapshotError_v1alpha1_, HasParent {
  
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "items")
class VirtualMachineSnapshotList_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineSnapshotList_v1alpha1_, HasParent {
  override lateinit var metadata: ListMeta_v1_
  override var items: List<VirtualMachineSnapshot_v1alpha1_>? = null
}

@JsonPropertyOrder("deletionPolicy", "source")
class VirtualMachineSnapshotSpec_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineSnapshotSpec_v1alpha1_, HasParent {
  
}

@JsonPropertyOrder("conditions", "creationTime", "error", "readyToUse", "virtualMachineSnapshotContentName")
class VirtualMachineSnapshotStatus_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VirtualMachineSnapshotStatus_v1alpha1_, HasParent {
  
}

@JsonPropertyOrder("diskName", "persistentVolumeClaim", "volumeSnapshotName")
class VolumeBackup_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeBackup_v1alpha1_, HasParent {
  
}

@JsonPropertyOrder("creationTime", "error", "readyToUse", "volumeSnapshotName")
class VolumeSnapshotStatus_v1alpha1_Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeSnapshotStatus_v1alpha1_, HasParent {
  
}