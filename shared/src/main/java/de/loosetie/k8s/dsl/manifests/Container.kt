package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Container_core_v1_k8s1_16: K8sManifest {
  /** Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be
updated. */
  @K8sDslMarker var name: String?
  /** Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are
expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be
unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be
expanded, regardless of whether the variable exists or not. Cannot be updated. More info:
https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell */
  @K8sDslMarker var args: List<String>?
  /** Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable
references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference
in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped
references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info:
https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell */
  @K8sDslMarker var command: List<String>?
  /** List of environment variables to set in the container. Cannot be updated. */
  val env: List<EnvVar_core_v1_k8s1_16>?
  /** List of sources to populate environment variables in the container. The keys defined within a source must be a
C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in
multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a
duplicate key will take precedence. Cannot be updated. */
  val envFrom: List<EnvFromSource_core_v1_k8s1_16>?
  /** Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow
higher level config management to default or override container images in workload controllers like Deployments and
StatefulSets. */
  @K8sDslMarker var image: String?
  /** Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent
otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images */
  @K8sDslMarker var imagePullPolicy: String?
  /** Actions that the management system should take in response to container lifecycle events. Cannot be updated. */
  val lifecycle: Lifecycle_core_v1_k8s1_16?
  /** Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val livenessProbe: Probe_core_v1_k8s1_16?
  /** List of ports to expose from the container. Exposing a port here gives the system additional information about the
network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that
port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be
accessible from the network. Cannot be updated. */
  val ports: List<ContainerPort_core_v1_k8s1_16>?
  /** Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails.
Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val readinessProbe: Probe_core_v1_k8s1_16?
  /** Compute Resources required by this container. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/ */
  val resources: ResourceRequirements_core_v1_k8s1_16?
  /** Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More
info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/ */
  val securityContext: SecurityContext_core_v1_k8s1_16?
  /** StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this
completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be
used to provide different probe parameters at the beginning of a Pod's lifecycle, when it might take a long time to load
data or warm a cache, than during steady-state operation. This cannot be updated. This is an beta feature enabled by
default that can be disabled using the StartupProbe feature flag. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val startupProbe: Probe_core_v1_k8s1_16?
  /** Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin
in the container will always result in EOF. Default is false. */
  @K8sDslMarker var stdin: Boolean?
  /** Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is
true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on
container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the
client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is
false, a container processes that reads from stdin will never receive an EOF. Default is false */
  @K8sDslMarker var stdinOnce: Boolean?
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
  /** volumeDevices is the list of block devices to be used by the container. This is a beta feature. */
  val volumeDevices: List<VolumeDevice_core_v1_k8s1_16>?
  /** Pod volumes to mount into the container's filesystem. Cannot be updated. */
  val volumeMounts: List<VolumeMount_core_v1_k8s1_16>?
  /** Container's working directory. If not specified, the container runtime's default will be used, which might be configured
in the container image. Cannot be updated. */
  @K8sDslMarker var workingDir: String?
}      
@K8sDslMarker
interface Container_core_v1_k8s1_17: K8sManifest {
  /** Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be
updated. */
  @K8sDslMarker var name: String?
  /** Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are
expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be
unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be
expanded, regardless of whether the variable exists or not. Cannot be updated. More info:
https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell */
  @K8sDslMarker var args: List<String>?
  /** Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable
references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference
in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped
references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info:
https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell */
  @K8sDslMarker var command: List<String>?
  /** List of environment variables to set in the container. Cannot be updated. */
  val env: List<EnvVar_core_v1_k8s1_17>?
  /** List of sources to populate environment variables in the container. The keys defined within a source must be a
C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in
multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a
duplicate key will take precedence. Cannot be updated. */
  val envFrom: List<EnvFromSource_core_v1_k8s1_17>?
  /** Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow
higher level config management to default or override container images in workload controllers like Deployments and
StatefulSets. */
  @K8sDslMarker var image: String?
  /** Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent
otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images */
  @K8sDslMarker var imagePullPolicy: String?
  /** Actions that the management system should take in response to container lifecycle events. Cannot be updated. */
  val lifecycle: Lifecycle_core_v1_k8s1_17?
  /** Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val livenessProbe: Probe_core_v1_k8s1_17?
  /** List of ports to expose from the container. Exposing a port here gives the system additional information about the
network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that
port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be
accessible from the network. Cannot be updated. */
  val ports: List<ContainerPort_core_v1_k8s1_17>?
  /** Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails.
Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val readinessProbe: Probe_core_v1_k8s1_17?
  /** Compute Resources required by this container. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/ */
  val resources: ResourceRequirements_core_v1_k8s1_17?
  /** Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More
info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/ */
  val securityContext: SecurityContext_core_v1_k8s1_17?
  /** StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this
completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be
used to provide different probe parameters at the beginning of a Pod's lifecycle, when it might take a long time to load
data or warm a cache, than during steady-state operation. This cannot be updated. This is an alpha feature enabled by
the StartupProbe feature flag. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val startupProbe: Probe_core_v1_k8s1_17?
  /** Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin
in the container will always result in EOF. Default is false. */
  @K8sDslMarker var stdin: Boolean?
  /** Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is
true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on
container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the
client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is
false, a container processes that reads from stdin will never receive an EOF. Default is false */
  @K8sDslMarker var stdinOnce: Boolean?
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
  /** volumeDevices is the list of block devices to be used by the container. This is a beta feature. */
  val volumeDevices: List<VolumeDevice_core_v1_k8s1_17>?
  /** Pod volumes to mount into the container's filesystem. Cannot be updated. */
  val volumeMounts: List<VolumeMount_core_v1_k8s1_17>?
  /** Container's working directory. If not specified, the container runtime's default will be used, which might be configured
in the container image. Cannot be updated. */
  @K8sDslMarker var workingDir: String?
}      
@K8sDslMarker
interface Container_core_v1_k8s1_18: K8sManifest {
  /** Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be
updated. */
  @K8sDslMarker var name: String?
  /** Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are
expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be
unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be
expanded, regardless of whether the variable exists or not. Cannot be updated. More info:
https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell */
  @K8sDslMarker var args: List<String>?
  /** Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable
references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference
in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped
references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info:
https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell */
  @K8sDslMarker var command: List<String>?
  /** List of environment variables to set in the container. Cannot be updated. */
  val env: List<EnvVar_core_v1_k8s1_18>?
  /** List of sources to populate environment variables in the container. The keys defined within a source must be a
C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in
multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a
duplicate key will take precedence. Cannot be updated. */
  val envFrom: List<EnvFromSource_core_v1_k8s1_18>?
  /** Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow
higher level config management to default or override container images in workload controllers like Deployments and
StatefulSets. */
  @K8sDslMarker var image: String?
  /** Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent
otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images */
  @K8sDslMarker var imagePullPolicy: String?
  /** Actions that the management system should take in response to container lifecycle events. Cannot be updated. */
  val lifecycle: Lifecycle_core_v1_k8s1_18?
  /** Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val livenessProbe: Probe_core_v1_k8s1_18?
  /** List of ports to expose from the container. Exposing a port here gives the system additional information about the
network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that
port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be
accessible from the network. Cannot be updated. */
  val ports: List<ContainerPort_core_v1_k8s1_18>?
  /** Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails.
Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val readinessProbe: Probe_core_v1_k8s1_18?
  /** Compute Resources required by this container. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/ */
  val resources: ResourceRequirements_core_v1_k8s1_18?
  /** Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More
info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/ */
  val securityContext: SecurityContext_core_v1_k8s1_18?
  /** StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this
completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be
used to provide different probe parameters at the beginning of a Pod's lifecycle, when it might take a long time to load
data or warm a cache, than during steady-state operation. This cannot be updated. This is a beta feature enabled by the
StartupProbe feature flag. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val startupProbe: Probe_core_v1_k8s1_18?
  /** Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin
in the container will always result in EOF. Default is false. */
  @K8sDslMarker var stdin: Boolean?
  /** Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is
true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on
container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the
client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is
false, a container processes that reads from stdin will never receive an EOF. Default is false */
  @K8sDslMarker var stdinOnce: Boolean?
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
  val volumeDevices: List<VolumeDevice_core_v1_k8s1_18>?
  /** Pod volumes to mount into the container's filesystem. Cannot be updated. */
  val volumeMounts: List<VolumeMount_core_v1_k8s1_18>?
  /** Container's working directory. If not specified, the container runtime's default will be used, which might be configured
in the container image. Cannot be updated. */
  @K8sDslMarker var workingDir: String?
}      
@K8sDslMarker
interface Container_core_v1_k8s1_19: K8sManifest {
  /** Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be
updated. */
  @K8sDslMarker var name: String?
  /** Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are
expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be
unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be
expanded, regardless of whether the variable exists or not. Cannot be updated. More info:
https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell */
  @K8sDslMarker var args: List<String>?
  /** Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable
references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference
in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped
references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info:
https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell */
  @K8sDslMarker var command: List<String>?
  /** List of environment variables to set in the container. Cannot be updated. */
  val env: List<EnvVar_core_v1_k8s1_19>?
  /** List of sources to populate environment variables in the container. The keys defined within a source must be a
C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in
multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a
duplicate key will take precedence. Cannot be updated. */
  val envFrom: List<EnvFromSource_core_v1_k8s1_19>?
  /** Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow
higher level config management to default or override container images in workload controllers like Deployments and
StatefulSets. */
  @K8sDslMarker var image: String?
  /** Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent
otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images */
  @K8sDslMarker var imagePullPolicy: String?
  /** Actions that the management system should take in response to container lifecycle events. Cannot be updated. */
  val lifecycle: Lifecycle_core_v1_k8s1_19?
  /** Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val livenessProbe: Probe_core_v1_k8s1_19?
  /** List of ports to expose from the container. Exposing a port here gives the system additional information about the
network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that
port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be
accessible from the network. Cannot be updated. */
  val ports: List<ContainerPort_core_v1_k8s1_19>?
  /** Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails.
Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val readinessProbe: Probe_core_v1_k8s1_19?
  /** Compute Resources required by this container. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/ */
  val resources: ResourceRequirements_core_v1_k8s1_19?
  /** Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More
info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/ */
  val securityContext: SecurityContext_core_v1_k8s1_19?
  /** StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this
completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be
used to provide different probe parameters at the beginning of a Pod's lifecycle, when it might take a long time to load
data or warm a cache, than during steady-state operation. This cannot be updated. This is a beta feature enabled by the
StartupProbe feature flag. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val startupProbe: Probe_core_v1_k8s1_19?
  /** Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin
in the container will always result in EOF. Default is false. */
  @K8sDslMarker var stdin: Boolean?
  /** Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is
true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on
container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the
client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is
false, a container processes that reads from stdin will never receive an EOF. Default is false */
  @K8sDslMarker var stdinOnce: Boolean?
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
  val volumeDevices: List<VolumeDevice_core_v1_k8s1_19>?
  /** Pod volumes to mount into the container's filesystem. Cannot be updated. */
  val volumeMounts: List<VolumeMount_core_v1_k8s1_19>?
  /** Container's working directory. If not specified, the container runtime's default will be used, which might be configured
in the container image. Cannot be updated. */
  @K8sDslMarker var workingDir: String?
}      
@K8sDslMarker
interface Container_core_v1_k8s1_20: K8sManifest {
  /** Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be
updated. */
  @K8sDslMarker var name: String?
  /** Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are
expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be
unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be
expanded, regardless of whether the variable exists or not. Cannot be updated. More info:
https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell */
  @K8sDslMarker var args: List<String>?
  /** Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable
references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference
in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped
references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info:
https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell */
  @K8sDslMarker var command: List<String>?
  /** List of environment variables to set in the container. Cannot be updated. */
  val env: List<EnvVar_core_v1_k8s1_20>?
  /** List of sources to populate environment variables in the container. The keys defined within a source must be a
C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in
multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a
duplicate key will take precedence. Cannot be updated. */
  val envFrom: List<EnvFromSource_core_v1_k8s1_20>?
  /** Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow
higher level config management to default or override container images in workload controllers like Deployments and
StatefulSets. */
  @K8sDslMarker var image: String?
  /** Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent
otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images */
  @K8sDslMarker var imagePullPolicy: String?
  /** Actions that the management system should take in response to container lifecycle events. Cannot be updated. */
  val lifecycle: Lifecycle_core_v1_k8s1_20?
  /** Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val livenessProbe: Probe_core_v1_k8s1_20?
  /** List of ports to expose from the container. Exposing a port here gives the system additional information about the
network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that
port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be
accessible from the network. Cannot be updated. */
  val ports: List<ContainerPort_core_v1_k8s1_20>?
  /** Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails.
Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val readinessProbe: Probe_core_v1_k8s1_20?
  /** Compute Resources required by this container. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/ */
  val resources: ResourceRequirements_core_v1_k8s1_20?
  /** Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More
info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/ */
  val securityContext: SecurityContext_core_v1_k8s1_20?
  /** StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this
completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be
used to provide different probe parameters at the beginning of a Pod's lifecycle, when it might take a long time to load
data or warm a cache, than during steady-state operation. This cannot be updated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val startupProbe: Probe_core_v1_k8s1_20?
  /** Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin
in the container will always result in EOF. Default is false. */
  @K8sDslMarker var stdin: Boolean?
  /** Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is
true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on
container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the
client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is
false, a container processes that reads from stdin will never receive an EOF. Default is false */
  @K8sDslMarker var stdinOnce: Boolean?
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
  val volumeDevices: List<VolumeDevice_core_v1_k8s1_20>?
  /** Pod volumes to mount into the container's filesystem. Cannot be updated. */
  val volumeMounts: List<VolumeMount_core_v1_k8s1_20>?
  /** Container's working directory. If not specified, the container runtime's default will be used, which might be configured
in the container image. Cannot be updated. */
  @K8sDslMarker var workingDir: String?
}      
@K8sDslMarker
interface Container_core_v1_k8s1_21: K8sManifest {
  /** Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be
updated. */
  @K8sDslMarker var name: String?
  /** Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are
expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be
unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be
expanded, regardless of whether the variable exists or not. Cannot be updated. More info:
https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell */
  @K8sDslMarker var args: List<String>?
  /** Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable
references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference
in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped
references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info:
https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell */
  @K8sDslMarker var command: List<String>?
  /** List of environment variables to set in the container. Cannot be updated. */
  val env: List<EnvVar_core_v1_k8s1_21>?
  /** List of sources to populate environment variables in the container. The keys defined within a source must be a
C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in
multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a
duplicate key will take precedence. Cannot be updated. */
  val envFrom: List<EnvFromSource_core_v1_k8s1_21>?
  /** Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow
higher level config management to default or override container images in workload controllers like Deployments and
StatefulSets. */
  @K8sDslMarker var image: String?
  /** Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent
otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images */
  @K8sDslMarker var imagePullPolicy: String?
  /** Actions that the management system should take in response to container lifecycle events. Cannot be updated. */
  val lifecycle: Lifecycle_core_v1_k8s1_21?
  /** Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val livenessProbe: Probe_core_v1_k8s1_21?
  /** List of ports to expose from the container. Exposing a port here gives the system additional information about the
network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that
port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be
accessible from the network. Cannot be updated. */
  val ports: List<ContainerPort_core_v1_k8s1_21>?
  /** Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails.
Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val readinessProbe: Probe_core_v1_k8s1_21?
  /** Compute Resources required by this container. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/ */
  val resources: ResourceRequirements_core_v1_k8s1_21?
  /** Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More
info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/ */
  val securityContext: SecurityContext_core_v1_k8s1_21?
  /** StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this
completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be
used to provide different probe parameters at the beginning of a Pod's lifecycle, when it might take a long time to load
data or warm a cache, than during steady-state operation. This cannot be updated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val startupProbe: Probe_core_v1_k8s1_21?
  /** Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin
in the container will always result in EOF. Default is false. */
  @K8sDslMarker var stdin: Boolean?
  /** Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is
true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on
container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the
client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is
false, a container processes that reads from stdin will never receive an EOF. Default is false */
  @K8sDslMarker var stdinOnce: Boolean?
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
  val volumeDevices: List<VolumeDevice_core_v1_k8s1_21>?
  /** Pod volumes to mount into the container's filesystem. Cannot be updated. */
  val volumeMounts: List<VolumeMount_core_v1_k8s1_21>?
  /** Container's working directory. If not specified, the container runtime's default will be used, which might be configured
in the container image. Cannot be updated. */
  @K8sDslMarker var workingDir: String?
}