package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface StatefulSetOrdinals_apps_v1: K8sManifest {
  /** start is the number representing the first replica's index. It may be used to number replicas from an alternate index
(eg: 1-indexed) over the default 0-indexed names, or to orchestrate progressive movement of replicas from one
StatefulSet to another. If set, replica indices will be in the range: [.spec.ordinals.start, .spec.ordinals.start +
.spec.replicas). If unset, defaults to 0. Replica indices will be in the range: [0, .spec.replicas). */
  @K8sDslMarker var start: Int?
}