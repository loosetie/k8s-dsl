package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Limitrangespec_core_v1: K8sManifest {
  /** Limits is the list of LimitRangeItem objects that are enforced. */
  val limits: List<LimitRangeItem_core_v1>?
}