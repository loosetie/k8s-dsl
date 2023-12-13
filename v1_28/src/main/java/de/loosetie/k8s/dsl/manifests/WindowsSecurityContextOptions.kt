package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface WindowsSecurityContextOptions_core_v1: K8sManifest {
  /** GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the
contents of the GMSA credential spec named by the GMSACredentialSpecName field. */
  @K8sDslMarker var gmsaCredentialSpec: String?
  /** GMSACredentialSpecName is the name of the GMSA credential spec to use. */
  @K8sDslMarker var gmsaCredentialSpecName: String?
  /** HostProcess determines if a container should be run as a 'Host Process' container. All of a Pod's containers must have
the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess
containers). In addition, if HostProcess is true then HostNetwork must also be set to true. */
  @K8sDslMarker var hostProcess: Boolean?
  /** The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata
if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value
specified in SecurityContext takes precedence. */
  @K8sDslMarker var runAsUserName: String?
}