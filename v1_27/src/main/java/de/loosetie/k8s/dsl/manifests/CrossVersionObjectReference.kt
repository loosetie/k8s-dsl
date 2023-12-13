package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface CrossVersionObjectReference_autoscaling_v2: K8sTopLevel {
  /** apiVersion is the API version of the referent */
  override val apiVersion: String
    get() = "autoscaling/v2"
  /** kind is the kind of the referent; More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "CrossVersionObjectReference"
  /** name is the name of the referent; More info:
https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
}