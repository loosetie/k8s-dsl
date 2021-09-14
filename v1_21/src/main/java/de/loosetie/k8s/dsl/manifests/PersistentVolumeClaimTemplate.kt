package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PersistentVolumeClaimTemplate_core_v1_k8s1_21: K8sManifest, HasMetadata {
  /** May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and
will be rejected during validation. */
  val metadata: ObjectMeta_meta_v1_k8s1_21?
  /** The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created
from this template. The same fields as in a PersistentVolumeClaim are also valid here. */
  val spec: Persistentvolumeclaimspec_core_v1_k8s1_21?
}