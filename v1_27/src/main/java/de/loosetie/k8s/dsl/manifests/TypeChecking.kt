package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface TypeChecking_admissionregistration_k8s_io_v1alpha1: K8sManifest {
  /** The type checking warnings for each expression. */
  val expressionWarnings: List<ExpressionWarning_admissionregistration_k8s_io_v1alpha1>?
}