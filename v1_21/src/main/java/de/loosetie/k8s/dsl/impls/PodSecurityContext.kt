package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsGroup", "fsGroupChangePolicy", "runAsGroup", "runAsNonRoot", "runAsUser", "seLinuxOptions", "seccompProfile", "supplementalGroups", "sysctls", "windowsOptions")
class PodSecurityContext_core_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodSecurityContext_core_v1_k8s1_21, HasParent {
  override var fsGroup: Int? = null
  override var fsGroupChangePolicy: String? = null
  override var runAsGroup: Int? = null
  override var runAsNonRoot: Boolean? = null
  override var runAsUser: Int? = null
  override var seLinuxOptions: SELinuxOptions_core_v1_k8s1_21? = null
  override var seccompProfile: SeccompProfile_core_v1_k8s1_21? = null
  override var supplementalGroups: List<Int>? = null
  override var sysctls: List<Sysctl_core_v1_k8s1_21>? = null
  override var windowsOptions: WindowsSecurityContextOptions_core_v1_k8s1_21? = null
}