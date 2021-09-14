package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ConfigMapNodeConfigSource_core_v1_k8s1_19: K8sManifest {
  /** Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases. */
  @K8sDslMarker var namespace: String?
  /** Name is the metadata.name of the referenced ConfigMap. This field is required in all cases. */
  @K8sDslMarker var name: String?
  /** KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This
field is required in all cases. */
  @K8sDslMarker var kubeletConfigKey: String?
  /** ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and
required in Node.Status. */
  @K8sDslMarker var resourceVersion: String?
  /** UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status. */
  @K8sDslMarker var uid: String?
}