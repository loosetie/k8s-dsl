package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NodeSystemInfo_core_v1_k8s1_20: K8sManifest {
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
Hat hosts https://access.redhat.com/documentation/en-us/red_hat_subscription_management/1/html/rhsm/uuid */
  @K8sDslMarker var systemUUID: String?
}