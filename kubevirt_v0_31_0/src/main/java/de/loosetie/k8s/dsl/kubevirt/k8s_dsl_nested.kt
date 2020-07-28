package de.loosetie.k8s.dsl.kubevirt

import de.loosetie.k8s.dsl.K8sDslMarker

/** preferredVersion is the version preferred by the API server, which probably is the storage version. */
@K8sDslMarker
fun APIGroup.preferredVersion(init: GroupVersionForDiscovery.() -> Unit) {
  this as APIGroup_v1_Impl
  GroupVersionForDiscovery_v1_Impl(this)
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
  this as APIGroup_v1_Impl
  ServerAddressByClientCIDR_v1_Impl(this)
    .also { serverAddressByClientCIDRs = serverAddressByClientCIDRs?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** versions are the versions supported in this group. */
@K8sDslMarker
fun APIGroup.versions(init: GroupVersionForDiscovery.() -> Unit) {
  this as APIGroup_v1_Impl
  GroupVersionForDiscovery_v1_Impl(this)
    .also { versions = versions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** groups is a list of APIGroup. */
@K8sDslMarker
fun APIGroupList.groups(init: APIGroup.() -> Unit) {
  this as APIGroupList_v1_Impl
  APIGroup_v1_Impl(this)
    .also { groups = groups?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** resources contains the name of the resources and if they are namespaced. */
@K8sDslMarker
fun APIResourceList.resources(init: APIResource.() -> Unit) {
  this as APIResourceList_v1_Impl
  APIResource_v1_Impl(this)
    .also { resources = resources?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Describes node affinity scheduling rules for the pod. */
@K8sDslMarker
fun Affinity.nodeAffinity(init: NodeAffinity.() -> Unit) {
  this as Affinity_v1_Impl
  NodeAffinity_v1_Impl(this)
    .also { nodeAffinity = it }
    .apply(init)
}

/** Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)). */
@K8sDslMarker
fun Affinity.podAffinity(init: PodAffinity.() -> Unit) {
  this as Affinity_v1_Impl
  PodAffinity_v1_Impl(this)
    .also { podAffinity = it }
    .apply(init)
}

/** Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other
pod(s)). */
@K8sDslMarker
fun Affinity.podAntiAffinity(init: PodAntiAffinity.() -> Unit) {
  this as Affinity_v1_Impl
  PodAntiAffinity_v1_Impl(this)
    .also { podAntiAffinity = it }
    .apply(init)
}

/** If set, EFI will be used instead of BIOS. */
@K8sDslMarker
fun Bootloader.efi(init: EFI.() -> Unit) {
  this as Bootloader_v1_Impl
  EFI_v1_Impl(this)
    .also { efi = it }
    .apply(init)
}

/** Features specifies the CPU features list inside the VMI. */
@K8sDslMarker
fun CPU.features(init: CPUFeature.() -> Unit) {
  this as CPU_v1_Impl
  CPUFeature_v1_Impl(this)
    .also { features = features?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Timer specifies whih timers are attached to the vmi. */
@K8sDslMarker
fun Clock.timer(init: Timer.() -> Unit) {
  this as Clock_v1_Impl
  Timer_v1_Impl(this)
    .also { timer = it }
    .apply(init)
}

/** UTC sets the guest clock to UTC on each boot. If an offset is specified, guest changes to the clock will be kept during
reboots and are not reset. */
@K8sDslMarker
fun Clock.utc(init: ClockOffsetUTC.() -> Unit) {
  this as Clock_v1_Impl
  ClockOffsetUTC_v1_Impl(this)
    .also { utc = it }
    .apply(init)
}

/** NetworkDataSecretRef references a k8s secret that contains config drive networkdata. */
@K8sDslMarker
fun CloudInitConfigDriveSource.networkDataSecretRef(init: LocalObjectReference.() -> Unit) {
  this as CloudInitConfigDriveSource_v1_Impl
  LocalObjectReference_v1_Impl(this)
    .also { networkDataSecretRef = it }
    .apply(init)
}

/** UserDataSecretRef references a k8s secret that contains config drive userdata. */
@K8sDslMarker
fun CloudInitConfigDriveSource.secretRef(init: LocalObjectReference.() -> Unit) {
  this as CloudInitConfigDriveSource_v1_Impl
  LocalObjectReference_v1_Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** NetworkDataSecretRef references a k8s secret that contains NoCloud networkdata. */
@K8sDslMarker
fun CloudInitNoCloudSource.networkDataSecretRef(init: LocalObjectReference.() -> Unit) {
  this as CloudInitNoCloudSource_v1_Impl
  LocalObjectReference_v1_Impl(this)
    .also { networkDataSecretRef = it }
    .apply(init)
}

/** UserDataSecretRef references a k8s secret that contains NoCloud userdata. */
@K8sDslMarker
fun CloudInitNoCloudSource.secretRef(init: LocalObjectReference.() -> Unit) {
  this as CloudInitNoCloudSource_v1_Impl
  LocalObjectReference_v1_Impl(this)
    .also { secretRef = it }
    .apply(init)
}

/** If specified will pass extra DHCP options for private use, range: 224-254 */
@K8sDslMarker
fun DHCPOptions.privateOptions(init: DHCPPrivateOptions.() -> Unit) {
  this as DHCPOptions_v1_Impl
  DHCPPrivateOptions_v1_Impl(this)
    .also { privateOptions = privateOptions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Must be fulfilled before a deletion is carried out. If not possible, a 409 Conflict status will be returned. */
@K8sDslMarker
fun DeleteOptions.preconditions(init: Preconditions.() -> Unit) {
  this as DeleteOptions_v1_Impl
  Preconditions_v1_Impl(this)
    .also { preconditions = it }
    .apply(init)
}

/** Disks describes disks, cdroms, floppy and luns which are connected to the vmi. */
@K8sDslMarker
fun Devices.disks(init: Disk.() -> Unit) {
  this as Devices_v1_Impl
  Disk_v1_Impl(this)
    .also { disks = disks?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Whether to attach a GPU device to the vmi. */
@K8sDslMarker
fun Devices.gpus(init: GPU.() -> Unit) {
  this as Devices_v1_Impl
  GPU_v1_Impl(this)
    .also { gpus = gpus?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Inputs describe input devices */
@K8sDslMarker
fun Devices.inputs(init: Input.() -> Unit) {
  this as Devices_v1_Impl
  Input_v1_Impl(this)
    .also { inputs = inputs?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Interfaces describe network interfaces which are added to the vmi. */
@K8sDslMarker
fun Devices.interfaces(init: Interface.() -> Unit) {
  this as Devices_v1_Impl
  Interface_v1_Impl(this)
    .also { interfaces = interfaces?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Watchdog describes a watchdog device which can be added to the vmi. */
@K8sDslMarker
fun Devices.watchdog(init: Watchdog.() -> Unit) {
  this as Devices_v1_Impl
  Watchdog_v1_Impl(this)
    .also { watchdog = it }
    .apply(init)
}

/** Attach a volume as a cdrom to the vmi. */
@K8sDslMarker
fun Disk.cdrom(init: CDRomTarget.() -> Unit) {
  this as Disk_v1_Impl
  CDRomTarget_v1_Impl(this)
    .also { cdrom = it }
    .apply(init)
}

/** Attach a volume as a disk to the vmi. */
@K8sDslMarker
fun Disk.disk(init: DiskTarget.() -> Unit) {
  this as Disk_v1_Impl
  DiskTarget_v1_Impl(this)
    .also { disk = it }
    .apply(init)
}

/** Attach a volume as a floppy to the vmi. */
@K8sDslMarker
fun Disk.floppy(init: FloppyTarget.() -> Unit) {
  this as Disk_v1_Impl
  FloppyTarget_v1_Impl(this)
    .also { floppy = it }
    .apply(init)
}

/** Attach a volume as a LUN to the vmi. */
@K8sDslMarker
fun Disk.lun(init: LunTarget.() -> Unit) {
  this as Disk_v1_Impl
  LunTarget_v1_Impl(this)
    .also { lun = it }
    .apply(init)
}

/** Chassis specifies the chassis info passed to the domain. */
@K8sDslMarker
fun DomainSpec.chassis(init: Chassis.() -> Unit) {
  this as DomainSpec_v1_Impl
  Chassis_v1_Impl(this)
    .also { chassis = it }
    .apply(init)
}

/** Clock sets the clock and timers of the vmi. */
@K8sDslMarker
fun DomainSpec.clock(init: Clock.() -> Unit) {
  this as DomainSpec_v1_Impl
  Clock_v1_Impl(this)
    .also { clock = it }
    .apply(init)
}

/** CPU allow specified the detailed CPU topology inside the vmi. */
@K8sDslMarker
fun DomainSpec.cpu(init: CPU.() -> Unit) {
  this as DomainSpec_v1_Impl
  CPU_v1_Impl(this)
    .also { cpu = it }
    .apply(init)
}

/** Devices allows adding disks, network interfaces, and others */
@K8sDslMarker
fun DomainSpec.devices(init: Devices.() -> Unit) {
  this as DomainSpec_v1_Impl
  Devices_v1_Impl(this)
    .also { devices = it }
    .apply(init)
}

/** Features like acpi, apic, hyperv, smm. */
@K8sDslMarker
fun DomainSpec.features(init: Features.() -> Unit) {
  this as DomainSpec_v1_Impl
  Features_v1_Impl(this)
    .also { features = it }
    .apply(init)
}

/** Firmware. */
@K8sDslMarker
fun DomainSpec.firmware(init: Firmware.() -> Unit) {
  this as DomainSpec_v1_Impl
  Firmware_v1_Impl(this)
    .also { firmware = it }
    .apply(init)
}

/** Machine type. */
@K8sDslMarker
fun DomainSpec.machine(init: Machine.() -> Unit) {
  this as DomainSpec_v1_Impl
  Machine_v1_Impl(this)
    .also { machine = it }
    .apply(init)
}

/** Memory allow specifying the VMI memory features. */
@K8sDslMarker
fun DomainSpec.memory(init: Memory.() -> Unit) {
  this as DomainSpec_v1_Impl
  Memory_v1_Impl(this)
    .also { memory = it }
    .apply(init)
}

/** Resources describes the Compute Resources required by this vmi. */
@K8sDslMarker
fun DomainSpec.resources(init: ResourceRequirements.() -> Unit) {
  this as DomainSpec_v1_Impl
  ResourceRequirements_v1_Impl(this)
    .also { resources = it }
    .apply(init)
}

/** PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. Directly
attached to the vmi via qemu. More info: 
                   
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
@K8sDslMarker
fun EphemeralVolumeSource.persistentVolumeClaim(init: PersistentVolumeClaimVolumeSource.() -> Unit) {
  this as EphemeralVolumeSource_v1_Impl
  PersistentVolumeClaimVolumeSource_v1_Impl(this)
    .also { persistentVolumeClaim = it }
    .apply(init)
}

/** EVMCS Speeds up L2 vmexits, but disables other virtualization features. Requires vapic. Defaults to the machine type
setting. */
@K8sDslMarker
fun FeatureHyperv.evmcs(init: FeatureState.() -> Unit) {
  this as FeatureHyperv_v1_Impl
  FeatureState_v1_Impl(this)
    .also { evmcs = it }
    .apply(init)
}

/** Frequencies improves the TSC clock source handling for Hyper-V on KVM. Defaults to the machine type setting. */
@K8sDslMarker
fun FeatureHyperv.frequencies(init: FeatureState.() -> Unit) {
  this as FeatureHyperv_v1_Impl
  FeatureState_v1_Impl(this)
    .also { frequencies = it }
    .apply(init)
}

/** IPI improves performances in overcommited environments. Requires vpindex. Defaults to the machine type setting. */
@K8sDslMarker
fun FeatureHyperv.ipi(init: FeatureState.() -> Unit) {
  this as FeatureHyperv_v1_Impl
  FeatureState_v1_Impl(this)
    .also { ipi = it }
    .apply(init)
}

/** Reenlightenment enables the notifications on TSC frequency changes. Defaults to the machine type setting. */
@K8sDslMarker
fun FeatureHyperv.reenlightenment(init: FeatureState.() -> Unit) {
  this as FeatureHyperv_v1_Impl
  FeatureState_v1_Impl(this)
    .also { reenlightenment = it }
    .apply(init)
}

/** Relaxed instructs the guest OS to disable watchdog timeouts. Defaults to the machine type setting. */
@K8sDslMarker
fun FeatureHyperv.relaxed(init: FeatureState.() -> Unit) {
  this as FeatureHyperv_v1_Impl
  FeatureState_v1_Impl(this)
    .also { relaxed = it }
    .apply(init)
}

/** Reset enables Hyperv reboot/reset for the vmi. Requires synic. Defaults to the machine type setting. */
@K8sDslMarker
fun FeatureHyperv.reset(init: FeatureState.() -> Unit) {
  this as FeatureHyperv_v1_Impl
  FeatureState_v1_Impl(this)
    .also { reset = it }
    .apply(init)
}

/** Runtime improves the time accounting to improve scheduling in the guest. Defaults to the machine type setting. */
@K8sDslMarker
fun FeatureHyperv.runtime(init: FeatureState.() -> Unit) {
  this as FeatureHyperv_v1_Impl
  FeatureState_v1_Impl(this)
    .also { runtime = it }
    .apply(init)
}

/** Spinlocks allows to configure the spinlock retry attempts. */
@K8sDslMarker
fun FeatureHyperv.spinlocks(init: FeatureSpinlocks.() -> Unit) {
  this as FeatureHyperv_v1_Impl
  FeatureSpinlocks_v1_Impl(this)
    .also { spinlocks = it }
    .apply(init)
}

/** SyNIC enables the Synthetic Interrupt Controller. Defaults to the machine type setting. */
@K8sDslMarker
fun FeatureHyperv.synic(init: FeatureState.() -> Unit) {
  this as FeatureHyperv_v1_Impl
  FeatureState_v1_Impl(this)
    .also { synic = it }
    .apply(init)
}

/** SyNICTimer enables Synthetic Interrupt Controller Timers, reducing CPU load. Defaults to the machine type setting. */
@K8sDslMarker
fun FeatureHyperv.synictimer(init: FeatureState.() -> Unit) {
  this as FeatureHyperv_v1_Impl
  FeatureState_v1_Impl(this)
    .also { synictimer = it }
    .apply(init)
}

/** TLBFlush improves performances in overcommited environments. Requires vpindex. Defaults to the machine type setting. */
@K8sDslMarker
fun FeatureHyperv.tlbflush(init: FeatureState.() -> Unit) {
  this as FeatureHyperv_v1_Impl
  FeatureState_v1_Impl(this)
    .also { tlbflush = it }
    .apply(init)
}

/** VAPIC improves the paravirtualized handling of interrupts. Defaults to the machine type setting. */
@K8sDslMarker
fun FeatureHyperv.vapic(init: FeatureState.() -> Unit) {
  this as FeatureHyperv_v1_Impl
  FeatureState_v1_Impl(this)
    .also { vapic = it }
    .apply(init)
}

/** VendorID allows setting the hypervisor vendor id. Defaults to the machine type setting. */
@K8sDslMarker
fun FeatureHyperv.vendorid(init: FeatureVendorID.() -> Unit) {
  this as FeatureHyperv_v1_Impl
  FeatureVendorID_v1_Impl(this)
    .also { vendorid = it }
    .apply(init)
}

/** VPIndex enables the Virtual Processor Index to help windows identifying virtual processors. Defaults to the machine type
setting. */
@K8sDslMarker
fun FeatureHyperv.vpindex(init: FeatureState.() -> Unit) {
  this as FeatureHyperv_v1_Impl
  FeatureState_v1_Impl(this)
    .also { vpindex = it }
    .apply(init)
}

/** ACPI enables/disables ACPI insidejsondata guest. Defaults to enabled. */
@K8sDslMarker
fun Features.acpi(init: FeatureState.() -> Unit) {
  this as Features_v1_Impl
  FeatureState_v1_Impl(this)
    .also { acpi = it }
    .apply(init)
}

/** Defaults to the machine type setting. */
@K8sDslMarker
fun Features.apic(init: FeatureAPIC.() -> Unit) {
  this as Features_v1_Impl
  FeatureAPIC_v1_Impl(this)
    .also { apic = it }
    .apply(init)
}

/** Defaults to the machine type setting. */
@K8sDslMarker
fun Features.hyperv(init: FeatureHyperv.() -> Unit) {
  this as Features_v1_Impl
  FeatureHyperv_v1_Impl(this)
    .also { hyperv = it }
    .apply(init)
}

/** SMM enables/disables System Management Mode. TSEG not yet implemented. */
@K8sDslMarker
fun Features.smm(init: FeatureState.() -> Unit) {
  this as Features_v1_Impl
  FeatureState_v1_Impl(this)
    .also { smm = it }
    .apply(init)
}

/** Settings to control the bootloader that is used. */
@K8sDslMarker
fun Firmware.bootloader(init: Bootloader.() -> Unit) {
  this as Firmware_v1_Impl
  Bootloader_v1_Impl(this)
    .also { bootloader = it }
    .apply(init)
}

/** Custom headers to set in the request. HTTP allows repeated headers. */
@K8sDslMarker
fun HTTPGetAction.httpHeaders(init: HTTPHeader.() -> Unit) {
  this as HTTPGetAction_v1_Impl
  HTTPHeader_v1_Impl(this)
    .also { httpHeaders = httpHeaders?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** If specified the network interface will pass additional DHCP options to the VMI */
@K8sDslMarker
fun Interface.dhcpOptions(init: DHCPOptions.() -> Unit) {
  this as Interface_v1_Impl
  DHCPOptions_v1_Impl(this)
    .also { dhcpOptions = it }
    .apply(init)
}

/** List of ports to be forwarded to the virtual machine. */
@K8sDslMarker
fun Interface.ports(init: Port.() -> Unit) {
  this as Interface_v1_Impl
  Port_v1_Impl(this)
    .also { ports = ports?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** matchExpressions is a list of label selector requirements. The requirements are ANDed. */
@K8sDslMarker
fun LabelSelector.matchExpressions(init: LabelSelectorRequirement.() -> Unit) {
  this as LabelSelector_v1_Impl
  LabelSelectorRequirement_v1_Impl(this)
    .also { matchExpressions = matchExpressions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Hugepages allow to use hugepages for the VirtualMachineInstance instead of regular memory. */
@K8sDslMarker
fun Memory.hugepages(init: Hugepages.() -> Unit) {
  this as Memory_v1_Impl
  Hugepages_v1_Impl(this)
    .also { hugepages = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun Network.multus(init: MultusNetwork.() -> Unit) {
  this as Network_v1_Impl
  MultusNetwork_v1_Impl(this)
    .also { multus = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun Network.pod(init: PodNetwork.() -> Unit) {
  this as Network_v1_Impl
  PodNetwork_v1_Impl(this)
    .also { pod = it }
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
  this as NodeAffinity_v1_Impl
  PreferredSchedulingTerm_v1_Impl(this)
    .also { preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto
the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g.
due to an update), the system may or may not try to eventually evict the pod from its node. */
@K8sDslMarker
fun NodeAffinity.requiredDuringSchedulingIgnoredDuringExecution(init: NodeSelector.() -> Unit) {
  this as NodeAffinity_v1_Impl
  NodeSelector_v1_Impl(this)
    .also { requiredDuringSchedulingIgnoredDuringExecution = it }
    .apply(init)
}

/** Required. A list of node selector terms. The terms are ORed. */
@K8sDslMarker
fun NodeSelector.nodeSelectorTerms(init: NodeSelectorTerm.() -> Unit) {
  this as NodeSelector_v1_Impl
  NodeSelectorTerm_v1_Impl(this)
    .also { nodeSelectorTerms = nodeSelectorTerms?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** A list of node selector requirements by node’s labels. */
@K8sDslMarker
fun NodeSelectorTerm.matchExpressions(init: NodeSelectorRequirement.() -> Unit) {
  this as NodeSelectorTerm_v1_Impl
  NodeSelectorRequirement_v1_Impl(this)
    .also { matchExpressions = matchExpressions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** A list of node selector requirements by node’s fields. */
@K8sDslMarker
fun NodeSelectorTerm.matchFields(init: NodeSelectorRequirement.() -> Unit) {
  this as NodeSelectorTerm_v1_Impl
  NodeSelectorRequirement_v1_Impl(this)
    .also { matchFields = matchFields?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow. This is mostly for
internal housekeeping, and users typically shouldn’t need to set or understand this field. A workflow can be the user’s
name, a controller’s name, or the name of a specific apply path like "ci-cd". The set of fields is always in the version
that the workflow used when modifying the object. */
@K8sDslMarker
fun ObjectMeta.managedFields(init: ManagedFieldsEntry.() -> Unit) {
  this as ObjectMeta_v1_Impl
  ManagedFieldsEntry_v1_Impl(this)
    .also { managedFields = managedFields?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage
collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the
controller field set to true. There cannot be more than one managing controller. */
@K8sDslMarker
fun ObjectMeta.ownerReferences(init: OwnerReference.() -> Unit) {
  this as ObjectMeta_v1_Impl
  OwnerReference_v1_Impl(this)
    .also { ownerReferences = ownerReferences?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Standard object’s metadata. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
@K8sDslMarker
fun PersistentVolumeClaim.metadata(init: ObjectMeta.() -> Unit) {
  this as PersistentVolumeClaim_v1_Impl
  ObjectMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec defines the desired characteristics of a volume requested by a pod author. More info: 
                   
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
@K8sDslMarker
fun PersistentVolumeClaim.spec(init: PersistentVolumeClaimSpec.() -> Unit) {
  this as PersistentVolumeClaim_v1_Impl
  PersistentVolumeClaimSpec_v1_Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status represents the current information/status of a persistent volume claim. Read-only. More info: 
                  
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
@K8sDslMarker
fun PersistentVolumeClaim.status(init: PersistentVolumeClaimStatus.() -> Unit) {
  this as PersistentVolumeClaim_v1_Impl
  PersistentVolumeClaimStatus_v1_Impl(this)
    .also { status = it }
    .apply(init)
}

/** This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and currently VolumeSnapshot is the
only supported data source. If the provisioner can support VolumeSnapshot data source, it will create a new volume and
data will be restored to the volume at the same time. If the provisioner does not support VolumeSnapshot data source,
volume will not be created and the failure will be reported as an event. In the future, we plan to support more data
source types and the behavior of the provisioner may change. */
@K8sDslMarker
fun PersistentVolumeClaimSpec.dataSource(init: TypedLocalObjectReference.() -> Unit) {
  this as PersistentVolumeClaimSpec_v1_Impl
  TypedLocalObjectReference_v1_Impl(this)
    .also { dataSource = it }
    .apply(init)
}

/** Resources represents the minimum resources the volume should have. More info: 
                   
https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources */
@K8sDslMarker
fun PersistentVolumeClaimSpec.resources(init: ResourceRequirements.() -> Unit) {
  this as PersistentVolumeClaimSpec_v1_Impl
  ResourceRequirements_v1_Impl(this)
    .also { resources = it }
    .apply(init)
}

/** A label query over volumes to consider for binding. */
@K8sDslMarker
fun PersistentVolumeClaimSpec.selector(init: LabelSelector.() -> Unit) {
  this as PersistentVolumeClaimSpec_v1_Impl
  LabelSelector_v1_Impl(this)
    .also { selector = it }
    .apply(init)
}

/** Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will
be set to 'ResizeStarted'. */
@K8sDslMarker
fun PersistentVolumeClaimStatus.conditions(init: PersistentVolumeClaimCondition.() -> Unit) {
  this as PersistentVolumeClaimStatus_v1_Impl
  PersistentVolumeClaimCondition_v1_Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
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
  this as PodAffinity_v1_Impl
  WeightedPodAffinityTerm_v1_Impl(this)
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
  this as PodAffinity_v1_Impl
  PodAffinityTerm_v1_Impl(this)
    .also { requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** A label query over a set of resources, in this case pods. */
@K8sDslMarker
fun PodAffinityTerm.labelSelector(init: LabelSelector.() -> Unit) {
  this as PodAffinityTerm_v1_Impl
  LabelSelector_v1_Impl(this)
    .also { labelSelector = it }
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
  this as PodAntiAffinity_v1_Impl
  WeightedPodAffinityTerm_v1_Impl(this)
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
  this as PodAntiAffinity_v1_Impl
  PodAffinityTerm_v1_Impl(this)
    .also { requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries
will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy. */
@K8sDslMarker
fun PodDNSConfig.options(init: PodDNSConfigOption.() -> Unit) {
  this as PodDNSConfig_v1_Impl
  PodDNSConfigOption_v1_Impl(this)
    .also { options = options?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** A node selector term, associated with the corresponding weight. */
@K8sDslMarker
fun PreferredSchedulingTerm.preference(init: NodeSelectorTerm.() -> Unit) {
  this as PreferredSchedulingTerm_v1_Impl
  NodeSelectorTerm_v1_Impl(this)
    .also { preference = it }
    .apply(init)
}

/** HTTPGet specifies the http request to perform. */
@K8sDslMarker
fun Probe.httpGet(init: HTTPGetAction.() -> Unit) {
  this as Probe_v1_Impl
  HTTPGetAction_v1_Impl(this)
    .also { httpGet = it }
    .apply(init)
}

/** TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported */
@K8sDslMarker
fun Probe.tcpSocket(init: TCPSocketAction.() -> Unit) {
  this as Probe_v1_Impl
  TCPSocketAction_v1_Impl(this)
    .also { tcpSocket = it }
    .apply(init)
}

/** Limits describes the maximum amount of compute resources allowed. Valid resource keys are "memory" and "cpu". */
@K8sDslMarker
fun ResourceRequirements.limits(init: de.loosetie.k8s.dsl.types.CpuMem.() -> Unit) {
  this as ResourceRequirements_v1_Impl
  de.loosetie.k8s.dsl.types.CpuMem(this)
    .also { limits = it }
    .apply(init)
}

/** Requests is a description of the initial vmi resources. Valid resource keys are "memory" and "cpu". */
@K8sDslMarker
fun ResourceRequirements.requests(init: de.loosetie.k8s.dsl.types.CpuMem.() -> Unit) {
  this as ResourceRequirements_v1_Impl
  de.loosetie.k8s.dsl.types.CpuMem(this)
    .also { requests = it }
    .apply(init)
}

/** Extended data associated with the reason. Each reason may define its own extended details. This field is optional and
the data returned is not guaranteed to conform to any schema except that defined by the reason type. */
@K8sDslMarker
fun Status.details(init: StatusDetails.() -> Unit) {
  this as Status_v1_Impl
  StatusDetails_v1_Impl(this)
    .also { details = it }
    .apply(init)
}

/** Standard list metadata. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
@K8sDslMarker
fun Status.metadata(init: ListMeta.() -> Unit) {
  this as Status_v1_Impl
  ListMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide
detailed causes. */
@K8sDslMarker
fun StatusDetails.causes(init: StatusCause.() -> Unit) {
  this as StatusDetails_v1_Impl
  StatusCause_v1_Impl(this)
    .also { causes = causes?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** HPET (High Precision Event Timer) - multiple timers with periodic interrupts. */
@K8sDslMarker
fun Timer.hpet(init: HPETTimer.() -> Unit) {
  this as Timer_v1_Impl
  HPETTimer_v1_Impl(this)
    .also { hpet = it }
    .apply(init)
}

/** Hyperv (Hypervclock) - lets guests read the host’s wall clock time (paravirtualized). For windows guests. */
@K8sDslMarker
fun Timer.hyperv(init: HypervTimer.() -> Unit) {
  this as Timer_v1_Impl
  HypervTimer_v1_Impl(this)
    .also { hyperv = it }
    .apply(init)
}

/** KVM (KVM clock) - lets guests read the host’s wall clock time (paravirtualized). For linux guests. */
@K8sDslMarker
fun Timer.kvm(init: KVMTimer.() -> Unit) {
  this as Timer_v1_Impl
  KVMTimer_v1_Impl(this)
    .also { kvm = it }
    .apply(init)
}

/** PIT (Programmable Interval Timer) - a timer with periodic interrupts. */
@K8sDslMarker
fun Timer.pit(init: PITTimer.() -> Unit) {
  this as Timer_v1_Impl
  PITTimer_v1_Impl(this)
    .also { pit = it }
    .apply(init)
}

/** RTC (Real Time Clock) - a continuously running timer with periodic interrupts. */
@K8sDslMarker
fun Timer.rtc(init: RTCTimer.() -> Unit) {
  this as Timer_v1_Impl
  RTCTimer_v1_Impl(this)
    .also { rtc = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachine.metadata(init: ObjectMeta.() -> Unit) {
  this as VirtualMachine_v1_Impl
  ObjectMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Spec contains the specification of VirtualMachineInstance created */
@K8sDslMarker
fun VirtualMachine.spec(init: VirtualMachineSpec.() -> Unit) {
  this as VirtualMachine_v1_Impl
  VirtualMachineSpec_v1_Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status holds the current state of the controller and brief information about its associated VirtualMachineInstance */
@K8sDslMarker
fun VirtualMachine.status(init: VirtualMachineStatus.() -> Unit) {
  this as VirtualMachine_v1_Impl
  VirtualMachineStatus_v1_Impl(this)
    .also { status = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstance.metadata(init: ObjectMeta.() -> Unit) {
  this as VirtualMachineInstance_v1_Impl
  ObjectMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** VirtualMachineInstance Spec contains the VirtualMachineInstance specification. */
@K8sDslMarker
fun VirtualMachineInstance.spec(init: VirtualMachineInstanceSpec.() -> Unit) {
  this as VirtualMachineInstance_v1_Impl
  VirtualMachineInstanceSpec_v1_Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is the high level overview of how the VirtualMachineInstance is doing. It contains information available to
controllers and users. */
@K8sDslMarker
fun VirtualMachineInstance.status(init: VirtualMachineInstanceStatus.() -> Unit) {
  this as VirtualMachineInstance_v1_Impl
  VirtualMachineInstanceStatus_v1_Impl(this)
    .also { status = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstanceFileSystemList.items(init: VirtualMachineInstanceFileSystem.() -> Unit) {
  this as VirtualMachineInstanceFileSystemList_v1_Impl
  VirtualMachineInstanceFileSystem_v1_Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstanceFileSystemList.metadata(init: ListMeta.() -> Unit) {
  this as VirtualMachineInstanceFileSystemList_v1_Impl
  ListMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** FSInfo is a guest os filesystem information containing the disk mapping and disk mounts with usage */
@K8sDslMarker
fun VirtualMachineInstanceGuestAgentInfo.fsInfo(init: VirtualMachineInstanceFileSystemInfo.() -> Unit) {
  this as VirtualMachineInstanceGuestAgentInfo_v1_Impl
  VirtualMachineInstanceFileSystemInfo_v1_Impl(this)
    .also { fsInfo = it }
    .apply(init)
}

/** OS contains the guest operating system information */
@K8sDslMarker
fun VirtualMachineInstanceGuestAgentInfo.os(init: VirtualMachineInstanceGuestOSInfo.() -> Unit) {
  this as VirtualMachineInstanceGuestAgentInfo_v1_Impl
  VirtualMachineInstanceGuestOSInfo_v1_Impl(this)
    .also { os = it }
    .apply(init)
}

/** UserList is a list of active guest OS users */
@K8sDslMarker
fun VirtualMachineInstanceGuestAgentInfo.userList(init: VirtualMachineInstanceGuestOSUser.() -> Unit) {
  this as VirtualMachineInstanceGuestAgentInfo_v1_Impl
  VirtualMachineInstanceGuestOSUser_v1_Impl(this)
    .also { userList = userList?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstanceGuestOSUserList.items(init: VirtualMachineInstanceGuestOSUser.() -> Unit) {
  this as VirtualMachineInstanceGuestOSUserList_v1_Impl
  VirtualMachineInstanceGuestOSUser_v1_Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstanceGuestOSUserList.metadata(init: ListMeta.() -> Unit) {
  this as VirtualMachineInstanceGuestOSUserList_v1_Impl
  ListMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstanceList.items(init: VirtualMachineInstance.() -> Unit) {
  this as VirtualMachineInstanceList_v1_Impl
  VirtualMachineInstance_v1_Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstanceList.metadata(init: ListMeta.() -> Unit) {
  this as VirtualMachineInstanceList_v1_Impl
  ListMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstanceMigration.metadata(init: ObjectMeta.() -> Unit) {
  this as VirtualMachineInstanceMigration_v1_Impl
  ObjectMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstanceMigration.spec(init: VirtualMachineInstanceMigrationSpec.() -> Unit) {
  this as VirtualMachineInstanceMigration_v1_Impl
  VirtualMachineInstanceMigrationSpec_v1_Impl(this)
    .also { spec = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstanceMigration.status(init: VirtualMachineInstanceMigrationStatus.() -> Unit) {
  this as VirtualMachineInstanceMigration_v1_Impl
  VirtualMachineInstanceMigrationStatus_v1_Impl(this)
    .also { status = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstanceMigrationList.items(init: VirtualMachineInstanceMigration.() -> Unit) {
  this as VirtualMachineInstanceMigrationList_v1_Impl
  VirtualMachineInstanceMigration_v1_Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstanceMigrationList.metadata(init: ListMeta.() -> Unit) {
  this as VirtualMachineInstanceMigrationList_v1_Impl
  ListMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstancePreset.metadata(init: ObjectMeta.() -> Unit) {
  this as VirtualMachineInstancePreset_v1_Impl
  ObjectMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** VirtualMachineInstance Spec contains the VirtualMachineInstance specification. */
@K8sDslMarker
fun VirtualMachineInstancePreset.spec(init: VirtualMachineInstancePresetSpec.() -> Unit) {
  this as VirtualMachineInstancePreset_v1_Impl
  VirtualMachineInstancePresetSpec_v1_Impl(this)
    .also { spec = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstancePresetList.items(init: VirtualMachineInstancePreset.() -> Unit) {
  this as VirtualMachineInstancePresetList_v1_Impl
  VirtualMachineInstancePreset_v1_Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstancePresetList.metadata(init: ListMeta.() -> Unit) {
  this as VirtualMachineInstancePresetList_v1_Impl
  ListMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Domain is the same object type as contained in VirtualMachineInstanceSpec */
@K8sDslMarker
fun VirtualMachineInstancePresetSpec.domain(init: DomainSpec.() -> Unit) {
  this as VirtualMachineInstancePresetSpec_v1_Impl
  DomainSpec_v1_Impl(this)
    .also { domain = it }
    .apply(init)
}

/** Selector is a label query over a set of VMIs. Required. */
@K8sDslMarker
fun VirtualMachineInstancePresetSpec.selector(init: LabelSelector.() -> Unit) {
  this as VirtualMachineInstancePresetSpec_v1_Impl
  LabelSelector_v1_Impl(this)
    .also { selector = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstanceReplicaSet.metadata(init: ObjectMeta.() -> Unit) {
  this as VirtualMachineInstanceReplicaSet_v1_Impl
  ObjectMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** VirtualMachineInstance Spec contains the VirtualMachineInstance specification. */
@K8sDslMarker
fun VirtualMachineInstanceReplicaSet.spec(init: VirtualMachineInstanceReplicaSetSpec.() -> Unit) {
  this as VirtualMachineInstanceReplicaSet_v1_Impl
  VirtualMachineInstanceReplicaSetSpec_v1_Impl(this)
    .also { spec = it }
    .apply(init)
}

/** Status is the high level overview of how the VirtualMachineInstance is doing. It contains information available to
controllers and users. */
@K8sDslMarker
fun VirtualMachineInstanceReplicaSet.status(init: VirtualMachineInstanceReplicaSetStatus.() -> Unit) {
  this as VirtualMachineInstanceReplicaSet_v1_Impl
  VirtualMachineInstanceReplicaSetStatus_v1_Impl(this)
    .also { status = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstanceReplicaSetList.items(init: VirtualMachineInstanceReplicaSet.() -> Unit) {
  this as VirtualMachineInstanceReplicaSetList_v1_Impl
  VirtualMachineInstanceReplicaSet_v1_Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstanceReplicaSetList.metadata(init: ListMeta.() -> Unit) {
  this as VirtualMachineInstanceReplicaSetList_v1_Impl
  ListMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this
deployment. */
@K8sDslMarker
fun VirtualMachineInstanceReplicaSetSpec.selector(init: LabelSelector.() -> Unit) {
  this as VirtualMachineInstanceReplicaSetSpec_v1_Impl
  LabelSelector_v1_Impl(this)
    .also { selector = it }
    .apply(init)
}

/** Template describes the pods that will be created. */
@K8sDslMarker
fun VirtualMachineInstanceReplicaSetSpec.template(init: VirtualMachineInstanceTemplateSpec.() -> Unit) {
  this as VirtualMachineInstanceReplicaSetSpec_v1_Impl
  VirtualMachineInstanceTemplateSpec_v1_Impl(this)
    .also { template = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstanceReplicaSetStatus.conditions(init: VirtualMachineInstanceReplicaSetCondition.() -> Unit) {
  this as VirtualMachineInstanceReplicaSetStatus_v1_Impl
  VirtualMachineInstanceReplicaSetCondition_v1_Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** If affinity is specifies, obey all the affinity rules */
@K8sDslMarker
fun VirtualMachineInstanceSpec.affinity(init: Affinity.() -> Unit) {
  this as VirtualMachineInstanceSpec_v1_Impl
  Affinity_v1_Impl(this)
    .also { affinity = it }
    .apply(init)
}

/** Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based
on DNSPolicy. */
@K8sDslMarker
fun VirtualMachineInstanceSpec.dnsConfig(init: PodDNSConfig.() -> Unit) {
  this as VirtualMachineInstanceSpec_v1_Impl
  PodDNSConfig_v1_Impl(this)
    .also { dnsConfig = it }
    .apply(init)
}

/** Specification of the desired behavior of the VirtualMachineInstance on the host. */
@K8sDslMarker
fun VirtualMachineInstanceSpec.domain(init: DomainSpec.() -> Unit) {
  this as VirtualMachineInstanceSpec_v1_Impl
  DomainSpec_v1_Impl(this)
    .also { domain = it }
    .apply(init)
}

/** Periodic probe of VirtualMachineInstance liveness. VirtualmachineInstances will be stopped if the probe fails. Cannot be
updated. More info: 
                   
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
@K8sDslMarker
fun VirtualMachineInstanceSpec.livenessProbe(init: Probe.() -> Unit) {
  this as VirtualMachineInstanceSpec_v1_Impl
  Probe_v1_Impl(this)
    .also { livenessProbe = it }
    .apply(init)
}

/** List of networks that can be attached to a vm’s virtual interface. */
@K8sDslMarker
fun VirtualMachineInstanceSpec.networks(init: Network.() -> Unit) {
  this as VirtualMachineInstanceSpec_v1_Impl
  Network_v1_Impl(this)
    .also { networks = networks?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Periodic probe of VirtualMachineInstance service readiness. VirtualmachineInstances will be removed from service
endpoints if the probe fails. Cannot be updated. More info: 
                   
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
@K8sDslMarker
fun VirtualMachineInstanceSpec.readinessProbe(init: Probe.() -> Unit) {
  this as VirtualMachineInstanceSpec_v1_Impl
  Probe_v1_Impl(this)
    .also { readinessProbe = it }
    .apply(init)
}

/** If toleration is specified, obey all the toleration rules. */
@K8sDslMarker
fun VirtualMachineInstanceSpec.tolerations(init: Toleration.() -> Unit) {
  this as VirtualMachineInstanceSpec_v1_Impl
  Toleration_v1_Impl(this)
    .also { tolerations = tolerations?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** List of volumes that can be mounted by disks belonging to the vmi. */
@K8sDslMarker
fun VirtualMachineInstanceSpec.volumes(init: Volume.() -> Unit) {
  this as VirtualMachineInstanceSpec_v1_Impl
  Volume_v1_Impl(this)
    .also { volumes = volumes?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Conditions are specific points in VirtualMachineInstance’s pod runtime. */
@K8sDslMarker
fun VirtualMachineInstanceStatus.conditions(init: VirtualMachineInstanceCondition.() -> Unit) {
  this as VirtualMachineInstanceStatus_v1_Impl
  VirtualMachineInstanceCondition_v1_Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Guest OS Information */
@K8sDslMarker
fun VirtualMachineInstanceStatus.guestOSInfo(init: VirtualMachineInstanceGuestOSInfo.() -> Unit) {
  this as VirtualMachineInstanceStatus_v1_Impl
  VirtualMachineInstanceGuestOSInfo_v1_Impl(this)
    .also { guestOSInfo = it }
    .apply(init)
}

/** Interfaces represent the details of available network interfaces. */
@K8sDslMarker
fun VirtualMachineInstanceStatus.interfaces(init: VirtualMachineInstanceNetworkInterface.() -> Unit) {
  this as VirtualMachineInstanceStatus_v1_Impl
  VirtualMachineInstanceNetworkInterface_v1_Impl(this)
    .also { interfaces = interfaces?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Represents the status of a live migration */
@K8sDslMarker
fun VirtualMachineInstanceStatus.migrationState(init: VirtualMachineInstanceMigrationState.() -> Unit) {
  this as VirtualMachineInstanceStatus_v1_Impl
  VirtualMachineInstanceMigrationState_v1_Impl(this)
    .also { migrationState = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineInstanceTemplateSpec.metadata(init: ObjectMeta.() -> Unit) {
  this as VirtualMachineInstanceTemplateSpec_v1_Impl
  ObjectMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** VirtualMachineInstance Spec contains the VirtualMachineInstance specification. */
@K8sDslMarker
fun VirtualMachineInstanceTemplateSpec.spec(init: VirtualMachineInstanceSpec.() -> Unit) {
  this as VirtualMachineInstanceTemplateSpec_v1_Impl
  VirtualMachineInstanceSpec_v1_Impl(this)
    .also { spec = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineList.items(init: VirtualMachine.() -> Unit) {
  this as VirtualMachineList_v1_Impl
  VirtualMachine_v1_Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineList.metadata(init: ListMeta.() -> Unit) {
  this as VirtualMachineList_v1_Impl
  ListMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/** dataVolumeTemplates is a list of dataVolumes that the VirtualMachineInstance template can reference. DataVolumes in this
list are dynamically created for the VirtualMachine and are tied to the VirtualMachine’s life-cycle. */
@K8sDslMarker
fun VirtualMachineSpec.dataVolumeTemplates(init: DataVolume.() -> Unit) {
  this as VirtualMachineSpec_v1_Impl
  DataVolume_v1alpha1_Impl(this)
    .also { dataVolumeTemplates = dataVolumeTemplates?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** Template is the direct specification of VirtualMachineInstance */
@K8sDslMarker
fun VirtualMachineSpec.template(init: VirtualMachineInstanceTemplateSpec.() -> Unit) {
  this as VirtualMachineSpec_v1_Impl
  VirtualMachineInstanceTemplateSpec_v1_Impl(this)
    .also { template = it }
    .apply(init)
}

/** Hold the state information of the VirtualMachine and its VirtualMachineInstance */
@K8sDslMarker
fun VirtualMachineStatus.conditions(init: VirtualMachineCondition.() -> Unit) {
  this as VirtualMachineStatus_v1_Impl
  VirtualMachineCondition_v1_Impl(this)
    .also { conditions = conditions?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** StateChangeRequests indicates a list of actions that should be taken on a VMI e.g. stop a specific VMI then start a new
one. */
@K8sDslMarker
fun VirtualMachineStatus.stateChangeRequests(init: VirtualMachineStateChangeRequest.() -> Unit) {
  this as VirtualMachineStatus_v1_Impl
  VirtualMachineStateChangeRequest_v1_Impl(this)
    .also { stateChangeRequests = stateChangeRequests?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/** CloudInitConfigDrive represents a cloud-init Config Drive user-data source. The Config Drive data will be added as a
disk to the vmi. A proper cloud-init installation is required inside the guest. More info: 
                   
https://cloudinit.readthedocs.io/en/latest/topics/datasources/configdrive.html */
@K8sDslMarker
fun Volume.cloudInitConfigDrive(init: CloudInitConfigDriveSource.() -> Unit) {
  this as Volume_v1_Impl
  CloudInitConfigDriveSource_v1_Impl(this)
    .also { cloudInitConfigDrive = it }
    .apply(init)
}

/** CloudInitNoCloud represents a cloud-init NoCloud user-data source. The NoCloud data will be added as a disk to the vmi.
A proper cloud-init installation is required inside the guest. More info: 
                   
http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html */
@K8sDslMarker
fun Volume.cloudInitNoCloud(init: CloudInitNoCloudSource.() -> Unit) {
  this as Volume_v1_Impl
  CloudInitNoCloudSource_v1_Impl(this)
    .also { cloudInitNoCloud = it }
    .apply(init)
}

/** ConfigMapSource represents a reference to a ConfigMap in the same namespace. More info: 
                   
https://kubernetes.io/docs/tasks/configure-pod-container/configure-pod-configmap/ */
@K8sDslMarker
fun Volume.configMap(init: ConfigMapVolumeSource.() -> Unit) {
  this as Volume_v1_Impl
  ConfigMapVolumeSource_v1_Impl(this)
    .also { configMap = it }
    .apply(init)
}

/** ContainerDisk references a docker image, embedding a qcow or raw disk. More info: 
                   
https://kubevirt.gitbooks.io/user-guide/registry-disk.html */
@K8sDslMarker
fun Volume.containerDisk(init: ContainerDiskSource.() -> Unit) {
  this as Volume_v1_Impl
  ContainerDiskSource_v1_Impl(this)
    .also { containerDisk = it }
    .apply(init)
}

/** DataVolume represents the dynamic creation a PVC for this volume as well as the process of populating that PVC with a
disk image. */
@K8sDslMarker
fun Volume.dataVolume(init: DataVolumeSource.() -> Unit) {
  this as Volume_v1_Impl
  DataVolumeSource_v1_Impl(this)
    .also { dataVolume = it }
    .apply(init)
}

/** EmptyDisk represents a temporary disk which shares the vmis lifecycle. More info: 
                   
https://kubevirt.gitbooks.io/user-guide/disks-and-volumes.html */
@K8sDslMarker
fun Volume.emptyDisk(init: EmptyDiskSource.() -> Unit) {
  this as Volume_v1_Impl
  EmptyDiskSource_v1_Impl(this)
    .also { emptyDisk = it }
    .apply(init)
}

/** Ephemeral is a special volume source that "wraps" specified source and provides copy-on-write image on top of it. */
@K8sDslMarker
fun Volume.ephemeral(init: EphemeralVolumeSource.() -> Unit) {
  this as Volume_v1_Impl
  EphemeralVolumeSource_v1_Impl(this)
    .also { ephemeral = it }
    .apply(init)
}

/** HostDisk represents a disk created on the cluster level */
@K8sDslMarker
fun Volume.hostDisk(init: HostDisk.() -> Unit) {
  this as Volume_v1_Impl
  HostDisk_v1_Impl(this)
    .also { hostDisk = it }
    .apply(init)
}

/** PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. Directly
attached to the vmi via qemu. More info: 
                   
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
@K8sDslMarker
fun Volume.persistentVolumeClaim(init: PersistentVolumeClaimVolumeSource.() -> Unit) {
  this as Volume_v1_Impl
  PersistentVolumeClaimVolumeSource_v1_Impl(this)
    .also { persistentVolumeClaim = it }
    .apply(init)
}

/** SecretVolumeSource represents a reference to a secret data in the same namespace. More info: 
                   
https://kubernetes.io/docs/concepts/configuration/secret/ */
@K8sDslMarker
fun Volume.secret(init: SecretVolumeSource.() -> Unit) {
  this as Volume_v1_Impl
  SecretVolumeSource_v1_Impl(this)
    .also { secret = it }
    .apply(init)
}

/** ServiceAccountVolumeSource represents a reference to a service account. There can only be one volume of this type! More
info: 
                    https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/ */
@K8sDslMarker
fun Volume.serviceAccount(init: ServiceAccountVolumeSource.() -> Unit) {
  this as Volume_v1_Impl
  ServiceAccountVolumeSource_v1_Impl(this)
    .also { serviceAccount = it }
    .apply(init)
}

/** i6300esb watchdog device. */
@K8sDslMarker
fun Watchdog.i6300esb(init: I6300ESBWatchdog.() -> Unit) {
  this as Watchdog_v1_Impl
  I6300ESBWatchdog_v1_Impl(this)
    .also { i6300esb = it }
    .apply(init)
}

/** Required. A pod affinity term, associated with the corresponding weight. */
@K8sDslMarker
fun WeightedPodAffinityTerm.podAffinityTerm(init: PodAffinityTerm.() -> Unit) {
  this as WeightedPodAffinityTerm_v1_Impl
  PodAffinityTerm_v1_Impl(this)
    .also { podAffinityTerm = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun DataVolume.metadata(init: ObjectMeta.() -> Unit) {
  this as DataVolume_v1alpha1_Impl
  ObjectMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun DataVolume.spec(init: DataVolumeSpec.() -> Unit) {
  this as DataVolume_v1alpha1_Impl
  DataVolumeSpec_v1alpha1_Impl(this)
    .also { spec = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun DataVolume.status(init: DataVolumeStatus.() -> Unit) {
  this as DataVolume_v1alpha1_Impl
  DataVolumeStatus_v1alpha1_Impl(this)
    .also { status = it }
    .apply(init)
}

/** PVC is a pointer to the PVC Spec we want to use */
@K8sDslMarker
fun DataVolumeSpec.pvc(init: PersistentVolumeClaimSpec.() -> Unit) {
  this as DataVolumeSpec_v1alpha1_Impl
  PersistentVolumeClaimSpec_v1_Impl(this)
    .also { pvc = it }
    .apply(init)
}

/** Source is the src of the data for the requested DataVolume */
@K8sDslMarker
fun DataVolumeSpec.source(init: DataVolumeSource_v1alpha1_.() -> Unit) {
  this as DataVolumeSpec_v1alpha1_Impl
  DataVolumeSource_v1alpha1_Impl(this)
    .also { source = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineSnapshot.metadata(init: ObjectMeta.() -> Unit) {
  this as VirtualMachineSnapshot_v1alpha1_Impl
  ObjectMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineSnapshot.spec(init: VirtualMachineSnapshotSpec.() -> Unit) {
  this as VirtualMachineSnapshot_v1alpha1_Impl
  VirtualMachineSnapshotSpec_v1alpha1_Impl(this)
    .also { spec = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineSnapshot.status(init: VirtualMachineSnapshotStatus.() -> Unit) {
  this as VirtualMachineSnapshot_v1alpha1_Impl
  VirtualMachineSnapshotStatus_v1alpha1_Impl(this)
    .also { status = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineSnapshotContent.metadata(init: ObjectMeta.() -> Unit) {
  this as VirtualMachineSnapshotContent_v1alpha1_Impl
  ObjectMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineSnapshotContent.spec(init: VirtualMachineSnapshotContentSpec.() -> Unit) {
  this as VirtualMachineSnapshotContent_v1alpha1_Impl
  VirtualMachineSnapshotContentSpec_v1alpha1_Impl(this)
    .also { spec = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineSnapshotContent.status(init: VirtualMachineSnapshotContentStatus.() -> Unit) {
  this as VirtualMachineSnapshotContent_v1alpha1_Impl
  VirtualMachineSnapshotContentStatus_v1alpha1_Impl(this)
    .also { status = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineSnapshotContentList.items(init: VirtualMachineSnapshotContent.() -> Unit) {
  this as VirtualMachineSnapshotContentList_v1alpha1_Impl
  VirtualMachineSnapshotContent_v1alpha1_Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineSnapshotContentList.metadata(init: ListMeta.() -> Unit) {
  this as VirtualMachineSnapshotContentList_v1alpha1_Impl
  ListMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineSnapshotList.items(init: VirtualMachineSnapshot.() -> Unit) {
  this as VirtualMachineSnapshotList_v1alpha1_Impl
  VirtualMachineSnapshot_v1alpha1_Impl(this)
    .also { items = items?.let { p -> p + it } ?: listOf(it) }
    .apply(init)
}

/**  */
@K8sDslMarker
fun VirtualMachineSnapshotList.metadata(init: ListMeta.() -> Unit) {
  this as VirtualMachineSnapshotList_v1alpha1_Impl
  ListMeta_v1_Impl(this)
    .also { metadata = it }
    .apply(init)
}