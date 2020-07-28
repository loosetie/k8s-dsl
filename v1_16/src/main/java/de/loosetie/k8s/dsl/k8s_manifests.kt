package de.loosetie.k8s.dsl

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker


@K8sDslMarker
interface Container_v1_core: K8sManifest {
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
  val env: List<EnvVar_v1_core>?
  /** List of sources to populate environment variables in the container. The keys defined within a source must be a
C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in
multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a
duplicate key will take precedence. Cannot be updated. */
  val envFrom: List<EnvFromSource_v1_core>?
  /** Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow
higher level config management to default or override container images in workload controllers like Deployments and
StatefulSets. */
  @K8sDslMarker var image: String?
  /** Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent
otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images */
  @K8sDslMarker var imagePullPolicy: String?
  /** Actions that the management system should take in response to container lifecycle events. Cannot be updated. */
  val lifecycle: Lifecycle_v1_core?
  /** Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val livenessProbe: Probe_v1_core?
  /** List of ports to expose from the container. Exposing a port here gives the system additional information about the
network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that
port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be
accessible from the network. Cannot be updated. */
  val ports: List<ContainerPort_v1_core>?
  /** Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails.
Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val readinessProbe: Probe_v1_core?
  /** Compute Resources required by this container. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/ */
  val resources: ResourceRequirements_v1_core?
  /** Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More
info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/ */
  val securityContext: SecurityContext_v1_core?
  /** StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this
completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be
used to provide different probe parameters at the beginning of a Pod's lifecycle, when it might take a long time to load
data or warm a cache, than during steady-state operation. This cannot be updated. This is an beta feature enabled by
default that can be disabled using the StartupProbe feature flag. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  val startupProbe: Probe_v1_core?
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
  val volumeDevices: List<VolumeDevice_v1_core>?
  /** Pod volumes to mount into the container's filesystem. Cannot be updated. */
  val volumeMounts: List<VolumeMount_v1_core>?
  /** Container's working directory. If not specified, the container runtime's default will be used, which might be configured
in the container image. Cannot be updated. */
  @K8sDslMarker var workingDir: String?
}

@K8sDslMarker
interface CronJob_v1beta1_batch: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "batch/v1beta1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "CronJob"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Specification of the desired behavior of a cron job, including the schedule. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Cronjobspec_v1beta1_batch
  /** Current status of a cron job. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val status: Cronjobstatus_v1beta1_batch?
}

@K8sDslMarker
interface DaemonSet_v1_apps: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "apps/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "DaemonSet"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** The desired behavior of this daemon set. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Daemonsetspec_v1_apps
  /** The current status of this daemon set. This data may be out of date by some window of time. Populated by the system.
Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val status: Daemonsetstatus_v1_apps?
}

@K8sDslMarker
interface Deployment_v1_apps: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "apps/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Deployment"
  /** Standard object metadata. */
  val metadata: ObjectMeta_v1_meta
  /** Specification of the desired behavior of the Deployment. */
  val spec: Deploymentspec_v1_apps
  /** Most recently observed status of the Deployment. */
  val status: Deploymentstatus_v1_apps?
}

@K8sDslMarker
interface Job_v1_batch: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "batch/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Job"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Specification of the desired behavior of a job. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Jobspec_v1_batch
  /** Current status of a job. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val status: Jobstatus_v1_batch?
}

@K8sDslMarker
interface Pod_v1_core: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Pod"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Specification of the desired behavior of the pod. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Podspec_v1_core
  /** Most recently observed status of the pod. This data may not be up to date. Populated by the system. Read-only. More
info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val status: Podstatus_v1_core?
}

@K8sDslMarker
interface ReplicaSet_v1_apps: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "apps/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ReplicaSet"
  /** If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s) that the ReplicaSet manages.
Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Spec defines the specification of the desired behavior of the ReplicaSet. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Replicasetspec_v1_apps
  /** Status is the most recently observed status of the ReplicaSet. This data may be out of date by some window of time.
Populated by the system. Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val status: Replicasetstatus_v1_apps?
}

@K8sDslMarker
interface ReplicationController_v1_core: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ReplicationController"
  /** If the Labels of a ReplicationController are empty, they are defaulted to be the same as the Pod(s) that the replication
controller manages. Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Spec defines the specification of the desired behavior of the replication controller. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Replicationcontrollerspec_v1_core
  /** Status is the most recently observed status of the replication controller. This data may be out of date by some window
of time. Populated by the system. Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val status: Replicationcontrollerstatus_v1_core?
}

@K8sDslMarker
interface StatefulSet_v1_apps: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "apps/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "StatefulSet"
  /**  */
  val metadata: ObjectMeta_v1_meta
  /** Spec defines the desired identities of pods in this set. */
  val spec: Statefulsetspec_v1_apps
  /** Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time. */
  val status: Statefulsetstatus_v1_apps?
}

@K8sDslMarker
interface Endpoints_v1_core: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Endpoints"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** The set of all endpoints is the union of all subsets. Addresses are placed into subsets according to the IPs they share.
A single address with multiple ports, some of which are ready and some of which are not (because they come from
different containers) will result in the address being displayed in different subsets for the different ports. No
address will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses and ports that
comprise a service. */
  val subsets: List<EndpointSubset_v1_core>?
}

@K8sDslMarker
interface EndpointSlice_v1alpha1_discovery_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "discovery.k8s.io/v1alpha1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "EndpointSlice"
  /** Standard object's metadata. */
  val metadata: ObjectMeta_v1_meta
  /** addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same
type. Default is IP */
  @K8sDslMarker var addressType: String?
  /** endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints. */
  val endpoints: List<Endpoint_v1alpha1_discovery_k8s_io>?
  /** ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name.
When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it
indicates "all ports". Each slice may include a maximum of 100 ports. */
  val ports: List<EndpointPort_v1alpha1_discovery_k8s_io>?
}

@K8sDslMarker
interface Ingress_v1beta1_networking_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "networking.k8s.io/v1beta1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Ingress"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Spec is the desired state of the Ingress. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Ingressspec_v1beta1_networking_k8s_io
  /** Status is the current state of the Ingress. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val status: Ingressstatus_v1beta1_networking_k8s_io?
}

@K8sDslMarker
interface Service_v1_core: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Service"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Spec defines the behavior of a service.
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Servicespec_v1_core
  /** Most recently observed status of the service. Populated by the system. Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val status: Servicestatus_v1_core?
}

@K8sDslMarker
interface ConfigMap_v1_core: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ConfigMap"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** BinaryData contains the binary data. Each key must consist of alphanumeric characters, '-', '_' or '.'. BinaryData can
contain byte sequences that are not in the UTF-8 range. The keys stored in BinaryData must not overlap with the ones in
the Data field, this is enforced during validation process. Using this field will require 1.10+ apiserver and
kubelet.

			Only Base64 encodes strings are accepted */
  @K8sDslMarker var binaryData: Map<String, String>?
  /** Data contains the configuration data. Each key must consist of alphanumeric characters, '-', '_' or '.'. Values with
non-UTF-8 byte sequences must use the BinaryData field. The keys stored in Data must not overlap with the keys in the
BinaryData field, this is enforced during validation process. */
  @K8sDslMarker var data: Map<String, String>?
}

@K8sDslMarker
interface CSIDriver_v1beta1_storage_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "storage.k8s.io/v1beta1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "CSIDriver"
  /** Standard object metadata. metadata.Name indicates the name of the CSI driver that this object refers to; it MUST be the
same name returned by the CSI GetPluginName() call for that driver. The driver name must be 63 characters or less,
beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and alphanumerics between.
More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Specification of the CSI Driver. */
  val spec: Csidriverspec_v1beta1_storage_k8s_io
}

@K8sDslMarker
interface CSINode_v1beta1_storage_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "storage.k8s.io/v1beta1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "CSINode"
  /** metadata.name must be the Kubernetes node name. */
  val metadata: ObjectMeta_v1_meta
  /** spec is the specification of CSINode */
  val spec: Csinodespec_v1beta1_storage_k8s_io
}

@K8sDslMarker
interface Secret_v1_core: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Secret"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Data contains the secret data. Each key must consist of alphanumeric characters, '-', '_' or '.'. The serialized form of
the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described
in https://tools.ietf.org/html/rfc4648#section-4 */
  @K8sDslMarker var data: Map<String, String>?
  /** stringData allows specifying non-binary secret data in string form. It is provided as a write-only convenience method.
All keys and values are merged into the data field on write, overwriting any existing values. It is never output when
reading from the API. */
  @K8sDslMarker var stringData: Map<String, String>?
  /** Used to facilitate programmatic handling of secret data. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface PersistentVolumeClaim_v1_core: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "PersistentVolumeClaim"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Spec defines the desired characteristics of a volume requested by a pod author. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
  val spec: Persistentvolumeclaimspec_v1_core
  /** Status represents the current information/status of a persistent volume claim. Read-only. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
  val status: Persistentvolumeclaimstatus_v1_core?
}

@K8sDslMarker
interface StorageClass_v1_storage_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "storage.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "StorageClass"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** AllowVolumeExpansion shows whether the storage class allow volume expand */
  @K8sDslMarker var allowVolumeExpansion: Boolean?
  /** Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported
topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only
honored by servers that enable the VolumeScheduling feature. */
  val allowedTopologies: List<TopologySelectorTerm_v1_core>?
  /** Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro",
"soft"]. Not validated - mount of the PVs will simply fail if one is invalid. */
  @K8sDslMarker var mountOptions: List<String>?
  /** Parameters holds the parameters for the provisioner that should create volumes of this storage class. */
  @K8sDslMarker var parameters: Map<String, String>?
  /** Provisioner indicates the type of the provisioner. */
  @K8sDslMarker var provisioner: String?
  /** Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete. */
  @K8sDslMarker var reclaimPolicy: String?
  /** VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound. When unset,
VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature. */
  @K8sDslMarker var volumeBindingMode: String?
}

@K8sDslMarker
interface Volume_v1_core: K8sManifest {
  /** Volume's name. Must be a DNS_LABEL and unique within the pod. More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to
the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
  val awsElasticBlockStore: AWSElasticBlockStoreVolumeSource_v1_core?
  /** AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod. */
  val azureDisk: AzureDiskVolumeSource_v1_core?
  /** AzureFile represents an Azure File Service mount on the host and bind mount to the pod. */
  val azureFile: AzureFileVolumeSource_v1_core?
  /** CephFS represents a Ceph FS mount on the host that shares a pod's lifetime */
  val cephfs: CephFSVolumeSource_v1_core?
  /** Cinder represents a cinder volume attached and mounted on kubelets host machine. More info:
https://examples.k8s.io/mysql-cinder-pd/README.md */
  val cinder: CinderVolumeSource_v1_core?
  /** ConfigMap represents a configMap that should populate this volume */
  val configMap: ConfigMapVolumeSource_v1_core?
  /** CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature). */
  val csi: CSIVolumeSource_v1_core?
  /** DownwardAPI represents downward API about the pod that should populate this volume */
  val downwardAPI: DownwardAPIVolumeSource_v1_core?
  /** EmptyDir represents a temporary directory that shares a pod's lifetime. More info:
https://kubernetes.io/docs/concepts/storage/volumes#emptydir */
  val emptyDir: EmptyDirVolumeSource_v1_core?
  /** FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod. */
  val fc: FCVolumeSource_v1_core?
  /** FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin. */
  val flexVolume: FlexVolumeSource_v1_core?
  /** Flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service
being running */
  val flocker: FlockerVolumeSource_v1_core?
  /** GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the
pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk */
  val gcePersistentDisk: GCEPersistentDiskVolumeSource_v1_core?
  /** GitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a
container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the
EmptyDir into the Pod's container. */
  val gitRepo: GitRepoVolumeSource_v1_core?
  /** Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info:
https://examples.k8s.io/volumes/glusterfs/README.md */
  val glusterfs: GlusterfsVolumeSource_v1_core?
  /** HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This
is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers
will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath */
  val hostPath: HostPathVolumeSource_v1_core?
  /** ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More
info: https://examples.k8s.io/volumes/iscsi/README.md */
  val iscsi: ISCSIVolumeSource_v1_core?
  /** NFS represents an NFS mount on the host that shares a pod's lifetime More info:
https://kubernetes.io/docs/concepts/storage/volumes#nfs */
  val nfs: NFSVolumeSource_v1_core?
  /** PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
  val persistentVolumeClaim: PersistentVolumeClaimVolumeSource_v1_core?
  /** PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine */
  val photonPersistentDisk: PhotonPersistentDiskVolumeSource_v1_core?
  /** PortworxVolume represents a portworx volume attached and mounted on kubelets host machine */
  val portworxVolume: PortworxVolumeSource_v1_core?
  /** Items for all in one resources secrets, configmaps, and downward API */
  val projected: ProjectedVolumeSource_v1_core?
  /** Quobyte represents a Quobyte mount on the host that shares a pod's lifetime */
  val quobyte: QuobyteVolumeSource_v1_core?
  /** RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info:
https://examples.k8s.io/volumes/rbd/README.md */
  val rbd: RBDVolumeSource_v1_core?
  /** ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes. */
  val scaleIO: ScaleIOVolumeSource_v1_core?
  /** Secret represents a secret that should populate this volume. More info:
https://kubernetes.io/docs/concepts/storage/volumes#secret */
  val secret: SecretVolumeSource_v1_core?
  /** StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes. */
  val storageos: StorageOSVolumeSource_v1_core?
  /** VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine */
  val vsphereVolume: VsphereVirtualDiskVolumeSource_v1_core?
}

@K8sDslMarker
interface VolumeAttachment_v1_storage_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "storage.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VolumeAttachment"
  /** Standard object metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system. */
  val spec: Volumeattachmentspec_v1_storage_k8s_io
  /** Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the
external-attacher. */
  val status: Volumeattachmentstatus_v1_storage_k8s_io?
}

@K8sDslMarker
interface ControllerRevision_v1_apps: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "apps/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ControllerRevision"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Data is the serialized representation of the state. */
  @K8sDslMarker var data: ByteArray?
  /** Revision indicates the revision of the state represented by Data. */
  @K8sDslMarker var revision: Int?
}

@K8sDslMarker
interface CustomResourceDefinition_v1_apiextensions_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "apiextensions.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "CustomResourceDefinition"
  /**  */
  val metadata: ObjectMeta_v1_meta
  /** spec describes how the user wants the resources to appear */
  val spec: Customresourcedefinitionspec_v1_apiextensions_k8s_io
  /** status indicates the actual state of the CustomResourceDefinition */
  val status: Customresourcedefinitionstatus_v1_apiextensions_k8s_io?
}

@K8sDslMarker
interface Event_v1_core: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Event"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** What action was taken/failed regarding to the Regarding object. */
  @K8sDslMarker var action: String?
  /** The number of times this event has occurred. */
  @K8sDslMarker var count: Int?
  /** Time when this Event was first observed. */
  val eventTime: MicroTime_v1_meta?
  /** The time at which the event was first recorded. (Time of server receipt is in TypeMeta.) */
  val firstTimestamp: Time_v1_meta?
  /** The object that this event is about. */
  val involvedObject: ObjectReference_v1_core?
  /** The time at which the most recent occurrence of this event was recorded. */
  val lastTimestamp: Time_v1_meta?
  /** A human-readable description of the status of this operation. */
  @K8sDslMarker var message: String?
  /** This should be a short, machine understandable string that gives the reason for the transition into the object's current
status. */
  @K8sDslMarker var reason: String?
  /** Optional secondary object for more complex actions. */
  val related: ObjectReference_v1_core?
  /** Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. */
  @K8sDslMarker var reportingComponent: String?
  /** ID of the controller instance, e.g. `kubelet-xyzf`. */
  @K8sDslMarker var reportingInstance: String?
  /** Data about the Event series this event represents or nil if it's a singleton Event. */
  val series: EventSeries_v1_core?
  /** The component reporting this event. Should be a short machine understandable string. */
  val source: EventSource_v1_core?
  /** Type of this event (Normal, Warning), new types could be added in the future */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface LimitRange_v1_core: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "LimitRange"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Spec defines the limits enforced. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Limitrangespec_v1_core
}

@K8sDslMarker
interface HorizontalPodAutoscaler_v1_autoscaling: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "autoscaling/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "HorizontalPodAutoscaler"
  /** Standard object metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** behaviour of autoscaler. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status. */
  val spec: Horizontalpodautoscalerspec_v1_autoscaling
  /** current information about the autoscaler. */
  val status: Horizontalpodautoscalerstatus_v1_autoscaling?
}

@K8sDslMarker
interface MutatingWebhookConfiguration_v1_admissionregistration_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "admissionregistration.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "MutatingWebhookConfiguration"
  /** Standard object metadata; More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata. */
  val metadata: ObjectMeta_v1_meta
  /** Webhooks is a list of webhooks and the affected resources and operations. */
  val webhooks: List<MutatingWebhook_v1_admissionregistration_k8s_io>?
}

@K8sDslMarker
interface ValidatingWebhookConfiguration_v1_admissionregistration_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "admissionregistration.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ValidatingWebhookConfiguration"
  /** Standard object metadata; More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata. */
  val metadata: ObjectMeta_v1_meta
  /** Webhooks is a list of webhooks and the affected resources and operations. */
  val webhooks: List<ValidatingWebhook_v1_admissionregistration_k8s_io>?
}

@K8sDslMarker
interface PodTemplate_v1_core: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "PodTemplate"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Template defines the pods that will be created from this pod template.
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val template: Podtemplatespec_v1_core?
}

@K8sDslMarker
interface PodDisruptionBudget_v1beta1_policy: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "policy/v1beta1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "PodDisruptionBudget"
  /**  */
  val metadata: ObjectMeta_v1_meta
  /** Specification of the desired behavior of the PodDisruptionBudget. */
  val spec: Poddisruptionbudgetspec_v1beta1_policy
  /** Most recently observed status of the PodDisruptionBudget. */
  val status: Poddisruptionbudgetstatus_v1beta1_policy?
}

@K8sDslMarker
interface PriorityClass_v1_scheduling_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "scheduling.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "PriorityClass"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** description is an arbitrary string that usually provides guidelines on when this priority class should be used. */
  @K8sDslMarker var description: String?
  /** globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not
have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one
PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default
PriorityClasses will be used as the default priority. */
  @K8sDslMarker var globalDefault: Boolean?
  /** PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to
PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the
NonPreemptingPriority feature. */
  @K8sDslMarker var preemptionPolicy: String?
  /** The value of this priority class. This is the actual priority that pods receive when they have the name of this class in
their pod spec. */
  @K8sDslMarker var value: Int?
}

@K8sDslMarker
interface PodPreset_v1alpha1_settings_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "settings.k8s.io/v1alpha1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "PodPreset"
  /**  */
  val metadata: ObjectMeta_v1_meta
  /**  */
  val spec: Podpresetspec_v1alpha1_settings_k8s_io
}

@K8sDslMarker
interface PodSecurityPolicy_v1beta1_policy: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "policy/v1beta1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "PodSecurityPolicy"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** spec defines the policy enforced. */
  val spec: Podsecuritypolicyspec_v1beta1_policy
}

@K8sDslMarker
interface APIService_v1_apiregistration_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "apiregistration.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "APIService"
  /**  */
  val metadata: ObjectMeta_v1_meta
  /** Spec contains information for locating and communicating with a server */
  val spec: Apiservicespec_v1_apiregistration_k8s_io
  /** Status contains derived information about an API server */
  val status: Apiservicestatus_v1_apiregistration_k8s_io?
}

@K8sDslMarker
interface AuditSink_v1alpha1_auditregistration_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "auditregistration.k8s.io/v1alpha1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "AuditSink"
  /**  */
  val metadata: ObjectMeta_v1_meta
  /** Spec defines the audit configuration spec */
  val spec: Auditsinkspec_v1alpha1_auditregistration_k8s_io
}

@K8sDslMarker
interface Binding_v1_core: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Binding"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** The target object that you want to bind to the standard object. */
  val target: ObjectReference_v1_core?
}

@K8sDslMarker
interface CertificateSigningRequest_v1beta1_certificates_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "certificates.k8s.io/v1beta1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "CertificateSigningRequest"
  /**  */
  val metadata: ObjectMeta_v1_meta
  /** The certificate request itself and any additional information. */
  val spec: Certificatesigningrequestspec_v1beta1_certificates_k8s_io
  /** Derived information about the request. */
  val status: Certificatesigningrequeststatus_v1beta1_certificates_k8s_io?
}

@K8sDslMarker
interface ClusterRole_v1_rbac_authorization_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "rbac.authorization.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ClusterRole"
  /** Standard object's metadata. */
  val metadata: ObjectMeta_v1_meta
  /** AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is
set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller. */
  val aggregationRule: AggregationRule_v1_rbac_authorization_k8s_io?
  /** Rules holds all the PolicyRules for this ClusterRole */
  val rules: List<PolicyRule_v1_rbac_authorization_k8s_io>?
}

@K8sDslMarker
interface ClusterRoleBinding_v1_rbac_authorization_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "rbac.authorization.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ClusterRoleBinding"
  /** Standard object's metadata. */
  val metadata: ObjectMeta_v1_meta
  /** RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must
return an error. */
  val roleRef: RoleRef_v1_rbac_authorization_k8s_io?
  /** Subjects holds references to the objects the role applies to. */
  val subjects: List<Subject_v1_rbac_authorization_k8s_io>?
}

@K8sDslMarker
interface ComponentStatus_v1_core: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ComponentStatus"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** List of component conditions observed */
  val conditions: List<ComponentCondition_v1_core>?
}

@K8sDslMarker
interface Lease_v1_coordination_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "coordination.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Lease"
  /** More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Specification of the Lease. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Leasespec_v1_coordination_k8s_io
}

@K8sDslMarker
interface LocalSubjectAccessReview_v1_authorization_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "authorization.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "LocalSubjectAccessReview"
  /**  */
  val metadata: ObjectMeta_v1_meta
  /** Spec holds information about the request being evaluated. spec.namespace must be equal to the namespace you made the
request against. If empty, it is defaulted. */
  val spec: Subjectaccessreviewspec_v1_authorization_k8s_io
  /** Status is filled in by the server and indicates whether the request is allowed or not */
  val status: Subjectaccessreviewstatus_v1_authorization_k8s_io?
}

@K8sDslMarker
interface Namespace_v1_core: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Namespace"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Spec defines the behavior of the Namespace. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Namespacespec_v1_core
  /** Status describes the current status of a Namespace. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val status: Namespacestatus_v1_core?
}

@K8sDslMarker
interface Node_v1_core: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Node"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Spec defines the behavior of a node.
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Nodespec_v1_core
  /** Most recently observed status of the node. Populated by the system. Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val status: Nodestatus_v1_core?
}

@K8sDslMarker
interface PersistentVolume_v1_core: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "PersistentVolume"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Spec defines a specification of a persistent volume owned by the cluster. Provisioned by an administrator. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes */
  val spec: Persistentvolumespec_v1_core
  /** Status represents the current information/status for the persistent volume. Populated by the system. Read-only. More
info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes */
  val status: Persistentvolumestatus_v1_core?
}

@K8sDslMarker
interface ResourceQuota_v1_core: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ResourceQuota"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Spec defines the desired quota.
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Resourcequotaspec_v1_core
  /** Status defines the actual enforced quota and its current usage.
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val status: Resourcequotastatus_v1_core?
}

@K8sDslMarker
interface Role_v1_rbac_authorization_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "rbac.authorization.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Role"
  /** Standard object's metadata. */
  val metadata: ObjectMeta_v1_meta
  /** Rules holds all the PolicyRules for this Role */
  val rules: List<PolicyRule_v1_rbac_authorization_k8s_io>?
}

@K8sDslMarker
interface RoleBinding_v1_rbac_authorization_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "rbac.authorization.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "RoleBinding"
  /** Standard object's metadata. */
  val metadata: ObjectMeta_v1_meta
  /** RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be
resolved, the Authorizer must return an error. */
  val roleRef: RoleRef_v1_rbac_authorization_k8s_io?
  /** Subjects holds references to the objects the role applies to. */
  val subjects: List<Subject_v1_rbac_authorization_k8s_io>?
}

@K8sDslMarker
interface RuntimeClass_v1beta1_node_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "node.k8s.io/v1beta1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "RuntimeClass"
  /** More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this
class. The possible values are specific to the node & CRI configuration. It is assumed that all handlers are available
on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might
specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The
Handler must conform to the DNS Label (RFC 1123) requirements, and is immutable. */
  @K8sDslMarker var handler: String?
  /** Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see
https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15,
and is only honored by servers that enable the PodOverhead feature. */
  val overhead: Overhead_v1beta1_node_k8s_io?
  /** Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes
that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes. */
  val scheduling: Scheduling_v1beta1_node_k8s_io?
}

@K8sDslMarker
interface SelfSubjectAccessReview_v1_authorization_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "authorization.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "SelfSubjectAccessReview"
  /**  */
  val metadata: ObjectMeta_v1_meta
  /** Spec holds information about the request being evaluated. user and groups must be empty */
  val spec: Selfsubjectaccessreviewspec_v1_authorization_k8s_io
  /** Status is filled in by the server and indicates whether the request is allowed or not */
  val status: Subjectaccessreviewstatus_v1_authorization_k8s_io?
}

@K8sDslMarker
interface SelfSubjectRulesReview_v1_authorization_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "authorization.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "SelfSubjectRulesReview"
  /**  */
  val metadata: ObjectMeta_v1_meta
  /** Spec holds information about the request being evaluated. */
  val spec: Selfsubjectrulesreviewspec_v1_authorization_k8s_io
  /** Status is filled in by the server and indicates the set of actions a user can perform. */
  val status: SubjectRulesReviewStatus_v1_authorization_k8s_io?
}

@K8sDslMarker
interface ServiceAccount_v1_core: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ServiceAccount"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** AutomountServiceAccountToken indicates whether pods running as this service account should have an API token
automatically mounted. Can be overridden at the pod level. */
  @K8sDslMarker var automountServiceAccountToken: Boolean?
  /** ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that
reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but
ImagePullSecrets are only accessed by the kubelet. More info:
https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod */
  val imagePullSecrets: List<LocalObjectReference_v1_core>?
  /** Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info:
https://kubernetes.io/docs/concepts/configuration/secret */
  val secrets: List<ObjectReference_v1_core>?
}

@K8sDslMarker
interface SubjectAccessReview_v1_authorization_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "authorization.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "SubjectAccessReview"
  /**  */
  val metadata: ObjectMeta_v1_meta
  /** Spec holds information about the request being evaluated */
  val spec: Subjectaccessreviewspec_v1_authorization_k8s_io
  /** Status is filled in by the server and indicates whether the request is allowed or not */
  val status: Subjectaccessreviewstatus_v1_authorization_k8s_io?
}

@K8sDslMarker
interface TokenRequest_v1_authentication_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "authentication.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "TokenRequest"
  /**  */
  val metadata: ObjectMeta_v1_meta
  /**  */
  val spec: Tokenrequestspec_v1_authentication_k8s_io
  /**  */
  val status: Tokenrequeststatus_v1_authentication_k8s_io?
}

@K8sDslMarker
interface TokenReview_v1_authentication_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "authentication.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "TokenReview"
  /**  */
  val metadata: ObjectMeta_v1_meta
  /** Spec holds information about the request being evaluated */
  val spec: Tokenreviewspec_v1_authentication_k8s_io
  /** Status is filled in by the server and indicates whether the request can be authenticated. */
  val status: Tokenreviewstatus_v1_authentication_k8s_io?
}

