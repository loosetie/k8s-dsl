package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ParamKind_admissionregistration_k8s_io_v1beta1: K8sTopLevel {
  /** APIVersion is the API group version the resources belong to. In format of "group/version". Required. */
  override val apiVersion: String
    get() = "admissionregistration.k8s.io/v1beta1"
  /** Kind is the API kind the resources belong to. Required. */
  override val kind: String
    get() = "ParamKind"
}