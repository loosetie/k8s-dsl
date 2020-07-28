package de.loosetie.k8s.dsl.kubevirt

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest


@K8sDslMarker
interface APIGroup_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "APIGroup"
  /** name is the name of the group. */
  @K8sDslMarker var name: String?
  /** preferredVersion is the version preferred by the API server, which probably is the storage version. */
  val preferredVersion: GroupVersionForDiscovery_v1_?
  /** a map of client CIDR to server address that is serving this group. This is to help clients reach servers in the most
network-efficient way possible. Clients can use the appropriate server address as per the CIDR that they match. In case
of multiple matches, clients should use the longest matching CIDR. The server returns only those CIDRs that it thinks
that the client can match. For example: the master will return an internal IP CIDR only, if the client reaches the
server using an internal IP. Server looks at X-Forwarded-For header or X-Real-Ip header or request.RemoteAddr (in that
order) to get the client IP. */
  val serverAddressByClientCIDRs: List<ServerAddressByClientCIDR_v1_>?
  /** versions are the versions supported in this group. */
  val versions: List<GroupVersionForDiscovery_v1_>?
}

@K8sDslMarker
interface APIGroupList_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "APIGroupList"
  /** groups is a list of APIGroup. */
  val groups: List<APIGroup_v1_>?
}

@K8sDslMarker
interface APIResource_v1_: K8sManifest {
  /** kind is the kind for the resource (e.g. 'Foo' is the kind for a resource 'foo') */
  @K8sDslMarker var kind: String?
  /** name is the plural name of the resource. */
  @K8sDslMarker var name: String?
  /** categories is a list of the grouped resources this resource belongs to (e.g. 'all') */
  @K8sDslMarker var categories: List<String>?
  /** group is the preferred group of the resource. Empty implies the group of the containing resource list. For subresources,
this may have a different value, for example: Scale". */
  @K8sDslMarker var group: String?
  /** namespaced indicates if a resource is namespaced or not. */
  @K8sDslMarker var namespaced: Boolean?
  /** shortNames is a list of suggested short names of the resource. */
  @K8sDslMarker var shortNames: List<String>?
  /** singularName is the singular name of the resource. This allows clients to handle plural and singular opaquely. The
singularName is more correct for reporting status on a single item and both singular and plural are allowed from the
kubectl CLI interface. */
  @K8sDslMarker var singularName: String?
  /** The hash value of the storage version, the version this resource is converted to when written to the data store. Value
must be treated as opaque by clients. Only equality comparison on the value is valid. This is an alpha feature and may
change or be removed in the future. The field is populated by the apiserver only if the StorageVersionHash feature gate
is enabled. This field will remain optional even if it graduates. */
  @K8sDslMarker var storageVersionHash: String?
  /** verbs is a list of supported kube verbs (this includes get, list, watch, create, update, patch, delete,
deletecollection, and proxy) */
  @K8sDslMarker var verbs: List<String>?
  /** version is the preferred version of the resource. Empty implies the version of the containing resource list For
subresources, this may have a different value, for example: v1 (while inside a v1beta1 version of the core resource’s
group)". */
  @K8sDslMarker var version: String?
}

@K8sDslMarker
interface APIResourceList_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "APIResourceList"
  /** groupVersion is the group and version this APIResourceList is for. */
  @K8sDslMarker var groupVersion: String?
  /** resources contains the name of the resources and if they are namespaced. */
  val resources: List<APIResource_v1_>?
}

@K8sDslMarker
interface Affinity_v1_: K8sManifest {
  /** Describes node affinity scheduling rules for the pod. */
  val nodeAffinity: NodeAffinity_v1_?
  /** Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)). */
  val podAffinity: PodAffinity_v1_?
  /** Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other
pod(s)). */
  val podAntiAffinity: PodAntiAffinity_v1_?
}

@K8sDslMarker
interface Bootloader_v1_: K8sManifest {
  /** If set (default), BIOS will be used. */
  @K8sDslMarker var bios: Any?
  /** If set, EFI will be used instead of BIOS. */
  val efi: EFI_v1_?
}

@K8sDslMarker
interface CDRomTarget_v1_: K8sManifest {
  /** Bus indicates the type of disk device to emulate. supported values: virtio, sata, scsi. */
  @K8sDslMarker var bus: String?
  /** ReadOnly. Defaults to true. */
  @K8sDslMarker var readonly: Boolean?
  /** Tray indicates if the tray of the device is open or closed. Allowed values are "open" and "closed". Defaults to closed. */
  @K8sDslMarker var tray: String?
}

@K8sDslMarker
interface CPU_v1_: K8sManifest {
  /** Cores specifies the number of cores inside the vmi. Must be a value greater or equal 1. */
  @K8sDslMarker var cores: Long?
  /** DedicatedCPUPlacement requests the scheduler to place the VirtualMachineInstance on a node with enough dedicated pCPUs
and pin the vCPUs to it. */
  @K8sDslMarker var dedicatedCpuPlacement: Boolean?
  /** Features specifies the CPU features list inside the VMI. */
  val features: List<CPUFeature_v1_>?
  /** IsolateEmulatorThread requests one more dedicated pCPU to be allocated for the VMI to place the emulator thread on it. */
  @K8sDslMarker var isolateEmulatorThread: Boolean?
  /** Model specifies the CPU model inside the VMI. List of available models 
                   
https://github.com/libvirt/libvirt/tree/master/src/cpu_map. It is possible to specify special cases like
"host-passthrough" to get the same CPU as the node and "host-model" to get CPU closest to the node one. Defaults to
host-model. */
  @K8sDslMarker var model: String?
  /** Sockets specifies the number of sockets inside the vmi. Must be a value greater or equal 1. */
  @K8sDslMarker var sockets: Long?
  /** Threads specifies the number of threads inside the vmi. Must be a value greater or equal 1. */
  @K8sDslMarker var threads: Long?
}

@K8sDslMarker
interface CPUFeature_v1_: K8sManifest {
  /** Name of the CPU feature */
  @K8sDslMarker var name: String?
  /** Policy is the CPU feature attribute which can have the following attributes: force - The virtual CPU will claim the
feature is supported regardless of it being supported by host CPU. require - Guest creation will fail unless the feature
is supported by the host CPU or the hypervisor is able to emulate it. optional - The feature will be supported by
virtual CPU if and only if it is supported by host CPU. disable - The feature will not be supported by virtual CPU.
forbid - Guest creation will fail if the feature is supported by host CPU. Defaults to require */
  @K8sDslMarker var policy: String?
}

@K8sDslMarker
interface Chassis_v1_: K8sManifest {
  /** string */
  // val asset: None
  /** string */
  // val manufacturer: None
  /** string */
  // val serial: None
  /** string */
  // val sku: None
  /** string */
  // val version: None
}

@K8sDslMarker
interface Clock_v1_: K8sManifest {
  /** Timer specifies whih timers are attached to the vmi. */
  val timer: Timer_v1_?
  /** Timezone sets the guest clock to the specified timezone. Zone name follows the TZ environment variable format (e.g.
'America/New_York'). */
  @K8sDslMarker var timezone: String?
  /** UTC sets the guest clock to UTC on each boot. If an offset is specified, guest changes to the clock will be kept during
reboots and are not reset. */
  val utc: ClockOffsetUTC_v1_?
}

@K8sDslMarker
interface ClockOffsetUTC_v1_: K8sManifest {
  /** OffsetSeconds specifies an offset in seconds, relative to UTC. If set, guest changes to the clock will be kept during
reboots and not reset. */
  @K8sDslMarker var offsetSeconds: Int?
}

@K8sDslMarker
interface CloudInitConfigDriveSource_v1_: K8sManifest {
  /** NetworkData contains config drive inline cloud-init networkdata. */
  @K8sDslMarker var networkData: String?
  /** NetworkDataBase64 contains config drive cloud-init networkdata as a base64 encoded string. */
  @K8sDslMarker var networkDataBase64: String?
  /** NetworkDataSecretRef references a k8s secret that contains config drive networkdata. */
  val networkDataSecretRef: LocalObjectReference_v1_?
  /** UserDataSecretRef references a k8s secret that contains config drive userdata. */
  val secretRef: LocalObjectReference_v1_?
  /** UserData contains config drive inline cloud-init userdata. */
  @K8sDslMarker var userData: String?
  /** UserDataBase64 contains config drive cloud-init userdata as a base64 encoded string. */
  @K8sDslMarker var userDataBase64: String?
}

@K8sDslMarker
interface CloudInitNoCloudSource_v1_: K8sManifest {
  /** NetworkData contains NoCloud inline cloud-init networkdata. */
  @K8sDslMarker var networkData: String?
  /** NetworkDataBase64 contains NoCloud cloud-init networkdata as a base64 encoded string. */
  @K8sDslMarker var networkDataBase64: String?
  /** NetworkDataSecretRef references a k8s secret that contains NoCloud networkdata. */
  val networkDataSecretRef: LocalObjectReference_v1_?
  /** UserDataSecretRef references a k8s secret that contains NoCloud userdata. */
  val secretRef: LocalObjectReference_v1_?
  /** UserData contains NoCloud inline cloud-init userdata. */
  @K8sDslMarker var userData: String?
  /** UserDataBase64 contains NoCloud cloud-init userdata as a base64 encoded string. */
  @K8sDslMarker var userDataBase64: String?
}

@K8sDslMarker
interface ConfigMapVolumeSource_v1_: K8sManifest {
  /** Name of the referent. More info: 
                   
https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** Specify whether the ConfigMap or it’s keys must be defined */
  @K8sDslMarker var optional: Boolean?
  /** The volume label of the resulting disk inside the VMI. Different bootstrapping mechanisms require different values.
Typical values are "cidata" (cloud-init), "config-2" (cloud-init) or "OEMDRV" (kickstart). */
  @K8sDslMarker var volumeLabel: String?
}

