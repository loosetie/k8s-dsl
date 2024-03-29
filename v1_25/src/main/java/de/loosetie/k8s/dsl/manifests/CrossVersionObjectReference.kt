package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface CrossVersionObjectReference_autoscaling_v1: K8sTopLevel {
  /** API version of the referent */
  override val apiVersion: String
    get() = "autoscaling/v1"
  /** Kind of the referent; More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds" */
  override val kind: String
    get() = "CrossVersionObjectReference"
  /** Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names */
  @K8sDslMarker var name: String?
}

@K8sDslMarker
interface CrossVersionObjectReference_autoscaling_v2: K8sTopLevel {
  /** API version of the referent */
  override val apiVersion: String
    get() = "autoscaling/v2"
  /** Kind of the referent; More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds" */
  override val kind: String
    get() = "CrossVersionObjectReference"
  /** Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names */
  @K8sDslMarker var name: String?
}