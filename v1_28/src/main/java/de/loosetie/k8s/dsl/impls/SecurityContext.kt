package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("allowPrivilegeEscalation", "capabilities", "privileged", "procMount", "readOnlyRootFilesystem", "runAsGroup", "runAsNonRoot", "runAsUser", "seLinuxOptions", "seccompProfile", "windowsOptions")
class SecurityContext_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SecurityContext_core_v1, HasParent {
  override var allowPrivilegeEscalation: Boolean? = null
  override var capabilities: Capabilities_core_v1? = null
  override var privileged: Boolean? = null
  override var procMount: String? = null
  override var readOnlyRootFilesystem: Boolean? = null
  override var runAsGroup: Int? = null
  override var runAsNonRoot: Boolean? = null
  override var runAsUser: Int? = null
  override var seLinuxOptions: SELinuxOptions_core_v1? = null
  override var seccompProfile: SeccompProfile_core_v1? = null
  override var windowsOptions: WindowsSecurityContextOptions_core_v1? = null
}