@K8sDslMarker
interface ContainerDiskSource_v1_: K8sManifest {
  /** Image is the name of the image with the embedded disk. */
  @K8sDslMarker var image: String?
  /** Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent
otherwise. Cannot be updated. More info: 
                   
https://kubernetes.io/docs/concepts/containers/images#updating-images */
  @K8sDslMarker var imagePullPolicy: String?
  /** ImagePullSecret is the name of the Docker registry secret required to pull the image. The secret must already exist. */
  @K8sDslMarker var imagePullSecret: String?
  /** Path defines the path to disk file in the container */
  @K8sDslMarker var path: String?
}

@K8sDslMarker
interface DHCPOptions_v1_: K8sManifest {
  /** If specified will pass option 67 to interface’s DHCP server */
  @K8sDslMarker var bootFileName: String?
  /** If specified will pass the configured NTP server to the VM via DHCP option 042. */
  @K8sDslMarker var ntpServers: List<String>?
  /** If specified will pass extra DHCP options for private use, range: 224-254 */
  val privateOptions: List<DHCPPrivateOptions_v1_>?
  /** If specified will pass option 66 to interface’s DHCP server */
  @K8sDslMarker var tftpServerName: String?
}

@K8sDslMarker
interface DHCPPrivateOptions_v1_: K8sManifest {
  /** Option is an Integer value from 224-254 Required. */
  @K8sDslMarker var option: Int?
  /** Value is a String value for the Option provided Required. */
  @K8sDslMarker var value: String?
}

@K8sDslMarker
interface DataVolumeSource_v1_: K8sManifest {
  /** Name represents the name of the DataVolume in the same namespace */
  @K8sDslMarker var name: String?
}

@K8sDslMarker
interface DeleteOptions_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "DeleteOptions"
  /** When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will
result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will
be processed */
  @K8sDslMarker var dryRun: List<String>?
  /** The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero
indicates delete immediately. If this value is nil, the default grace period for the specified type will be used.
Defaults to a per object value if not specified. zero means delete immediately. */
  @K8sDslMarker var gracePeriodSeconds: Long?
  /** Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be
orphaned. If true/false, the "orphan" finalizer will be added to/removed from the object’s finalizers list. Either this
field or PropagationPolicy may be set, but not both. */
  @K8sDslMarker var orphanDependents: Boolean?
  /** Must be fulfilled before a deletion is carried out. If not possible, a 409 Conflict status will be returned. */
  val preconditions: Preconditions_v1_?
  /** Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both.
The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default
policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete
the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground. */
  @K8sDslMarker var propagationPolicy: String?
}

@K8sDslMarker
interface Devices_v1_: K8sManifest {
  /** Whether to attach the default graphics device or not. VNC will not be available if set to false. Defaults to true. */
  @K8sDslMarker var autoattachGraphicsDevice: Boolean?
  /** Whether to attach a pod network interface. Defaults to true. */
  @K8sDslMarker var autoattachPodInterface: Boolean?
  /** Whether to attach the default serial console or not. Serial console access will not be available if set to false.
Defaults to true. */
  @K8sDslMarker var autoattachSerialConsole: Boolean?
  /** Whether or not to enable virtio multi-queue for block devices */
  @K8sDslMarker var blockMultiQueue: Boolean?
  /** Disks describes disks, cdroms, floppy and luns which are connected to the vmi. */
  val disks: List<Disk_v1_>?
  /** Whether to attach a GPU device to the vmi. */
  val gpus: List<GPU_v1_>?
  /** Inputs describe input devices */
  val inputs: List<Input_v1_>?
  /** Interfaces describe network interfaces which are added to the vmi. */
  val interfaces: List<Interface_v1_>?
  /** If specified, virtual network interfaces configured with a virtio bus will also enable the vhost multiqueue feature */
  @K8sDslMarker var networkInterfaceMultiqueue: Boolean?
  /** Whether to have random number generator from host */
  @K8sDslMarker var rng: Any?
  /** Watchdog describes a watchdog device which can be added to the vmi. */
  val watchdog: Watchdog_v1_?
}

@K8sDslMarker
interface Disk_v1_: K8sManifest {
  /** Name is the device name */
  @K8sDslMarker var name: String?
  /** BootOrder is an integer value > 0, used to determine ordering of boot devices. Lower values take precedence. Each disk
or interface that has a boot order must have a unique value. Disks without a boot order are not tried if a disk with a
boot order exists. */
  @K8sDslMarker var bootOrder: Int?
  /** Cache specifies which kvm disk cache mode should be used. */
  @K8sDslMarker var cache: String?
  /** Attach a volume as a cdrom to the vmi. */
  val cdrom: CDRomTarget_v1_?
  /** dedicatedIOThread indicates this disk should have an exclusive IO Thread. Enabling this implies useIOThreads = true.
Defaults to false. */
  @K8sDslMarker var dedicatedIOThread: Boolean?
  /** Attach a volume as a disk to the vmi. */
  val disk: DiskTarget_v1_?
  /** Attach a volume as a floppy to the vmi. */
  val floppy: FloppyTarget_v1_?
  /** Attach a volume as a LUN to the vmi. */
  val lun: LunTarget_v1_?
  /** Serial provides the ability to specify a serial number for the disk device. */
  @K8sDslMarker var serial: String?
  /** If specified, disk address and its tag will be provided to the guest via config drive metadata */
  @K8sDslMarker var tag: String?
}

@K8sDslMarker
interface DiskTarget_v1_: K8sManifest {
  /** Bus indicates the type of disk device to emulate. supported values: virtio, sata, scsi. */
  @K8sDslMarker var bus: String?
  /** If specified, the virtual disk will be placed on the guests pci address with the specifed PCI address. For example:
0000:81:01.10 */
  @K8sDslMarker var pciAddress: String?
  /** ReadOnly. Defaults to false. */
  @K8sDslMarker var readonly: Boolean?
}

@K8sDslMarker
interface DomainSpec_v1_: K8sManifest {
  /** Chassis specifies the chassis info passed to the domain. */
  val chassis: Chassis_v1_?
  /** Clock sets the clock and timers of the vmi. */
  val clock: Clock_v1_?
  /** CPU allow specified the detailed CPU topology inside the vmi. */
  val cpu: CPU_v1_?
  /** Devices allows adding disks, network interfaces, and others */
  val devices: Devices_v1_?
  /** Features like acpi, apic, hyperv, smm. */
  val features: Features_v1_?
  /** Firmware. */
  val firmware: Firmware_v1_?
  /** Controls whether or not disks will share IOThreads. Omitting IOThreadsPolicy disables use of IOThreads. One of: shared,
auto */
  @K8sDslMarker var ioThreadsPolicy: String?
  /** Machine type. */
  val machine: Machine_v1_?
  /** Memory allow specifying the VMI memory features. */
  val memory: Memory_v1_?
  /** Resources describes the Compute Resources required by this vmi. */
  val resources: ResourceRequirements_v1_?
}

@K8sDslMarker
interface EFI_v1_: K8sManifest {
  /** If set, SecureBoot will be enabled and the OVMF roms will be swapped for SecureBoot-enabled ones. Requires SMM to be
enabled. Defaults to true */
  @K8sDslMarker var secureBoot: Boolean?
}

@K8sDslMarker
interface EmptyDiskSource_v1_: K8sManifest {
  /** Capacity of the sparse disk. */
  @K8sDslMarker var capacity: String?
}

@K8sDslMarker
interface EphemeralVolumeSource_v1_: K8sManifest {
  /** PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. Directly
attached to the vmi via qemu. More info: 
                   
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
  val persistentVolumeClaim: PersistentVolumeClaimVolumeSource_v1_?
}

@K8sDslMarker
interface FeatureAPIC_v1_: K8sManifest {
  /** Enabled determines if the feature should be enabled or disabled on the guest. Defaults to true. */
  @K8sDslMarker var enabled: Boolean?
  /** EndOfInterrupt enables the end of interrupt notification in the guest. Defaults to false. */
  @K8sDslMarker var endOfInterrupt: Boolean?
}

@K8sDslMarker
interface FeatureHyperv_v1_: K8sManifest {
  /** EVMCS Speeds up L2 vmexits, but disables other virtualization features. Requires vapic. Defaults to the machine type
setting. */
  val evmcs: FeatureState_v1_?
  /** Frequencies improves the TSC clock source handling for Hyper-V on KVM. Defaults to the machine type setting. */
  val frequencies: FeatureState_v1_?
  /** IPI improves performances in overcommited environments. Requires vpindex. Defaults to the machine type setting. */
  val ipi: FeatureState_v1_?
  /** Reenlightenment enables the notifications on TSC frequency changes. Defaults to the machine type setting. */
  val reenlightenment: FeatureState_v1_?
  /** Relaxed instructs the guest OS to disable watchdog timeouts. Defaults to the machine type setting. */
  val relaxed: FeatureState_v1_?
  /** Reset enables Hyperv reboot/reset for the vmi. Requires synic. Defaults to the machine type setting. */
  val reset: FeatureState_v1_?
  /** Runtime improves the time accounting to improve scheduling in the guest. Defaults to the machine type setting. */
  val runtime: FeatureState_v1_?
  /** Spinlocks allows to configure the spinlock retry attempts. */
  val spinlocks: FeatureSpinlocks_v1_?
  /** SyNIC enables the Synthetic Interrupt Controller. Defaults to the machine type setting. */
  val synic: FeatureState_v1_?
  /** SyNICTimer enables Synthetic Interrupt Controller Timers, reducing CPU load. Defaults to the machine type setting. */
  val synictimer: FeatureState_v1_?
  /** TLBFlush improves performances in overcommited environments. Requires vpindex. Defaults to the machine type setting. */
  val tlbflush: FeatureState_v1_?
  /** VAPIC improves the paravirtualized handling of interrupts. Defaults to the machine type setting. */
  val vapic: FeatureState_v1_?
  /** VendorID allows setting the hypervisor vendor id. Defaults to the machine type setting. */
  val vendorid: FeatureVendorID_v1_?
  /** VPIndex enables the Virtual Processor Index to help windows identifying virtual processors. Defaults to the machine type
setting. */
  val vpindex: FeatureState_v1_?
}

@K8sDslMarker
interface FeatureSpinlocks_v1_: K8sManifest {
  /** Enabled determines if the feature should be enabled or disabled on the guest. Defaults to true. */
  @K8sDslMarker var enabled: Boolean?
  /** Retries indicates the number of retries. Must be a value greater or equal 4096. Defaults to 4096. */
  @K8sDslMarker var spinlocks: Long?
}

