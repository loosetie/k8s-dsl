package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Ingressclassspec_networking_k8s_io_v1_k8s1_19: K8sManifest {
  /** Controller refers to the name of the controller that should handle this class. This allows for different "flavors" that
are controlled by the same controller. For example, you may have different Parameters for the same implementing
controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g.
"acme.io/ingress-controller". This field is immutable. */
  @K8sDslMarker var controller: String?
  /** Parameters is a link to a custom resource containing additional configuration for the controller. This is optional if
the controller does not require extra parameters. */
  val parameters: TypedLocalObjectReference_core_v1_k8s1_19?
}