@K8sDslMarker
interface NetworkPolicy_v1_networking_k8s_io: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "networking.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "NetworkPolicy"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta
  /** Specification of the desired behavior for this NetworkPolicy. */
  val spec: Networkpolicyspec_v1_networking_k8s_io
}

@K8sDslMarker
interface APIGroup_v1_meta: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "meta/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "APIGroup"
  /** name is the name of the group. */
  @K8sDslMarker var name: String?
  /** preferredVersion is the version preferred by the API server, which probably is the storage version. */
  val preferredVersion: GroupVersionForDiscovery_v1_meta?
  /** a map of client CIDR to server address that is serving this group. This is to help clients reach servers in the most
network-efficient way possible. Clients can use the appropriate server address as per the CIDR that they match. In case
of multiple matches, clients should use the longest matching CIDR. The server returns only those CIDRs that it thinks
that the client can match. For example: the master will return an internal IP CIDR only, if the client reaches the
server using an internal IP. Server looks at X-Forwarded-For header or X-Real-Ip header or request.RemoteAddr (in that
order) to get the client IP. */
  val serverAddressByClientCIDRs: List<ServerAddressByClientCIDR_v1_meta>?
  /** versions are the versions supported in this group. */
  val versions: List<GroupVersionForDiscovery_v1_meta>?
}

@K8sDslMarker
interface APIResource_v1_meta: K8sManifest {
  /** kind is the kind for the resource (e.g. 'Foo' is the kind for a resource 'foo') */
  @K8sDslMarker var kind: String?
  /** name is the plural name of the resource. */
  @K8sDslMarker var name: String?
  /** categories is a list of the grouped resources this resource belongs to (e.g. 'all') */
  @K8sDslMarker var categories: List<String>?
  /** group is the preferred group of the resource. Empty implies the group of the containing resource list. For subresources,
this may have a different value, for example: Scale". */
  @K8sDslMarker var group: String?
  /** namespaced indicates if a resource is namespaced or not. */
  @K8sDslMarker var namespaced: Boolean?
  /** shortNames is a list of suggested short names of the resource. */
  @K8sDslMarker var shortNames: List<String>?
  /** singularName is the singular name of the resource. This allows clients to handle plural and singular opaquely. The
singularName is more correct for reporting status on a single item and both singular and plural are allowed from the
kubectl CLI interface. */
  @K8sDslMarker var singularName: String?
  /** The hash value of the storage version, the version this resource is converted to when written to the data store. Value
must be treated as opaque by clients. Only equality comparison on the value is valid. This is an alpha feature and may
change or be removed in the future. The field is populated by the apiserver only if the StorageVersionHash feature gate
is enabled. This field will remain optional even if it graduates. */
  @K8sDslMarker var storageVersionHash: String?
  /** verbs is a list of supported kube verbs (this includes get, list, watch, create, update, patch, delete,
deletecollection, and proxy) */
  @K8sDslMarker var verbs: List<String>?
  /** version is the preferred version of the resource. Empty implies the version of the containing resource list For
subresources, this may have a different value, for example: v1 (while inside a v1beta1 version of the core resource's
group)". */
  @K8sDslMarker var version: String?
}

@K8sDslMarker
interface APIServiceCondition_v1_apiregistration_k8s_io: K8sManifest {
  /** Last time the condition transitioned from one status to another. */
  val lastTransitionTime: Time_v1_meta?
  /** Human-readable message indicating details about last transition. */
  @K8sDslMarker var message: String?
  /** Unique, one-word, CamelCase reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** Status is the status of the condition. Can be True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type is the type of the condition. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface APIVersions_v1_meta: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "meta/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "APIVersions"
  /** a map of client CIDR to server address that is serving this group. This is to help clients reach servers in the most
network-efficient way possible. Clients can use the appropriate server address as per the CIDR that they match. In case
of multiple matches, clients should use the longest matching CIDR. The server returns only those CIDRs that it thinks
that the client can match. For example: the master will return an internal IP CIDR only, if the client reaches the
server using an internal IP. Server looks at X-Forwarded-For header or X-Real-Ip header or request.RemoteAddr (in that
order) to get the client IP. */
  val serverAddressByClientCIDRs: List<ServerAddressByClientCIDR_v1_meta>?
  /** versions are the api versions that are available. */
  @K8sDslMarker var versions: List<String>?
}

@K8sDslMarker
interface AWSElasticBlockStoreVolumeSource_v1_core: K8sManifest {
  /** Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host
operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info:
https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
  @K8sDslMarker var fsType: String?
  /** The partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For
volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can
leave the property empty). */
  @K8sDslMarker var partition: Int?
  /** Specify "true" to force and set the ReadOnly property in VolumeMounts to "true". If omitted, the default is "false".
More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
  @K8sDslMarker var readOnly: Boolean?
  /** Unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info:
https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
  @K8sDslMarker var volumeID: String?
}

@K8sDslMarker
interface Affinity_v1_core: K8sManifest {
  /** Describes node affinity scheduling rules for the pod. */
  val nodeAffinity: NodeAffinity_v1_core?
  /** Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)). */
  val podAffinity: PodAffinity_v1_core?
  /** Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other
pod(s)). */
  val podAntiAffinity: PodAntiAffinity_v1_core?
}

@K8sDslMarker
interface AggregationRule_v1_rbac_authorization_k8s_io: K8sManifest {
  /** ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of
the selectors match, then the ClusterRole's permissions will be added */
  val clusterRoleSelectors: List<LabelSelector_v1_meta>?
}

@K8sDslMarker
interface AllowedCSIDriver_v1beta1_policy: K8sManifest {
  /** Name is the registered name of the CSI driver */
  @K8sDslMarker var name: String?
}

@K8sDslMarker
interface AllowedFlexVolume_v1beta1_policy: K8sManifest {
  /** driver is the name of the Flexvolume driver. */
  @K8sDslMarker var driver: String?
}

@K8sDslMarker
interface AllowedHostPath_v1beta1_policy: K8sManifest {
  /** pathPrefix is the path prefix that the host volume must match. It does not support ``*``. Trailing slashes are trimmed
when validating the path prefix with a host path. Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo`
would not allow `/food` or `/etc/foo` */
  @K8sDslMarker var pathPrefix: String?
  /** when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly. */
  @K8sDslMarker var readOnly: Boolean?
}

@K8sDslMarker
interface AttachedVolume_v1_core: K8sManifest {
  /** Name of the attached volume */
  @K8sDslMarker var name: String?
  /** DevicePath represents the device path where the volume should be available */
  @K8sDslMarker var devicePath: String?
}

@K8sDslMarker
interface AzureDiskVolumeSource_v1_core: K8sManifest {
  /** Expected values Shared: multiple blob disks per storage account Dedicated: single blob disk per storage account Managed:
azure managed data disk (only in managed availability set). defaults to shared */
  @K8sDslMarker var kind: String?
  /** Host Caching mode: None, Read Only, Read Write. */
  @K8sDslMarker var cachingMode: String?
  /** The Name of the data disk in the blob storage */
  @K8sDslMarker var diskName: String?
  /** The URI the data disk in the blob storage */
  @K8sDslMarker var diskURI: String?
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
Implicitly inferred to be "ext4" if unspecified. */
  @K8sDslMarker var fsType: String?
  /** Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
}

@K8sDslMarker
interface AzureFilePersistentVolumeSource_v1_core: K8sManifest {
  /** Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** the name of secret that contains Azure Storage Account Name and Key */
  @K8sDslMarker var secretName: String?
  /** the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod */
  @K8sDslMarker var secretNamespace: String?
  /** Share Name */
  @K8sDslMarker var shareName: String?
}

@K8sDslMarker
interface AzureFileVolumeSource_v1_core: K8sManifest {
  /** Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** the name of secret that contains Azure Storage Account Name and Key */
  @K8sDslMarker var secretName: String?
  /** Share Name */
  @K8sDslMarker var shareName: String?
}

@K8sDslMarker
interface BoundObjectReference_v1_authentication_k8s_io: K8sTopLevel {
  /** API version of the referent. */
  override val apiVersion: String
    get() = "authentication.k8s.io/v1"
  /** Kind of the referent. Valid kinds are 'Pod' and 'Secret'. */
  override val kind: String
    get() = "BoundObjectReference"
  /** Name of the referent. */
  @K8sDslMarker var name: String?
  /** UID of the referent. */
  @K8sDslMarker var uid: String?
}

@K8sDslMarker
interface CSINodeDriver_v1beta1_storage_k8s_io: K8sManifest {
  /** This is the name of the CSI driver that this object refers to. This MUST be the same name returned by the CSI
GetPluginName() call for that driver. */
  @K8sDslMarker var name: String?
  /** allocatable represents the volume resources of a node that are available for scheduling. */
  val allocatable: VolumeNodeResources_v1beta1_storage_k8s_io?
  /** nodeID of the node from the driver point of view. This field enables Kubernetes to communicate with storage systems that
do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as "node1", but the
storage system may refer to the same node as "nodeA". When Kubernetes issues a command to the storage system to attach a
volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will
understand, e.g. "nodeA" instead of "node1". This field is required. */
  @K8sDslMarker var nodeID: String?
  /** topologyKeys is the list of keys supported by the driver. When a driver is initialized on a cluster, it provides a set
of topology keys that it understands (e.g. "company.com/zone", "company.com/region"). When a driver is initialized on a
node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own
node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should
retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology
keys. This can be empty if driver does not support topology. */
  @K8sDslMarker var topologyKeys: List<String>?
}

@K8sDslMarker
interface CSIPersistentVolumeSource_v1_core: K8sManifest {
  /** ControllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver
to complete the CSI ControllerExpandVolume call. This is an alpha field and requires enabling ExpandCSIVolumes feature
gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one
secret, all secrets are passed. */
  val controllerExpandSecretRef: SecretReference_v1_core?
  /** ControllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI
driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may
be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed. */
  val controllerPublishSecretRef: SecretReference_v1_core?
  /** Driver is the name of the driver to use for this volume. Required. */
  @K8sDslMarker var driver: String?
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". */
  @K8sDslMarker var fsType: String?
  /** NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to
complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret
is required. If the secret object contains more than one secret, all secrets are passed. */
  val nodePublishSecretRef: SecretReference_v1_core?
  /** NodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to
complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be
empty if no secret is required. If the secret object contains more than one secret, all secrets are passed. */
  val nodeStageSecretRef: SecretReference_v1_core?
  /** Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write). */
  @K8sDslMarker var readOnly: Boolean?
  /** Attributes of the volume to publish. */
  @K8sDslMarker var volumeAttributes: Map<String, String>?
  /** VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all
subsequent calls. Required. */
  @K8sDslMarker var volumeHandle: String?
}

@K8sDslMarker
interface CSIVolumeSource_v1_core: K8sManifest {
  /** Driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as
registered in the cluster. */
  @K8sDslMarker var driver: String?
  /** Filesystem type to mount. Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is passed to the associated CSI
driver which will determine the default filesystem to apply. */
  @K8sDslMarker var fsType: String?
  /** NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to
complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret
is required. If the secret object contains more than one secret, all secret references are passed. */
  val nodePublishSecretRef: LocalObjectReference_v1_core?
  /** Specifies a read-only configuration for the volume. Defaults to false (read/write). */
  @K8sDslMarker var readOnly: Boolean?
  /** VolumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's
documentation for supported values. */
  @K8sDslMarker var volumeAttributes: Map<String, String>?
}

@K8sDslMarker
interface Capabilities_v1_core: K8sManifest {
  /** Added capabilities */
  @K8sDslMarker var add: List<String>?
  /** Removed capabilities */
  @K8sDslMarker var drop: List<String>?
}

@K8sDslMarker
interface CephFSPersistentVolumeSource_v1_core: K8sManifest {
  /** Required: Monitors is a collection of Ceph monitors More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
  @K8sDslMarker var monitors: List<String>?
  /** Optional: Used as the mounted root, rather than the full Ceph tree, default is / */
  @K8sDslMarker var path: String?
  /** Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
  @K8sDslMarker var readOnly: Boolean?
  /** Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
  @K8sDslMarker var secretFile: String?
  /** Optional: SecretRef is reference to the authentication secret for User, default is empty. More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
  val secretRef: SecretReference_v1_core?
  /** Optional: User is the rados user name, default is admin More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
  @K8sDslMarker var user: String?
}

@K8sDslMarker
interface CephFSVolumeSource_v1_core: K8sManifest {
  /** Required: Monitors is a collection of Ceph monitors More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
  @K8sDslMarker var monitors: List<String>?
  /** Optional: Used as the mounted root, rather than the full Ceph tree, default is / */
  @K8sDslMarker var path: String?
  /** Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
  @K8sDslMarker var readOnly: Boolean?
  /** Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
  @K8sDslMarker var secretFile: String?
  /** Optional: SecretRef is reference to the authentication secret for User, default is empty. More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
  val secretRef: LocalObjectReference_v1_core?
  /** Optional: User is the rados user name, default is admin More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
  @K8sDslMarker var user: String?
}

@K8sDslMarker
interface CertificateSigningRequestCondition_v1beta1_certificates_k8s_io: K8sManifest {
  /** timestamp for the last update to this condition */
  val lastUpdateTime: Time_v1_meta?
  /** human readable message with details about the request state */
  @K8sDslMarker var message: String?
  /** brief reason for the request state */
  @K8sDslMarker var reason: String?
  /** request approval state, currently Approved or Denied. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface CinderPersistentVolumeSource_v1_core: K8sManifest {
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs",
"ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md */
  @K8sDslMarker var fsType: String?
  /** Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info:
https://examples.k8s.io/mysql-cinder-pd/README.md */
  @K8sDslMarker var readOnly: Boolean?
  /** Optional: points to a secret object containing parameters used to connect to OpenStack. */
  val secretRef: SecretReference_v1_core?
  /** volume id used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md */
  @K8sDslMarker var volumeID: String?
}

@K8sDslMarker
interface CinderVolumeSource_v1_core: K8sManifest {
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs",
"ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md */
  @K8sDslMarker var fsType: String?
  /** Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info:
https://examples.k8s.io/mysql-cinder-pd/README.md */
  @K8sDslMarker var readOnly: Boolean?
  /** Optional: points to a secret object containing parameters used to connect to OpenStack. */
  val secretRef: LocalObjectReference_v1_core?
  /** volume id used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md */
  @K8sDslMarker var volumeID: String?
}

@K8sDslMarker
interface ClientIPConfig_v1_core: K8sManifest {
  /** timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be >0 && <=86400(for 1 day) if
ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours). */
  @K8sDslMarker var timeoutSeconds: Int?
}

@K8sDslMarker
interface ComponentCondition_v1_core: K8sManifest {
  /** Condition error code for a component. For example, a health check error code. */
  @K8sDslMarker var error: String?
  /** Message about the condition for a component. For example, information about a health check. */
  @K8sDslMarker var message: String?
  /** Status of the condition for a component. Valid values for "Healthy": "True", "False", or "Unknown". */
  @K8sDslMarker var status: String?
  /** Type of condition for a component. Valid value: "Healthy" */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface ConfigMapEnvSource_v1_core: K8sManifest {
  /** Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** Specify whether the ConfigMap must be defined */
  @K8sDslMarker var optional: Boolean?
}

@K8sDslMarker
interface ConfigMapKeySelector_v1_core: K8sManifest {
  /** Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** The key to select. */
  @K8sDslMarker var key: String?
  /** Specify whether the ConfigMap or its key must be defined */
  @K8sDslMarker var optional: Boolean?
}

@K8sDslMarker
interface ConfigMapNodeConfigSource_v1_core: K8sManifest {
  /** Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases. */
  @K8sDslMarker var namespace: String?
  /** Name is the metadata.name of the referenced ConfigMap. This field is required in all cases. */
  @K8sDslMarker var name: String?
  /** KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This
field is required in all cases. */
  @K8sDslMarker var kubeletConfigKey: String?
  /** ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and
required in Node.Status. */
  @K8sDslMarker var resourceVersion: String?
  /** UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status. */
  @K8sDslMarker var uid: String?
}

@K8sDslMarker
interface ConfigMapProjection_v1_core: K8sManifest {
  /** Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a
file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified
paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume
setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with
'..'. */
  val items: List<KeyToPath_v1_core>?
  /** Specify whether the ConfigMap or its keys must be defined */
  @K8sDslMarker var optional: Boolean?
}

@K8sDslMarker
interface ConfigMapVolumeSource_v1_core: K8sManifest {
  /** Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644.
Directories within the path are not affected by this setting. This might be in conflict with other options that affect
the file mode, like fsGroup, and the result can be other mode bits set. */
  @K8sDslMarker var defaultMode: Int?
  /** If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a
file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified
paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume
setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with
'..'. */
  val items: List<KeyToPath_v1_core>?
  /** Specify whether the ConfigMap or its keys must be defined */
  @K8sDslMarker var optional: Boolean?
}

@K8sDslMarker
interface ContainerImage_v1_core: K8sManifest {
  /** Names by which this image is known. e.g. ["k8s.gcr.io/hyperkube:v1.0.7",
"dockerhub.io/google_containers/hyperkube:v1.0.7"] */
  @K8sDslMarker var names: List<String>?
  /** The size of the image in bytes. */
  @K8sDslMarker var sizeBytes: Int?
}

@K8sDslMarker
interface ContainerPort_v1_core: K8sManifest {
  /** If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name.
Name for the port that can be referred to by services. */
  @K8sDslMarker var name: String?
  /** Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536. */
  @K8sDslMarker var containerPort: Int?
  /** What host IP to bind the external port to. */
  @K8sDslMarker var hostIP: String?
  /** Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is
specified, this must match ContainerPort. Most containers do not need this. */
  @K8sDslMarker var hostPort: Int?
  /** Protocol for port. Must be UDP, TCP, or SCTP. Defaults to "TCP". */
  @K8sDslMarker var protocol: String?
}

@K8sDslMarker
interface ContainerState_v1_core: K8sManifest {
  /** Details about a running container */
  val running: ContainerStateRunning_v1_core?
  /** Details about a terminated container */
  val terminated: ContainerStateTerminated_v1_core?
  /** Details about a waiting container */
  val waiting: ContainerStateWaiting_v1_core?
}

@K8sDslMarker
interface ContainerStateRunning_v1_core: K8sManifest {
  /** Time at which the container was last (re-)started */
  val startedAt: Time_v1_meta?
}

@K8sDslMarker
interface ContainerStateTerminated_v1_core: K8sManifest {
  /** Container's ID in the format 'docker://<container_id>' */
  @K8sDslMarker var containerID: String?
  /** Exit status from the last termination of the container */
  @K8sDslMarker var exitCode: Int?
  /** Time at which the container last terminated */
  val finishedAt: Time_v1_meta?
  /** Message regarding the last termination of the container */
  @K8sDslMarker var message: String?
  /** (brief) reason from the last termination of the container */
  @K8sDslMarker var reason: String?
  /** Signal from the last termination of the container */
  @K8sDslMarker var signal: Int?
  /** Time at which previous execution of the container started */
  val startedAt: Time_v1_meta?
}

@K8sDslMarker
interface ContainerStateWaiting_v1_core: K8sManifest {
  /** Message regarding why the container is not yet running. */
  @K8sDslMarker var message: String?
  /** (brief) reason the container is not yet running. */
  @K8sDslMarker var reason: String?
}

@K8sDslMarker
interface CrossVersionObjectReference_v1_autoscaling: K8sTopLevel {
  /** API version of the referent */
  override val apiVersion: String
    get() = "autoscaling/v1"
  /** Kind of the referent; More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds" */
  override val kind: String
    get() = "CrossVersionObjectReference"
  /** Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names */
  @K8sDslMarker var name: String?
}

@K8sDslMarker
interface CustomResourceColumnDefinition_v1_apiextensions_k8s_io: K8sManifest {
  /** name is a human readable name for the column. */
  @K8sDslMarker var name: String?
  /** description is a human readable description of this column. */
  @K8sDslMarker var description: String?
  /** format is an optional OpenAPI type definition for this column. The 'name' format is applied to the primary identifier
column to assist in clients identifying column is the resource name. See
https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details. */
  @K8sDslMarker var format: String?
  /** jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the
value for this column. */
  @K8sDslMarker var jsonPath: String?
  /** priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered
higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0. */
  @K8sDslMarker var priority: Int?
  /** type is an OpenAPI type definition for this column. See
https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface CustomResourceConversion_v1_apiextensions_k8s_io: K8sManifest {
  /** strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only
change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to
an external webhook to do the conversion. Additional information is needed for this option. This requires
spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set. */
  @K8sDslMarker var strategy: String?
  /** webhook describes how to call the conversion webhook. Required when `strategy` is set to `Webhook`. */
  val webhook: WebhookConversion_v1_apiextensions_k8s_io?
}

@K8sDslMarker
interface CustomResourceDefinitionCondition_v1_apiextensions_k8s_io: K8sManifest {
  /** lastTransitionTime last time the condition transitioned from one status to another. */
  val lastTransitionTime: Time_v1_meta?
  /** message is a human-readable message indicating details about last transition. */
  @K8sDslMarker var message: String?
  /** reason is a unique, one-word, CamelCase reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** status is the status of the condition. Can be True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** type is the type of the condition. Types include Established, NamesAccepted and Terminating. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface CustomResourceDefinitionNames_v1_apiextensions_k8s_io: K8sManifest {
  /** kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use
this value as the `kind` attribute in API calls. */
  @K8sDslMarker var kind: String?
  /** categories is a list of grouped resources this custom resource belongs to (e.g. 'all'). This is published in API
discovery documents, and used by clients to support invocations like `kubectl get all`. */
  @K8sDslMarker var categories: List<String>?
  /** listKind is the serialized kind of the list for this resource. Defaults to "`kind`List". */
  @K8sDslMarker var listKind: String?
  /** plural is the plural name of the resource to serve. The custom resources are served under
`/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition (in the form
`<names.plural>.<group>`). Must be all lowercase. */
  @K8sDslMarker var plural: String?
  /** shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support
invocations like `kubectl get <shortname>`. It must be all lowercase. */
  @K8sDslMarker var shortNames: List<String>?
  /** singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`. */
  @K8sDslMarker var singular: String?
}

@K8sDslMarker
interface CustomResourceDefinitionVersion_v1_apiextensions_k8s_io: K8sManifest {
  /** name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at
`/apis/<group>/<version>/...` if `served` is true. */
  @K8sDslMarker var name: String?
  /** additionalPrinterColumns specifies additional columns returned in Table output. See
https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If no columns
are specified, a single column displaying the age of the custom resource is used. */
  val additionalPrinterColumns: List<CustomResourceColumnDefinition_v1_apiextensions_k8s_io>?
  /** schema describes the schema used for validation, pruning, and defaulting of this version of the custom resource. */
  val schema: CustomResourceValidation_v1_apiextensions_k8s_io?
  /** served is a flag enabling/disabling this version from being served via REST APIs */
  @K8sDslMarker var served: Boolean?
  /** storage indicates this version should be used when persisting custom resources to storage. There must be exactly one
version with storage=true. */
  @K8sDslMarker var storage: Boolean?
  /** subresources specify what subresources this version of the defined custom resource have. */
  val subresources: CustomResourceSubresources_v1_apiextensions_k8s_io?
}

@K8sDslMarker
interface CustomResourceSubresourceScale_v1_apiextensions_k8s_io: K8sManifest {
  /** labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only
JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work
with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct)
which contains a serialized label selector in string form. More info:
https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If
there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource
will default to the empty string. */
  @K8sDslMarker var labelSelectorPath: String?
  /** specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON
paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given
path in the custom resource, the `/scale` subresource will return an error on GET. */
  @K8sDslMarker var specReplicasPath: String?
  /** statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only
JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the
given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0. */
  @K8sDslMarker var statusReplicasPath: String?
}

@K8sDslMarker
interface CustomResourceSubresourceStatus_v1_apiextensions_k8s_io: K8sManifest {
  
}

@K8sDslMarker
interface CustomResourceSubresources_v1_apiextensions_k8s_io: K8sManifest {
  /** scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object. */
  val scale: CustomResourceSubresourceScale_v1_apiextensions_k8s_io?
  /** status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom
resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource
`/status` subresource ignore changes to anything other than the `status` stanza of the object. */
  val status: CustomResourceSubresourceStatus_v1_apiextensions_k8s_io?
}

@K8sDslMarker
interface CustomResourceValidation_v1_apiextensions_k8s_io: K8sManifest {
  /** openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning. */
  val openAPIV3Schema: JSONSchemaProps_v1_apiextensions_k8s_io?
}

@K8sDslMarker
interface DaemonEndpoint_v1_core: K8sManifest {
  /** Port number of the given endpoint. */
  @K8sDslMarker var Port: Int?
}

@K8sDslMarker
interface DaemonSetCondition_v1_apps: K8sManifest {
  /** Last time the condition transitioned from one status to another. */
  val lastTransitionTime: Time_v1_meta?
  /** A human readable message indicating details about the transition. */
  @K8sDslMarker var message: String?
  /** The reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** Status of the condition, one of True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type of DaemonSet condition. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface DaemonSetUpdateStrategy_v1_apps: K8sManifest {
  /** Rolling update config params. Present only if type = "RollingUpdate". */
  val rollingUpdate: Rollingupdatedaemonset_v1_apps?
  /** Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface DeleteOptions_v1_meta: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "meta/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "DeleteOptions"
  /** When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will
result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will
be processed */
  @K8sDslMarker var dryRun: List<String>?
  /** The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero
indicates delete immediately. If this value is nil, the default grace period for the specified type will be used.
Defaults to a per object value if not specified. zero means delete immediately. */
  @K8sDslMarker var gracePeriodSeconds: Int?
  /** Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be
orphaned. If true/false, the "orphan" finalizer will be added to/removed from the object's finalizers list. Either this
field or PropagationPolicy may be set, but not both. */
  @K8sDslMarker var orphanDependents: Boolean?
  /** Must be fulfilled before a deletion is carried out. If not possible, a 409 Conflict status will be returned. */
  val preconditions: Preconditions_v1_meta?
  /** Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both.
The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default
policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete
the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground. */
  @K8sDslMarker var propagationPolicy: String?
}

@K8sDslMarker
interface DeploymentCondition_v1_apps: K8sManifest {
  /** Last time the condition transitioned from one status to another. */
  val lastTransitionTime: Time_v1_meta?
  /** The last time this condition was updated. */
  val lastUpdateTime: Time_v1_meta?
  /** A human readable message indicating details about the transition. */
  @K8sDslMarker var message: String?
  /** The reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** Status of the condition, one of True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type of deployment condition. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface DownwardAPIProjection_v1_core: K8sManifest {
  /** Items is a list of DownwardAPIVolume file */
  val items: List<DownwardAPIVolumeFile_v1_core>?
}

@K8sDslMarker
interface DownwardAPIVolumeFile_v1_core: K8sManifest {
  /** Required: Selects a field of the pod: only annotations, labels, name and namespace are supported. */
  val fieldRef: ObjectFieldSelector_v1_core?
  /** Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode
will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can
be other mode bits set. */
  @K8sDslMarker var mode: Int?
  /** Required: Path is the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must
be utf-8 encoded. The first item of the relative path must not start with '..' */
  @K8sDslMarker var path: String?
  /** Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and
requests.memory) are currently supported. */
  val resourceFieldRef: ResourceFieldSelector_v1_core?
}

@K8sDslMarker
interface DownwardAPIVolumeSource_v1_core: K8sManifest {
  /** Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644.
Directories within the path are not affected by this setting. This might be in conflict with other options that affect
the file mode, like fsGroup, and the result can be other mode bits set. */
  @K8sDslMarker var defaultMode: Int?
  /** Items is a list of downward API volume file */
  val items: List<DownwardAPIVolumeFile_v1_core>?
}

@K8sDslMarker
interface EmptyDirVolumeSource_v1_core: K8sManifest {
  /** What type of storage medium should back this directory. The default is "" which means to use the node's default medium.
Must be an empty string (default) or Memory. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir */
  @K8sDslMarker var medium: String?
  /** Total amount of local storage required for this EmptyDir volume. The size limit is also applicable for memory medium.
The maximum usage on memory medium EmptyDir would be the minimum value between the SizeLimit specified here and the sum
of memory limits of all containers in a pod. The default is nil which means that the limit is undefined. More info:
http://kubernetes.io/docs/user-guide/volumes#emptydir */
  val sizeLimit: Quantity_resource_core?
}

@K8sDslMarker
interface Endpoint_v1alpha1_discovery_k8s_io: K8sManifest {
  /** addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice
addressType field. This allows for cases like dual-stack (IPv4 and IPv6) networking. Consumers (e.g. kube-proxy) must
handle different types of addresses in the context of their own capabilities. This must contain at least one address but
no more than 100. */
  @K8sDslMarker var addresses: List<String>?
  /** conditions contains information about the current status of the endpoint. */
  val conditions: EndpointConditions_v1alpha1_discovery_k8s_io?
  /** hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other
(e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A
values in DNS). Must pass DNS Label (RFC 1123) validation. */
  @K8sDslMarker var hostname: String?
  /** targetRef is a reference to a Kubernetes object that represents this endpoint. */
  val targetRef: ObjectReference_v1_core?
  /** topology contains arbitrary topology information associated with the endpoint. These key/value pairs must conform with
the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a
maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: `*`
kubernetes.io/hostname: the value indicates the hostname of the node where the endpoint is located. This should match
the corresponding node label. `*` topology.kubernetes.io/zone: the value indicates the zone where the endpoint is
located. This should match the corresponding node label. `*` topology.kubernetes.io/region: the value indicates the
region where the endpoint is located. This should match the corresponding node label. */
  @K8sDslMarker var topology: Any?
}

@K8sDslMarker
interface EndpointAddress_v1_core: K8sManifest {
  /** The Hostname of this endpoint */
  @K8sDslMarker var hostname: String?
  /** The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast
((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components,
like kube-proxy, are not IPv6 ready. */
  @K8sDslMarker var ip: String?
  /** Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node. */
  @K8sDslMarker var nodeName: String?
  /** Reference to object providing the endpoint. */
  val targetRef: ObjectReference_v1_core?
}

@K8sDslMarker
interface EndpointConditions_v1alpha1_discovery_k8s_io: K8sManifest {
  /** ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the
endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready. */
  @K8sDslMarker var ready: Boolean?
}

@K8sDslMarker
interface EndpointPort_v1_core: K8sManifest {
  /** The name of this port. This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional
only if one port is defined. */
  @K8sDslMarker var name: String?
  /** The port number of the endpoint. */
  @K8sDslMarker var port: Int?
  /** The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP. */
  @K8sDslMarker var protocol: String?
}

@K8sDslMarker
interface EndpointSubset_v1_core: K8sManifest {
  /** IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load
balancers and clients to utilize. */
  val addresses: List<EndpointAddress_v1_core>?
  /** IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished
starting, have recently failed a readiness check, or have recently failed a liveness check. */
  val notReadyAddresses: List<EndpointAddress_v1_core>?
  /** Port numbers available on the related IP addresses. */
  val ports: List<EndpointPort_v1_core>?
}

@K8sDslMarker
interface EnvFromSource_v1_core: K8sManifest {
  /** The ConfigMap to select from */
  val configMapRef: ConfigMapEnvSource_v1_core?
  /** An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER. */
  @K8sDslMarker var prefix: String?
  /** The Secret to select from */
  val secretRef: SecretEnvSource_v1_core?
}

@K8sDslMarker
interface EnvVar_v1_core: K8sManifest {
  /** Name of the environment variable. Must be a C_IDENTIFIER. */
  @K8sDslMarker var name: String?
  /** Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any
service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged.
The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
regardless of whether the variable exists or not. Defaults to "". */
  @K8sDslMarker var value: String?
  /** Source for the environment variable's value. Cannot be used if value is not empty. */
  val valueFrom: EnvVarSource_v1_core?
}

@K8sDslMarker
interface EnvVarSource_v1_core: K8sManifest {
  /** Selects a key of a ConfigMap. */
  val configMapKeyRef: ConfigMapKeySelector_v1_core?
  /** Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations,
spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP. */
  val fieldRef: ObjectFieldSelector_v1_core?
  /** Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory,
limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported. */
  val resourceFieldRef: ResourceFieldSelector_v1_core?
  /** Selects a key of a secret in the pod's namespace */
  val secretKeyRef: SecretKeySelector_v1_core?
}

@K8sDslMarker
interface EphemeralContainer_v1_core: K8sManifest {
  /** Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers
and ephemeral containers. */
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
  val env: List<EnvVar_v1_core>?
  /** List of sources to populate environment variables in the container. The keys defined within a source must be a
C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in
multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a
duplicate key will take precedence. Cannot be updated. */
  val envFrom: List<EnvFromSource_v1_core>?
  /** Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images */
  @K8sDslMarker var image: String?
  /** Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent
otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images */
  @K8sDslMarker var imagePullPolicy: String?
  /** Lifecycle is not allowed for ephemeral containers. */
  val lifecycle: Lifecycle_v1_core?
  /** Probes are not allowed for ephemeral containers. */
  val livenessProbe: Probe_v1_core?
  /** Ports are not allowed for ephemeral containers. */
  val ports: List<ContainerPort_v1_core>?
  /** Probes are not allowed for ephemeral containers. */
  val readinessProbe: Probe_v1_core?
  /** Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the
pod. */
  val resources: ResourceRequirements_v1_core?
  /** SecurityContext is not allowed for ephemeral containers. */
  val securityContext: SecurityContext_v1_core?
  /** Probes are not allowed for ephemeral containers. */
  val startupProbe: Probe_v1_core?
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
run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container is run in whatever
namespaces are shared for the pod. Note that the container runtime must support this feature. */
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
  /** volumeDevices is the list of block devices to be used by the container. This is a beta feature. */
  val volumeDevices: List<VolumeDevice_v1_core>?
  /** Pod volumes to mount into the container's filesystem. Cannot be updated. */
  val volumeMounts: List<VolumeMount_v1_core>?
  /** Container's working directory. If not specified, the container runtime's default will be used, which might be configured
in the container image. Cannot be updated. */
  @K8sDslMarker var workingDir: String?
}

@K8sDslMarker
interface EventSeries_v1_core: K8sManifest {
  /** Number of occurrences in this series up to the last heartbeat time */
  @K8sDslMarker var count: Int?
  /** Time of the last occurrence observed */
  val lastObservedTime: MicroTime_v1_meta?
  /** State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18 */
  @K8sDslMarker var state: String?
}

@K8sDslMarker
interface EventSource_v1_core: K8sManifest {
  /** Component from which the event is generated. */
  @K8sDslMarker var component: String?
  /** Node name on which the event is generated. */
  @K8sDslMarker var host: String?
}

@K8sDslMarker
interface Eviction_v1beta1_policy: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "policy/v1beta1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Eviction"
  /** ObjectMeta describes the pod that is being evicted. */
  val metadata: ObjectMeta_v1_meta
  /** DeleteOptions may be provided */
  val deleteOptions: DeleteOptions_v1_meta?
}

