package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface SecurityContext_core_v1: K8sManifest {
  /** AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly
controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the
container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows. */
  @K8sDslMarker var allowPrivilegeEscalation: Boolean?
  /** The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the
container runtime. Note that this field cannot be set when spec.os.name is windows. */
  val capabilities: Capabilities_core_v1?
  /** Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host.
Defaults to false. Note that this field cannot be set when spec.os.name is windows. */
  @K8sDslMarker var privileged: Boolean?
  /** procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the
container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be
enabled. Note that this field cannot be set when spec.os.name is windows. */
  @K8sDslMarker var procMount: String?
  /** Whether this container has a read-only root filesystem. Default is false. Note that this field cannot be set when
spec.os.name is windows. */
  @K8sDslMarker var readOnlyRootFilesystem: Boolean?
  /** The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in
PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes
precedence. Note that this field cannot be set when spec.os.name is windows. */
  @K8sDslMarker var runAsGroup: Int?
  /** Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to
ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such
validation will be performed. May also be set in PodSecurityContext. If set in both SecurityContext and
PodSecurityContext, the value specified in SecurityContext takes precedence. */
  @K8sDslMarker var runAsNonRoot: Boolean?
  /** The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May
also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in
SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows. */
  @K8sDslMarker var runAsUser: Int?
  /** The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux
context for each container. May also be set in PodSecurityContext. If set in both SecurityContext and
PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when
spec.os.name is windows. */
  val seLinuxOptions: SELinuxOptions_core_v1?
  /** The seccomp options to use by this container. If seccomp options are provided at both the pod & container level, the
container options override the pod options. Note that this field cannot be set when spec.os.name is windows. */
  val seccompProfile: SeccompProfile_core_v1?
  /** The Windows specific settings applied to all containers. If unspecified, the options from the PodSecurityContext will be
used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
Note that this field cannot be set when spec.os.name is linux. */
  val windowsOptions: WindowsSecurityContextOptions_core_v1?
}