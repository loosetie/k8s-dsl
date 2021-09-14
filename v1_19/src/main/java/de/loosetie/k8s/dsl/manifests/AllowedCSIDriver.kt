package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface AllowedCSIDriver_policy_v1beta1_k8s1_19: K8sManifest {
  /** Name is the registered name of the CSI driver */
  @K8sDslMarker var name: String?
}