package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ResourceRequirements_core_v1: K8sManifest {
  /** Claims lists the names of resources, defined in spec.resourceClaims, that are used by this container. This is an alpha
field and requires enabling the DynamicResourceAllocation feature gate. This field is immutable. It can only be set for
containers. */
  val claims: List<ResourceClaim_core_v1>?
  /** Limits describes the maximum amount of compute resources allowed. More info:
https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/ */
  var limits: de.loosetie.k8s.dsl.types.LimitsAndRequests?
  /** Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults
to Limits if that is explicitly specified, otherwise to an implementation-defined value. Requests cannot exceed Limits.
More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/ */
  var requests: de.loosetie.k8s.dsl.types.LimitsAndRequests?
}