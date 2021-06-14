package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Podsecuritypolicyspec_policy_v1beta1: K8sManifest {
  /** allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to
true. */
  @K8sDslMarker var allowPrivilegeEscalation: Boolean?
  /** AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An
empty value indicates that any CSI driver can be used for inline ephemeral volumes. This is an alpha field, and is only
honored if the API server enables the CSIInlineVolume feature gate. */
  val allowedCSIDrivers: List<AllowedCSIDriver_policy_v1beta1>?
  /** allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field
may be added at the pod author's discretion. You must not list a capability in both allowedCapabilities and
requiredDropCapabilities. */
  @K8sDslMarker var allowedCapabilities: List<String>?
  /** allowedFlexVolumes is a whitelist of allowed Flexvolumes. Empty or nil indicates that all Flexvolumes may be used. This
parameter is effective only when the usage of the Flexvolumes is allowed in the "volumes" field. */
  val allowedFlexVolumes: List<AllowedFlexVolume_policy_v1beta1>?
  /** allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths may be used. */
  val allowedHostPaths: List<AllowedHostPath_policy_v1beta1>?
  /** AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that only the
DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled. */
  @K8sDslMarker var allowedProcMountTypes: List<String>?
  /** allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain
sysctl name or ends in "`*`" in which case it is considered as a prefix of allowed sysctls. Single `*` means all unsafe
sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection. Examples: e.g.
"foo/`*`" allows "foo/bar", "foo/baz", etc. e.g. "foo.`*`" allows "foo.bar", "foo.baz", etc. */
  @K8sDslMarker var allowedUnsafeSysctls: List<String>?
  /** defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec
specifically drops the capability. You may not list a capability in both defaultAddCapabilities and
requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the
allowedCapabilities list. */
  @K8sDslMarker var defaultAddCapabilities: List<String>?
  /** defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its
parent process. */
  @K8sDslMarker var defaultAllowPrivilegeEscalation: Boolean?
  /** forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name
or ends in "`*`" in which case it is considered as a prefix of forbidden sysctls. Single `*` means all sysctls are
forbidden. Examples: e.g. "foo/`*`" forbids "foo/bar", "foo/baz", etc. e.g. "foo.`*`" forbids "foo.bar", "foo.baz", etc. */
  @K8sDslMarker var forbiddenSysctls: List<String>?
  /** fsGroup is the strategy that will dictate what fs group is used by the SecurityContext. */
  val fsGroup: FSGroupStrategyOptions_policy_v1beta1?
  /** hostIPC determines if the policy allows the use of HostIPC in the pod spec. */
  @K8sDslMarker var hostIPC: Boolean?
  /** hostNetwork determines if the policy allows the use of HostNetwork in the pod spec. */
  @K8sDslMarker var hostNetwork: Boolean?
  /** hostPID determines if the policy allows the use of HostPID in the pod spec. */
  @K8sDslMarker var hostPID: Boolean?
  /** hostPorts determines which host port ranges are allowed to be exposed. */
  val hostPorts: List<HostPortRange_policy_v1beta1>?
  /** privileged determines if a pod can request to be run as privileged. */
  @K8sDslMarker var privileged: Boolean?
  /** readOnlyRootFilesystem when set to true will force containers to run with a read only root file system. If the container
specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the
container may run with a read only root file system if it wishes but it will not be forced to. */
  @K8sDslMarker var readOnlyRootFilesystem: Boolean?
  /** requiredDropCapabilities are the capabilities that will be dropped from the container. These are required to be dropped
and cannot be added. */
  @K8sDslMarker var requiredDropCapabilities: List<String>?
  /** RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set. If this field is omitted,
the pod's RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled. */
  val runAsGroup: RunAsGroupStrategyOptions_policy_v1beta1?
  /** runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set. */
  val runAsUser: RunAsUserStrategyOptions_policy_v1beta1?
  /** runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod. If this field is omitted, the
pod's runtimeClassName field is unrestricted. Enforcement of this field depends on the RuntimeClass feature gate being
enabled. */
  val runtimeClass: RuntimeClassStrategyOptions_policy_v1beta1?
  /** seLinux is the strategy that will dictate the allowable labels that may be set. */
  val seLinux: SELinuxStrategyOptions_policy_v1beta1?
  /** supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext. */
  val supplementalGroups: SupplementalGroupsStrategyOptions_policy_v1beta1?
  /** volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be used. To allow all volumes you
may use '\`*`'. */
  @K8sDslMarker var volumes: List<String>?
}