package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface EphemeralContainer_core_v1: K8sManifest {
  /** Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers
and ephemeral containers. */
  @K8sDslMarker var name: String?
  /** Arguments to the entrypoint. The image's CMD is used if this is not provided. Variable references $(VAR_NAME) are
expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be
unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)"
will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the
variable exists or not. Cannot be updated. More info:
https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell */
  @K8sDslMarker var args: List<String>?
  /** Entrypoint array. Not executed within a shell. The image's ENTRYPOINT is used if this is not provided. Variable
references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference
in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME)
syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded,
regardless of whether the variable exists or not. Cannot be updated. More info:
https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell */
  @K8sDslMarker var command: List<String>?
  /** List of environment variables to set in the container. Cannot be updated. */
  val env: List<EnvVar_core_v1>?
  /** List of sources to populate environment variables in the container. The keys defined within a source must be a
C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in
multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a
duplicate key will take precedence. Cannot be updated. */
  val envFrom: List<EnvFromSource_core_v1>?
  /** Container image name. More info: https://kubernetes.io/docs/concepts/containers/images */
  @K8sDslMarker var image: String?
  /** Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent
otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images */
  @K8sDslMarker var imagePullPolicy: String?
  /** Lifecycle is not allowed for ephemeral containers. */
  val lifecycle: Lifecycle_core_v1?
  /** Probes are not allowed for ephemeral containers. */
  val livenessProbe: Probe_core_v1?
  /** Ports are not allowed for ephemeral containers. */
  val ports: List<ContainerPort_core_v1>?
  /** Probes are not allowed for ephemeral containers. */
  val readinessProbe: Probe_core_v1?
  /** Resources resize policy for the container. */
  val resizePolicy: List<ContainerResizePolicy_core_v1>?
  /** Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the
pod. */
  val resources: ResourceRequirements_core_v1?
  /** Restart policy for the container to manage the restart behavior of each container within a pod. This may only be set for
init containers. You cannot set this field on ephemeral containers. */
  @K8sDslMarker var restartPolicy: String?
  /** Optional: SecurityContext defines the security options the ephemeral container should be run with. If set, the fields of
SecurityContext override the equivalent fields of PodSecurityContext. */
  val securityContext: SecurityContext_core_v1?
  /** Probes are not allowed for ephemeral containers. */
  val startupProbe: Probe_core_v1?
  /** Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin
in the container will always result in EOF. Default is false. */
  @K8sDslMarker var stdin: Boolean?
  /** Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is
true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on
container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the
client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is
false, a container processes that reads from stdin will never receive an EOF. Default is false */
  @K8sDslMarker var stdinOnce: Boolean?
  /** If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be
run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container uses the namespaces
configured in the Pod spec. The container runtime must implement support for this feature. If the runtime does not
support namespace targeting then the result of setting this field is undefined. */
  @K8sDslMarker var targetContainerName: String?
  /** Optional: Path at which the file to which the container's termination message will be written is mounted into the
container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will
be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to
12kb. Defaults to /dev/termination-log. Cannot be updated. */
  @K8sDslMarker var terminationMessagePath: String?
  /** Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to
populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of
container log output if the termination message file is empty and the container exited with an error. The log output is
limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated. */
  @K8sDslMarker var terminationMessagePolicy: String?
  /** Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false. */
  @K8sDslMarker var tty: Boolean?
  /** volumeDevices is the list of block devices to be used by the container. */
  val volumeDevices: List<VolumeDevice_core_v1>?
  /** Pod volumes to mount into the container's filesystem. Subpath mounts are not allowed for ephemeral containers. Cannot be
updated. */
  val volumeMounts: List<VolumeMount_core_v1>?
  /** Container's working directory. If not specified, the container runtime's default will be used, which might be configured
in the container image. Cannot be updated. */
  @K8sDslMarker var workingDir: String?
}