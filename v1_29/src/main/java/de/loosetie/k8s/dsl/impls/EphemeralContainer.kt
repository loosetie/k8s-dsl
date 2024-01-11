package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "args", "command", "env", "envFrom", "image", "imagePullPolicy", "lifecycle", "livenessProbe", "ports", "readinessProbe", "resizePolicy", "resources", "restartPolicy", "securityContext", "startupProbe", "stdin", "stdinOnce", "targetContainerName", "terminationMessagePath", "terminationMessagePolicy", "tty", "volumeDevices", "volumeMounts", "workingDir")
open class EphemeralContainer_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: EphemeralContainer_core_v1, HasParent {
  override var name: String? = null
  override var args: List<String>? = null
  override var command: List<String>? = null
  override var env: List<EnvVar_core_v1>? = null
  override var envFrom: List<EnvFromSource_core_v1>? = null
  override var image: String? = null
  override var imagePullPolicy: String? = null
  override var lifecycle: Lifecycle_core_v1? = null
  override var livenessProbe: Probe_core_v1? = null
  override var ports: List<ContainerPort_core_v1>? = null
  override var readinessProbe: Probe_core_v1? = null
  override var resizePolicy: List<ContainerResizePolicy_core_v1>? = null
  override var resources: ResourceRequirements_core_v1? = null
  override var restartPolicy: String? = null
  override var securityContext: SecurityContext_core_v1? = null
  override var startupProbe: Probe_core_v1? = null
  override var stdin: Boolean? = null
  override var stdinOnce: Boolean? = null
  override var targetContainerName: String? = null
  override var terminationMessagePath: String? = null
  override var terminationMessagePolicy: String? = null
  override var tty: Boolean? = null
  override var volumeDevices: List<VolumeDevice_core_v1>? = null
  override var volumeMounts: List<VolumeMount_core_v1>? = null
  override var workingDir: String? = null
}