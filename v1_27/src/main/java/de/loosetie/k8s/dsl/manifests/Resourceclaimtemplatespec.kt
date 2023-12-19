package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Resourceclaimtemplatespec_resource_k8s_io_v1alpha2: K8sManifest, HasMetadata {
  /** ObjectMeta may contain labels and annotations that will be copied into the PVC when creating it. No other fields are
allowed and will be rejected during validation. */
  val metadata: ObjectMeta_meta_v1?
  /** Spec for the ResourceClaim. The entire content is copied unchanged into the ResourceClaim that gets created from this
template. The same fields as in a ResourceClaim are also valid here. */
  val spec: Resourceclaimspec_resource_k8s_io_v1alpha2?
}