@K8sDslMarker
interface FeatureState_v1_: K8sManifest {
  /** Enabled determines if the feature should be enabled or disabled on the guest. Defaults to true. */
  @K8sDslMarker var enabled: Boolean?
}

@K8sDslMarker
interface FeatureVendorID_v1_: K8sManifest {
  /** Enabled determines if the feature should be enabled or disabled on the guest. Defaults to true. */
  @K8sDslMarker var enabled: Boolean?
  /** VendorID sets the hypervisor vendor id, visible to the vmi. String up to twelve characters. */
  @K8sDslMarker var vendorid: String?
}

@K8sDslMarker
interface Features_v1_: K8sManifest {
  /** ACPI enables/disables ACPI insidejsondata guest. Defaults to enabled. */
  val acpi: FeatureState_v1_?
  /** Defaults to the machine type setting. */
  val apic: FeatureAPIC_v1_?
  /** Defaults to the machine type setting. */
  val hyperv: FeatureHyperv_v1_?
  /** SMM enables/disables System Management Mode. TSEG not yet implemented. */
  val smm: FeatureState_v1_?
}

@K8sDslMarker
interface Firmware_v1_: K8sManifest {
  /** Settings to control the bootloader that is used. */
  val bootloader: Bootloader_v1_?
  /** The system-serial-number in SMBIOS */
  @K8sDslMarker var serial: String?
  /** UUID reported by the vmi bios. Defaults to a random generated uid. */
  @K8sDslMarker var uuid: String?
}

@K8sDslMarker
interface FloppyTarget_v1_: K8sManifest {
  /** ReadOnly. Defaults to false. */
  @K8sDslMarker var readonly: Boolean?
  /** Tray indicates if the tray of the device is open or closed. Allowed values are "open" and "closed". Defaults to closed. */
  @K8sDslMarker var tray: String?
}

@K8sDslMarker
interface GPU_v1_: K8sManifest {
  /** Name of the GPU device as exposed by a device plugin */
  @K8sDslMarker var name: String?
  /**  */
  @K8sDslMarker var deviceName: String?
}

@K8sDslMarker
interface GroupVersionForDiscovery_v1_: K8sManifest {
  /** groupVersion specifies the API group and version in the form "group/version" */
  @K8sDslMarker var groupVersion: String?
  /** version specifies the version in the form of "version". This is to save the clients the trouble of splitting the
GroupVersion. */
  @K8sDslMarker var version: String?
}

@K8sDslMarker
interface HPETTimer_v1_: K8sManifest {
  /** Enabled set to false makes sure that the machine type or a preset can’t add the timer. Defaults to true. */
  @K8sDslMarker var present: Boolean?
  /** TickPolicy determines what happens when QEMU misses a deadline for injecting a tick to the guest. One of "delay",
"catchup", "merge", "discard". */
  @K8sDslMarker var tickPolicy: String?
}

@K8sDslMarker
interface HTTPGetAction_v1_: K8sManifest {
  /** Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead. */
  @K8sDslMarker var host: String?
  /** Custom headers to set in the request. HTTP allows repeated headers. */
  val httpHeaders: List<HTTPHeader_v1_>?
  /** Path to access on the HTTP server. */
  @K8sDslMarker var path: String?
  /** Scheme to use for connecting to the host. Defaults to HTTP. */
  @K8sDslMarker var scheme: String?
}

@K8sDslMarker
interface HTTPHeader_v1_: K8sManifest {
  /** The header field name */
  @K8sDslMarker var name: String?
  /** The header field value */
  @K8sDslMarker var value: String?
}

@K8sDslMarker
interface HostDisk_v1_: K8sManifest {
  /** Capacity of the sparse disk */
  @K8sDslMarker var capacity: String?
  /** The path to HostDisk image located on the cluster */
  @K8sDslMarker var path: String?
  /** Shared indicate whether the path is shared between nodes */
  @K8sDslMarker var shared: Boolean?
  /** Contains information if disk.img exists or should be created allowed options are 'Disk' and 'DiskOrCreate' */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface Hugepages_v1_: K8sManifest {
  /** PageSize specifies the hugepage size, for x86_64 architecture valid values are 1Gi and 2Mi. */
  @K8sDslMarker var pageSize: String?
}

@K8sDslMarker
interface HypervTimer_v1_: K8sManifest {
  /** Enabled set to false makes sure that the machine type or a preset can’t add the timer. Defaults to true. */
  @K8sDslMarker var present: Boolean?
}

@K8sDslMarker
interface I6300ESBWatchdog_v1_: K8sManifest {
  /** The action to take. Valid values are poweroff, reset, shutdown. Defaults to reset. */
  @K8sDslMarker var action: String?
}

@K8sDslMarker
interface Input_v1_: K8sManifest {
  /** Name is the device name */
  @K8sDslMarker var name: String?
  /** Bus indicates the bus of input device to emulate. Supported values: virtio, usb. */
  @K8sDslMarker var bus: String?
  /** Type indicated the type of input device. Supported values: tablet. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface Interface_v1_: K8sManifest {
  /** Logical name of the interface as well as a reference to the associated networks. Must match the Name of a Network. */
  @K8sDslMarker var name: String?
  /** BootOrder is an integer value > 0, used to determine ordering of boot devices. Lower values take precedence. Each
interface or disk that has a boot order must have a unique value. Interfaces without a boot order are not tried. */
  @K8sDslMarker var bootOrder: Int?
  /**  */
  @K8sDslMarker var bridge: Any?
  /** If specified the network interface will pass additional DHCP options to the VMI */
  val dhcpOptions: DHCPOptions_v1_?
  /** Interface MAC address. For example: de:ad:00:00:be:af or DE-AD-00-00-BE-AF. */
  @K8sDslMarker var macAddress: String?
  /**  */
  @K8sDslMarker var masquerade: Any?
  /** Interface model. One of: e1000, e1000e, ne2k_pci, pcnet, rtl8139, virtio. Defaults to virtio. */
  @K8sDslMarker var model: String?
  /** If specified, the virtual network interface will be placed on the guests pci address with the specifed PCI address. For
example: 0000:81:01.10 */
  @K8sDslMarker var pciAddress: String?
  /** List of ports to be forwarded to the virtual machine. */
  val ports: List<Port_v1_>?
  /**  */
  @K8sDslMarker var slirp: Any?
  /**  */
  @K8sDslMarker var sriov: Any?
  /** If specified, the virtual network interface address and its tag will be provided to the guest via config drive */
  @K8sDslMarker var tag: String?
}

@K8sDslMarker
interface KVMTimer_v1_: K8sManifest {
  /** Enabled set to false makes sure that the machine type or a preset can’t add the timer. Defaults to true. */
  @K8sDslMarker var present: Boolean?
}

@K8sDslMarker
interface LabelSelector_v1_: K8sManifest {
  /** matchExpressions is a list of label selector requirements. The requirements are ANDed. */
  val matchExpressions: List<LabelSelectorRequirement_v1_>?
  /** matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of
matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The
requirements are ANDed. */
  @K8sDslMarker var matchLabels: Map<String,String>?
}

@K8sDslMarker
interface LabelSelectorRequirement_v1_: K8sManifest {
  /** key is the label key that the selector applies to. */
  @K8sDslMarker var key: String?
  /** operator represents a key’s relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist. */
  @K8sDslMarker var operator: String?
  /** values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator
is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch. */
  @K8sDslMarker var values: List<String>?
}

@K8sDslMarker
interface ListMeta_v1_: K8sManifest {
  /** continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data
available. The value is opaque and may be used to issue another request to the endpoint that served this list to
retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration
has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value
will be identical to the value in the first response, unless you have received this token from an error message. */
  @K8sDslMarker var `continue`: String?
  /** remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the
list request contained label or field selectors, then the number of remaining items is unknown and the field will be
left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this
is the last chunk), then there are no more remaining items and this field will be left unset and omitted during
serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is 
          
estimating the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact. */
  @K8sDslMarker var remainingItemCount: Long?
  /** String that identifies the server’s internal version of this object that can be used by clients to determine when
objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by
the system. Read-only. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency */
  @K8sDslMarker var resourceVersion: String?
  /** selfLink is a URL representing this object. Populated by the system. Read-only.
                    DEPRECATED
Kubernetes will stop propagating this field in 1.20 release and the field is planned to be removed in 1.21 release. */
  @K8sDslMarker var selfLink: String?
}

@K8sDslMarker
interface LocalObjectReference_v1_: K8sManifest {
  /** Name of the referent. More info: 
                   
https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
}

@K8sDslMarker
interface LunTarget_v1_: K8sManifest {
  /** Bus indicates the type of disk device to emulate. supported values: virtio, sata, scsi. */
  @K8sDslMarker var bus: String?
  /** ReadOnly. Defaults to false. */
  @K8sDslMarker var readonly: Boolean?
}

@K8sDslMarker
interface Machine_v1_: K8sManifest {
  /** QEMU machine type is the actual chipset of the VirtualMachineInstance. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface ManagedFieldsEntry_v1_: K8sManifest {
  /** APIVersion defines the version of this resource that this field set applies to. The format is "group/version" just like
the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically
converted. */
  @K8sDslMarker var apiVersion: String?
  /** FieldsType is the discriminator for the different fields format and version. There is currently only one possible value:
"FieldsV1" */
  @K8sDslMarker var fieldsType: String?
  /** FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.

			FieldsV1 stores a set of fields in
a data structure like a Trie, in JSON format.

Each key is either a '.' representing the field itself, and will
always
map to an empty set, or a string representing a sub-field or
item. The string will follow one of these four
formats:
'f:<name>', where <name> is the name of a field in a struct,
or key in a map 'v:<value>', where <value> is the
exact
json formatted value of a list item 'i:<index>', where
<index> is position of a item in a list 'k:<keys>',
where
<keys> is a map of a list item’s key fields to their unique values
If a key maps to an empty Fields value, the
field that key represents
is part of the set. */
  @K8sDslMarker var fieldsV1: String?
  /** Manager is an identifier of the workflow managing these fields. */
  @K8sDslMarker var manager: String?
  /** Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this
field are 'Apply' and 'Update'. */
  @K8sDslMarker var operation: String?
  /** Time is timestamp of when these fields were set. It should always be empty if Operation is 'Apply'

			Time is a wrapper
around time.Time which supports correct marshaling
to YAML and JSON. Wrappers are provided for many of the factory
methods
that the time package offers. */
  @K8sDslMarker var time: String?
}

@K8sDslMarker
interface Memory_v1_: K8sManifest {
  /** Guest allows to specifying the amount of memory which is visible inside the Guest OS. The Guest must lie between
Requests and Limits from the resources section. Defaults to the requested memory in the resources section if not
specified. */
  @K8sDslMarker var guest: String?
  /** Hugepages allow to use hugepages for the VirtualMachineInstance instead of regular memory. */
  val hugepages: Hugepages_v1_?
}

@K8sDslMarker
interface MultusNetwork_v1_: K8sManifest {
  /** Select the default network and add it to the multus-cni.io/default-network annotation. */
  @K8sDslMarker var default: Boolean?
  /** References to a NetworkAttachmentDefinition CRD object. Format: <networkName>, <namespace>/<networkName>. If namespace
is not specified, VMI namespace is assumed. */
  @K8sDslMarker var networkName: String?
}

@K8sDslMarker
interface Network_v1_: K8sManifest {
  /** Network name. Must be a DNS_LABEL and unique within the vm. More info: 
                   
https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /**  */
  val multus: MultusNetwork_v1_?
  /**  */
  val pod: PodNetwork_v1_?
}

@K8sDslMarker
interface NodeAffinity_v1_: K8sManifest {
  /** The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but
it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the
greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request,
requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and
adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are
the most preferred. */
  val preferredDuringSchedulingIgnoredDuringExecution: List<PreferredSchedulingTerm_v1_>?
  /** If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto
the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g.
due to an update), the system may or may not try to eventually evict the pod from its node. */
  val requiredDuringSchedulingIgnoredDuringExecution: NodeSelector_v1_?
}

@K8sDslMarker
interface NodeSelector_v1_: K8sManifest {
  /** Required. A list of node selector terms. The terms are ORed. */
  val nodeSelectorTerms: List<NodeSelectorTerm_v1_>?
}

@K8sDslMarker
interface NodeSelectorRequirement_v1_: K8sManifest {
  /** The label key that the selector applies to. */
  @K8sDslMarker var key: String?
  /** Represents a key’s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt. */
  @K8sDslMarker var operator: String?
  /** An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists
or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single
element, which will be interpreted as an integer. This array is replaced during a strategic merge patch. */
  @K8sDslMarker var values: List<String>?
}

@K8sDslMarker
interface NodeSelectorTerm_v1_: K8sManifest {
  /** A list of node selector requirements by node’s labels. */
  val matchExpressions: List<NodeSelectorRequirement_v1_>?
  /** A list of node selector requirements by node’s fields. */
  val matchFields: List<NodeSelectorRequirement_v1_>?
}

@K8sDslMarker
interface ObjectMeta_v1_: K8sManifest {
  /** Namespace defines the space within each name must be unique. An empty namespace is equivalent to the "default"
namespace, but "default" is the canonical representation. Not all objects are required to be scoped to a namespace - the
value of this field for those objects will be empty.
                    Must be a DNS_LABEL. Cannot be updated. More
info: 
                    http://kubernetes.io/docs/user-guide/namespaces */
  @K8sDslMarker var namespace: String?
  /** Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client
to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and
configuration definition. Cannot be updated. More info: 
                   
http://kubernetes.io/docs/user-guide/identifiers#names */
  @K8sDslMarker var name: String?
  /** Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match
selectors of replication controllers and services. More info: 
                   
http://kubernetes.io/docs/user-guide/labels */
  @K8sDslMarker var labels: Map<String,String>?
  /** Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and
retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: 
        
http://kubernetes.io/docs/user-guide/annotations */
  @K8sDslMarker var annotations: Map<String,String>?
  /** The name of the cluster which the object belongs to. This is used to distinguish resources with same name and namespace
in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or
update request. */
  @K8sDslMarker var clusterName: String?
  /** Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set
when deletionTimestamp is also set. May only be shortened. Read-only. */
  @K8sDslMarker var deletionGracePeriodSeconds: Long?
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
requested.
                    Populated by the system when a graceful deletion is requested. Read-only. More info: 
   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata

