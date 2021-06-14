package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface RuntimeClassStrategyOptions_policy_v1beta1: K8sManifest {
  /** allowedRuntimeClassNames is a whitelist of RuntimeClass names that may be specified on a pod. A value of "`*`" means
that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the
RuntimeClassName field to be unset. */
  @K8sDslMarker var allowedRuntimeClassNames: List<String>?
  /** defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the
allowedRuntimeClassNames list. A value of nil does not mutate the Pod. */
  @K8sDslMarker var defaultRuntimeClassName: String?
}