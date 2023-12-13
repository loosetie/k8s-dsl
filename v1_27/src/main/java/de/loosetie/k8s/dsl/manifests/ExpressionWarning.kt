package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ExpressionWarning_admissionregistration_k8s_io_v1alpha1: K8sManifest {
  /** The path to the field that refers the expression. For example, the reference to the expression of the first item of
validations is "spec.validations[0].expression" */
  @K8sDslMarker var fieldRef: String?
  /** The content of type checking information in a human-readable form. Each line of the warning contains the type that the
expression is checked against, followed by the type check error from the compiler. */
  @K8sDslMarker var warning: String?
}