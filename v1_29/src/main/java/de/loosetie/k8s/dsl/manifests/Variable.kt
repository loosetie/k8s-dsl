package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Variable_admissionregistration_k8s_io_v1beta1: K8sManifest {
  /** Name is the name of the variable. The name must be a valid CEL identifier and unique among all variables. The variable
can be accessed in other expressions through `variables` For example, if name is "foo", the variable will be available
as `variables.foo` */
  @K8sDslMarker var name: String?
  /** Expression is the expression that will be evaluated as the value of the variable. The CEL expression has access to the
same identifiers as the CEL expressions in Validation. */
  @K8sDslMarker var expression: String?
}