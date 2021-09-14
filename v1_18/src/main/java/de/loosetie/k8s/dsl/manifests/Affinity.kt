package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Affinity_core_v1_k8s1_18: K8sManifest {
  /** Describes node affinity scheduling rules for the pod. */
  val nodeAffinity: NodeAffinity_core_v1_k8s1_18?
  /** Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)). */
  val podAffinity: PodAffinity_core_v1_k8s1_18?
  /** Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other
pod(s)). */
  val podAntiAffinity: PodAntiAffinity_core_v1_k8s1_18?
}