package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("activeDeadlineSeconds", "affinity", "automountServiceAccountToken", "containers", "dnsConfig", "dnsPolicy", "enableServiceLinks", "ephemeralContainers", "hostAliases", "hostIPC", "hostNetwork", "hostPID", "hostname", "imagePullSecrets", "initContainers", "nodeName", "nodeSelector", "overhead", "preemptionPolicy", "priority", "priorityClassName", "readinessGates", "restartPolicy", "runtimeClassName", "schedulerName", "securityContext", "serviceAccount", "serviceAccountName", "shareProcessNamespace", "subdomain", "terminationGracePeriodSeconds", "tolerations", "topologySpreadConstraints", "volumes")
class Podspec_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Podspec_core_v1_k8s1_16, HasParent {
  override var activeDeadlineSeconds: Int? = null
  override var affinity: Affinity_core_v1_k8s1_16? = null
  override var automountServiceAccountToken: Boolean? = null
  override var containers: List<Container_core_v1_k8s1_16>? = null
  override var dnsConfig: PodDNSConfig_core_v1_k8s1_16? = null
  override var dnsPolicy: String? = null
  override var enableServiceLinks: Boolean? = null
  override var ephemeralContainers: List<EphemeralContainer_core_v1_k8s1_16>? = null
  override var hostAliases: List<HostAlias_core_v1_k8s1_16>? = null
  override var hostIPC: Boolean? = null
  override var hostNetwork: Boolean? = null
  override var hostPID: Boolean? = null
  override var hostname: String? = null
  override var imagePullSecrets: List<LocalObjectReference_core_v1_k8s1_16>? = null
  override var initContainers: List<Container_core_v1_k8s1_16>? = null
  override var nodeName: String? = null
  override var nodeSelector: Map<String, String>? = null
  override var overhead: de.loosetie.k8s.dsl.types.LimitsAndRequests? = null
  override var preemptionPolicy: String? = null
  override var priority: Int? = null
  override var priorityClassName: String? = null
  override var readinessGates: List<PodReadinessGate_core_v1_k8s1_16>? = null
  override var restartPolicy: String? = null
  override var runtimeClassName: String? = null
  override var schedulerName: String? = null
  override var securityContext: PodSecurityContext_core_v1_k8s1_16? = null
  override var serviceAccount: String? = null
  override var serviceAccountName: String? = null
  override var shareProcessNamespace: Boolean? = null
  override var subdomain: String? = null
  override var terminationGracePeriodSeconds: Int? = null
  override var tolerations: List<Toleration_core_v1_k8s1_16>? = null
  override var topologySpreadConstraints: List<TopologySpreadConstraint_core_v1_k8s1_16>? = null
  override var volumes: List<Volume_core_v1_k8s1_16>? = null
}
@JsonPropertyOrder("activeDeadlineSeconds", "affinity", "automountServiceAccountToken", "containers", "dnsConfig", "dnsPolicy", "enableServiceLinks", "ephemeralContainers", "hostAliases", "hostIPC", "hostNetwork", "hostPID", "hostname", "imagePullSecrets", "initContainers", "nodeName", "nodeSelector", "overhead", "preemptionPolicy", "priority", "priorityClassName", "readinessGates", "restartPolicy", "runtimeClassName", "schedulerName", "securityContext", "serviceAccount", "serviceAccountName", "shareProcessNamespace", "subdomain", "terminationGracePeriodSeconds", "tolerations", "topologySpreadConstraints", "volumes")
class Podspec_core_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Podspec_core_v1_k8s1_17, HasParent {
  override var activeDeadlineSeconds: Int? = null
  override var affinity: Affinity_core_v1_k8s1_17? = null
  override var automountServiceAccountToken: Boolean? = null
  override var containers: List<Container_core_v1_k8s1_17>? = null
  override var dnsConfig: PodDNSConfig_core_v1_k8s1_17? = null
  override var dnsPolicy: String? = null
  override var enableServiceLinks: Boolean? = null
  override var ephemeralContainers: List<EphemeralContainer_core_v1_k8s1_17>? = null
  override var hostAliases: List<HostAlias_core_v1_k8s1_17>? = null
  override var hostIPC: Boolean? = null
  override var hostNetwork: Boolean? = null
  override var hostPID: Boolean? = null
  override var hostname: String? = null
  override var imagePullSecrets: List<LocalObjectReference_core_v1_k8s1_17>? = null
  override var initContainers: List<Container_core_v1_k8s1_17>? = null
  override var nodeName: String? = null
  override var nodeSelector: Map<String, String>? = null
  override var overhead: de.loosetie.k8s.dsl.types.LimitsAndRequests? = null
  override var preemptionPolicy: String? = null
  override var priority: Int? = null
  override var priorityClassName: String? = null
  override var readinessGates: List<PodReadinessGate_core_v1_k8s1_17>? = null
  override var restartPolicy: String? = null
  override var runtimeClassName: String? = null
  override var schedulerName: String? = null
  override var securityContext: PodSecurityContext_core_v1_k8s1_17? = null
  override var serviceAccount: String? = null
  override var serviceAccountName: String? = null
  override var shareProcessNamespace: Boolean? = null
  override var subdomain: String? = null
  override var terminationGracePeriodSeconds: Int? = null
  override var tolerations: List<Toleration_core_v1_k8s1_17>? = null
  override var topologySpreadConstraints: List<TopologySpreadConstraint_core_v1_k8s1_17>? = null
  override var volumes: List<Volume_core_v1_k8s1_17>? = null
}
@JsonPropertyOrder("activeDeadlineSeconds", "affinity", "automountServiceAccountToken", "containers", "dnsConfig", "dnsPolicy", "enableServiceLinks", "ephemeralContainers", "hostAliases", "hostIPC", "hostNetwork", "hostPID", "hostname", "imagePullSecrets", "initContainers", "nodeName", "nodeSelector", "overhead", "preemptionPolicy", "priority", "priorityClassName", "readinessGates", "restartPolicy", "runtimeClassName", "schedulerName", "securityContext", "serviceAccount", "serviceAccountName", "shareProcessNamespace", "subdomain", "terminationGracePeriodSeconds", "tolerations", "topologySpreadConstraints", "volumes")
class Podspec_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Podspec_core_v1_k8s1_18, HasParent {
  override var activeDeadlineSeconds: Int? = null
  override var affinity: Affinity_core_v1_k8s1_18? = null
  override var automountServiceAccountToken: Boolean? = null
  override var containers: List<Container_core_v1_k8s1_18>? = null
  override var dnsConfig: PodDNSConfig_core_v1_k8s1_18? = null
  override var dnsPolicy: String? = null
  override var enableServiceLinks: Boolean? = null
  override var ephemeralContainers: List<EphemeralContainer_core_v1_k8s1_18>? = null
  override var hostAliases: List<HostAlias_core_v1_k8s1_18>? = null
  override var hostIPC: Boolean? = null
  override var hostNetwork: Boolean? = null
  override var hostPID: Boolean? = null
  override var hostname: String? = null
  override var imagePullSecrets: List<LocalObjectReference_core_v1_k8s1_18>? = null
  override var initContainers: List<Container_core_v1_k8s1_18>? = null
  override var nodeName: String? = null
  override var nodeSelector: Map<String, String>? = null
  override var overhead: de.loosetie.k8s.dsl.types.LimitsAndRequests? = null
  override var preemptionPolicy: String? = null
  override var priority: Int? = null
  override var priorityClassName: String? = null
  override var readinessGates: List<PodReadinessGate_core_v1_k8s1_18>? = null
  override var restartPolicy: String? = null
  override var runtimeClassName: String? = null
  override var schedulerName: String? = null
  override var securityContext: PodSecurityContext_core_v1_k8s1_18? = null
  override var serviceAccount: String? = null
  override var serviceAccountName: String? = null
  override var shareProcessNamespace: Boolean? = null
  override var subdomain: String? = null
  override var terminationGracePeriodSeconds: Int? = null
  override var tolerations: List<Toleration_core_v1_k8s1_18>? = null
  override var topologySpreadConstraints: List<TopologySpreadConstraint_core_v1_k8s1_18>? = null
  override var volumes: List<Volume_core_v1_k8s1_18>? = null
}
@JsonPropertyOrder("activeDeadlineSeconds", "affinity", "automountServiceAccountToken", "containers", "dnsConfig", "dnsPolicy", "enableServiceLinks", "ephemeralContainers", "hostAliases", "hostIPC", "hostNetwork", "hostPID", "hostname", "imagePullSecrets", "initContainers", "nodeName", "nodeSelector", "overhead", "preemptionPolicy", "priority", "priorityClassName", "readinessGates", "restartPolicy", "runtimeClassName", "schedulerName", "securityContext", "serviceAccount", "serviceAccountName", "setHostnameAsFQDN", "shareProcessNamespace", "subdomain", "terminationGracePeriodSeconds", "tolerations", "topologySpreadConstraints", "volumes")
class Podspec_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Podspec_core_v1_k8s1_19, HasParent {
  override var activeDeadlineSeconds: Int? = null
  override var affinity: Affinity_core_v1_k8s1_19? = null
  override var automountServiceAccountToken: Boolean? = null
  override var containers: List<Container_core_v1_k8s1_19>? = null
  override var dnsConfig: PodDNSConfig_core_v1_k8s1_19? = null
  override var dnsPolicy: String? = null
  override var enableServiceLinks: Boolean? = null
  override var ephemeralContainers: List<EphemeralContainer_core_v1_k8s1_19>? = null
  override var hostAliases: List<HostAlias_core_v1_k8s1_19>? = null
  override var hostIPC: Boolean? = null
  override var hostNetwork: Boolean? = null
  override var hostPID: Boolean? = null
  override var hostname: String? = null
  override var imagePullSecrets: List<LocalObjectReference_core_v1_k8s1_19>? = null
  override var initContainers: List<Container_core_v1_k8s1_19>? = null
  override var nodeName: String? = null
  override var nodeSelector: Map<String, String>? = null
  override var overhead: de.loosetie.k8s.dsl.types.LimitsAndRequests? = null
  override var preemptionPolicy: String? = null
  override var priority: Int? = null
  override var priorityClassName: String? = null
  override var readinessGates: List<PodReadinessGate_core_v1_k8s1_19>? = null
  override var restartPolicy: String? = null
  override var runtimeClassName: String? = null
  override var schedulerName: String? = null
  override var securityContext: PodSecurityContext_core_v1_k8s1_19? = null
  override var serviceAccount: String? = null
  override var serviceAccountName: String? = null
  override var setHostnameAsFQDN: Boolean? = null
  override var shareProcessNamespace: Boolean? = null
  override var subdomain: String? = null
  override var terminationGracePeriodSeconds: Int? = null
  override var tolerations: List<Toleration_core_v1_k8s1_19>? = null
  override var topologySpreadConstraints: List<TopologySpreadConstraint_core_v1_k8s1_19>? = null
  override var volumes: List<Volume_core_v1_k8s1_19>? = null
}
@JsonPropertyOrder("activeDeadlineSeconds", "affinity", "automountServiceAccountToken", "containers", "dnsConfig", "dnsPolicy", "enableServiceLinks", "ephemeralContainers", "hostAliases", "hostIPC", "hostNetwork", "hostPID", "hostname", "imagePullSecrets", "initContainers", "nodeName", "nodeSelector", "overhead", "preemptionPolicy", "priority", "priorityClassName", "readinessGates", "restartPolicy", "runtimeClassName", "schedulerName", "securityContext", "serviceAccount", "serviceAccountName", "setHostnameAsFQDN", "shareProcessNamespace", "subdomain", "terminationGracePeriodSeconds", "tolerations", "topologySpreadConstraints", "volumes")
class Podspec_core_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Podspec_core_v1_k8s1_20, HasParent {
  override var activeDeadlineSeconds: Int? = null
  override var affinity: Affinity_core_v1_k8s1_20? = null
  override var automountServiceAccountToken: Boolean? = null
  override var containers: List<Container_core_v1_k8s1_20>? = null
  override var dnsConfig: PodDNSConfig_core_v1_k8s1_20? = null
  override var dnsPolicy: String? = null
  override var enableServiceLinks: Boolean? = null
  override var ephemeralContainers: List<EphemeralContainer_core_v1_k8s1_20>? = null
  override var hostAliases: List<HostAlias_core_v1_k8s1_20>? = null
  override var hostIPC: Boolean? = null
  override var hostNetwork: Boolean? = null
  override var hostPID: Boolean? = null
  override var hostname: String? = null
  override var imagePullSecrets: List<LocalObjectReference_core_v1_k8s1_20>? = null
  override var initContainers: List<Container_core_v1_k8s1_20>? = null
  override var nodeName: String? = null
  override var nodeSelector: Map<String, String>? = null
  override var overhead: de.loosetie.k8s.dsl.types.LimitsAndRequests? = null
  override var preemptionPolicy: String? = null
  override var priority: Int? = null
  override var priorityClassName: String? = null
  override var readinessGates: List<PodReadinessGate_core_v1_k8s1_20>? = null
  override var restartPolicy: String? = null
  override var runtimeClassName: String? = null
  override var schedulerName: String? = null
  override var securityContext: PodSecurityContext_core_v1_k8s1_20? = null
  override var serviceAccount: String? = null
  override var serviceAccountName: String? = null
  override var setHostnameAsFQDN: Boolean? = null
  override var shareProcessNamespace: Boolean? = null
  override var subdomain: String? = null
  override var terminationGracePeriodSeconds: Int? = null
  override var tolerations: List<Toleration_core_v1_k8s1_20>? = null
  override var topologySpreadConstraints: List<TopologySpreadConstraint_core_v1_k8s1_20>? = null
  override var volumes: List<Volume_core_v1_k8s1_20>? = null
}
@JsonPropertyOrder("activeDeadlineSeconds", "affinity", "automountServiceAccountToken", "containers", "dnsConfig", "dnsPolicy", "enableServiceLinks", "ephemeralContainers", "hostAliases", "hostIPC", "hostNetwork", "hostPID", "hostname", "imagePullSecrets", "initContainers", "nodeName", "nodeSelector", "overhead", "preemptionPolicy", "priority", "priorityClassName", "readinessGates", "restartPolicy", "runtimeClassName", "schedulerName", "securityContext", "serviceAccount", "serviceAccountName", "setHostnameAsFQDN", "shareProcessNamespace", "subdomain", "terminationGracePeriodSeconds", "tolerations", "topologySpreadConstraints", "volumes")
class Podspec_core_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Podspec_core_v1_k8s1_21, HasParent {
  override var activeDeadlineSeconds: Int? = null
  override var affinity: Affinity_core_v1_k8s1_21? = null
  override var automountServiceAccountToken: Boolean? = null
  override var containers: List<Container_core_v1_k8s1_21>? = null
  override var dnsConfig: PodDNSConfig_core_v1_k8s1_21? = null
  override var dnsPolicy: String? = null
  override var enableServiceLinks: Boolean? = null
  override var ephemeralContainers: List<EphemeralContainer_core_v1_k8s1_21>? = null
  override var hostAliases: List<HostAlias_core_v1_k8s1_21>? = null
  override var hostIPC: Boolean? = null
  override var hostNetwork: Boolean? = null
  override var hostPID: Boolean? = null
  override var hostname: String? = null
  override var imagePullSecrets: List<LocalObjectReference_core_v1_k8s1_21>? = null
  override var initContainers: List<Container_core_v1_k8s1_21>? = null
  override var nodeName: String? = null
  override var nodeSelector: Map<String, String>? = null
  override var overhead: de.loosetie.k8s.dsl.types.LimitsAndRequests? = null
  override var preemptionPolicy: String? = null
  override var priority: Int? = null
  override var priorityClassName: String? = null
  override var readinessGates: List<PodReadinessGate_core_v1_k8s1_21>? = null
  override var restartPolicy: String? = null
  override var runtimeClassName: String? = null
  override var schedulerName: String? = null
  override var securityContext: PodSecurityContext_core_v1_k8s1_21? = null
  override var serviceAccount: String? = null
  override var serviceAccountName: String? = null
  override var setHostnameAsFQDN: Boolean? = null
  override var shareProcessNamespace: Boolean? = null
  override var subdomain: String? = null
  override var terminationGracePeriodSeconds: Int? = null
  override var tolerations: List<Toleration_core_v1_k8s1_21>? = null
  override var topologySpreadConstraints: List<TopologySpreadConstraint_core_v1_k8s1_21>? = null
  override var volumes: List<Volume_core_v1_k8s1_21>? = null
}