			Time is a wrapper
around time.Time which supports correct marshaling
to YAML and JSON. Wrappers are provided for many of the factory
methods
that the time package offers. */
  @K8sDslMarker var deletionTimestamp: String?
  /** Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component
that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can
only be removed. */
  @K8sDslMarker var finalizers: List<String>?
  /** GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been
provided. If this field is used, the name returned to the client will be different than the name passed. This value will
also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be
truncated by the length of the suffix required to make the value unique on the server.
                    If this field
is specified and the generated name exists, the server will NOT return a 409 - instead, it will either return 201
Created or 500 with Reason ServerTimeout indicating a unique name could not be found in the time allotted, and the
client should retry (optionally after the time indicated in the Retry-After header).
                    Applied only if
Name is not specified. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#idempotency */
  @K8sDslMarker var generateName: String?
  /** A sequence number representing a specific generation of the desired state. Populated by the system. Read-only. */
  @K8sDslMarker var generation: Long?
  /** ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow. This is mostly for
internal housekeeping, and users typically shouldn’t need to set or understand this field. A workflow can be the user’s
name, a controller’s name, or the name of a specific apply path like "ci-cd". The set of fields is always in the version
that the workflow used when modifying the object. */
  val managedFields: List<ManagedFieldsEntry_v1_>?
  /** List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage
collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the
controller field set to true. There cannot be more than one managing controller. */
  val ownerReferences: List<OwnerReference_v1_>?
  /** An opaque value that represents the internal version of this object that can be used by clients to determine when
objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or
set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be
valid for a particular resource or set of resources.
                    Populated by the system. Read-only. Value must
be treated as opaque by clients and . More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency */
  @K8sDslMarker var resourceVersion: String?
  /** SelfLink is a URL representing this object. Populated by the system. Read-only.
                    DEPRECATED
Kubernetes will stop propagating this field in 1.20 release and the field is planned to be removed in 1.21 release. */
  @K8sDslMarker var selfLink: String?
  /** UID is the unique in time and space value for this object. It is typically generated by the server on successful
creation of a resource and is not allowed to change on PUT operations.
                    Populated by the system.
Read-only. More info: 
                    http://kubernetes.io/docs/user-guide/identifiers#uids */
  @K8sDslMarker var uid: String?
}

@K8sDslMarker
interface OwnerReference_v1_: K8sTopLevel {
  /** API version of the referent. */
  override val apiVersion: String
    get() = "v1"
  /** Kind of the referent. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "OwnerReference"
  /** Name of the referent. More info: 
                    http://kubernetes.io/docs/user-guide/identifiers#names */
  @K8sDslMarker var name: String?
  /** If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be deleted from the key-value
store until this reference is removed. Defaults to false. To set this field, a user needs "delete" permission of the
owner, otherwise 422 (Unprocessable Entity) will be returned. */
  @K8sDslMarker var blockOwnerDeletion: Boolean?
  /** If true, this reference points to the managing controller. */
  @K8sDslMarker var controller: Boolean?
  /** UID of the referent. More info: 
                    http://kubernetes.io/docs/user-guide/identifiers#uids */
  @K8sDslMarker var uid: String?
}

@K8sDslMarker
interface PITTimer_v1_: K8sManifest {
  /** Enabled set to false makes sure that the machine type or a preset can’t add the timer. Defaults to true. */
  @K8sDslMarker var present: Boolean?
  /** TickPolicy determines what happens when QEMU misses a deadline for injecting a tick to the guest. One of "delay",
"catchup", "discard". */
  @K8sDslMarker var tickPolicy: String?
}

@K8sDslMarker
interface PersistentVolumeClaim_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "PersistentVolumeClaim"
  /** Standard object’s metadata. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_
  /** Spec defines the desired characteristics of a volume requested by a pod author. More info: 
                   
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
  val spec: PersistentVolumeClaimSpec_v1_
  /** Status represents the current information/status of a persistent volume claim. Read-only. More info: 
                  
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
  val status: PersistentVolumeClaimStatus_v1_?
}

@K8sDslMarker
interface PersistentVolumeClaimCondition_v1_: K8sManifest {
  /** Human-readable message indicating details about last transition. */
  @K8sDslMarker var message: String?
  /** Unique, this should be a short, machine understandable string that gives the reason for condition’s last transition. If
it reports "ResizeStarted" that means the underlying persistent volume is being resized. */
  @K8sDslMarker var reason: String?
  /**  */
  @K8sDslMarker var status: String?
  /**  */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface PersistentVolumeClaimSpec_v1_: K8sManifest {
  /** AccessModes contains the desired access modes the volume should have. More info: 
                   
https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1 */
  @K8sDslMarker var accessModes: List<String>?
  /** This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and currently VolumeSnapshot is the
only supported data source. If the provisioner can support VolumeSnapshot data source, it will create a new volume and
data will be restored to the volume at the same time. If the provisioner does not support VolumeSnapshot data source,
volume will not be created and the failure will be reported as an event. In the future, we plan to support more data
source types and the behavior of the provisioner may change. */
  val dataSource: TypedLocalObjectReference_v1_?
  /** Resources represents the minimum resources the volume should have. More info: 
                   
https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources */
  val resources: ResourceRequirements_v1_?
  /** A label query over volumes to consider for binding. */
  val selector: LabelSelector_v1_?
  /** Name of the StorageClass required by the claim. More info: 
                   
https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1 */
  @K8sDslMarker var storageClassName: String?
  /** volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in
claim spec. This is a beta feature. */
  @K8sDslMarker var volumeMode: String?
  /** VolumeName is the binding reference to the PersistentVolume backing this claim. */
  @K8sDslMarker var volumeName: String?
}

@K8sDslMarker
interface PersistentVolumeClaimStatus_v1_: K8sManifest {
  /** AccessModes contains the actual access modes the volume backing the PVC has. More info: 
                   
https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1 */
  @K8sDslMarker var accessModes: List<String>?
  /** Represents the actual resources of the underlying volume. */
  @K8sDslMarker var capacity: String?
  /** Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will
be set to 'ResizeStarted'. */
  val conditions: List<PersistentVolumeClaimCondition_v1_>?
  /** Phase represents the current phase of PersistentVolumeClaim. */
  @K8sDslMarker var phase: String?
}

@K8sDslMarker
interface PersistentVolumeClaimVolumeSource_v1_: K8sManifest {
  /** ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: 
       
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
  @K8sDslMarker var claimName: String?
  /** Will force the ReadOnly setting in VolumeMounts. Default false. */
  @K8sDslMarker var readOnly: Boolean?
}

@K8sDslMarker
interface PodAffinity_v1_: K8sManifest {
  /** The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but
it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the
greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request,
requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and
adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the
highest sum are the most preferred. */
  val preferredDuringSchedulingIgnoredDuringExecution: List<WeightedPodAffinityTerm_v1_>?
  /** If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto
the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g.
due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are
multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be
satisfied. */
  val requiredDuringSchedulingIgnoredDuringExecution: List<PodAffinityTerm_v1_>?
}

@K8sDslMarker
interface PodAffinityTerm_v1_: K8sManifest {
  /** A label query over a set of resources, in this case pods. */
  val labelSelector: LabelSelector_v1_?
  /** namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means "this
pod’s namespace" */
  @K8sDslMarker var namespaces: List<String>?
  /** This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in
the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey
matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed. */
  @K8sDslMarker var topologyKey: String?
}

@K8sDslMarker
interface PodAntiAffinity_v1_: K8sManifest {
  /** The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field,
but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with
the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request,
requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field
and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with
the highest sum are the most preferred. */
  val preferredDuringSchedulingIgnoredDuringExecution: List<WeightedPodAffinityTerm_v1_>?
  /** If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled
onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod
execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node.
When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all
terms must be satisfied. */
  val requiredDuringSchedulingIgnoredDuringExecution: List<PodAffinityTerm_v1_>?
}

@K8sDslMarker
interface PodDNSConfig_v1_: K8sManifest {
  /** A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy.
Duplicated nameservers will be removed. */
  @K8sDslMarker var nameservers: List<String>?
  /** A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries
will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy. */
  val options: List<PodDNSConfigOption_v1_>?
  /** A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from
DNSPolicy. Duplicated search paths will be removed. */
  @K8sDslMarker var searches: List<String>?
}

@K8sDslMarker
interface PodDNSConfigOption_v1_: K8sManifest {
  /** Required. */
  @K8sDslMarker var name: String?
  /**  */
  @K8sDslMarker var value: String?
}

@K8sDslMarker
interface PodNetwork_v1_: K8sManifest {
  /** CIDR for vm network. Default 10.0.2.0/24 if not specified. */
  @K8sDslMarker var vmNetworkCIDR: String?
}

@K8sDslMarker
interface Port_v1_: K8sManifest {
  /** If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name.
Name for the port that can be referred to by services. */
  @K8sDslMarker var name: String?
  /** Number of port to expose for the virtual machine. This must be a valid port number, 0 < x < 65536. */
  @K8sDslMarker var port: Int?
  /** Protocol for port. Must be UDP or TCP. Defaults to "TCP". */
  @K8sDslMarker var protocol: String?
}

@K8sDslMarker
interface Preconditions_v1_: K8sManifest {
  /** Specifies the target ResourceVersion */
  @K8sDslMarker var resourceVersion: String?
  /** Specifies the target UID. */
  @K8sDslMarker var uid: String?
}

@K8sDslMarker
interface PreferredSchedulingTerm_v1_: K8sManifest {
  /** A node selector term, associated with the corresponding weight. */
  val preference: NodeSelectorTerm_v1_?
  /** Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100. */
  @K8sDslMarker var weight: Int?
}

@K8sDslMarker
interface Probe_v1_: K8sManifest {
  /** Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value
is 1. */
  @K8sDslMarker var failureThreshold: Int?
  /** HTTPGet specifies the http request to perform. */
  val httpGet: HTTPGetAction_v1_?
  /** Number of seconds after the VirtualMachineInstance has started before liveness probes are initiated. More info: 
       
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  @K8sDslMarker var initialDelaySeconds: Int?
  /** How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. */
  @K8sDslMarker var periodSeconds: Int?
  /** Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1
for liveness. Minimum value is 1. */
  @K8sDslMarker var successThreshold: Int?
  /** TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported */
  val tcpSocket: TCPSocketAction_v1_?
  /** Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: 
               
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  @K8sDslMarker var timeoutSeconds: Int?
}

@K8sDslMarker
interface RTCTimer_v1_: K8sManifest {
  /** Enabled set to false makes sure that the machine type or a preset can’t add the timer. Defaults to true. */
  @K8sDslMarker var present: Boolean?
  /** TickPolicy determines what happens when QEMU misses a deadline for injecting a tick to the guest. One of "delay",
"catchup". */
  @K8sDslMarker var tickPolicy: String?
  /** Track the guest or the wall clock. */
  @K8sDslMarker var track: String?
}

@K8sDslMarker
interface ResourceRequirements_v1_: K8sManifest {
  /** Limits describes the maximum amount of compute resources allowed. Valid resource keys are "memory" and "cpu". */
  var limits: de.loosetie.k8s.dsl.types.CpuMem?
  /** Don’t ask the scheduler to take the guest-management overhead into account. Instead put the overhead only into the
container’s memory limit. This can lead to crashes if all memory is in use on a node. Defaults to false. */
  @K8sDslMarker var overcommitGuestOverhead: Boolean?
  /** Requests is a description of the initial vmi resources. Valid resource keys are "memory" and "cpu". */
  var requests: de.loosetie.k8s.dsl.types.CpuMem?
}

@K8sDslMarker
interface RestartOptions_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "RestartOptions"
  /** The duration in seconds before the object should be force-restared. Value must be non-negative integer. The value zero
indicates, restart immediately. If this value is nil, the default grace period for deletion of the corresponding VMI for
the specified type will be used to determine on how much time to give the VMI to restart. Defaults to a per object value
if not specified. zero means restart immediately. Allowed Values: nil and 0 */
  @K8sDslMarker var gracePeriodSeconds: Long?
}

