package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Servicecidrstatus_networking_k8s_io_v1alpha1: K8sManifest {
  /** conditions holds an array of metav1.Condition that describe the state of the ServiceCIDR. Current service state */
  val conditions: List<Condition_meta_v1>?
}