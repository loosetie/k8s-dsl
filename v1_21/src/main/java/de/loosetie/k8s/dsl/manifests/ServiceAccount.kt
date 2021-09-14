package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ServiceAccount_core_v1_k8s1_21: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "core/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "ServiceAccount"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1_k8s1_21
  /** AutomountServiceAccountToken indicates whether pods running as this service account should have an API token
automatically mounted. Can be overridden at the pod level. */
  @K8sDslMarker var automountServiceAccountToken: Boolean?
  /** ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that
reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but
ImagePullSecrets are only accessed by the kubelet. More info:
https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod */
  val imagePullSecrets: List<LocalObjectReference_core_v1_k8s1_21>?
  /** Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info:
https://kubernetes.io/docs/concepts/configuration/secret */
  val secrets: List<ObjectReference_core_v1_k8s1_21>?
}