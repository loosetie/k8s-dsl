package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ParamRef_admissionregistration_k8s_io_v1alpha1: K8sManifest {
  /** Namespace of the referenced resource. Should be empty for the cluster-scoped resources */
  @K8sDslMarker var namespace: String?
  /** Name of the resource being referenced. */
  @K8sDslMarker var name: String?
}