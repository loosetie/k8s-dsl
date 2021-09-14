package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ObjectReference_core_v1_k8s1_18: K8sTopLevel {
  /** API version of the referent. */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind of the referent. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ObjectReference"
  /** Namespace of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/ */
  @K8sDslMarker var namespace: String?
  /** Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** If referring to a piece of an object instead of an entire object, this string should contain a valid JSON/Go field
access statement, such as desiredState.manifest.containers[2]. For example, if the object reference is to a container
within a pod, this would take on a value like: "spec.containers{name}" (where "name" refers to the name of the container
that triggered the event) or if no container name is specified "spec.containers[2]" (container with index 2 in this
pod). This syntax is chosen only to have some well-defined way of referencing a part of an object. */
  @K8sDslMarker var fieldPath: String?
  /** Specific resourceVersion to which this reference is made, if any. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency */
  @K8sDslMarker var resourceVersion: String?
  /** UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids */
  @K8sDslMarker var uid: String?
}