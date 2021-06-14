package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface IPBlock_networking_k8s_io_v1: K8sManifest {
  /** CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24" */
  @K8sDslMarker var cidr: String?
  /** Except is a slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.1/24" Except
values will be rejected if they are outside the CIDR range */
  @K8sDslMarker var except: List<String>?
}