@K8sDslMarker
interface ExecAction_v1_core: K8sManifest {
  /** Command is the command line to execute inside the container, the working directory for the command is root ('/') in the
container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions
('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as
live/healthy and non-zero is unhealthy. */
  @K8sDslMarker var command: List<String>?
}

@K8sDslMarker
interface ExternalDocumentation_v1_apiextensions_k8s_io: K8sManifest {
  /**  */
  @K8sDslMarker var description: String?
  /**  */
  @K8sDslMarker var url: String?
}

@K8sDslMarker
interface ExternalMetricSource_v2beta2_autoscaling: K8sManifest {
  /** metric identifies the target metric by name and selector */
  val metric: MetricIdentifier_v2beta2_autoscaling?
  /** target specifies the target value for the given metric */
  val target: MetricTarget_v2beta2_autoscaling?
}

@K8sDslMarker
interface ExternalMetricStatus_v2beta2_autoscaling: K8sManifest {
  /** current contains the current value for the given metric */
  val current: MetricValueStatus_v2beta2_autoscaling?
  /** metric identifies the target metric by name and selector */
  val metric: MetricIdentifier_v2beta2_autoscaling?
}

@K8sDslMarker
interface FCVolumeSource_v1_core: K8sManifest {
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
Implicitly inferred to be "ext4" if unspecified. */
  @K8sDslMarker var fsType: String?
  /** Optional: FC target lun number */
  @K8sDslMarker var lun: Int?
  /** Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** Optional: FC target worldwide names (WWNs) */
  @K8sDslMarker var targetWWNs: List<String>?
  /** Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but
not both simultaneously. */
  @K8sDslMarker var wwids: List<String>?
}

@K8sDslMarker
interface FSGroupStrategyOptions_v1beta1_policy: K8sManifest {
  /** ranges are the allowed ranges of fs groups. If you would like to force a single fs group then supply a single range with
the same start and end. Required for MustRunAs. */
  val ranges: List<IDRange_v1beta1_policy>?
  /** rule is the strategy that will dictate what FSGroup is used in the SecurityContext. */
  @K8sDslMarker var rule: String?
}

@K8sDslMarker
interface FieldsV1_v1_meta: K8sManifest {
  
}

@K8sDslMarker
interface FlexPersistentVolumeSource_v1_core: K8sManifest {
  /** Driver is the name of the driver to use for this volume. */
  @K8sDslMarker var driver: String?
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
The default filesystem depends on FlexVolume script. */
  @K8sDslMarker var fsType: String?
  /** Optional: Extra command options if any. */
  @K8sDslMarker var options: Map<String, String>?
  /** Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts.
This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are
passed to the plugin scripts. */
  val secretRef: SecretReference_v1_core?
}

@K8sDslMarker
interface FlexVolumeSource_v1_core: K8sManifest {
  /** Driver is the name of the driver to use for this volume. */
  @K8sDslMarker var driver: String?
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
The default filesystem depends on FlexVolume script. */
  @K8sDslMarker var fsType: String?
  /** Optional: Extra command options if any. */
  @K8sDslMarker var options: Map<String, String>?
  /** Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts.
This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are
passed to the plugin scripts. */
  val secretRef: LocalObjectReference_v1_core?
}

@K8sDslMarker
interface FlockerVolumeSource_v1_core: K8sManifest {
  /** Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated */
  @K8sDslMarker var datasetName: String?
  /** UUID of the dataset. This is unique identifier of a Flocker dataset */
  @K8sDslMarker var datasetUUID: String?
}

@K8sDslMarker
interface GCEPersistentDiskVolumeSource_v1_core: K8sManifest {
  /** Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host
operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info:
https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk */
  @K8sDslMarker var fsType: String?
  /** The partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For
volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can
leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk */
  @K8sDslMarker var partition: Int?
  /** Unique name of the PD resource in GCE. Used to identify the disk in GCE. More info:
https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk */
  @K8sDslMarker var pdName: String?
  /** ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info:
https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk */
  @K8sDslMarker var readOnly: Boolean?
}

@K8sDslMarker
interface GitRepoVolumeSource_v1_core: K8sManifest {
  /** Target directory name. Must not contain or start with '..'. If '.' is supplied, the volume directory will be the git
repository. Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name. */
  @K8sDslMarker var directory: String?
  /** Repository URL */
  @K8sDslMarker var repository: String?
  /** Commit hash for the specified revision. */
  @K8sDslMarker var revision: String?
}

@K8sDslMarker
interface GlusterfsPersistentVolumeSource_v1_core: K8sManifest {
  /** EndpointsName is the endpoint name that details Glusterfs topology. More info:
https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod */
  @K8sDslMarker var endpoints: String?
  /** EndpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is empty, the EndpointNamespace
defaults to the same namespace as the bound PVC. More info:
https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod */
  @K8sDslMarker var endpointsNamespace: String?
  /** Path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod */
  @K8sDslMarker var path: String?
  /** ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info:
https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod */
  @K8sDslMarker var readOnly: Boolean?
}

@K8sDslMarker
interface GlusterfsVolumeSource_v1_core: K8sManifest {
  /** EndpointsName is the endpoint name that details Glusterfs topology. More info:
https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod */
  @K8sDslMarker var endpoints: String?
  /** Path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod */
  @K8sDslMarker var path: String?
  /** ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info:
https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod */
  @K8sDslMarker var readOnly: Boolean?
}

@K8sDslMarker
interface GroupVersionForDiscovery_v1_meta: K8sManifest {
  /** groupVersion specifies the API group and version in the form "group/version" */
  @K8sDslMarker var groupVersion: String?
  /** version specifies the version in the form of "version". This is to save the clients the trouble of splitting the
GroupVersion. */
  @K8sDslMarker var version: String?
}

@K8sDslMarker
interface HTTPGetAction_v1_core: K8sManifest {
  /** Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead. */
  @K8sDslMarker var host: String?
  /** Custom headers to set in the request. HTTP allows repeated headers. */
  val httpHeaders: List<HTTPHeader_v1_core>?
  /** Path to access on the HTTP server. */
  @K8sDslMarker var path: String?
  /** Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
IANA_SVC_NAME. */
  var port: de.loosetie.k8s.dsl.types.IntOrString?
  /** Scheme to use for connecting to the host. Defaults to HTTP. */
  @K8sDslMarker var scheme: String?
}

@K8sDslMarker
interface HTTPHeader_v1_core: K8sManifest {
  /** The header field name */
  @K8sDslMarker var name: String?
  /** The header field value */
  @K8sDslMarker var value: String?
}

@K8sDslMarker
interface HTTPIngressPath_v1beta1_networking_k8s_io: K8sManifest {
  /** Backend defines the referenced service endpoint to which the traffic will be forwarded to. */
  val backend: IngressBackend_v1beta1_networking_k8s_io?
  /** Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl
syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the
conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'. If unspecified, the path defaults
to a catch all sending traffic to the backend. */
  @K8sDslMarker var path: String?
}

@K8sDslMarker
interface HTTPIngressRuleValue_v1beta1_networking_k8s_io: K8sManifest {
  /** A collection of paths that map requests to backends. */
  val paths: List<HTTPIngressPath_v1beta1_networking_k8s_io>?
}

@K8sDslMarker
interface Handler_v1_core: K8sManifest {
  /** One and only one of the following should be specified. Exec specifies the action to take. */
  val exec: ExecAction_v1_core?
  /** HTTPGet specifies the http request to perform. */
  val httpGet: HTTPGetAction_v1_core?
  /** TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported */
  val tcpSocket: TCPSocketAction_v1_core?
}

