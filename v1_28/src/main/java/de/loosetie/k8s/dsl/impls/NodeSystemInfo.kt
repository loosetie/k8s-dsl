package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("architecture", "bootID", "containerRuntimeVersion", "kernelVersion", "kubeProxyVersion", "kubeletVersion", "machineID", "operatingSystem", "osImage", "systemUUID")
open class NodeSystemInfo_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: NodeSystemInfo_core_v1, HasParent {
  override var architecture: String? = null
  override var bootID: String? = null
  override var containerRuntimeVersion: String? = null
  override var kernelVersion: String? = null
  override var kubeProxyVersion: String? = null
  override var kubeletVersion: String? = null
  override var machineID: String? = null
  override var operatingSystem: String? = null
  override var osImage: String? = null
  override var systemUUID: String? = null
}