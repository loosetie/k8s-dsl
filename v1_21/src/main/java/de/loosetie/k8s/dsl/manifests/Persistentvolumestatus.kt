package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Persistentvolumestatus_core_v1_k8s1_21: K8sManifest {
  /** A human-readable message indicating details about why the volume is in this state. */
  @K8sDslMarker var message: String?
  /** Phase indicates if a volume is available, bound to a claim, or released by a claim. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase */
  @K8sDslMarker var phase: String?
  /** Reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the
CLI. */
  @K8sDslMarker var reason: String?
}