@K8sDslMarker
interface HorizontalPodAutoscalerCondition_v2beta2_autoscaling: K8sManifest {
  /** lastTransitionTime is the last time the condition transitioned from one status to another */
  val lastTransitionTime: Time_v1_meta?
  /** message is a human-readable explanation containing details about the transition */
  @K8sDslMarker var message: String?
  /** reason is the reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** status is the status of the condition (True, False, Unknown) */
  @K8sDslMarker var status: String?
  /** type describes the current condition */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface HostAlias_v1_core: K8sManifest {
  /** Hostnames for the above IP address. */
  @K8sDslMarker var hostnames: List<String>?
  /** IP address of the host file entry. */
  @K8sDslMarker var ip: String?
}

@K8sDslMarker
interface HostPathVolumeSource_v1_core: K8sManifest {
  /** Path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info:
https://kubernetes.io/docs/concepts/storage/volumes#hostpath */
  @K8sDslMarker var path: String?
  /** Type for HostPath Volume Defaults to "" More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface HostPortRange_v1beta1_policy: K8sManifest {
  /** max is the end of the range, inclusive. */
  @K8sDslMarker var max: Int?
  /** min is the start of the range, inclusive. */
  @K8sDslMarker var min: Int?
}

@K8sDslMarker
interface IDRange_v1beta1_policy: K8sManifest {
  /** max is the end of the range, inclusive. */
  @K8sDslMarker var max: Int?
  /** min is the start of the range, inclusive. */
  @K8sDslMarker var min: Int?
}

@K8sDslMarker
interface IPBlock_v1_networking_k8s_io: K8sManifest {
  /** CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24" */
  @K8sDslMarker var cidr: String?
  /** Except is a slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.1/24" Except
values will be rejected if they are outside the CIDR range */
  @K8sDslMarker var except: List<String>?
}

@K8sDslMarker
interface ISCSIPersistentVolumeSource_v1_core: K8sManifest {
  /** whether support iSCSI Discovery CHAP authentication */
  @K8sDslMarker var chapAuthDiscovery: Boolean?
  /** whether support iSCSI Session CHAP authentication */
  @K8sDslMarker var chapAuthSession: Boolean?
  /** Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host
operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info:
https://kubernetes.io/docs/concepts/storage/volumes#iscsi */
  @K8sDslMarker var fsType: String?
  /** Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface
<target portal>:<volume name> will be created for the connection. */
  @K8sDslMarker var initiatorName: String?
  /** Target iSCSI Qualified Name. */
  @K8sDslMarker var iqn: String?
  /** iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp). */
  @K8sDslMarker var iscsiInterface: String?
  /** iSCSI Target Lun number. */
  @K8sDslMarker var lun: Int?
  /** iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP
ports 860 and 3260). */
  @K8sDslMarker var portals: List<String>?
  /** ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. */
  @K8sDslMarker var readOnly: Boolean?
  /** CHAP Secret for iSCSI target and initiator authentication */
  val secretRef: SecretReference_v1_core?
  /** iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports
860 and 3260). */
  @K8sDslMarker var targetPortal: String?
}

@K8sDslMarker
interface ISCSIVolumeSource_v1_core: K8sManifest {
  /** whether support iSCSI Discovery CHAP authentication */
  @K8sDslMarker var chapAuthDiscovery: Boolean?
  /** whether support iSCSI Session CHAP authentication */
  @K8sDslMarker var chapAuthSession: Boolean?
  /** Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host
operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info:
https://kubernetes.io/docs/concepts/storage/volumes#iscsi */
  @K8sDslMarker var fsType: String?
  /** Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface
<target portal>:<volume name> will be created for the connection. */
  @K8sDslMarker var initiatorName: String?
  /** Target iSCSI Qualified Name. */
  @K8sDslMarker var iqn: String?
  /** iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp). */
  @K8sDslMarker var iscsiInterface: String?
  /** iSCSI Target Lun number. */
  @K8sDslMarker var lun: Int?
  /** iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP
ports 860 and 3260). */
  @K8sDslMarker var portals: List<String>?
  /** ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. */
  @K8sDslMarker var readOnly: Boolean?
  /** CHAP Secret for iSCSI target and initiator authentication */
  val secretRef: LocalObjectReference_v1_core?
  /** iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports
860 and 3260). */
  @K8sDslMarker var targetPortal: String?
}

@K8sDslMarker
interface IngressBackend_v1beta1_networking_k8s_io: K8sManifest {
  /** Specifies the name of the referenced service. */
  @K8sDslMarker var serviceName: String?
  /** Specifies the port of the referenced service. */
  var servicePort: de.loosetie.k8s.dsl.types.IntOrString?
}

@K8sDslMarker
interface IngressRule_v1beta1_networking_k8s_io: K8sManifest {
  /** Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from
the "host" part of the URI as defined in the RFC: 1. IPs are not allowed. Currently an IngressRuleValue can only apply
to the IP in the Spec of the parent Ingress. 2. The `:` delimiter is not respected because ports are not allowed.
Currently the port of an Ingress is implicitly :80 for http and :443 for https. Both these may change in the future.
Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress
routes all traffic based on the specified IngressRuleValue. */
  @K8sDslMarker var host: String?
  /**  */
  val http: HTTPIngressRuleValue_v1beta1_networking_k8s_io?
}

@K8sDslMarker
interface IngressTLS_v1beta1_networking_k8s_io: K8sManifest {
  /** Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the
tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left
unspecified. */
  @K8sDslMarker var hosts: List<String>?
  /** SecretName is the name of the secret used to terminate SSL traffic on 443. Field is left optional to allow SSL routing
based on SNI hostname alone. If the SNI host in a listener conflicts with the "Host" header field used by an
IngressRule, the SNI host is used for termination and value of the Host header is used for routing. */
  @K8sDslMarker var secretName: String?
}

@K8sDslMarker
interface JSON_v1_apiextensions_k8s_io: K8sManifest {
  
}

@K8sDslMarker
interface JSONSchemaProps_v1_apiextensions_k8s_io: K8sManifest {
  /**  */
  @K8sDslMarker var `$ref`: String?
  /**  */
  @K8sDslMarker var `$schema`: String?
  /**  */
  val additionalItems: JSONSchemaPropsOrBool_v1_apiextensions_k8s_io?
  /**  */
  val additionalProperties: JSONSchemaPropsOrBool_v1_apiextensions_k8s_io?
  /**  */
  val allOf: List<JSONSchemaProps_v1_apiextensions_k8s_io>?
  /**  */
  val anyOf: List<JSONSchemaProps_v1_apiextensions_k8s_io>?
  /** default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting
feature gate. Defaulting requires spec.preserveUnknownFields to be false. */
  val default: JSON_v1_apiextensions_k8s_io?
  /**  */
  @K8sDslMarker var definitions: Any?
  /**  */
  @K8sDslMarker var dependencies: Any?
  /**  */
  @K8sDslMarker var description: String?
  /**  */
  val enum: List<JSON_v1_apiextensions_k8s_io>?
  /**  */
  val example: JSON_v1_apiextensions_k8s_io?
  /**  */
  @K8sDslMarker var exclusiveMaximum: Boolean?
  /**  */
  @K8sDslMarker var exclusiveMinimum: Boolean?
  /**  */
  val externalDocs: ExternalDocumentation_v1_apiextensions_k8s_io?
  /**  */
  @K8sDslMarker var format: String?
  /**  */
  @K8sDslMarker var id: String?
  /**  */
  val items: JSONSchemaPropsOrArray_v1_apiextensions_k8s_io?
  /**  */
  @K8sDslMarker var maxItems: Int?
  /**  */
  @K8sDslMarker var maxLength: Int?
  /**  */
  @K8sDslMarker var maxProperties: Int?
  /**  */
  @K8sDslMarker var maximum: Number?
  /**  */
  @K8sDslMarker var minItems: Int?
  /**  */
  @K8sDslMarker var minLength: Int?
  /**  */
  @K8sDslMarker var minProperties: Int?
  /**  */
  @K8sDslMarker var minimum: Number?
  /**  */
  @K8sDslMarker var multipleOf: Number?
  /**  */
  val not: JSONSchemaProps_v1_apiextensions_k8s_io?
  /**  */
  @K8sDslMarker var nullable: Boolean?
  /**  */
  val oneOf: List<JSONSchemaProps_v1_apiextensions_k8s_io>?
  /**  */
  @K8sDslMarker var pattern: String?
  /**  */
  @K8sDslMarker var patternProperties: Any?
  /**  */
  @K8sDslMarker var properties: Any?
  /**  */
  @K8sDslMarker var required: List<String>?
  /**  */
  @K8sDslMarker var title: String?
  /**  */
  @K8sDslMarker var type: String?
  /**  */
  @K8sDslMarker var uniqueItems: Boolean?
  /** x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and
ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and
metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to
be if the object is fully specified (up to kind, apiVersion, metadata). */
  @K8sDslMarker var `x-kubernetes-embedded-resource`: Boolean?
  /** x-kubernetes-int-or-string specifies that this value is either an integer or a string. If this is true, an empty type is
allowed and type as child of anyOf is permitted if following one of the following patterns: 1) anyOf: - type: integer -
type: string 2) allOf: - anyOf: - type: integer - type: string - ... zero or more */
  @K8sDslMarker var `x-kubernetes-int-or-string`: Boolean?
  /** x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by specifying the keys used as the
index of the map. This tag MUST only be used on lists that have the "x-kubernetes-list-type" extension set to "map".
Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is
supported). */
  @K8sDslMarker var `x-kubernetes-list-map-keys`: List<String>?
  /** x-kubernetes-list-type annotates an array to further describe its topology. This extension must only be used on lists
and may have 3 possible values: 1) `atomic`: the list is treated as a single entity, like a scalar. Atomic lists will be
entirely replaced when updated. This extension may be used on any type of list (struct, scalar, ...). 2) `set`: Sets are
lists that must not have multiple items with the same value. Each value must be a scalar (or another atomic type). 3)
`map`: These lists are like maps in that their elements have a non-index key used to identify them. Order is preserved
upon merge. The map tag must only be used on a list with elements of type object. Defaults to atomic for arrays. */
  @K8sDslMarker var `x-kubernetes-list-type`: String?
  /** x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in
the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested
properties or additionalProperties are specified in the schema. This can either be true or undefined. False is
forbidden. */
  @K8sDslMarker var `x-kubernetes-preserve-unknown-fields`: Boolean?
}

@K8sDslMarker
interface JSONSchemaPropsOrArray_v1_apiextensions_k8s_io: K8sManifest {
  
}

@K8sDslMarker
interface JSONSchemaPropsOrBool_v1_apiextensions_k8s_io: K8sManifest {
  
}

@K8sDslMarker
interface JobCondition_v1_batch: K8sManifest {
  /** Last time the condition was checked. */
  val lastProbeTime: Time_v1_meta?
  /** Last time the condition transit from one status to another. */
  val lastTransitionTime: Time_v1_meta?
  /** Human readable message indicating details about last transition. */
  @K8sDslMarker var message: String?
  /** (brief) reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** Status of the condition, one of True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type of job condition, Complete or Failed. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface JobTemplateSpec_v1beta1_batch: K8sManifest, HasMetadata {
  /** Standard object's metadata of the jobs created from this template. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta?
  /** Specification of the desired behavior of the job. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Jobspec_v1_batch?
}

@K8sDslMarker
interface KeyToPath_v1_core: K8sManifest {
  /** The key to project. */
  @K8sDslMarker var key: String?
  /** Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode
will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can
be other mode bits set. */
  @K8sDslMarker var mode: Int?
  /** The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May
not start with the string '..'. */
  @K8sDslMarker var path: String?
}

@K8sDslMarker
interface LabelSelector_v1_meta: K8sManifest {
  /** matchExpressions is a list of label selector requirements. The requirements are ANDed. */
  val matchExpressions: List<LabelSelectorRequirement_v1_meta>?
  /** matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of
matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The
requirements are ANDed. */
  @K8sDslMarker var matchLabels: Map<String, String>?
}

@K8sDslMarker
interface LabelSelectorRequirement_v1_meta: K8sManifest {
  /** key is the label key that the selector applies to. */
  @K8sDslMarker var key: String?
  /** operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist. */
  @K8sDslMarker var operator: String?
  /** values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator
is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch. */
  @K8sDslMarker var values: List<String>?
}

@K8sDslMarker
interface Lifecycle_v1_core: K8sManifest {
  /** PostStart is called immediately after a container is created. If the handler fails, the container is terminated and
restarted according to its restart policy. Other management of the container blocks until the hook completes. More info:
https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks */
  val postStart: Handler_v1_core?
  /** PreStop is called immediately before a container is terminated due to an API request or management event such as
liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes
or exits. The reason for termination is passed to the handler. The Pod's termination grace period countdown begins
before the PreStop hooked is executed. Regardless of the outcome of the handler, the container will eventually terminate
within the Pod's termination grace period. Other management of the container blocks until the hook completes or until
the termination grace period is reached. More info:
https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks */
  val preStop: Handler_v1_core?
}

@K8sDslMarker
interface LimitRangeItem_v1_core: K8sManifest {
  /** Default resource requirement limit value by resource name if resource limit is omitted. */
  var default: de.loosetie.k8s.dsl.types.CpuMem?
  /** DefaultRequest is the default resource requirement request value by resource name if resource request is omitted. */
  var defaultRequest: de.loosetie.k8s.dsl.types.CpuMem?
  /** Max usage constraints on this kind by resource name. */
  var max: de.loosetie.k8s.dsl.types.CpuMem?
  /** MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit
divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource. */
  var maxLimitRequestRatio: de.loosetie.k8s.dsl.types.CpuMem?
  /** Min usage constraints on this kind by resource name. */
  var min: de.loosetie.k8s.dsl.types.CpuMem?
  /** Type of resource that this limit applies to. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface ListMeta_v1_meta: K8sManifest {
  /** continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data
available. The value is opaque and may be used to issue another request to the endpoint that served this list to
retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration
has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value
will be identical to the value in the first response, unless you have received this token from an error message. */
  @K8sDslMarker var `continue`: String?
  /** remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the
list request contained label or field selectors, then the number of remaining items is unknown and the field will be
left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this
is the last chunk), then there are no more remaining items and this field will be left unset and omitted during
serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is
`*`estimating`*` the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact. */
  @K8sDslMarker var remainingItemCount: Int?
  /** String that identifies the server's internal version of this object that can be used by clients to determine when
objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by
the system. Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency */
  @K8sDslMarker var resourceVersion: String?
  /** selfLink is a URL representing this object. Populated by the system. Read-only. DEPRECATED Kubernetes will stop
propagating this field in 1.20 release and the field is planned to be removed in 1.21 release. */
  @K8sDslMarker var selfLink: String?
}

@K8sDslMarker
interface LoadBalancerIngress_v1_core: K8sManifest {
  /** Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers) */
  @K8sDslMarker var hostname: String?
  /** IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers) */
  @K8sDslMarker var ip: String?
}

@K8sDslMarker
interface LoadBalancerStatus_v1_core: K8sManifest {
  /** Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to
these ingress points. */
  val ingress: List<LoadBalancerIngress_v1_core>?
}

@K8sDslMarker
interface LocalObjectReference_v1_core: K8sManifest {
  /** Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
}

@K8sDslMarker
interface LocalVolumeSource_v1_core: K8sManifest {
  /** Filesystem type to mount. It applies only when the Path is a block device. Must be a filesystem type supported by the
host operating system. Ex. "ext4", "xfs", "ntfs". The default value is to auto-select a fileystem if unspecified. */
  @K8sDslMarker var fsType: String?
  /** The full path to the volume on the node. It can be either a directory or block device (disk, partition, ...). */
  @K8sDslMarker var path: String?
}

@K8sDslMarker
interface ManagedFieldsEntry_v1_meta: K8sManifest {
  /** APIVersion defines the version of this resource that this field set applies to. The format is "group/version" just like
the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically
converted. */
  @K8sDslMarker var apiVersion: String?
  /** FieldsType is the discriminator for the different fields format and version. There is currently only one possible value:
"FieldsV1" */
  @K8sDslMarker var fieldsType: String?
  /** FieldsV1 holds the first JSON version format as described in the "FieldsV1" type. */
  val fieldsV1: FieldsV1_v1_meta?
  /** Manager is an identifier of the workflow managing these fields. */
  @K8sDslMarker var manager: String?
  /** Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this
field are 'Apply' and 'Update'. */
  @K8sDslMarker var operation: String?
  /** Time is timestamp of when these fields were set. It should always be empty if Operation is 'Apply' */
  val time: Time_v1_meta?
}

@K8sDslMarker
interface MetricIdentifier_v2beta2_autoscaling: K8sManifest {
  /** name is the name of the given metric */
  @K8sDslMarker var name: String?
  /** selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed
as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will
be used to gather metrics. */
  val selector: LabelSelector_v1_meta?
}

@K8sDslMarker
interface MetricSpec_v2beta2_autoscaling: K8sManifest {
  /** external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on
information coming from components running outside of cluster (for example length of queue in cloud messaging service,
or QPS from loadbalancer running outside of cluster). */
  val external: ExternalMetricSource_v2beta2_autoscaling?
  /** object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object). */
  val `object`: ObjectMetricSource_v2beta2_autoscaling?
  /** pods refers to a metric describing each pod in the current scale target (for example,
transactions-processed-per-second). The values will be averaged together before being compared to the target value. */
  val pods: PodsMetricSource_v2beta2_autoscaling?
  /** resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing
each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special
scaling options on top of those available to normal per-pod metrics using the "pods" source. */
  val resource: ResourceMetricSource_v2beta2_autoscaling?
  /** type is the type of metric source. It should be one of "Object", "Pods" or "Resource", each mapping to a matching field
in the object. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface MetricStatus_v2beta2_autoscaling: K8sManifest {
  /** external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on
information coming from components running outside of cluster (for example length of queue in cloud messaging service,
or QPS from loadbalancer running outside of cluster). */
  val external: ExternalMetricStatus_v2beta2_autoscaling?
  /** object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object). */
  val `object`: ObjectMetricStatus_v2beta2_autoscaling?
  /** pods refers to a metric describing each pod in the current scale target (for example,
transactions-processed-per-second). The values will be averaged together before being compared to the target value. */
  val pods: PodsMetricStatus_v2beta2_autoscaling?
  /** resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing
each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special
scaling options on top of those available to normal per-pod metrics using the "pods" source. */
  val resource: ResourceMetricStatus_v2beta2_autoscaling?
  /** type is the type of metric source. It will be one of "Object", "Pods" or "Resource", each corresponds to a matching
field in the object. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface MetricTarget_v2beta2_autoscaling: K8sManifest {
  /** averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a
percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type */
  @K8sDslMarker var averageUtilization: Int?
  /** averageValue is the target value of the average of the metric across all relevant pods (as a quantity) */
  val averageValue: Quantity_resource_core?
  /** type represents whether the metric type is Utilization, Value, or AverageValue */
  @K8sDslMarker var type: String?
  /** value is the target value of the metric (as a quantity). */
  val value: Quantity_resource_core?
}

@K8sDslMarker
interface MetricValueStatus_v2beta2_autoscaling: K8sManifest {
  /** currentAverageUtilization is the current value of the average of the resource metric across all relevant pods,
represented as a percentage of the requested value of the resource for the pods. */
  @K8sDslMarker var averageUtilization: Int?
  /** averageValue is the current value of the average of the metric across all relevant pods (as a quantity) */
  val averageValue: Quantity_resource_core?
  /** value is the current value of the metric (as a quantity). */
  val value: Quantity_resource_core?
}

@K8sDslMarker
interface MicroTime_v1_meta: K8sManifest {
  
}

@K8sDslMarker
interface MutatingWebhook_v1_admissionregistration_k8s_io: K8sManifest {
  /** The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy"
is the name of the webhook, and kubernetes.io is the name of the organization. Required. */
  @K8sDslMarker var name: String?
  /** AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will
try to use first version in the list which it supports. If none of the versions specified in this list supported by API
server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does
not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. */
  @K8sDslMarker var admissionReviewVersions: List<String>?
  /** ClientConfig defines how to communicate with the hook. Required */
  val clientConfig: WebhookClientConfig_v1_admissionregistration_k8s_io?
  /** FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or
Fail. Defaults to Fail. */
  @K8sDslMarker var failurePolicy: String?
  /** matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
- Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via
apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included `apiGroups:["apps"], apiVersions:["v1"],
resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook. -
Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example,
if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included
`apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1
would be converted to apps/v1 and sent to the webhook. Defaults to "Equivalent" */
  @K8sDslMarker var matchPolicy: String?
  /** NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches
the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is
another cluster scoped resource, it never skips the webhook. For example, to run the webhook on any objects whose
namespace is not associated with "runlevel" of "0" or "1"; you will set the selector as follows: "namespaceSelector": {
"matchExpressions": [ { "key": "runlevel", "operator": "NotIn", "values": [ "0", "1" ] } ] } If instead you want to only
run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set
the selector as follows: "namespaceSelector": { "matchExpressions": [ { "key": "environment", "operator": "In",
"values": [ "prod", "staging" ] } ] } See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for
more examples of label selectors. Default to the empty LabelSelector, which matches everything. */
  val namespaceSelector: LabelSelector_v1_meta?
  /** ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is
evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if
either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete)
or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match.
Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the
labels. Default to the empty LabelSelector, which matches everything. */
  val objectSelector: LabelSelector_v1_meta?
  /** reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission
evaluation. Allowed values are "Never" and "IfNeeded". Never: the webhook will not be called more than once in a single
admission evaluation. IfNeeded: the webhook will be called at least one additional time as part of the admission
evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks
that specify this option `*`must`*` be idempotent, able to process objects they previously admitted. Note: `*` the
number of additional invocations is not guaranteed to be exactly one. `*` if additional invocations result in further
modifications to the object, webhooks are not guaranteed to be invoked again. `*` webhooks that use this option may be
reordered to minimize the number of additional invocations. `*` to validate an object after all mutations are guaranteed
complete, use a validating admission webhook instead. Defaults to "Never". */
  @K8sDslMarker var reinvocationPolicy: String?
  /** Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an
operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and
MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely
disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests
for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects. */
  val rules: List<RuleWithOperations_v1_admissionregistration_k8s_io>?
  /** SideEffects states whether this webhook has side effects. Acceptable values are: None, NoneOnDryRun (webhooks created
via v1beta1 may also specify Some or Unknown). Webhooks with side effects MUST implement a reconciliation system, since
a request may be rejected by a future step in the admission change and the side effects therefore need to be undone.
Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. */
  @K8sDslMarker var sideEffects: String?
  /** TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the
API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 10
seconds. */
  @K8sDslMarker var timeoutSeconds: Int?
}

@K8sDslMarker
interface NFSVolumeSource_v1_core: K8sManifest {
  /** Path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs */
  @K8sDslMarker var path: String?
  /** ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info:
https://kubernetes.io/docs/concepts/storage/volumes#nfs */
  @K8sDslMarker var readOnly: Boolean?
  /** Server is the hostname or IP address of the NFS server. More info:
https://kubernetes.io/docs/concepts/storage/volumes#nfs */
  @K8sDslMarker var server: String?
}

@K8sDslMarker
interface NamespaceCondition_v1_core: K8sManifest {
  /**  */
  val lastTransitionTime: Time_v1_meta?
  /**  */
  @K8sDslMarker var message: String?
  /**  */
  @K8sDslMarker var reason: String?
  /** Status of the condition, one of True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type of namespace controller condition. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface NetworkPolicyEgressRule_v1_networking_k8s_io: K8sManifest {
  /** List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is
empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at
least one item, then this rule allows traffic only if the traffic matches at least one port in the list. */
  val ports: List<NetworkPolicyPort_v1_networking_k8s_io>?
  /** List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a
logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by
destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic
matches at least one item in the to list. */
  val to: List<NetworkPolicyPeer_v1_networking_k8s_io>?
}

@K8sDslMarker
interface NetworkPolicyIngressRule_v1_networking_k8s_io: K8sManifest {
  /** List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a
logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by
source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches
at least one item in the from list. */
  val from: List<NetworkPolicyPeer_v1_networking_k8s_io>?
  /** List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined
using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If
this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least
one port in the list. */
  val ports: List<NetworkPolicyPort_v1_networking_k8s_io>?
}

@K8sDslMarker
interface NetworkPolicyPeer_v1_networking_k8s_io: K8sManifest {
  /** IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be. */
  val ipBlock: IPBlock_v1_networking_k8s_io?
  /** Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but
empty, it selects all namespaces. If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods
matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces
selected by NamespaceSelector. */
  val namespaceSelector: LabelSelector_v1_meta?
  /** This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty,
it selects all pods. If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching
PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the
policy's own Namespace. */
  val podSelector: LabelSelector_v1_meta?
}

@K8sDslMarker
interface NetworkPolicyPort_v1_networking_k8s_io: K8sManifest {
  /** The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided,
this matches all port names and numbers. */
  var port: de.loosetie.k8s.dsl.types.IntOrString?
  /** The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP. */
  @K8sDslMarker var protocol: String?
}

@K8sDslMarker
interface NodeAddress_v1_core: K8sManifest {
  /** The node address. */
  @K8sDslMarker var address: String?
  /** Node address type, one of Hostname, ExternalIP or InternalIP. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface NodeAffinity_v1_core: K8sManifest {
  /** The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but
it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the
greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request,
requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and
adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are
the most preferred. */
  val preferredDuringSchedulingIgnoredDuringExecution: List<PreferredSchedulingTerm_v1_core>?
  /** If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto
the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g.
due to an update), the system may or may not try to eventually evict the pod from its node. */
  val requiredDuringSchedulingIgnoredDuringExecution: NodeSelector_v1_core?
}

@K8sDslMarker
interface NodeCondition_v1_core: K8sManifest {
  /** Last time we got an update on a given condition. */
  val lastHeartbeatTime: Time_v1_meta?
  /** Last time the condition transit from one status to another. */
  val lastTransitionTime: Time_v1_meta?
  /** Human readable message indicating details about last transition. */
  @K8sDslMarker var message: String?
  /** (brief) reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** Status of the condition, one of True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type of node condition. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface NodeConfigSource_v1_core: K8sManifest {
  /** ConfigMap is a reference to a Node's ConfigMap */
  val configMap: ConfigMapNodeConfigSource_v1_core?
}

@K8sDslMarker
interface NodeConfigStatus_v1_core: K8sManifest {
  /** Active reports the checkpointed config the node is actively using. Active will represent either the current version of
the Assigned config, or the current LastKnownGood config, depending on whether attempting to use the Assigned config
results in an error. */
  val active: NodeConfigSource_v1_core?
  /** Assigned reports the checkpointed config the node will try to use. When Node.Spec.ConfigSource is updated, the node
checkpoints the associated config payload to local disk, along with a record indicating intended config. The node refers
to this record to choose its config checkpoint, and reports this record in Assigned. Assigned only updates in the status
after the record has been checkpointed to disk. When the Kubelet is restarted, it tries to make the Assigned config the
Active config by loading and validating the checkpointed payload identified by Assigned. */
  val assigned: NodeConfigSource_v1_core?
  /** Error describes any problems reconciling the Spec.ConfigSource to the Active config. Errors may occur, for example,
attempting to checkpoint Spec.ConfigSource to the local Assigned record, attempting to checkpoint the payload associated
with Spec.ConfigSource, attempting to load or validate the Assigned config, etc. Errors may occur at different points
while syncing config. Earlier errors (e.g. download or checkpointing errors) will not result in a rollback to
LastKnownGood, and may resolve across Kubelet retries. Later errors (e.g. loading or validating a checkpointed config)
will result in a rollback to LastKnownGood. In the latter case, it is usually possible to resolve the error by fixing
the config assigned in Spec.ConfigSource. You can find additional information for debugging by searching the error
message in the Kubelet log. Error is a human-readable description of the error state; machines can check whether or not
Error is empty, but should not rely on the stability of the Error text across Kubelet versions. */
  @K8sDslMarker var error: String?
  /** LastKnownGood reports the checkpointed config the node will fall back to when it encounters an error attempting to use
the Assigned config. The Assigned config becomes the LastKnownGood config when the node determines that the Assigned
config is stable and correct. This is currently implemented as a 10-minute soak period starting when the local record of
Assigned config is updated. If the Assigned config is Active at the end of this period, it becomes the LastKnownGood.
Note that if Spec.ConfigSource is reset to nil (use local defaults), the LastKnownGood is also immediately reset to nil,
because the local default config is always assumed good. You should not make assumptions about the node's method of
determining config stability and correctness, as this may change or become configurable in the future. */
  val lastKnownGood: NodeConfigSource_v1_core?
}

@K8sDslMarker
interface NodeDaemonEndpoints_v1_core: K8sManifest {
  /** Endpoint on which Kubelet is listening. */
  val kubeletEndpoint: DaemonEndpoint_v1_core?
}

@K8sDslMarker
interface NodeSelector_v1_core: K8sManifest {
  /** Required. A list of node selector terms. The terms are ORed. */
  val nodeSelectorTerms: List<NodeSelectorTerm_v1_core>?
}

@K8sDslMarker
interface NodeSelectorRequirement_v1_core: K8sManifest {
  /** The label key that the selector applies to. */
  @K8sDslMarker var key: String?
  /** Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt. */
  @K8sDslMarker var operator: String?
  /** An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists
or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single
element, which will be interpreted as an integer. This array is replaced during a strategic merge patch. */
  @K8sDslMarker var values: List<String>?
}

@K8sDslMarker
interface NodeSelectorTerm_v1_core: K8sManifest {
  /** A list of node selector requirements by node's labels. */
  val matchExpressions: List<NodeSelectorRequirement_v1_core>?
  /** A list of node selector requirements by node's fields. */
  val matchFields: List<NodeSelectorRequirement_v1_core>?
}

@K8sDslMarker
interface NodeSystemInfo_v1_core: K8sManifest {
  /** The Architecture reported by the node */
  @K8sDslMarker var architecture: String?
  /** Boot ID reported by the node. */
  @K8sDslMarker var bootID: String?
  /** ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0). */
  @K8sDslMarker var containerRuntimeVersion: String?
  /** Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64). */
  @K8sDslMarker var kernelVersion: String?
  /** KubeProxy Version reported by the node. */
  @K8sDslMarker var kubeProxyVersion: String?
  /** Kubelet Version reported by the node. */
  @K8sDslMarker var kubeletVersion: String?
  /** MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more
from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html */
  @K8sDslMarker var machineID: String?
  /** The Operating System reported by the node */
  @K8sDslMarker var operatingSystem: String?
  /** OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)). */
  @K8sDslMarker var osImage: String?
  /** SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red
Hat hosts
https://access.redhat.com/documentation/en-US/Red_Hat_Subscription_Management/1/html/RHSM/getting-system-uuid.html */
  @K8sDslMarker var systemUUID: String?
}

@K8sDslMarker
interface NonResourceAttributes_v1_authorization_k8s_io: K8sManifest {
  /** Path is the URL path of the request */
  @K8sDslMarker var path: String?
  /** Verb is the standard HTTP verb */
  @K8sDslMarker var verb: String?
}

@K8sDslMarker
interface NonResourceRule_v1_authorization_k8s_io: K8sManifest {
  /** NonResourceURLs is a set of partial urls that a user should have access to. `*`s are allowed, but only as the full,
final step in the path. "`*`" means all. */
  @K8sDslMarker var nonResourceURLs: List<String>?
  /** Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options. "`*`" means
all. */
  @K8sDslMarker var verbs: List<String>?
}

@K8sDslMarker
interface ObjectFieldSelector_v1_core: K8sManifest {
  /** Version of the schema the FieldPath is written in terms of, defaults to "v1". */
  @K8sDslMarker var apiVersion: String?
  /** Path of the field to select in the specified API version. */
  @K8sDslMarker var fieldPath: String?
}

@K8sDslMarker
interface ObjectMeta_v1_meta: K8sManifest {
  /** Namespace defines the space within each name must be unique. An empty namespace is equivalent to the "default"
namespace, but "default" is the canonical representation. Not all objects are required to be scoped to a namespace - the
value of this field for those objects will be empty. Must be a DNS_LABEL. Cannot be updated. More info:
http://kubernetes.io/docs/user-guide/namespaces */
  @K8sDslMarker var namespace: String?
  /** Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client
to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and
configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names */
  @K8sDslMarker var name: String?
  /** Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match
selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels */
  @K8sDslMarker var labels: Map<String, String>?
  /** Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and
retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info:
http://kubernetes.io/docs/user-guide/annotations */
  @K8sDslMarker var annotations: Map<String, String>?
  /** The name of the cluster which the object belongs to. This is used to distinguish resources with same name and namespace
in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or
update request. */
  @K8sDslMarker var clusterName: String?
  /** CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be
set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339
form and is in UTC. Populated by the system. Read-only. Null for lists. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val creationTimestamp: Time_v1_meta?
  /** Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set
when deletionTimestamp is also set. May only be shortened. Read-only. */
  @K8sDslMarker var deletionGracePeriodSeconds: Int?
  /** DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is set by the server when
a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be
deleted (no longer visible from resource lists, and not reachable by name) after the time in this field, once the
finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once the deletionTimestamp
is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may
be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will
react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will
send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the
presence of network partitions, this object may still exist after this timestamp, until an administrator or automated
process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been
requested. Populated by the system when a graceful deletion is requested. Read-only. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val deletionTimestamp: Time_v1_meta?
  /** Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component
that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can
only be removed. */
  @K8sDslMarker var finalizers: List<String>?
  /** GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been
provided. If this field is used, the name returned to the client will be different than the name passed. This value will
also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be
truncated by the length of the suffix required to make the value unique on the server. If this field is specified and
the generated name exists, the server will NOT return a 409 - instead, it will either return 201 Created or 500 with
Reason ServerTimeout indicating a unique name could not be found in the time allotted, and the client should retry
(optionally after the time indicated in the Retry-After header). Applied only if Name is not specified. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#idempotency */
  @K8sDslMarker var generateName: String?
  /** A sequence number representing a specific generation of the desired state. Populated by the system. Read-only. */
  @K8sDslMarker var generation: Int?
  /** ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow. This is mostly for
internal housekeeping, and users typically shouldn't need to set or understand this field. A workflow can be the user's
name, a controller's name, or the name of a specific apply path like "ci-cd". The set of fields is always in the version
that the workflow used when modifying the object. */
  val managedFields: List<ManagedFieldsEntry_v1_meta>?
  /** List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage
collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the
controller field set to true. There cannot be more than one managing controller. */
  val ownerReferences: List<OwnerReference_v1_meta>?
  /** An opaque value that represents the internal version of this object that can be used by clients to determine when
objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or
set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be
valid for a particular resource or set of resources. Populated by the system. Read-only. Value must be treated as opaque
by clients and . More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency */
  @K8sDslMarker var resourceVersion: String?
  /** SelfLink is a URL representing this object. Populated by the system. Read-only. DEPRECATED Kubernetes will stop
propagating this field in 1.20 release and the field is planned to be removed in 1.21 release. */
  @K8sDslMarker var selfLink: String?
  /** UID is the unique in time and space value for this object. It is typically generated by the server on successful
creation of a resource and is not allowed to change on PUT operations. Populated by the system. Read-only. More info:
http://kubernetes.io/docs/user-guide/identifiers#uids */
  @K8sDslMarker var uid: String?
}

@K8sDslMarker
interface ObjectMetricSource_v2beta2_autoscaling: K8sManifest {
  /**  */
  val describedObject: CrossVersionObjectReference_v2beta2_autoscaling?
  /** metric identifies the target metric by name and selector */
  val metric: MetricIdentifier_v2beta2_autoscaling?
  /** target specifies the target value for the given metric */
  val target: MetricTarget_v2beta2_autoscaling?
}

@K8sDslMarker
interface ObjectMetricStatus_v2beta2_autoscaling: K8sManifest {
  /** current contains the current value for the given metric */
  val current: MetricValueStatus_v2beta2_autoscaling?
  /**  */
  val describedObject: CrossVersionObjectReference_v2beta2_autoscaling?
  /** metric identifies the target metric by name and selector */
  val metric: MetricIdentifier_v2beta2_autoscaling?
}

@K8sDslMarker
interface ObjectReference_v1_core: K8sTopLevel {
  /** API version of the referent. */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind of the referent. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ObjectReference"
  /** Namespace of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/ */
  @K8sDslMarker var namespace: String?
  /** Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** If referring to a piece of an object instead of an entire object, this string should contain a valid JSON/Go field
access statement, such as desiredState.manifest.containers[2]. For example, if the object reference is to a container
within a pod, this would take on a value like: "spec.containers{name}" (where "name" refers to the name of the container
that triggered the event) or if no container name is specified "spec.containers[2]" (container with index 2 in this
pod). This syntax is chosen only to have some well-defined way of referencing a part of an object. */
  @K8sDslMarker var fieldPath: String?
  /** Specific resourceVersion to which this reference is made, if any. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency */
  @K8sDslMarker var resourceVersion: String?
  /** UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids */
  @K8sDslMarker var uid: String?
}

@K8sDslMarker
interface Overhead_v1beta1_node_k8s_io: K8sManifest {
  /** PodFixed represents the fixed resource overhead associated with running a pod. */
  var podFixed: de.loosetie.k8s.dsl.types.LimitsAndRequests?
}

@K8sDslMarker
interface OwnerReference_v1_meta: K8sTopLevel {
  /** API version of the referent. */
  override val apiVersion: String
    get() = "meta/v1"
  /** Kind of the referent. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "OwnerReference"
  /** Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names */
  @K8sDslMarker var name: String?
  /** If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be deleted from the key-value
store until this reference is removed. Defaults to false. To set this field, a user needs "delete" permission of the
owner, otherwise 422 (Unprocessable Entity) will be returned. */
  @K8sDslMarker var blockOwnerDeletion: Boolean?
  /** If true, this reference points to the managing controller. */
  @K8sDslMarker var controller: Boolean?
  /** UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids */
  @K8sDslMarker var uid: String?
}

@K8sDslMarker
interface Patch_v1_meta: K8sManifest {
  
}

@K8sDslMarker
interface PersistentVolumeClaimCondition_v1_core: K8sManifest {
  /** Last time we probed the condition. */
  val lastProbeTime: Time_v1_meta?
  /** Last time the condition transitioned from one status to another. */
  val lastTransitionTime: Time_v1_meta?
  /** Human-readable message indicating details about last transition. */
  @K8sDslMarker var message: String?
  /** Unique, this should be a short, machine understandable string that gives the reason for condition's last transition. If
it reports "ResizeStarted" that means the underlying persistent volume is being resized. */
  @K8sDslMarker var reason: String?
  /**  */
  @K8sDslMarker var status: String?
  /**  */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface PersistentVolumeClaimVolumeSource_v1_core: K8sManifest {
  /** ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
  @K8sDslMarker var claimName: String?
  /** Will force the ReadOnly setting in VolumeMounts. Default false. */
  @K8sDslMarker var readOnly: Boolean?
}

@K8sDslMarker
interface PhotonPersistentDiskVolumeSource_v1_core: K8sManifest {
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
Implicitly inferred to be "ext4" if unspecified. */
  @K8sDslMarker var fsType: String?
  /** ID that identifies Photon Controller persistent disk */
  @K8sDslMarker var pdID: String?
}

@K8sDslMarker
interface PodAffinity_v1_core: K8sManifest {
  /** The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but
it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the
greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request,
requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and
adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the
highest sum are the most preferred. */
  val preferredDuringSchedulingIgnoredDuringExecution: List<WeightedPodAffinityTerm_v1_core>?
  /** If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto
the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g.
due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are
multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be
satisfied. */
  val requiredDuringSchedulingIgnoredDuringExecution: List<PodAffinityTerm_v1_core>?
}

@K8sDslMarker
interface PodAffinityTerm_v1_core: K8sManifest {
  /** A label query over a set of resources, in this case pods. */
  val labelSelector: LabelSelector_v1_meta?
  /** namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means "this
pod's namespace" */
  @K8sDslMarker var namespaces: List<String>?
  /** This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in
the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey
matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed. */
  @K8sDslMarker var topologyKey: String?
}

@K8sDslMarker
interface PodAntiAffinity_v1_core: K8sManifest {
  /** The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field,
but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with
the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request,
requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field
and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with
the highest sum are the most preferred. */
  val preferredDuringSchedulingIgnoredDuringExecution: List<WeightedPodAffinityTerm_v1_core>?
  /** If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled
onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod
execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node.
When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all
terms must be satisfied. */
  val requiredDuringSchedulingIgnoredDuringExecution: List<PodAffinityTerm_v1_core>?
}

@K8sDslMarker
interface PodCondition_v1_core: K8sManifest {
  /** Last time we probed the condition. */
  val lastProbeTime: Time_v1_meta?
  /** Last time the condition transitioned from one status to another. */
  val lastTransitionTime: Time_v1_meta?
  /** Human-readable message indicating details about last transition. */
  @K8sDslMarker var message: String?
  /** Unique, one-word, CamelCase reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** Status is the status of the condition. Can be True, False, Unknown. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions */
  @K8sDslMarker var status: String?
  /** Type is the type of the condition. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface PodDNSConfig_v1_core: K8sManifest {
  /** A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy.
Duplicated nameservers will be removed. */
  @K8sDslMarker var nameservers: List<String>?
  /** A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries
will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy. */
  val options: List<PodDNSConfigOption_v1_core>?
  /** A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from
DNSPolicy. Duplicated search paths will be removed. */
  @K8sDslMarker var searches: List<String>?
}

@K8sDslMarker
interface PodDNSConfigOption_v1_core: K8sManifest {
  /** Required. */
  @K8sDslMarker var name: String?
  /**  */
  @K8sDslMarker var value: String?
}

@K8sDslMarker
interface PodIP_v1_core: K8sManifest {
  /** ip is an IP address (IPv4 or IPv6) assigned to the pod */
  @K8sDslMarker var ip: String?
}

@K8sDslMarker
interface PodReadinessGate_v1_core: K8sManifest {
  /** ConditionType refers to a condition in the pod's condition list with matching type. */
  @K8sDslMarker var conditionType: String?
}

@K8sDslMarker
interface PodSecurityContext_v1_core: K8sManifest {
  /** A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the
ownership of that volume to be owned by the pod: 1. The owning GID will be the FSGroup 2. The setgid bit is set (new
files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw---- If unset, the
Kubelet will not modify the ownership and permissions of any volume. */
  @K8sDslMarker var fsGroup: Int?
  /** The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in
SecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes
precedence for that container. */
  @K8sDslMarker var runAsGroup: Int?
  /** Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to
ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such
validation will be performed. May also be set in SecurityContext. If set in both SecurityContext and PodSecurityContext,
the value specified in SecurityContext takes precedence. */
  @K8sDslMarker var runAsNonRoot: Boolean?
  /** The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May
also be set in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in
SecurityContext takes precedence for that container. */
  @K8sDslMarker var runAsUser: Int?
  /** The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random
SELinux context for each container. May also be set in SecurityContext. If set in both SecurityContext and
PodSecurityContext, the value specified in SecurityContext takes precedence for that container. */
  val seLinuxOptions: SELinuxOptions_v1_core?
  /** A list of groups applied to the first process run in each container, in addition to the container's primary GID. If
unspecified, no groups will be added to any container. */
  @K8sDslMarker var supplementalGroups: List<Int>?
  /** Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime)
might fail to launch. */
  val sysctls: List<Sysctl_v1_core>?
  /** The Windows specific settings applied to all containers. If unspecified, the options within a container's
SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in
SecurityContext takes precedence. */
  val windowsOptions: WindowsSecurityContextOptions_v1_core?
}

@K8sDslMarker
interface PodsMetricSource_v2beta2_autoscaling: K8sManifest {
  /** metric identifies the target metric by name and selector */
  val metric: MetricIdentifier_v2beta2_autoscaling?
  /** target specifies the target value for the given metric */
  val target: MetricTarget_v2beta2_autoscaling?
}

@K8sDslMarker
interface PodsMetricStatus_v2beta2_autoscaling: K8sManifest {
  /** current contains the current value for the given metric */
  val current: MetricValueStatus_v2beta2_autoscaling?
  /** metric identifies the target metric by name and selector */
  val metric: MetricIdentifier_v2beta2_autoscaling?
}

@K8sDslMarker
interface Policy_v1alpha1_auditregistration_k8s_io: K8sManifest {
  /** The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required */
  @K8sDslMarker var level: String?
  /** Stages is a list of stages for which events are created. */
  @K8sDslMarker var stages: List<String>?
}

@K8sDslMarker
interface PolicyRule_v1_rbac_authorization_k8s_io: K8sManifest {
  /** APIGroups is the name of the APIGroup that contains the resources. If multiple API groups are specified, any action
requested against one of the enumerated resources in any API group will be allowed. */
  @K8sDslMarker var apiGroups: List<String>?
  /** NonResourceURLs is a set of partial urls that a user should have access to. `*`s are allowed, but only as the full,
final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles
referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets") or
non-resource URL paths (such as "/api"), but not both. */
  @K8sDslMarker var nonResourceURLs: List<String>?
  /** ResourceNames is an optional white list of names that the rule applies to. An empty set means that everything is
allowed. */
  @K8sDslMarker var resourceNames: List<String>?
  /** Resources is a list of resources this rule applies to. ResourceAll represents all resources. */
  @K8sDslMarker var resources: List<String>?
  /** Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule. VerbAll
represents all kinds. */
  @K8sDslMarker var verbs: List<String>?
}

@K8sDslMarker
interface PortworxVolumeSource_v1_core: K8sManifest {
  /** FSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system. Ex.
"ext4", "xfs". Implicitly inferred to be "ext4" if unspecified. */
  @K8sDslMarker var fsType: String?
  /** Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** VolumeID uniquely identifies a Portworx volume */
  @K8sDslMarker var volumeID: String?
}

@K8sDslMarker
interface Preconditions_v1_meta: K8sManifest {
  /** Specifies the target ResourceVersion */
  @K8sDslMarker var resourceVersion: String?
  /** Specifies the target UID. */
  @K8sDslMarker var uid: String?
}

@K8sDslMarker
interface PreferredSchedulingTerm_v1_core: K8sManifest {
  /** A node selector term, associated with the corresponding weight. */
  val preference: NodeSelectorTerm_v1_core?
  /** Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100. */
  @K8sDslMarker var weight: Int?
}

@K8sDslMarker
interface Probe_v1_core: K8sManifest {
  /** One and only one of the following should be specified. Exec specifies the action to take. */
  val exec: ExecAction_v1_core?
  /** Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value
is 1. */
  @K8sDslMarker var failureThreshold: Int?
  /** HTTPGet specifies the http request to perform. */
  val httpGet: HTTPGetAction_v1_core?
  /** Number of seconds after the container has started before liveness probes are initiated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  @K8sDslMarker var initialDelaySeconds: Int?
  /** How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. */
  @K8sDslMarker var periodSeconds: Int?
  /** Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1
for liveness and startup. Minimum value is 1. */
  @K8sDslMarker var successThreshold: Int?
  /** TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported */
  val tcpSocket: TCPSocketAction_v1_core?
  /** Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  @K8sDslMarker var timeoutSeconds: Int?
}

@K8sDslMarker
interface ProjectedVolumeSource_v1_core: K8sManifest {
  /** Mode bits to use on created files by default. Must be a value between 0 and 0777. Directories within the path are not
affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the
result can be other mode bits set. */
  @K8sDslMarker var defaultMode: Int?
  /** list of volume projections */
  val sources: List<VolumeProjection_v1_core>?
}

@K8sDslMarker
interface Quantity_resource_core: K8sManifest {
  
}

@K8sDslMarker
interface QuobyteVolumeSource_v1_core: K8sManifest {
  /** Group to map volume access to Default is no group */
  @K8sDslMarker var group: String?
  /** ReadOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false. */
  @K8sDslMarker var readOnly: Boolean?
  /** Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple
entries are separated with commas) which acts as the central registry for volumes */
  @K8sDslMarker var registry: String?
  /** Tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by
the plugin */
  @K8sDslMarker var tenant: String?
  /** User to map volume access to Defaults to serivceaccount user */
  @K8sDslMarker var user: String?
  /** Volume is a string that references an already created Quobyte volume by name. */
  @K8sDslMarker var volume: String?
}

@K8sDslMarker
interface RBDPersistentVolumeSource_v1_core: K8sManifest {
  /** Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host
operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info:
https://kubernetes.io/docs/concepts/storage/volumes#rbd */
  @K8sDslMarker var fsType: String?
  /** The rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var image: String?
  /** Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info:
https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var keyring: String?
  /** A collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var monitors: List<String>?
  /** The rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var pool: String?
  /** ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info:
https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var readOnly: Boolean?
  /** SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info:
https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  val secretRef: SecretReference_v1_core?
  /** The rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var user: String?
}

@K8sDslMarker
interface RBDVolumeSource_v1_core: K8sManifest {
  /** Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host
operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info:
https://kubernetes.io/docs/concepts/storage/volumes#rbd */
  @K8sDslMarker var fsType: String?
  /** The rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var image: String?
  /** Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info:
https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var keyring: String?
  /** A collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var monitors: List<String>?
  /** The rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var pool: String?
  /** ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info:
https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var readOnly: Boolean?
  /** SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info:
https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  val secretRef: LocalObjectReference_v1_core?
  /** The rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var user: String?
}

@K8sDslMarker
interface ReplicaSetCondition_v1_apps: K8sManifest {
  /** The last time the condition transitioned from one status to another. */
  val lastTransitionTime: Time_v1_meta?
  /** A human readable message indicating details about the transition. */
  @K8sDslMarker var message: String?
  /** The reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** Status of the condition, one of True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type of replica set condition. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface ReplicationControllerCondition_v1_core: K8sManifest {
  /** The last time the condition transitioned from one status to another. */
  val lastTransitionTime: Time_v1_meta?
  /** A human readable message indicating details about the transition. */
  @K8sDslMarker var message: String?
  /** The reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** Status of the condition, one of True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type of replication controller condition. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface ResourceAttributes_v1_authorization_k8s_io: K8sManifest {
  /** Namespace is the namespace of the action being requested. Currently, there is no distinction between no namespace and
all namespaces "" (empty) is defaulted for LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources ""
(empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview */
  @K8sDslMarker var namespace: String?
  /** Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all. */
  @K8sDslMarker var name: String?
  /** Group is the API Group of the Resource. "`*`" means all. */
  @K8sDslMarker var group: String?
  /** Resource is one of the existing resource types. "`*`" means all. */
  @K8sDslMarker var resource: String?
  /** Subresource is one of the existing resource types. "" means none. */
  @K8sDslMarker var subresource: String?
  /** Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy. "`*`" means all. */
  @K8sDslMarker var verb: String?
  /** Version is the API Version of the Resource. "`*`" means all. */
  @K8sDslMarker var version: String?
}

@K8sDslMarker
interface ResourceFieldSelector_v1_core: K8sManifest {
  /** Container name: required for volumes, optional for env vars */
  @K8sDslMarker var containerName: String?
  /** Specifies the output format of the exposed resources, defaults to "1" */
  val divisor: Quantity_resource_core?
  /** Required: resource to select */
  @K8sDslMarker var resource: String?
}

@K8sDslMarker
interface ResourceMetricSource_v2beta2_autoscaling: K8sManifest {
  /** name is the name of the resource in question. */
  @K8sDslMarker var name: String?
  /** target specifies the target value for the given metric */
  val target: MetricTarget_v2beta2_autoscaling?
}

@K8sDslMarker
interface ResourceMetricStatus_v2beta2_autoscaling: K8sManifest {
  /** Name is the name of the resource in question. */
  @K8sDslMarker var name: String?
  /** current contains the current value for the given metric */
  val current: MetricValueStatus_v2beta2_autoscaling?
}

@K8sDslMarker
interface ResourceRequirements_v1_core: K8sManifest {
  /** Limits describes the maximum amount of compute resources allowed. More info:
https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/ */
  var limits: de.loosetie.k8s.dsl.types.LimitsAndRequests?
  /** Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults
to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info:
https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/ */
  var requests: de.loosetie.k8s.dsl.types.LimitsAndRequests?
}

@K8sDslMarker
interface ResourceRule_v1_authorization_k8s_io: K8sManifest {
  /** APIGroups is the name of the APIGroup that contains the resources. If multiple API groups are specified, any action
requested against one of the enumerated resources in any API group will be allowed. "`*`" means all. */
  @K8sDslMarker var apiGroups: List<String>?
  /** ResourceNames is an optional white list of names that the rule applies to. An empty set means that everything is
allowed. "`*`" means all. */
  @K8sDslMarker var resourceNames: List<String>?
  /** Resources is a list of resources this rule applies to. "`*`" means all in the specified apiGroups. "`*`/foo" represents
the subresource 'foo' for all resources in the specified apiGroups. */
  @K8sDslMarker var resources: List<String>?
  /** Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy. "`*`" means all. */
  @K8sDslMarker var verbs: List<String>?
}

@K8sDslMarker
interface RoleRef_v1_rbac_authorization_k8s_io: K8sManifest {
  /** Kind is the type of resource being referenced */
  @K8sDslMarker var kind: String?
  /** Name is the name of resource being referenced */
  @K8sDslMarker var name: String?
  /** APIGroup is the group for the resource being referenced */
  @K8sDslMarker var apiGroup: String?
}

@K8sDslMarker
interface RollbackConfig_v1beta1_apps: K8sManifest {
  /** The revision to rollback to. If set to 0, rollback to the last revision. */
  @K8sDslMarker var revision: Int?
}

@K8sDslMarker
interface RollingUpdateStatefulSetStrategy_v1_apps: K8sManifest {
  /** Partition indicates the ordinal at which the StatefulSet should be partitioned. Default value is 0. */
  @K8sDslMarker var partition: Int?
}

@K8sDslMarker
interface RuleWithOperations_v1_admissionregistration_k8s_io: K8sManifest {
  /** APIGroups is the API groups the resources belong to. '\`*`' is all groups. If '\`*`' is present, the length of the slice
must be one. Required. */
  @K8sDslMarker var apiGroups: List<String>?
  /** APIVersions is the API versions the resources belong to. '\`*`' is all versions. If '\`*`' is present, the length of the
slice must be one. Required. */
  @K8sDslMarker var apiVersions: List<String>?
  /** Operations is the operations the admission hook cares about - CREATE, UPDATE, or `*` for all operations. If '\`*`' is
present, the length of the slice must be one. Required. */
  @K8sDslMarker var operations: List<String>?
  /** Resources is a list of resources this rule applies to. For example: 'pods' means pods. 'pods/log' means the log
subresource of pods. '\`*`' means all resources, but not subresources. 'pods/\`*`' means all subresources of pods.
'\`*`/scale' means all scale subresources. '\`*`/\`*`' means all resources and their subresources. If wildcard is
present, the validation rule will ensure resources do not overlap with each other. Depending on the enclosing object,
subresources might not be allowed. Required. */
  @K8sDslMarker var resources: List<String>?
  /** scope specifies the scope of this rule. Valid values are "Cluster", "Namespaced", and "`*`" "Cluster" means that only
cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. "Namespaced" means that only
namespaced resources will match this rule. "`*`" means that there are no scope restrictions. Subresources match the
scope of their parent resource. Default is "`*`". */
  @K8sDslMarker var scope: String?
}

@K8sDslMarker
interface RunAsGroupStrategyOptions_v1beta1_policy: K8sManifest {
  /** ranges are the allowed ranges of gids that may be used. If you would like to force a single gid then supply a single
range with the same start and end. Required for MustRunAs. */
  val ranges: List<IDRange_v1beta1_policy>?
  /** rule is the strategy that will dictate the allowable RunAsGroup values that may be set. */
  @K8sDslMarker var rule: String?
}

@K8sDslMarker
interface RunAsUserStrategyOptions_v1beta1_policy: K8sManifest {
  /** ranges are the allowed ranges of uids that may be used. If you would like to force a single uid then supply a single
range with the same start and end. Required for MustRunAs. */
  val ranges: List<IDRange_v1beta1_policy>?
  /** rule is the strategy that will dictate the allowable RunAsUser values that may be set. */
  @K8sDslMarker var rule: String?
}

@K8sDslMarker
interface RuntimeClassStrategyOptions_v1beta1_policy: K8sManifest {
  /** allowedRuntimeClassNames is a whitelist of RuntimeClass names that may be specified on a pod. A value of "`*`" means
that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the
RuntimeClassName field to be unset. */
  @K8sDslMarker var allowedRuntimeClassNames: List<String>?
  /** defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the
allowedRuntimeClassNames list. A value of nil does not mutate the Pod. */
  @K8sDslMarker var defaultRuntimeClassName: String?
}

@K8sDslMarker
interface SELinuxOptions_v1_core: K8sManifest {
  /** Level is SELinux level label that applies to the container. */
  @K8sDslMarker var level: String?
  /** Role is a SELinux role label that applies to the container. */
  @K8sDslMarker var role: String?
  /** Type is a SELinux type label that applies to the container. */
  @K8sDslMarker var type: String?
  /** User is a SELinux user label that applies to the container. */
  @K8sDslMarker var user: String?
}

@K8sDslMarker
interface SELinuxStrategyOptions_v1beta1_policy: K8sManifest {
  /** rule is the strategy that will dictate the allowable labels that may be set. */
  @K8sDslMarker var rule: String?
  /** seLinuxOptions required to run as; required for MustRunAs More info:
https://kubernetes.io/docs/tasks/configure-pod-container/security-context/ */
  val seLinuxOptions: SELinuxOptions_v1_core?
}

@K8sDslMarker
interface ScaleIOPersistentVolumeSource_v1_core: K8sManifest {
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
Default is "xfs" */
  @K8sDslMarker var fsType: String?
  /** The host address of the ScaleIO API Gateway. */
  @K8sDslMarker var gateway: String?
  /** The name of the ScaleIO Protection Domain for the configured storage. */
  @K8sDslMarker var protectionDomain: String?
  /** Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login
operation will fail. */
  val secretRef: SecretReference_v1_core?
  /** Flag to enable/disable SSL communication with Gateway, default false */
  @K8sDslMarker var sslEnabled: Boolean?
  /** Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned. */
  @K8sDslMarker var storageMode: String?
  /** The ScaleIO Storage Pool associated with the protection domain. */
  @K8sDslMarker var storagePool: String?
  /** The name of the storage system as configured in ScaleIO. */
  @K8sDslMarker var system: String?
  /** The name of a volume already created in the ScaleIO system that is associated with this volume source. */
  @K8sDslMarker var volumeName: String?
}

@K8sDslMarker
interface ScaleIOVolumeSource_v1_core: K8sManifest {
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
Default is "xfs". */
  @K8sDslMarker var fsType: String?
  /** The host address of the ScaleIO API Gateway. */
  @K8sDslMarker var gateway: String?
  /** The name of the ScaleIO Protection Domain for the configured storage. */
  @K8sDslMarker var protectionDomain: String?
  /** Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login
operation will fail. */
  val secretRef: LocalObjectReference_v1_core?
  /** Flag to enable/disable SSL communication with Gateway, default false */
  @K8sDslMarker var sslEnabled: Boolean?
  /** Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned. */
  @K8sDslMarker var storageMode: String?
  /** The ScaleIO Storage Pool associated with the protection domain. */
  @K8sDslMarker var storagePool: String?
  /** The name of the storage system as configured in ScaleIO. */
  @K8sDslMarker var system: String?
  /** The name of a volume already created in the ScaleIO system that is associated with this volume source. */
  @K8sDslMarker var volumeName: String?
}

@K8sDslMarker
interface Scheduling_v1beta1_node_k8s_io: K8sManifest {
  /** nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can
only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod's existing
nodeSelector. Any conflicts will cause the pod to be rejected in admission. */
  @K8sDslMarker var nodeSelector: Map<String, String>?
  /** tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively
unioning the set of nodes tolerated by the pod and the RuntimeClass. */
  val tolerations: List<Toleration_v1_core>?
}

@K8sDslMarker
interface ScopeSelector_v1_core: K8sManifest {
  /** A list of scope selector requirements by scope of the resources. */
  val matchExpressions: List<ScopedResourceSelectorRequirement_v1_core>?
}

@K8sDslMarker
interface ScopedResourceSelectorRequirement_v1_core: K8sManifest {
  /** Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. */
  @K8sDslMarker var operator: String?
  /** The name of the scope that the selector applies to. */
  @K8sDslMarker var scopeName: String?
  /** An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists
or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch. */
  @K8sDslMarker var values: List<String>?
}

@K8sDslMarker
interface SecretEnvSource_v1_core: K8sManifest {
  /** Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** Specify whether the Secret must be defined */
  @K8sDslMarker var optional: Boolean?
}

@K8sDslMarker
interface SecretKeySelector_v1_core: K8sManifest {
  /** Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** The key of the secret to select from. Must be a valid secret key. */
  @K8sDslMarker var key: String?
  /** Specify whether the Secret or its key must be defined */
  @K8sDslMarker var optional: Boolean?
}

@K8sDslMarker
interface SecretProjection_v1_core: K8sManifest {
  /** Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a
file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified
paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup
will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'. */
  val items: List<KeyToPath_v1_core>?
  /** Specify whether the Secret or its key must be defined */
  @K8sDslMarker var optional: Boolean?
}

@K8sDslMarker
interface SecretReference_v1_core: K8sManifest {
  /** Namespace defines the space within which the secret name must be unique. */
  @K8sDslMarker var namespace: String?
  /** Name is unique within a namespace to reference a secret resource. */
  @K8sDslMarker var name: String?
}

@K8sDslMarker
interface SecretVolumeSource_v1_core: K8sManifest {
  /** Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644.
Directories within the path are not affected by this setting. This might be in conflict with other options that affect
the file mode, like fsGroup, and the result can be other mode bits set. */
  @K8sDslMarker var defaultMode: Int?
  /** If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a
file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified
paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup
will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'. */
  val items: List<KeyToPath_v1_core>?
  /** Specify whether the Secret or its keys must be defined */
  @K8sDslMarker var optional: Boolean?
  /** Name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret */
  @K8sDslMarker var secretName: String?
}

@K8sDslMarker
interface SecurityContext_v1_core: K8sManifest {
  /** AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly
controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the
container is: 1) run as Privileged 2) has CAP_SYS_ADMIN */
  @K8sDslMarker var allowPrivilegeEscalation: Boolean?
  /** The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the
container runtime. */
  val capabilities: Capabilities_v1_core?
  /** Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host.
Defaults to false. */
  @K8sDslMarker var privileged: Boolean?
  /** procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the
container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be
enabled. */
  @K8sDslMarker var procMount: String?
  /** Whether this container has a read-only root filesystem. Default is false. */
  @K8sDslMarker var readOnlyRootFilesystem: Boolean?
  /** The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in
PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes
precedence. */
  @K8sDslMarker var runAsGroup: Int?
  /** Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to
ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such
validation will be performed. May also be set in PodSecurityContext. If set in both SecurityContext and
PodSecurityContext, the value specified in SecurityContext takes precedence. */
  @K8sDslMarker var runAsNonRoot: Boolean?
  /** The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May
also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in
SecurityContext takes precedence. */
  @K8sDslMarker var runAsUser: Int?
  /** The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux
context for each container. May also be set in PodSecurityContext. If set in both SecurityContext and
PodSecurityContext, the value specified in SecurityContext takes precedence. */
  val seLinuxOptions: SELinuxOptions_v1_core?
  /** The Windows specific settings applied to all containers. If unspecified, the options from the PodSecurityContext will be
used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. */
  val windowsOptions: WindowsSecurityContextOptions_v1_core?
}

@K8sDslMarker
interface ServerAddressByClientCIDR_v1_meta: K8sManifest {
  /** The CIDR with which clients can match their IP to figure out the server address that they should use. */
  @K8sDslMarker var clientCIDR: String?
  /** Address of this server, suitable for a client that matches the above CIDR. This can be a hostname, hostname:port, IP or
IP:port. */
  @K8sDslMarker var serverAddress: String?
}

@K8sDslMarker
interface ServiceAccountTokenProjection_v1_core: K8sManifest {
  /** Audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified
in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the
apiserver. */
  @K8sDslMarker var audience: String?
  /** ExpirationSeconds is the requested duration of validity of the service account token. As the token approaches
expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying
to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24
hours.Defaults to 1 hour and must be at least 10 minutes. */
  @K8sDslMarker var expirationSeconds: Int?
  /** Path is the path relative to the mount point of the file to project the token into. */
  @K8sDslMarker var path: String?
}

@K8sDslMarker
interface ServicePort_v1_core: K8sManifest {
  /** The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique
names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if
only one ServicePort is defined on this service. */
  @K8sDslMarker var name: String?
  /** The port on each node on which this service is exposed when type=NodePort or LoadBalancer. Usually assigned by the
system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default
is to auto-allocate a port if the ServiceType of this Service requires one. More info:
https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport */
  @K8sDslMarker var nodePort: Int?
  /** The port that will be exposed by this service. */
  @K8sDslMarker var port: Int?
  /** The IP protocol for this port. Supports "TCP", "UDP", and "SCTP". Default is TCP. */
  @K8sDslMarker var protocol: String?
  /** Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name
must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports.
If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services
with clusterIP=None, and should be omitted or set equal to the 'port' field. More info:
https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service */
  var targetPort: de.loosetie.k8s.dsl.types.IntOrString?
}

@K8sDslMarker
interface ServiceReference_v1_admissionregistration_k8s_io: K8sManifest {
  /** `namespace` is the namespace of the service. Required */
  @K8sDslMarker var namespace: String?
  /** `name` is the name of the service. Required */
  @K8sDslMarker var name: String?
  /** `path` is an optional URL path which will be sent in any request to this service. */
  @K8sDslMarker var path: String?
  /** If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be
a valid port number (1-65535, inclusive). */
  @K8sDslMarker var port: Int?
}

@K8sDslMarker
interface SessionAffinityConfig_v1_core: K8sManifest {
  /** clientIP contains the configurations of Client IP based session affinity. */
  val clientIP: ClientIPConfig_v1_core?
}

@K8sDslMarker
interface StatefulSetCondition_v1_apps: K8sManifest {
  /** Last time the condition transitioned from one status to another. */
  val lastTransitionTime: Time_v1_meta?
  /** A human readable message indicating details about the transition. */
  @K8sDslMarker var message: String?
  /** The reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** Status of the condition, one of True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type of statefulset condition. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface StatefulSetUpdateStrategy_v1_apps: K8sManifest {
  /** RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType. */
  val rollingUpdate: RollingUpdateStatefulSetStrategy_v1_apps?
  /** Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface Status_v1_meta: K8sTopLevel {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "meta/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "Status"
  /** Standard list metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  val metadata: ListMeta_v1_meta
  /** Suggested HTTP return code for this status, 0 if not set. */
  @K8sDslMarker var code: Int?
  /** Extended data associated with the reason. Each reason may define its own extended details. This field is optional and
the data returned is not guaranteed to conform to any schema except that defined by the reason type. */
  val details: StatusDetails_v1_meta?
  /** A human-readable description of the status of this operation. */
  @K8sDslMarker var message: String?
  /** A machine-readable description of why this operation is in the "Failure" status. If this value is empty there is no
information available. A Reason clarifies an HTTP status code but does not override it. */
  @K8sDslMarker var reason: String?
  /** Status of the operation. One of: "Success" or "Failure". More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  @K8sDslMarker var status: String?
}

@K8sDslMarker
interface StatusCause_v1_meta: K8sManifest {
  /** The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix
notation for nested attributes. Arrays are zero-indexed. Fields may appear more than once in an array of causes due to
fields having multiple errors. Optional. Examples: "name" - the field "name" on the current resource "items[0].name" -
the field "name" on the first array entry in "items" */
  @K8sDslMarker var field: String?
  /** A human-readable description of the cause of the error. This field may be presented as-is to a reader. */
  @K8sDslMarker var message: String?
  /** A machine-readable description of the cause of the error. If this value is empty there is no information available. */
  @K8sDslMarker var reason: String?
}

@K8sDslMarker
interface StatusDetails_v1_meta: K8sManifest {
  /** The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the
requested resource Kind. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  @K8sDslMarker var kind: String?
  /** The name attribute of the resource associated with the status StatusReason (when there is a single name which can be
described). */
  @K8sDslMarker var name: String?
  /** The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide
detailed causes. */
  val causes: List<StatusCause_v1_meta>?
  /** The group attribute of the resource associated with the status StatusReason. */
  @K8sDslMarker var group: String?
  /** If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take
an alternate action - for those errors this field may indicate how long to wait before taking the alternate action. */
  @K8sDslMarker var retryAfterSeconds: Int?
  /** UID of the resource. (when there is a single resource which can be described). More info:
http://kubernetes.io/docs/user-guide/identifiers#uids */
  @K8sDslMarker var uid: String?
}

@K8sDslMarker
interface StorageOSPersistentVolumeSource_v1_core: K8sManifest {
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
Implicitly inferred to be "ext4" if unspecified. */
  @K8sDslMarker var fsType: String?
  /** Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** SecretRef specifies the secret to use for obtaining the StorageOS API credentials. If not specified, default values will
be attempted. */
  val secretRef: ObjectReference_v1_core?
  /** VolumeName is the human-readable name of the StorageOS volume. Volume names are only unique within a namespace. */
  @K8sDslMarker var volumeName: String?
  /** VolumeNamespace specifies the scope of the volume within StorageOS. If no namespace is specified then the Pod's
namespace will be used. This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration.
Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within
StorageOS. Namespaces that do not pre-exist within StorageOS will be created. */
  @K8sDslMarker var volumeNamespace: String?
}

@K8sDslMarker
interface StorageOSVolumeSource_v1_core: K8sManifest {
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
Implicitly inferred to be "ext4" if unspecified. */
  @K8sDslMarker var fsType: String?
  /** Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** SecretRef specifies the secret to use for obtaining the StorageOS API credentials. If not specified, default values will
be attempted. */
  val secretRef: LocalObjectReference_v1_core?
  /** VolumeName is the human-readable name of the StorageOS volume. Volume names are only unique within a namespace. */
  @K8sDslMarker var volumeName: String?
  /** VolumeNamespace specifies the scope of the volume within StorageOS. If no namespace is specified then the Pod's
namespace will be used. This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration.
Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within
StorageOS. Namespaces that do not pre-exist within StorageOS will be created. */
  @K8sDslMarker var volumeNamespace: String?
}

@K8sDslMarker
interface Subject_v1_rbac_authorization_k8s_io: K8sManifest {
  /** Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount". If the
Authorizer does not recognized the kind value, the Authorizer should report an error. */
  @K8sDslMarker var kind: String?
  /** Namespace of the referenced object. If the object kind is non-namespace, such as "User" or "Group", and this value is
not empty the Authorizer should report an error. */
  @K8sDslMarker var namespace: String?
  /** Name of the object being referenced. */
  @K8sDslMarker var name: String?
  /** APIGroup holds the API group of the referenced subject. Defaults to "" for ServiceAccount subjects. Defaults to
"rbac.authorization.k8s.io" for User and Group subjects. */
  @K8sDslMarker var apiGroup: String?
}

@K8sDslMarker
interface SubjectRulesReviewStatus_v1_authorization_k8s_io: K8sManifest {
  /** EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an
authorizer that doesn't support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete. */
  @K8sDslMarker var evaluationError: String?
  /** Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an
authorizer, such as an external authorizer, doesn't support rules evaluation. */
  @K8sDslMarker var incomplete: Boolean?
  /** NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn't
significant, may contain duplicates, and possibly be incomplete. */
  val nonResourceRules: List<NonResourceRule_v1_authorization_k8s_io>?
  /** ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn't
significant, may contain duplicates, and possibly be incomplete. */
  val resourceRules: List<ResourceRule_v1_authorization_k8s_io>?
}

@K8sDslMarker
interface SupplementalGroupsStrategyOptions_v1beta1_policy: K8sManifest {
  /** ranges are the allowed ranges of supplemental groups. If you would like to force a single supplemental group then supply
a single range with the same start and end. Required for MustRunAs. */
  val ranges: List<IDRange_v1beta1_policy>?
  /** rule is the strategy that will dictate what supplemental groups is used in the SecurityContext. */
  @K8sDslMarker var rule: String?
}

@K8sDslMarker
interface Sysctl_v1_core: K8sManifest {
  /** Name of a property to set */
  @K8sDslMarker var name: String?
  /** Value of a property to set */
  @K8sDslMarker var value: String?
}

@K8sDslMarker
interface TCPSocketAction_v1_core: K8sManifest {
  /** Optional: Host name to connect to, defaults to the pod IP. */
  @K8sDslMarker var host: String?
  /** Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
IANA_SVC_NAME. */
  var port: de.loosetie.k8s.dsl.types.IntOrString?
}

@K8sDslMarker
interface Taint_v1_core: K8sManifest {
  /** Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule
and NoExecute. */
  @K8sDslMarker var effect: String?
  /** Required. The taint key to be applied to a node. */
  @K8sDslMarker var key: String?
  /** TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints. */
  val timeAdded: Time_v1_meta?
  /** Required. The taint value corresponding to the taint key. */
  @K8sDslMarker var value: String?
}

@K8sDslMarker
interface Time_v1_meta: K8sManifest {
  
}

@K8sDslMarker
interface Toleration_v1_core: K8sManifest {
  /** Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are
NoSchedule, PreferNoSchedule and NoExecute. */
  @K8sDslMarker var effect: String?
  /** Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator
must be Exists; this combination means to match all values and all keys. */
  @K8sDslMarker var key: String?
  /** Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists
is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category. */
  @K8sDslMarker var operator: String?
  /** TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field
is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero
and negative values will be treated as 0 (evict immediately) by the system. */
  @K8sDslMarker var tolerationSeconds: Int?
  /** Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just
a regular string. */
  @K8sDslMarker var value: String?
}

@K8sDslMarker
interface TopologySelectorLabelRequirement_v1_core: K8sManifest {
  /** The label key that the selector applies to. */
  @K8sDslMarker var key: String?
  /** An array of string values. One value must match the label to be selected. Each entry in Values is ORed. */
  @K8sDslMarker var values: List<String>?
}

@K8sDslMarker
interface TopologySelectorTerm_v1_core: K8sManifest {
  /** A list of topology selector requirements by labels. */
  val matchLabelExpressions: List<TopologySelectorLabelRequirement_v1_core>?
}

@K8sDslMarker
interface TopologySpreadConstraint_v1_core: K8sManifest {
  /** LabelSelector is used to find matching pods. Pods that match this label selector are counted to determine the number of
pods in their corresponding topology domain. */
  val labelSelector: LabelSelector_v1_meta?
  /** MaxSkew describes the degree to which pods may be unevenly distributed. It's the maximum permitted difference between
the number of matching pods in any two topology domains of a given topology type. For example, in a 3-zone cluster,
MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | | P | P | | - if
MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make
the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone.
It's a required field. Default value is 1 and 0 is not allowed. */
  @K8sDslMarker var maxSkew: Int?
  /** TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be
in the same topology. We consider each <key, value> as a "bucket", and try to put balanced number of pods into each
bucket. It's a required field. */
  @K8sDslMarker var topologyKey: String?
  /** WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint. - DoNotSchedule
(default) tells the scheduler not to schedule it - ScheduleAnyway tells the scheduler to still schedule it It's
considered as "Unsatisfiable" if and only if placing incoming pod on any topology violates "MaxSkew". For example, in a
3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P
P P | P | P | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become
3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be
imbalanced, but scheduler won't make it `*`more`*` imbalanced. It's a required field. */
  @K8sDslMarker var whenUnsatisfiable: String?
}

@K8sDslMarker
interface TypedLocalObjectReference_v1_core: K8sManifest {
  /** Kind is the type of resource being referenced */
  @K8sDslMarker var kind: String?
  /** Name is the name of resource being referenced */
  @K8sDslMarker var name: String?
  /** APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the
core API group. For any other third-party types, APIGroup is required. */
  @K8sDslMarker var apiGroup: String?
}

@K8sDslMarker
interface UserInfo_v1_authentication_k8s_io: K8sManifest {
  /** Any additional information provided by the authenticator. */
  @K8sDslMarker var extra: Any?
  /** The names of groups this user is a part of. */
  @K8sDslMarker var groups: List<String>?
  /** A unique value that identifies this user across time. If this user is deleted and another user by the same name is
added, they will have different UIDs. */
  @K8sDslMarker var uid: String?
  /** The name that uniquely identifies this user among all active users. */
  @K8sDslMarker var username: String?
}

@K8sDslMarker
interface ValidatingWebhook_v1_admissionregistration_k8s_io: K8sManifest {
  /** The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy"
is the name of the webhook, and kubernetes.io is the name of the organization. Required. */
  @K8sDslMarker var name: String?
  /** AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will
try to use first version in the list which it supports. If none of the versions specified in this list supported by API
server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does
not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. */
  @K8sDslMarker var admissionReviewVersions: List<String>?
  /** ClientConfig defines how to communicate with the hook. Required */
  val clientConfig: WebhookClientConfig_v1_admissionregistration_k8s_io?
  /** FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or
Fail. Defaults to Fail. */
  @K8sDslMarker var failurePolicy: String?
  /** matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
- Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via
apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included `apiGroups:["apps"], apiVersions:["v1"],
resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook. -
Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example,
if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included
`apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1
would be converted to apps/v1 and sent to the webhook. Defaults to "Equivalent" */
  @K8sDslMarker var matchPolicy: String?
  /** NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches
the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is
another cluster scoped resource, it never skips the webhook. For example, to run the webhook on any objects whose
namespace is not associated with "runlevel" of "0" or "1"; you will set the selector as follows: "namespaceSelector": {
"matchExpressions": [ { "key": "runlevel", "operator": "NotIn", "values": [ "0", "1" ] } ] } If instead you want to only
run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set
the selector as follows: "namespaceSelector": { "matchExpressions": [ { "key": "environment", "operator": "In",
"values": [ "prod", "staging" ] } ] } See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels for
more examples of label selectors. Default to the empty LabelSelector, which matches everything. */
  val namespaceSelector: LabelSelector_v1_meta?
  /** ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is
evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if
either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete)
or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match.
Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the
labels. Default to the empty LabelSelector, which matches everything. */
  val objectSelector: LabelSelector_v1_meta?
  /** Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an
operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and
MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely
disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests
for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects. */
  val rules: List<RuleWithOperations_v1_admissionregistration_k8s_io>?
  /** SideEffects states whether this webhook has side effects. Acceptable values are: None, NoneOnDryRun (webhooks created
via v1beta1 may also specify Some or Unknown). Webhooks with side effects MUST implement a reconciliation system, since
a request may be rejected by a future step in the admission change and the side effects therefore need to be undone.
Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. */
  @K8sDslMarker var sideEffects: String?
  /** TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the
API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 10
seconds. */
  @K8sDslMarker var timeoutSeconds: Int?
}

@K8sDslMarker
interface VolumeAttachmentSource_v1_storage_k8s_io: K8sManifest {
  /** inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline
VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's
inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the
CSIMigration feature. */
  val inlineVolumeSpec: Persistentvolumespec_v1_core?
  /** Name of the persistent volume to attach. */
  @K8sDslMarker var persistentVolumeName: String?
}

@K8sDslMarker
interface VolumeDevice_v1_core: K8sManifest {
  /** name must match the name of a persistentVolumeClaim in the pod */
  @K8sDslMarker var name: String?
  /** devicePath is the path inside of the container that the device will be mapped to. */
  @K8sDslMarker var devicePath: String?
}

@K8sDslMarker
interface VolumeError_v1_storage_k8s_io: K8sManifest {
  /** String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not
contain sensitive information. */
  @K8sDslMarker var message: String?
  /** Time the error was encountered. */
  val time: Time_v1_meta?
}

@K8sDslMarker
interface VolumeMount_v1_core: K8sManifest {
  /** This must match the Name of a Volume. */
  @K8sDslMarker var name: String?
  /** Path within the container at which the volume should be mounted. Must not contain ':'. */
  @K8sDslMarker var mountPath: String?
  /** mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set,
MountPropagationNone is used. This field is beta in 1.10. */
  @K8sDslMarker var mountPropagation: String?
  /** Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false. */
  @K8sDslMarker var readOnly: Boolean?
  /** Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root). */
  @K8sDslMarker var subPath: String?
  /** Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but
environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's
root). SubPathExpr and SubPath are mutually exclusive. This field is beta in 1.15. */
  @K8sDslMarker var subPathExpr: String?
}

@K8sDslMarker
interface VolumeNodeAffinity_v1_core: K8sManifest {
  /** Required specifies hard node constraints that must be met. */
  val required: NodeSelector_v1_core?
}

@K8sDslMarker
interface VolumeNodeResources_v1beta1_storage_k8s_io: K8sManifest {
  /** Maximum number of unique volumes managed by the CSI driver that can be used on a node. A volume that is both attached
and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared
among multiple pods on the same node. If this field is nil, then the supported number of volumes on this node is
unbounded. */
  @K8sDslMarker var count: Int?
}

@K8sDslMarker
interface VolumeProjection_v1_core: K8sManifest {
  /** information about the configMap data to project */
  val configMap: ConfigMapProjection_v1_core?
  /** information about the downwardAPI data to project */
  val downwardAPI: DownwardAPIProjection_v1_core?
  /** information about the secret data to project */
  val secret: SecretProjection_v1_core?
  /** information about the serviceAccountToken data to project */
  val serviceAccountToken: ServiceAccountTokenProjection_v1_core?
}

@K8sDslMarker
interface VsphereVirtualDiskVolumeSource_v1_core: K8sManifest {
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
Implicitly inferred to be "ext4" if unspecified. */
  @K8sDslMarker var fsType: String?
  /** Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName. */
  @K8sDslMarker var storagePolicyID: String?
  /** Storage Policy Based Management (SPBM) profile name. */
  @K8sDslMarker var storagePolicyName: String?
  /** Path that identifies vSphere volume vmdk */
  @K8sDslMarker var volumePath: String?
}

@K8sDslMarker
interface WatchEvent_v1_meta: K8sManifest {
  /** Object is: `*` If Type is Added or Modified: the new state of the object. `*` If Type is Deleted: the state of the
object immediately before deletion. `*` If Type is Error: `*`Status is recommended; other types may make sense depending
on context. */
  @K8sDslMarker var `object`: Any?
  /**  */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface Webhook_v1alpha1_auditregistration_k8s_io: K8sManifest {
  /** ClientConfig holds the connection parameters for the webhook required */
  val clientConfig: WebhookClientConfig_v1alpha1_auditregistration_k8s_io?
  /** Throttle holds the options for throttling the webhook */
  val throttle: WebhookThrottleConfig_v1alpha1_auditregistration_k8s_io?
}

@K8sDslMarker
interface WebhookClientConfig_v1_admissionregistration_k8s_io: K8sManifest {
  /** `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified,
system trust roots on the apiserver are used. */
  @K8sDslMarker var caBundle: String?
  /** `service` is a reference to the service for this webhook. Either `service` or `url` must be specified. If the webhook is
running within the cluster, then you should use `service`. */
  val service: ServiceReference_v1_admissionregistration_k8s_io?
  /** `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or
`service` must be specified. The `host` should not refer to a service running in the cluster; use the `service` field
instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
in-cluster DNS as that would be a layering violation). `host` may also be an IP address. Please note that using
`localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an
apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to
turn up in a new cluster. The scheme must be "https"; the URL must begin with "https://". A path is optional, and if
present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for
example, a cluster identifier. Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments
("#...") and query parameters ("?...") are not allowed, either. */
  @K8sDslMarker var url: String?
}

@K8sDslMarker
interface WebhookConversion_v1_apiextensions_k8s_io: K8sManifest {
  /** clientConfig is the instructions for how to call the webhook if strategy is `Webhook`. */
  val clientConfig: WebhookClientConfig_v1_apiextensions_k8s_io?
  /** conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server
will use the first version in the list which it supports. If none of the versions specified in this list are supported
by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed
versions and does not include any versions known to the API Server, calls to the webhook will fail. */
  @K8sDslMarker var conversionReviewVersions: List<String>?
}

@K8sDslMarker
interface WebhookThrottleConfig_v1alpha1_auditregistration_k8s_io: K8sManifest {
  /** ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS */
  @K8sDslMarker var burst: Int?
  /** ThrottleQPS maximum number of batches per second default 10 QPS */
  @K8sDslMarker var qps: Int?
}

@K8sDslMarker
interface WeightedPodAffinityTerm_v1_core: K8sManifest {
  /** Required. A pod affinity term, associated with the corresponding weight. */
  val podAffinityTerm: PodAffinityTerm_v1_core?
  /** weight associated with matching the corresponding podAffinityTerm, in the range 1-100. */
  @K8sDslMarker var weight: Int?
}

@K8sDslMarker
interface WindowsSecurityContextOptions_v1_core: K8sManifest {
  /** GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the
contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only
honored by servers that enable the WindowsGMSA feature flag. */
  @K8sDslMarker var gmsaCredentialSpec: String?
  /** GMSACredentialSpecName is the name of the GMSA credential spec to use. This field is alpha-level and is only honored by
servers that enable the WindowsGMSA feature flag. */
  @K8sDslMarker var gmsaCredentialSpecName: String?
  /** The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata
if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value
specified in SecurityContext takes precedence. This field is alpha-level and it is only honored by servers that enable
the WindowsRunAsUserName feature flag. */
  @K8sDslMarker var runAsUserName: String?
}

@Deprecated(message="Old api version")
@K8sDslMarker
interface EndpointPort_v1alpha1_discovery_k8s_io: K8sManifest {
  /** The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a
Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass
IANA_SVC_NAME validation: `*` must be no more than 15 characters long `*` may contain only [-a-z0-9] `*` must contain at
least one letter [a-z] `*` it must not start or end with a hyphen, nor contain adjacent hyphens Default is empty string. */
  @K8sDslMarker var name: String?
  /** The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the
context of the specific consumer. */
  @K8sDslMarker var port: Int?
  /** The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP. */
  @K8sDslMarker var protocol: String?
}

@Deprecated(message="Old api version")
@K8sDslMarker
interface CrossVersionObjectReference_v2beta2_autoscaling: K8sTopLevel {
  /** API version of the referent */
  override val apiVersion: String
    get() = "autoscaling/v2beta2"
  /** Kind of the referent; More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds" */
  override val kind: String
    get() = "CrossVersionObjectReference"
  /** Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names */
  @K8sDslMarker var name: String?
}

@Deprecated(message="Old api version")
@K8sDslMarker
interface WebhookClientConfig_v1alpha1_auditregistration_k8s_io: K8sManifest {
  /** `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified,
system trust roots on the apiserver are used. */
  @K8sDslMarker var caBundle: String?
  /** `service` is a reference to the service for this webhook. Either `service` or `url` must be specified. If the webhook is
running within the cluster, then you should use `service`. */
  val service: ServiceReference_v1alpha1_auditregistration_k8s_io?
  /** `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or
`service` must be specified. The `host` should not refer to a service running in the cluster; use the `service` field
instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
in-cluster DNS as that would be a layering violation). `host` may also be an IP address. Please note that using
`localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an
apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to
turn up in a new cluster. The scheme must be "https"; the URL must begin with "https://". A path is optional, and if
present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for
example, a cluster identifier. Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments
("#...") and query parameters ("?...") are not allowed, either. */
  @K8sDslMarker var url: String?
}

@Deprecated(message="Old api version")
@K8sDslMarker
interface WebhookClientConfig_v1_apiextensions_k8s_io: K8sManifest {
  /** caBundle is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified,
system trust roots on the apiserver are used. */
  @K8sDslMarker var caBundle: String?
  /** service is a reference to the service for this webhook. Either service or url must be specified. If the webhook is
running within the cluster, then you should use `service`. */
  val service: ServiceReference_v1_apiextensions_k8s_io?
  /** url gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or
`service` must be specified. The `host` should not refer to a service running in the cluster; use the `service` field
instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
in-cluster DNS as that would be a layering violation). `host` may also be an IP address. Please note that using
`localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an
apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to
turn up in a new cluster. The scheme must be "https"; the URL must begin with "https://". A path is optional, and if
present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for
example, a cluster identifier. Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments
("#...") and query parameters ("?...") are not allowed, either. */
  @K8sDslMarker var url: String?
}

@Deprecated(message="Old api version")
@K8sDslMarker
interface ServiceReference_v1alpha1_auditregistration_k8s_io: K8sManifest {
  /** `namespace` is the namespace of the service. Required */
  @K8sDslMarker var namespace: String?
  /** `name` is the name of the service. Required */
  @K8sDslMarker var name: String?
  /** `path` is an optional URL path which will be sent in any request to this service. */
  @K8sDslMarker var path: String?
  /** If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be
a valid port number (1-65535, inclusive). */
  @K8sDslMarker var port: Int?
}

@Deprecated(message="Old api version")
@K8sDslMarker
interface ServiceReference_v1_apiextensions_k8s_io: K8sManifest {
  /** namespace is the namespace of the service. Required */
  @K8sDslMarker var namespace: String?
  /** name is the name of the service. Required */
  @K8sDslMarker var name: String?
  /** path is an optional URL path at which the webhook will be contacted. */
  @K8sDslMarker var path: String?
  /** port is an optional service port at which the webhook will be contacted. `port` should be a valid port number (1-65535,
inclusive). Defaults to 443 for backward compatibility. */
  @K8sDslMarker var port: Int?
}

@K8sDslMarker
interface Cronjobspec_v1beta1_batch: K8sManifest {
  /** Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run
concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace":
cancels currently running job and replaces it with a new one */
  @K8sDslMarker var concurrencyPolicy: String?
  /** The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
Defaults to 1. */
  @K8sDslMarker var failedJobsHistoryLimit: Int?
  /** Specifies the job that will be created when executing a CronJob. */
  val jobTemplate: JobTemplateSpec_v1beta1_batch?
  /** The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron. */
  @K8sDslMarker var schedule: String?
  /** Optional deadline in seconds for starting the job if it misses scheduled time for any reason. Missed jobs executions
will be counted as failed ones. */
  @K8sDslMarker var startingDeadlineSeconds: Int?
  /** The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not
specified. Defaults to 3. */
  @K8sDslMarker var successfulJobsHistoryLimit: Int?
  /** This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.
Defaults to false. */
  @K8sDslMarker var suspend: Boolean?
}

@K8sDslMarker
interface Cronjobstatus_v1beta1_batch: K8sManifest {
  /** A list of pointers to currently running jobs. */
  val active: List<ObjectReference_v1_core>?
  /** Information when was the last time the job was successfully scheduled. */
  val lastScheduleTime: Time_v1_meta?
}

@K8sDslMarker
interface Daemonsetspec_v1_apps: K8sManifest {
  /** The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container
crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready). */
  @K8sDslMarker var minReadySeconds: Int?
  /** The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not
specified. Defaults to 10. */
  @K8sDslMarker var revisionHistoryLimit: Int?
  /** A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod
template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  val selector: LabelSelector_v1_meta?
  /** An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every
node that matches the template's node selector (or on every node if no node selector is specified). More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
  val template: Podtemplatespec_v1_core?
  /** An update strategy to replace existing DaemonSet pods with new pods. */
  val updateStrategy: DaemonSetUpdateStrategy_v1_apps?
}

@K8sDslMarker
interface Daemonsetstatus_v1_apps: K8sManifest {
  /** Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism
when it needs to create the name for the newest ControllerRevision. */
  @K8sDslMarker var collisionCount: Int?
  /** Represents the latest available observations of a DaemonSet's current state. */
  val conditions: List<DaemonSetCondition_v1_apps>?
  /** The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/ */
  @K8sDslMarker var currentNumberScheduled: Int?
  /** The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More
info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/ */
  @K8sDslMarker var desiredNumberScheduled: Int?
  /** The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available
(ready for at least spec.minReadySeconds) */
  @K8sDslMarker var numberAvailable: Int?
  /** The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/ */
  @K8sDslMarker var numberMisscheduled: Int?
  /** The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready. */
  @K8sDslMarker var numberReady: Int?
  /** The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready
for at least spec.minReadySeconds) */
  @K8sDslMarker var numberUnavailable: Int?
  /** The most recent generation observed by the daemon set controller. */
  @K8sDslMarker var observedGeneration: Int?
  /** The total number of nodes that are running updated daemon pod */
  @K8sDslMarker var updatedNumberScheduled: Int?
}

@K8sDslMarker
interface Deploymentspec_v1_apps: K8sManifest {
  /** Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to
be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) */
  @K8sDslMarker var minReadySeconds: Int?
  /** Indicates that the deployment is paused. */
  @K8sDslMarker var paused: Boolean?
  /** The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment
controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be
surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused.
Defaults to 600s. */
  @K8sDslMarker var progressDeadlineSeconds: Int?
  /** Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1. */
  @K8sDslMarker var replicas: Int?
  /** The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and
not specified. Defaults to 10. */
  @K8sDslMarker var revisionHistoryLimit: Int?
  /** Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this
deployment. It must match the pod template's labels. */
  val selector: LabelSelector_v1_meta?
  /** The deployment strategy to use to replace existing pods with new ones. */
  val strategy: Deploymentstrategy_v1_apps?
  /** Template describes the pods that will be created. */
  val template: Podtemplatespec_v1_core?
}

@K8sDslMarker
interface Deploymentstatus_v1_apps: K8sManifest {
  /** Total number of available pods (ready for at least minReadySeconds) targeted by this deployment. */
  @K8sDslMarker var availableReplicas: Int?
  /** Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance
mechanism when it needs to create the name for the newest ReplicaSet. */
  @K8sDslMarker var collisionCount: Int?
  /** Represents the latest available observations of a deployment's current state. */
  val conditions: List<DeploymentCondition_v1_apps>?
  /** The generation observed by the deployment controller. */
  @K8sDslMarker var observedGeneration: Int?
  /** Total number of ready pods targeted by this deployment. */
  @K8sDslMarker var readyReplicas: Int?
  /** Total number of non-terminated pods targeted by this deployment (their labels match the selector). */
  @K8sDslMarker var replicas: Int?
  /** Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required
for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or
pods that still have not been created. */
  @K8sDslMarker var unavailableReplicas: Int?
  /** Total number of non-terminated pods targeted by this deployment that have the desired template spec. */
  @K8sDslMarker var updatedReplicas: Int?
}

@K8sDslMarker
interface Jobspec_v1_batch: K8sManifest {
  /** Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to
terminate it; value must be positive integer */
  @K8sDslMarker var activeDeadlineSeconds: Int?
  /** Specifies the number of retries before marking this job failed. Defaults to 6 */
  @K8sDslMarker var backoffLimit: Int?
  /** Specifies the desired number of successfully finished pods the job should be run with. Setting to nil means that the
success of any pod signals the success of all pods, and allows parallelism to have any positive value. Setting to 1
means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ */
  @K8sDslMarker var completions: Int?
  /** manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain
what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod
template. When true, the user is responsible for picking unique labels and specifying the selector. Failure to pick a
unique label may cause this and other jobs to not function correctly. However, You may see `manualSelector=true` in jobs
that were created with the old `extensions/v1beta1` API. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector */
  @K8sDslMarker var manualSelector: Boolean?
  /** Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in
steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e.
when the work left to do is less than max parallelism. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ */
  @K8sDslMarker var parallelism: Int?
  /** A label query over pods that should match the pod count. Normally, the system sets this field for you. More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  val selector: LabelSelector_v1_meta?
  /** Describes the pod that will be created when executing a job. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ */
  val template: Podtemplatespec_v1_core?
  /** ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this
field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job
is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be
automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it
finishes. This field is alpha-level and is only honored by servers that enable the TTLAfterFinished feature. */
  @K8sDslMarker var ttlSecondsAfterFinished: Int?
}

@K8sDslMarker
interface Jobstatus_v1_batch: K8sManifest {
  /** The number of actively running pods. */
  @K8sDslMarker var active: Int?
  /** Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate
operations. It is represented in RFC3339 form and is in UTC. */
  val completionTime: Time_v1_meta?
  /** The latest available observations of an object's current state. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ */
  val conditions: List<JobCondition_v1_batch>?
  /** The number of pods which reached phase Failed. */
  @K8sDslMarker var failed: Int?
  /** Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before
order across separate operations. It is represented in RFC3339 form and is in UTC. */
  val startTime: Time_v1_meta?
  /** The number of pods which reached phase Succeeded. */
  @K8sDslMarker var succeeded: Int?
}

@K8sDslMarker
interface Podspec_v1_core: K8sManifest {
  /** Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try
to mark it failed and kill associated containers. Value must be a positive integer. */
  @K8sDslMarker var activeDeadlineSeconds: Int?
  /** If specified, the pod's scheduling constraints */
  val affinity: Affinity_v1_core?
  /** AutomountServiceAccountToken indicates whether a service account token should be automatically mounted. */
  @K8sDslMarker var automountServiceAccountToken: Boolean?
  /** List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one
container in a Pod. Cannot be updated. */
  val containers: List<Container_v1_core>?
  /** Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based
on DNSPolicy. */
  val dnsConfig: PodDNSConfig_v1_core?
  /** Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst',
'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have
DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'. */
  @K8sDslMarker var dnsPolicy: String?
  /** EnableServiceLinks indicates whether information about services should be injected into pod's environment variables,
matching the syntax of Docker links. Optional: Defaults to true. */
  @K8sDslMarker var enableServiceLinks: Boolean?
  /** List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform
user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified
by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers
subresource. This field is alpha-level and is only honored by servers that enable the EphemeralContainers feature. */
  val ephemeralContainers: List<EphemeralContainer_v1_core>?
  /** HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is
only valid for non-hostNetwork pods. */
  val hostAliases: List<HostAlias_v1_core>?
  /** Use the host's ipc namespace. Optional: Default to false. */
  @K8sDslMarker var hostIPC: Boolean?
  /** Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be
used must be specified. Default to false. */
  @K8sDslMarker var hostNetwork: Boolean?
  /** Use the host's pid namespace. Optional: Default to false. */
  @K8sDslMarker var hostPID: Boolean?
  /** Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value. */
  @K8sDslMarker var hostname: String?
  /** ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images
used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use.
For example, in the case of docker, only DockerConfig type secrets are honored. More info:
https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod */
  val imagePullSecrets: List<LocalObjectReference_v1_core>?
  /** List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being
started. If any init container fails, the pod is considered to have failed and is handled according to its
restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers
may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an
init container are taken into account during scheduling by finding the highest request/limit for each resource type, and
then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a
similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/init-containers/ */
  val initContainers: List<Container_v1_core>?
  /** NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this
pod onto that node, assuming that it fits resource requirements. */
  @K8sDslMarker var nodeName: String?
  /** NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels
for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/ */
  @K8sDslMarker var nodeSelector: Map<String, String>?
  /** Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be
autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is
enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create
requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will
be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More
info: https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes
v1.16, and is only honored by servers that enable the PodOverhead feature. */
  var overhead: de.loosetie.k8s.dsl.types.LimitsAndRequests?
  /** PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to
PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the
NonPreemptingPriority feature. */
  @K8sDslMarker var preemptionPolicy: String?
  /** The priority value. Various system components use this field to find the priority of the pod. When Priority Admission
Controller is enabled, it prevents users from setting this field. The admission controller populates this field from
PriorityClassName. The higher the value, the higher the priority. */
  @K8sDslMarker var priority: Int?
  /** If specified, indicates the pod's priority. "system-node-critical" and "system-cluster-critical" are two special
keywords which indicate the highest priorities with the former being the highest priority. Any other name must be
defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if
there is no default. */
  @K8sDslMarker var priorityClassName: String?
  /** If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready
AND all conditions specified in the readiness gates have status equal to "True" More info:
https://git.k8s.io/enhancements/keps/sig-network/0007-pod-ready%2B%2B.md */
  val readinessGates: List<PodReadinessGate_v1_core>?
  /** Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy */
  @K8sDslMarker var restartPolicy: String?
  /** RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod. If no
RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the "legacy" RuntimeClass
will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info:
https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md This is a beta feature as of Kubernetes v1.14. */
  @K8sDslMarker var runtimeClassName: String?
  /** If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default
scheduler. */
  @K8sDslMarker var schedulerName: String?
  /** SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty. See type
description for default values of each field. */
  val securityContext: PodSecurityContext_v1_core?
  /** DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead. */
  @K8sDslMarker var serviceAccount: String?
  /** ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info:
https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/ */
  @K8sDslMarker var serviceAccountName: String?
  /** Share a single process namespace between all of the containers in a pod. When this is set containers will be able to
view and signal processes from other containers in the same pod, and the first process in each container will not be
assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false. This field is
beta-level and may be disabled with the PodShareProcessNamespace feature. */
  @K8sDslMarker var shareProcessNamespace: Boolean?
  /** If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>". If
not specified, the pod will not have a domainname at all. */
  @K8sDslMarker var subdomain: String?
  /** Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be
non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period will
be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a
termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than
the expected cleanup time for your process. Defaults to 30 seconds. */
  @K8sDslMarker var terminationGracePeriodSeconds: Int?
  /** If specified, the pod's tolerations. */
  val tolerations: List<Toleration_v1_core>?
  /** TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule
pods in a way which abides by the constraints. This field is alpha-level and is only honored by clusters that enables
the EvenPodsSpread feature. All topologySpreadConstraints are ANDed. */
  val topologySpreadConstraints: List<TopologySpreadConstraint_v1_core>?
  /** List of volumes that can be mounted by containers belonging to the pod. More info:
https://kubernetes.io/docs/concepts/storage/volumes */
  val volumes: List<Volume_v1_core>?
}

@K8sDslMarker
interface Podstatus_v1_core: K8sManifest {
  /** Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions */
  val conditions: List<PodCondition_v1_core>?
  /** The list has one entry per container in the manifest. Each entry is currently the output of `docker inspect`. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status */
  val containerStatuses: List<Containerstatus_v1_core>?
  /** Status for any ephemeral containers that have run in this pod. This field is alpha-level and is only populated by
servers that enable the EphemeralContainers feature. */
  val ephemeralContainerStatuses: List<Containerstatus_v1_core>?
  /** IP address of the host to which the pod is assigned. Empty if not yet scheduled. */
  @K8sDslMarker var hostIP: String?
  /** The list has one entry per init container in the manifest. The most recent successful init container will have ready =
true, the most recently started container will have startTime set. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status */
  val initContainerStatuses: List<Containerstatus_v1_core>?
  /** A human readable message indicating details about why the pod is in this condition. */
  @K8sDslMarker var message: String?
  /** nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as
preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be
scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner.
Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption.
As a result, this field may be different than PodSpec.nodeName when the pod is scheduled. */
  @K8sDslMarker var nominatedNodeName: String?
  /** The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the
reason and message fields, and the individual container status arrays contain more detail about the pod's status. There
are five possible phase values: Pending: The pod has been accepted by the Kubernetes system, but one or more of the
container images has not been created. This includes time before being scheduled as well as time spent downloading
images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers
have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded:
All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have
terminated, and at least one container has terminated in failure. The container either exited with non-zero status or
was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an
error in communicating with the host of the pod. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase */
  @K8sDslMarker var phase: String?
  /** IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated. */
  @K8sDslMarker var podIP: String?
  /** podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP
field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated
yet. */
  val podIPs: List<PodIP_v1_core>?
  /** The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for
available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md */
  @K8sDslMarker var qosClass: String?
  /** A brief CamelCase message indicating details about why the pod is in this state. e.g. 'Evicted' */
  @K8sDslMarker var reason: String?
  /** RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the
container image(s) for the pod. */
  val startTime: Time_v1_meta?
}

@K8sDslMarker
interface Replicasetspec_v1_apps: K8sManifest {
  /** Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to
be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) */
  @K8sDslMarker var minReadySeconds: Int?
  /** Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified.
Defaults to 1. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller */
  @K8sDslMarker var replicas: Int?
  /** Selector is a label query over pods that should match the replica count. Label keys and values that must match in order
to be controlled by this replica set. It must match the pod template's labels. More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  val selector: LabelSelector_v1_meta?
  /** Template is the object that describes the pod that will be created if insufficient replicas are detected. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
  val template: Podtemplatespec_v1_core?
}

@K8sDslMarker
interface Replicasetstatus_v1_apps: K8sManifest {
  /** The number of available replicas (ready for at least minReadySeconds) for this replica set. */
  @K8sDslMarker var availableReplicas: Int?
  /** Represents the latest available observations of a replica set's current state. */
  val conditions: List<ReplicaSetCondition_v1_apps>?
  /** The number of pods that have labels matching the labels of the pod template of the replicaset. */
  @K8sDslMarker var fullyLabeledReplicas: Int?
  /** ObservedGeneration reflects the generation of the most recently observed ReplicaSet. */
  @K8sDslMarker var observedGeneration: Int?
  /** The number of ready replicas for this replica set. */
  @K8sDslMarker var readyReplicas: Int?
  /** Replicas is the most recently oberved number of replicas. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller */
  @K8sDslMarker var replicas: Int?
}

@K8sDslMarker
interface Replicationcontrollerspec_v1_core: K8sManifest {
  /** Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to
be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) */
  @K8sDslMarker var minReadySeconds: Int?
  /** Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified.
Defaults to 1. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller */
  @K8sDslMarker var replicas: Int?
  /** Selector is a label query over pods that should match the Replicas count. If Selector is empty, it is defaulted to the
labels present on the Pod template. Label keys and values that must match in order to be controlled by this replication
controller, if empty defaulted to labels on Pod template. More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  @K8sDslMarker var selector: Map<String, String>?
  /** Template is the object that describes the pod that will be created if insufficient replicas are detected. This takes
precedence over a TemplateRef. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template */
  val template: Podtemplatespec_v1_core?
}

@K8sDslMarker
interface Replicationcontrollerstatus_v1_core: K8sManifest {
  /** The number of available replicas (ready for at least minReadySeconds) for this replication controller. */
  @K8sDslMarker var availableReplicas: Int?
  /** Represents the latest available observations of a replication controller's current state. */
  val conditions: List<ReplicationControllerCondition_v1_core>?
  /** The number of pods that have labels matching the labels of the pod template of the replication controller. */
  @K8sDslMarker var fullyLabeledReplicas: Int?
  /** ObservedGeneration reflects the generation of the most recently observed replication controller. */
  @K8sDslMarker var observedGeneration: Int?
  /** The number of ready replicas for this replication controller. */
  @K8sDslMarker var readyReplicas: Int?
  /** Replicas is the most recently oberved number of replicas. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller */
  @K8sDslMarker var replicas: Int?
}

@K8sDslMarker
interface Statefulsetspec_v1_apps: K8sManifest {
  /** podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling
down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the
controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite
order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without
waiting, and on scale down will delete all pods at once. */
  @K8sDslMarker var podManagementPolicy: String?
  /** replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are
instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults
to 1. */
  @K8sDslMarker var replicas: Int?
  /** revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history.
The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The
default value is 10. */
  @K8sDslMarker var revisionHistoryLimit: Int?
  /** selector is a label query over pods that should match the replica count. It must match the pod template's labels. More
info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
  val selector: LabelSelector_v1_meta?
  /** serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet,
and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern:
pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is managed by the StatefulSet
controller. */
  @K8sDslMarker var serviceName: String?
  /** template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod
stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet. */
  val template: Podtemplatespec_v1_core?
  /** updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a
revision is made to Template. */
  val updateStrategy: StatefulSetUpdateStrategy_v1_apps?
  /** volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible
for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must
have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence
over any volumes in the template, with the same name. */
  val volumeClaimTemplates: List<PersistentVolumeClaim_v1_core>?
}

@K8sDslMarker
interface Statefulsetstatus_v1_apps: K8sManifest {
  /** collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a
collision avoidance mechanism when it needs to create the name for the newest ControllerRevision. */
  @K8sDslMarker var collisionCount: Int?
  /** Represents the latest available observations of a statefulset's current state. */
  val conditions: List<StatefulSetCondition_v1_apps>?
  /** currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by
currentRevision. */
  @K8sDslMarker var currentReplicas: Int?
  /** currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence
[0,currentReplicas). */
  @K8sDslMarker var currentRevision: String?
  /** observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet's
generation, which is updated on mutation by the API Server. */
  @K8sDslMarker var observedGeneration: Int?
  /** readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready Condition. */
  @K8sDslMarker var readyReplicas: Int?
  /** replicas is the number of Pods created by the StatefulSet controller. */
  @K8sDslMarker var replicas: Int?
  /** updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence
[replicas-updatedReplicas,replicas) */
  @K8sDslMarker var updateRevision: String?
  /** updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by
updateRevision. */
  @K8sDslMarker var updatedReplicas: Int?
}

@K8sDslMarker
interface Ingressspec_v1beta1_networking_k8s_io: K8sManifest {
  /** A default backend capable of servicing requests that don't match any rule. At least one of 'backend' or 'rules' must be
specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default. */
  val backend: IngressBackend_v1beta1_networking_k8s_io?
  /** A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the
default backend. */
  val rules: List<IngressRule_v1beta1_networking_k8s_io>?
  /** TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify
different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS
extension, if the ingress controller fulfilling the ingress supports SNI. */
  val tls: List<IngressTLS_v1beta1_networking_k8s_io>?
}

@K8sDslMarker
interface Ingressstatus_v1beta1_networking_k8s_io: K8sManifest {
  /** LoadBalancer contains the current status of the load-balancer. */
  val loadBalancer: LoadBalancerStatus_v1_core?
}

@K8sDslMarker
interface Servicespec_v1_core: K8sManifest {
  /** clusterIP is the IP address of the service and is usually assigned randomly by the master. If an address is specified
manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail.
This field can not be changed through updates. Valid values are "None", empty string (""), or a valid IP address. "None"
can be specified for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and
LoadBalancer. Ignored if type is ExternalName. More info:
https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies */
  @K8sDslMarker var clusterIP: String?
  /** externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service. These
IPs are not managed by Kubernetes. The user is responsible for ensuring that traffic arrives at a node with this IP. A
common example is external load-balancers that are not part of the Kubernetes system. */
  @K8sDslMarker var externalIPs: List<String>?
  /** externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service. No
proxying will be involved. Must be a valid RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires Type to
be ExternalName. */
  @K8sDslMarker var externalName: String?
  /** externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints.
"Local" preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks
potentially imbalanced traffic spreading. "Cluster" obscures the client source IP and may cause a second hop to another
node, but should have good overall load-spreading. */
  @K8sDslMarker var externalTrafficPolicy: String?
  /** healthCheckNodePort specifies the healthcheck nodePort for the service. If not specified, HealthCheckNodePort is created
by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the
client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local. */
  @K8sDslMarker var healthCheckNodePort: Int?
  /** ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4 vs. IPv6). If a specific
IP family is requested, the clusterIP field will be allocated from that family, if it is available in the cluster. If no
IP family is requested, the cluster's primary IP family will be used. Other IP fields (loadBalancerIP,
loadBalancerSourceRanges, externalIPs) and controllers which allocate external load-balancers should use the same IP
family. Endpoints for this Service will be of this family. This field is immutable after creation. Assigning a
ServiceIPFamily not available in the cluster (e.g. IPv6 in IPv4 only cluster) is an error condition and will fail during
clusterIP assignment. */
  @K8sDslMarker var ipFamily: String?
  /** Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field. This
feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is
created. This field will be ignored if the cloud-provider does not support the feature. */
  @K8sDslMarker var loadBalancerIP: String?
  /** If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be
restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature."
More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/ */
  @K8sDslMarker var loadBalancerSourceRanges: List<String>?
  /** The list of ports that are exposed by this service. More info:
https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies */
  val ports: List<ServicePort_v1_core>?
  /** publishNotReadyAddresses, when set to true, indicates that DNS implementations must publish the notReadyAddresses of
subsets for the Endpoints associated with the Service. The default value is false. The primary use case for setting this
field is to use a StatefulSet's Headless Service to propagate SRV records for its Pods without respect to their
readiness for purpose of peer discovery. */
  @K8sDslMarker var publishNotReadyAddresses: Boolean?
  /** Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is
assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types
ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info:
https://kubernetes.io/docs/concepts/services-networking/service/ */
  @K8sDslMarker var selector: Map<String, String>?
  /** Supports "ClientIP" and "None". Used to maintain session affinity. Enable client IP based session affinity. Must be
ClientIP or None. Defaults to None. More info:
https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies */
  @K8sDslMarker var sessionAffinity: String?
  /** sessionAffinityConfig contains the configurations of session affinity. */
  val sessionAffinityConfig: SessionAffinityConfig_v1_core?
  /** type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort,
and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address
for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual
construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published
as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which
routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the
current cloud) which routes to the clusterIP. More info:
https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface Servicestatus_v1_core: K8sManifest {
  /** LoadBalancer contains the current status of the load-balancer, if one is present. */
  val loadBalancer: LoadBalancerStatus_v1_core?
}

@K8sDslMarker
interface Csidriverspec_v1beta1_storage_k8s_io: K8sManifest {
  /** attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI
ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume
interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting.
The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach
operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach
operation will be skipped. Otherwise the attach operation will be called. */
  @K8sDslMarker var attachRequired: Boolean?
  /** If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName,
podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false.
The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as
VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the
information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This
list might grow, but the prefix will be used. "csi.storage.k8s.io/pod.name": pod.Name
"csi.storage.k8s.io/pod.namespace": pod.Namespace "csi.storage.k8s.io/pod.uid": string(pod.UID)
"csi.storage.k8s.io/ephemeral": "true" iff the volume is an ephemeral inline volume defined by a CSIVolumeSource,
otherwise "false" "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only required for drivers
which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode. Other drivers can leave pod info disabled
and/or ignore this field. As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when deployed
on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the
driver. */
  @K8sDslMarker var podInfoOnMount: Boolean?
  /** VolumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is
"Persistent", which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC
mechanism. The other mode is "Ephemeral". In this mode, volumes are defined inline inside the pod spec with
CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is
only going to get a NodePublishVolume call for such a volume. For more information about implementing this mode, see
https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and
more modes may be added in the future. */
  @K8sDslMarker var volumeLifecycleModes: List<String>?
}

@K8sDslMarker
interface Csinodespec_v1beta1_storage_k8s_io: K8sManifest {
  /** drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this
can become empty. */
  val drivers: List<CSINodeDriver_v1beta1_storage_k8s_io>?
}

@K8sDslMarker
interface Persistentvolumeclaimspec_v1_core: K8sManifest {
  /** AccessModes contains the desired access modes the volume should have. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1 */
  @K8sDslMarker var accessModes: List<String>?
  /** This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and currently VolumeSnapshot is the
only supported data source. If the provisioner can support VolumeSnapshot data source, it will create a new volume and
data will be restored to the volume at the same time. If the provisioner does not support VolumeSnapshot data source,
volume will not be created and the failure will be reported as an event. In the future, we plan to support more data
source types and the behavior of the provisioner may change. */
  val dataSource: TypedLocalObjectReference_v1_core?
  /** Resources represents the minimum resources the volume should have. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources */
  val resources: ResourceRequirements_v1_core?
  /** A label query over volumes to consider for binding. */
  val selector: LabelSelector_v1_meta?
  /** Name of the StorageClass required by the claim. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1 */
  @K8sDslMarker var storageClassName: String?
  /** volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in
claim spec. This is a beta feature. */
  @K8sDslMarker var volumeMode: String?
  /** VolumeName is the binding reference to the PersistentVolume backing this claim. */
  @K8sDslMarker var volumeName: String?
}

@K8sDslMarker
interface Persistentvolumeclaimstatus_v1_core: K8sManifest {
  /** AccessModes contains the actual access modes the volume backing the PVC has. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1 */
  @K8sDslMarker var accessModes: List<String>?
  /** Represents the actual resources of the underlying volume. */
  @K8sDslMarker var capacity: Any?
  /** Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will
be set to 'ResizeStarted'. */
  val conditions: List<PersistentVolumeClaimCondition_v1_core>?
  /** Phase represents the current phase of PersistentVolumeClaim. */
  @K8sDslMarker var phase: String?
}

@K8sDslMarker
interface Volumeattachmentspec_v1_storage_k8s_io: K8sManifest {
  /** Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by
GetPluginName(). */
  @K8sDslMarker var attacher: String?
  /** The node that the volume should be attached to. */
  @K8sDslMarker var nodeName: String?
  /** Source represents the volume that should be attached. */
  val source: VolumeAttachmentSource_v1_storage_k8s_io?
}

@K8sDslMarker
interface Volumeattachmentstatus_v1_storage_k8s_io: K8sManifest {
  /** The last error encountered during attach operation, if any. This field must only be set by the entity completing the
attach operation, i.e. the external-attacher. */
  val attachError: VolumeError_v1_storage_k8s_io?
  /** Indicates the volume is successfully attached. This field must only be set by the entity completing the attach
operation, i.e. the external-attacher. */
  @K8sDslMarker var attached: Boolean?
  /** Upon successful attach, this field is populated with any information returned by the attach operation that must be
passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach
operation, i.e. the external-attacher. */
  @K8sDslMarker var attachmentMetadata: Any?
  /** The last error encountered during detach operation, if any. This field must only be set by the entity completing the
detach operation, i.e. the external-attacher. */
  val detachError: VolumeError_v1_storage_k8s_io?
}

@K8sDslMarker
interface Customresourcedefinitionspec_v1_apiextensions_k8s_io: K8sManifest {
  /** conversion defines conversion settings for the CRD. */
  val conversion: CustomResourceConversion_v1_apiextensions_k8s_io?
  /** group is the API group of the defined custom resource. The custom resources are served under `/apis/<group>/...`. Must
match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`). */
  @K8sDslMarker var group: String?
  /** names specify the resource and kind names for the custom resource. */
  val names: CustomResourceDefinitionNames_v1_apiextensions_k8s_io?
  /** preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved
when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. This field
is deprecated in favor of setting `x-preserve-unknown-fields` to true in `spec.versions[`*`].schema.openAPIV3Schema`.
See
https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields
for details. */
  @K8sDslMarker var preserveUnknownFields: Boolean?
  /** scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are `Cluster` and
`Namespaced`. Default is `Namespaced`. */
  @K8sDslMarker var scope: String?
  /** versions is the list of all API versions of the defined custom resource. Version names are used to compute the order in
which served versions are listed in API discovery. If the version string is "kube-like", it will sort above non
"kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are
followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor
version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and
then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2,
v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10. */
  val versions: List<CustomResourceDefinitionVersion_v1_apiextensions_k8s_io>?
}

@K8sDslMarker
interface Customresourcedefinitionstatus_v1_apiextensions_k8s_io: K8sManifest {
  /** acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in
spec. */
  val acceptedNames: CustomResourceDefinitionNames_v1_apiextensions_k8s_io?
  /** conditions indicate state for particular aspects of a CustomResourceDefinition */
  val conditions: List<CustomResourceDefinitionCondition_v1_apiextensions_k8s_io>?
  /** storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a
migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to
another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list.
Versions may not be removed from `spec.versions` while they exist in this list. */
  @K8sDslMarker var storedVersions: List<String>?
}

@K8sDslMarker
interface Limitrangespec_v1_core: K8sManifest {
  /** Limits is the list of LimitRangeItem objects that are enforced. */
  val limits: List<LimitRangeItem_v1_core>?
}

@K8sDslMarker
interface Horizontalpodautoscalerspec_v1_autoscaling: K8sManifest {
  /** upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas. */
  @K8sDslMarker var maxReplicas: Int?
  /** minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down. It defaults to 1 pod.
minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External
metric is configured. Scaling is active as long as at least one metric value is available. */
  @K8sDslMarker var minReplicas: Int?
  /** reference to scaled resource; horizontal pod autoscaler will learn the current resource consumption and will set the
desired number of pods by using its Scale subresource. */
  val scaleTargetRef: CrossVersionObjectReference_v1_autoscaling?
  /** target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the
default autoscaling policy will be used. */
  @K8sDslMarker var targetCPUUtilizationPercentage: Int?
}

@K8sDslMarker
interface Horizontalpodautoscalerstatus_v1_autoscaling: K8sManifest {
  /** current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an
average pod is using now 70% of its requested CPU. */
  @K8sDslMarker var currentCPUUtilizationPercentage: Int?
  /** current number of replicas of pods managed by this autoscaler. */
  @K8sDslMarker var currentReplicas: Int?
  /** desired number of replicas of pods managed by this autoscaler. */
  @K8sDslMarker var desiredReplicas: Int?
  /** last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number
of pods is changed. */
  val lastScaleTime: Time_v1_meta?
  /** most recent generation observed by this autoscaler. */
  @K8sDslMarker var observedGeneration: Int?
}

@K8sDslMarker
interface Podtemplatespec_v1_core: K8sManifest, HasMetadata {
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_v1_meta?
  /** Specification of the desired behavior of the pod. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Podspec_v1_core?
}

@K8sDslMarker
interface Poddisruptionbudgetspec_v1beta1_policy: K8sManifest {
  /** An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e.
even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a
mutually exclusive setting with "minAvailable".

			When you specify an integer, it represents a number of Pods. When
you specify a percentage by setting the value to a string representation of a percentage (eg. "50%"), it represents a
percentage of total Pods. */
  var maxUnavailable: de.loosetie.k8s.dsl.types.IntOrPercentage?
  /** An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the
eviction, i.e. even in the absence of the evicted pod. So for example you can prevent all voluntary evictions by
specifying "100%".

			When you specify an integer, it represents a number of Pods. When you specify a percentage by
setting the value to a string representation of a percentage (eg. "50%"), it represents a percentage of total Pods. */
  var minAvailable: de.loosetie.k8s.dsl.types.IntOrPercentage?
  /** Label query over pods whose evictions are managed by the disruption budget. */
  val selector: LabelSelector_v1_meta?
}

@K8sDslMarker
interface Poddisruptionbudgetstatus_v1beta1_policy: K8sManifest {
  /** current number of healthy pods */
  @K8sDslMarker var currentHealthy: Int?
  /** minimum desired number of healthy pods */
  @K8sDslMarker var desiredHealthy: Int?
  /** DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource
handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time
when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been
marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the
API server processed the eviction request. If the deletion didn't occur and a pod is still there it will be removed from
the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be
empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions. */
  @K8sDslMarker var disruptedPods: Any?
  /** Number of pod disruptions that are currently allowed. */
  @K8sDslMarker var disruptionsAllowed: Int?
  /** total number of pods counted by this disruption budget */
  @K8sDslMarker var expectedPods: Int?
  /** Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other status informatio is
valid only if observedGeneration equals to PDB's object generation. */
  @K8sDslMarker var observedGeneration: Int?
}

@K8sDslMarker
interface Podpresetspec_v1alpha1_settings_k8s_io: K8sManifest {
  /** Env defines the collection of EnvVar to inject into containers. */
  val env: List<EnvVar_v1_core>?
  /** EnvFrom defines the collection of EnvFromSource to inject into containers. */
  val envFrom: List<EnvFromSource_v1_core>?
  /** Selector is a label query over a set of resources, in this case pods. Required. */
  val selector: LabelSelector_v1_meta?
  /** VolumeMounts defines the collection of VolumeMount to inject into containers. */
  val volumeMounts: List<VolumeMount_v1_core>?
  /** Volumes defines the collection of Volume to inject into the pod. */
  val volumes: List<Volume_v1_core>?
}

@K8sDslMarker
interface Podsecuritypolicyspec_v1beta1_policy: K8sManifest {
  /** allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to
true. */
  @K8sDslMarker var allowPrivilegeEscalation: Boolean?
  /** AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An
empty value indicates that any CSI driver can be used for inline ephemeral volumes. This is an alpha field, and is only
honored if the API server enables the CSIInlineVolume feature gate. */
  val allowedCSIDrivers: List<AllowedCSIDriver_v1beta1_policy>?
  /** allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field
may be added at the pod author's discretion. You must not list a capability in both allowedCapabilities and
requiredDropCapabilities. */
  @K8sDslMarker var allowedCapabilities: List<String>?
  /** allowedFlexVolumes is a whitelist of allowed Flexvolumes. Empty or nil indicates that all Flexvolumes may be used. This
parameter is effective only when the usage of the Flexvolumes is allowed in the "volumes" field. */
  val allowedFlexVolumes: List<AllowedFlexVolume_v1beta1_policy>?
  /** allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths may be used. */
  val allowedHostPaths: List<AllowedHostPath_v1beta1_policy>?
  /** AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that only the
DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled. */
  @K8sDslMarker var allowedProcMountTypes: List<String>?
  /** allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain
sysctl name or ends in "`*`" in which case it is considered as a prefix of allowed sysctls. Single `*` means all unsafe
sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection. Examples: e.g.
"foo/`*`" allows "foo/bar", "foo/baz", etc. e.g. "foo.`*`" allows "foo.bar", "foo.baz", etc. */
  @K8sDslMarker var allowedUnsafeSysctls: List<String>?
  /** defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec
specifically drops the capability. You may not list a capability in both defaultAddCapabilities and
requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the
allowedCapabilities list. */
  @K8sDslMarker var defaultAddCapabilities: List<String>?
  /** defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its
parent process. */
  @K8sDslMarker var defaultAllowPrivilegeEscalation: Boolean?
  /** forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name
or ends in "`*`" in which case it is considered as a prefix of forbidden sysctls. Single `*` means all sysctls are
forbidden. Examples: e.g. "foo/`*`" forbids "foo/bar", "foo/baz", etc. e.g. "foo.`*`" forbids "foo.bar", "foo.baz", etc. */
  @K8sDslMarker var forbiddenSysctls: List<String>?
  /** fsGroup is the strategy that will dictate what fs group is used by the SecurityContext. */
  val fsGroup: FSGroupStrategyOptions_v1beta1_policy?
  /** hostIPC determines if the policy allows the use of HostIPC in the pod spec. */
  @K8sDslMarker var hostIPC: Boolean?
  /** hostNetwork determines if the policy allows the use of HostNetwork in the pod spec. */
  @K8sDslMarker var hostNetwork: Boolean?
  /** hostPID determines if the policy allows the use of HostPID in the pod spec. */
  @K8sDslMarker var hostPID: Boolean?
  /** hostPorts determines which host port ranges are allowed to be exposed. */
  val hostPorts: List<HostPortRange_v1beta1_policy>?
  /** privileged determines if a pod can request to be run as privileged. */
  @K8sDslMarker var privileged: Boolean?
  /** readOnlyRootFilesystem when set to true will force containers to run with a read only root file system. If the container
specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the
container may run with a read only root file system if it wishes but it will not be forced to. */
  @K8sDslMarker var readOnlyRootFilesystem: Boolean?
  /** requiredDropCapabilities are the capabilities that will be dropped from the container. These are required to be dropped
and cannot be added. */
  @K8sDslMarker var requiredDropCapabilities: List<String>?
  /** RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set. If this field is omitted,
the pod's RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled. */
  val runAsGroup: RunAsGroupStrategyOptions_v1beta1_policy?
  /** runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set. */
  val runAsUser: RunAsUserStrategyOptions_v1beta1_policy?
  /** runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod. If this field is omitted, the
pod's runtimeClassName field is unrestricted. Enforcement of this field depends on the RuntimeClass feature gate being
enabled. */
  val runtimeClass: RuntimeClassStrategyOptions_v1beta1_policy?
  /** seLinux is the strategy that will dictate the allowable labels that may be set. */
  val seLinux: SELinuxStrategyOptions_v1beta1_policy?
  /** supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext. */
  val supplementalGroups: SupplementalGroupsStrategyOptions_v1beta1_policy?
  /** volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be used. To allow all volumes you
may use '\`*`'. */
  @K8sDslMarker var volumes: List<String>?
}

@K8sDslMarker
interface Apiservicespec_v1_apiregistration_k8s_io: K8sManifest {
  /** CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving certificate. If unspecified,
system trust roots on the apiserver are used. */
  @K8sDslMarker var caBundle: String?
  /** Group is the API group name this server hosts */
  @K8sDslMarker var group: String?
  /** GroupPriorityMininum is the priority this group should have at least. Higher priority means that the group is preferred
by clients over lower priority ones. Note that other versions of this group might specify even higher
GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on
GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical
comparison of the name of the object. (v1.bar before v1.foo) We'd recommend something like: `*`.k8s.io (except
extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s */
  @K8sDslMarker var groupPriorityMinimum: Int?
  /** InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly
discouraged. You should use the CABundle instead. */
  @K8sDslMarker var insecureSkipTLSVerify: Boolean?
  /** Service is a reference to the service for this API server. It must communicate on port 443 If the Service is nil, that
means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the
normal handler chain to be fulfilled. */
  val service: ServiceReference_v1_apiregistration_k8s_io?
  /** Version is the API version this server hosts. For example, "v1" */
  @K8sDslMarker var version: String?
  /** VersionPriority controls the ordering of this API version inside of its group. Must be greater than zero. The primary
sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it's inside of a group, the number can
be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order
inside a group. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are
ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version),
then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta
> alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor
version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1,
foo10. */
  @K8sDslMarker var versionPriority: Int?
}

@K8sDslMarker
interface Apiservicestatus_v1_apiregistration_k8s_io: K8sManifest {
  /** Current service state of apiService. */
  val conditions: List<APIServiceCondition_v1_apiregistration_k8s_io>?
}

@K8sDslMarker
interface Auditsinkspec_v1alpha1_auditregistration_k8s_io: K8sManifest {
  /** Policy defines the policy for selecting which events should be sent to the webhook required */
  val policy: Policy_v1alpha1_auditregistration_k8s_io?
  /** Webhook to send events required */
  val webhook: Webhook_v1alpha1_auditregistration_k8s_io?
}

@K8sDslMarker
interface Certificatesigningrequestspec_v1beta1_certificates_k8s_io: K8sManifest {
  /** Extra information about the requesting user. See user.Info interface for details. */
  @K8sDslMarker var extra: Any?
  /** Group information about the requesting user. See user.Info interface for details. */
  @K8sDslMarker var groups: List<String>?
  /** Base64-encoded PKCS#10 CSR data */
  @K8sDslMarker var request: String?
  /** UID information about the requesting user. See user.Info interface for details. */
  @K8sDslMarker var uid: String?
  /** allowedUsages specifies a set of usage contexts the key will be valid for. See:
https://tools.ietf.org/html/rfc5280#section-4.2.1.3 https://tools.ietf.org/html/rfc5280#section-4.2.1.12 */
  @K8sDslMarker var usages: List<String>?
  /** Information about the requesting user. See user.Info interface for details. */
  @K8sDslMarker var username: String?
}

@K8sDslMarker
interface Certificatesigningrequeststatus_v1beta1_certificates_k8s_io: K8sManifest {
  /** If request was approved, the controller will place the issued certificate here. */
  @K8sDslMarker var certificate: String?
  /** Conditions applied to the request, such as approval or denial. */
  val conditions: List<CertificateSigningRequestCondition_v1beta1_certificates_k8s_io>?
}

@K8sDslMarker
interface Leasespec_v1_coordination_k8s_io: K8sManifest {
  /** acquireTime is a time when the current lease was acquired. */
  val acquireTime: MicroTime_v1_meta?
  /** holderIdentity contains the identity of the holder of a current lease. */
  @K8sDslMarker var holderIdentity: String?
  /** leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against
time of last observed RenewTime. */
  @K8sDslMarker var leaseDurationSeconds: Int?
  /** leaseTransitions is the number of transitions of a lease between holders. */
  @K8sDslMarker var leaseTransitions: Int?
  /** renewTime is a time when the current holder of a lease has last updated the lease. */
  val renewTime: MicroTime_v1_meta?
}

@K8sDslMarker
interface Subjectaccessreviewspec_v1_authorization_k8s_io: K8sManifest {
  /** Extra corresponds to the user.Info.GetExtra() method from the authenticator. Since that is input to the authorizer it
needs a reflection here. */
  @K8sDslMarker var extra: Any?
  /** Groups is the groups you're testing for. */
  @K8sDslMarker var groups: List<String>?
  /** NonResourceAttributes describes information for a non-resource access request */
  val nonResourceAttributes: NonResourceAttributes_v1_authorization_k8s_io?
  /** ResourceAuthorizationAttributes describes information for a resource access request */
  val resourceAttributes: ResourceAttributes_v1_authorization_k8s_io?
  /** UID information about the requesting user. */
  @K8sDslMarker var uid: String?
  /** User is the user you're testing for. If you specify "User" but not "Groups", then is it interpreted as "What if User
were not a member of any groups */
  @K8sDslMarker var user: String?
}

@K8sDslMarker
interface Subjectaccessreviewstatus_v1_authorization_k8s_io: K8sManifest {
  /** Allowed is required. True if the action would be allowed, false otherwise. */
  @K8sDslMarker var allowed: Boolean?
  /** Denied is optional. True if the action would be denied, otherwise false. If both allowed is false and denied is false,
then the authorizer has no opinion on whether to authorize the action. Denied may not be true if Allowed is true. */
  @K8sDslMarker var denied: Boolean?
  /** EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get
an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a
role, but enough roles are still present and bound to reason about the request. */
  @K8sDslMarker var evaluationError: String?
  /** Reason is optional. It indicates why a request was allowed or denied. */
  @K8sDslMarker var reason: String?
}

@K8sDslMarker
interface Namespacespec_v1_core: K8sManifest {
  /** Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info:
https://kubernetes.io/docs/tasks/administer-cluster/namespaces/ */
  @K8sDslMarker var finalizers: List<String>?
}

@K8sDslMarker
interface Namespacestatus_v1_core: K8sManifest {
  /** Represents the latest available observations of a namespace's current state. */
  val conditions: List<NamespaceCondition_v1_core>?
  /** Phase is the current lifecycle phase of the namespace. More info:
https://kubernetes.io/docs/tasks/administer-cluster/namespaces/ */
  @K8sDslMarker var phase: String?
}

@K8sDslMarker
interface Nodespec_v1_core: K8sManifest {
  /** If specified, the source to get node configuration from The DynamicKubeletConfig feature gate must be enabled for the
Kubelet to use this field */
  val configSource: NodeConfigSource_v1_core?
  /** Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966 */
  @K8sDslMarker var externalID: String?
  /** PodCIDR represents the pod IP range assigned to the node. */
  @K8sDslMarker var podCIDR: String?
  /** podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the
0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6. */
  @K8sDslMarker var podCIDRs: List<String>?
  /** ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID> */
  @K8sDslMarker var providerID: String?
  /** If specified, the node's taints. */
  val taints: List<Taint_v1_core>?
  /** Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info:
https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration */
  @K8sDslMarker var unschedulable: Boolean?
}

@K8sDslMarker
interface Nodestatus_v1_core: K8sManifest {
  /** List of addresses reachable to the node. Queried from cloud provider, if available. More info:
https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key
is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a
full-replacement patch. See http://pr.k8s.io/79391 for an example. */
  val addresses: List<NodeAddress_v1_core>?
  /** Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity. */
  @K8sDslMarker var allocatable: Any?
  /** Capacity represents the total resources of a node. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity */
  @K8sDslMarker var capacity: Any?
  /** Conditions is an array of current observed node conditions. More info:
https://kubernetes.io/docs/concepts/nodes/node/#condition */
  val conditions: List<NodeCondition_v1_core>?
  /** Status of the config assigned to the node via the dynamic Kubelet config feature. */
  val config: NodeConfigStatus_v1_core?
  /** Endpoints of daemons running on the Node. */
  val daemonEndpoints: NodeDaemonEndpoints_v1_core?
  /** List of container images on this node */
  val images: List<ContainerImage_v1_core>?
  /** Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info */
  val nodeInfo: NodeSystemInfo_v1_core?
  /** NodePhase is the recently observed lifecycle phase of the node. More info:
https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated. */
  @K8sDslMarker var phase: String?
  /** List of volumes that are attached to the node. */
  val volumesAttached: List<AttachedVolume_v1_core>?
  /** List of attachable volumes in use (mounted) by the node. */
  @K8sDslMarker var volumesInUse: List<String>?
}

@K8sDslMarker
interface Persistentvolumespec_v1_core: K8sManifest {
  /** AccessModes contains all ways the volume can be mounted. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes */
  @K8sDslMarker var accessModes: List<String>?
  /** AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to
the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
  val awsElasticBlockStore: AWSElasticBlockStoreVolumeSource_v1_core?
  /** AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod. */
  val azureDisk: AzureDiskVolumeSource_v1_core?
  /** AzureFile represents an Azure File Service mount on the host and bind mount to the pod. */
  val azureFile: AzureFilePersistentVolumeSource_v1_core?
  /** A description of the persistent volume's resources and capacity. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity */
  var capacity: de.loosetie.k8s.dsl.types.Capacity?
  /** CephFS represents a Ceph FS mount on the host that shares a pod's lifetime */
  val cephfs: CephFSPersistentVolumeSource_v1_core?
  /** Cinder represents a cinder volume attached and mounted on kubelets host machine. More info:
https://examples.k8s.io/mysql-cinder-pd/README.md */
  val cinder: CinderPersistentVolumeSource_v1_core?
  /** ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil
when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding */
  val claimRef: ObjectReference_v1_core?
  /** CSI represents storage that is handled by an external CSI driver (Beta feature). */
  val csi: CSIPersistentVolumeSource_v1_core?
  /** FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod. */
  val fc: FCVolumeSource_v1_core?
  /** FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin. */
  val flexVolume: FlexPersistentVolumeSource_v1_core?
  /** Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage. This
depends on the Flocker control service being running */
  val flocker: FlockerVolumeSource_v1_core?
  /** GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the
pod. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk */
  val gcePersistentDisk: GCEPersistentDiskVolumeSource_v1_core?
  /** Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More
info: https://examples.k8s.io/volumes/glusterfs/README.md */
  val glusterfs: GlusterfsPersistentVolumeSource_v1_core?
  /** HostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node
development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster.
More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath */
  val hostPath: HostPathVolumeSource_v1_core?
  /** ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
Provisioned by an admin. */
  val iscsi: ISCSIPersistentVolumeSource_v1_core?
  /** Local represents directly-attached storage with node affinity */
  val local: LocalVolumeSource_v1_core?
  /** A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options */
  @K8sDslMarker var mountOptions: List<String>?
  /** NFS represents an NFS mount on the host. Provisioned by an admin. More info:
https://kubernetes.io/docs/concepts/storage/volumes#nfs */
  val nfs: NFSVolumeSource_v1_core?
  /** NodeAffinity defines constraints that limit what nodes this volume can be accessed from. This field influences the
scheduling of pods that use this volume. */
  val nodeAffinity: VolumeNodeAffinity_v1_core?
  /** What happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created
PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle
must be supported by the volume plugin underlying this PersistentVolume. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming */
  @K8sDslMarker var persistentVolumeReclaimPolicy: String?
  /** PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine */
  val photonPersistentDisk: PhotonPersistentDiskVolumeSource_v1_core?
  /** PortworxVolume represents a portworx volume attached and mounted on kubelets host machine */
  val portworxVolume: PortworxVolumeSource_v1_core?
  /** Quobyte represents a Quobyte mount on the host that shares a pod's lifetime */
  val quobyte: QuobyteVolumeSource_v1_core?
  /** RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info:
https://examples.k8s.io/volumes/rbd/README.md */
  val rbd: RBDPersistentVolumeSource_v1_core?
  /** ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes. */
  val scaleIO: ScaleIOPersistentVolumeSource_v1_core?
  /** Name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any
StorageClass. */
  @K8sDslMarker var storageClassName: String?
  /** StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More
info: https://examples.k8s.io/volumes/storageos/README.md */
  val storageos: StorageOSPersistentVolumeSource_v1_core?
  /** volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value
of Filesystem is implied when not included in spec. This is a beta feature. */
  @K8sDslMarker var volumeMode: String?
  /** VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine */
  val vsphereVolume: VsphereVirtualDiskVolumeSource_v1_core?
}

@K8sDslMarker
interface Persistentvolumestatus_v1_core: K8sManifest {
  /** A human-readable message indicating details about why the volume is in this state. */
  @K8sDslMarker var message: String?
  /** Phase indicates if a volume is available, bound to a claim, or released by a claim. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase */
  @K8sDslMarker var phase: String?
  /** Reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the
CLI. */
  @K8sDslMarker var reason: String?
}

@K8sDslMarker
interface Resourcequotaspec_v1_core: K8sManifest {
  /** hard is the set of desired hard limits for each named resource. More info:
https://kubernetes.io/docs/concepts/policy/resource-quotas/ */
  @K8sDslMarker var hard: Map<String, de.loosetie.k8s.dsl.types.DoubleOrString>?
  /** scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed
using ScopeSelectorOperator in combination with possible values. For a resource to match, both scopes AND scopeSelector
(if specified in spec), must be matched. */
  val scopeSelector: ScopeSelector_v1_core?
  /** A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects. */
  @K8sDslMarker var scopes: List<String>?
}

@K8sDslMarker
interface Resourcequotastatus_v1_core: K8sManifest {
  /** Hard is the set of enforced hard limits for each named resource. More info:
https://kubernetes.io/docs/concepts/policy/resource-quotas/ */
  @K8sDslMarker var hard: Any?
  /** Used is the current observed total usage of the resource in the namespace. */
  @K8sDslMarker var used: Any?
}

@K8sDslMarker
interface Selfsubjectaccessreviewspec_v1_authorization_k8s_io: K8sManifest {
  /** NonResourceAttributes describes information for a non-resource access request */
  val nonResourceAttributes: NonResourceAttributes_v1_authorization_k8s_io?
  /** ResourceAuthorizationAttributes describes information for a resource access request */
  val resourceAttributes: ResourceAttributes_v1_authorization_k8s_io?
}

@K8sDslMarker
interface Selfsubjectrulesreviewspec_v1_authorization_k8s_io: K8sManifest {
  /** Namespace to evaluate rules for. Required. */
  @K8sDslMarker var namespace: String?
}

@K8sDslMarker
interface Tokenrequestspec_v1_authentication_k8s_io: K8sManifest {
  /** Audiences are the intendend audiences of the token. A recipient of a token must identitfy themself with an identifier in
the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be
used to authenticate against any of the audiences listed but implies a high degree of trust between the target
audiences. */
  @K8sDslMarker var audiences: List<String>?
  /** BoundObjectRef is a reference to an object that the token will be bound to. The token will only be valid for as long as
the bound object exists. NOTE: The API server's TokenReview endpoint will validate the BoundObjectRef, but other
audiences may not. Keep ExpirationSeconds small if you want prompt revocation. */
  val boundObjectRef: BoundObjectReference_v1_authentication_k8s_io?
  /** ExpirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a
different validity duration so a client needs to check the 'expiration' field in a response. */
  @K8sDslMarker var expirationSeconds: Int?
}

@K8sDslMarker
interface Tokenrequeststatus_v1_authentication_k8s_io: K8sManifest {
  /** ExpirationTimestamp is the time of expiration of the returned token. */
  val expirationTimestamp: Time_v1_meta?
  /** Token is the opaque bearer token. */
  @K8sDslMarker var token: String?
}

@K8sDslMarker
interface Tokenreviewspec_v1_authentication_k8s_io: K8sManifest {
  /** Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware
token authenticators will verify that the token was intended for at least one of the audiences in this list. If no
audiences are provided, the audience will default to the audience of the Kubernetes apiserver. */
  @K8sDslMarker var audiences: List<String>?
  /** Token is the opaque bearer token. */
  @K8sDslMarker var token: String?
}

@K8sDslMarker
interface Tokenreviewstatus_v1_authentication_k8s_io: K8sManifest {
  /** Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token.
An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token's audiences. A client
of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is
returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns
an empty status.audience field where status.authenticated is "true", the token is valid against the audience of the
Kubernetes API server. */
  @K8sDslMarker var audiences: List<String>?
  /** Authenticated indicates that the token was associated with a known user. */
  @K8sDslMarker var authenticated: Boolean?
  /** Error indicates that the token couldn't be checked */
  @K8sDslMarker var error: String?
  /** User is the UserInfo associated with the provided token. */
  val user: UserInfo_v1_authentication_k8s_io?
}

@K8sDslMarker
interface Networkpolicyspec_v1_networking_k8s_io: K8sManifest {
  /** List of egress rules to be applied to the selected pods. Outgoing traffic is allowed if there are no NetworkPolicies
selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule
across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this
NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by
default). This field is beta-level in 1.8 */
  val egress: List<NetworkPolicyEgressRule_v1_networking_k8s_io>?
  /** List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if there are no NetworkPolicies
selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic source is the pod's local node,
OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches
the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the
pods it selects are isolated by default) */
  val ingress: List<NetworkPolicyIngressRule_v1_networking_k8s_io>?
  /** Selects the pods to which this NetworkPolicy object applies. The array of ingress rules is applied to any pods selected
by this field. Multiple network policies can select the same set of pods. In this case, the ingress rules for each are
combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector
matches all pods in this namespace. */
  val podSelector: LabelSelector_v1_meta?
  /** List of rule types that the NetworkPolicy relates to. Valid options are "Ingress", "Egress", or "Ingress,Egress". If
this field is not specified, it will default based on the existence of Ingress or Egress rules; policies that contain an
Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress section) are
assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [
"Egress" ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a
policyTypes value that include "Egress" (since such a policy would not include an Egress section and would otherwise
default to just [ "Ingress" ]). This field is beta-level in 1.8 */
  @K8sDslMarker var policyTypes: List<String>?
}

@K8sDslMarker
interface Rollingupdatedaemonset_v1_apps: K8sManifest {
  /** The maximum number of DaemonSet pods that can be unavailable during the update. Value can be an absolute number (ex: 5)
or a percentage of total number of DaemonSet pods at the start of the update (ex: 10%). Absolute number is calculated
from percentage by rounding up. This cannot be 0. Default value is 1. Example: when this is set to 30%, at most 30% of
the total number of nodes that should be running the daemon pod (i.e. status.desiredNumberScheduled) can have their pods
stopped for an update at any given time. The update starts by stopping at most 30% of those DaemonSet pods and then
brings up new DaemonSet pods in their place. Once the new pods are available, it then proceeds onto other DaemonSet
pods, thus ensuring that at least 70% of original number of DaemonSet pods are available at all times during the update. */
  var maxUnavailable: de.loosetie.k8s.dsl.types.IntOrPercentage?
}

@Deprecated(message="Old api version")
@K8sDslMarker
interface ServiceReference_v1_apiregistration_k8s_io: K8sManifest {
  /** Namespace is the namespace of the service */
  @K8sDslMarker var namespace: String?
  /** Name is the name of the service */
  @K8sDslMarker var name: String?
  /** If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be
a valid port number (1-65535, inclusive). */
  @K8sDslMarker var port: Int?
}

@K8sDslMarker
interface Deploymentstrategy_v1_apps: K8sManifest {
  /** Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate. */
  val rollingUpdate: Rollingupdatedeployment_v1_apps?
  /** Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate. */
  @K8sDslMarker var type: String?
}

@K8sDslMarker
interface Containerstatus_v1_core: K8sManifest {
  /** This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated. */
  @K8sDslMarker var name: String?
  /** Container's ID in the format 'docker://<container_id>'. */
  @K8sDslMarker var containerID: String?
  /** The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images */
  @K8sDslMarker var image: String?
  /** ImageID of the container's image. */
  @K8sDslMarker var imageID: String?
  /** Details about the container's last termination condition. */
  val lastState: ContainerState_v1_core?
  /** Specifies whether the container has passed its readiness probe. */
  @K8sDslMarker var ready: Boolean?
  /** The number of times the container has been restarted, currently based on the number of dead containers that have not yet
been removed. Note that this is calculated from dead containers. But those containers are subject to garbage collection.
This value will get capped at 5 by GC. */
  @K8sDslMarker var restartCount: Int?
  /** Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is
considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always
true when no startupProbe is defined. */
  @K8sDslMarker var started: Boolean?
  /** Details about the container's current condition. */
  val state: ContainerState_v1_core?
}

@K8sDslMarker
interface Rollingupdatedeployment_v1_apps: K8sManifest {
  /** The maximum number of pods that can be scheduled above the desired number of pods. Value can be an absolute number (ex:
5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated
from percentage by rounding up. Defaults to 25%. Example: when this is set to 30%, the new ReplicaSet can be scaled up
immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired
pods. Once old pods have been killed, new ReplicaSet can be scaled up further, ensuring that total number of pods
running at any time during the update is at most 130% of desired pods. */
  var maxSurge: de.loosetie.k8s.dsl.types.IntOrPercentage?
  /** The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a
percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0
if MaxSurge is 0. Defaults to 25%. Example: when this is set to 30%, the old ReplicaSet can be scaled down to 70% of
desired pods immediately when the rolling update starts. Once new pods are ready, old ReplicaSet can be scaled down
further, followed by scaling up the new ReplicaSet, ensuring that the total number of pods available at all times during
the update is at least 70% of desired pods. */
  var maxUnavailable: de.loosetie.k8s.dsl.types.IntOrPercentage?
}