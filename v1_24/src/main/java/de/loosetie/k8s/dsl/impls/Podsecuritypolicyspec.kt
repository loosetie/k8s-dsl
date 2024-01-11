package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("allowPrivilegeEscalation", "allowedCSIDrivers", "allowedCapabilities", "allowedFlexVolumes", "allowedHostPaths", "allowedProcMountTypes", "allowedUnsafeSysctls", "defaultAddCapabilities", "defaultAllowPrivilegeEscalation", "forbiddenSysctls", "fsGroup", "hostIPC", "hostNetwork", "hostPID", "hostPorts", "privileged", "readOnlyRootFilesystem", "requiredDropCapabilities", "runAsGroup", "runAsUser", "runtimeClass", "seLinux", "supplementalGroups", "volumes")
open class Podsecuritypolicyspec_policy_v1beta1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Podsecuritypolicyspec_policy_v1beta1, HasParent {
  override var allowPrivilegeEscalation: Boolean? = null
  override var allowedCSIDrivers: List<AllowedCSIDriver_policy_v1beta1>? = null
  override var allowedCapabilities: List<String>? = null
  override var allowedFlexVolumes: List<AllowedFlexVolume_policy_v1beta1>? = null
  override var allowedHostPaths: List<AllowedHostPath_policy_v1beta1>? = null
  override var allowedProcMountTypes: List<String>? = null
  override var allowedUnsafeSysctls: List<String>? = null
  override var defaultAddCapabilities: List<String>? = null
  override var defaultAllowPrivilegeEscalation: Boolean? = null
  override var forbiddenSysctls: List<String>? = null
  override var fsGroup: FSGroupStrategyOptions_policy_v1beta1? = null
  override var hostIPC: Boolean? = null
  override var hostNetwork: Boolean? = null
  override var hostPID: Boolean? = null
  override var hostPorts: List<HostPortRange_policy_v1beta1>? = null
  override var privileged: Boolean? = null
  override var readOnlyRootFilesystem: Boolean? = null
  override var requiredDropCapabilities: List<String>? = null
  override var runAsGroup: RunAsGroupStrategyOptions_policy_v1beta1? = null
  override var runAsUser: RunAsUserStrategyOptions_policy_v1beta1? = null
  override var runtimeClass: RuntimeClassStrategyOptions_policy_v1beta1? = null
  override var seLinux: SELinuxStrategyOptions_policy_v1beta1? = null
  override var supplementalGroups: SupplementalGroupsStrategyOptions_policy_v1beta1? = null
  override var volumes: List<String>? = null
}