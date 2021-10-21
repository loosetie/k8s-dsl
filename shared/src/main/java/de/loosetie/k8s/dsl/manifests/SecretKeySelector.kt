package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface SecretKeySelector_core_v1_k8s1_16: K8sManifest {
  /** Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** The key of the secret to select from. Must be a valid secret key. */
  @K8sDslMarker var key: String?
  /** Specify whether the Secret or its key must be defined */
  @K8sDslMarker var optional: Boolean?
}      
typealias SecretKeySelector_core_v1_k8s1_17 = SecretKeySelector_core_v1_k8s1_16       
typealias SecretKeySelector_core_v1_k8s1_18 = SecretKeySelector_core_v1_k8s1_17       
typealias SecretKeySelector_core_v1_k8s1_19 = SecretKeySelector_core_v1_k8s1_18       
typealias SecretKeySelector_core_v1_k8s1_20 = SecretKeySelector_core_v1_k8s1_19       
typealias SecretKeySelector_core_v1_k8s1_21 = SecretKeySelector_core_v1_k8s1_20 