@K8sDslMarker
interface RootPaths_v1_: K8sManifest {
  /** paths are the paths available at root. */
  @K8sDslMarker var paths: List<String>?
}

@K8sDslMarker
interface SecretVolumeSource_v1_: K8sManifest {
  /** Specify whether the Secret or it’s keys must be defined */
  @K8sDslMarker var optional: Boolean?
  /** Name of the secret in the pod’s namespace to use. More info: 
                   
https://kubernetes.io/docs/concepts/storage/volumes#secret */
  @K8sDslMarker var secretName: String?
  /** The volume label of the resulting disk inside the VMI. Different bootstrapping mechanisms require different values.
Typical values are "cidata" (cloud-init), "config-2" (cloud-init) or "OEMDRV" (kickstart). */
  @K8sDslMarker var volumeLabel: String?
}

@K8sDslMarker
interface ServerAddressByClientCIDR_v1_: K8sManifest {
  /** The CIDR with which clients can match their IP to figure out the server address that they should use. */
  @K8sDslMarker var clientCIDR: String?
  /** Address of this server, suitable for a client that matches the above CIDR. This can be a hostname, hostname:port, IP or
IP:port. */
  @K8sDslMarker var serverAddress: String?
}

@K8sDslMarker
interface ServiceAccountVolumeSource_v1_: K8sManifest {
  /** Name of the service account in the pod’s namespace to use. More info: 
                   
https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/ */
  @K8sDslMarker var serviceAccountName: String?
}

@K8sDslMarker
interface Status_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Status"
  /** Standard list metadata. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  val metadata: ListMeta_v1_
  /** Suggested HTTP return code for this status, 0 if not set. */
  @K8sDslMarker var code: Int?
  /** Extended data associated with the reason. Each reason may define its own extended details. This field is optional and
the data returned is not guaranteed to conform to any schema except that defined by the reason type. */
  val details: StatusDetails_v1_?
  /** A human-readable description of the status of this operation. */
  @K8sDslMarker var message: String?
  /** A machine-readable description of why this operation is in the "Failure" status. If this value is empty there is no
information available. A Reason clarifies an HTTP status code but does not override it. */
  @K8sDslMarker var reason: String?
  /** Status of the operation. One of: "Success" or "Failure". More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  @K8sDslMarker var status: String?
}

@K8sDslMarker
interface StatusCause_v1_: K8sManifest {
  /** The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix
notation for nested attributes. Arrays are zero-indexed. Fields may appear more than once in an array of causes due to
fields having multiple errors. Optional.
                    Examples: "name" - the field "name" on the current resource
"items[0].name" - the field "name" on the first array entry in "items" */
  @K8sDslMarker var field: String?
  /** A human-readable description of the cause of the error. This field may be presented as-is to a reader. */
  @K8sDslMarker var message: String?
  /** A machine-readable description of the cause of the error. If this value is empty there is no information available. */
  @K8sDslMarker var reason: String?
}

@K8sDslMarker
interface StatusDetails_v1_: K8sManifest {
  /** The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the
requested resource Kind. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  @K8sDslMarker var kind: String?
  /** The name attribute of the resource associated with the status StatusReason (when there is a single name which can be
described). */
  @K8sDslMarker var name: String?
  /** The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide
detailed causes. */
  val causes: List<StatusCause_v1_>?
  /** The group attribute of the resource associated with the status StatusReason. */
  @K8sDslMarker var group: String?
  /** If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take
an alternate action - for those errors this field may indicate how long to wait before taking the alternate action. */
  @K8sDslMarker var retryAfterSeconds: Int?
  /** UID of the resource. (when there is a single resource which can be described). More info: 
                   
http://kubernetes.io/docs/user-guide/identifiers#uids */
  @K8sDslMarker var uid: String?
}

