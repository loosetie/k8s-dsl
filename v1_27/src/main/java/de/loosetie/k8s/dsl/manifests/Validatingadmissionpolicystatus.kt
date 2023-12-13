package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Validatingadmissionpolicystatus_admissionregistration_k8s_io_v1alpha1: K8sManifest {
  /** The conditions represent the latest available observations of a policy's current state. */
  val conditions: List<Condition_meta_v1>?
  /** The generation observed by the controller. */
  @K8sDslMarker var observedGeneration: Int?
  /** The results of type checking for each expression. Presence of this field indicates the completion of the type checking. */
  val typeChecking: TypeChecking_admissionregistration_k8s_io_v1alpha1?
}