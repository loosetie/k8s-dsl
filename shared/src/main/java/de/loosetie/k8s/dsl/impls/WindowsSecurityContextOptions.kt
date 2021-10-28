package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("gmsaCredentialSpec", "gmsaCredentialSpecName", "runAsUserName")
class WindowsSecurityContextOptions_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WindowsSecurityContextOptions_core_v1_k8s1_16, HasParent {
  override var gmsaCredentialSpec: String? = null
  override var gmsaCredentialSpecName: String? = null
  override var runAsUserName: String? = null
}
@JsonPropertyOrder("gmsaCredentialSpec", "gmsaCredentialSpecName", "runAsUserName")
class WindowsSecurityContextOptions_core_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WindowsSecurityContextOptions_core_v1_k8s1_17, HasParent {
  override var gmsaCredentialSpec: String? = null
  override var gmsaCredentialSpecName: String? = null
  override var runAsUserName: String? = null
}
@JsonPropertyOrder("gmsaCredentialSpec", "gmsaCredentialSpecName", "runAsUserName")
class WindowsSecurityContextOptions_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WindowsSecurityContextOptions_core_v1_k8s1_18, HasParent {
  override var gmsaCredentialSpec: String? = null
  override var gmsaCredentialSpecName: String? = null
  override var runAsUserName: String? = null
}
typealias WindowsSecurityContextOptions_core_v1_k8s1_19Impl = WindowsSecurityContextOptions_core_v1_k8s1_18Impl
typealias WindowsSecurityContextOptions_core_v1_k8s1_20Impl = WindowsSecurityContextOptions_core_v1_k8s1_19Impl
typealias WindowsSecurityContextOptions_core_v1_k8s1_21Impl = WindowsSecurityContextOptions_core_v1_k8s1_20Impl