@K8sDslMarker
interface TCPSocketAction_v1_: K8sManifest {
  /** Optional: Host name to connect to, defaults to the pod IP. */
  @K8sDslMarker var host: String?
}

@K8sDslMarker
interface Timer_v1_: K8sManifest {
  /** HPET (High Precision Event Timer) - multiple timers with periodic interrupts. */
  val hpet: HPETTimer_v1_?
  /** Hyperv (Hypervclock) - lets guests read the host’s wall clock time (paravirtualized). For windows guests. */
  val hyperv: HypervTimer_v1_?
  /** KVM (KVM clock) - lets guests read the host’s wall clock time (paravirtualized). For linux guests. */
  val kvm: KVMTimer_v1_?
  /** PIT (Programmable Interval Timer) - a timer with periodic interrupts. */
  val pit: PITTimer_v1_?
  /** RTC (Real Time Clock) - a continuously running timer with periodic interrupts. */
  val rtc: RTCTimer_v1_?
}

@K8sDslMarker
interface Toleration_v1_: K8sManifest {
  /** Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are
NoSchedule, PreferNoSchedule and NoExecute. */
  @K8sDslMarker var effect: String?
  /** Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator
must be Exists; this combination means to match all values and all keys. */
  @K8sDslMarker var key: String?
  /** Operator represents a key’s relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists
is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category. */
  @K8sDslMarker var operator: String?
  /** TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field
is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero
and negative values will be treated as 0 (evict immediately) by the system. */
  @K8sDslMarker var tolerationSeconds: Long?
  /** Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just
a regular string. */
  @K8sDslMarker var value: String?
}

@K8sDslMarker
interface TypedLocalObjectReference_v1_: K8sManifest {
  /** Kind is the type of resource being referenced */
  @K8sDslMarker var kind: String?
  /** Name is the name of resource being referenced */
  @K8sDslMarker var name: String?
  /** APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the
core API group. For any other third-party types, APIGroup is required. */
  @K8sDslMarker var apiGroup: String?
}

@K8sDslMarker
interface VirtualMachine_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VirtualMachine"
  /**  */
  val metadata: ObjectMeta_v1_
  /** Spec contains the specification of VirtualMachineInstance created */
  val spec: VirtualMachineSpec_v1_
  /** Status holds the current state of the controller and brief information about its associated VirtualMachineInstance */
  val status: VirtualMachineStatus_v1_?
}

@K8sDslMarker
interface VirtualMachineCondition_v1_: K8sManifest {
  /** string */
  // val message: None
  /** string */
  // val reason: None
  /** string */
  // val status: None
  /** string */
  // val type: None
}

@K8sDslMarker
interface VirtualMachineInstance_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VirtualMachineInstance"
  /**  */
  val metadata: ObjectMeta_v1_
  /** VirtualMachineInstance Spec contains the VirtualMachineInstance specification. */
  val spec: VirtualMachineInstanceSpec_v1_
  /** Status is the high level overview of how the VirtualMachineInstance is doing. It contains information available to
controllers and users. */
  val status: VirtualMachineInstanceStatus_v1_?
}

@K8sDslMarker
interface VirtualMachineInstanceCondition_v1_: K8sManifest {
  /** string */
  // val message: None
  /** string */
  // val reason: None
  /** string */
  // val status: None
  /** string */
  // val type: None
}

@K8sDslMarker
interface VirtualMachineInstanceFileSystem_v1_: K8sManifest {
  /** string */
  // val diskName: None
  /** string */
  // val fileSystemType: None
  /** string */
  // val mountPoint: None
  /** integer (int32) */
  // val totalBytes: None
  /** integer (int32) */
  // val usedBytes: None
}

@K8sDslMarker
interface VirtualMachineInstanceFileSystemInfo_v1_: K8sManifest {
  /** < 
                    v1.VirtualMachineInstanceFileSystem > array */
  // val disks: None
}

@K8sDslMarker
interface VirtualMachineInstanceFileSystemList_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VirtualMachineInstanceFileSystemList"
  /**  */
  val metadata: ListMeta_v1_
  /**  */
  val items: List<VirtualMachineInstanceFileSystem_v1_>?
}

@K8sDslMarker
interface VirtualMachineInstanceGuestAgentInfo_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VirtualMachineInstanceGuestAgentInfo"
  /** FSInfo is a guest os filesystem information containing the disk mapping and disk mounts with usage */
  val fsInfo: VirtualMachineInstanceFileSystemInfo_v1_?
  /** GAVersion is a version of currently installed guest agent */
  @K8sDslMarker var guestAgentVersion: String?
  /** Hostname represents FQDN of a guest */
  @K8sDslMarker var hostname: String?
  /** OS contains the guest operating system information */
  val os: VirtualMachineInstanceGuestOSInfo_v1_?
  /** Timezone is guest os current timezone */
  @K8sDslMarker var timezone: String?
  /** UserList is a list of active guest OS users */
  val userList: List<VirtualMachineInstanceGuestOSUser_v1_>?
}

@K8sDslMarker
interface VirtualMachineInstanceGuestOSInfo_v1_: K8sManifest {
  /** Name of the Guest OS */
  @K8sDslMarker var name: String?
  /** Guest OS Id */
  @K8sDslMarker var id: String?
  /** Guest OS Kernel Release */
  @K8sDslMarker var kernelRelease: String?
  /** Kernel version of the Guest OS */
  @K8sDslMarker var kernelVersion: String?
  /** Machine type of the Guest OS */
  @K8sDslMarker var machine: String?
  /** Guest OS Pretty Name */
  @K8sDslMarker var prettyName: String?
  /** Guest OS Version */
  @K8sDslMarker var version: String?
  /** Version ID of the Guest OS */
  @K8sDslMarker var versionId: String?
}

@K8sDslMarker
interface VirtualMachineInstanceGuestOSUser_v1_: K8sManifest {
  /** string */
  // val domain: None
  /** number (double) */
  // val loginTime: None
  /** string */
  // val userName: None
}

@K8sDslMarker
interface VirtualMachineInstanceGuestOSUserList_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VirtualMachineInstanceGuestOSUserList"
  /**  */
  val metadata: ListMeta_v1_
  /**  */
  val items: List<VirtualMachineInstanceGuestOSUser_v1_>?
}

@K8sDslMarker
interface VirtualMachineInstanceList_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VirtualMachineInstanceList"
  /**  */
  val metadata: ListMeta_v1_
  /**  */
  val items: List<VirtualMachineInstance_v1_>?
}

@K8sDslMarker
interface VirtualMachineInstanceMigration_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VirtualMachineInstanceMigration"
  /**  */
  val metadata: ObjectMeta_v1_
  /**  */
  val spec: VirtualMachineInstanceMigrationSpec_v1_
  /**  */
  val status: VirtualMachineInstanceMigrationStatus_v1_?
}

@K8sDslMarker
interface VirtualMachineInstanceMigrationCondition_v1_: K8sManifest {
  /** string */
  // val message: None
  /** string */
  // val reason: None
  /** string */
  // val status: None
  /** string */
  // val type: None
}

@K8sDslMarker
interface VirtualMachineInstanceMigrationList_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VirtualMachineInstanceMigrationList"
  /**  */
  val metadata: ListMeta_v1_
  /**  */
  val items: List<VirtualMachineInstanceMigration_v1_>?
}

@K8sDslMarker
interface VirtualMachineInstanceMigrationSpec_v1_: K8sManifest {
  /** The name of the VMI to perform the migration on. VMI must exist in the migration objects namespace */
  @K8sDslMarker var vmiName: String?
}

@K8sDslMarker
interface VirtualMachineInstanceMigrationState_v1_: K8sManifest {
  /** Indicates that the migration has been requested to abort */
  @K8sDslMarker var abortRequested: Boolean?
  /** Indicates the final status of the live migration abortion */
  @K8sDslMarker var abortStatus: String?
  /** Indicates the migration completed */
  @K8sDslMarker var completed: Boolean?
  /** The time the migration action ended

			Time is a wrapper around time.Time which supports correct marshaling
to YAML and
JSON. Wrappers are provided for many of the factory methods
that the time package offers. */
  @K8sDslMarker var endTimestamp: String?
  /** Indicates that the migration failed */
  @K8sDslMarker var failed: Boolean?
  /** The VirtualMachineInstanceMigration object associated with this migration */
  @K8sDslMarker var migrationUid: String?
  /** The source node that the VMI originated on */
  @K8sDslMarker var sourceNode: String?
  /** The time the migration action began

			Time is a wrapper around time.Time which supports correct marshaling
to YAML and
JSON. Wrappers are provided for many of the factory methods
that the time package offers. */
  @K8sDslMarker var startTimestamp: String?
  /** The list of ports opened for live migration on the destination node */
  @K8sDslMarker var targetDirectMigrationNodePorts: Map<String, Int>?
  /** The target node that the VMI is moving to */
  @K8sDslMarker var targetNode: String?
  /** The address of the target node to use for the migration */
  @K8sDslMarker var targetNodeAddress: String?
  /** The Target Node has seen the Domain Start Event */
  @K8sDslMarker var targetNodeDomainDetected: Boolean?
  /** The target pod that the VMI is moving to */
  @K8sDslMarker var targetPod: String?
}

@K8sDslMarker
interface VirtualMachineInstanceMigrationStatus_v1_: K8sManifest {
  /** < 
                    v1.VirtualMachineInstanceMigrationCondition > array */
  // val conditions: None
  /** string */
  // val phase: None
}

@K8sDslMarker
interface VirtualMachineInstanceNetworkInterface_v1_: K8sManifest {
  /** Name of the interface, corresponds to name of the network assigned to the interface */
  @K8sDslMarker var name: String?
  /** The interface name inside the Virtual Machine */
  @K8sDslMarker var interfaceName: String?
  /** IP address of a Virtual Machine interface. It is always the first item of IPs */
  @K8sDslMarker var ipAddress: String?
  /** List of all IP addresses of a Virtual Machine interface */
  @K8sDslMarker var ipAddresses: List<String>?
  /** Hardware address of a Virtual Machine interface */
  @K8sDslMarker var mac: String?
}

