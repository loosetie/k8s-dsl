package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("activeDeadlineSeconds", "affinity", "automountServiceAccountToken", "containers", "dnsConfig", "dnsPolicy", "enableServiceLinks", "ephemeralContainers", "hostAliases", "hostIPC", "hostNetwork", "hostPID", "hostUsers", "hostname", "imagePullSecrets", "initContainers", "nodeName", "nodeSelector", "os", "overhead", "preemptionPolicy", "priority", "priorityClassName", "readinessGates", "resourceClaims", "restartPolicy", "runtimeClassName", "schedulerName", "schedulingGates", "securityContext", "serviceAccount", "serviceAccountName", "setHostnameAsFQDN", "shareProcessNamespace", "subdomain", "terminationGracePeriodSeconds", "tolerations", "topologySpreadConstraints", "volumes")
class Podspec_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Podspec_core_v1, HasParent {
  override var activeDeadlineSeconds: Int? = null
  override var affinity: Affinity_core_v1? = null
  override var automountServiceAccountToken: Boolean? = null
  override var containers: List<Container_core_v1>? = null
  override var dnsConfig: PodDNSConfig_core_v1? = null
  override var dnsPolicy: String? = null
  override var enableServiceLinks: Boolean? = null
  override var ephemeralContainers: List<EphemeralContainer_core_v1>? = null
  override var hostAliases: List<HostAlias_core_v1>? = null
  override var hostIPC: Boolean? = null
  override var hostNetwork: Boolean? = null
  override var hostPID: Boolean? = null
  override var hostUsers: Boolean? = null
  override var hostname: String? = null
  override var imagePullSecrets: List<LocalObjectReference_core_v1>? = null
  override var initContainers: List<Container_core_v1>? = null
  override var nodeName: String? = null
  override var nodeSelector: Any? = null
  override var os: PodOS_core_v1? = null
  override var overhead: Any? = null
  override var preemptionPolicy: String? = null
  override var priority: Int? = null
  override var priorityClassName: String? = null
  override var readinessGates: List<PodReadinessGate_core_v1>? = null
  override var resourceClaims: List<PodResourceClaim_core_v1>? = null
  override var restartPolicy: String? = null
  override var runtimeClassName: String? = null
  override var schedulerName: String? = null
  override var schedulingGates: List<PodSchedulingGate_core_v1>? = null
  override var securityContext: PodSecurityContext_core_v1? = null
  override var serviceAccount: String? = null
  override var serviceAccountName: String? = null
  override var setHostnameAsFQDN: Boolean? = null
  override var shareProcessNamespace: Boolean? = null
  override var subdomain: String? = null
  override var terminationGracePeriodSeconds: Int? = null
  override var tolerations: List<Toleration_core_v1>? = null
  override var topologySpreadConstraints: List<TopologySpreadConstraint_core_v1>? = null
  override var volumes: List<Volume_core_v1>? = null
}