@K8sDslMarker
interface VirtualMachineInstancePreset_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VirtualMachineInstancePreset"
  /**  */
  val metadata: ObjectMeta_v1_
  /** VirtualMachineInstance Spec contains the VirtualMachineInstance specification. */
  val spec: VirtualMachineInstancePresetSpec_v1_
}

@K8sDslMarker
interface VirtualMachineInstancePresetList_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VirtualMachineInstancePresetList"
  /**  */
  val metadata: ListMeta_v1_
  /**  */
  val items: List<VirtualMachineInstancePreset_v1_>?
}

@K8sDslMarker
interface VirtualMachineInstancePresetSpec_v1_: K8sManifest {
  /** Domain is the same object type as contained in VirtualMachineInstanceSpec */
  val domain: DomainSpec_v1_?
  /** Selector is a label query over a set of VMIs. Required. */
  val selector: LabelSelector_v1_?
}

@K8sDslMarker
interface VirtualMachineInstanceReplicaSet_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VirtualMachineInstanceReplicaSet"
  /**  */
  val metadata: ObjectMeta_v1_
  /** VirtualMachineInstance Spec contains the VirtualMachineInstance specification. */
  val spec: VirtualMachineInstanceReplicaSetSpec_v1_
  /** Status is the high level overview of how the VirtualMachineInstance is doing. It contains information available to
controllers and users. */
  val status: VirtualMachineInstanceReplicaSetStatus_v1_?
}

@K8sDslMarker
interface VirtualMachineInstanceReplicaSetCondition_v1_: K8sManifest {
  /** string */
  // val message: None
  /** string */
  // val reason: None
  /** string */
  // val status: None
  /** string */
  // val type: None
}

@K8sDslMarker
interface VirtualMachineInstanceReplicaSetList_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VirtualMachineInstanceReplicaSetList"
  /**  */
  val metadata: ListMeta_v1_
  /**  */
  val items: List<VirtualMachineInstanceReplicaSet_v1_>?
}

@K8sDslMarker
interface VirtualMachineInstanceReplicaSetSpec_v1_: K8sManifest {
  /** Indicates that the replica set is paused. */
  @K8sDslMarker var paused: Boolean?
  /** Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1. */
  @K8sDslMarker var replicas: Int?
  /** Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this
deployment. */
  val selector: LabelSelector_v1_?
  /** Template describes the pods that will be created. */
  val template: VirtualMachineInstanceTemplateSpec_v1_?
}

@K8sDslMarker
interface VirtualMachineInstanceReplicaSetStatus_v1_: K8sManifest {
  /**  */
  val conditions: List<VirtualMachineInstanceReplicaSetCondition_v1_>?
  /** Canonical form of the label selector for HPA which consumes it through the scale subresource. */
  @K8sDslMarker var labelSelector: String?
  /** The number of ready replicas for this replica set. */
  @K8sDslMarker var readyReplicas: Int?
  /** Total number of non-terminated pods targeted by this deployment (their labels match the selector). */
  @K8sDslMarker var replicas: Int?
}

@K8sDslMarker
interface VirtualMachineInstanceSpec_v1_: K8sManifest {
  /** If affinity is specifies, obey all the affinity rules */
  val affinity: Affinity_v1_?
  /** Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based
on DNSPolicy. */
  val dnsConfig: PodDNSConfig_v1_?
  /** Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst',
'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have
DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'. */
  @K8sDslMarker var dnsPolicy: String?
  /** Specification of the desired behavior of the VirtualMachineInstance on the host. */
  val domain: DomainSpec_v1_?
  /** EvictionStrategy can be set to "LiveMigrate" if the VirtualMachineInstance should be migrated instead of shut-off in
case of a node drain. */
  @K8sDslMarker var evictionStrategy: String?
  /** Specifies the hostname of the vmi If not specified, the hostname will be set to the name of the vmi, if dhcp or
cloud-init is configured properly. */
  @K8sDslMarker var hostname: String?
  /** Periodic probe of VirtualMachineInstance liveness. VirtualmachineInstances will be stopped if the probe fails. Cannot be
updated. More info: 
                   
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val livenessProbe: Probe_v1_?
  /** List of networks that can be attached to a vm’s virtual interface. */
  val networks: List<Network_v1_>?
  /** NodeSelector is a selector which must be true for the vmi to fit on a node. Selector which must match a node’s labels
for the vmi to be scheduled on that node. More info: 
                   
https://kubernetes.io/docs/concepts/configuration/assign-pod-node/ */
  @K8sDslMarker var nodeSelector: Map<String,String>?
  /** If specified, indicates the pod’s priority. If not specified, the pod priority will be default or zero if there is no
default. */
  @K8sDslMarker var priorityClassName: String?
  /** Periodic probe of VirtualMachineInstance service readiness. VirtualmachineInstances will be removed from service
endpoints if the probe fails. Cannot be updated. More info: 
                   
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val readinessProbe: Probe_v1_?
  /** If specified, the VMI will be dispatched by specified scheduler. If not specified, the VMI will be dispatched by default
scheduler. */
  @K8sDslMarker var schedulerName: String?
  /** If specified, the fully qualified vmi hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>". If
not specified, the vmi will not have a domainname at all. The DNS entry will resolve to the vmi, no matter if the vmi
itself can pick up a hostname. */
  @K8sDslMarker var subdomain: String?
  /** Grace period observed after signalling a VirtualMachineInstance to stop after which the VirtualMachineInstance is force
terminated. */
  @K8sDslMarker var terminationGracePeriodSeconds: Long?
  /** If toleration is specified, obey all the toleration rules. */
  val tolerations: List<Toleration_v1_>?
  /** List of volumes that can be mounted by disks belonging to the vmi. */
  val volumes: List<Volume_v1_>?
}

@K8sDslMarker
interface VirtualMachineInstanceStatus_v1_: K8sManifest {
  /** ActivePods is a mapping of pod UID to node name. It is possible for multiple pods to be running for a single VMI during
migration. */
  @K8sDslMarker var activePods: Map<String,String>?
  /** Conditions are specific points in VirtualMachineInstance’s pod runtime. */
  val conditions: List<VirtualMachineInstanceCondition_v1_>?
  /** Guest OS Information */
  val guestOSInfo: VirtualMachineInstanceGuestOSInfo_v1_?
  /** Interfaces represent the details of available network interfaces. */
  val interfaces: List<VirtualMachineInstanceNetworkInterface_v1_>?
  /** Represents the method using which the vmi can be migrated: live migration or block migration */
  @K8sDslMarker var migrationMethod: String?
  /** Represents the status of a live migration */
  val migrationState: VirtualMachineInstanceMigrationState_v1_?
  /** NodeName is the name where the VirtualMachineInstance is currently running. */
  @K8sDslMarker var nodeName: String?
  /** Phase is the status of the VirtualMachineInstance in kubernetes world. It is not the VirtualMachineInstance status, but
partially correlates to it. */
  @K8sDslMarker var phase: String?
  /** The Quality of Service (QOS) classification assigned to the virtual machine instance based on resource requirements See
PodQOSClass type for available QOS classes More info: 
                   
https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md */
  @K8sDslMarker var qosClass: String?
  /** A brief CamelCase message indicating details about why the VMI is in this state. e.g. 'NodeUnresponsive' */
  @K8sDslMarker var reason: String?
}

@K8sDslMarker
interface VirtualMachineInstanceTemplateSpec_v1_: K8sManifest {
  /**  */
  val metadata: ObjectMeta_v1_?
  /** VirtualMachineInstance Spec contains the VirtualMachineInstance specification. */
  val spec: VirtualMachineInstanceSpec_v1_?
}

@K8sDslMarker
interface VirtualMachineList_v1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VirtualMachineList"
  /**  */
  val metadata: ListMeta_v1_
  /**  */
  val items: List<VirtualMachine_v1_>?
}

@K8sDslMarker
interface VirtualMachineSpec_v1_: K8sManifest {
  /** dataVolumeTemplates is a list of dataVolumes that the VirtualMachineInstance template can reference. DataVolumes in this
list are dynamically created for the VirtualMachine and are tied to the VirtualMachine’s life-cycle. */
  val dataVolumeTemplates: List<DataVolume_v1alpha1_>?
  /** Running state indicates the requested running state of the VirtualMachineInstance mutually exclusive with Running */
  @K8sDslMarker var runStrategy: String?
  /** Running controls whether the associatied VirtualMachineInstance is created or not Mutually exclusive with RunStrategy */
  @K8sDslMarker var running: Boolean?
  /** Template is the direct specification of VirtualMachineInstance */
  val template: VirtualMachineInstanceTemplateSpec_v1_?
}

@K8sDslMarker
interface VirtualMachineStateChangeRequest_v1_: K8sManifest {
  /** Indicates the type of action that is requested. e.g. Start or Stop */
  @K8sDslMarker var action: String?
  /** Provides additional data in order to perform the Action */
  @K8sDslMarker var data: Map<String,String>?
  /** Indicates the UUID of an existing Virtual Machine Instance that this change request applies to – if applicable */
  @K8sDslMarker var uid: String?
}

@K8sDslMarker
interface VirtualMachineStatus_v1_: K8sManifest {
  /** Hold the state information of the VirtualMachine and its VirtualMachineInstance */
  val conditions: List<VirtualMachineCondition_v1_>?
  /** Created indicates if the virtual machine is created in the cluster */
  @K8sDslMarker var created: Boolean?
  /** Ready indicates if the virtual machine is running and ready */
  @K8sDslMarker var ready: Boolean?
  /** SnapshotInProgress is the name of the VirtualMachineSnapshot currently executing */
  @K8sDslMarker var snapshotInProgress: String?
  /** StateChangeRequests indicates a list of actions that should be taken on a VMI e.g. stop a specific VMI then start a new
one. */
  val stateChangeRequests: List<VirtualMachineStateChangeRequest_v1_>?
}

@K8sDslMarker
interface Volume_v1_: K8sManifest {
  /** Volume’s name. Must be a DNS_LABEL and unique within the vmi. More info: 
                   
https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** CloudInitConfigDrive represents a cloud-init Config Drive user-data source. The Config Drive data will be added as a
disk to the vmi. A proper cloud-init installation is required inside the guest. More info: 
                   
https://cloudinit.readthedocs.io/en/latest/topics/datasources/configdrive.html */
  val cloudInitConfigDrive: CloudInitConfigDriveSource_v1_?
  /** CloudInitNoCloud represents a cloud-init NoCloud user-data source. The NoCloud data will be added as a disk to the vmi.
A proper cloud-init installation is required inside the guest. More info: 
                   
http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html */
  val cloudInitNoCloud: CloudInitNoCloudSource_v1_?
  /** ConfigMapSource represents a reference to a ConfigMap in the same namespace. More info: 
                   
https://kubernetes.io/docs/tasks/configure-pod-container/configure-pod-configmap/ */
  val configMap: ConfigMapVolumeSource_v1_?
  /** ContainerDisk references a docker image, embedding a qcow or raw disk. More info: 
                   
https://kubevirt.gitbooks.io/user-guide/registry-disk.html */
  val containerDisk: ContainerDiskSource_v1_?
  /** DataVolume represents the dynamic creation a PVC for this volume as well as the process of populating that PVC with a
disk image. */
  val dataVolume: DataVolumeSource_v1_?
  /** EmptyDisk represents a temporary disk which shares the vmis lifecycle. More info: 
                   
https://kubevirt.gitbooks.io/user-guide/disks-and-volumes.html */
  val emptyDisk: EmptyDiskSource_v1_?
  /** Ephemeral is a special volume source that "wraps" specified source and provides copy-on-write image on top of it. */
  val ephemeral: EphemeralVolumeSource_v1_?
  /** HostDisk represents a disk created on the cluster level */
  val hostDisk: HostDisk_v1_?
  /** PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. Directly
attached to the vmi via qemu. More info: 
                   
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
  val persistentVolumeClaim: PersistentVolumeClaimVolumeSource_v1_?
  /** SecretVolumeSource represents a reference to a secret data in the same namespace. More info: 
                   
https://kubernetes.io/docs/concepts/configuration/secret/ */
  val secret: SecretVolumeSource_v1_?
  /** ServiceAccountVolumeSource represents a reference to a service account. There can only be one volume of this type! More
info: 
                    https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/ */
  val serviceAccount: ServiceAccountVolumeSource_v1_?
}

@K8sDslMarker
interface WatchEvent_v1_: K8sManifest {
  /** Object is: `*` If Type is Added or Modified: the new state of the object. `*` If Type is Deleted: the state of the
object immediately before deletion. `*` If Type is Error: `*`Status is recommended; other types may make sense depending
on context. */
  @K8sDslMarker var `object`: Any?
  /**  */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface Watchdog_v1_: K8sManifest {
  /** Name of the watchdog. */
  @K8sDslMarker var name: String?
  /** i6300esb watchdog device. */
  val i6300esb: I6300ESBWatchdog_v1_?
}

@K8sDslMarker
interface WeightedPodAffinityTerm_v1_: K8sManifest {
  /** Required. A pod affinity term, associated with the corresponding weight. */
  val podAffinityTerm: PodAffinityTerm_v1_?
  /** weight associated with matching the corresponding podAffinityTerm, in the range 1-100. */
  @K8sDslMarker var weight: Int?
}

@K8sDslMarker
interface DataVolume_v1alpha1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1alpha1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "DataVolume"
  /**  */
  val metadata: ObjectMeta_v1_
  /**  */
  val spec: DataVolumeSpec_v1alpha1_
  /**  */
  val status: DataVolumeStatus_v1alpha1_?
}

@K8sDslMarker
interface DataVolumeSource_v1alpha1_: K8sManifest {
  /** v1alpha1.DataVolumeBlankImage */
  // val blank: None
  /** v1alpha1.DataVolumeSourceHTTP */
  // val http: None
  /** v1alpha1.DataVolumeSourcePVC */
  // val pvc: None
  /** v1alpha1.DataVolumeSourceRegistry */
  // val registry: None
  /** v1alpha1.DataVolumeSourceS3 */
  // val s3: None
  /** v1alpha1.DataVolumeSourceUpload */
  // val upload: None
}

@K8sDslMarker
interface DataVolumeSourceHTTP_v1alpha1_: K8sManifest {
  /** CertConfigMap provides a reference to the Registry certs */
  @K8sDslMarker var certConfigMap: String?
  /** SecretRef provides the secret reference needed to access the HTTP source */
  @K8sDslMarker var secretRef: String?
  /** URL is the URL of the http source */
  @K8sDslMarker var url: String?
}

@K8sDslMarker
interface DataVolumeSourcePVC_v1alpha1_: K8sManifest {
  /** string */
  // val namespace: None
  /** string */
  // val name: None
}

@K8sDslMarker
interface DataVolumeSourceRegistry_v1alpha1_: K8sManifest {
  /** CertConfigMap provides a reference to the Registry certs */
  @K8sDslMarker var certConfigMap: String?
  /** SecretRef provides the secret reference needed to access the Registry source */
  @K8sDslMarker var secretRef: String?
  /** URL is the url of the Registry source */
  @K8sDslMarker var url: String?
}

@K8sDslMarker
interface DataVolumeSourceS3_v1alpha1_: K8sManifest {
  /** SecretRef provides the secret reference needed to access the S3 source */
  @K8sDslMarker var secretRef: String?
  /** URL is the url of the S3 source */
  @K8sDslMarker var url: String?
}

@K8sDslMarker
interface DataVolumeSpec_v1alpha1_: K8sManifest {
  /** DataVolumeContentType options: "kubevirt", "archive" */
  @K8sDslMarker var contentType: String?
  /** PVC is a pointer to the PVC Spec we want to use */
  val pvc: PersistentVolumeClaimSpec_v1_?
  /** Source is the src of the data for the requested DataVolume */
  val source: DataVolumeSource_v1alpha1_?
}

@K8sDslMarker
interface DataVolumeStatus_v1alpha1_: K8sManifest {
  /** Phase is the current phase of the data volume */
  @K8sDslMarker var phase: String?
  /**  */
  @K8sDslMarker var progress: String?
}

@K8sDslMarker
interface SourceSpec_v1alpha1_: K8sManifest {
  /** v1.VirtualMachine */
  // val virtualMachine: None
}

@K8sDslMarker
interface VirtualMachineSnapshot_v1alpha1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1alpha1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VirtualMachineSnapshot"
  /**  */
  val metadata: ObjectMeta_v1_
  /**  */
  val spec: VirtualMachineSnapshotSpec_v1alpha1_
  /**  */
  val status: VirtualMachineSnapshotStatus_v1alpha1_?
}

@K8sDslMarker
interface VirtualMachineSnapshotCondition_v1alpha1_: K8sManifest {
  /** string */
  // val message: None
  /** string */
  // val reason: None
  /** string */
  // val status: None
  /** string */
  // val type: None
}

@K8sDslMarker
interface VirtualMachineSnapshotContent_v1alpha1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1alpha1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VirtualMachineSnapshotContent"
  /**  */
  val metadata: ObjectMeta_v1_
  /**  */
  val spec: VirtualMachineSnapshotContentSpec_v1alpha1_
  /**  */
  val status: VirtualMachineSnapshotContentStatus_v1alpha1_?
}

@K8sDslMarker
interface VirtualMachineSnapshotContentList_v1alpha1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1alpha1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VirtualMachineSnapshotContentList"
  /**  */
  val metadata: ListMeta_v1_
  /**  */
  val items: List<VirtualMachineSnapshotContent_v1alpha1_>?
}

@K8sDslMarker
interface VirtualMachineSnapshotContentSpec_v1alpha1_: K8sManifest {
  /** v1alpha1.SourceSpec */
  // val source: None
  /** string */
  // val virtualMachineSnapshotName: None
  /** < 
                    v1alpha1.VolumeBackup > array */
  // val volumeBackups: None
}

@K8sDslMarker
interface VirtualMachineSnapshotContentStatus_v1alpha1_: K8sManifest {
  /** v1.Time */
  // val creationTime: None
  /** v1alpha1.VirtualMachineSnapshotError */
  // val error: None
  /** boolean */
  // val readyToUse: None
  /** < 
                    v1alpha1.VolumeSnapshotStatus > array */
  // val volumeSnapshotStatus: None
}

@K8sDslMarker
interface VirtualMachineSnapshotError_v1alpha1_: K8sManifest {
  /** string */
  // val message: None
  /** v1.Time */
  // val time: None
}

@K8sDslMarker
interface VirtualMachineSnapshotList_v1alpha1_: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "v1alpha1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info: 
                   
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VirtualMachineSnapshotList"
  /**  */
  val metadata: ListMeta_v1_
  /**  */
  val items: List<VirtualMachineSnapshot_v1alpha1_>?
}

@K8sDslMarker
interface VirtualMachineSnapshotSpec_v1alpha1_: K8sManifest {
  /** string */
  // val deletionPolicy: None
  /** v1.TypedLocalObjectReference */
  // val source: None
}

@K8sDslMarker
interface VirtualMachineSnapshotStatus_v1alpha1_: K8sManifest {
  /** < 
                    v1alpha1.VirtualMachineSnapshotCondition > array */
  // val conditions: None
  /** v1.Time */
  // val creationTime: None
  /** v1alpha1.VirtualMachineSnapshotError */
  // val error: None
  /** boolean */
  // val readyToUse: None
  /** string */
  // val virtualMachineSnapshotContentName: None
}

@K8sDslMarker
interface VolumeBackup_v1alpha1_: K8sManifest {
  /** string */
  // val diskName: None
  /** v1.PersistentVolumeClaim */
  // val persistentVolumeClaim: None
  /** string */
  // val volumeSnapshotName: None
}

@K8sDslMarker
interface VolumeSnapshotStatus_v1alpha1_: K8sManifest {
  /** v1.Time */
  // val creationTime: None
  /** v1alpha1.VirtualMachineSnapshotError */
  // val error: None
  /** boolean */
  // val readyToUse: None
  /** string */
  // val volumeSnapshotName: None
}